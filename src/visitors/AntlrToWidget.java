package visitors;


import antlr.DartParser;
import antlr.DartParserBaseVisitor;
import interfaces.IAntlrObjectFactory;
import org.antlr.v4.runtime.Token;
import properties.Property;
import statements.CustomWidgetDeclarationStatement;
import utils.Symbol;
import utils.SymbolTable;
import utils.UTIL;
import widgets.Border;
import widgets.Button;
import widgets.TextField;
import widgets.AppBar;
import widgets.Scaffold;
import widgets.Widget;
import widgets.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AntlrToWidget extends DartParserBaseVisitor<Widget> {
    private final IAntlrObjectFactory factory;
    private List<String> semanticError;

    public AntlrToWidget(IAntlrObjectFactory factory,List<String> semanticError) {
        this.factory = factory;
        this.semanticError=semanticError;
    }

    @Override
    public Widget visitScaffold(DartParser.ScaffoldContext ctx) {
        AntlrToProperty antlrToPropertyVisitor = factory.createAntlrToProperty(semanticError);

        // get the line number of this node
        int lineNumber = ctx.SCAFFOLD().getSymbol().getLine();

        // define the list of attributes of Scaffold
        List<Property> properties = new ArrayList<>();

        // get scaffold property context list object
        List<DartParser.ScaffoldPropertyContext> scaffoldPropertyContextList = ctx.scaffoldProperty();

        Set<String> set = new HashSet<>();

        for (DartParser.ScaffoldPropertyContext scaffoldPropertyContext : scaffoldPropertyContextList) {
            Property property = antlrToPropertyVisitor.visit(scaffoldPropertyContext);
            properties.add(property);

            if (set.contains(property.getClass().toString())) semanticError.add(UTIL.semanticAlreadyDeclaredProperty(
                    scaffoldPropertyContext.getStart().getLine(),
                    scaffoldPropertyContext.getStart().getCharPositionInLine() + 1,
                    property.getName()
            ));
            else set.add(property.getClass().toString());

        }
        return new Scaffold(properties, String.valueOf(lineNumber));
    }

    @Override
    public Widget visitAppBar(DartParser.AppBarContext ctx) {
        AntlrToProperty antlrToPropertyVisitor = factory.createAntlrToProperty(semanticError);

        // get the line number of this node
        int lineNumber = ctx.APPBAR().getSymbol().getLine();

        // define the list of attributes of AppBar
        List<Property> properties = new ArrayList<>();

        // list of all appBarProperties context objects
        List<DartParser.AppBarPropertiesContext> appBarPropertiesContextList = ctx.appBarProperties();

        Set<String> set = new HashSet<>();
        for (DartParser.AppBarPropertiesContext appBarPropertiesContext : appBarPropertiesContextList) {
            Property property = antlrToPropertyVisitor.visit(appBarPropertiesContext);
            // parse properties
            properties.add(property);

            if (set.contains(property.getClass().toString())) semanticError.add(UTIL.semanticAlreadyDeclaredProperty(
                    appBarPropertiesContext.getStart().getLine(),
                    appBarPropertiesContext.getStart().getCharPositionInLine() + 1,
                    property.getName()
            ));
            else set.add(property.getClass().toString());
        }
        // return a new AppBar Widget Object
        return new AppBar(properties, String.valueOf(lineNumber));
    }

    @Override
    public Widget visitCustomWidget(DartParser.CustomWidgetContext ctx) {
        AntlrToProperty antlrToPropertyVisitor = factory.createAntlrToProperty(semanticError);

        // get the line number of this node
        int lineNumber = ctx.WIDGETNAME().getSymbol().getLine();

        String widgetIdentifier = ctx.WIDGETNAME().getSymbol().getText();
        List<Property> widgetProperties = new ArrayList<>();

        // get context object
        List<DartParser.CustomWidgetPropertiesContext> propertiesContextList = ctx.customWidgetProperties();

        Set<String> set = new HashSet<>();

        for (DartParser.CustomWidgetPropertiesContext propertiesContext : propertiesContextList) {
            Property property = antlrToPropertyVisitor.visit(propertiesContext);
            widgetProperties.add(property);

            if (set.contains(propertiesContext.IDENTIFIER().toString())) semanticError.add(UTIL.semanticAlreadyDeclaredProperty(
                    propertiesContext.getStart().getLine(),
                    propertiesContext.getStart().getCharPositionInLine() + 1,
                    property.getName()
            ));
            else set.add(propertiesContext.IDENTIFIER().toString());

        }


        // get access to symbol table visitor
        SymbolTableVisitorAst symbolTableVisitorAst = factory.createSymbolTableVisitor();

        SymbolTable instance = SymbolTable.getInstance();

        Symbol widgetSignature = instance.get(widgetIdentifier);
        CustomWidgetDeclarationStatement widgetDeclaration =
                (CustomWidgetDeclarationStatement) widgetSignature.getValue();

        DartParser.WidgetContext widgetContext = widgetDeclaration.getChild();
        Widget child = visit(widgetContext);
        CustomWidget customWidget =
                new CustomWidget(widgetIdentifier,child, widgetProperties, String.valueOf(lineNumber));

        // TODO: Handle semantic errors, if error.isEmpty() -> there is no error, else the error is inside the string
        // register the widget in the symbol table
        String error = customWidget.accept(symbolTableVisitorAst);
        //   if (!error.isEmpty()) semanticError.add(error);

        return customWidget;
    }

    @Override
    public Widget visitWidget(DartParser.WidgetContext ctx) {
        return visit(ctx.getChild(0));
    }

    @Override
    public Widget visitRow(DartParser.RowContext ctx) {
        AntlrToProperty antlrToProperty = factory.createAntlrToProperty(semanticError);

        String lineNumber = String.valueOf(ctx.ROW().getSymbol().getLine());
        List<Property> properties = new ArrayList<>();

        Set<String> set = new HashSet<>();

        for (DartParser.RowPropertiesContext rp : ctx.rowProperties()) {
            Property property = antlrToProperty.visit(rp);
            properties.add(property);

            if (set.contains(property.getClass().toString())) semanticError.add(UTIL.semanticAlreadyDeclaredProperty(
                    rp.getStart().getLine(),
                    rp.getStart().getCharPositionInLine() + 1,
                    property.getName()
            ));
            else set.add(property.getClass().toString());
        }
        return new Row(properties, lineNumber);
    }

    @Override
    public Widget visitCenter(DartParser.CenterContext ctx) {
        AntlrToProperty antlrToProperty = factory.createAntlrToProperty(semanticError);

        String lineNumber = String.valueOf(ctx.CENTER().getSymbol().getLine());

        List<Property> properties = new ArrayList<>();

        Set<String> set = new HashSet<>();

        for (DartParser.CenterPropertiesContext cp : ctx.centerProperties()) {
            Property property= antlrToProperty.visit(cp);
            properties.add(property);

            if (set.contains(property.getClass().toString())) semanticError.add(UTIL.semanticAlreadyDeclaredProperty(
                    cp.getStart().getLine(),
                    cp.getStart().getCharPositionInLine() + 1,
                    property.getName()
            ));
            else set.add(property.getClass().toString());
        }

        return new Center(properties, lineNumber);
    }

    @Override
    public Widget visitColumn(DartParser.ColumnContext ctx) {
        AntlrToProperty antlrToProperty = factory.createAntlrToProperty(semanticError);
        String lineNumber = String.valueOf(ctx.COLUMN().getSymbol().getLine());
        List<Property> properties = new ArrayList<>();

        Set<String> set = new HashSet<>();

        for (DartParser.ColumnPropertiesContext cp : ctx.columnProperties()) {
            Property property = antlrToProperty.visit(cp);
            properties.add(property);

            if (set.contains(property.getClass().toString())) semanticError.add(UTIL.semanticAlreadyDeclaredProperty(
                    cp.getStart().getLine(),
                    cp.getStart().getCharPositionInLine() + 1,
                    property.getName()
            ));
            else set.add(property.getClass().toString());
        }
        return new Column(properties, lineNumber);
    }

    @Override
    public Widget visitText(DartParser.TextContext ctx) {
        AntlrToProperty antlrToProperty = factory.createAntlrToProperty(semanticError);
        String lineNumber = String.valueOf(ctx.TEXT().getSymbol().getLine());
        List<Property> properties = new ArrayList<>();

        Set<String> set = new HashSet<>();

        for (DartParser.TextPropertiesContext tp : ctx.textProperties()) {
            Property property = antlrToProperty.visit(tp);
            properties.add(property);

            if (set.contains(property.getClass().toString())) semanticError.add(UTIL.semanticAlreadyDeclaredProperty(
                    tp.getStart().getLine(),
                    tp.getStart().getCharPositionInLine() + 1,
                    property.getName()
            ));
            else set.add(property.getClass().toString());
        }
        return new Text(properties, lineNumber);
    }


    @Override
    public Widget visitContainer(DartParser.ContainerContext ctx) {
        String line = Integer.toString(ctx.CONTAINER().getSymbol().getLine());
        List<Property> properties = new ArrayList<>();

        Set<String> set = new HashSet<>();

        for (DartParser.ContainerPropertiesContext cp : ctx.containerProperties()) {
            Property property = factory.createAntlrToProperty(semanticError).visit(cp);
            properties.add(property);

            if (set.contains(property.getClass().toString())) semanticError.add(UTIL.semanticAlreadyDeclaredProperty(
                    cp.getStart().getLine(),
                    cp.getStart().getCharPositionInLine() + 1,
                    property.getName()
            ));
            else set.add(property.getClass().toString());
        }
        return new Container(properties, line);
    }


    @Override
    public Widget visitBoxDecoration(DartParser.BoxDecorationContext ctx) {
        String line = Integer.toString(ctx.BOXDECORATION().getSymbol().getLine());
        List<Property> properties = new ArrayList<>();

        Set<String> set = new HashSet<>();

        for (DartParser.BoxDecorationPropertiesContext bdpc : ctx.boxDecorationProperties()) {
            Property property =factory.createAntlrToProperty(semanticError).visit(bdpc);
            properties.add(property);

            if (set.contains(property.getClass().toString())) semanticError.add(UTIL.semanticAlreadyDeclaredProperty(
                    bdpc.getStart().getLine(),
                    bdpc.getStart().getCharPositionInLine() + 1,
                    property.getName()
            ));
            else set.add(property.getClass().toString());
        }
        return new BoxDecorationWidget(properties, line);
    }


    @Override
    public Widget visitBorderRadius(DartParser.BorderRadiusContext ctx) {
        return visit(ctx.getChild(0));
    }

    @Override
    public Widget visitBorderRadiusCircular(DartParser.BorderRadiusCircularContext ctx) {
        String line = Integer.toString(ctx.BORDERRADIUSCIRCULAR().getSymbol().getLine());
        List<Property> properties = new ArrayList<>();
        properties.add(factory.createAntlrToProperty(semanticError).visit(ctx.borderRadiusCircularRadiusProperty()));
        return new BorderRadiusCircular(properties,line);
    }

    @Override
    public Widget visitBorderRadiusOnly(DartParser.BorderRadiusOnlyContext ctx) {
        String line = Integer.toString(ctx.BORDERRADIUSONLY().getSymbol().getLine());
        List<Property> properties = new ArrayList<>();
        Set<String> set = new HashSet<>();

        for (DartParser.BorderRadiusOnlyPropertiesContext bdopc : ctx.borderRadiusOnlyProperties()) {
            Property property = factory.createAntlrToProperty(semanticError).visit(bdopc);
            properties.add(property);
            if(set.contains(property.getClass().toString())){
                int column =bdopc.getStart().getCharPositionInLine();
                semanticError.add(UTIL.semanticAlreadyDeclaredProperty(Integer.parseInt(property.getLnNumber()),
                        column,property.getName()));
            }
            else
                set.add(property.getClass().toString());
        }

        return new BorderRadiusOnly(properties,line);
    }

    @Override
    public Widget visitExpanded(DartParser.ExpandedContext ctx) {
        String line = Integer.toString(ctx.EXPANDED().getSymbol().getLine());
        List<Property> properties = new ArrayList<>();
        Set<String> set = new HashSet<>();

        for (DartParser.ExpandedPropertiesContext epc : ctx.expandedProperties()) {
            Property property =factory.createAntlrToProperty(semanticError).visit(epc);
            properties.add(factory.createAntlrToProperty(semanticError).visit(epc));
            if(set.contains(property.getClass().toString())){
                int column =epc.getStart().getCharPositionInLine();
                semanticError.add(UTIL.semanticAlreadyDeclaredProperty(Integer.parseInt(property.getLnNumber()),
                        column,property.getName()));
            }
            else
                set.add(property.getClass().toString());
        }
        return new Expanded(properties, line);
    }

    //done
    @Override
    public Widget visitGestureDetector(DartParser.GestureDetectorContext ctx) {
        Token idToken = ctx.GESTUREDETECTOR().getSymbol();
        int line = idToken.getLine();
        AntlrToProperty antlrToProperty = factory.createAntlrToProperty(semanticError);
        List<Property> properties=new ArrayList<>();
        Set<String> set = new HashSet<>();

        for(DartParser.GestureDetectorPropertiesContext gpc : ctx.gestureDetectorProperties()){
            Property property = antlrToProperty.visit(gpc);
            properties.add(property);
            if(set.contains(property.getClass().toString())){
                int column =gpc.getStart().getCharPositionInLine();
                semanticError.add(UTIL.semanticAlreadyDeclaredProperty(Integer.parseInt(property.getLnNumber()),
                        column,property.getName()));
            }
            else
                set.add(property.getClass().toString());
        }
        return new GestureDetector(properties,Integer.toString(line));
    }

    //done
    @Override
    public Widget visitPadding(DartParser.PaddingContext ctx) {
        Token idToken = ctx.PADDING().getSymbol();
        int line = idToken.getLine();
        AntlrToProperty antlrToProperty = factory.createAntlrToProperty(semanticError);
        List<Property> properties=new ArrayList<>();
        Set<String> set = new HashSet<>();

        for(DartParser.PaddingProprteyContext ppc : ctx.paddingProprtey()){
            Property property =antlrToProperty.visit(ppc);
            properties.add(property);
            if(set.contains(property.getClass().toString())){
                int column =ppc.getStart().getCharPositionInLine()+1;
                semanticError.add(UTIL.semanticAlreadyDeclaredProperty(Integer.parseInt(property.getLnNumber()),
                        column,property.getName()));
            }
            else
                set.add(property.getClass().toString());
        }
        return new Padding(properties,Integer.toString(line));
    }

    //done
    @Override
    public Widget visitEdgeInsetsOnly(DartParser.EdgeInsetsOnlyContext ctx) {
        Token idToken = ctx.EDGE_INSETS_ONLY().getSymbol();
        int line = idToken.getLine();
        AntlrToProperty antlrToProperty = factory.createAntlrToProperty(semanticError);
        List<Property> properties=new ArrayList<>();
        Set<String> set = new HashSet<>();

        for(DartParser.EdgeInsetsOnlyPropertiesContext eiopc : ctx.edgeInsetsOnlyProperties()){
            Property property =antlrToProperty.visit(eiopc);
            properties.add(property);
            if(set.contains(property.getClass().toString())){
                int column =eiopc.getStart().getCharPositionInLine()+1;
                semanticError.add(UTIL.semanticAlreadyDeclaredProperty(Integer.parseInt(property.getLnNumber()),
                        column,property.getName()));
            }
            else
                set.add(property.getClass().toString());
        }
        return new EdgeInsetsOnly(properties,Integer.toString(line));
    }

    //done
    @Override
    public Widget visitEdgeInsetsSymetric(DartParser.EdgeInsetsSymetricContext ctx) {
        Token idToken = ctx.EDGE_INSETS_SYMMETRIC().getSymbol();
        int line = idToken.getLine();
        AntlrToProperty antlrToProperty = factory.createAntlrToProperty(semanticError);
        List<Property> properties=new ArrayList<>();
        Set<String> set = new HashSet<>();

        for(DartParser.EdgeInsetsSymetricPropertiesContext espc : ctx.edgeInsetsSymetricProperties()){
            Property property =antlrToProperty.visit(espc);
            properties.add(property);
            if(set.contains(property.getClass().toString())){
                int column =espc.getStart().getCharPositionInLine()+1;
                semanticError.add(UTIL.semanticAlreadyDeclaredProperty(Integer.parseInt(property.getLnNumber()),
                        column,property.getName()));
            }
            else
                set.add(property.getClass().toString());
        }
        return new EdgeInsetsSymmetric(properties,Integer.toString(line));
    }

    //done
    @Override
    public Widget visitImage(DartParser.ImageContext ctx) {
        Token idToken = ctx.IMAGE().getSymbol();
        int line = idToken.getLine();
        AntlrToProperty antlrToProperty = factory.createAntlrToProperty(semanticError);
        List<Property> properties=new ArrayList<>();
        Set<String> set = new HashSet<>();

        for(DartParser.ImagePropertiesContext ipc : ctx.imageProperties()){
            Property property = antlrToProperty.visit(ipc);
            properties.add(property);
            if(set.contains(property.getClass().toString())){
                int column =ipc.getStart().getCharPositionInLine()+1;
                semanticError.add(UTIL.semanticAlreadyDeclaredProperty(Integer.parseInt(property.getLnNumber()),
                        column,property.getName()));
            }
            else
                set.add(property.getClass().toString());
        }
        return new Image(properties,Integer.toString(line));
    }


    @Override
    public Widget visitButton(DartParser.ButtonContext ctx) {
        int lineNumber = ctx.BUTTON().getSymbol().getLine();

        AntlrToProperty antlrToPropertyVisitor = factory.createAntlrToProperty(semanticError);

        List<Property> properties = new ArrayList<>();

        List<DartParser.ButtonPropertiesContext> buttonPropertiesContextList = ctx.buttonProperties();
        Set<String> set = new HashSet<>();

        for (DartParser.ButtonPropertiesContext bpc : buttonPropertiesContextList) {
            Property property =antlrToPropertyVisitor.visit(bpc);
            properties.add(property);
            if(set.contains(property.getClass().toString())){
                int column =bpc.getStart().getCharPositionInLine()+1;
                semanticError.add(UTIL.semanticAlreadyDeclaredProperty(Integer.parseInt(property.getLnNumber()),
                        column,property.getName()));
            }
            else
                set.add(property.getClass().toString());
        }
        return new Button(properties , String.valueOf(lineNumber));
    }

    @Override
    public Widget visitTextField(DartParser.TextFieldContext ctx) {
        int lineNumber = ctx.TEXTFIELD().getSymbol().getLine();

        AntlrToProperty antlrToPropertyVisitor = factory.createAntlrToProperty(semanticError);

        List<Property> properties = new ArrayList<>();

        List<DartParser.TextFieldPropertiesContext> textFieldPropertiesContexts = ctx.textFieldProperties();
        Set<String> set = new HashSet<>();

        for (DartParser.TextFieldPropertiesContext textFieldPropertiesContext : textFieldPropertiesContexts) {
            Property property=antlrToPropertyVisitor.visit(textFieldPropertiesContext);
            properties.add(property);
            if(set.contains(property.getClass().toString())){
                int column =textFieldPropertiesContext.getStart().getCharPositionInLine()+1;
                semanticError.add(UTIL.semanticAlreadyDeclaredProperty(Integer.parseInt(property.getLnNumber()),
                        column,property.getName()));
            }
            else
                set.add(property.getClass().toString());
        }
        return new TextField(properties,String.valueOf(lineNumber));
    }

    @Override
    public Widget visitBorder(DartParser.BorderContext ctx) {
        int lineNumber = ctx.BORDER().getSymbol().getLine();

        AntlrToProperty antlrToPropertyVisitor = factory.createAntlrToProperty(semanticError);

        List<Property> properties = new ArrayList<>();

        List<DartParser.BorderPropertiesContext> borderPropertiesContexts = ctx.borderProperties();
        Set<String> set = new HashSet<>();

        for (DartParser.BorderPropertiesContext borderPropertiesContext : borderPropertiesContexts) {
            Property property=antlrToPropertyVisitor.visit(borderPropertiesContext);
            properties.add(property);
            if(set.contains(property.getClass().toString())){
                int column =borderPropertiesContext.getStart().getCharPositionInLine()+1;
                semanticError.add(UTIL.semanticAlreadyDeclaredProperty(Integer.parseInt(property.getLnNumber()),
                        column,property.getName()));
            }
            else
                set.add(property.getClass().toString());
        }

        return new Border(properties,String.valueOf(lineNumber));
    }

    @Override
    public Widget visitIf(DartParser.IfContext ctx) {
        int lineNumber = ctx.IF().getSymbol().getLine();

        AntlrToProperty antlrToPropertyVisitor = factory.createAntlrToProperty(semanticError);

        List<Property> properties = new ArrayList<>();

        List<DartParser.IfPropertiesContext> ifPropertiesContexts = ctx.ifProperties();
        Set<String> set = new HashSet<>();

        for(DartParser.IfPropertiesContext ifPropertiesContext : ifPropertiesContexts) {
            Property property = antlrToPropertyVisitor.visit(ifPropertiesContext);
            properties.add(property);

            if(set.contains(property.getClass().toString())){
                int column = ifPropertiesContext.getStart().getCharPositionInLine() + 1;
                semanticError.add(UTIL.semanticAlreadyDeclaredProperty(Integer.parseInt(property.getLnNumber()),
                        column, property.getName()));
            }
            else
                set.add(property.getClass().toString());
        }

        return new IF(properties, String.valueOf(lineNumber));
    }

    @Override
    public Widget visitFor(DartParser.ForContext ctx) {
        int lineNumber = ctx.FOR().getSymbol().getLine();

        AntlrToProperty antlrToPropertyVisitor = factory.createAntlrToProperty(semanticError);

        List<Property> properties = new ArrayList<>();

        List<DartParser.ForPropertiesContext> forPropertiesContexts = ctx.forProperties();
        Set<String> set = new HashSet<>();

        for(DartParser.ForPropertiesContext forPropertiesContext : forPropertiesContexts) {
            Property property = antlrToPropertyVisitor.visit(forPropertiesContext);
            properties.add(property);

            if(set.contains(property.getClass().toString())){
                int column = forPropertiesContext.getStart().getCharPositionInLine() + 1;
                semanticError.add(UTIL.semanticAlreadyDeclaredProperty(Integer.parseInt(property.getLnNumber()),
                        column, property.getName()));
            }
            else
                set.add(property.getClass().toString());
        }

        return new FOR(properties, String.valueOf(lineNumber));
    }

    @Override
    public Widget visitVideoPlayer(DartParser.VideoPlayerContext ctx) {
        int lineNumber = ctx.VIDEOPLAYER().getSymbol().getLine();

        AntlrToProperty antlrToPropertyVisitor = factory.createAntlrToProperty(semanticError);

        List<Property> properties = new ArrayList<>();

        List<DartParser.VideoPlayerPropertiesContext> videoPlayerPropertiesContexts = ctx.videoPlayerProperties();
        Set<String> set = new HashSet<>();

        for(DartParser.VideoPlayerPropertiesContext videoPlayerPropertiesContext : videoPlayerPropertiesContexts) {
            Property property = antlrToPropertyVisitor.visit(videoPlayerPropertiesContext);
            properties.add(property);

            if(set.contains(property.getClass().toString())){
                int column = videoPlayerPropertiesContext.getStart().getCharPositionInLine() + 1;
                semanticError.add(UTIL.semanticAlreadyDeclaredProperty(Integer.parseInt(property.getLnNumber()),
                        column, property.getName()));
            }
            else
                set.add(property.getClass().toString());
        }

        return new VideoPlayer(properties, String.valueOf(lineNumber));
    }

    @Override
    public Widget visitForm(DartParser.FormContext ctx) {
        int lineNumber = ctx.FORM().getSymbol().getLine();

        AntlrToProperty antlrToPropertyVisitor = factory.createAntlrToProperty(semanticError);

        List<Property> properties = new ArrayList<>();

        List<DartParser.FormPropertiesContext> formPropertiesContexts = ctx.formProperties();
        Set<String> set = new HashSet<>();

        for(DartParser.FormPropertiesContext formPropertiesContext : formPropertiesContexts) {
            Property property = antlrToPropertyVisitor.visit(formPropertiesContext);
            properties.add(property);

            if(set.contains(property.getClass().toString())){
                int column = formPropertiesContext.getStart().getCharPositionInLine() + 1;
                semanticError.add(UTIL.semanticAlreadyDeclaredProperty(Integer.parseInt(property.getLnNumber()),
                        column, property.getName()));
            }
            else
                set.add(property.getClass().toString());
        }


        return new Form(properties, String.valueOf(lineNumber));
    }
}
