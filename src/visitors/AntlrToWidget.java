package visitors;

import antlr.DartParser;
import antlr.DartParserBaseVisitor;
import interfaces.IAntlrObjectFactory;
import properties.Property;
import widgets.*;

import java.util.ArrayList;
import java.util.List;

public class AntlrToWidget extends DartParserBaseVisitor<Widget> {
    private final IAntlrObjectFactory factory;

    public AntlrToWidget(IAntlrObjectFactory factory) {
        this.factory = factory;
    }

    @Override
    public Widget visitScaffold(DartParser.ScaffoldContext ctx) {
        AntlrToProperty antlrToPropertyVisitor = factory.createAntlrToProperty();

        // get the line number of this node
        int lineNumber = ctx.SCAFFOLD().getSymbol().getLine();

        // define the list of attributes of Scaffold
        List<Property> properties = new ArrayList<>();

        // get scaffold property context list object
        List<DartParser.ScaffoldPropertyContext> scaffoldPropertyContextList = ctx.scaffoldProperty();

        for (DartParser.ScaffoldPropertyContext scaffoldPropertyContext : scaffoldPropertyContextList) {
            properties.add(antlrToPropertyVisitor.visit(scaffoldPropertyContext));
        }
        return new Scaffold(properties, String.valueOf(lineNumber));
    }

    @Override
    public Widget visitAppBar(DartParser.AppBarContext ctx) {
        AntlrToProperty antlrToPropertyVisitor = factory.createAntlrToProperty();

        // get the line number of this node
        int lineNumber = ctx.APPBAR().getSymbol().getLine();

        // define the list of attributes of AppBar
        List<Property> properties = new ArrayList<>();

        // list of all appBarProperties context objects
        List<DartParser.AppBarPropertiesContext> appBarPropertiesContextList = ctx.appBarProperties();
        for (DartParser.AppBarPropertiesContext appBarPropertiesContext : appBarPropertiesContextList) {
            // parse properties
            properties.add(antlrToPropertyVisitor.visit(appBarPropertiesContext));
        }
        // return a new AppBar Widget Object
        return new AppBar(properties, String.valueOf(lineNumber));
    }

    @Override
    public Widget visitCustomWidget(DartParser.CustomWidgetContext ctx) {
        AntlrToProperty antlrToPropertyVisitor = factory.createAntlrToProperty();

        // get the line number of this node
        int lineNumber = ctx.WIDGETNAME().getSymbol().getLine();

        String widgetIdentifier = ctx.WIDGETNAME().getSymbol().getText();
        List<Property> widgetProperties = new ArrayList<>();

        // get context object
        List<DartParser.CustomWidgetPropertiesContext> propertiesContextList = ctx.customWidgetProperties();

        for (DartParser.CustomWidgetPropertiesContext propertiesContext : propertiesContextList) {
            widgetProperties.add(antlrToPropertyVisitor.visit(propertiesContext));
        }
        return new Widget(widgetIdentifier, widgetProperties, String.valueOf(lineNumber));
    }

    @Override
    public Widget visitWidget(DartParser.WidgetContext ctx) {
        return visit(ctx.getChild(0));
    }

    @Override
    public Widget visitRow(DartParser.RowContext ctx) {
        AntlrToProperty antlrToProperty = factory.createAntlrToProperty();
        List<Property> properties = new ArrayList<>();
        for (DartParser.RowPropertiesContext rp : ctx.rowProperties()) {
            properties.add(antlrToProperty.visit(rp));
        }
        return new Row(properties);
    }

    @Override
    public Widget visitCenter(DartParser.CenterContext ctx) {
        AntlrToProperty antlrToProperty = factory.createAntlrToProperty();
        List<Property> properties = new ArrayList<>();

        for (DartParser.CenterPropertiesContext cp : ctx.centerProperties()) {
            properties.add(antlrToProperty.visit(cp));
        }

        return new Center(properties);
    }

    @Override
    public Widget visitColumn(DartParser.ColumnContext ctx) {
        AntlrToProperty antlrToProperty = factory.createAntlrToProperty();
        List<Property> properties = new ArrayList<>();
        for (DartParser.ColumnPropertiesContext cp : ctx.columnProperties()) {
            properties.add(antlrToProperty.visit(cp));
        }
        return new Column(properties);
    }

    @Override
    public Widget visitText(DartParser.TextContext ctx) {
        AntlrToProperty antlrToProperty = factory.createAntlrToProperty();
        List<Property> properties = new ArrayList<>();
        for (DartParser.TextPropertiesContext tp : ctx.textProperties()) {
            properties.add(antlrToProperty.visit(tp));
        }
        return new Text(properties);
    }


    @Override
    public Widget visitContainer(DartParser.ContainerContext ctx) {
        List<Property> properties = new ArrayList<>();
        for (DartParser.ContainerPropertiesContext cp : ctx.containerProperties()) {
            properties.add(factory.createAntlrToProperty().visit(cp));
        }
        return new Container(properties);
    }


    @Override
    public Widget visitBoxDecoration(DartParser.BoxDecorationContext ctx) {
        List<Property> properties = new ArrayList<>();
        for (DartParser.BoxDecorationPropertiesContext bdpc : ctx.boxDecorationProperties()) {
            properties.add(factory.createAntlrToProperty().visit(bdpc));
        }
        return new BoxDecorationWidget(properties);
    }


