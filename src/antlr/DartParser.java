// Generated from java-escape by ANTLR 4.11.1
package antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class DartParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LP=1, RP=2, COLON=3, OA=4, CA=5, OB=6, CB=7, SC=8, COMMA=9, EQL=10, SCAFFOLD=11, 
		ROW=12, CENTER=13, COLUMN=14, TEXT=15, APPBAR=16, CONTAINER=17, EXPANDED=18, 
		BOXDECORATION=19, PADDING=20, EDGE_INSETS_ONLY=21, EDGE_INSETS_SYMMETRIC=22, 
		IMAGE=23, BUTTON=24, GESTUREDETECTOR=25, TEXTFIELD=26, BORDER=27, BORDERRADIUSONLY=28, 
		BORDERRADIUSCIRCULAR=29, CHILDREN=30, BODY=31, CHILD=32, WIDGET=33, INT=34, 
		STRINGTYPE=35, DOUBLE=36, RETURN=37, FUNCTION=38, TEXTATRIB=39, APPBARATRIB=40, 
		FONTWEIGHT=41, FONTSIZE=42, LETTERSPACING=43, BOLD=44, WIDTH=45, HEIGHT=46, 
		CONTENTALIGNMENT=47, CENTERVALUE=48, FLEX=49, MAINAXISSIZE=50, MAX=51, 
		MIN=52, CROSSAXISALIGNMENT=53, STRETCH=54, DECORATION=55, COLOR=56, BORDERRADIUS=57, 
		CIRCULAR=58, PADDINGATTR=59, TOPRIGHT=60, TOPLEFT=61, BOTTOMRIGHT=62, 
		BOTTOMLEFT=63, HORIZONTAL=64, VERTICAL=65, FIT=66, URL=67, TITLE=68, BACKGROUND_COLOR=69, 
		TITLE_COLOR=70, CONTAINS=71, COVER=72, BOOLEAN=73, CENTERTITLE=74, TEXTALIGN=75, 
		ONPRESSED=76, START_ATTR=77, END_ATTR=78, JUSTIFY_ATTR=79, ONLY=80, LIGHT=81, 
		SEMIBOLD=82, MEDIUM=83, VALUE=84, LABEL=85, TEXTCOLOR=86, HINT=87, BORDERATRI=88, 
		THICKNESS=89, RADIUS=90, ONCHANGED=91, TOP=92, LEFT=93, BOTTOM=94, RIGHT=95, 
		WIDGETNAME=96, IDENTIFIER=97, FLOAT=98, NUM=99, STRING=100, HEX_NUM=101, 
		WS=102;
	public static final int
		RULE_prog = 0, RULE_scaffold = 1, RULE_scaffoldProperty = 2, RULE_appBar = 3, 
		RULE_appBarProperties = 4, RULE_widget = 5, RULE_customWidget = 6, RULE_customWidgetProperties = 7, 
		RULE_row = 8, RULE_rowProperties = 9, RULE_center = 10, RULE_centerProperties = 11, 
		RULE_column = 12, RULE_columnProperties = 13, RULE_text = 14, RULE_textProperties = 15, 
		RULE_container = 16, RULE_containerProperties = 17, RULE_boxDecoration = 18, 
		RULE_boxDecorationProperties = 19, RULE_borderRadius = 20, RULE_borderRadiusCircular = 21, 
		RULE_borderRadiusOnly = 22, RULE_borderRadiusCircularProperties = 23, 
		RULE_borderRadiusOnlyProperties = 24, RULE_expanded = 25, RULE_expandedProperties = 26, 
		RULE_gestureDetector = 27, RULE_gestureDetectorProperties = 28, RULE_onFunction = 29, 
		RULE_padding = 30, RULE_paddingProprtey = 31, RULE_edgeInsets = 32, RULE_edgeInsetsOnlyProperties = 33, 
		RULE_edgeInsetsSymetricProperties = 34, RULE_image = 35, RULE_imageProperties = 36, 
		RULE_button = 37, RULE_buttonProperties = 38, RULE_textField = 39, RULE_textFieldProperties = 40, 
		RULE_border = 41, RULE_borderProperties = 42, RULE_customWidgetDeclaration = 43, 
		RULE_variables = 44, RULE_tree = 45, RULE_statment = 46, RULE_variableDeclaration = 47, 
		RULE_variableAssignment = 48, RULE_widthProperty = 49, RULE_heightProperty = 50, 
		RULE_colorProperty = 51, RULE_childProperty = 52, RULE_childrenProperty = 53, 
		RULE_mainAxisSizeProperty = 54, RULE_crossAxisAlignmentProperty = 55;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "scaffold", "scaffoldProperty", "appBar", "appBarProperties", 
			"widget", "customWidget", "customWidgetProperties", "row", "rowProperties", 
			"center", "centerProperties", "column", "columnProperties", "text", "textProperties", 
			"container", "containerProperties", "boxDecoration", "boxDecorationProperties", 
			"borderRadius", "borderRadiusCircular", "borderRadiusOnly", "borderRadiusCircularProperties", 
			"borderRadiusOnlyProperties", "expanded", "expandedProperties", "gestureDetector", 
			"gestureDetectorProperties", "onFunction", "padding", "paddingProprtey", 
			"edgeInsets", "edgeInsetsOnlyProperties", "edgeInsetsSymetricProperties", 
			"image", "imageProperties", "button", "buttonProperties", "textField", 
			"textFieldProperties", "border", "borderProperties", "customWidgetDeclaration", 
			"variables", "tree", "statment", "variableDeclaration", "variableAssignment", 
			"widthProperty", "heightProperty", "colorProperty", "childProperty", 
			"childrenProperty", "mainAxisSizeProperty", "crossAxisAlignmentProperty"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "':'", "'['", "']'", "'{'", "'}'", "';'", "','", 
			"'='", "'Scaffold'", "'Row'", "'Center'", "'Column'", "'Text'", "'AppBar'", 
			"'Container'", "'Expanded'", "'BoxDecoration'", "'Padding'", "'EdgeInsetsOnly'", 
			"'EdgeInsetsSymmetric'", "'Image'", "'Button'", "'GestureDetector'", 
			"'TextField'", "'Border'", "'BorderRadiusOnly'", "'BorderRadiusCircular'", 
			"'children'", "'body'", "'child'", "'Widget'", "'int'", "'string'", "'double'", 
			"'return'", "'function'", "'text'", "'appBar'", "'fontWeight'", "'fontSize'", 
			"'letterSpacing'", "'bold'", "'width'", "'height'", "'contentAlignment'", 
			"'center'", "'flex'", "'mainAxisSize'", "'max'", "'min'", "'crossAxisAlignment'", 
			"'stretch'", "'decoration'", "'color'", "'borderRadius'", "'circular'", 
			"'padding'", "'topRight'", "'topLeft'", "'bottomRight'", "'bottomLeft'", 
			"'horizontal'", "'vertical'", "'fit'", "'url'", "'title'", "'backgroundColor'", 
			"'titleColor'", "'contains'", "'cover'", null, "'centerTitle'", "'textAlign'", 
			"'onPressed'", "'start'", "'end'", "'justify'", "'only'", "'light'", 
			"'semibold'", "'medium'", "'value'", "'label'", "'textColor'", "'hint'", 
			"'border'", "'thickness'", "'radius'", "'onChanged'", "'top'", "'left'", 
			"'bottom'", "'right'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LP", "RP", "COLON", "OA", "CA", "OB", "CB", "SC", "COMMA", "EQL", 
			"SCAFFOLD", "ROW", "CENTER", "COLUMN", "TEXT", "APPBAR", "CONTAINER", 
			"EXPANDED", "BOXDECORATION", "PADDING", "EDGE_INSETS_ONLY", "EDGE_INSETS_SYMMETRIC", 
			"IMAGE", "BUTTON", "GESTUREDETECTOR", "TEXTFIELD", "BORDER", "BORDERRADIUSONLY", 
			"BORDERRADIUSCIRCULAR", "CHILDREN", "BODY", "CHILD", "WIDGET", "INT", 
			"STRINGTYPE", "DOUBLE", "RETURN", "FUNCTION", "TEXTATRIB", "APPBARATRIB", 
			"FONTWEIGHT", "FONTSIZE", "LETTERSPACING", "BOLD", "WIDTH", "HEIGHT", 
			"CONTENTALIGNMENT", "CENTERVALUE", "FLEX", "MAINAXISSIZE", "MAX", "MIN", 
			"CROSSAXISALIGNMENT", "STRETCH", "DECORATION", "COLOR", "BORDERRADIUS", 
			"CIRCULAR", "PADDINGATTR", "TOPRIGHT", "TOPLEFT", "BOTTOMRIGHT", "BOTTOMLEFT", 
			"HORIZONTAL", "VERTICAL", "FIT", "URL", "TITLE", "BACKGROUND_COLOR", 
			"TITLE_COLOR", "CONTAINS", "COVER", "BOOLEAN", "CENTERTITLE", "TEXTALIGN", 
			"ONPRESSED", "START_ATTR", "END_ATTR", "JUSTIFY_ATTR", "ONLY", "LIGHT", 
			"SEMIBOLD", "MEDIUM", "VALUE", "LABEL", "TEXTCOLOR", "HINT", "BORDERATRI", 
			"THICKNESS", "RADIUS", "ONCHANGED", "TOP", "LEFT", "BOTTOM", "RIGHT", 
			"WIDGETNAME", "IDENTIFIER", "FLOAT", "NUM", "STRING", "HEX_NUM", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DartParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public ScaffoldContext scaffold() {
			return getRuleContext(ScaffoldContext.class,0);
		}
		public TerminalNode EOF() { return getToken(DartParser.EOF, 0); }
		public List<CustomWidgetDeclarationContext> customWidgetDeclaration() {
			return getRuleContexts(CustomWidgetDeclarationContext.class);
		}
		public CustomWidgetDeclarationContext customWidgetDeclaration(int i) {
			return getRuleContext(CustomWidgetDeclarationContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WIDGET) {
				{
				{
				setState(112);
				customWidgetDeclaration();
				}
				}
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(118);
			scaffold();
			setState(119);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ScaffoldContext extends ParserRuleContext {
		public TerminalNode SCAFFOLD() { return getToken(DartParser.SCAFFOLD, 0); }
		public TerminalNode LP() { return getToken(DartParser.LP, 0); }
		public TerminalNode RP() { return getToken(DartParser.RP, 0); }
		public List<ScaffoldPropertyContext> scaffoldProperty() {
			return getRuleContexts(ScaffoldPropertyContext.class);
		}
		public ScaffoldPropertyContext scaffoldProperty(int i) {
			return getRuleContext(ScaffoldPropertyContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DartParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DartParser.COMMA, i);
		}
		public ScaffoldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scaffold; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitScaffold(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScaffoldContext scaffold() throws RecognitionException {
		ScaffoldContext _localctx = new ScaffoldContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_scaffold);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(SCAFFOLD);
			setState(122);
			match(LP);
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BODY || _la==APPBARATRIB) {
				{
				setState(123);
				scaffoldProperty();
				setState(128);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(124);
						match(COMMA);
						setState(125);
						scaffoldProperty();
						}
						} 
					}
					setState(130);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				}
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(131);
					match(COMMA);
					}
				}

				}
			}

			setState(136);
			match(RP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ScaffoldPropertyContext extends ParserRuleContext {
		public ScaffoldPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scaffoldProperty; }
	 
		public ScaffoldPropertyContext() { }
		public void copyFrom(ScaffoldPropertyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ScaffoldBodyContext extends ScaffoldPropertyContext {
		public TerminalNode BODY() { return getToken(DartParser.BODY, 0); }
		public TerminalNode COLON() { return getToken(DartParser.COLON, 0); }
		public WidgetContext widget() {
			return getRuleContext(WidgetContext.class,0);
		}
		public ScaffoldBodyContext(ScaffoldPropertyContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitScaffoldBody(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ScaffoldAppBarContext extends ScaffoldPropertyContext {
		public TerminalNode APPBARATRIB() { return getToken(DartParser.APPBARATRIB, 0); }
		public TerminalNode COLON() { return getToken(DartParser.COLON, 0); }
		public AppBarContext appBar() {
			return getRuleContext(AppBarContext.class,0);
		}
		public ScaffoldAppBarContext(ScaffoldPropertyContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitScaffoldAppBar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScaffoldPropertyContext scaffoldProperty() throws RecognitionException {
		ScaffoldPropertyContext _localctx = new ScaffoldPropertyContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_scaffoldProperty);
		try {
			setState(144);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BODY:
				_localctx = new ScaffoldBodyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(138);
				match(BODY);
				setState(139);
				match(COLON);
				setState(140);
				widget();
				}
				break;
			case APPBARATRIB:
				_localctx = new ScaffoldAppBarContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(141);
				match(APPBARATRIB);
				setState(142);
				match(COLON);
				setState(143);
				appBar();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AppBarContext extends ParserRuleContext {
		public TerminalNode APPBAR() { return getToken(DartParser.APPBAR, 0); }
		public TerminalNode LP() { return getToken(DartParser.LP, 0); }
		public TerminalNode RP() { return getToken(DartParser.RP, 0); }
		public List<AppBarPropertiesContext> appBarProperties() {
			return getRuleContexts(AppBarPropertiesContext.class);
		}
		public AppBarPropertiesContext appBarProperties(int i) {
			return getRuleContext(AppBarPropertiesContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DartParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DartParser.COMMA, i);
		}
		public AppBarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_appBar; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitAppBar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AppBarContext appBar() throws RecognitionException {
		AppBarContext _localctx = new AppBarContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_appBar);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(APPBAR);
			setState(147);
			match(LP);
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TITLE || _la==CENTERTITLE) {
				{
				setState(148);
				appBarProperties();
				setState(153);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(149);
						match(COMMA);
						setState(150);
						appBarProperties();
						}
						} 
					}
					setState(155);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				}
				setState(157);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(156);
					match(COMMA);
					}
				}

				}
			}

			setState(161);
			match(RP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AppBarPropertiesContext extends ParserRuleContext {
		public AppBarPropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_appBarProperties; }
	 
		public AppBarPropertiesContext() { }
		public void copyFrom(AppBarPropertiesContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AppBarTitleContext extends AppBarPropertiesContext {
		public TerminalNode TITLE() { return getToken(DartParser.TITLE, 0); }
		public TerminalNode COLON() { return getToken(DartParser.COLON, 0); }
		public TerminalNode STRING() { return getToken(DartParser.STRING, 0); }
		public AppBarTitleContext(AppBarPropertiesContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitAppBarTitle(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AppBarCenterTitleContext extends AppBarPropertiesContext {
		public TerminalNode CENTERTITLE() { return getToken(DartParser.CENTERTITLE, 0); }
		public TerminalNode COLON() { return getToken(DartParser.COLON, 0); }
		public TerminalNode BOOLEAN() { return getToken(DartParser.BOOLEAN, 0); }
		public AppBarCenterTitleContext(AppBarPropertiesContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitAppBarCenterTitle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AppBarPropertiesContext appBarProperties() throws RecognitionException {
		AppBarPropertiesContext _localctx = new AppBarPropertiesContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_appBarProperties);
		try {
			setState(169);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TITLE:
				_localctx = new AppBarTitleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(163);
				match(TITLE);
				setState(164);
				match(COLON);
				setState(165);
				match(STRING);
				}
				break;
			case CENTERTITLE:
				_localctx = new AppBarCenterTitleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(166);
				match(CENTERTITLE);
				setState(167);
				match(COLON);
				setState(168);
				match(BOOLEAN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WidgetContext extends ParserRuleContext {
		public WidgetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_widget; }
	 
		public WidgetContext() { }
		public void copyFrom(WidgetContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RowWidgetContext extends WidgetContext {
		public RowContext row() {
			return getRuleContext(RowContext.class,0);
		}
		public RowWidgetContext(WidgetContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitRowWidget(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpandedWidgetContext extends WidgetContext {
		public ExpandedContext expanded() {
			return getRuleContext(ExpandedContext.class,0);
		}
		public ExpandedWidgetContext(WidgetContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitExpandedWidget(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TextWidgetContext extends WidgetContext {
		public TextContext text() {
			return getRuleContext(TextContext.class,0);
		}
		public TextWidgetContext(WidgetContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitTextWidget(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CreatedWidgetContext extends WidgetContext {
		public CustomWidgetContext customWidget() {
			return getRuleContext(CustomWidgetContext.class,0);
		}
		public CreatedWidgetContext(WidgetContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitCreatedWidget(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GestureDetectorWidgetContext extends WidgetContext {
		public GestureDetectorContext gestureDetector() {
			return getRuleContext(GestureDetectorContext.class,0);
		}
		public GestureDetectorWidgetContext(WidgetContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitGestureDetectorWidget(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CenterWidgetContext extends WidgetContext {
		public CenterContext center() {
			return getRuleContext(CenterContext.class,0);
		}
		public CenterWidgetContext(WidgetContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitCenterWidget(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TextFieldWidgetContext extends WidgetContext {
		public TextFieldContext textField() {
			return getRuleContext(TextFieldContext.class,0);
		}
		public TextFieldWidgetContext(WidgetContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitTextFieldWidget(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ImageWidgetContext extends WidgetContext {
		public ImageContext image() {
			return getRuleContext(ImageContext.class,0);
		}
		public ImageWidgetContext(WidgetContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitImageWidget(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PaddingWidgetContext extends WidgetContext {
		public PaddingContext padding() {
			return getRuleContext(PaddingContext.class,0);
		}
		public PaddingWidgetContext(WidgetContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitPaddingWidget(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ContainerWidgetContext extends WidgetContext {
		public ContainerContext container() {
			return getRuleContext(ContainerContext.class,0);
		}
		public ContainerWidgetContext(WidgetContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitContainerWidget(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ColumnWidgetContext extends WidgetContext {
		public ColumnContext column() {
			return getRuleContext(ColumnContext.class,0);
		}
		public ColumnWidgetContext(WidgetContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitColumnWidget(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ButtonWidgetContext extends WidgetContext {
		public ButtonContext button() {
			return getRuleContext(ButtonContext.class,0);
		}
		public ButtonWidgetContext(WidgetContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitButtonWidget(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WidgetContext widget() throws RecognitionException {
		WidgetContext _localctx = new WidgetContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_widget);
		try {
			setState(183);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ROW:
				_localctx = new RowWidgetContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(171);
				row();
				}
				break;
			case CENTER:
				_localctx = new CenterWidgetContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(172);
				center();
				}
				break;
			case TEXT:
				_localctx = new TextWidgetContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(173);
				text();
				}
				break;
			case CONTAINER:
				_localctx = new ContainerWidgetContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(174);
				container();
				}
				break;
			case EXPANDED:
				_localctx = new ExpandedWidgetContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(175);
				expanded();
				}
				break;
			case COLUMN:
				_localctx = new ColumnWidgetContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(176);
				column();
				}
				break;
			case GESTUREDETECTOR:
				_localctx = new GestureDetectorWidgetContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(177);
				gestureDetector();
				}
				break;
			case PADDING:
				_localctx = new PaddingWidgetContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(178);
				padding();
				}
				break;
			case IMAGE:
				_localctx = new ImageWidgetContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(179);
				image();
				}
				break;
			case BUTTON:
				_localctx = new ButtonWidgetContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(180);
				button();
				}
				break;
			case WIDGETNAME:
				_localctx = new CreatedWidgetContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(181);
				customWidget();
				}
				break;
			case TEXTFIELD:
				_localctx = new TextFieldWidgetContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(182);
				textField();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CustomWidgetContext extends ParserRuleContext {
		public TerminalNode WIDGETNAME() { return getToken(DartParser.WIDGETNAME, 0); }
		public TerminalNode LP() { return getToken(DartParser.LP, 0); }
		public TerminalNode RP() { return getToken(DartParser.RP, 0); }
		public List<CustomWidgetPropertiesContext> customWidgetProperties() {
			return getRuleContexts(CustomWidgetPropertiesContext.class);
		}
		public CustomWidgetPropertiesContext customWidgetProperties(int i) {
			return getRuleContext(CustomWidgetPropertiesContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DartParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DartParser.COMMA, i);
		}
		public CustomWidgetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_customWidget; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitCustomWidget(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CustomWidgetContext customWidget() throws RecognitionException {
		CustomWidgetContext _localctx = new CustomWidgetContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_customWidget);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(WIDGETNAME);
			setState(186);
			match(LP);
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(187);
				customWidgetProperties();
				setState(192);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(188);
						match(COMMA);
						setState(189);
						customWidgetProperties();
						}
						} 
					}
					setState(194);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				}
				setState(196);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(195);
					match(COMMA);
					}
				}

				}
			}

			setState(200);
			match(RP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CustomWidgetPropertiesContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(DartParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(DartParser.COLON, 0); }
		public TerminalNode NUM() { return getToken(DartParser.NUM, 0); }
		public TerminalNode STRING() { return getToken(DartParser.STRING, 0); }
		public CustomWidgetPropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_customWidgetProperties; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitCustomWidgetProperties(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CustomWidgetPropertiesContext customWidgetProperties() throws RecognitionException {
		CustomWidgetPropertiesContext _localctx = new CustomWidgetPropertiesContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_customWidgetProperties);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			match(IDENTIFIER);
			setState(203);
			match(COLON);
			setState(204);
			_la = _input.LA(1);
			if ( !(_la==NUM || _la==STRING) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RowContext extends ParserRuleContext {
		public TerminalNode ROW() { return getToken(DartParser.ROW, 0); }
		public TerminalNode LP() { return getToken(DartParser.LP, 0); }
		public TerminalNode RP() { return getToken(DartParser.RP, 0); }
		public List<RowPropertiesContext> rowProperties() {
			return getRuleContexts(RowPropertiesContext.class);
		}
		public RowPropertiesContext rowProperties(int i) {
			return getRuleContext(RowPropertiesContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DartParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DartParser.COMMA, i);
		}
		public RowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_row; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitRow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RowContext row() throws RecognitionException {
		RowContext _localctx = new RowContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_row);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(ROW);
			setState(207);
			match(LP);
			setState(219);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 10133100235325440L) != 0) {
				{
				setState(208);
				rowProperties();
				setState(213);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(209);
						match(COMMA);
						setState(210);
						rowProperties();
						}
						} 
					}
					setState(215);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				}
				setState(217);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(216);
					match(COMMA);
					}
				}

				}
			}

			setState(221);
			match(RP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RowPropertiesContext extends ParserRuleContext {
		public RowPropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rowProperties; }
	 
		public RowPropertiesContext() { }
		public void copyFrom(RowPropertiesContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RowChildrenContext extends RowPropertiesContext {
		public ChildrenPropertyContext childrenProperty() {
			return getRuleContext(ChildrenPropertyContext.class,0);
		}
		public RowChildrenContext(RowPropertiesContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitRowChildren(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RowCrossAxisAlignmentContext extends RowPropertiesContext {
		public CrossAxisAlignmentPropertyContext crossAxisAlignmentProperty() {
			return getRuleContext(CrossAxisAlignmentPropertyContext.class,0);
		}
		public RowCrossAxisAlignmentContext(RowPropertiesContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitRowCrossAxisAlignment(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RowMainAxisSizeContext extends RowPropertiesContext {
		public MainAxisSizePropertyContext mainAxisSizeProperty() {
			return getRuleContext(MainAxisSizePropertyContext.class,0);
		}
		public RowMainAxisSizeContext(RowPropertiesContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitRowMainAxisSize(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RowPropertiesContext rowProperties() throws RecognitionException {
		RowPropertiesContext _localctx = new RowPropertiesContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_rowProperties);
		try {
			setState(226);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHILDREN:
				_localctx = new RowChildrenContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(223);
				childrenProperty();
				}
				break;
			case MAINAXISSIZE:
				_localctx = new RowMainAxisSizeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(224);
				mainAxisSizeProperty();
				}
				break;
			case CROSSAXISALIGNMENT:
				_localctx = new RowCrossAxisAlignmentContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(225);
				crossAxisAlignmentProperty();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CenterContext extends ParserRuleContext {
		public TerminalNode CENTER() { return getToken(DartParser.CENTER, 0); }
		public TerminalNode LP() { return getToken(DartParser.LP, 0); }
		public TerminalNode RP() { return getToken(DartParser.RP, 0); }
		public List<CenterPropertiesContext> centerProperties() {
			return getRuleContexts(CenterPropertiesContext.class);
		}
		public CenterPropertiesContext centerProperties(int i) {
			return getRuleContext(CenterPropertiesContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DartParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DartParser.COMMA, i);
		}
		public CenterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_center; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitCenter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CenterContext center() throws RecognitionException {
		CenterContext _localctx = new CenterContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_center);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			match(CENTER);
			setState(229);
			match(LP);
			setState(241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CHILD) {
				{
				setState(230);
				centerProperties();
				setState(235);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(231);
						match(COMMA);
						setState(232);
						centerProperties();
						}
						} 
					}
					setState(237);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				}
				setState(239);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(238);
					match(COMMA);
					}
				}

				}
			}

			setState(243);
			match(RP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CenterPropertiesContext extends ParserRuleContext {
		public CenterPropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_centerProperties; }
	 
		public CenterPropertiesContext() { }
		public void copyFrom(CenterPropertiesContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CenterChildContext extends CenterPropertiesContext {
		public ChildPropertyContext childProperty() {
			return getRuleContext(ChildPropertyContext.class,0);
		}
		public CenterChildContext(CenterPropertiesContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitCenterChild(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CenterPropertiesContext centerProperties() throws RecognitionException {
		CenterPropertiesContext _localctx = new CenterPropertiesContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_centerProperties);
		try {
			_localctx = new CenterChildContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			childProperty();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ColumnContext extends ParserRuleContext {
		public TerminalNode COLUMN() { return getToken(DartParser.COLUMN, 0); }
		public TerminalNode LP() { return getToken(DartParser.LP, 0); }
		public TerminalNode RP() { return getToken(DartParser.RP, 0); }
		public List<ColumnPropertiesContext> columnProperties() {
			return getRuleContexts(ColumnPropertiesContext.class);
		}
		public ColumnPropertiesContext columnProperties(int i) {
			return getRuleContext(ColumnPropertiesContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DartParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DartParser.COMMA, i);
		}
		public ColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitColumn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnContext column() throws RecognitionException {
		ColumnContext _localctx = new ColumnContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_column);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			match(COLUMN);
			setState(248);
			match(LP);
			setState(260);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 10133100235325440L) != 0) {
				{
				setState(249);
				columnProperties();
				setState(254);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(250);
						match(COMMA);
						setState(251);
						columnProperties();
						}
						} 
					}
					setState(256);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				}
				setState(258);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(257);
					match(COMMA);
					}
				}

				}
			}

			setState(262);
			match(RP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ColumnPropertiesContext extends ParserRuleContext {
		public ColumnPropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnProperties; }
	 
		public ColumnPropertiesContext() { }
		public void copyFrom(ColumnPropertiesContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ColumnChildrenContext extends ColumnPropertiesContext {
		public ChildrenPropertyContext childrenProperty() {
			return getRuleContext(ChildrenPropertyContext.class,0);
		}
		public ColumnChildrenContext(ColumnPropertiesContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitColumnChildren(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ColumnMainAxisSizeContext extends ColumnPropertiesContext {
		public MainAxisSizePropertyContext mainAxisSizeProperty() {
			return getRuleContext(MainAxisSizePropertyContext.class,0);
		}
		public ColumnMainAxisSizeContext(ColumnPropertiesContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitColumnMainAxisSize(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ColumnCrossAxisAlignmentContext extends ColumnPropertiesContext {
		public CrossAxisAlignmentPropertyContext crossAxisAlignmentProperty() {
			return getRuleContext(CrossAxisAlignmentPropertyContext.class,0);
		}
		public ColumnCrossAxisAlignmentContext(ColumnPropertiesContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitColumnCrossAxisAlignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnPropertiesContext columnProperties() throws RecognitionException {
		ColumnPropertiesContext _localctx = new ColumnPropertiesContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_columnProperties);
		try {
			setState(267);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHILDREN:
				_localctx = new ColumnChildrenContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(264);
				childrenProperty();
				}
				break;
			case MAINAXISSIZE:
				_localctx = new ColumnMainAxisSizeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(265);
				mainAxisSizeProperty();
				}
				break;
			case CROSSAXISALIGNMENT:
				_localctx = new ColumnCrossAxisAlignmentContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(266);
				crossAxisAlignmentProperty();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TextContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(DartParser.TEXT, 0); }
		public TerminalNode LP() { return getToken(DartParser.LP, 0); }
		public TerminalNode RP() { return getToken(DartParser.RP, 0); }
		public List<TextPropertiesContext> textProperties() {
			return getRuleContexts(TextPropertiesContext.class);
		}
		public TextPropertiesContext textProperties(int i) {
			return getRuleContext(TextPropertiesContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DartParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DartParser.COMMA, i);
		}
		public TextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_text; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitText(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextContext text() throws RecognitionException {
		TextContext _localctx = new TextContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_text);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			match(TEXT);
			setState(270);
			match(LP);
			setState(282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la - 39)) & ~0x3f) == 0 && ((1L << (_la - 39)) & 68719476765L) != 0) {
				{
				setState(271);
				textProperties();
				setState(276);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(272);
						match(COMMA);
						setState(273);
						textProperties();
						}
						} 
					}
					setState(278);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				}
				setState(280);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(279);
					match(COMMA);
					}
				}

				}
			}

			setState(284);
			match(RP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TextPropertiesContext extends ParserRuleContext {
		public TextPropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textProperties; }
	 
		public TextPropertiesContext() { }
		public void copyFrom(TextPropertiesContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TextFontSizeContext extends TextPropertiesContext {
		public TerminalNode FONTSIZE() { return getToken(DartParser.FONTSIZE, 0); }
		public TerminalNode COLON() { return getToken(DartParser.COLON, 0); }
		public TerminalNode NUM() { return getToken(DartParser.NUM, 0); }
		public TextFontSizeContext(TextPropertiesContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitTextFontSize(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TextTextAlignContext extends TextPropertiesContext {
		public TerminalNode TEXTALIGN() { return getToken(DartParser.TEXTALIGN, 0); }
		public TerminalNode COLON() { return getToken(DartParser.COLON, 0); }
		public TerminalNode CENTERVALUE() { return getToken(DartParser.CENTERVALUE, 0); }
		public TerminalNode START_ATTR() { return getToken(DartParser.START_ATTR, 0); }
		public TerminalNode END_ATTR() { return getToken(DartParser.END_ATTR, 0); }
		public TerminalNode JUSTIFY_ATTR() { return getToken(DartParser.JUSTIFY_ATTR, 0); }
		public TextTextAlignContext(TextPropertiesContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitTextTextAlign(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TextLetterSpacingContext extends TextPropertiesContext {
		public TerminalNode LETTERSPACING() { return getToken(DartParser.LETTERSPACING, 0); }
		public TerminalNode COLON() { return getToken(DartParser.COLON, 0); }
		public TerminalNode NUM() { return getToken(DartParser.NUM, 0); }
		public TextLetterSpacingContext(TextPropertiesContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitTextLetterSpacing(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TextContentContext extends TextPropertiesContext {
		public TerminalNode TEXTATRIB() { return getToken(DartParser.TEXTATRIB, 0); }
		public TerminalNode COLON() { return getToken(DartParser.COLON, 0); }
		public TerminalNode STRING() { return getToken(DartParser.STRING, 0); }
		public TextContentContext(TextPropertiesContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitTextContent(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TextFontWeightContext extends TextPropertiesContext {
		public TerminalNode FONTWEIGHT() { return getToken(DartParser.FONTWEIGHT, 0); }
		public TerminalNode COLON() { return getToken(DartParser.COLON, 0); }
		public TerminalNode BOLD() { return getToken(DartParser.BOLD, 0); }
		public TerminalNode LIGHT() { return getToken(DartParser.LIGHT, 0); }
		public TerminalNode MEDIUM() { return getToken(DartParser.MEDIUM, 0); }
		public TerminalNode SEMIBOLD() { return getToken(DartParser.SEMIBOLD, 0); }
		public TextFontWeightContext(TextPropertiesContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitTextFontWeight(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextPropertiesContext textProperties() throws RecognitionException {
		TextPropertiesContext _localctx = new TextPropertiesContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_textProperties);
		int _la;
		try {
			setState(301);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TEXTATRIB:
				_localctx = new TextContentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(286);
				match(TEXTATRIB);
				setState(287);
				match(COLON);
				setState(288);
				match(STRING);
				}
				break;
			case FONTWEIGHT:
				_localctx = new TextFontWeightContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(289);
				match(FONTWEIGHT);
				setState(290);
				match(COLON);
				setState(291);
				_la = _input.LA(1);
				if ( !((((_la - 44)) & ~0x3f) == 0 && ((1L << (_la - 44)) & 962072674305L) != 0) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case FONTSIZE:
				_localctx = new TextFontSizeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(292);
				match(FONTSIZE);
				setState(293);
				match(COLON);
				setState(294);
				match(NUM);
				}
				break;
			case LETTERSPACING:
				_localctx = new TextLetterSpacingContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(295);
				match(LETTERSPACING);
				setState(296);
				match(COLON);
				setState(297);
				match(NUM);
				}
				break;
			case TEXTALIGN:
				_localctx = new TextTextAlignContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(298);
				match(TEXTALIGN);
				setState(299);
				match(COLON);
				setState(300);
				_la = _input.LA(1);
				if ( !((((_la - 48)) & ~0x3f) == 0 && ((1L << (_la - 48)) & 3758096385L) != 0) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ContainerContext extends ParserRuleContext {
		public TerminalNode CONTAINER() { return getToken(DartParser.CONTAINER, 0); }
		public TerminalNode LP() { return getToken(DartParser.LP, 0); }
		public TerminalNode RP() { return getToken(DartParser.RP, 0); }
		public List<ContainerPropertiesContext> containerProperties() {
			return getRuleContexts(ContainerPropertiesContext.class);
		}
		public ContainerPropertiesContext containerProperties(int i) {
			return getRuleContext(ContainerPropertiesContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DartParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DartParser.COMMA, i);
		}
		public ContainerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_container; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitContainer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContainerContext container() throws RecognitionException {
		ContainerContext _localctx = new ContainerContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_container);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			match(CONTAINER);
			setState(304);
			match(LP);
			setState(316);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 36275091918553088L) != 0) {
				{
				setState(305);
				containerProperties();
				setState(310);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(306);
						match(COMMA);
						setState(307);
						containerProperties();
						}
						} 
					}
					setState(312);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				}
				setState(314);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(313);
					match(COMMA);
					}
				}

				}
			}

			setState(318);
			match(RP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ContainerPropertiesContext extends ParserRuleContext {
		public ContainerPropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_containerProperties; }
	 
		public ContainerPropertiesContext() { }
		public void copyFrom(ContainerPropertiesContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ContainerDecorationContext extends ContainerPropertiesContext {
		public TerminalNode DECORATION() { return getToken(DartParser.DECORATION, 0); }
		public TerminalNode COLON() { return getToken(DartParser.COLON, 0); }
		public BoxDecorationContext boxDecoration() {
			return getRuleContext(BoxDecorationContext.class,0);
		}
		public ContainerDecorationContext(ContainerPropertiesContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitContainerDecoration(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ContainerContentAlignmentContext extends ContainerPropertiesContext {
		public TerminalNode CONTENTALIGNMENT() { return getToken(DartParser.CONTENTALIGNMENT, 0); }
		public TerminalNode COLON() { return getToken(DartParser.COLON, 0); }
		public TerminalNode CENTERVALUE() { return getToken(DartParser.CENTERVALUE, 0); }
		public TerminalNode LEFT() { return getToken(DartParser.LEFT, 0); }
		public TerminalNode RIGHT() { return getToken(DartParser.RIGHT, 0); }
		public ContainerContentAlignmentContext(ContainerPropertiesContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitContainerContentAlignment(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ContainerWidthContext extends ContainerPropertiesContext {
		public WidthPropertyContext widthProperty() {
			return getRuleContext(WidthPropertyContext.class,0);
		}
		public ContainerWidthContext(ContainerPropertiesContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitContainerWidth(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ContainerHeightContext extends ContainerPropertiesContext {
		public HeightPropertyContext heightProperty() {
			return getRuleContext(HeightPropertyContext.class,0);
		}
		public ContainerHeightContext(ContainerPropertiesContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitContainerHeight(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ContainerChildContext extends ContainerPropertiesContext {
		public ChildPropertyContext childProperty() {
			return getRuleContext(ChildPropertyContext.class,0);
		}
		public ContainerChildContext(ContainerPropertiesContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitContainerChild(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContainerPropertiesContext containerProperties() throws RecognitionException {
		ContainerPropertiesContext _localctx = new ContainerPropertiesContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_containerProperties);
		int _la;
		try {
			setState(329);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WIDTH:
				_localctx = new ContainerWidthContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(320);
				widthProperty();
				}
				break;
			case HEIGHT:
				_localctx = new ContainerHeightContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(321);
				heightProperty();
				}
				break;
			case CONTENTALIGNMENT:
				_localctx = new ContainerContentAlignmentContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(322);
				match(CONTENTALIGNMENT);
				setState(323);
				match(COLON);
				setState(324);
				_la = _input.LA(1);
				if ( !((((_la - 48)) & ~0x3f) == 0 && ((1L << (_la - 48)) & 175921860444161L) != 0) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case CHILD:
				_localctx = new ContainerChildContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(325);
				childProperty();
				}
				break;
			case DECORATION:
				_localctx = new ContainerDecorationContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(326);
				match(DECORATION);
				setState(327);
				match(COLON);
				setState(328);
				boxDecoration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BoxDecorationContext extends ParserRuleContext {
		public TerminalNode BOXDECORATION() { return getToken(DartParser.BOXDECORATION, 0); }
		public TerminalNode LP() { return getToken(DartParser.LP, 0); }
		public TerminalNode RP() { return getToken(DartParser.RP, 0); }
		public List<BoxDecorationPropertiesContext> boxDecorationProperties() {
			return getRuleContexts(BoxDecorationPropertiesContext.class);
		}
		public BoxDecorationPropertiesContext boxDecorationProperties(int i) {
			return getRuleContext(BoxDecorationPropertiesContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DartParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DartParser.COMMA, i);
		}
		public BoxDecorationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boxDecoration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitBoxDecoration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoxDecorationContext boxDecoration() throws RecognitionException {
		BoxDecorationContext _localctx = new BoxDecorationContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_boxDecoration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			match(BOXDECORATION);
			setState(332);
			match(LP);
			setState(344);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLOR || _la==BORDERRADIUS) {
				{
				setState(333);
				boxDecorationProperties();
				setState(338);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(334);
						match(COMMA);
						setState(335);
						boxDecorationProperties();
						}
						} 
					}
					setState(340);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
				}
				setState(342);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(341);
					match(COMMA);
					}
				}

				}
			}

			setState(346);
			match(RP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BoxDecorationPropertiesContext extends ParserRuleContext {
		public BoxDecorationPropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boxDecorationProperties; }
	 
		public BoxDecorationPropertiesContext() { }
		public void copyFrom(BoxDecorationPropertiesContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BoxDecorationBorderRadiusContext extends BoxDecorationPropertiesContext {
		public TerminalNode BORDERRADIUS() { return getToken(DartParser.BORDERRADIUS, 0); }
		public TerminalNode COLON() { return getToken(DartParser.COLON, 0); }
		public BorderRadiusContext borderRadius() {
			return getRuleContext(BorderRadiusContext.class,0);
		}
		public BoxDecorationBorderRadiusContext(BoxDecorationPropertiesContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitBoxDecorationBorderRadius(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BoxDecorationColorContext extends BoxDecorationPropertiesContext {
		public ColorPropertyContext colorProperty() {
			return getRuleContext(ColorPropertyContext.class,0);
		}
		public BoxDecorationColorContext(BoxDecorationPropertiesContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitBoxDecorationColor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoxDecorationPropertiesContext boxDecorationProperties() throws RecognitionException {
		BoxDecorationPropertiesContext _localctx = new BoxDecorationPropertiesContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_boxDecorationProperties);
		try {
			setState(352);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COLOR:
				_localctx = new BoxDecorationColorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(348);
				colorProperty();
				}
				break;
			case BORDERRADIUS:
				_localctx = new BoxDecorationBorderRadiusContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(349);
				match(BORDERRADIUS);
				setState(350);
				match(COLON);
				setState(351);
				borderRadius();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BorderRadiusContext extends ParserRuleContext {
		public BorderRadiusOnlyContext borderRadiusOnly() {
			return getRuleContext(BorderRadiusOnlyContext.class,0);
		}
		public BorderRadiusCircularContext borderRadiusCircular() {
			return getRuleContext(BorderRadiusCircularContext.class,0);
		}
		public BorderRadiusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_borderRadius; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitBorderRadius(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BorderRadiusContext borderRadius() throws RecognitionException {
		BorderRadiusContext _localctx = new BorderRadiusContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_borderRadius);
		try {
			setState(356);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BORDERRADIUSONLY:
				enterOuterAlt(_localctx, 1);
				{
				setState(354);
				borderRadiusOnly();
				}
				break;
			case BORDERRADIUSCIRCULAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(355);
				borderRadiusCircular();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BorderRadiusCircularContext extends ParserRuleContext {
		public TerminalNode BORDERRADIUSCIRCULAR() { return getToken(DartParser.BORDERRADIUSCIRCULAR, 0); }
		public TerminalNode LP() { return getToken(DartParser.LP, 0); }
		public BorderRadiusCircularPropertiesContext borderRadiusCircularProperties() {
			return getRuleContext(BorderRadiusCircularPropertiesContext.class,0);
		}
		public TerminalNode RP() { return getToken(DartParser.RP, 0); }
		public TerminalNode COMMA() { return getToken(DartParser.COMMA, 0); }
		public BorderRadiusCircularContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_borderRadiusCircular; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitBorderRadiusCircular(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BorderRadiusCircularContext borderRadiusCircular() throws RecognitionException {
		BorderRadiusCircularContext _localctx = new BorderRadiusCircularContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_borderRadiusCircular);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			match(BORDERRADIUSCIRCULAR);
			setState(359);
			match(LP);
			setState(360);
			borderRadiusCircularProperties();
			setState(362);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(361);
				match(COMMA);
				}
			}

			setState(364);
			match(RP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BorderRadiusOnlyContext extends ParserRuleContext {
		public TerminalNode BORDERRADIUSONLY() { return getToken(DartParser.BORDERRADIUSONLY, 0); }
		public TerminalNode LP() { return getToken(DartParser.LP, 0); }
		public TerminalNode RP() { return getToken(DartParser.RP, 0); }
		public List<BorderRadiusOnlyPropertiesContext> borderRadiusOnlyProperties() {
			return getRuleContexts(BorderRadiusOnlyPropertiesContext.class);
		}
		public BorderRadiusOnlyPropertiesContext borderRadiusOnlyProperties(int i) {
			return getRuleContext(BorderRadiusOnlyPropertiesContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DartParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DartParser.COMMA, i);
		}
		public BorderRadiusOnlyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_borderRadiusOnly; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitBorderRadiusOnly(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BorderRadiusOnlyContext borderRadiusOnly() throws RecognitionException {
		BorderRadiusOnlyContext _localctx = new BorderRadiusOnlyContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_borderRadiusOnly);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			match(BORDERRADIUSONLY);
			setState(367);
			match(LP);
			setState(379);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & -1152921504606846976L) != 0) {
				{
				setState(368);
				borderRadiusOnlyProperties();
				setState(373);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(369);
						match(COMMA);
						setState(370);
						borderRadiusOnlyProperties();
						}
						} 
					}
					setState(375);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
				}
				setState(377);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(376);
					match(COMMA);
					}
				}

				}
			}

			setState(381);
			match(RP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BorderRadiusCircularPropertiesContext extends ParserRuleContext {
		public TerminalNode RADIUS() { return getToken(DartParser.RADIUS, 0); }
		public TerminalNode COLON() { return getToken(DartParser.COLON, 0); }
		public TerminalNode NUM() { return getToken(DartParser.NUM, 0); }
		public BorderRadiusCircularPropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_borderRadiusCircularProperties; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitBorderRadiusCircularProperties(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BorderRadiusCircularPropertiesContext borderRadiusCircularProperties() throws RecognitionException {
		BorderRadiusCircularPropertiesContext _localctx = new BorderRadiusCircularPropertiesContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_borderRadiusCircularProperties);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
			match(RADIUS);
			setState(384);
			match(COLON);
			setState(385);
			match(NUM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BorderRadiusOnlyPropertiesContext extends ParserRuleContext {
		public BorderRadiusOnlyPropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_borderRadiusOnlyProperties; }
	 
		public BorderRadiusOnlyPropertiesContext() { }
		public void copyFrom(BorderRadiusOnlyPropertiesContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BorderRadiusOnlyTopLeftContext extends BorderRadiusOnlyPropertiesContext {
		public TerminalNode TOPLEFT() { return getToken(DartParser.TOPLEFT, 0); }
		public TerminalNode COLON() { return getToken(DartParser.COLON, 0); }
		public TerminalNode NUM() { return getToken(DartParser.NUM, 0); }
		public BorderRadiusOnlyTopLeftContext(BorderRadiusOnlyPropertiesContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitBorderRadiusOnlyTopLeft(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BorderRadiusOnlyBottomRightContext extends BorderRadiusOnlyPropertiesContext {
		public TerminalNode BOTTOMRIGHT() { return getToken(DartParser.BOTTOMRIGHT, 0); }
		public TerminalNode COLON() { return getToken(DartParser.COLON, 0); }
		public TerminalNode NUM() { return getToken(DartParser.NUM, 0); }
		public BorderRadiusOnlyBottomRightContext(BorderRadiusOnlyPropertiesContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitBorderRadiusOnlyBottomRight(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BorderRadiusOnlyTopRightContext extends BorderRadiusOnlyPropertiesContext {
		public TerminalNode TOPRIGHT() { return getToken(DartParser.TOPRIGHT, 0); }
		public TerminalNode COLON() { return getToken(DartParser.COLON, 0); }
		public TerminalNode NUM() { return getToken(DartParser.NUM, 0); }
		public BorderRadiusOnlyTopRightContext(BorderRadiusOnlyPropertiesContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitBorderRadiusOnlyTopRight(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BorderRadiusOnlyBottomLeftContext extends BorderRadiusOnlyPropertiesContext {
		public TerminalNode BOTTOMLEFT() { return getToken(DartParser.BOTTOMLEFT, 0); }
		public TerminalNode COLON() { return getToken(DartParser.COLON, 0); }
		public TerminalNode NUM() { return getToken(DartParser.NUM, 0); }
		public BorderRadiusOnlyBottomLeftContext(BorderRadiusOnlyPropertiesContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitBorderRadiusOnlyBottomLeft(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BorderRadiusOnlyPropertiesContext borderRadiusOnlyProperties() throws RecognitionException {
		BorderRadiusOnlyPropertiesContext _localctx = new BorderRadiusOnlyPropertiesContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_borderRadiusOnlyProperties);
		try {
			setState(399);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TOPRIGHT:
				_localctx = new BorderRadiusOnlyTopRightContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(387);
				match(TOPRIGHT);
				setState(388);
				match(COLON);
				setState(389);
				match(NUM);
				}
				break;
			case TOPLEFT:
				_localctx = new BorderRadiusOnlyTopLeftContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(390);
				match(TOPLEFT);
				setState(391);
				match(COLON);
				setState(392);
				match(NUM);
				}
				break;
			case BOTTOMRIGHT:
				_localctx = new BorderRadiusOnlyBottomRightContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(393);
				match(BOTTOMRIGHT);
				setState(394);
				match(COLON);
				setState(395);
				match(NUM);
				}
				break;
			case BOTTOMLEFT:
				_localctx = new BorderRadiusOnlyBottomLeftContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(396);
				match(BOTTOMLEFT);
				setState(397);
				match(COLON);
				setState(398);
				match(NUM);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpandedContext extends ParserRuleContext {
		public TerminalNode EXPANDED() { return getToken(DartParser.EXPANDED, 0); }
		public TerminalNode LP() { return getToken(DartParser.LP, 0); }
		public TerminalNode RP() { return getToken(DartParser.RP, 0); }
		public List<ExpandedPropertiesContext> expandedProperties() {
			return getRuleContexts(ExpandedPropertiesContext.class);
		}
		public ExpandedPropertiesContext expandedProperties(int i) {
			return getRuleContext(ExpandedPropertiesContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DartParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DartParser.COMMA, i);
		}
		public ExpandedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expanded; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitExpanded(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpandedContext expanded() throws RecognitionException {
		ExpandedContext _localctx = new ExpandedContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_expanded);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(401);
			match(EXPANDED);
			setState(402);
			match(LP);
			setState(414);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CHILD || _la==FLEX) {
				{
				setState(403);
				expandedProperties();
				setState(408);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(404);
						match(COMMA);
						setState(405);
						expandedProperties();
						}
						} 
					}
					setState(410);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
				}
				setState(412);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(411);
					match(COMMA);
					}
				}

				}
			}

			setState(416);
			match(RP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpandedPropertiesContext extends ParserRuleContext {
		public ExpandedPropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expandedProperties; }
	 
		public ExpandedPropertiesContext() { }
		public void copyFrom(ExpandedPropertiesContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpandedFlexContext extends ExpandedPropertiesContext {
		public TerminalNode FLEX() { return getToken(DartParser.FLEX, 0); }
		public TerminalNode COLON() { return getToken(DartParser.COLON, 0); }
		public TerminalNode NUM() { return getToken(DartParser.NUM, 0); }
		public ExpandedFlexContext(ExpandedPropertiesContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitExpandedFlex(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpandedChildContext extends ExpandedPropertiesContext {
		public ChildPropertyContext childProperty() {
			return getRuleContext(ChildPropertyContext.class,0);
		}
		public ExpandedChildContext(ExpandedPropertiesContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitExpandedChild(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpandedPropertiesContext expandedProperties() throws RecognitionException {
		ExpandedPropertiesContext _localctx = new ExpandedPropertiesContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_expandedProperties);
		try {
			setState(422);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FLEX:
				_localctx = new ExpandedFlexContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(418);
				match(FLEX);
				setState(419);
				match(COLON);
				setState(420);
				match(NUM);
				}
				break;
			case CHILD:
				_localctx = new ExpandedChildContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(421);
				childProperty();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GestureDetectorContext extends ParserRuleContext {
		public TerminalNode GESTUREDETECTOR() { return getToken(DartParser.GESTUREDETECTOR, 0); }
		public TerminalNode LP() { return getToken(DartParser.LP, 0); }
		public TerminalNode RP() { return getToken(DartParser.RP, 0); }
		public List<GestureDetectorPropertiesContext> gestureDetectorProperties() {
			return getRuleContexts(GestureDetectorPropertiesContext.class);
		}
		public GestureDetectorPropertiesContext gestureDetectorProperties(int i) {
			return getRuleContext(GestureDetectorPropertiesContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DartParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DartParser.COMMA, i);
		}
		public GestureDetectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gestureDetector; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitGestureDetector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GestureDetectorContext gestureDetector() throws RecognitionException {
		GestureDetectorContext _localctx = new GestureDetectorContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_gestureDetector);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(424);
			match(GESTUREDETECTOR);
			setState(425);
			match(LP);
			setState(437);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ONPRESSED) {
				{
				setState(426);
				gestureDetectorProperties();
				setState(431);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(427);
						match(COMMA);
						setState(428);
						gestureDetectorProperties();
						}
						} 
					}
					setState(433);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
				}
				setState(435);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(434);
					match(COMMA);
					}
				}

				}
			}

			setState(439);
			match(RP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GestureDetectorPropertiesContext extends ParserRuleContext {
		public TerminalNode ONPRESSED() { return getToken(DartParser.ONPRESSED, 0); }
		public TerminalNode COLON() { return getToken(DartParser.COLON, 0); }
		public OnFunctionContext onFunction() {
			return getRuleContext(OnFunctionContext.class,0);
		}
		public GestureDetectorPropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gestureDetectorProperties; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitGestureDetectorProperties(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GestureDetectorPropertiesContext gestureDetectorProperties() throws RecognitionException {
		GestureDetectorPropertiesContext _localctx = new GestureDetectorPropertiesContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_gestureDetectorProperties);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(441);
			match(ONPRESSED);
			setState(442);
			match(COLON);
			setState(443);
			onFunction();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OnFunctionContext extends ParserRuleContext {
		public TerminalNode LP() { return getToken(DartParser.LP, 0); }
		public TerminalNode RP() { return getToken(DartParser.RP, 0); }
		public TerminalNode OB() { return getToken(DartParser.OB, 0); }
		public TerminalNode CB() { return getToken(DartParser.CB, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(DartParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(DartParser.IDENTIFIER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DartParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DartParser.COMMA, i);
		}
		public List<StatmentContext> statment() {
			return getRuleContexts(StatmentContext.class);
		}
		public StatmentContext statment(int i) {
			return getRuleContext(StatmentContext.class,i);
		}
		public OnFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_onFunction; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitOnFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OnFunctionContext onFunction() throws RecognitionException {
		OnFunctionContext _localctx = new OnFunctionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_onFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(445);
			match(LP);
			setState(450);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(446);
				match(IDENTIFIER);
				setState(447);
				match(COMMA);
				}
				}
				setState(452);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(453);
			match(RP);
			setState(454);
			match(OB);
			setState(458);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la - 34)) & ~0x3f) == 0 && ((1L << (_la - 34)) & -9223372036854775785L) != 0) {
				{
				{
				setState(455);
				statment();
				}
				}
				setState(460);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(461);
			match(CB);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PaddingContext extends ParserRuleContext {
		public TerminalNode PADDING() { return getToken(DartParser.PADDING, 0); }
		public TerminalNode LP() { return getToken(DartParser.LP, 0); }
		public TerminalNode RP() { return getToken(DartParser.RP, 0); }
		public List<PaddingProprteyContext> paddingProprtey() {
			return getRuleContexts(PaddingProprteyContext.class);
		}
		public PaddingProprteyContext paddingProprtey(int i) {
			return getRuleContext(PaddingProprteyContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DartParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DartParser.COMMA, i);
		}
		public PaddingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_padding; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitPadding(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PaddingContext padding() throws RecognitionException {
		PaddingContext _localctx = new PaddingContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_padding);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(463);
			match(PADDING);
			setState(464);
			match(LP);
			setState(476);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CHILD || _la==PADDINGATTR) {
				{
				setState(465);
				paddingProprtey();
				setState(470);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(466);
						match(COMMA);
						setState(467);
						paddingProprtey();
						}
						} 
					}
					setState(472);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
				}
				setState(474);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(473);
					match(COMMA);
					}
				}

				}
			}

			setState(478);
			match(RP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PaddingProprteyContext extends ParserRuleContext {
		public PaddingProprteyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paddingProprtey; }
	 
		public PaddingProprteyContext() { }
		public void copyFrom(PaddingProprteyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PaddingPaddingContext extends PaddingProprteyContext {
		public TerminalNode PADDINGATTR() { return getToken(DartParser.PADDINGATTR, 0); }
		public TerminalNode COLON() { return getToken(DartParser.COLON, 0); }
		public EdgeInsetsContext edgeInsets() {
			return getRuleContext(EdgeInsetsContext.class,0);
		}
		public PaddingPaddingContext(PaddingProprteyContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitPaddingPadding(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PaddingChildContext extends PaddingProprteyContext {
		public ChildPropertyContext childProperty() {
			return getRuleContext(ChildPropertyContext.class,0);
		}
		public PaddingChildContext(PaddingProprteyContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitPaddingChild(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PaddingProprteyContext paddingProprtey() throws RecognitionException {
		PaddingProprteyContext _localctx = new PaddingProprteyContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_paddingProprtey);
		try {
			setState(484);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PADDINGATTR:
				_localctx = new PaddingPaddingContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(480);
				match(PADDINGATTR);
				setState(481);
				match(COLON);
				setState(482);
				edgeInsets();
				}
				break;
			case CHILD:
				_localctx = new PaddingChildContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(483);
				childProperty();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EdgeInsetsContext extends ParserRuleContext {
		public EdgeInsetsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_edgeInsets; }
	 
		public EdgeInsetsContext() { }
		public void copyFrom(EdgeInsetsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EdgeInsetsOnlyContext extends EdgeInsetsContext {
		public TerminalNode EDGE_INSETS_ONLY() { return getToken(DartParser.EDGE_INSETS_ONLY, 0); }
		public TerminalNode LP() { return getToken(DartParser.LP, 0); }
		public TerminalNode RP() { return getToken(DartParser.RP, 0); }
		public List<EdgeInsetsOnlyPropertiesContext> edgeInsetsOnlyProperties() {
			return getRuleContexts(EdgeInsetsOnlyPropertiesContext.class);
		}
		public EdgeInsetsOnlyPropertiesContext edgeInsetsOnlyProperties(int i) {
			return getRuleContext(EdgeInsetsOnlyPropertiesContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DartParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DartParser.COMMA, i);
		}
		public EdgeInsetsOnlyContext(EdgeInsetsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitEdgeInsetsOnly(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EdgeInsetsSymetricContext extends EdgeInsetsContext {
		public TerminalNode EDGE_INSETS_SYMMETRIC() { return getToken(DartParser.EDGE_INSETS_SYMMETRIC, 0); }
		public TerminalNode LP() { return getToken(DartParser.LP, 0); }
		public TerminalNode RP() { return getToken(DartParser.RP, 0); }
		public List<EdgeInsetsSymetricPropertiesContext> edgeInsetsSymetricProperties() {
			return getRuleContexts(EdgeInsetsSymetricPropertiesContext.class);
		}
		public EdgeInsetsSymetricPropertiesContext edgeInsetsSymetricProperties(int i) {
			return getRuleContext(EdgeInsetsSymetricPropertiesContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DartParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DartParser.COMMA, i);
		}
		public EdgeInsetsSymetricContext(EdgeInsetsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitEdgeInsetsSymetric(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EdgeInsetsContext edgeInsets() throws RecognitionException {
		EdgeInsetsContext _localctx = new EdgeInsetsContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_edgeInsets);
		int _la;
		try {
			int _alt;
			setState(518);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EDGE_INSETS_ONLY:
				_localctx = new EdgeInsetsOnlyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(486);
				match(EDGE_INSETS_ONLY);
				setState(487);
				match(LP);
				setState(499);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la - 92)) & ~0x3f) == 0 && ((1L << (_la - 92)) & 15L) != 0) {
					{
					setState(488);
					edgeInsetsOnlyProperties();
					setState(493);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(489);
							match(COMMA);
							setState(490);
							edgeInsetsOnlyProperties();
							}
							} 
						}
						setState(495);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
					}
					setState(497);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(496);
						match(COMMA);
						}
					}

					}
				}

				setState(501);
				match(RP);
				}
				break;
			case EDGE_INSETS_SYMMETRIC:
				_localctx = new EdgeInsetsSymetricContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(502);
				match(EDGE_INSETS_SYMMETRIC);
				setState(503);
				match(LP);
				setState(515);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==HORIZONTAL || _la==VERTICAL) {
					{
					setState(504);
					edgeInsetsSymetricProperties();
					setState(509);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(505);
							match(COMMA);
							setState(506);
							edgeInsetsSymetricProperties();
							}
							} 
						}
						setState(511);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
					}
					setState(513);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(512);
						match(COMMA);
						}
					}

					}
				}

				setState(517);
				match(RP);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EdgeInsetsOnlyPropertiesContext extends ParserRuleContext {
		public EdgeInsetsOnlyPropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_edgeInsetsOnlyProperties; }
	 
		public EdgeInsetsOnlyPropertiesContext() { }
		public void copyFrom(EdgeInsetsOnlyPropertiesContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EdgeInsetsOnlyRightContext extends EdgeInsetsOnlyPropertiesContext {
		public TerminalNode RIGHT() { return getToken(DartParser.RIGHT, 0); }
		public TerminalNode COLON() { return getToken(DartParser.COLON, 0); }
		public TerminalNode NUM() { return getToken(DartParser.NUM, 0); }
		public EdgeInsetsOnlyRightContext(EdgeInsetsOnlyPropertiesContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitEdgeInsetsOnlyRight(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EdgeInsetsOnlyBottomContext extends EdgeInsetsOnlyPropertiesContext {
		public TerminalNode BOTTOM() { return getToken(DartParser.BOTTOM, 0); }
		public TerminalNode COLON() { return getToken(DartParser.COLON, 0); }
		public TerminalNode NUM() { return getToken(DartParser.NUM, 0); }
		public EdgeInsetsOnlyBottomContext(EdgeInsetsOnlyPropertiesContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitEdgeInsetsOnlyBottom(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EdgeInsetsOnlyTopContext extends EdgeInsetsOnlyPropertiesContext {
		public TerminalNode TOP() { return getToken(DartParser.TOP, 0); }
		public TerminalNode COLON() { return getToken(DartParser.COLON, 0); }
		public TerminalNode NUM() { return getToken(DartParser.NUM, 0); }
		public EdgeInsetsOnlyTopContext(EdgeInsetsOnlyPropertiesContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitEdgeInsetsOnlyTop(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EdgeInsetsOnlyLeftContext extends EdgeInsetsOnlyPropertiesContext {
		public TerminalNode LEFT() { return getToken(DartParser.LEFT, 0); }
		public TerminalNode COLON() { return getToken(DartParser.COLON, 0); }
		public TerminalNode NUM() { return getToken(DartParser.NUM, 0); }
		public EdgeInsetsOnlyLeftContext(EdgeInsetsOnlyPropertiesContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitEdgeInsetsOnlyLeft(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EdgeInsetsOnlyPropertiesContext edgeInsetsOnlyProperties() throws RecognitionException {
		EdgeInsetsOnlyPropertiesContext _localctx = new EdgeInsetsOnlyPropertiesContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_edgeInsetsOnlyProperties);
		try {
			setState(532);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TOP:
				_localctx = new EdgeInsetsOnlyTopContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(520);
				match(TOP);
				setState(521);
				match(COLON);
				setState(522);
				match(NUM);
				}
				break;
			case LEFT:
				_localctx = new EdgeInsetsOnlyLeftContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(523);
				match(LEFT);
				setState(524);
				match(COLON);
				setState(525);
				match(NUM);
				}
				break;
			case RIGHT:
				_localctx = new EdgeInsetsOnlyRightContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(526);
				match(RIGHT);
				setState(527);
				match(COLON);
				setState(528);
				match(NUM);
				}
				break;
			case BOTTOM:
				_localctx = new EdgeInsetsOnlyBottomContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(529);
				match(BOTTOM);
				setState(530);
				match(COLON);
				setState(531);
				match(NUM);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EdgeInsetsSymetricPropertiesContext extends ParserRuleContext {
		public EdgeInsetsSymetricPropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_edgeInsetsSymetricProperties; }
	 
		public EdgeInsetsSymetricPropertiesContext() { }
		public void copyFrom(EdgeInsetsSymetricPropertiesContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EdgeInsetsSymetricHorizontalContext extends EdgeInsetsSymetricPropertiesContext {
		public TerminalNode HORIZONTAL() { return getToken(DartParser.HORIZONTAL, 0); }
		public TerminalNode COLON() { return getToken(DartParser.COLON, 0); }
		public TerminalNode NUM() { return getToken(DartParser.NUM, 0); }
		public EdgeInsetsSymetricHorizontalContext(EdgeInsetsSymetricPropertiesContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitEdgeInsetsSymetricHorizontal(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EdgeInsetsSymetricVerticalContext extends EdgeInsetsSymetricPropertiesContext {
		public TerminalNode VERTICAL() { return getToken(DartParser.VERTICAL, 0); }
		public TerminalNode COLON() { return getToken(DartParser.COLON, 0); }
		public TerminalNode NUM() { return getToken(DartParser.NUM, 0); }
		public EdgeInsetsSymetricVerticalContext(EdgeInsetsSymetricPropertiesContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitEdgeInsetsSymetricVertical(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EdgeInsetsSymetricPropertiesContext edgeInsetsSymetricProperties() throws RecognitionException {
		EdgeInsetsSymetricPropertiesContext _localctx = new EdgeInsetsSymetricPropertiesContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_edgeInsetsSymetricProperties);
		try {
			setState(540);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HORIZONTAL:
				_localctx = new EdgeInsetsSymetricHorizontalContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(534);
				match(HORIZONTAL);
				setState(535);
				match(COLON);
				setState(536);
				match(NUM);
				}
				break;
			case VERTICAL:
				_localctx = new EdgeInsetsSymetricVerticalContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(537);
				match(VERTICAL);
				setState(538);
				match(COLON);
				setState(539);
				match(NUM);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImageContext extends ParserRuleContext {
		public TerminalNode IMAGE() { return getToken(DartParser.IMAGE, 0); }
		public TerminalNode LP() { return getToken(DartParser.LP, 0); }
		public TerminalNode RP() { return getToken(DartParser.RP, 0); }
		public List<ImagePropertiesContext> imageProperties() {
			return getRuleContexts(ImagePropertiesContext.class);
		}
		public ImagePropertiesContext imageProperties(int i) {
			return getRuleContext(ImagePropertiesContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DartParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DartParser.COMMA, i);
		}
		public ImageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_image; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitImage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImageContext image() throws RecognitionException {
		ImageContext _localctx = new ImageContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_image);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(542);
			match(IMAGE);
			setState(543);
			match(LP);
			setState(555);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la - 45)) & ~0x3f) == 0 && ((1L << (_la - 45)) & 6291459L) != 0) {
				{
				setState(544);
				imageProperties();
				setState(549);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(545);
						match(COMMA);
						setState(546);
						imageProperties();
						}
						} 
					}
					setState(551);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
				}
				setState(553);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(552);
					match(COMMA);
					}
				}

				}
			}

			setState(557);
			match(RP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImagePropertiesContext extends ParserRuleContext {
		public ImagePropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imageProperties; }
	 
		public ImagePropertiesContext() { }
		public void copyFrom(ImagePropertiesContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ImageHeightContext extends ImagePropertiesContext {
		public HeightPropertyContext heightProperty() {
			return getRuleContext(HeightPropertyContext.class,0);
		}
		public ImageHeightContext(ImagePropertiesContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitImageHeight(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ImageWidthContext extends ImagePropertiesContext {
		public WidthPropertyContext widthProperty() {
			return getRuleContext(WidthPropertyContext.class,0);
		}
		public ImageWidthContext(ImagePropertiesContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitImageWidth(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ImageUrlContext extends ImagePropertiesContext {
		public TerminalNode URL() { return getToken(DartParser.URL, 0); }
		public TerminalNode COLON() { return getToken(DartParser.COLON, 0); }
		public TerminalNode STRING() { return getToken(DartParser.STRING, 0); }
		public ImageUrlContext(ImagePropertiesContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitImageUrl(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ImageFitContext extends ImagePropertiesContext {
		public TerminalNode FIT() { return getToken(DartParser.FIT, 0); }
		public TerminalNode COLON() { return getToken(DartParser.COLON, 0); }
		public TerminalNode COVER() { return getToken(DartParser.COVER, 0); }
		public TerminalNode CONTAINS() { return getToken(DartParser.CONTAINS, 0); }
		public ImageFitContext(ImagePropertiesContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitImageFit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImagePropertiesContext imageProperties() throws RecognitionException {
		ImagePropertiesContext _localctx = new ImagePropertiesContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_imageProperties);
		int _la;
		try {
			setState(567);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case URL:
				_localctx = new ImageUrlContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(559);
				match(URL);
				setState(560);
				match(COLON);
				setState(561);
				match(STRING);
				}
				break;
			case FIT:
				_localctx = new ImageFitContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(562);
				match(FIT);
				setState(563);
				match(COLON);
				setState(564);
				_la = _input.LA(1);
				if ( !(_la==CONTAINS || _la==COVER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case WIDTH:
				_localctx = new ImageWidthContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(565);
				widthProperty();
				}
				break;
			case HEIGHT:
				_localctx = new ImageHeightContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(566);
				heightProperty();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ButtonContext extends ParserRuleContext {
		public TerminalNode BUTTON() { return getToken(DartParser.BUTTON, 0); }
		public TerminalNode LP() { return getToken(DartParser.LP, 0); }
		public TerminalNode RP() { return getToken(DartParser.RP, 0); }
		public List<ButtonPropertiesContext> buttonProperties() {
			return getRuleContexts(ButtonPropertiesContext.class);
		}
		public ButtonPropertiesContext buttonProperties(int i) {
			return getRuleContext(ButtonPropertiesContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DartParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DartParser.COMMA, i);
		}
		public ButtonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_button; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitButton(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ButtonContext button() throws RecognitionException {
		ButtonContext _localctx = new ButtonContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_button);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(569);
			match(BUTTON);
			setState(570);
			match(LP);
			setState(582);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la - 45)) & ~0x3f) == 0 && ((1L << (_la - 45)) & 2206203907L) != 0) {
				{
				setState(571);
				buttonProperties();
				setState(576);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(572);
						match(COMMA);
						setState(573);
						buttonProperties();
						}
						} 
					}
					setState(578);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
				}
				setState(580);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(579);
					match(COMMA);
					}
				}

				}
			}

			setState(584);
			match(RP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ButtonPropertiesContext extends ParserRuleContext {
		public ButtonPropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_buttonProperties; }
	 
		public ButtonPropertiesContext() { }
		public void copyFrom(ButtonPropertiesContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ButtonHeightContext extends ButtonPropertiesContext {
		public HeightPropertyContext heightProperty() {
			return getRuleContext(HeightPropertyContext.class,0);
		}
		public ButtonHeightContext(ButtonPropertiesContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitButtonHeight(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ButtonWidthContext extends ButtonPropertiesContext {
		public WidthPropertyContext widthProperty() {
			return getRuleContext(WidthPropertyContext.class,0);
		}
		public ButtonWidthContext(ButtonPropertiesContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitButtonWidth(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ButtonTitleColorContext extends ButtonPropertiesContext {
		public TerminalNode TITLE_COLOR() { return getToken(DartParser.TITLE_COLOR, 0); }
		public TerminalNode COLON() { return getToken(DartParser.COLON, 0); }
		public TerminalNode HEX_NUM() { return getToken(DartParser.HEX_NUM, 0); }
		public ButtonTitleColorContext(ButtonPropertiesContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitButtonTitleColor(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ButtonOnPressedContext extends ButtonPropertiesContext {
		public TerminalNode ONPRESSED() { return getToken(DartParser.ONPRESSED, 0); }
		public TerminalNode COLON() { return getToken(DartParser.COLON, 0); }
		public OnFunctionContext onFunction() {
			return getRuleContext(OnFunctionContext.class,0);
		}
		public ButtonOnPressedContext(ButtonPropertiesContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitButtonOnPressed(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ButtonBackgroundColorContext extends ButtonPropertiesContext {
		public TerminalNode BACKGROUND_COLOR() { return getToken(DartParser.BACKGROUND_COLOR, 0); }
		public TerminalNode COLON() { return getToken(DartParser.COLON, 0); }
		public TerminalNode HEX_NUM() { return getToken(DartParser.HEX_NUM, 0); }
		public ButtonBackgroundColorContext(ButtonPropertiesContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitButtonBackgroundColor(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ButtonTitleContext extends ButtonPropertiesContext {
		public TerminalNode TITLE() { return getToken(DartParser.TITLE, 0); }
		public TerminalNode COLON() { return getToken(DartParser.COLON, 0); }
		public TerminalNode STRING() { return getToken(DartParser.STRING, 0); }
		public ButtonTitleContext(ButtonPropertiesContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitButtonTitle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ButtonPropertiesContext buttonProperties() throws RecognitionException {
		ButtonPropertiesContext _localctx = new ButtonPropertiesContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_buttonProperties);
		try {
			setState(600);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WIDTH:
				_localctx = new ButtonWidthContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(586);
				widthProperty();
				}
				break;
			case HEIGHT:
				_localctx = new ButtonHeightContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(587);
				heightProperty();
				}
				break;
			case TITLE:
				_localctx = new ButtonTitleContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(588);
				match(TITLE);
				setState(589);
				match(COLON);
				setState(590);
				match(STRING);
				}
				break;
			case BACKGROUND_COLOR:
				_localctx = new ButtonBackgroundColorContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(591);
				match(BACKGROUND_COLOR);
				setState(592);
				match(COLON);
				setState(593);
				match(HEX_NUM);
				}
				break;
			case TITLE_COLOR:
				_localctx = new ButtonTitleColorContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(594);
				match(TITLE_COLOR);
				setState(595);
				match(COLON);
				setState(596);
				match(HEX_NUM);
				}
				break;
			case ONPRESSED:
				_localctx = new ButtonOnPressedContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(597);
				match(ONPRESSED);
				setState(598);
				match(COLON);
				setState(599);
				onFunction();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TextFieldContext extends ParserRuleContext {
		public TerminalNode TEXTFIELD() { return getToken(DartParser.TEXTFIELD, 0); }
		public TerminalNode LP() { return getToken(DartParser.LP, 0); }
		public TerminalNode RP() { return getToken(DartParser.RP, 0); }
		public List<TextFieldPropertiesContext> textFieldProperties() {
			return getRuleContexts(TextFieldPropertiesContext.class);
		}
		public TextFieldPropertiesContext textFieldProperties(int i) {
			return getRuleContext(TextFieldPropertiesContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DartParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DartParser.COMMA, i);
		}
		public TextFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textField; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitTextField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextFieldContext textField() throws RecognitionException {
		TextFieldContext _localctx = new TextFieldContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_textField);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(602);
			match(TEXTFIELD);
			setState(603);
			match(LP);
			setState(615);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la - 59)) & ~0x3f) == 0 && ((1L << (_la - 59)) & 5335154689L) != 0) {
				{
				setState(604);
				textFieldProperties();
				setState(609);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(605);
						match(COMMA);
						setState(606);
						textFieldProperties();
						}
						} 
					}
					setState(611);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
				}
				setState(613);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(612);
					match(COMMA);
					}
				}

				}
			}

			setState(617);
			match(RP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TextFieldPropertiesContext extends ParserRuleContext {
		public TextFieldPropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textFieldProperties; }
	 
		public TextFieldPropertiesContext() { }
		public void copyFrom(TextFieldPropertiesContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TextFieldHintContext extends TextFieldPropertiesContext {
		public TerminalNode HINT() { return getToken(DartParser.HINT, 0); }
		public TerminalNode COLON() { return getToken(DartParser.COLON, 0); }
		public TerminalNode STRING() { return getToken(DartParser.STRING, 0); }
		public TextFieldHintContext(TextFieldPropertiesContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitTextFieldHint(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TextFieldTextColorContext extends TextFieldPropertiesContext {
		public TerminalNode TEXTCOLOR() { return getToken(DartParser.TEXTCOLOR, 0); }
		public TerminalNode COLON() { return getToken(DartParser.COLON, 0); }
		public TerminalNode HEX_NUM() { return getToken(DartParser.HEX_NUM, 0); }
		public TextFieldTextColorContext(TextFieldPropertiesContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitTextFieldTextColor(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TextFieldBorderContext extends TextFieldPropertiesContext {
		public TerminalNode BORDERATRI() { return getToken(DartParser.BORDERATRI, 0); }
		public TerminalNode COLON() { return getToken(DartParser.COLON, 0); }
		public BorderContext border() {
			return getRuleContext(BorderContext.class,0);
		}
		public TextFieldBorderContext(TextFieldPropertiesContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitTextFieldBorder(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TextFieldLabelContext extends TextFieldPropertiesContext {
		public TerminalNode LABEL() { return getToken(DartParser.LABEL, 0); }
		public TerminalNode COLON() { return getToken(DartParser.COLON, 0); }
		public TerminalNode STRING() { return getToken(DartParser.STRING, 0); }
		public TextFieldLabelContext(TextFieldPropertiesContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitTextFieldLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TextFieldValueContext extends TextFieldPropertiesContext {
		public TerminalNode VALUE() { return getToken(DartParser.VALUE, 0); }
		public TerminalNode COLON() { return getToken(DartParser.COLON, 0); }
		public TerminalNode STRING() { return getToken(DartParser.STRING, 0); }
		public TextFieldValueContext(TextFieldPropertiesContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitTextFieldValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TextFieldPaddingContext extends TextFieldPropertiesContext {
		public TerminalNode PADDINGATTR() { return getToken(DartParser.PADDINGATTR, 0); }
		public TerminalNode COLON() { return getToken(DartParser.COLON, 0); }
		public EdgeInsetsContext edgeInsets() {
			return getRuleContext(EdgeInsetsContext.class,0);
		}
		public TextFieldPaddingContext(TextFieldPropertiesContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitTextFieldPadding(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TextFieldOnChangedContext extends TextFieldPropertiesContext {
		public TerminalNode ONCHANGED() { return getToken(DartParser.ONCHANGED, 0); }
		public TerminalNode COLON() { return getToken(DartParser.COLON, 0); }
		public OnFunctionContext onFunction() {
			return getRuleContext(OnFunctionContext.class,0);
		}
		public TextFieldOnChangedContext(TextFieldPropertiesContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitTextFieldOnChanged(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextFieldPropertiesContext textFieldProperties() throws RecognitionException {
		TextFieldPropertiesContext _localctx = new TextFieldPropertiesContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_textFieldProperties);
		try {
			setState(640);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VALUE:
				_localctx = new TextFieldValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(619);
				match(VALUE);
				setState(620);
				match(COLON);
				setState(621);
				match(STRING);
				}
				break;
			case LABEL:
				_localctx = new TextFieldLabelContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(622);
				match(LABEL);
				setState(623);
				match(COLON);
				setState(624);
				match(STRING);
				}
				break;
			case TEXTCOLOR:
				_localctx = new TextFieldTextColorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(625);
				match(TEXTCOLOR);
				setState(626);
				match(COLON);
				setState(627);
				match(HEX_NUM);
				}
				break;
			case PADDINGATTR:
				_localctx = new TextFieldPaddingContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(628);
				match(PADDINGATTR);
				setState(629);
				match(COLON);
				setState(630);
				edgeInsets();
				}
				break;
			case HINT:
				_localctx = new TextFieldHintContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(631);
				match(HINT);
				setState(632);
				match(COLON);
				setState(633);
				match(STRING);
				}
				break;
			case BORDERATRI:
				_localctx = new TextFieldBorderContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(634);
				match(BORDERATRI);
				setState(635);
				match(COLON);
				setState(636);
				border();
				}
				break;
			case ONCHANGED:
				_localctx = new TextFieldOnChangedContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(637);
				match(ONCHANGED);
				setState(638);
				match(COLON);
				setState(639);
				onFunction();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BorderContext extends ParserRuleContext {
		public TerminalNode BORDER() { return getToken(DartParser.BORDER, 0); }
		public TerminalNode LP() { return getToken(DartParser.LP, 0); }
		public TerminalNode RP() { return getToken(DartParser.RP, 0); }
		public List<BorderPropertiesContext> borderProperties() {
			return getRuleContexts(BorderPropertiesContext.class);
		}
		public BorderPropertiesContext borderProperties(int i) {
			return getRuleContext(BorderPropertiesContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DartParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DartParser.COMMA, i);
		}
		public BorderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_border; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitBorder(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BorderContext border() throws RecognitionException {
		BorderContext _localctx = new BorderContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_border);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(642);
			match(BORDER);
			setState(643);
			match(LP);
			setState(655);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la - 56)) & ~0x3f) == 0 && ((1L << (_la - 56)) & 8589934595L) != 0) {
				{
				setState(644);
				borderProperties();
				setState(649);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(645);
						match(COMMA);
						setState(646);
						borderProperties();
						}
						} 
					}
					setState(651);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
				}
				setState(653);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(652);
					match(COMMA);
					}
				}

				}
			}

			setState(657);
			match(RP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BorderPropertiesContext extends ParserRuleContext {
		public BorderPropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_borderProperties; }
	 
		public BorderPropertiesContext() { }
		public void copyFrom(BorderPropertiesContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BorderThicknessContext extends BorderPropertiesContext {
		public TerminalNode THICKNESS() { return getToken(DartParser.THICKNESS, 0); }
		public TerminalNode COLON() { return getToken(DartParser.COLON, 0); }
		public TerminalNode NUM() { return getToken(DartParser.NUM, 0); }
		public BorderThicknessContext(BorderPropertiesContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitBorderThickness(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BorderBorderRadiusContext extends BorderPropertiesContext {
		public TerminalNode BORDERRADIUS() { return getToken(DartParser.BORDERRADIUS, 0); }
		public TerminalNode COLON() { return getToken(DartParser.COLON, 0); }
		public BorderRadiusContext borderRadius() {
			return getRuleContext(BorderRadiusContext.class,0);
		}
		public BorderBorderRadiusContext(BorderPropertiesContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitBorderBorderRadius(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BorderColorContext extends BorderPropertiesContext {
		public ColorPropertyContext colorProperty() {
			return getRuleContext(ColorPropertyContext.class,0);
		}
		public BorderColorContext(BorderPropertiesContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitBorderColor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BorderPropertiesContext borderProperties() throws RecognitionException {
		BorderPropertiesContext _localctx = new BorderPropertiesContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_borderProperties);
		try {
			setState(666);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case THICKNESS:
				_localctx = new BorderThicknessContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(659);
				match(THICKNESS);
				setState(660);
				match(COLON);
				setState(661);
				match(NUM);
				}
				break;
			case BORDERRADIUS:
				_localctx = new BorderBorderRadiusContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(662);
				match(BORDERRADIUS);
				setState(663);
				match(COLON);
				setState(664);
				borderRadius();
				}
				break;
			case COLOR:
				_localctx = new BorderColorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(665);
				colorProperty();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CustomWidgetDeclarationContext extends ParserRuleContext {
		public TerminalNode WIDGET() { return getToken(DartParser.WIDGET, 0); }
		public TerminalNode WIDGETNAME() { return getToken(DartParser.WIDGETNAME, 0); }
		public TerminalNode OB() { return getToken(DartParser.OB, 0); }
		public VariablesContext variables() {
			return getRuleContext(VariablesContext.class,0);
		}
		public TerminalNode RETURN() { return getToken(DartParser.RETURN, 0); }
		public TerminalNode LP() { return getToken(DartParser.LP, 0); }
		public TreeContext tree() {
			return getRuleContext(TreeContext.class,0);
		}
		public TerminalNode RP() { return getToken(DartParser.RP, 0); }
		public TerminalNode CB() { return getToken(DartParser.CB, 0); }
		public CustomWidgetDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_customWidgetDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitCustomWidgetDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CustomWidgetDeclarationContext customWidgetDeclaration() throws RecognitionException {
		CustomWidgetDeclarationContext _localctx = new CustomWidgetDeclarationContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_customWidgetDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(668);
			match(WIDGET);
			setState(669);
			match(WIDGETNAME);
			setState(670);
			match(OB);
			setState(671);
			variables();
			setState(672);
			match(RETURN);
			setState(673);
			match(LP);
			setState(674);
			tree();
			setState(675);
			match(RP);
			setState(676);
			match(CB);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariablesContext extends ParserRuleContext {
		public List<VariableDeclarationContext> variableDeclaration() {
			return getRuleContexts(VariableDeclarationContext.class);
		}
		public VariableDeclarationContext variableDeclaration(int i) {
			return getRuleContext(VariableDeclarationContext.class,i);
		}
		public VariablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variables; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitVariables(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariablesContext variables() throws RecognitionException {
		VariablesContext _localctx = new VariablesContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_variables);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(681);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 395136991232L) != 0) {
				{
				{
				setState(678);
				variableDeclaration();
				}
				}
				setState(683);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TreeContext extends ParserRuleContext {
		public WidgetContext widget() {
			return getRuleContext(WidgetContext.class,0);
		}
		public TreeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tree; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitTree(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TreeContext tree() throws RecognitionException {
		TreeContext _localctx = new TreeContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_tree);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(684);
			widget();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatmentContext extends ParserRuleContext {
		public StatmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statment; }
	 
		public StatmentContext() { }
		public void copyFrom(StatmentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclarationStatmentContext extends StatmentContext {
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public VariableDeclarationStatmentContext(StatmentContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitVariableDeclarationStatment(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VariableAssignmentStatmentContext extends StatmentContext {
		public VariableAssignmentContext variableAssignment() {
			return getRuleContext(VariableAssignmentContext.class,0);
		}
		public VariableAssignmentStatmentContext(StatmentContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitVariableAssignmentStatment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatmentContext statment() throws RecognitionException {
		StatmentContext _localctx = new StatmentContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_statment);
		try {
			setState(688);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case STRINGTYPE:
			case DOUBLE:
			case FUNCTION:
				_localctx = new VariableDeclarationStatmentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(686);
				variableDeclaration();
				}
				break;
			case IDENTIFIER:
				_localctx = new VariableAssignmentStatmentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(687);
				variableAssignment();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclarationContext extends ParserRuleContext {
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
	 
		public VariableDeclarationContext() { }
		public void copyFrom(VariableDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NonFunctionVariableDeclarationContext extends VariableDeclarationContext {
		public TerminalNode IDENTIFIER() { return getToken(DartParser.IDENTIFIER, 0); }
		public TerminalNode SC() { return getToken(DartParser.SC, 0); }
		public TerminalNode INT() { return getToken(DartParser.INT, 0); }
		public TerminalNode DOUBLE() { return getToken(DartParser.DOUBLE, 0); }
		public TerminalNode STRINGTYPE() { return getToken(DartParser.STRINGTYPE, 0); }
		public NonFunctionVariableDeclarationContext(VariableDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitNonFunctionVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionVariableDeclarationContext extends VariableDeclarationContext {
		public TerminalNode FUNCTION() { return getToken(DartParser.FUNCTION, 0); }
		public TerminalNode LP() { return getToken(DartParser.LP, 0); }
		public TerminalNode RP() { return getToken(DartParser.RP, 0); }
		public TerminalNode IDENTIFIER() { return getToken(DartParser.IDENTIFIER, 0); }
		public TerminalNode SC() { return getToken(DartParser.SC, 0); }
		public List<TerminalNode> COMMA() { return getTokens(DartParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DartParser.COMMA, i);
		}
		public List<TerminalNode> INT() { return getTokens(DartParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(DartParser.INT, i);
		}
		public List<TerminalNode> DOUBLE() { return getTokens(DartParser.DOUBLE); }
		public TerminalNode DOUBLE(int i) {
			return getToken(DartParser.DOUBLE, i);
		}
		public List<TerminalNode> STRINGTYPE() { return getTokens(DartParser.STRINGTYPE); }
		public TerminalNode STRINGTYPE(int i) {
			return getToken(DartParser.STRINGTYPE, i);
		}
		public FunctionVariableDeclarationContext(VariableDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitFunctionVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_variableDeclaration);
		int _la;
		try {
			setState(705);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case STRINGTYPE:
			case DOUBLE:
				_localctx = new NonFunctionVariableDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(690);
				_la = _input.LA(1);
				if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 120259084288L) != 0) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(691);
				match(IDENTIFIER);
				setState(692);
				match(SC);
				}
				break;
			case FUNCTION:
				_localctx = new FunctionVariableDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(693);
				match(FUNCTION);
				setState(694);
				match(LP);
				setState(699);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((_la) & ~0x3f) == 0 && ((1L << _la) & 120259084288L) != 0) {
					{
					{
					setState(695);
					_la = _input.LA(1);
					if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 120259084288L) != 0) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(696);
					match(COMMA);
					}
					}
					setState(701);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(702);
				match(RP);
				setState(703);
				match(IDENTIFIER);
				setState(704);
				match(SC);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableAssignmentContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(DartParser.IDENTIFIER, 0); }
		public TerminalNode EQL() { return getToken(DartParser.EQL, 0); }
		public TerminalNode SC() { return getToken(DartParser.SC, 0); }
		public TerminalNode NUM() { return getToken(DartParser.NUM, 0); }
		public TerminalNode FLOAT() { return getToken(DartParser.FLOAT, 0); }
		public TerminalNode STRING() { return getToken(DartParser.STRING, 0); }
		public VariableAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableAssignment; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitVariableAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableAssignmentContext variableAssignment() throws RecognitionException {
		VariableAssignmentContext _localctx = new VariableAssignmentContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_variableAssignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(707);
			match(IDENTIFIER);
			setState(708);
			match(EQL);
			setState(709);
			_la = _input.LA(1);
			if ( !((((_la - 98)) & ~0x3f) == 0 && ((1L << (_la - 98)) & 7L) != 0) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(710);
			match(SC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WidthPropertyContext extends ParserRuleContext {
		public TerminalNode WIDTH() { return getToken(DartParser.WIDTH, 0); }
		public TerminalNode COLON() { return getToken(DartParser.COLON, 0); }
		public TerminalNode NUM() { return getToken(DartParser.NUM, 0); }
		public WidthPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_widthProperty; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitWidthProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WidthPropertyContext widthProperty() throws RecognitionException {
		WidthPropertyContext _localctx = new WidthPropertyContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_widthProperty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(712);
			match(WIDTH);
			setState(713);
			match(COLON);
			setState(714);
			match(NUM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HeightPropertyContext extends ParserRuleContext {
		public TerminalNode HEIGHT() { return getToken(DartParser.HEIGHT, 0); }
		public TerminalNode COLON() { return getToken(DartParser.COLON, 0); }
		public TerminalNode NUM() { return getToken(DartParser.NUM, 0); }
		public HeightPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_heightProperty; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitHeightProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeightPropertyContext heightProperty() throws RecognitionException {
		HeightPropertyContext _localctx = new HeightPropertyContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_heightProperty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(716);
			match(HEIGHT);
			setState(717);
			match(COLON);
			setState(718);
			match(NUM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ColorPropertyContext extends ParserRuleContext {
		public TerminalNode COLOR() { return getToken(DartParser.COLOR, 0); }
		public TerminalNode COLON() { return getToken(DartParser.COLON, 0); }
		public TerminalNode HEX_NUM() { return getToken(DartParser.HEX_NUM, 0); }
		public ColorPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colorProperty; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitColorProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColorPropertyContext colorProperty() throws RecognitionException {
		ColorPropertyContext _localctx = new ColorPropertyContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_colorProperty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(720);
			match(COLOR);
			setState(721);
			match(COLON);
			setState(722);
			match(HEX_NUM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ChildPropertyContext extends ParserRuleContext {
		public TerminalNode CHILD() { return getToken(DartParser.CHILD, 0); }
		public TerminalNode COLON() { return getToken(DartParser.COLON, 0); }
		public WidgetContext widget() {
			return getRuleContext(WidgetContext.class,0);
		}
		public ChildPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_childProperty; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitChildProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChildPropertyContext childProperty() throws RecognitionException {
		ChildPropertyContext _localctx = new ChildPropertyContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_childProperty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(724);
			match(CHILD);
			setState(725);
			match(COLON);
			setState(726);
			widget();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ChildrenPropertyContext extends ParserRuleContext {
		public TerminalNode CHILDREN() { return getToken(DartParser.CHILDREN, 0); }
		public TerminalNode COLON() { return getToken(DartParser.COLON, 0); }
		public TerminalNode OA() { return getToken(DartParser.OA, 0); }
		public TerminalNode CA() { return getToken(DartParser.CA, 0); }
		public List<WidgetContext> widget() {
			return getRuleContexts(WidgetContext.class);
		}
		public WidgetContext widget(int i) {
			return getRuleContext(WidgetContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DartParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DartParser.COMMA, i);
		}
		public ChildrenPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_childrenProperty; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitChildrenProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChildrenPropertyContext childrenProperty() throws RecognitionException {
		ChildrenPropertyContext _localctx = new ChildrenPropertyContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_childrenProperty);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(728);
			match(CHILDREN);
			setState(729);
			match(COLON);
			setState(730);
			match(OA);
			setState(736);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 127332352L) != 0 || _la==WIDGETNAME) {
				{
				{
				setState(731);
				widget();
				setState(732);
				match(COMMA);
				}
				}
				setState(738);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(739);
			match(CA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MainAxisSizePropertyContext extends ParserRuleContext {
		public TerminalNode MAINAXISSIZE() { return getToken(DartParser.MAINAXISSIZE, 0); }
		public TerminalNode COLON() { return getToken(DartParser.COLON, 0); }
		public TerminalNode MAX() { return getToken(DartParser.MAX, 0); }
		public TerminalNode MIN() { return getToken(DartParser.MIN, 0); }
		public MainAxisSizePropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainAxisSizeProperty; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitMainAxisSizeProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainAxisSizePropertyContext mainAxisSizeProperty() throws RecognitionException {
		MainAxisSizePropertyContext _localctx = new MainAxisSizePropertyContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_mainAxisSizeProperty);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(741);
			match(MAINAXISSIZE);
			setState(742);
			match(COLON);
			setState(743);
			_la = _input.LA(1);
			if ( !(_la==MAX || _la==MIN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CrossAxisAlignmentPropertyContext extends ParserRuleContext {
		public TerminalNode CROSSAXISALIGNMENT() { return getToken(DartParser.CROSSAXISALIGNMENT, 0); }
		public TerminalNode COLON() { return getToken(DartParser.COLON, 0); }
		public TerminalNode STRETCH() { return getToken(DartParser.STRETCH, 0); }
		public TerminalNode LEFT() { return getToken(DartParser.LEFT, 0); }
		public TerminalNode RIGHT() { return getToken(DartParser.RIGHT, 0); }
		public TerminalNode CENTER() { return getToken(DartParser.CENTER, 0); }
		public CrossAxisAlignmentPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_crossAxisAlignmentProperty; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitCrossAxisAlignmentProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CrossAxisAlignmentPropertyContext crossAxisAlignmentProperty() throws RecognitionException {
		CrossAxisAlignmentPropertyContext _localctx = new CrossAxisAlignmentPropertyContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_crossAxisAlignmentProperty);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(745);
			match(CROSSAXISALIGNMENT);
			setState(746);
			match(COLON);
			setState(747);
			_la = _input.LA(1);
			if ( !(_la==CENTER || _la==STRETCH || _la==LEFT || _la==RIGHT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001f\u02ee\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u00076\u0002"+
		"7\u00077\u0001\u0000\u0005\u0000r\b\u0000\n\u0000\f\u0000u\t\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0005\u0001\u007f\b\u0001\n\u0001\f\u0001\u0082\t\u0001"+
		"\u0001\u0001\u0003\u0001\u0085\b\u0001\u0003\u0001\u0087\b\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0003\u0002\u0091\b\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0005\u0003\u0098\b\u0003\n\u0003\f\u0003"+
		"\u009b\t\u0003\u0001\u0003\u0003\u0003\u009e\b\u0003\u0003\u0003\u00a0"+
		"\b\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u00aa\b\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u00b8"+
		"\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005"+
		"\u0006\u00bf\b\u0006\n\u0006\f\u0006\u00c2\t\u0006\u0001\u0006\u0003\u0006"+
		"\u00c5\b\u0006\u0003\u0006\u00c7\b\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0005\b\u00d4\b\b\n\b\f\b\u00d7\t\b\u0001\b\u0003\b\u00da\b"+
		"\b\u0003\b\u00dc\b\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0003\t\u00e3"+
		"\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u00ea\b\n\n\n\f\n"+
		"\u00ed\t\n\u0001\n\u0003\n\u00f0\b\n\u0003\n\u00f2\b\n\u0001\n\u0001\n"+
		"\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0005"+
		"\f\u00fd\b\f\n\f\f\f\u0100\t\f\u0001\f\u0003\f\u0103\b\f\u0003\f\u0105"+
		"\b\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0003\r\u010c\b\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u0113\b\u000e"+
		"\n\u000e\f\u000e\u0116\t\u000e\u0001\u000e\u0003\u000e\u0119\b\u000e\u0003"+
		"\u000e\u011b\b\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0003\u000f\u012e\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0005\u0010\u0135\b\u0010\n\u0010\f\u0010\u0138\t\u0010"+
		"\u0001\u0010\u0003\u0010\u013b\b\u0010\u0003\u0010\u013d\b\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u014a"+
		"\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0005"+
		"\u0012\u0151\b\u0012\n\u0012\f\u0012\u0154\t\u0012\u0001\u0012\u0003\u0012"+
		"\u0157\b\u0012\u0003\u0012\u0159\b\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u0161\b\u0013\u0001"+
		"\u0014\u0001\u0014\u0003\u0014\u0165\b\u0014\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0003\u0015\u016b\b\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0005\u0016\u0174"+
		"\b\u0016\n\u0016\f\u0016\u0177\t\u0016\u0001\u0016\u0003\u0016\u017a\b"+
		"\u0016\u0003\u0016\u017c\b\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u0190\b\u0018\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0005\u0019\u0197\b\u0019\n"+
		"\u0019\f\u0019\u019a\t\u0019\u0001\u0019\u0003\u0019\u019d\b\u0019\u0003"+
		"\u0019\u019f\b\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0003\u001a\u01a7\b\u001a\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0005\u001b\u01ae\b\u001b\n\u001b\f\u001b"+
		"\u01b1\t\u001b\u0001\u001b\u0003\u001b\u01b4\b\u001b\u0003\u001b\u01b6"+
		"\b\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0005\u001d\u01c1\b\u001d\n"+
		"\u001d\f\u001d\u01c4\t\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0005"+
		"\u001d\u01c9\b\u001d\n\u001d\f\u001d\u01cc\t\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0005\u001e"+
		"\u01d5\b\u001e\n\u001e\f\u001e\u01d8\t\u001e\u0001\u001e\u0003\u001e\u01db"+
		"\b\u001e\u0003\u001e\u01dd\b\u001e\u0001\u001e\u0001\u001e\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u01e5\b\u001f\u0001 "+
		"\u0001 \u0001 \u0001 \u0001 \u0005 \u01ec\b \n \f \u01ef\t \u0001 \u0003"+
		" \u01f2\b \u0003 \u01f4\b \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0005"+
		" \u01fc\b \n \f \u01ff\t \u0001 \u0003 \u0202\b \u0003 \u0204\b \u0001"+
		" \u0003 \u0207\b \u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001"+
		"!\u0001!\u0001!\u0001!\u0001!\u0003!\u0215\b!\u0001\"\u0001\"\u0001\""+
		"\u0001\"\u0001\"\u0001\"\u0003\"\u021d\b\"\u0001#\u0001#\u0001#\u0001"+
		"#\u0001#\u0005#\u0224\b#\n#\f#\u0227\t#\u0001#\u0003#\u022a\b#\u0003#"+
		"\u022c\b#\u0001#\u0001#\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0003$\u0238\b$\u0001%\u0001%\u0001%\u0001%\u0001%\u0005%\u023f"+
		"\b%\n%\f%\u0242\t%\u0001%\u0003%\u0245\b%\u0003%\u0247\b%\u0001%\u0001"+
		"%\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0003&\u0259\b&\u0001\'\u0001\'\u0001\'"+
		"\u0001\'\u0001\'\u0005\'\u0260\b\'\n\'\f\'\u0263\t\'\u0001\'\u0003\'\u0266"+
		"\b\'\u0003\'\u0268\b\'\u0001\'\u0001\'\u0001(\u0001(\u0001(\u0001(\u0001"+
		"(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001"+
		"(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0003(\u0281\b(\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0005)\u0288\b)\n)\f)\u028b\t)\u0001)\u0003)\u028e"+
		"\b)\u0003)\u0290\b)\u0001)\u0001)\u0001*\u0001*\u0001*\u0001*\u0001*\u0001"+
		"*\u0001*\u0003*\u029b\b*\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001"+
		"+\u0001+\u0001+\u0001+\u0001,\u0005,\u02a8\b,\n,\f,\u02ab\t,\u0001-\u0001"+
		"-\u0001.\u0001.\u0003.\u02b1\b.\u0001/\u0001/\u0001/\u0001/\u0001/\u0001"+
		"/\u0001/\u0005/\u02ba\b/\n/\f/\u02bd\t/\u0001/\u0001/\u0001/\u0003/\u02c2"+
		"\b/\u00010\u00010\u00010\u00010\u00010\u00011\u00011\u00011\u00011\u0001"+
		"2\u00012\u00012\u00012\u00013\u00013\u00013\u00013\u00014\u00014\u0001"+
		"4\u00014\u00015\u00015\u00015\u00015\u00015\u00015\u00055\u02df\b5\n5"+
		"\f5\u02e2\t5\u00015\u00015\u00016\u00016\u00016\u00016\u00017\u00017\u0001"+
		"7\u00017\u00017\u0000\u00008\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPR"+
		"TVXZ\\^`bdfhjln\u0000\t\u0001\u0000cd\u0002\u0000,,QS\u0002\u000000MO"+
		"\u0003\u000000]]__\u0001\u0000GH\u0001\u0000\"$\u0001\u0000bd\u0001\u0000"+
		"34\u0004\u0000\r\r66]]__\u032c\u0000s\u0001\u0000\u0000\u0000\u0002y\u0001"+
		"\u0000\u0000\u0000\u0004\u0090\u0001\u0000\u0000\u0000\u0006\u0092\u0001"+
		"\u0000\u0000\u0000\b\u00a9\u0001\u0000\u0000\u0000\n\u00b7\u0001\u0000"+
		"\u0000\u0000\f\u00b9\u0001\u0000\u0000\u0000\u000e\u00ca\u0001\u0000\u0000"+
		"\u0000\u0010\u00ce\u0001\u0000\u0000\u0000\u0012\u00e2\u0001\u0000\u0000"+
		"\u0000\u0014\u00e4\u0001\u0000\u0000\u0000\u0016\u00f5\u0001\u0000\u0000"+
		"\u0000\u0018\u00f7\u0001\u0000\u0000\u0000\u001a\u010b\u0001\u0000\u0000"+
		"\u0000\u001c\u010d\u0001\u0000\u0000\u0000\u001e\u012d\u0001\u0000\u0000"+
		"\u0000 \u012f\u0001\u0000\u0000\u0000\"\u0149\u0001\u0000\u0000\u0000"+
		"$\u014b\u0001\u0000\u0000\u0000&\u0160\u0001\u0000\u0000\u0000(\u0164"+
		"\u0001\u0000\u0000\u0000*\u0166\u0001\u0000\u0000\u0000,\u016e\u0001\u0000"+
		"\u0000\u0000.\u017f\u0001\u0000\u0000\u00000\u018f\u0001\u0000\u0000\u0000"+
		"2\u0191\u0001\u0000\u0000\u00004\u01a6\u0001\u0000\u0000\u00006\u01a8"+
		"\u0001\u0000\u0000\u00008\u01b9\u0001\u0000\u0000\u0000:\u01bd\u0001\u0000"+
		"\u0000\u0000<\u01cf\u0001\u0000\u0000\u0000>\u01e4\u0001\u0000\u0000\u0000"+
		"@\u0206\u0001\u0000\u0000\u0000B\u0214\u0001\u0000\u0000\u0000D\u021c"+
		"\u0001\u0000\u0000\u0000F\u021e\u0001\u0000\u0000\u0000H\u0237\u0001\u0000"+
		"\u0000\u0000J\u0239\u0001\u0000\u0000\u0000L\u0258\u0001\u0000\u0000\u0000"+
		"N\u025a\u0001\u0000\u0000\u0000P\u0280\u0001\u0000\u0000\u0000R\u0282"+
		"\u0001\u0000\u0000\u0000T\u029a\u0001\u0000\u0000\u0000V\u029c\u0001\u0000"+
		"\u0000\u0000X\u02a9\u0001\u0000\u0000\u0000Z\u02ac\u0001\u0000\u0000\u0000"+
		"\\\u02b0\u0001\u0000\u0000\u0000^\u02c1\u0001\u0000\u0000\u0000`\u02c3"+
		"\u0001\u0000\u0000\u0000b\u02c8\u0001\u0000\u0000\u0000d\u02cc\u0001\u0000"+
		"\u0000\u0000f\u02d0\u0001\u0000\u0000\u0000h\u02d4\u0001\u0000\u0000\u0000"+
		"j\u02d8\u0001\u0000\u0000\u0000l\u02e5\u0001\u0000\u0000\u0000n\u02e9"+
		"\u0001\u0000\u0000\u0000pr\u0003V+\u0000qp\u0001\u0000\u0000\u0000ru\u0001"+
		"\u0000\u0000\u0000sq\u0001\u0000\u0000\u0000st\u0001\u0000\u0000\u0000"+
		"tv\u0001\u0000\u0000\u0000us\u0001\u0000\u0000\u0000vw\u0003\u0002\u0001"+
		"\u0000wx\u0005\u0000\u0000\u0001x\u0001\u0001\u0000\u0000\u0000yz\u0005"+
		"\u000b\u0000\u0000z\u0086\u0005\u0001\u0000\u0000{\u0080\u0003\u0004\u0002"+
		"\u0000|}\u0005\t\u0000\u0000}\u007f\u0003\u0004\u0002\u0000~|\u0001\u0000"+
		"\u0000\u0000\u007f\u0082\u0001\u0000\u0000\u0000\u0080~\u0001\u0000\u0000"+
		"\u0000\u0080\u0081\u0001\u0000\u0000\u0000\u0081\u0084\u0001\u0000\u0000"+
		"\u0000\u0082\u0080\u0001\u0000\u0000\u0000\u0083\u0085\u0005\t\u0000\u0000"+
		"\u0084\u0083\u0001\u0000\u0000\u0000\u0084\u0085\u0001\u0000\u0000\u0000"+
		"\u0085\u0087\u0001\u0000\u0000\u0000\u0086{\u0001\u0000\u0000\u0000\u0086"+
		"\u0087\u0001\u0000\u0000\u0000\u0087\u0088\u0001\u0000\u0000\u0000\u0088"+
		"\u0089\u0005\u0002\u0000\u0000\u0089\u0003\u0001\u0000\u0000\u0000\u008a"+
		"\u008b\u0005\u001f\u0000\u0000\u008b\u008c\u0005\u0003\u0000\u0000\u008c"+
		"\u0091\u0003\n\u0005\u0000\u008d\u008e\u0005(\u0000\u0000\u008e\u008f"+
		"\u0005\u0003\u0000\u0000\u008f\u0091\u0003\u0006\u0003\u0000\u0090\u008a"+
		"\u0001\u0000\u0000\u0000\u0090\u008d\u0001\u0000\u0000\u0000\u0091\u0005"+
		"\u0001\u0000\u0000\u0000\u0092\u0093\u0005\u0010\u0000\u0000\u0093\u009f"+
		"\u0005\u0001\u0000\u0000\u0094\u0099\u0003\b\u0004\u0000\u0095\u0096\u0005"+
		"\t\u0000\u0000\u0096\u0098\u0003\b\u0004\u0000\u0097\u0095\u0001\u0000"+
		"\u0000\u0000\u0098\u009b\u0001\u0000\u0000\u0000\u0099\u0097\u0001\u0000"+
		"\u0000\u0000\u0099\u009a\u0001\u0000\u0000\u0000\u009a\u009d\u0001\u0000"+
		"\u0000\u0000\u009b\u0099\u0001\u0000\u0000\u0000\u009c\u009e\u0005\t\u0000"+
		"\u0000\u009d\u009c\u0001\u0000\u0000\u0000\u009d\u009e\u0001\u0000\u0000"+
		"\u0000\u009e\u00a0\u0001\u0000\u0000\u0000\u009f\u0094\u0001\u0000\u0000"+
		"\u0000\u009f\u00a0\u0001\u0000\u0000\u0000\u00a0\u00a1\u0001\u0000\u0000"+
		"\u0000\u00a1\u00a2\u0005\u0002\u0000\u0000\u00a2\u0007\u0001\u0000\u0000"+
		"\u0000\u00a3\u00a4\u0005D\u0000\u0000\u00a4\u00a5\u0005\u0003\u0000\u0000"+
		"\u00a5\u00aa\u0005d\u0000\u0000\u00a6\u00a7\u0005J\u0000\u0000\u00a7\u00a8"+
		"\u0005\u0003\u0000\u0000\u00a8\u00aa\u0005I\u0000\u0000\u00a9\u00a3\u0001"+
		"\u0000\u0000\u0000\u00a9\u00a6\u0001\u0000\u0000\u0000\u00aa\t\u0001\u0000"+
		"\u0000\u0000\u00ab\u00b8\u0003\u0010\b\u0000\u00ac\u00b8\u0003\u0014\n"+
		"\u0000\u00ad\u00b8\u0003\u001c\u000e\u0000\u00ae\u00b8\u0003 \u0010\u0000"+
		"\u00af\u00b8\u00032\u0019\u0000\u00b0\u00b8\u0003\u0018\f\u0000\u00b1"+
		"\u00b8\u00036\u001b\u0000\u00b2\u00b8\u0003<\u001e\u0000\u00b3\u00b8\u0003"+
		"F#\u0000\u00b4\u00b8\u0003J%\u0000\u00b5\u00b8\u0003\f\u0006\u0000\u00b6"+
		"\u00b8\u0003N\'\u0000\u00b7\u00ab\u0001\u0000\u0000\u0000\u00b7\u00ac"+
		"\u0001\u0000\u0000\u0000\u00b7\u00ad\u0001\u0000\u0000\u0000\u00b7\u00ae"+
		"\u0001\u0000\u0000\u0000\u00b7\u00af\u0001\u0000\u0000\u0000\u00b7\u00b0"+
		"\u0001\u0000\u0000\u0000\u00b7\u00b1\u0001\u0000\u0000\u0000\u00b7\u00b2"+
		"\u0001\u0000\u0000\u0000\u00b7\u00b3\u0001\u0000\u0000\u0000\u00b7\u00b4"+
		"\u0001\u0000\u0000\u0000\u00b7\u00b5\u0001\u0000\u0000\u0000\u00b7\u00b6"+
		"\u0001\u0000\u0000\u0000\u00b8\u000b\u0001\u0000\u0000\u0000\u00b9\u00ba"+
		"\u0005`\u0000\u0000\u00ba\u00c6\u0005\u0001\u0000\u0000\u00bb\u00c0\u0003"+
		"\u000e\u0007\u0000\u00bc\u00bd\u0005\t\u0000\u0000\u00bd\u00bf\u0003\u000e"+
		"\u0007\u0000\u00be\u00bc\u0001\u0000\u0000\u0000\u00bf\u00c2\u0001\u0000"+
		"\u0000\u0000\u00c0\u00be\u0001\u0000\u0000\u0000\u00c0\u00c1\u0001\u0000"+
		"\u0000\u0000\u00c1\u00c4\u0001\u0000\u0000\u0000\u00c2\u00c0\u0001\u0000"+
		"\u0000\u0000\u00c3\u00c5\u0005\t\u0000\u0000\u00c4\u00c3\u0001\u0000\u0000"+
		"\u0000\u00c4\u00c5\u0001\u0000\u0000\u0000\u00c5\u00c7\u0001\u0000\u0000"+
		"\u0000\u00c6\u00bb\u0001\u0000\u0000\u0000\u00c6\u00c7\u0001\u0000\u0000"+
		"\u0000\u00c7\u00c8\u0001\u0000\u0000\u0000\u00c8\u00c9\u0005\u0002\u0000"+
		"\u0000\u00c9\r\u0001\u0000\u0000\u0000\u00ca\u00cb\u0005a\u0000\u0000"+
		"\u00cb\u00cc\u0005\u0003\u0000\u0000\u00cc\u00cd\u0007\u0000\u0000\u0000"+
		"\u00cd\u000f\u0001\u0000\u0000\u0000\u00ce\u00cf\u0005\f\u0000\u0000\u00cf"+
		"\u00db\u0005\u0001\u0000\u0000\u00d0\u00d5\u0003\u0012\t\u0000\u00d1\u00d2"+
		"\u0005\t\u0000\u0000\u00d2\u00d4\u0003\u0012\t\u0000\u00d3\u00d1\u0001"+
		"\u0000\u0000\u0000\u00d4\u00d7\u0001\u0000\u0000\u0000\u00d5\u00d3\u0001"+
		"\u0000\u0000\u0000\u00d5\u00d6\u0001\u0000\u0000\u0000\u00d6\u00d9\u0001"+
		"\u0000\u0000\u0000\u00d7\u00d5\u0001\u0000\u0000\u0000\u00d8\u00da\u0005"+
		"\t\u0000\u0000\u00d9\u00d8\u0001\u0000\u0000\u0000\u00d9\u00da\u0001\u0000"+
		"\u0000\u0000\u00da\u00dc\u0001\u0000\u0000\u0000\u00db\u00d0\u0001\u0000"+
		"\u0000\u0000\u00db\u00dc\u0001\u0000\u0000\u0000\u00dc\u00dd\u0001\u0000"+
		"\u0000\u0000\u00dd\u00de\u0005\u0002\u0000\u0000\u00de\u0011\u0001\u0000"+
		"\u0000\u0000\u00df\u00e3\u0003j5\u0000\u00e0\u00e3\u0003l6\u0000\u00e1"+
		"\u00e3\u0003n7\u0000\u00e2\u00df\u0001\u0000\u0000\u0000\u00e2\u00e0\u0001"+
		"\u0000\u0000\u0000\u00e2\u00e1\u0001\u0000\u0000\u0000\u00e3\u0013\u0001"+
		"\u0000\u0000\u0000\u00e4\u00e5\u0005\r\u0000\u0000\u00e5\u00f1\u0005\u0001"+
		"\u0000\u0000\u00e6\u00eb\u0003\u0016\u000b\u0000\u00e7\u00e8\u0005\t\u0000"+
		"\u0000\u00e8\u00ea\u0003\u0016\u000b\u0000\u00e9\u00e7\u0001\u0000\u0000"+
		"\u0000\u00ea\u00ed\u0001\u0000\u0000\u0000\u00eb\u00e9\u0001\u0000\u0000"+
		"\u0000\u00eb\u00ec\u0001\u0000\u0000\u0000\u00ec\u00ef\u0001\u0000\u0000"+
		"\u0000\u00ed\u00eb\u0001\u0000\u0000\u0000\u00ee\u00f0\u0005\t\u0000\u0000"+
		"\u00ef\u00ee\u0001\u0000\u0000\u0000\u00ef\u00f0\u0001\u0000\u0000\u0000"+
		"\u00f0\u00f2\u0001\u0000\u0000\u0000\u00f1\u00e6\u0001\u0000\u0000\u0000"+
		"\u00f1\u00f2\u0001\u0000\u0000\u0000\u00f2\u00f3\u0001\u0000\u0000\u0000"+
		"\u00f3\u00f4\u0005\u0002\u0000\u0000\u00f4\u0015\u0001\u0000\u0000\u0000"+
		"\u00f5\u00f6\u0003h4\u0000\u00f6\u0017\u0001\u0000\u0000\u0000\u00f7\u00f8"+
		"\u0005\u000e\u0000\u0000\u00f8\u0104\u0005\u0001\u0000\u0000\u00f9\u00fe"+
		"\u0003\u001a\r\u0000\u00fa\u00fb\u0005\t\u0000\u0000\u00fb\u00fd\u0003"+
		"\u001a\r\u0000\u00fc\u00fa\u0001\u0000\u0000\u0000\u00fd\u0100\u0001\u0000"+
		"\u0000\u0000\u00fe\u00fc\u0001\u0000\u0000\u0000\u00fe\u00ff\u0001\u0000"+
		"\u0000\u0000\u00ff\u0102\u0001\u0000\u0000\u0000\u0100\u00fe\u0001\u0000"+
		"\u0000\u0000\u0101\u0103\u0005\t\u0000\u0000\u0102\u0101\u0001\u0000\u0000"+
		"\u0000\u0102\u0103\u0001\u0000\u0000\u0000\u0103\u0105\u0001\u0000\u0000"+
		"\u0000\u0104\u00f9\u0001\u0000\u0000\u0000\u0104\u0105\u0001\u0000\u0000"+
		"\u0000\u0105\u0106\u0001\u0000\u0000\u0000\u0106\u0107\u0005\u0002\u0000"+
		"\u0000\u0107\u0019\u0001\u0000\u0000\u0000\u0108\u010c\u0003j5\u0000\u0109"+
		"\u010c\u0003l6\u0000\u010a\u010c\u0003n7\u0000\u010b\u0108\u0001\u0000"+
		"\u0000\u0000\u010b\u0109\u0001\u0000\u0000\u0000\u010b\u010a\u0001\u0000"+
		"\u0000\u0000\u010c\u001b\u0001\u0000\u0000\u0000\u010d\u010e\u0005\u000f"+
		"\u0000\u0000\u010e\u011a\u0005\u0001\u0000\u0000\u010f\u0114\u0003\u001e"+
		"\u000f\u0000\u0110\u0111\u0005\t\u0000\u0000\u0111\u0113\u0003\u001e\u000f"+
		"\u0000\u0112\u0110\u0001\u0000\u0000\u0000\u0113\u0116\u0001\u0000\u0000"+
		"\u0000\u0114\u0112\u0001\u0000\u0000\u0000\u0114\u0115\u0001\u0000\u0000"+
		"\u0000\u0115\u0118\u0001\u0000\u0000\u0000\u0116\u0114\u0001\u0000\u0000"+
		"\u0000\u0117\u0119\u0005\t\u0000\u0000\u0118\u0117\u0001\u0000\u0000\u0000"+
		"\u0118\u0119\u0001\u0000\u0000\u0000\u0119\u011b\u0001\u0000\u0000\u0000"+
		"\u011a\u010f\u0001\u0000\u0000\u0000\u011a\u011b\u0001\u0000\u0000\u0000"+
		"\u011b\u011c\u0001\u0000\u0000\u0000\u011c\u011d\u0005\u0002\u0000\u0000"+
		"\u011d\u001d\u0001\u0000\u0000\u0000\u011e\u011f\u0005\'\u0000\u0000\u011f"+
		"\u0120\u0005\u0003\u0000\u0000\u0120\u012e\u0005d\u0000\u0000\u0121\u0122"+
		"\u0005)\u0000\u0000\u0122\u0123\u0005\u0003\u0000\u0000\u0123\u012e\u0007"+
		"\u0001\u0000\u0000\u0124\u0125\u0005*\u0000\u0000\u0125\u0126\u0005\u0003"+
		"\u0000\u0000\u0126\u012e\u0005c\u0000\u0000\u0127\u0128\u0005+\u0000\u0000"+
		"\u0128\u0129\u0005\u0003\u0000\u0000\u0129\u012e\u0005c\u0000\u0000\u012a"+
		"\u012b\u0005K\u0000\u0000\u012b\u012c\u0005\u0003\u0000\u0000\u012c\u012e"+
		"\u0007\u0002\u0000\u0000\u012d\u011e\u0001\u0000\u0000\u0000\u012d\u0121"+
		"\u0001\u0000\u0000\u0000\u012d\u0124\u0001\u0000\u0000\u0000\u012d\u0127"+
		"\u0001\u0000\u0000\u0000\u012d\u012a\u0001\u0000\u0000\u0000\u012e\u001f"+
		"\u0001\u0000\u0000\u0000\u012f\u0130\u0005\u0011\u0000\u0000\u0130\u013c"+
		"\u0005\u0001\u0000\u0000\u0131\u0136\u0003\"\u0011\u0000\u0132\u0133\u0005"+
		"\t\u0000\u0000\u0133\u0135\u0003\"\u0011\u0000\u0134\u0132\u0001\u0000"+
		"\u0000\u0000\u0135\u0138\u0001\u0000\u0000\u0000\u0136\u0134\u0001\u0000"+
		"\u0000\u0000\u0136\u0137\u0001\u0000\u0000\u0000\u0137\u013a\u0001\u0000"+
		"\u0000\u0000\u0138\u0136\u0001\u0000\u0000\u0000\u0139\u013b\u0005\t\u0000"+
		"\u0000\u013a\u0139\u0001\u0000\u0000\u0000\u013a\u013b\u0001\u0000\u0000"+
		"\u0000\u013b\u013d\u0001\u0000\u0000\u0000\u013c\u0131\u0001\u0000\u0000"+
		"\u0000\u013c\u013d\u0001\u0000\u0000\u0000\u013d\u013e\u0001\u0000\u0000"+
		"\u0000\u013e\u013f\u0005\u0002\u0000\u0000\u013f!\u0001\u0000\u0000\u0000"+
		"\u0140\u014a\u0003b1\u0000\u0141\u014a\u0003d2\u0000\u0142\u0143\u0005"+
		"/\u0000\u0000\u0143\u0144\u0005\u0003\u0000\u0000\u0144\u014a\u0007\u0003"+
		"\u0000\u0000\u0145\u014a\u0003h4\u0000\u0146\u0147\u00057\u0000\u0000"+
		"\u0147\u0148\u0005\u0003\u0000\u0000\u0148\u014a\u0003$\u0012\u0000\u0149"+
		"\u0140\u0001\u0000\u0000\u0000\u0149\u0141\u0001\u0000\u0000\u0000\u0149"+
		"\u0142\u0001\u0000\u0000\u0000\u0149\u0145\u0001\u0000\u0000\u0000\u0149"+
		"\u0146\u0001\u0000\u0000\u0000\u014a#\u0001\u0000\u0000\u0000\u014b\u014c"+
		"\u0005\u0013\u0000\u0000\u014c\u0158\u0005\u0001\u0000\u0000\u014d\u0152"+
		"\u0003&\u0013\u0000\u014e\u014f\u0005\t\u0000\u0000\u014f\u0151\u0003"+
		"&\u0013\u0000\u0150\u014e\u0001\u0000\u0000\u0000\u0151\u0154\u0001\u0000"+
		"\u0000\u0000\u0152\u0150\u0001\u0000\u0000\u0000\u0152\u0153\u0001\u0000"+
		"\u0000\u0000\u0153\u0156\u0001\u0000\u0000\u0000\u0154\u0152\u0001\u0000"+
		"\u0000\u0000\u0155\u0157\u0005\t\u0000\u0000\u0156\u0155\u0001\u0000\u0000"+
		"\u0000\u0156\u0157\u0001\u0000\u0000\u0000\u0157\u0159\u0001\u0000\u0000"+
		"\u0000\u0158\u014d\u0001\u0000\u0000\u0000\u0158\u0159\u0001\u0000\u0000"+
		"\u0000\u0159\u015a\u0001\u0000\u0000\u0000\u015a\u015b\u0005\u0002\u0000"+
		"\u0000\u015b%\u0001\u0000\u0000\u0000\u015c\u0161\u0003f3\u0000\u015d"+
		"\u015e\u00059\u0000\u0000\u015e\u015f\u0005\u0003\u0000\u0000\u015f\u0161"+
		"\u0003(\u0014\u0000\u0160\u015c\u0001\u0000\u0000\u0000\u0160\u015d\u0001"+
		"\u0000\u0000\u0000\u0161\'\u0001\u0000\u0000\u0000\u0162\u0165\u0003,"+
		"\u0016\u0000\u0163\u0165\u0003*\u0015\u0000\u0164\u0162\u0001\u0000\u0000"+
		"\u0000\u0164\u0163\u0001\u0000\u0000\u0000\u0165)\u0001\u0000\u0000\u0000"+
		"\u0166\u0167\u0005\u001d\u0000\u0000\u0167\u0168\u0005\u0001\u0000\u0000"+
		"\u0168\u016a\u0003.\u0017\u0000\u0169\u016b\u0005\t\u0000\u0000\u016a"+
		"\u0169\u0001\u0000\u0000\u0000\u016a\u016b\u0001\u0000\u0000\u0000\u016b"+
		"\u016c\u0001\u0000\u0000\u0000\u016c\u016d\u0005\u0002\u0000\u0000\u016d"+
		"+\u0001\u0000\u0000\u0000\u016e\u016f\u0005\u001c\u0000\u0000\u016f\u017b"+
		"\u0005\u0001\u0000\u0000\u0170\u0175\u00030\u0018\u0000\u0171\u0172\u0005"+
		"\t\u0000\u0000\u0172\u0174\u00030\u0018\u0000\u0173\u0171\u0001\u0000"+
		"\u0000\u0000\u0174\u0177\u0001\u0000\u0000\u0000\u0175\u0173\u0001\u0000"+
		"\u0000\u0000\u0175\u0176\u0001\u0000\u0000\u0000\u0176\u0179\u0001\u0000"+
		"\u0000\u0000\u0177\u0175\u0001\u0000\u0000\u0000\u0178\u017a\u0005\t\u0000"+
		"\u0000\u0179\u0178\u0001\u0000\u0000\u0000\u0179\u017a\u0001\u0000\u0000"+
		"\u0000\u017a\u017c\u0001\u0000\u0000\u0000\u017b\u0170\u0001\u0000\u0000"+
		"\u0000\u017b\u017c\u0001\u0000\u0000\u0000\u017c\u017d\u0001\u0000\u0000"+
		"\u0000\u017d\u017e\u0005\u0002\u0000\u0000\u017e-\u0001\u0000\u0000\u0000"+
		"\u017f\u0180\u0005Z\u0000\u0000\u0180\u0181\u0005\u0003\u0000\u0000\u0181"+
		"\u0182\u0005c\u0000\u0000\u0182/\u0001\u0000\u0000\u0000\u0183\u0184\u0005"+
		"<\u0000\u0000\u0184\u0185\u0005\u0003\u0000\u0000\u0185\u0190\u0005c\u0000"+
		"\u0000\u0186\u0187\u0005=\u0000\u0000\u0187\u0188\u0005\u0003\u0000\u0000"+
		"\u0188\u0190\u0005c\u0000\u0000\u0189\u018a\u0005>\u0000\u0000\u018a\u018b"+
		"\u0005\u0003\u0000\u0000\u018b\u0190\u0005c\u0000\u0000\u018c\u018d\u0005"+
		"?\u0000\u0000\u018d\u018e\u0005\u0003\u0000\u0000\u018e\u0190\u0005c\u0000"+
		"\u0000\u018f\u0183\u0001\u0000\u0000\u0000\u018f\u0186\u0001\u0000\u0000"+
		"\u0000\u018f\u0189\u0001\u0000\u0000\u0000\u018f\u018c\u0001\u0000\u0000"+
		"\u0000\u01901\u0001\u0000\u0000\u0000\u0191\u0192\u0005\u0012\u0000\u0000"+
		"\u0192\u019e\u0005\u0001\u0000\u0000\u0193\u0198\u00034\u001a\u0000\u0194"+
		"\u0195\u0005\t\u0000\u0000\u0195\u0197\u00034\u001a\u0000\u0196\u0194"+
		"\u0001\u0000\u0000\u0000\u0197\u019a\u0001\u0000\u0000\u0000\u0198\u0196"+
		"\u0001\u0000\u0000\u0000\u0198\u0199\u0001\u0000\u0000\u0000\u0199\u019c"+
		"\u0001\u0000\u0000\u0000\u019a\u0198\u0001\u0000\u0000\u0000\u019b\u019d"+
		"\u0005\t\u0000\u0000\u019c\u019b\u0001\u0000\u0000\u0000\u019c\u019d\u0001"+
		"\u0000\u0000\u0000\u019d\u019f\u0001\u0000\u0000\u0000\u019e\u0193\u0001"+
		"\u0000\u0000\u0000\u019e\u019f\u0001\u0000\u0000\u0000\u019f\u01a0\u0001"+
		"\u0000\u0000\u0000\u01a0\u01a1\u0005\u0002\u0000\u0000\u01a13\u0001\u0000"+
		"\u0000\u0000\u01a2\u01a3\u00051\u0000\u0000\u01a3\u01a4\u0005\u0003\u0000"+
		"\u0000\u01a4\u01a7\u0005c\u0000\u0000\u01a5\u01a7\u0003h4\u0000\u01a6"+
		"\u01a2\u0001\u0000\u0000\u0000\u01a6\u01a5\u0001\u0000\u0000\u0000\u01a7"+
		"5\u0001\u0000\u0000\u0000\u01a8\u01a9\u0005\u0019\u0000\u0000\u01a9\u01b5"+
		"\u0005\u0001\u0000\u0000\u01aa\u01af\u00038\u001c\u0000\u01ab\u01ac\u0005"+
		"\t\u0000\u0000\u01ac\u01ae\u00038\u001c\u0000\u01ad\u01ab\u0001\u0000"+
		"\u0000\u0000\u01ae\u01b1\u0001\u0000\u0000\u0000\u01af\u01ad\u0001\u0000"+
		"\u0000\u0000\u01af\u01b0\u0001\u0000\u0000\u0000\u01b0\u01b3\u0001\u0000"+
		"\u0000\u0000\u01b1\u01af\u0001\u0000\u0000\u0000\u01b2\u01b4\u0005\t\u0000"+
		"\u0000\u01b3\u01b2\u0001\u0000\u0000\u0000\u01b3\u01b4\u0001\u0000\u0000"+
		"\u0000\u01b4\u01b6\u0001\u0000\u0000\u0000\u01b5\u01aa\u0001\u0000\u0000"+
		"\u0000\u01b5\u01b6\u0001\u0000\u0000\u0000\u01b6\u01b7\u0001\u0000\u0000"+
		"\u0000\u01b7\u01b8\u0005\u0002\u0000\u0000\u01b87\u0001\u0000\u0000\u0000"+
		"\u01b9\u01ba\u0005L\u0000\u0000\u01ba\u01bb\u0005\u0003\u0000\u0000\u01bb"+
		"\u01bc\u0003:\u001d\u0000\u01bc9\u0001\u0000\u0000\u0000\u01bd\u01c2\u0005"+
		"\u0001\u0000\u0000\u01be\u01bf\u0005a\u0000\u0000\u01bf\u01c1\u0005\t"+
		"\u0000\u0000\u01c0\u01be\u0001\u0000\u0000\u0000\u01c1\u01c4\u0001\u0000"+
		"\u0000\u0000\u01c2\u01c0\u0001\u0000\u0000\u0000\u01c2\u01c3\u0001\u0000"+
		"\u0000\u0000\u01c3\u01c5\u0001\u0000\u0000\u0000\u01c4\u01c2\u0001\u0000"+
		"\u0000\u0000\u01c5\u01c6\u0005\u0002\u0000\u0000\u01c6\u01ca\u0005\u0006"+
		"\u0000\u0000\u01c7\u01c9\u0003\\.\u0000\u01c8\u01c7\u0001\u0000\u0000"+
		"\u0000\u01c9\u01cc\u0001\u0000\u0000\u0000\u01ca\u01c8\u0001\u0000\u0000"+
		"\u0000\u01ca\u01cb\u0001\u0000\u0000\u0000\u01cb\u01cd\u0001\u0000\u0000"+
		"\u0000\u01cc\u01ca\u0001\u0000\u0000\u0000\u01cd\u01ce\u0005\u0007\u0000"+
		"\u0000\u01ce;\u0001\u0000\u0000\u0000\u01cf\u01d0\u0005\u0014\u0000\u0000"+
		"\u01d0\u01dc\u0005\u0001\u0000\u0000\u01d1\u01d6\u0003>\u001f\u0000\u01d2"+
		"\u01d3\u0005\t\u0000\u0000\u01d3\u01d5\u0003>\u001f\u0000\u01d4\u01d2"+
		"\u0001\u0000\u0000\u0000\u01d5\u01d8\u0001\u0000\u0000\u0000\u01d6\u01d4"+
		"\u0001\u0000\u0000\u0000\u01d6\u01d7\u0001\u0000\u0000\u0000\u01d7\u01da"+
		"\u0001\u0000\u0000\u0000\u01d8\u01d6\u0001\u0000\u0000\u0000\u01d9\u01db"+
		"\u0005\t\u0000\u0000\u01da\u01d9\u0001\u0000\u0000\u0000\u01da\u01db\u0001"+
		"\u0000\u0000\u0000\u01db\u01dd\u0001\u0000\u0000\u0000\u01dc\u01d1\u0001"+
		"\u0000\u0000\u0000\u01dc\u01dd\u0001\u0000\u0000\u0000\u01dd\u01de\u0001"+
		"\u0000\u0000\u0000\u01de\u01df\u0005\u0002\u0000\u0000\u01df=\u0001\u0000"+
		"\u0000\u0000\u01e0\u01e1\u0005;\u0000\u0000\u01e1\u01e2\u0005\u0003\u0000"+
		"\u0000\u01e2\u01e5\u0003@ \u0000\u01e3\u01e5\u0003h4\u0000\u01e4\u01e0"+
		"\u0001\u0000\u0000\u0000\u01e4\u01e3\u0001\u0000\u0000\u0000\u01e5?\u0001"+
		"\u0000\u0000\u0000\u01e6\u01e7\u0005\u0015\u0000\u0000\u01e7\u01f3\u0005"+
		"\u0001\u0000\u0000\u01e8\u01ed\u0003B!\u0000\u01e9\u01ea\u0005\t\u0000"+
		"\u0000\u01ea\u01ec\u0003B!\u0000\u01eb\u01e9\u0001\u0000\u0000\u0000\u01ec"+
		"\u01ef\u0001\u0000\u0000\u0000\u01ed\u01eb\u0001\u0000\u0000\u0000\u01ed"+
		"\u01ee\u0001\u0000\u0000\u0000\u01ee\u01f1\u0001\u0000\u0000\u0000\u01ef"+
		"\u01ed\u0001\u0000\u0000\u0000\u01f0\u01f2\u0005\t\u0000\u0000\u01f1\u01f0"+
		"\u0001\u0000\u0000\u0000\u01f1\u01f2\u0001\u0000\u0000\u0000\u01f2\u01f4"+
		"\u0001\u0000\u0000\u0000\u01f3\u01e8\u0001\u0000\u0000\u0000\u01f3\u01f4"+
		"\u0001\u0000\u0000\u0000\u01f4\u01f5\u0001\u0000\u0000\u0000\u01f5\u0207"+
		"\u0005\u0002\u0000\u0000\u01f6\u01f7\u0005\u0016\u0000\u0000\u01f7\u0203"+
		"\u0005\u0001\u0000\u0000\u01f8\u01fd\u0003D\"\u0000\u01f9\u01fa\u0005"+
		"\t\u0000\u0000\u01fa\u01fc\u0003D\"\u0000\u01fb\u01f9\u0001\u0000\u0000"+
		"\u0000\u01fc\u01ff\u0001\u0000\u0000\u0000\u01fd\u01fb\u0001\u0000\u0000"+
		"\u0000\u01fd\u01fe\u0001\u0000\u0000\u0000\u01fe\u0201\u0001\u0000\u0000"+
		"\u0000\u01ff\u01fd\u0001\u0000\u0000\u0000\u0200\u0202\u0005\t\u0000\u0000"+
		"\u0201\u0200\u0001\u0000\u0000\u0000\u0201\u0202\u0001\u0000\u0000\u0000"+
		"\u0202\u0204\u0001\u0000\u0000\u0000\u0203\u01f8\u0001\u0000\u0000\u0000"+
		"\u0203\u0204\u0001\u0000\u0000\u0000\u0204\u0205\u0001\u0000\u0000\u0000"+
		"\u0205\u0207\u0005\u0002\u0000\u0000\u0206\u01e6\u0001\u0000\u0000\u0000"+
		"\u0206\u01f6\u0001\u0000\u0000\u0000\u0207A\u0001\u0000\u0000\u0000\u0208"+
		"\u0209\u0005\\\u0000\u0000\u0209\u020a\u0005\u0003\u0000\u0000\u020a\u0215"+
		"\u0005c\u0000\u0000\u020b\u020c\u0005]\u0000\u0000\u020c\u020d\u0005\u0003"+
		"\u0000\u0000\u020d\u0215\u0005c\u0000\u0000\u020e\u020f\u0005_\u0000\u0000"+
		"\u020f\u0210\u0005\u0003\u0000\u0000\u0210\u0215\u0005c\u0000\u0000\u0211"+
		"\u0212\u0005^\u0000\u0000\u0212\u0213\u0005\u0003\u0000\u0000\u0213\u0215"+
		"\u0005c\u0000\u0000\u0214\u0208\u0001\u0000\u0000\u0000\u0214\u020b\u0001"+
		"\u0000\u0000\u0000\u0214\u020e\u0001\u0000\u0000\u0000\u0214\u0211\u0001"+
		"\u0000\u0000\u0000\u0215C\u0001\u0000\u0000\u0000\u0216\u0217\u0005@\u0000"+
		"\u0000\u0217\u0218\u0005\u0003\u0000\u0000\u0218\u021d\u0005c\u0000\u0000"+
		"\u0219\u021a\u0005A\u0000\u0000\u021a\u021b\u0005\u0003\u0000\u0000\u021b"+
		"\u021d\u0005c\u0000\u0000\u021c\u0216\u0001\u0000\u0000\u0000\u021c\u0219"+
		"\u0001\u0000\u0000\u0000\u021dE\u0001\u0000\u0000\u0000\u021e\u021f\u0005"+
		"\u0017\u0000\u0000\u021f\u022b\u0005\u0001\u0000\u0000\u0220\u0225\u0003"+
		"H$\u0000\u0221\u0222\u0005\t\u0000\u0000\u0222\u0224\u0003H$\u0000\u0223"+
		"\u0221\u0001\u0000\u0000\u0000\u0224\u0227\u0001\u0000\u0000\u0000\u0225"+
		"\u0223\u0001\u0000\u0000\u0000\u0225\u0226\u0001\u0000\u0000\u0000\u0226"+
		"\u0229\u0001\u0000\u0000\u0000\u0227\u0225\u0001\u0000\u0000\u0000\u0228"+
		"\u022a\u0005\t\u0000\u0000\u0229\u0228\u0001\u0000\u0000\u0000\u0229\u022a"+
		"\u0001\u0000\u0000\u0000\u022a\u022c\u0001\u0000\u0000\u0000\u022b\u0220"+
		"\u0001\u0000\u0000\u0000\u022b\u022c\u0001\u0000\u0000\u0000\u022c\u022d"+
		"\u0001\u0000\u0000\u0000\u022d\u022e\u0005\u0002\u0000\u0000\u022eG\u0001"+
		"\u0000\u0000\u0000\u022f\u0230\u0005C\u0000\u0000\u0230\u0231\u0005\u0003"+
		"\u0000\u0000\u0231\u0238\u0005d\u0000\u0000\u0232\u0233\u0005B\u0000\u0000"+
		"\u0233\u0234\u0005\u0003\u0000\u0000\u0234\u0238\u0007\u0004\u0000\u0000"+
		"\u0235\u0238\u0003b1\u0000\u0236\u0238\u0003d2\u0000\u0237\u022f\u0001"+
		"\u0000\u0000\u0000\u0237\u0232\u0001\u0000\u0000\u0000\u0237\u0235\u0001"+
		"\u0000\u0000\u0000\u0237\u0236\u0001\u0000\u0000\u0000\u0238I\u0001\u0000"+
		"\u0000\u0000\u0239\u023a\u0005\u0018\u0000\u0000\u023a\u0246\u0005\u0001"+
		"\u0000\u0000\u023b\u0240\u0003L&\u0000\u023c\u023d\u0005\t\u0000\u0000"+
		"\u023d\u023f\u0003L&\u0000\u023e\u023c\u0001\u0000\u0000\u0000\u023f\u0242"+
		"\u0001\u0000\u0000\u0000\u0240\u023e\u0001\u0000\u0000\u0000\u0240\u0241"+
		"\u0001\u0000\u0000\u0000\u0241\u0244\u0001\u0000\u0000\u0000\u0242\u0240"+
		"\u0001\u0000\u0000\u0000\u0243\u0245\u0005\t\u0000\u0000\u0244\u0243\u0001"+
		"\u0000\u0000\u0000\u0244\u0245\u0001\u0000\u0000\u0000\u0245\u0247\u0001"+
		"\u0000\u0000\u0000\u0246\u023b\u0001\u0000\u0000\u0000\u0246\u0247\u0001"+
		"\u0000\u0000\u0000\u0247\u0248\u0001\u0000\u0000\u0000\u0248\u0249\u0005"+
		"\u0002\u0000\u0000\u0249K\u0001\u0000\u0000\u0000\u024a\u0259\u0003b1"+
		"\u0000\u024b\u0259\u0003d2\u0000\u024c\u024d\u0005D\u0000\u0000\u024d"+
		"\u024e\u0005\u0003\u0000\u0000\u024e\u0259\u0005d\u0000\u0000\u024f\u0250"+
		"\u0005E\u0000\u0000\u0250\u0251\u0005\u0003\u0000\u0000\u0251\u0259\u0005"+
		"e\u0000\u0000\u0252\u0253\u0005F\u0000\u0000\u0253\u0254\u0005\u0003\u0000"+
		"\u0000\u0254\u0259\u0005e\u0000\u0000\u0255\u0256\u0005L\u0000\u0000\u0256"+
		"\u0257\u0005\u0003\u0000\u0000\u0257\u0259\u0003:\u001d\u0000\u0258\u024a"+
		"\u0001\u0000\u0000\u0000\u0258\u024b\u0001\u0000\u0000\u0000\u0258\u024c"+
		"\u0001\u0000\u0000\u0000\u0258\u024f\u0001\u0000\u0000\u0000\u0258\u0252"+
		"\u0001\u0000\u0000\u0000\u0258\u0255\u0001\u0000\u0000\u0000\u0259M\u0001"+
		"\u0000\u0000\u0000\u025a\u025b\u0005\u001a\u0000\u0000\u025b\u0267\u0005"+
		"\u0001\u0000\u0000\u025c\u0261\u0003P(\u0000\u025d\u025e\u0005\t\u0000"+
		"\u0000\u025e\u0260\u0003P(\u0000\u025f\u025d\u0001\u0000\u0000\u0000\u0260"+
		"\u0263\u0001\u0000\u0000\u0000\u0261\u025f\u0001\u0000\u0000\u0000\u0261"+
		"\u0262\u0001\u0000\u0000\u0000\u0262\u0265\u0001\u0000\u0000\u0000\u0263"+
		"\u0261\u0001\u0000\u0000\u0000\u0264\u0266\u0005\t\u0000\u0000\u0265\u0264"+
		"\u0001\u0000\u0000\u0000\u0265\u0266\u0001\u0000\u0000\u0000\u0266\u0268"+
		"\u0001\u0000\u0000\u0000\u0267\u025c\u0001\u0000\u0000\u0000\u0267\u0268"+
		"\u0001\u0000\u0000\u0000\u0268\u0269\u0001\u0000\u0000\u0000\u0269\u026a"+
		"\u0005\u0002\u0000\u0000\u026aO\u0001\u0000\u0000\u0000\u026b\u026c\u0005"+
		"T\u0000\u0000\u026c\u026d\u0005\u0003\u0000\u0000\u026d\u0281\u0005d\u0000"+
		"\u0000\u026e\u026f\u0005U\u0000\u0000\u026f\u0270\u0005\u0003\u0000\u0000"+
		"\u0270\u0281\u0005d\u0000\u0000\u0271\u0272\u0005V\u0000\u0000\u0272\u0273"+
		"\u0005\u0003\u0000\u0000\u0273\u0281\u0005e\u0000\u0000\u0274\u0275\u0005"+
		";\u0000\u0000\u0275\u0276\u0005\u0003\u0000\u0000\u0276\u0281\u0003@ "+
		"\u0000\u0277\u0278\u0005W\u0000\u0000\u0278\u0279\u0005\u0003\u0000\u0000"+
		"\u0279\u0281\u0005d\u0000\u0000\u027a\u027b\u0005X\u0000\u0000\u027b\u027c"+
		"\u0005\u0003\u0000\u0000\u027c\u0281\u0003R)\u0000\u027d\u027e\u0005["+
		"\u0000\u0000\u027e\u027f\u0005\u0003\u0000\u0000\u027f\u0281\u0003:\u001d"+
		"\u0000\u0280\u026b\u0001\u0000\u0000\u0000\u0280\u026e\u0001\u0000\u0000"+
		"\u0000\u0280\u0271\u0001\u0000\u0000\u0000\u0280\u0274\u0001\u0000\u0000"+
		"\u0000\u0280\u0277\u0001\u0000\u0000\u0000\u0280\u027a\u0001\u0000\u0000"+
		"\u0000\u0280\u027d\u0001\u0000\u0000\u0000\u0281Q\u0001\u0000\u0000\u0000"+
		"\u0282\u0283\u0005\u001b\u0000\u0000\u0283\u028f\u0005\u0001\u0000\u0000"+
		"\u0284\u0289\u0003T*\u0000\u0285\u0286\u0005\t\u0000\u0000\u0286\u0288"+
		"\u0003T*\u0000\u0287\u0285\u0001\u0000\u0000\u0000\u0288\u028b\u0001\u0000"+
		"\u0000\u0000\u0289\u0287\u0001\u0000\u0000\u0000\u0289\u028a\u0001\u0000"+
		"\u0000\u0000\u028a\u028d\u0001\u0000\u0000\u0000\u028b\u0289\u0001\u0000"+
		"\u0000\u0000\u028c\u028e\u0005\t\u0000\u0000\u028d\u028c\u0001\u0000\u0000"+
		"\u0000\u028d\u028e\u0001\u0000\u0000\u0000\u028e\u0290\u0001\u0000\u0000"+
		"\u0000\u028f\u0284\u0001\u0000\u0000\u0000\u028f\u0290\u0001\u0000\u0000"+
		"\u0000\u0290\u0291\u0001\u0000\u0000\u0000\u0291\u0292\u0005\u0002\u0000"+
		"\u0000\u0292S\u0001\u0000\u0000\u0000\u0293\u0294\u0005Y\u0000\u0000\u0294"+
		"\u0295\u0005\u0003\u0000\u0000\u0295\u029b\u0005c\u0000\u0000\u0296\u0297"+
		"\u00059\u0000\u0000\u0297\u0298\u0005\u0003\u0000\u0000\u0298\u029b\u0003"+
		"(\u0014\u0000\u0299\u029b\u0003f3\u0000\u029a\u0293\u0001\u0000\u0000"+
		"\u0000\u029a\u0296\u0001\u0000\u0000\u0000\u029a\u0299\u0001\u0000\u0000"+
		"\u0000\u029bU\u0001\u0000\u0000\u0000\u029c\u029d\u0005!\u0000\u0000\u029d"+
		"\u029e\u0005`\u0000\u0000\u029e\u029f\u0005\u0006\u0000\u0000\u029f\u02a0"+
		"\u0003X,\u0000\u02a0\u02a1\u0005%\u0000\u0000\u02a1\u02a2\u0005\u0001"+
		"\u0000\u0000\u02a2\u02a3\u0003Z-\u0000\u02a3\u02a4\u0005\u0002\u0000\u0000"+
		"\u02a4\u02a5\u0005\u0007\u0000\u0000\u02a5W\u0001\u0000\u0000\u0000\u02a6"+
		"\u02a8\u0003^/\u0000\u02a7\u02a6\u0001\u0000\u0000\u0000\u02a8\u02ab\u0001"+
		"\u0000\u0000\u0000\u02a9\u02a7\u0001\u0000\u0000\u0000\u02a9\u02aa\u0001"+
		"\u0000\u0000\u0000\u02aaY\u0001\u0000\u0000\u0000\u02ab\u02a9\u0001\u0000"+
		"\u0000\u0000\u02ac\u02ad\u0003\n\u0005\u0000\u02ad[\u0001\u0000\u0000"+
		"\u0000\u02ae\u02b1\u0003^/\u0000\u02af\u02b1\u0003`0\u0000\u02b0\u02ae"+
		"\u0001\u0000\u0000\u0000\u02b0\u02af\u0001\u0000\u0000\u0000\u02b1]\u0001"+
		"\u0000\u0000\u0000\u02b2\u02b3\u0007\u0005\u0000\u0000\u02b3\u02b4\u0005"+
		"a\u0000\u0000\u02b4\u02c2\u0005\b\u0000\u0000\u02b5\u02b6\u0005&\u0000"+
		"\u0000\u02b6\u02bb\u0005\u0001\u0000\u0000\u02b7\u02b8\u0007\u0005\u0000"+
		"\u0000\u02b8\u02ba\u0005\t\u0000\u0000\u02b9\u02b7\u0001\u0000\u0000\u0000"+
		"\u02ba\u02bd\u0001\u0000\u0000\u0000\u02bb\u02b9\u0001\u0000\u0000\u0000"+
		"\u02bb\u02bc\u0001\u0000\u0000\u0000\u02bc\u02be\u0001\u0000\u0000\u0000"+
		"\u02bd\u02bb\u0001\u0000\u0000\u0000\u02be\u02bf\u0005\u0002\u0000\u0000"+
		"\u02bf\u02c0\u0005a\u0000\u0000\u02c0\u02c2\u0005\b\u0000\u0000\u02c1"+
		"\u02b2\u0001\u0000\u0000\u0000\u02c1\u02b5\u0001\u0000\u0000\u0000\u02c2"+
		"_\u0001\u0000\u0000\u0000\u02c3\u02c4\u0005a\u0000\u0000\u02c4\u02c5\u0005"+
		"\n\u0000\u0000\u02c5\u02c6\u0007\u0006\u0000\u0000\u02c6\u02c7\u0005\b"+
		"\u0000\u0000\u02c7a\u0001\u0000\u0000\u0000\u02c8\u02c9\u0005-\u0000\u0000"+
		"\u02c9\u02ca\u0005\u0003\u0000\u0000\u02ca\u02cb\u0005c\u0000\u0000\u02cb"+
		"c\u0001\u0000\u0000\u0000\u02cc\u02cd\u0005.\u0000\u0000\u02cd\u02ce\u0005"+
		"\u0003\u0000\u0000\u02ce\u02cf\u0005c\u0000\u0000\u02cfe\u0001\u0000\u0000"+
		"\u0000\u02d0\u02d1\u00058\u0000\u0000\u02d1\u02d2\u0005\u0003\u0000\u0000"+
		"\u02d2\u02d3\u0005e\u0000\u0000\u02d3g\u0001\u0000\u0000\u0000\u02d4\u02d5"+
		"\u0005 \u0000\u0000\u02d5\u02d6\u0005\u0003\u0000\u0000\u02d6\u02d7\u0003"+
		"\n\u0005\u0000\u02d7i\u0001\u0000\u0000\u0000\u02d8\u02d9\u0005\u001e"+
		"\u0000\u0000\u02d9\u02da\u0005\u0003\u0000\u0000\u02da\u02e0\u0005\u0004"+
		"\u0000\u0000\u02db\u02dc\u0003\n\u0005\u0000\u02dc\u02dd\u0005\t\u0000"+
		"\u0000\u02dd\u02df\u0001\u0000\u0000\u0000\u02de\u02db\u0001\u0000\u0000"+
		"\u0000\u02df\u02e2\u0001\u0000\u0000\u0000\u02e0\u02de\u0001\u0000\u0000"+
		"\u0000\u02e0\u02e1\u0001\u0000\u0000\u0000\u02e1\u02e3\u0001\u0000\u0000"+
		"\u0000\u02e2\u02e0\u0001\u0000\u0000\u0000\u02e3\u02e4\u0005\u0005\u0000"+
		"\u0000\u02e4k\u0001\u0000\u0000\u0000\u02e5\u02e6\u00052\u0000\u0000\u02e6"+
		"\u02e7\u0005\u0003\u0000\u0000\u02e7\u02e8\u0007\u0007\u0000\u0000\u02e8"+
		"m\u0001\u0000\u0000\u0000\u02e9\u02ea\u00055\u0000\u0000\u02ea\u02eb\u0005"+
		"\u0003\u0000\u0000\u02eb\u02ec\u0007\b\u0000\u0000\u02eco\u0001\u0000"+
		"\u0000\u0000Us\u0080\u0084\u0086\u0090\u0099\u009d\u009f\u00a9\u00b7\u00c0"+
		"\u00c4\u00c6\u00d5\u00d9\u00db\u00e2\u00eb\u00ef\u00f1\u00fe\u0102\u0104"+
		"\u010b\u0114\u0118\u011a\u012d\u0136\u013a\u013c\u0149\u0152\u0156\u0158"+
		"\u0160\u0164\u016a\u0175\u0179\u017b\u018f\u0198\u019c\u019e\u01a6\u01af"+
		"\u01b3\u01b5\u01c2\u01ca\u01d6\u01da\u01dc\u01e4\u01ed\u01f1\u01f3\u01fd"+
		"\u0201\u0203\u0206\u0214\u021c\u0225\u0229\u022b\u0237\u0240\u0244\u0246"+
		"\u0258\u0261\u0265\u0267\u0280\u0289\u028d\u028f\u029a\u02a9\u02b0\u02bb"+
		"\u02c1\u02e0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}