    @Override
    public Widget visitBorderRadius(DartParser.BorderRadiusContext ctx) {
        return visit(ctx.getChild(0));
    }

    @Override
    public Widget visitBorderRadiusCircular(DartParser.BorderRadiusCircularContext ctx) {
        List<Property> properties = new ArrayList<>();
        properties.add(factory.createAntlrToProperty().visit(ctx.borderRadiusCircularProperties()));
        return new BorderRadiusCircular(properties);
    }

    @Override
    public Widget visitBorderRadiusOnly(DartParser.BorderRadiusOnlyContext ctx) {
        List<Property> properties = new ArrayList<>();
        for (DartParser.BorderRadiusOnlyPropertiesContext bdopc : ctx.borderRadiusOnlyProperties()) {
            properties.add(factory.createAntlrToProperty().visit(bdopc));
        }
        return new BorderRadiusOnly(properties);
    }

    @Override
    public Widget visitExpanded(DartParser.ExpandedContext ctx) {
        List<Property> properties = new ArrayList<>();
        for (DartParser.ExpandedPropertiesContext epc : ctx.expandedProperties()) {
            properties.add(factory.createAntlrToProperty().visit(epc));
        }
        return new Expanded(properties);
    }

    @Override
    public Widget visitGestureDetector(DartParser.GestureDetectorContext ctx) {
        AntlrToProperty antlrToProperty = factory.createAntlrToProperty();
        List<Property> properties = new ArrayList<>();
        for (DartParser.GestureDetectorPropertiesContext gpc : ctx.gestureDetectorProperties()) {
            properties.add(antlrToProperty.visit(gpc));
        }

        return new GestureDetector(properties);
    }


    //done
    @Override
    public Widget visitPadding(DartParser.PaddingContext ctx) {
        AntlrToProperty antlrToProperty = factory.createAntlrToProperty();
        List<Property> properties = new ArrayList<>();
        for (DartParser.PaddingProprteyContext ppc : ctx.paddingProprtey()) {
            properties.add(antlrToProperty.visit(ppc));
        }
        return new Padding(properties);
    }

    //done
    @Override
    public Widget visitEdgeInsetsOnly(DartParser.EdgeInsetsOnlyContext ctx) {
        AntlrToProperty antlrToProperty = factory.createAntlrToProperty();
        List<Property> properties = new ArrayList<>();
        for (DartParser.EdgeInsetsOnlyPropertiesContext eiopc : ctx.edgeInsetsOnlyProperties()) {
            properties.add(antlrToProperty.visit(eiopc));
        }
        return new EdgeInsetsOnly(properties);
    }

    //done
    @Override
    public Widget visitEdgeInsetsSymetric(DartParser.EdgeInsetsSymetricContext ctx) {
        AntlrToProperty antlrToProperty = factory.createAntlrToProperty();
        List<Property> properties = new ArrayList<>();
        for (DartParser.EdgeInsetsSymetricPropertiesContext espc : ctx.edgeInsetsSymetricProperties()) {
            properties.add(antlrToProperty.visit(espc));
        }
        return new EdgeInsetsSymmetric(properties);
    }

    //done
    @Override
    public Widget visitImage(DartParser.ImageContext ctx) {
        AntlrToProperty antlrToProperty = factory.createAntlrToProperty();
        List<Property> properties = new ArrayList<>();
        for (DartParser.ImagePropertiesContext ipc : ctx.imageProperties()) {
            properties.add(antlrToProperty.visit(ipc));
        }
        return new Image(properties);
    }


    @Override
    public Widget visitButton(DartParser.ButtonContext ctx) {
        AntlrToProperty antlrToPropertyVisitor = factory.createAntlrToProperty();

        List<Property> properties = new ArrayList<>();

        List<DartParser.ButtonPropertiesContext> buttonPropertiesContextList = ctx.buttonProperties();

        for (DartParser.ButtonPropertiesContext bpc : buttonPropertiesContextList) {
            properties.add(antlrToPropertyVisitor.visit(bpc));
        }
        return new Button(properties);
    }

    @Override
    public Widget visitTextField(DartParser.TextFieldContext ctx) {
        AntlrToProperty antlrToPropertyVisitor = factory.createAntlrToProperty();

        List<Property> properties = new ArrayList<>();

        List<DartParser.TextFieldPropertiesContext> textFieldPropertiesContexts = ctx.textFieldProperties();
        for (DartParser.TextFieldPropertiesContext textFieldPropertiesContext : textFieldPropertiesContexts) {
            properties.add(antlrToPropertyVisitor.visit(textFieldPropertiesContext));
        }
        return new TextField(properties);
    }

    @Override
    public Widget visitBorder(DartParser.BorderContext ctx) {
        AntlrToProperty antlrToPropertyVisitor = factory.createAntlrToProperty();

        List<Property> properties = new ArrayList<>();

        List<DartParser.BorderPropertiesContext> borderPropertiesContexts = ctx.borderProperties();

        for (DartParser.BorderPropertiesContext borderPropertiesContext : borderPropertiesContexts) {
            properties.add(antlrToPropertyVisitor.visit(borderPropertiesContext));
        }

        return new Border(properties);
    }

}
