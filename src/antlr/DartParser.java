// Generated from DartParser.g4 by ANTLR 4.12.0
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
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LP=1, RP=2, COLON=3, OA=4, CA=5, OB=6, CB=7, SC=8, COMMA=9, EQL=10, EE=11, 
		NE=12, GT=13, GTE=14, LT=15, LTE=16, PL=17, MINUS=18, OO=19, AA=20, STAR=21, 
		DIV=22, SCAFFOLD=23, ROW=24, CENTER=25, COLUMN=26, TEXT=27, APPBAR=28, 
		CONTAINER=29, EXPANDED=30, BOXDECORATION=31, PADDING=32, EDGE_INSETS_ONLY=33, 
		EDGE_INSETS_SYMMETRIC=34, IMAGE=35, BUTTON=36, GESTUREDETECTOR=37, TEXTFIELD=38, 
		BORDER=39, BORDERRADIUSONLY=40, BORDERRADIUSCIRCULAR=41, IF=42, FOR=43, 
		VIDEOPLAYER=44, FORM=45, NAVIGATE_TO=46, POP_UP=47, CHILDREN=48, BODY=49, 
		CHILD=50, WIDGET=51, INT=52, STRINGTYPE=53, DOUBLE=54, RETURN=55, FUNCTION=56, 
		TEXTATRIB=57, APPBARATRIB=58, FONTWEIGHT=59, FONTSIZE=60, LETTERSPACING=61, 
		BOLD=62, WIDTH=63, HEIGHT=64, CONTENTALIGNMENT=65, CENTERVALUE=66, FLEX=67, 
		MAINAXISSIZE=68, MAX=69, MIN=70, CROSSAXISALIGNMENT=71, STRETCH=72, DECORATION=73, 
		COLOR=74, BORDERRADIUS=75, CIRCULAR=76, PADDINGATTR=77, TOPRIGHT=78, TOPLEFT=79, 
		BOTTOMRIGHT=80, BOTTOMLEFT=81, HORIZONTAL=82, VERTICAL=83, FIT=84, URL=85, 
		TITLE=86, BACKGROUND_COLOR=87, TITLE_COLOR=88, CONTAINS=89, COVER=90, 
		CENTERTITLE=91, TEXTALIGN=92, ONPRESSED=93, START_ATTR=94, END_ATTR=95, 
		JUSTIFY_ATTR=96, ONLY=97, LIGHT=98, SEMIBOLD=99, MEDIUM=100, VALUE=101, 
		LABEL=102, TEXTCOLOR=103, HINT=104, BORDERATRI=105, THICKNESS=106, RADIUS=107, 
		ONCHANGED=108, TOP=109, LEFT=110, BOTTOM=111, RIGHT=112, CONDITION=113, 
		THEN=114, FROM=115, ITERATIONS=116, SRC=117, SCREENNAME=118, ONSUBMIT=119, 
		ID=120, GETXDOTSET=121, GETXDOTGET=122, ITEMVALUE=123, SETVALUE=124, BOOLEAN=125, 
		FLOAT=126, NUM=127, STRING=128, HEX_NUM=129, WIDGETNAME=130, IDENTIFIER=131, 
		WS=132;
	public static final int
		RULE_prog = 0, RULE_scaffold = 1, RULE_scaffoldProperty = 2, RULE_appBar = 3, 
		RULE_appBarProperties = 4, RULE_widget = 5, RULE_form = 6, RULE_formProperties = 7, 
		RULE_onSubmitProperty = 8, RULE_videoPlayer = 9, RULE_videoPlayerProperties = 10, 
		RULE_customWidget = 11, RULE_customWidgetProperties = 12, RULE_row = 13, 
		RULE_rowProperties = 14, RULE_center = 15, RULE_centerProperties = 16, 
		RULE_column = 17, RULE_columnProperties = 18, RULE_text = 19, RULE_textProperties = 20, 
		RULE_setValueProperty = 21, RULE_container = 22, RULE_containerProperties = 23, 
		RULE_decorationProperty = 24, RULE_boxDecoration = 25, RULE_boxDecorationProperties = 26, 
		RULE_borderRadiusProperty = 27, RULE_borderRadius = 28, RULE_borderRadiusCircular = 29, 
		RULE_borderRadiusOnly = 30, RULE_borderRadiusCircularRadiusProperty = 31, 
		RULE_borderRadiusOnlyProperties = 32, RULE_expanded = 33, RULE_expandedProperties = 34, 
		RULE_gestureDetector = 35, RULE_gestureDetectorProperties = 36, RULE_padding = 37, 
		RULE_paddingProprtey = 38, RULE_edgeInsets = 39, RULE_edgeInsetsOnlyProperties = 40, 
		RULE_edgeInsetsSymetricProperties = 41, RULE_image = 42, RULE_imageProperties = 43, 
		RULE_button = 44, RULE_buttonProperties = 45, RULE_textField = 46, RULE_textFieldProperties = 47, 
		RULE_idProperty = 48, RULE_border = 49, RULE_borderProperties = 50, RULE_if = 51, 
		RULE_ifProperties = 52, RULE_for = 53, RULE_forProperties = 54, RULE_statment = 55, 
		RULE_setValueStatement = 56, RULE_setState = 57, RULE_getStateX = 58, 
		RULE_itemValue = 59, RULE_variableDeclaration = 60, RULE_variableAssignment = 61, 
		RULE_navigation = 62, RULE_popup = 63, RULE_customWidgetDeclaration = 64, 
		RULE_widthProperty = 65, RULE_heightProperty = 66, RULE_colorProperty = 67, 
		RULE_childProperty = 68, RULE_childrenProperty = 69, RULE_mainAxisSizeProperty = 70, 
		RULE_crossAxisAlignmentProperty = 71, RULE_onPressedProperty = 72, RULE_expressionList = 73, 
		RULE_expression = 74, RULE_logicalOrExpression = 75, RULE_logicalAndExpression = 76, 
		RULE_equalityExpression = 77, RULE_relationalExpression = 78, RULE_additiveExpression = 79, 
		RULE_multiplicativeExpression = 80, RULE_primary = 81, RULE_literal = 82, 
		RULE_numericLiteral = 83;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "scaffold", "scaffoldProperty", "appBar", "appBarProperties", 
			"widget", "form", "formProperties", "onSubmitProperty", "videoPlayer", 
			"videoPlayerProperties", "customWidget", "customWidgetProperties", "row", 
			"rowProperties", "center", "centerProperties", "column", "columnProperties", 
			"text", "textProperties", "setValueProperty", "container", "containerProperties", 
			"decorationProperty", "boxDecoration", "boxDecorationProperties", "borderRadiusProperty", 
			"borderRadius", "borderRadiusCircular", "borderRadiusOnly", "borderRadiusCircularRadiusProperty", 
			"borderRadiusOnlyProperties", "expanded", "expandedProperties", "gestureDetector", 
			"gestureDetectorProperties", "padding", "paddingProprtey", "edgeInsets", 
			"edgeInsetsOnlyProperties", "edgeInsetsSymetricProperties", "image", 
			"imageProperties", "button", "buttonProperties", "textField", "textFieldProperties", 
			"idProperty", "border", "borderProperties", "if", "ifProperties", "for", 
			"forProperties", "statment", "setValueStatement", "setState", "getStateX", 
			"itemValue", "variableDeclaration", "variableAssignment", "navigation", 
			"popup", "customWidgetDeclaration", "widthProperty", "heightProperty", 
			"colorProperty", "childProperty", "childrenProperty", "mainAxisSizeProperty", 
			"crossAxisAlignmentProperty", "onPressedProperty", "expressionList", 
			"expression", "logicalOrExpression", "logicalAndExpression", "equalityExpression", 
			"relationalExpression", "additiveExpression", "multiplicativeExpression", 
			"primary", "literal", "numericLiteral"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "':'", "'['", "']'", "'{'", "'}'", "';'", "','", 
			"'='", "'=='", "'!='", "'>'", "'>='", "'<'", "'<='", "'+'", "'-'", "'||'", 
			"'&&'", "'*'", "'/'", "'Scaffold'", "'Row'", "'Center'", "'Column'", 
			"'Text'", "'AppBar'", "'Container'", "'Expanded'", "'BoxDecoration'", 
			"'Padding'", "'EdgeInsetsOnly'", "'EdgeInsetsSymmetric'", "'Image'", 
			"'Button'", "'GestureDetector'", "'TextField'", "'Border'", "'BorderRadiusOnly'", 
			"'BorderRadiusCircular'", "'If'", "'For'", "'VideoPlayer'", "'Form'", 
			"'navigateTo'", "'popUp'", "'children'", "'body'", "'child'", "'Widget'", 
			"'int'", "'string'", "'double'", "'return'", "'function'", "'text'", 
			"'appBar'", "'fontWeight'", "'fontSize'", "'letterSpacing'", "'bold'", 
			"'width'", "'height'", "'contentAlignment'", "'center'", "'flex'", "'mainAxisSize'", 
			"'max'", "'min'", "'crossAxisAlignment'", "'stretch'", "'decoration'", 
			"'color'", "'borderRadius'", "'circular'", "'padding'", "'topRight'", 
			"'topLeft'", "'bottomRight'", "'bottomLeft'", "'horizontal'", "'vertical'", 
			"'fit'", "'url'", "'title'", "'backgroundColor'", "'titleColor'", "'contains'", 
			"'cover'", "'centerTitle'", "'textAlign'", "'onPressed'", "'start'", 
			"'end'", "'justify'", "'only'", "'light'", "'semibold'", "'medium'", 
			"'value'", "'label'", "'textColor'", "'hint'", "'border'", "'thickness'", 
			"'radius'", "'onChanged'", "'top'", "'left'", "'bottom'", "'right'", 
			"'condition'", "'thenProperty'", "'fromProperty'", "'iterations'", "'src'", 
			"'screenName'", "'onSubmit'", "'id'", "'getX.set'", "'getX.get'", "'itemValue'", 
			"'setValue'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LP", "RP", "COLON", "OA", "CA", "OB", "CB", "SC", "COMMA", "EQL", 
			"EE", "NE", "GT", "GTE", "LT", "LTE", "PL", "MINUS", "OO", "AA", "STAR", 
			"DIV", "SCAFFOLD", "ROW", "CENTER", "COLUMN", "TEXT", "APPBAR", "CONTAINER", 
			"EXPANDED", "BOXDECORATION", "PADDING", "EDGE_INSETS_ONLY", "EDGE_INSETS_SYMMETRIC", 
			"IMAGE", "BUTTON", "GESTUREDETECTOR", "TEXTFIELD", "BORDER", "BORDERRADIUSONLY", 
			"BORDERRADIUSCIRCULAR", "IF", "FOR", "VIDEOPLAYER", "FORM", "NAVIGATE_TO", 
			"POP_UP", "CHILDREN", "BODY", "CHILD", "WIDGET", "INT", "STRINGTYPE", 
			"DOUBLE", "RETURN", "FUNCTION", "TEXTATRIB", "APPBARATRIB", "FONTWEIGHT", 
			"FONTSIZE", "LETTERSPACING", "BOLD", "WIDTH", "HEIGHT", "CONTENTALIGNMENT", 
			"CENTERVALUE", "FLEX", "MAINAXISSIZE", "MAX", "MIN", "CROSSAXISALIGNMENT", 
			"STRETCH", "DECORATION", "COLOR", "BORDERRADIUS", "CIRCULAR", "PADDINGATTR", 
			"TOPRIGHT", "TOPLEFT", "BOTTOMRIGHT", "BOTTOMLEFT", "HORIZONTAL", "VERTICAL", 
			"FIT", "URL", "TITLE", "BACKGROUND_COLOR", "TITLE_COLOR", "CONTAINS", 
			"COVER", "CENTERTITLE", "TEXTALIGN", "ONPRESSED", "START_ATTR", "END_ATTR", 
			"JUSTIFY_ATTR", "ONLY", "LIGHT", "SEMIBOLD", "MEDIUM", "VALUE", "LABEL", 
			"TEXTCOLOR", "HINT", "BORDERATRI", "THICKNESS", "RADIUS", "ONCHANGED", 
			"TOP", "LEFT", "BOTTOM", "RIGHT", "CONDITION", "THEN", "FROM", "ITERATIONS", 
			"SRC", "SCREENNAME", "ONSUBMIT", "ID", "GETXDOTSET", "GETXDOTGET", "ITEMVALUE", 
			"SETVALUE", "BOOLEAN", "FLOAT", "NUM", "STRING", "HEX_NUM", "WIDGETNAME", 
			"IDENTIFIER", "WS"
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
	public String getGrammarFileName() { return "DartParser.g4"; }

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
		public TerminalNode EOF() { return getToken(DartParser.EOF, 0); }
		public List<StatmentContext> statment() {
			return getRuleContexts(StatmentContext.class);
		}
		public StatmentContext statment(int i) {
			return getRuleContext(StatmentContext.class,i);
		}
		public ScaffoldContext scaffold() {
			return getRuleContext(ScaffoldContext.class,0);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitProg(this);
		}
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
			setState(171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 106045697475739648L) != 0) || ((((_la - 121)) & ~0x3f) == 0 && ((1L << (_la - 121)) & 1039L) != 0)) {
				{
				{
				setState(168);
				statment();
				}
				}
				setState(173);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SCAFFOLD) {
				{
				setState(174);
				scaffold();
				}
			}

			setState(177);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterScaffold(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitScaffold(this);
		}
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
			setState(179);
			match(SCAFFOLD);
			setState(180);
			match(LP);
			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BODY || _la==APPBARATRIB || _la==SCREENNAME) {
				{
				setState(181);
				scaffoldProperty();
				setState(186);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(182);
						match(COMMA);
						setState(183);
						scaffoldProperty();
						}
						} 
					}
					setState(188);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				}
				setState(190);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(189);
					match(COMMA);
					}
				}

				}
			}

			setState(194);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterScaffoldBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitScaffoldBody(this);
		}
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterScaffoldAppBar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitScaffoldAppBar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitScaffoldAppBar(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ScaffoldNameContext extends ScaffoldPropertyContext {
		public TerminalNode SCREENNAME() { return getToken(DartParser.SCREENNAME, 0); }
		public TerminalNode COLON() { return getToken(DartParser.COLON, 0); }
		public TerminalNode STRING() { return getToken(DartParser.STRING, 0); }
		public ScaffoldNameContext(ScaffoldPropertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterScaffoldName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitScaffoldName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitScaffoldName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScaffoldPropertyContext scaffoldProperty() throws RecognitionException {
		ScaffoldPropertyContext _localctx = new ScaffoldPropertyContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_scaffoldProperty);
		try {
			setState(205);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BODY:
				_localctx = new ScaffoldBodyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(196);
				match(BODY);
				setState(197);
				match(COLON);
				setState(198);
				widget();
				}
				break;
			case APPBARATRIB:
				_localctx = new ScaffoldAppBarContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(199);
				match(APPBARATRIB);
				setState(200);
				match(COLON);
				setState(201);
				appBar();
				}
				break;
			case SCREENNAME:
				_localctx = new ScaffoldNameContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(202);
				match(SCREENNAME);
				setState(203);
				match(COLON);
				setState(204);
				match(STRING);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterAppBar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitAppBar(this);
		}
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
			setState(207);
			match(APPBAR);
			setState(208);
			match(LP);
			setState(220);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & 35L) != 0)) {
				{
				setState(209);
				appBarProperties();
				setState(214);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(210);
						match(COMMA);
						setState(211);
						appBarProperties();
						}
						} 
					}
					setState(216);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				}
				setState(218);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(217);
					match(COMMA);
					}
				}

				}
			}

			setState(222);
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
		public TerminalNode IDENTIFIER() { return getToken(DartParser.IDENTIFIER, 0); }
		public AppBarTitleContext(AppBarPropertiesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterAppBarTitle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitAppBarTitle(this);
		}
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterAppBarCenterTitle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitAppBarCenterTitle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitAppBarCenterTitle(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AppBarBackgroundColorContext extends AppBarPropertiesContext {
		public TerminalNode BACKGROUND_COLOR() { return getToken(DartParser.BACKGROUND_COLOR, 0); }
		public TerminalNode COLON() { return getToken(DartParser.COLON, 0); }
		public TerminalNode HEX_NUM() { return getToken(DartParser.HEX_NUM, 0); }
		public AppBarBackgroundColorContext(AppBarPropertiesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterAppBarBackgroundColor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitAppBarBackgroundColor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitAppBarBackgroundColor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AppBarPropertiesContext appBarProperties() throws RecognitionException {
		AppBarPropertiesContext _localctx = new AppBarPropertiesContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_appBarProperties);
		int _la;
		try {
			setState(233);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TITLE:
				_localctx = new AppBarTitleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(224);
				match(TITLE);
				setState(225);
				match(COLON);
				setState(226);
				_la = _input.LA(1);
				if ( !(_la==STRING || _la==IDENTIFIER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case CENTERTITLE:
				_localctx = new AppBarCenterTitleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(227);
				match(CENTERTITLE);
				setState(228);
				match(COLON);
				setState(229);
				match(BOOLEAN);
				}
				break;
			case BACKGROUND_COLOR:
				_localctx = new AppBarBackgroundColorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(230);
				match(BACKGROUND_COLOR);
				setState(231);
				match(COLON);
				setState(232);
				match(HEX_NUM);
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
		public RowContext row() {
			return getRuleContext(RowContext.class,0);
		}
		public CenterContext center() {
			return getRuleContext(CenterContext.class,0);
		}
		public TextContext text() {
			return getRuleContext(TextContext.class,0);
		}
		public ContainerContext container() {
			return getRuleContext(ContainerContext.class,0);
		}
		public ExpandedContext expanded() {
			return getRuleContext(ExpandedContext.class,0);
		}
		public ColumnContext column() {
			return getRuleContext(ColumnContext.class,0);
		}
		public GestureDetectorContext gestureDetector() {
			return getRuleContext(GestureDetectorContext.class,0);
		}
		public PaddingContext padding() {
			return getRuleContext(PaddingContext.class,0);
		}
		public ImageContext image() {
			return getRuleContext(ImageContext.class,0);
		}
		public ButtonContext button() {
			return getRuleContext(ButtonContext.class,0);
		}
		public CustomWidgetContext customWidget() {
			return getRuleContext(CustomWidgetContext.class,0);
		}
		public TextFieldContext textField() {
			return getRuleContext(TextFieldContext.class,0);
		}
		public IfContext if_() {
			return getRuleContext(IfContext.class,0);
		}
		public ForContext for_() {
			return getRuleContext(ForContext.class,0);
		}
		public VideoPlayerContext videoPlayer() {
			return getRuleContext(VideoPlayerContext.class,0);
		}
		public FormContext form() {
			return getRuleContext(FormContext.class,0);
		}
		public WidgetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_widget; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterWidget(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitWidget(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitWidget(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WidgetContext widget() throws RecognitionException {
		WidgetContext _localctx = new WidgetContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_widget);
		try {
			setState(251);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ROW:
				enterOuterAlt(_localctx, 1);
				{
				setState(235);
				row();
				}
				break;
			case CENTER:
				enterOuterAlt(_localctx, 2);
				{
				setState(236);
				center();
				}
				break;
			case TEXT:
				enterOuterAlt(_localctx, 3);
				{
				setState(237);
				text();
				}
				break;
			case CONTAINER:
				enterOuterAlt(_localctx, 4);
				{
				setState(238);
				container();
				}
				break;
			case EXPANDED:
				enterOuterAlt(_localctx, 5);
				{
				setState(239);
				expanded();
				}
				break;
			case COLUMN:
				enterOuterAlt(_localctx, 6);
				{
				setState(240);
				column();
				}
				break;
			case GESTUREDETECTOR:
				enterOuterAlt(_localctx, 7);
				{
				setState(241);
				gestureDetector();
				}
				break;
			case PADDING:
				enterOuterAlt(_localctx, 8);
				{
				setState(242);
				padding();
				}
				break;
			case IMAGE:
				enterOuterAlt(_localctx, 9);
				{
				setState(243);
				image();
				}
				break;
			case BUTTON:
				enterOuterAlt(_localctx, 10);
				{
				setState(244);
				button();
				}
				break;
			case WIDGETNAME:
				enterOuterAlt(_localctx, 11);
				{
				setState(245);
				customWidget();
				}
				break;
			case TEXTFIELD:
				enterOuterAlt(_localctx, 12);
				{
				setState(246);
				textField();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 13);
				{
				setState(247);
				if_();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 14);
				{
				setState(248);
				for_();
				}
				break;
			case VIDEOPLAYER:
				enterOuterAlt(_localctx, 15);
				{
				setState(249);
				videoPlayer();
				}
				break;
			case FORM:
				enterOuterAlt(_localctx, 16);
				{
				setState(250);
				form();
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
	public static class FormContext extends ParserRuleContext {
		public TerminalNode FORM() { return getToken(DartParser.FORM, 0); }
		public TerminalNode LP() { return getToken(DartParser.LP, 0); }
		public TerminalNode RP() { return getToken(DartParser.RP, 0); }
		public List<FormPropertiesContext> formProperties() {
			return getRuleContexts(FormPropertiesContext.class);
		}
		public FormPropertiesContext formProperties(int i) {
			return getRuleContext(FormPropertiesContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DartParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DartParser.COMMA, i);
		}
		public FormContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_form; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterForm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitForm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitForm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormContext form() throws RecognitionException {
		FormContext _localctx = new FormContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_form);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			match(FORM);
			setState(254);
			match(LP);
			setState(266);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CHILD || _la==ONSUBMIT) {
				{
				setState(255);
				formProperties();
				setState(260);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(256);
						match(COMMA);
						setState(257);
						formProperties();
						}
						} 
					}
					setState(262);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				}
				setState(264);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(263);
					match(COMMA);
					}
				}

				}
			}

			setState(268);
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
	public static class FormPropertiesContext extends ParserRuleContext {
		public FormPropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formProperties; }
	 
		public FormPropertiesContext() { }
		public void copyFrom(FormPropertiesContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FormOnSubmitContext extends FormPropertiesContext {
		public OnSubmitPropertyContext onSubmitProperty() {
			return getRuleContext(OnSubmitPropertyContext.class,0);
		}
		public FormOnSubmitContext(FormPropertiesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterFormOnSubmit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitFormOnSubmit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitFormOnSubmit(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FormChildContext extends FormPropertiesContext {
		public ChildPropertyContext childProperty() {
			return getRuleContext(ChildPropertyContext.class,0);
		}
		public FormChildContext(FormPropertiesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterFormChild(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitFormChild(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitFormChild(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormPropertiesContext formProperties() throws RecognitionException {
		FormPropertiesContext _localctx = new FormPropertiesContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_formProperties);
		try {
			setState(272);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHILD:
				_localctx = new FormChildContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(270);
				childProperty();
				}
				break;
			case ONSUBMIT:
				_localctx = new FormOnSubmitContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(271);
				onSubmitProperty();
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
	public static class OnSubmitPropertyContext extends ParserRuleContext {
		public TerminalNode ONSUBMIT() { return getToken(DartParser.ONSUBMIT, 0); }
		public TerminalNode COLON() { return getToken(DartParser.COLON, 0); }
		public TerminalNode OB() { return getToken(DartParser.OB, 0); }
		public TerminalNode CB() { return getToken(DartParser.CB, 0); }
		public List<StatmentContext> statment() {
			return getRuleContexts(StatmentContext.class);
		}
		public StatmentContext statment(int i) {
			return getRuleContext(StatmentContext.class,i);
		}
		public OnSubmitPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_onSubmitProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterOnSubmitProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitOnSubmitProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitOnSubmitProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OnSubmitPropertyContext onSubmitProperty() throws RecognitionException {
		OnSubmitPropertyContext _localctx = new OnSubmitPropertyContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_onSubmitProperty);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			match(ONSUBMIT);
			setState(275);
			match(COLON);
			setState(276);
			match(OB);
			setState(280);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 106045697475739648L) != 0) || ((((_la - 121)) & ~0x3f) == 0 && ((1L << (_la - 121)) & 1039L) != 0)) {
				{
				{
				setState(277);
				statment();
				}
				}
				setState(282);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(283);
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
	public static class VideoPlayerContext extends ParserRuleContext {
		public TerminalNode VIDEOPLAYER() { return getToken(DartParser.VIDEOPLAYER, 0); }
		public TerminalNode LP() { return getToken(DartParser.LP, 0); }
		public TerminalNode RP() { return getToken(DartParser.RP, 0); }
		public List<VideoPlayerPropertiesContext> videoPlayerProperties() {
			return getRuleContexts(VideoPlayerPropertiesContext.class);
		}
		public VideoPlayerPropertiesContext videoPlayerProperties(int i) {
			return getRuleContext(VideoPlayerPropertiesContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DartParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DartParser.COMMA, i);
		}
		public VideoPlayerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_videoPlayer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterVideoPlayer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitVideoPlayer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitVideoPlayer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VideoPlayerContext videoPlayer() throws RecognitionException {
		VideoPlayerContext _localctx = new VideoPlayerContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_videoPlayer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			match(VIDEOPLAYER);
			setState(286);
			match(LP);
			setState(298);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 63)) & ~0x3f) == 0 && ((1L << (_la - 63)) & 18014398509481987L) != 0)) {
				{
				setState(287);
				videoPlayerProperties();
				setState(292);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(288);
						match(COMMA);
						setState(289);
						videoPlayerProperties();
						}
						} 
					}
					setState(294);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				}
				setState(296);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(295);
					match(COMMA);
					}
				}

				}
			}

			setState(300);
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
	public static class VideoPlayerPropertiesContext extends ParserRuleContext {
		public VideoPlayerPropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_videoPlayerProperties; }
	 
		public VideoPlayerPropertiesContext() { }
		public void copyFrom(VideoPlayerPropertiesContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VideoPlayerHeightContext extends VideoPlayerPropertiesContext {
		public HeightPropertyContext heightProperty() {
			return getRuleContext(HeightPropertyContext.class,0);
		}
		public VideoPlayerHeightContext(VideoPlayerPropertiesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterVideoPlayerHeight(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitVideoPlayerHeight(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitVideoPlayerHeight(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VideoPlayerWidthContext extends VideoPlayerPropertiesContext {
		public WidthPropertyContext widthProperty() {
			return getRuleContext(WidthPropertyContext.class,0);
		}
		public VideoPlayerWidthContext(VideoPlayerPropertiesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterVideoPlayerWidth(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitVideoPlayerWidth(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitVideoPlayerWidth(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VideoPlayerSrcContext extends VideoPlayerPropertiesContext {
		public TerminalNode SRC() { return getToken(DartParser.SRC, 0); }
		public TerminalNode COLON() { return getToken(DartParser.COLON, 0); }
		public TerminalNode STRING() { return getToken(DartParser.STRING, 0); }
		public TerminalNode IDENTIFIER() { return getToken(DartParser.IDENTIFIER, 0); }
		public VideoPlayerSrcContext(VideoPlayerPropertiesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterVideoPlayerSrc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitVideoPlayerSrc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitVideoPlayerSrc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VideoPlayerPropertiesContext videoPlayerProperties() throws RecognitionException {
		VideoPlayerPropertiesContext _localctx = new VideoPlayerPropertiesContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_videoPlayerProperties);
		int _la;
		try {
			setState(307);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WIDTH:
				_localctx = new VideoPlayerWidthContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(302);
				widthProperty();
				}
				break;
			case HEIGHT:
				_localctx = new VideoPlayerHeightContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(303);
				heightProperty();
				}
				break;
			case SRC:
				_localctx = new VideoPlayerSrcContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(304);
				match(SRC);
				setState(305);
				match(COLON);
				setState(306);
				_la = _input.LA(1);
				if ( !(_la==STRING || _la==IDENTIFIER) ) {
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterCustomWidget(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitCustomWidget(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitCustomWidget(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CustomWidgetContext customWidget() throws RecognitionException {
		CustomWidgetContext _localctx = new CustomWidgetContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_customWidget);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			match(WIDGETNAME);
			setState(310);
			match(LP);
			setState(322);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(311);
				customWidgetProperties();
				setState(316);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(312);
						match(COMMA);
						setState(313);
						customWidgetProperties();
						}
						} 
					}
					setState(318);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				}
				setState(320);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(319);
					match(COMMA);
					}
				}

				}
			}

			setState(324);
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
		public TerminalNode FLOAT() { return getToken(DartParser.FLOAT, 0); }
		public CustomWidgetPropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_customWidgetProperties; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterCustomWidgetProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitCustomWidgetProperties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitCustomWidgetProperties(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CustomWidgetPropertiesContext customWidgetProperties() throws RecognitionException {
		CustomWidgetPropertiesContext _localctx = new CustomWidgetPropertiesContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_customWidgetProperties);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			match(IDENTIFIER);
			setState(327);
			match(COLON);
			setState(328);
			_la = _input.LA(1);
			if ( !(((((_la - 126)) & ~0x3f) == 0 && ((1L << (_la - 126)) & 7L) != 0)) ) {
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterRow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitRow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitRow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RowContext row() throws RecognitionException {
		RowContext _localctx = new RowContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_row);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			match(ROW);
			setState(331);
			match(LP);
			setState(343);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 48)) & ~0x3f) == 0 && ((1L << (_la - 48)) & 9437185L) != 0)) {
				{
				setState(332);
				rowProperties();
				setState(337);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(333);
						match(COMMA);
						setState(334);
						rowProperties();
						}
						} 
					}
					setState(339);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
				}
				setState(341);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(340);
					match(COMMA);
					}
				}

				}
			}

			setState(345);
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
		public ChildrenPropertyContext childrenProperty() {
			return getRuleContext(ChildrenPropertyContext.class,0);
		}
		public MainAxisSizePropertyContext mainAxisSizeProperty() {
			return getRuleContext(MainAxisSizePropertyContext.class,0);
		}
		public CrossAxisAlignmentPropertyContext crossAxisAlignmentProperty() {
			return getRuleContext(CrossAxisAlignmentPropertyContext.class,0);
		}
		public RowPropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rowProperties; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterRowProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitRowProperties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitRowProperties(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RowPropertiesContext rowProperties() throws RecognitionException {
		RowPropertiesContext _localctx = new RowPropertiesContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_rowProperties);
		try {
			setState(350);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHILDREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(347);
				childrenProperty();
				}
				break;
			case MAINAXISSIZE:
				enterOuterAlt(_localctx, 2);
				{
				setState(348);
				mainAxisSizeProperty();
				}
				break;
			case CROSSAXISALIGNMENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(349);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterCenter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitCenter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitCenter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CenterContext center() throws RecognitionException {
		CenterContext _localctx = new CenterContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_center);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			match(CENTER);
			setState(353);
			match(LP);
			setState(365);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CHILD) {
				{
				setState(354);
				centerProperties();
				setState(359);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(355);
						match(COMMA);
						setState(356);
						centerProperties();
						}
						} 
					}
					setState(361);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
				}
				setState(363);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(362);
					match(COMMA);
					}
				}

				}
			}

			setState(367);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterCenterChild(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitCenterChild(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitCenterChild(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CenterPropertiesContext centerProperties() throws RecognitionException {
		CenterPropertiesContext _localctx = new CenterPropertiesContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_centerProperties);
		try {
			_localctx = new CenterChildContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitColumn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnContext column() throws RecognitionException {
		ColumnContext _localctx = new ColumnContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_column);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(371);
			match(COLUMN);
			setState(372);
			match(LP);
			setState(384);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 48)) & ~0x3f) == 0 && ((1L << (_la - 48)) & 9437185L) != 0)) {
				{
				setState(373);
				columnProperties();
				setState(378);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(374);
						match(COMMA);
						setState(375);
						columnProperties();
						}
						} 
					}
					setState(380);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
				}
				setState(382);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(381);
					match(COMMA);
					}
				}

				}
			}

			setState(386);
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
		public ChildrenPropertyContext childrenProperty() {
			return getRuleContext(ChildrenPropertyContext.class,0);
		}
		public MainAxisSizePropertyContext mainAxisSizeProperty() {
			return getRuleContext(MainAxisSizePropertyContext.class,0);
		}
		public CrossAxisAlignmentPropertyContext crossAxisAlignmentProperty() {
			return getRuleContext(CrossAxisAlignmentPropertyContext.class,0);
		}
		public ColumnPropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnProperties; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterColumnProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitColumnProperties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitColumnProperties(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnPropertiesContext columnProperties() throws RecognitionException {
		ColumnPropertiesContext _localctx = new ColumnPropertiesContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_columnProperties);
		try {
			setState(391);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHILDREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(388);
				childrenProperty();
				}
				break;
			case MAINAXISSIZE:
				enterOuterAlt(_localctx, 2);
				{
				setState(389);
				mainAxisSizeProperty();
				}
				break;
			case CROSSAXISALIGNMENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(390);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitText(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextContext text() throws RecognitionException {
		TextContext _localctx = new TextContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_text);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(393);
			match(TEXT);
			setState(394);
			match(LP);
			setState(406);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4179340454199820288L) != 0) || ((((_la - 92)) & ~0x3f) == 0 && ((1L << (_la - 92)) & 4563402753L) != 0)) {
				{
				setState(395);
				textProperties();
				setState(400);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(396);
						match(COMMA);
						setState(397);
						textProperties();
						}
						} 
					}
					setState(402);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				}
				setState(404);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(403);
					match(COMMA);
					}
				}

				}
			}

			setState(408);
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
		public TerminalNode FLOAT() { return getToken(DartParser.FLOAT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(DartParser.IDENTIFIER, 0); }
		public TextFontSizeContext(TextPropertiesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterTextFontSize(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitTextFontSize(this);
		}
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterTextTextAlign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitTextTextAlign(this);
		}
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
		public TerminalNode FLOAT() { return getToken(DartParser.FLOAT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(DartParser.IDENTIFIER, 0); }
		public TextLetterSpacingContext(TextPropertiesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterTextLetterSpacing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitTextLetterSpacing(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitTextLetterSpacing(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TextIdContext extends TextPropertiesContext {
		public IdPropertyContext idProperty() {
			return getRuleContext(IdPropertyContext.class,0);
		}
		public TextIdContext(TextPropertiesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterTextId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitTextId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitTextId(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TextSetValueContext extends TextPropertiesContext {
		public SetValuePropertyContext setValueProperty() {
			return getRuleContext(SetValuePropertyContext.class,0);
		}
		public TextSetValueContext(TextPropertiesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterTextSetValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitTextSetValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitTextSetValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TextContentContext extends TextPropertiesContext {
		public TerminalNode TEXTATRIB() { return getToken(DartParser.TEXTATRIB, 0); }
		public TerminalNode COLON() { return getToken(DartParser.COLON, 0); }
		public TerminalNode STRING() { return getToken(DartParser.STRING, 0); }
		public TerminalNode IDENTIFIER() { return getToken(DartParser.IDENTIFIER, 0); }
		public TextContentContext(TextPropertiesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterTextContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitTextContent(this);
		}
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterTextFontWeight(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitTextFontWeight(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitTextFontWeight(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextPropertiesContext textProperties() throws RecognitionException {
		TextPropertiesContext _localctx = new TextPropertiesContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_textProperties);
		int _la;
		try {
			setState(427);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TEXTATRIB:
				_localctx = new TextContentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(410);
				match(TEXTATRIB);
				setState(411);
				match(COLON);
				setState(412);
				_la = _input.LA(1);
				if ( !(_la==STRING || _la==IDENTIFIER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case FONTWEIGHT:
				_localctx = new TextFontWeightContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(413);
				match(FONTWEIGHT);
				setState(414);
				match(COLON);
				setState(415);
				_la = _input.LA(1);
				if ( !(((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & 481036337153L) != 0)) ) {
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
				setState(416);
				match(FONTSIZE);
				setState(417);
				match(COLON);
				setState(418);
				_la = _input.LA(1);
				if ( !(((((_la - 126)) & ~0x3f) == 0 && ((1L << (_la - 126)) & 35L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case LETTERSPACING:
				_localctx = new TextLetterSpacingContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(419);
				match(LETTERSPACING);
				setState(420);
				match(COLON);
				setState(421);
				_la = _input.LA(1);
				if ( !(((((_la - 126)) & ~0x3f) == 0 && ((1L << (_la - 126)) & 35L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case TEXTALIGN:
				_localctx = new TextTextAlignContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(422);
				match(TEXTALIGN);
				setState(423);
				match(COLON);
				setState(424);
				_la = _input.LA(1);
				if ( !(((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & 1879048193L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case ID:
				_localctx = new TextIdContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(425);
				idProperty();
				}
				break;
			case SETVALUE:
				_localctx = new TextSetValueContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(426);
				setValueProperty();
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
	public static class SetValuePropertyContext extends ParserRuleContext {
		public TerminalNode SETVALUE() { return getToken(DartParser.SETVALUE, 0); }
		public TerminalNode COLON() { return getToken(DartParser.COLON, 0); }
		public TerminalNode LP() { return getToken(DartParser.LP, 0); }
		public TerminalNode STRING() { return getToken(DartParser.STRING, 0); }
		public TerminalNode COMMA() { return getToken(DartParser.COMMA, 0); }
		public GetStateXContext getStateX() {
			return getRuleContext(GetStateXContext.class,0);
		}
		public TerminalNode RP() { return getToken(DartParser.RP, 0); }
		public SetValuePropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setValueProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterSetValueProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitSetValueProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitSetValueProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetValuePropertyContext setValueProperty() throws RecognitionException {
		SetValuePropertyContext _localctx = new SetValuePropertyContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_setValueProperty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
			match(SETVALUE);
			setState(430);
			match(COLON);
			setState(431);
			match(LP);
			setState(432);
			match(STRING);
			setState(433);
			match(COMMA);
			setState(434);
			getStateX();
			setState(435);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterContainer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitContainer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitContainer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContainerContext container() throws RecognitionException {
		ContainerContext _localctx = new ContainerContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_container);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(437);
			match(CONTAINER);
			setState(438);
			match(LP);
			setState(450);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 50)) & ~0x3f) == 0 && ((1L << (_la - 50)) & 8445953L) != 0)) {
				{
				setState(439);
				containerProperties();
				setState(444);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(440);
						match(COMMA);
						setState(441);
						containerProperties();
						}
						} 
					}
					setState(446);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
				}
				setState(448);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(447);
					match(COMMA);
					}
				}

				}
			}

			setState(452);
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
		public DecorationPropertyContext decorationProperty() {
			return getRuleContext(DecorationPropertyContext.class,0);
		}
		public ContainerDecorationContext(ContainerPropertiesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterContainerDecoration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitContainerDecoration(this);
		}
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterContainerContentAlignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitContainerContentAlignment(this);
		}
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterContainerWidth(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitContainerWidth(this);
		}
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterContainerHeight(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitContainerHeight(this);
		}
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterContainerChild(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitContainerChild(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitContainerChild(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContainerPropertiesContext containerProperties() throws RecognitionException {
		ContainerPropertiesContext _localctx = new ContainerPropertiesContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_containerProperties);
		int _la;
		try {
			setState(461);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WIDTH:
				_localctx = new ContainerWidthContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(454);
				widthProperty();
				}
				break;
			case HEIGHT:
				_localctx = new ContainerHeightContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(455);
				heightProperty();
				}
				break;
			case CONTENTALIGNMENT:
				_localctx = new ContainerContentAlignmentContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(456);
				match(CONTENTALIGNMENT);
				setState(457);
				match(COLON);
				setState(458);
				_la = _input.LA(1);
				if ( !(((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & 87960930222081L) != 0)) ) {
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
				setState(459);
				childProperty();
				}
				break;
			case DECORATION:
				_localctx = new ContainerDecorationContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(460);
				decorationProperty();
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
	public static class DecorationPropertyContext extends ParserRuleContext {
		public TerminalNode DECORATION() { return getToken(DartParser.DECORATION, 0); }
		public TerminalNode COLON() { return getToken(DartParser.COLON, 0); }
		public BoxDecorationContext boxDecoration() {
			return getRuleContext(BoxDecorationContext.class,0);
		}
		public DecorationPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decorationProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterDecorationProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitDecorationProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitDecorationProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecorationPropertyContext decorationProperty() throws RecognitionException {
		DecorationPropertyContext _localctx = new DecorationPropertyContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_decorationProperty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(463);
			match(DECORATION);
			setState(464);
			match(COLON);
			setState(465);
			boxDecoration();
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterBoxDecoration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitBoxDecoration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitBoxDecoration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoxDecorationContext boxDecoration() throws RecognitionException {
		BoxDecorationContext _localctx = new BoxDecorationContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_boxDecoration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(467);
			match(BOXDECORATION);
			setState(468);
			match(LP);
			setState(480);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLOR || _la==BORDERRADIUS) {
				{
				setState(469);
				boxDecorationProperties();
				setState(474);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(470);
						match(COMMA);
						setState(471);
						boxDecorationProperties();
						}
						} 
					}
					setState(476);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
				}
				setState(478);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(477);
					match(COMMA);
					}
				}

				}
			}

			setState(482);
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
		public ColorPropertyContext colorProperty() {
			return getRuleContext(ColorPropertyContext.class,0);
		}
		public BorderRadiusPropertyContext borderRadiusProperty() {
			return getRuleContext(BorderRadiusPropertyContext.class,0);
		}
		public BoxDecorationPropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boxDecorationProperties; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterBoxDecorationProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitBoxDecorationProperties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitBoxDecorationProperties(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoxDecorationPropertiesContext boxDecorationProperties() throws RecognitionException {
		BoxDecorationPropertiesContext _localctx = new BoxDecorationPropertiesContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_boxDecorationProperties);
		try {
			setState(486);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COLOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(484);
				colorProperty();
				}
				break;
			case BORDERRADIUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(485);
				borderRadiusProperty();
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
	public static class BorderRadiusPropertyContext extends ParserRuleContext {
		public TerminalNode BORDERRADIUS() { return getToken(DartParser.BORDERRADIUS, 0); }
		public TerminalNode COLON() { return getToken(DartParser.COLON, 0); }
		public BorderRadiusContext borderRadius() {
			return getRuleContext(BorderRadiusContext.class,0);
		}
		public BorderRadiusPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_borderRadiusProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterBorderRadiusProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitBorderRadiusProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitBorderRadiusProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BorderRadiusPropertyContext borderRadiusProperty() throws RecognitionException {
		BorderRadiusPropertyContext _localctx = new BorderRadiusPropertyContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_borderRadiusProperty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(488);
			match(BORDERRADIUS);
			setState(489);
			match(COLON);
			setState(490);
			borderRadius();
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterBorderRadius(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitBorderRadius(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitBorderRadius(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BorderRadiusContext borderRadius() throws RecognitionException {
		BorderRadiusContext _localctx = new BorderRadiusContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_borderRadius);
		try {
			setState(494);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BORDERRADIUSONLY:
				enterOuterAlt(_localctx, 1);
				{
				setState(492);
				borderRadiusOnly();
				}
				break;
			case BORDERRADIUSCIRCULAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(493);
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
		public TerminalNode RP() { return getToken(DartParser.RP, 0); }
		public BorderRadiusCircularRadiusPropertyContext borderRadiusCircularRadiusProperty() {
			return getRuleContext(BorderRadiusCircularRadiusPropertyContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(DartParser.COMMA, 0); }
		public BorderRadiusCircularContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_borderRadiusCircular; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterBorderRadiusCircular(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitBorderRadiusCircular(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitBorderRadiusCircular(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BorderRadiusCircularContext borderRadiusCircular() throws RecognitionException {
		BorderRadiusCircularContext _localctx = new BorderRadiusCircularContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_borderRadiusCircular);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(496);
			match(BORDERRADIUSCIRCULAR);
			setState(497);
			match(LP);
			setState(502);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RADIUS) {
				{
				setState(498);
				borderRadiusCircularRadiusProperty();
				setState(500);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(499);
					match(COMMA);
					}
				}

				}
			}

			setState(504);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterBorderRadiusOnly(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitBorderRadiusOnly(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitBorderRadiusOnly(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BorderRadiusOnlyContext borderRadiusOnly() throws RecognitionException {
		BorderRadiusOnlyContext _localctx = new BorderRadiusOnlyContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_borderRadiusOnly);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(506);
			match(BORDERRADIUSONLY);
			setState(507);
			match(LP);
			setState(519);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & 15L) != 0)) {
				{
				setState(508);
				borderRadiusOnlyProperties();
				setState(513);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(509);
						match(COMMA);
						setState(510);
						borderRadiusOnlyProperties();
						}
						} 
					}
					setState(515);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
				}
				setState(517);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(516);
					match(COMMA);
					}
				}

				}
			}

			setState(521);
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
	public static class BorderRadiusCircularRadiusPropertyContext extends ParserRuleContext {
		public TerminalNode RADIUS() { return getToken(DartParser.RADIUS, 0); }
		public TerminalNode COLON() { return getToken(DartParser.COLON, 0); }
		public TerminalNode NUM() { return getToken(DartParser.NUM, 0); }
		public TerminalNode FLOAT() { return getToken(DartParser.FLOAT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(DartParser.IDENTIFIER, 0); }
		public BorderRadiusCircularRadiusPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_borderRadiusCircularRadiusProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterBorderRadiusCircularRadiusProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitBorderRadiusCircularRadiusProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitBorderRadiusCircularRadiusProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BorderRadiusCircularRadiusPropertyContext borderRadiusCircularRadiusProperty() throws RecognitionException {
		BorderRadiusCircularRadiusPropertyContext _localctx = new BorderRadiusCircularRadiusPropertyContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_borderRadiusCircularRadiusProperty);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(523);
			match(RADIUS);
			setState(524);
			match(COLON);
			setState(525);
			_la = _input.LA(1);
			if ( !(((((_la - 126)) & ~0x3f) == 0 && ((1L << (_la - 126)) & 35L) != 0)) ) {
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
		public TerminalNode IDENTIFIER() { return getToken(DartParser.IDENTIFIER, 0); }
		public BorderRadiusOnlyTopLeftContext(BorderRadiusOnlyPropertiesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterBorderRadiusOnlyTopLeft(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitBorderRadiusOnlyTopLeft(this);
		}
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
		public TerminalNode IDENTIFIER() { return getToken(DartParser.IDENTIFIER, 0); }
		public BorderRadiusOnlyBottomRightContext(BorderRadiusOnlyPropertiesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterBorderRadiusOnlyBottomRight(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitBorderRadiusOnlyBottomRight(this);
		}
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
		public TerminalNode IDENTIFIER() { return getToken(DartParser.IDENTIFIER, 0); }
		public BorderRadiusOnlyTopRightContext(BorderRadiusOnlyPropertiesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterBorderRadiusOnlyTopRight(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitBorderRadiusOnlyTopRight(this);
		}
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
		public TerminalNode IDENTIFIER() { return getToken(DartParser.IDENTIFIER, 0); }
		public BorderRadiusOnlyBottomLeftContext(BorderRadiusOnlyPropertiesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterBorderRadiusOnlyBottomLeft(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitBorderRadiusOnlyBottomLeft(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitBorderRadiusOnlyBottomLeft(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BorderRadiusOnlyPropertiesContext borderRadiusOnlyProperties() throws RecognitionException {
		BorderRadiusOnlyPropertiesContext _localctx = new BorderRadiusOnlyPropertiesContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_borderRadiusOnlyProperties);
		int _la;
		try {
			setState(539);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TOPRIGHT:
				_localctx = new BorderRadiusOnlyTopRightContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(527);
				match(TOPRIGHT);
				setState(528);
				match(COLON);
				setState(529);
				_la = _input.LA(1);
				if ( !(_la==NUM || _la==IDENTIFIER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case TOPLEFT:
				_localctx = new BorderRadiusOnlyTopLeftContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(530);
				match(TOPLEFT);
				setState(531);
				match(COLON);
				setState(532);
				_la = _input.LA(1);
				if ( !(_la==NUM || _la==IDENTIFIER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case BOTTOMRIGHT:
				_localctx = new BorderRadiusOnlyBottomRightContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(533);
				match(BOTTOMRIGHT);
				setState(534);
				match(COLON);
				setState(535);
				_la = _input.LA(1);
				if ( !(_la==NUM || _la==IDENTIFIER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case BOTTOMLEFT:
				_localctx = new BorderRadiusOnlyBottomLeftContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(536);
				match(BOTTOMLEFT);
				setState(537);
				match(COLON);
				setState(538);
				_la = _input.LA(1);
				if ( !(_la==NUM || _la==IDENTIFIER) ) {
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterExpanded(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitExpanded(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitExpanded(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpandedContext expanded() throws RecognitionException {
		ExpandedContext _localctx = new ExpandedContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_expanded);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(541);
			match(EXPANDED);
			setState(542);
			match(LP);
			setState(554);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CHILD || _la==FLEX) {
				{
				setState(543);
				expandedProperties();
				setState(548);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(544);
						match(COMMA);
						setState(545);
						expandedProperties();
						}
						} 
					}
					setState(550);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
				}
				setState(552);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(551);
					match(COMMA);
					}
				}

				}
			}

			setState(556);
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
		public TerminalNode IDENTIFIER() { return getToken(DartParser.IDENTIFIER, 0); }
		public ExpandedFlexContext(ExpandedPropertiesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterExpandedFlex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitExpandedFlex(this);
		}
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterExpandedChild(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitExpandedChild(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitExpandedChild(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpandedPropertiesContext expandedProperties() throws RecognitionException {
		ExpandedPropertiesContext _localctx = new ExpandedPropertiesContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_expandedProperties);
		int _la;
		try {
			setState(562);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FLEX:
				_localctx = new ExpandedFlexContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(558);
				match(FLEX);
				setState(559);
				match(COLON);
				setState(560);
				_la = _input.LA(1);
				if ( !(_la==NUM || _la==IDENTIFIER) ) {
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
				_localctx = new ExpandedChildContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(561);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterGestureDetector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitGestureDetector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitGestureDetector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GestureDetectorContext gestureDetector() throws RecognitionException {
		GestureDetectorContext _localctx = new GestureDetectorContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_gestureDetector);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(564);
			match(GESTUREDETECTOR);
			setState(565);
			match(LP);
			setState(577);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CHILD || _la==ONPRESSED) {
				{
				setState(566);
				gestureDetectorProperties();
				setState(571);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(567);
						match(COMMA);
						setState(568);
						gestureDetectorProperties();
						}
						} 
					}
					setState(573);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
				}
				setState(575);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(574);
					match(COMMA);
					}
				}

				}
			}

			setState(579);
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
		public GestureDetectorPropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gestureDetectorProperties; }
	 
		public GestureDetectorPropertiesContext() { }
		public void copyFrom(GestureDetectorPropertiesContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GestureDetectorOnPressedContext extends GestureDetectorPropertiesContext {
		public OnPressedPropertyContext onPressedProperty() {
			return getRuleContext(OnPressedPropertyContext.class,0);
		}
		public GestureDetectorOnPressedContext(GestureDetectorPropertiesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterGestureDetectorOnPressed(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitGestureDetectorOnPressed(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitGestureDetectorOnPressed(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GestureDetectorChildContext extends GestureDetectorPropertiesContext {
		public ChildPropertyContext childProperty() {
			return getRuleContext(ChildPropertyContext.class,0);
		}
		public GestureDetectorChildContext(GestureDetectorPropertiesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterGestureDetectorChild(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitGestureDetectorChild(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitGestureDetectorChild(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GestureDetectorPropertiesContext gestureDetectorProperties() throws RecognitionException {
		GestureDetectorPropertiesContext _localctx = new GestureDetectorPropertiesContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_gestureDetectorProperties);
		try {
			setState(583);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ONPRESSED:
				_localctx = new GestureDetectorOnPressedContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(581);
				onPressedProperty();
				}
				break;
			case CHILD:
				_localctx = new GestureDetectorChildContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(582);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterPadding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitPadding(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitPadding(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PaddingContext padding() throws RecognitionException {
		PaddingContext _localctx = new PaddingContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_padding);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(585);
			match(PADDING);
			setState(586);
			match(LP);
			setState(598);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CHILD || _la==PADDINGATTR) {
				{
				setState(587);
				paddingProprtey();
				setState(592);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(588);
						match(COMMA);
						setState(589);
						paddingProprtey();
						}
						} 
					}
					setState(594);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
				}
				setState(596);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(595);
					match(COMMA);
					}
				}

				}
			}

			setState(600);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterPaddingPadding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitPaddingPadding(this);
		}
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterPaddingChild(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitPaddingChild(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitPaddingChild(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PaddingProprteyContext paddingProprtey() throws RecognitionException {
		PaddingProprteyContext _localctx = new PaddingProprteyContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_paddingProprtey);
		try {
			setState(606);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PADDINGATTR:
				_localctx = new PaddingPaddingContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(602);
				match(PADDINGATTR);
				setState(603);
				match(COLON);
				setState(604);
				edgeInsets();
				}
				break;
			case CHILD:
				_localctx = new PaddingChildContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(605);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterEdgeInsetsOnly(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitEdgeInsetsOnly(this);
		}
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterEdgeInsetsSymetric(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitEdgeInsetsSymetric(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitEdgeInsetsSymetric(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EdgeInsetsContext edgeInsets() throws RecognitionException {
		EdgeInsetsContext _localctx = new EdgeInsetsContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_edgeInsets);
		int _la;
		try {
			int _alt;
			setState(640);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EDGE_INSETS_ONLY:
				_localctx = new EdgeInsetsOnlyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(608);
				match(EDGE_INSETS_ONLY);
				setState(609);
				match(LP);
				setState(621);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 109)) & ~0x3f) == 0 && ((1L << (_la - 109)) & 15L) != 0)) {
					{
					setState(610);
					edgeInsetsOnlyProperties();
					setState(615);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(611);
							match(COMMA);
							setState(612);
							edgeInsetsOnlyProperties();
							}
							} 
						}
						setState(617);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
					}
					setState(619);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(618);
						match(COMMA);
						}
					}

					}
				}

				setState(623);
				match(RP);
				}
				break;
			case EDGE_INSETS_SYMMETRIC:
				_localctx = new EdgeInsetsSymetricContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(624);
				match(EDGE_INSETS_SYMMETRIC);
				setState(625);
				match(LP);
				setState(637);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==HORIZONTAL || _la==VERTICAL) {
					{
					setState(626);
					edgeInsetsSymetricProperties();
					setState(631);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(627);
							match(COMMA);
							setState(628);
							edgeInsetsSymetricProperties();
							}
							} 
						}
						setState(633);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
					}
					setState(635);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(634);
						match(COMMA);
						}
					}

					}
				}

				setState(639);
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
		public TerminalNode FLOAT() { return getToken(DartParser.FLOAT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(DartParser.IDENTIFIER, 0); }
		public EdgeInsetsOnlyRightContext(EdgeInsetsOnlyPropertiesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterEdgeInsetsOnlyRight(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitEdgeInsetsOnlyRight(this);
		}
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
		public TerminalNode FLOAT() { return getToken(DartParser.FLOAT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(DartParser.IDENTIFIER, 0); }
		public EdgeInsetsOnlyBottomContext(EdgeInsetsOnlyPropertiesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterEdgeInsetsOnlyBottom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitEdgeInsetsOnlyBottom(this);
		}
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
		public TerminalNode FLOAT() { return getToken(DartParser.FLOAT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(DartParser.IDENTIFIER, 0); }
		public EdgeInsetsOnlyTopContext(EdgeInsetsOnlyPropertiesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterEdgeInsetsOnlyTop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitEdgeInsetsOnlyTop(this);
		}
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
		public TerminalNode FLOAT() { return getToken(DartParser.FLOAT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(DartParser.IDENTIFIER, 0); }
		public EdgeInsetsOnlyLeftContext(EdgeInsetsOnlyPropertiesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterEdgeInsetsOnlyLeft(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitEdgeInsetsOnlyLeft(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitEdgeInsetsOnlyLeft(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EdgeInsetsOnlyPropertiesContext edgeInsetsOnlyProperties() throws RecognitionException {
		EdgeInsetsOnlyPropertiesContext _localctx = new EdgeInsetsOnlyPropertiesContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_edgeInsetsOnlyProperties);
		int _la;
		try {
			setState(654);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TOP:
				_localctx = new EdgeInsetsOnlyTopContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(642);
				match(TOP);
				setState(643);
				match(COLON);
				setState(644);
				_la = _input.LA(1);
				if ( !(((((_la - 126)) & ~0x3f) == 0 && ((1L << (_la - 126)) & 35L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case LEFT:
				_localctx = new EdgeInsetsOnlyLeftContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(645);
				match(LEFT);
				setState(646);
				match(COLON);
				setState(647);
				_la = _input.LA(1);
				if ( !(((((_la - 126)) & ~0x3f) == 0 && ((1L << (_la - 126)) & 35L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case RIGHT:
				_localctx = new EdgeInsetsOnlyRightContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(648);
				match(RIGHT);
				setState(649);
				match(COLON);
				setState(650);
				_la = _input.LA(1);
				if ( !(((((_la - 126)) & ~0x3f) == 0 && ((1L << (_la - 126)) & 35L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case BOTTOM:
				_localctx = new EdgeInsetsOnlyBottomContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(651);
				match(BOTTOM);
				setState(652);
				match(COLON);
				setState(653);
				_la = _input.LA(1);
				if ( !(((((_la - 126)) & ~0x3f) == 0 && ((1L << (_la - 126)) & 35L) != 0)) ) {
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
		public TerminalNode FLOAT() { return getToken(DartParser.FLOAT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(DartParser.IDENTIFIER, 0); }
		public EdgeInsetsSymetricHorizontalContext(EdgeInsetsSymetricPropertiesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterEdgeInsetsSymetricHorizontal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitEdgeInsetsSymetricHorizontal(this);
		}
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
		public TerminalNode FLOAT() { return getToken(DartParser.FLOAT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(DartParser.IDENTIFIER, 0); }
		public EdgeInsetsSymetricVerticalContext(EdgeInsetsSymetricPropertiesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterEdgeInsetsSymetricVertical(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitEdgeInsetsSymetricVertical(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitEdgeInsetsSymetricVertical(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EdgeInsetsSymetricPropertiesContext edgeInsetsSymetricProperties() throws RecognitionException {
		EdgeInsetsSymetricPropertiesContext _localctx = new EdgeInsetsSymetricPropertiesContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_edgeInsetsSymetricProperties);
		int _la;
		try {
			setState(662);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HORIZONTAL:
				_localctx = new EdgeInsetsSymetricHorizontalContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(656);
				match(HORIZONTAL);
				setState(657);
				match(COLON);
				setState(658);
				_la = _input.LA(1);
				if ( !(((((_la - 126)) & ~0x3f) == 0 && ((1L << (_la - 126)) & 35L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case VERTICAL:
				_localctx = new EdgeInsetsSymetricVerticalContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(659);
				match(VERTICAL);
				setState(660);
				match(COLON);
				setState(661);
				_la = _input.LA(1);
				if ( !(((((_la - 126)) & ~0x3f) == 0 && ((1L << (_la - 126)) & 35L) != 0)) ) {
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterImage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitImage(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitImage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImageContext image() throws RecognitionException {
		ImageContext _localctx = new ImageContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_image);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(664);
			match(IMAGE);
			setState(665);
			match(LP);
			setState(677);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 63)) & ~0x3f) == 0 && ((1L << (_la - 63)) & 6291459L) != 0)) {
				{
				setState(666);
				imageProperties();
				setState(671);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(667);
						match(COMMA);
						setState(668);
						imageProperties();
						}
						} 
					}
					setState(673);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
				}
				setState(675);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(674);
					match(COMMA);
					}
				}

				}
			}

			setState(679);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterImageHeight(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitImageHeight(this);
		}
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterImageWidth(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitImageWidth(this);
		}
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
		public TerminalNode IDENTIFIER() { return getToken(DartParser.IDENTIFIER, 0); }
		public ImageUrlContext(ImagePropertiesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterImageUrl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitImageUrl(this);
		}
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterImageFit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitImageFit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitImageFit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImagePropertiesContext imageProperties() throws RecognitionException {
		ImagePropertiesContext _localctx = new ImagePropertiesContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_imageProperties);
		int _la;
		try {
			setState(689);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case URL:
				_localctx = new ImageUrlContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(681);
				match(URL);
				setState(682);
				match(COLON);
				setState(683);
				_la = _input.LA(1);
				if ( !(_la==STRING || _la==IDENTIFIER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case FIT:
				_localctx = new ImageFitContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(684);
				match(FIT);
				setState(685);
				match(COLON);
				setState(686);
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
				setState(687);
				widthProperty();
				}
				break;
			case HEIGHT:
				_localctx = new ImageHeightContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(688);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterButton(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitButton(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitButton(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ButtonContext button() throws RecognitionException {
		ButtonContext _localctx = new ButtonContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_button);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(691);
			match(BUTTON);
			setState(692);
			match(LP);
			setState(704);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 63)) & ~0x3f) == 0 && ((1L << (_la - 63)) & 1132462083L) != 0)) {
				{
				setState(693);
				buttonProperties();
				setState(698);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(694);
						match(COMMA);
						setState(695);
						buttonProperties();
						}
						} 
					}
					setState(700);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
				}
				setState(702);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(701);
					match(COMMA);
					}
				}

				}
			}

			setState(706);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterButtonHeight(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitButtonHeight(this);
		}
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterButtonWidth(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitButtonWidth(this);
		}
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterButtonTitleColor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitButtonTitleColor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitButtonTitleColor(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ButtonOnPressedContext extends ButtonPropertiesContext {
		public OnPressedPropertyContext onPressedProperty() {
			return getRuleContext(OnPressedPropertyContext.class,0);
		}
		public ButtonOnPressedContext(ButtonPropertiesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterButtonOnPressed(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitButtonOnPressed(this);
		}
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterButtonBackgroundColor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitButtonBackgroundColor(this);
		}
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
		public TerminalNode IDENTIFIER() { return getToken(DartParser.IDENTIFIER, 0); }
		public ButtonTitleContext(ButtonPropertiesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterButtonTitle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitButtonTitle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitButtonTitle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ButtonPropertiesContext buttonProperties() throws RecognitionException {
		ButtonPropertiesContext _localctx = new ButtonPropertiesContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_buttonProperties);
		int _la;
		try {
			setState(720);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WIDTH:
				_localctx = new ButtonWidthContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(708);
				widthProperty();
				}
				break;
			case HEIGHT:
				_localctx = new ButtonHeightContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(709);
				heightProperty();
				}
				break;
			case TITLE:
				_localctx = new ButtonTitleContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(710);
				match(TITLE);
				setState(711);
				match(COLON);
				setState(712);
				_la = _input.LA(1);
				if ( !(_la==STRING || _la==IDENTIFIER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case BACKGROUND_COLOR:
				_localctx = new ButtonBackgroundColorContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(713);
				match(BACKGROUND_COLOR);
				setState(714);
				match(COLON);
				setState(715);
				match(HEX_NUM);
				}
				break;
			case TITLE_COLOR:
				_localctx = new ButtonTitleColorContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(716);
				match(TITLE_COLOR);
				setState(717);
				match(COLON);
				setState(718);
				match(HEX_NUM);
				}
				break;
			case ONPRESSED:
				_localctx = new ButtonOnPressedContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(719);
				onPressedProperty();
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterTextField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitTextField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitTextField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextFieldContext textField() throws RecognitionException {
		TextFieldContext _localctx = new TextFieldContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_textField);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(722);
			match(TEXTFIELD);
			setState(723);
			match(LP);
			setState(735);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & 8798760599553L) != 0)) {
				{
				setState(724);
				textFieldProperties();
				setState(729);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(725);
						match(COMMA);
						setState(726);
						textFieldProperties();
						}
						} 
					}
					setState(731);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
				}
				setState(733);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(732);
					match(COMMA);
					}
				}

				}
			}

			setState(737);
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
		public TerminalNode IDENTIFIER() { return getToken(DartParser.IDENTIFIER, 0); }
		public TextFieldHintContext(TextFieldPropertiesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterTextFieldHint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitTextFieldHint(this);
		}
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterTextFieldTextColor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitTextFieldTextColor(this);
		}
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterTextFieldBorder(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitTextFieldBorder(this);
		}
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
		public TerminalNode IDENTIFIER() { return getToken(DartParser.IDENTIFIER, 0); }
		public TextFieldLabelContext(TextFieldPropertiesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterTextFieldLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitTextFieldLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitTextFieldLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TextFieldIDContext extends TextFieldPropertiesContext {
		public IdPropertyContext idProperty() {
			return getRuleContext(IdPropertyContext.class,0);
		}
		public TextFieldIDContext(TextFieldPropertiesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterTextFieldID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitTextFieldID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitTextFieldID(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TextFieldValueContext extends TextFieldPropertiesContext {
		public TerminalNode VALUE() { return getToken(DartParser.VALUE, 0); }
		public TerminalNode COLON() { return getToken(DartParser.COLON, 0); }
		public TerminalNode STRING() { return getToken(DartParser.STRING, 0); }
		public TerminalNode IDENTIFIER() { return getToken(DartParser.IDENTIFIER, 0); }
		public TextFieldValueContext(TextFieldPropertiesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterTextFieldValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitTextFieldValue(this);
		}
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterTextFieldPadding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitTextFieldPadding(this);
		}
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
		public TextFieldOnChangedContext(TextFieldPropertiesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterTextFieldOnChanged(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitTextFieldOnChanged(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitTextFieldOnChanged(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextFieldPropertiesContext textFieldProperties() throws RecognitionException {
		TextFieldPropertiesContext _localctx = new TextFieldPropertiesContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_textFieldProperties);
		int _la;
		try {
			setState(777);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VALUE:
				_localctx = new TextFieldValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(739);
				match(VALUE);
				setState(740);
				match(COLON);
				setState(741);
				_la = _input.LA(1);
				if ( !(_la==STRING || _la==IDENTIFIER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case LABEL:
				_localctx = new TextFieldLabelContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(742);
				match(LABEL);
				setState(743);
				match(COLON);
				setState(744);
				_la = _input.LA(1);
				if ( !(_la==STRING || _la==IDENTIFIER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case TEXTCOLOR:
				_localctx = new TextFieldTextColorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(745);
				match(TEXTCOLOR);
				setState(746);
				match(COLON);
				setState(747);
				match(HEX_NUM);
				}
				break;
			case PADDINGATTR:
				_localctx = new TextFieldPaddingContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(748);
				match(PADDINGATTR);
				setState(749);
				match(COLON);
				setState(750);
				edgeInsets();
				}
				break;
			case HINT:
				_localctx = new TextFieldHintContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(751);
				match(HINT);
				setState(752);
				match(COLON);
				setState(753);
				_la = _input.LA(1);
				if ( !(_la==STRING || _la==IDENTIFIER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case BORDERATRI:
				_localctx = new TextFieldBorderContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(754);
				match(BORDERATRI);
				setState(755);
				match(COLON);
				setState(756);
				border();
				}
				break;
			case ONCHANGED:
				_localctx = new TextFieldOnChangedContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(757);
				match(ONCHANGED);
				setState(758);
				match(COLON);
				setState(759);
				match(LP);
				setState(764);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENTIFIER) {
					{
					{
					setState(760);
					match(IDENTIFIER);
					setState(761);
					match(COMMA);
					}
					}
					setState(766);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(767);
				match(RP);
				setState(768);
				match(OB);
				setState(772);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 106045697475739648L) != 0) || ((((_la - 121)) & ~0x3f) == 0 && ((1L << (_la - 121)) & 1039L) != 0)) {
					{
					{
					setState(769);
					statment();
					}
					}
					setState(774);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(775);
				match(CB);
				}
				break;
			case ID:
				_localctx = new TextFieldIDContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(776);
				idProperty();
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
	public static class IdPropertyContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DartParser.ID, 0); }
		public TerminalNode COLON() { return getToken(DartParser.COLON, 0); }
		public TerminalNode STRING() { return getToken(DartParser.STRING, 0); }
		public TerminalNode IDENTIFIER() { return getToken(DartParser.IDENTIFIER, 0); }
		public IdPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterIdProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitIdProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitIdProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdPropertyContext idProperty() throws RecognitionException {
		IdPropertyContext _localctx = new IdPropertyContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_idProperty);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(779);
			match(ID);
			setState(780);
			match(COLON);
			setState(781);
			_la = _input.LA(1);
			if ( !(_la==STRING || _la==IDENTIFIER) ) {
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterBorder(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitBorder(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitBorder(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BorderContext border() throws RecognitionException {
		BorderContext _localctx = new BorderContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_border);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(783);
			match(BORDER);
			setState(784);
			match(LP);
			setState(796);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & 4294967299L) != 0)) {
				{
				setState(785);
				borderProperties();
				setState(790);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,88,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(786);
						match(COMMA);
						setState(787);
						borderProperties();
						}
						} 
					}
					setState(792);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,88,_ctx);
				}
				setState(794);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(793);
					match(COMMA);
					}
				}

				}
			}

			setState(798);
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
		public TerminalNode IDENTIFIER() { return getToken(DartParser.IDENTIFIER, 0); }
		public BorderThicknessContext(BorderPropertiesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterBorderThickness(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitBorderThickness(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitBorderThickness(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BorderBorderRadiusContext extends BorderPropertiesContext {
		public BorderRadiusPropertyContext borderRadiusProperty() {
			return getRuleContext(BorderRadiusPropertyContext.class,0);
		}
		public BorderBorderRadiusContext(BorderPropertiesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterBorderBorderRadius(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitBorderBorderRadius(this);
		}
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterBorderColor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitBorderColor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitBorderColor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BorderPropertiesContext borderProperties() throws RecognitionException {
		BorderPropertiesContext _localctx = new BorderPropertiesContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_borderProperties);
		int _la;
		try {
			setState(805);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case THICKNESS:
				_localctx = new BorderThicknessContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(800);
				match(THICKNESS);
				setState(801);
				match(COLON);
				setState(802);
				_la = _input.LA(1);
				if ( !(_la==NUM || _la==IDENTIFIER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case BORDERRADIUS:
				_localctx = new BorderBorderRadiusContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(803);
				borderRadiusProperty();
				}
				break;
			case COLOR:
				_localctx = new BorderColorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(804);
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
	public static class IfContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(DartParser.IF, 0); }
		public TerminalNode LP() { return getToken(DartParser.LP, 0); }
		public TerminalNode RP() { return getToken(DartParser.RP, 0); }
		public List<IfPropertiesContext> ifProperties() {
			return getRuleContexts(IfPropertiesContext.class);
		}
		public IfPropertiesContext ifProperties(int i) {
			return getRuleContext(IfPropertiesContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DartParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DartParser.COMMA, i);
		}
		public IfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfContext if_() throws RecognitionException {
		IfContext _localctx = new IfContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_if);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(807);
			match(IF);
			setState(808);
			match(LP);
			{
			setState(809);
			ifProperties();
			setState(814);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,92,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(810);
					match(COMMA);
					setState(811);
					ifProperties();
					}
					} 
				}
				setState(816);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,92,_ctx);
			}
			setState(818);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(817);
				match(COMMA);
				}
			}

			}
			setState(820);
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
	public static class IfPropertiesContext extends ParserRuleContext {
		public IfPropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifProperties; }
	 
		public IfPropertiesContext() { }
		public void copyFrom(IfPropertiesContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfChildContext extends IfPropertiesContext {
		public ChildPropertyContext childProperty() {
			return getRuleContext(ChildPropertyContext.class,0);
		}
		public IfChildContext(IfPropertiesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterIfChild(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitIfChild(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitIfChild(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfConditionContext extends IfPropertiesContext {
		public TerminalNode CONDITION() { return getToken(DartParser.CONDITION, 0); }
		public TerminalNode COLON() { return getToken(DartParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IfConditionContext(IfPropertiesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterIfCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitIfCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitIfCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfPropertiesContext ifProperties() throws RecognitionException {
		IfPropertiesContext _localctx = new IfPropertiesContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_ifProperties);
		try {
			setState(826);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONDITION:
				_localctx = new IfConditionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(822);
				match(CONDITION);
				setState(823);
				match(COLON);
				setState(824);
				expression();
				}
				break;
			case CHILD:
				_localctx = new IfChildContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(825);
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
	public static class ForContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(DartParser.FOR, 0); }
		public TerminalNode LP() { return getToken(DartParser.LP, 0); }
		public TerminalNode RP() { return getToken(DartParser.RP, 0); }
		public List<ForPropertiesContext> forProperties() {
			return getRuleContexts(ForPropertiesContext.class);
		}
		public ForPropertiesContext forProperties(int i) {
			return getRuleContext(ForPropertiesContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DartParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DartParser.COMMA, i);
		}
		public ForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitFor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForContext for_() throws RecognitionException {
		ForContext _localctx = new ForContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_for);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(828);
			match(FOR);
			setState(829);
			match(LP);
			{
			setState(830);
			forProperties();
			setState(835);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,95,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(831);
					match(COMMA);
					setState(832);
					forProperties();
					}
					} 
				}
				setState(837);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,95,_ctx);
			}
			setState(839);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(838);
				match(COMMA);
				}
			}

			}
			setState(841);
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
	public static class ForPropertiesContext extends ParserRuleContext {
		public ForPropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forProperties; }
	 
		public ForPropertiesContext() { }
		public void copyFrom(ForPropertiesContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForIterationsContext extends ForPropertiesContext {
		public TerminalNode ITERATIONS() { return getToken(DartParser.ITERATIONS, 0); }
		public TerminalNode COLON() { return getToken(DartParser.COLON, 0); }
		public TerminalNode NUM() { return getToken(DartParser.NUM, 0); }
		public TerminalNode IDENTIFIER() { return getToken(DartParser.IDENTIFIER, 0); }
		public ForIterationsContext(ForPropertiesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterForIterations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitForIterations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitForIterations(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForChildContext extends ForPropertiesContext {
		public ChildPropertyContext childProperty() {
			return getRuleContext(ChildPropertyContext.class,0);
		}
		public ForChildContext(ForPropertiesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterForChild(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitForChild(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitForChild(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForPropertiesContext forProperties() throws RecognitionException {
		ForPropertiesContext _localctx = new ForPropertiesContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_forProperties);
		int _la;
		try {
			setState(847);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ITERATIONS:
				_localctx = new ForIterationsContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(843);
				match(ITERATIONS);
				setState(844);
				match(COLON);
				setState(845);
				_la = _input.LA(1);
				if ( !(_la==NUM || _la==IDENTIFIER) ) {
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
				_localctx = new ForChildContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(846);
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
	public static class StatmentContext extends ParserRuleContext {
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public VariableAssignmentContext variableAssignment() {
			return getRuleContext(VariableAssignmentContext.class,0);
		}
		public CustomWidgetDeclarationContext customWidgetDeclaration() {
			return getRuleContext(CustomWidgetDeclarationContext.class,0);
		}
		public NavigationContext navigation() {
			return getRuleContext(NavigationContext.class,0);
		}
		public PopupContext popup() {
			return getRuleContext(PopupContext.class,0);
		}
		public SetStateContext setState() {
			return getRuleContext(SetStateContext.class,0);
		}
		public GetStateXContext getStateX() {
			return getRuleContext(GetStateXContext.class,0);
		}
		public ItemValueContext itemValue() {
			return getRuleContext(ItemValueContext.class,0);
		}
		public TerminalNode SC() { return getToken(DartParser.SC, 0); }
		public SetValueStatementContext setValueStatement() {
			return getRuleContext(SetValueStatementContext.class,0);
		}
		public StatmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterStatment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitStatment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitStatment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatmentContext statment() throws RecognitionException {
		StatmentContext _localctx = new StatmentContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_statment);
		try {
			setState(860);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case STRINGTYPE:
			case DOUBLE:
			case FUNCTION:
				enterOuterAlt(_localctx, 1);
				{
				setState(849);
				variableDeclaration();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(850);
				variableAssignment();
				}
				break;
			case WIDGET:
				enterOuterAlt(_localctx, 3);
				{
				setState(851);
				customWidgetDeclaration();
				}
				break;
			case NAVIGATE_TO:
				enterOuterAlt(_localctx, 4);
				{
				setState(852);
				navigation();
				}
				break;
			case POP_UP:
				enterOuterAlt(_localctx, 5);
				{
				setState(853);
				popup();
				}
				break;
			case GETXDOTSET:
				enterOuterAlt(_localctx, 6);
				{
				setState(854);
				setState();
				}
				break;
			case GETXDOTGET:
				enterOuterAlt(_localctx, 7);
				{
				setState(855);
				getStateX();
				}
				break;
			case ITEMVALUE:
				enterOuterAlt(_localctx, 8);
				{
				setState(856);
				itemValue();
				setState(857);
				match(SC);
				}
				break;
			case SETVALUE:
				enterOuterAlt(_localctx, 9);
				{
				setState(859);
				setValueStatement();
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
	public static class SetValueStatementContext extends ParserRuleContext {
		public TerminalNode SETVALUE() { return getToken(DartParser.SETVALUE, 0); }
		public TerminalNode LP() { return getToken(DartParser.LP, 0); }
		public TerminalNode STRING() { return getToken(DartParser.STRING, 0); }
		public TerminalNode COMMA() { return getToken(DartParser.COMMA, 0); }
		public GetStateXContext getStateX() {
			return getRuleContext(GetStateXContext.class,0);
		}
		public TerminalNode RP() { return getToken(DartParser.RP, 0); }
		public TerminalNode SC() { return getToken(DartParser.SC, 0); }
		public SetValueStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setValueStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterSetValueStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitSetValueStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitSetValueStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetValueStatementContext setValueStatement() throws RecognitionException {
		SetValueStatementContext _localctx = new SetValueStatementContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_setValueStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(862);
			match(SETVALUE);
			setState(863);
			match(LP);
			setState(864);
			match(STRING);
			setState(865);
			match(COMMA);
			setState(866);
			getStateX();
			setState(867);
			match(RP);
			setState(868);
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
	public static class SetStateContext extends ParserRuleContext {
		public TerminalNode GETXDOTSET() { return getToken(DartParser.GETXDOTSET, 0); }
		public TerminalNode LP() { return getToken(DartParser.LP, 0); }
		public List<TerminalNode> STRING() { return getTokens(DartParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(DartParser.STRING, i);
		}
		public TerminalNode COMMA() { return getToken(DartParser.COMMA, 0); }
		public TerminalNode RP() { return getToken(DartParser.RP, 0); }
		public TerminalNode SC() { return getToken(DartParser.SC, 0); }
		public TerminalNode NUM() { return getToken(DartParser.NUM, 0); }
		public ItemValueContext itemValue() {
			return getRuleContext(ItemValueContext.class,0);
		}
		public SetStateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setState; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterSetState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitSetState(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitSetState(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetStateContext setState() throws RecognitionException {
		SetStateContext _localctx = new SetStateContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_setState);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(870);
			match(GETXDOTSET);
			setState(871);
			match(LP);
			setState(872);
			match(STRING);
			setState(873);
			match(COMMA);
			setState(877);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM:
				{
				setState(874);
				match(NUM);
				}
				break;
			case STRING:
				{
				setState(875);
				match(STRING);
				}
				break;
			case ITEMVALUE:
				{
				setState(876);
				itemValue();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(879);
			match(RP);
			setState(880);
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
	public static class GetStateXContext extends ParserRuleContext {
		public TerminalNode GETXDOTGET() { return getToken(DartParser.GETXDOTGET, 0); }
		public TerminalNode LP() { return getToken(DartParser.LP, 0); }
		public TerminalNode STRING() { return getToken(DartParser.STRING, 0); }
		public TerminalNode RP() { return getToken(DartParser.RP, 0); }
		public GetStateXContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getStateX; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterGetStateX(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitGetStateX(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitGetStateX(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GetStateXContext getStateX() throws RecognitionException {
		GetStateXContext _localctx = new GetStateXContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_getStateX);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(882);
			match(GETXDOTGET);
			setState(883);
			match(LP);
			setState(884);
			match(STRING);
			setState(885);
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
	public static class ItemValueContext extends ParserRuleContext {
		public TerminalNode ITEMVALUE() { return getToken(DartParser.ITEMVALUE, 0); }
		public TerminalNode LP() { return getToken(DartParser.LP, 0); }
		public TerminalNode STRING() { return getToken(DartParser.STRING, 0); }
		public TerminalNode RP() { return getToken(DartParser.RP, 0); }
		public ItemValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_itemValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterItemValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitItemValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitItemValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ItemValueContext itemValue() throws RecognitionException {
		ItemValueContext _localctx = new ItemValueContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_itemValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(887);
			match(ITEMVALUE);
			setState(888);
			match(LP);
			setState(889);
			match(STRING);
			setState(890);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterNonFunctionVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitNonFunctionVariableDeclaration(this);
		}
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterFunctionVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitFunctionVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitFunctionVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_variableDeclaration);
		int _la;
		try {
			setState(907);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case STRINGTYPE:
			case DOUBLE:
				_localctx = new NonFunctionVariableDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(892);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 31525197391593472L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(893);
				match(IDENTIFIER);
				setState(894);
				match(SC);
				}
				break;
			case FUNCTION:
				_localctx = new FunctionVariableDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(895);
				match(FUNCTION);
				setState(896);
				match(LP);
				setState(901);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 31525197391593472L) != 0)) {
					{
					{
					setState(897);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 31525197391593472L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(898);
					match(COMMA);
					}
					}
					setState(903);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(904);
				match(RP);
				setState(905);
				match(IDENTIFIER);
				setState(906);
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
		public TerminalNode MINUS() { return getToken(DartParser.MINUS, 0); }
		public VariableAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterVariableAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitVariableAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitVariableAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableAssignmentContext variableAssignment() throws RecognitionException {
		VariableAssignmentContext _localctx = new VariableAssignmentContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_variableAssignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(909);
			match(IDENTIFIER);
			setState(910);
			match(EQL);
			setState(917);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
			case NUM:
				{
				setState(912);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(911);
					match(MINUS);
					}
				}

				setState(914);
				match(NUM);
				}
				break;
			case FLOAT:
				{
				setState(915);
				match(FLOAT);
				}
				break;
			case STRING:
				{
				setState(916);
				match(STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(919);
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
	public static class NavigationContext extends ParserRuleContext {
		public TerminalNode NAVIGATE_TO() { return getToken(DartParser.NAVIGATE_TO, 0); }
		public TerminalNode LP() { return getToken(DartParser.LP, 0); }
		public TerminalNode STRING() { return getToken(DartParser.STRING, 0); }
		public TerminalNode RP() { return getToken(DartParser.RP, 0); }
		public TerminalNode SC() { return getToken(DartParser.SC, 0); }
		public NavigationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_navigation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterNavigation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitNavigation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitNavigation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NavigationContext navigation() throws RecognitionException {
		NavigationContext _localctx = new NavigationContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_navigation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(921);
			match(NAVIGATE_TO);
			setState(922);
			match(LP);
			setState(923);
			match(STRING);
			setState(924);
			match(RP);
			setState(925);
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
	public static class PopupContext extends ParserRuleContext {
		public TerminalNode POP_UP() { return getToken(DartParser.POP_UP, 0); }
		public TerminalNode LP() { return getToken(DartParser.LP, 0); }
		public TerminalNode STRING() { return getToken(DartParser.STRING, 0); }
		public TerminalNode RP() { return getToken(DartParser.RP, 0); }
		public TerminalNode SC() { return getToken(DartParser.SC, 0); }
		public PopupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_popup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterPopup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitPopup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitPopup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PopupContext popup() throws RecognitionException {
		PopupContext _localctx = new PopupContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_popup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(927);
			match(POP_UP);
			setState(928);
			match(LP);
			setState(929);
			match(STRING);
			setState(930);
			match(RP);
			setState(931);
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
	public static class CustomWidgetDeclarationContext extends ParserRuleContext {
		public TerminalNode WIDGET() { return getToken(DartParser.WIDGET, 0); }
		public TerminalNode WIDGETNAME() { return getToken(DartParser.WIDGETNAME, 0); }
		public TerminalNode OB() { return getToken(DartParser.OB, 0); }
		public TerminalNode RETURN() { return getToken(DartParser.RETURN, 0); }
		public TerminalNode LP() { return getToken(DartParser.LP, 0); }
		public WidgetContext widget() {
			return getRuleContext(WidgetContext.class,0);
		}
		public TerminalNode RP() { return getToken(DartParser.RP, 0); }
		public TerminalNode CB() { return getToken(DartParser.CB, 0); }
		public List<VariableDeclarationContext> variableDeclaration() {
			return getRuleContexts(VariableDeclarationContext.class);
		}
		public VariableDeclarationContext variableDeclaration(int i) {
			return getRuleContext(VariableDeclarationContext.class,i);
		}
		public CustomWidgetDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_customWidgetDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterCustomWidgetDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitCustomWidgetDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitCustomWidgetDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CustomWidgetDeclarationContext customWidgetDeclaration() throws RecognitionException {
		CustomWidgetDeclarationContext _localctx = new CustomWidgetDeclarationContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_customWidgetDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(933);
			match(WIDGET);
			setState(934);
			match(WIDGETNAME);
			setState(935);
			match(OB);
			setState(939);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 103582791429521408L) != 0)) {
				{
				{
				setState(936);
				variableDeclaration();
				}
				}
				setState(941);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(942);
			match(RETURN);
			setState(943);
			match(LP);
			setState(944);
			widget();
			setState(945);
			match(RP);
			setState(946);
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
	public static class WidthPropertyContext extends ParserRuleContext {
		public TerminalNode WIDTH() { return getToken(DartParser.WIDTH, 0); }
		public TerminalNode COLON() { return getToken(DartParser.COLON, 0); }
		public TerminalNode NUM() { return getToken(DartParser.NUM, 0); }
		public TerminalNode FLOAT() { return getToken(DartParser.FLOAT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(DartParser.IDENTIFIER, 0); }
		public WidthPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_widthProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterWidthProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitWidthProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitWidthProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WidthPropertyContext widthProperty() throws RecognitionException {
		WidthPropertyContext _localctx = new WidthPropertyContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_widthProperty);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(948);
			match(WIDTH);
			setState(949);
			match(COLON);
			setState(950);
			_la = _input.LA(1);
			if ( !(((((_la - 126)) & ~0x3f) == 0 && ((1L << (_la - 126)) & 35L) != 0)) ) {
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
	public static class HeightPropertyContext extends ParserRuleContext {
		public TerminalNode HEIGHT() { return getToken(DartParser.HEIGHT, 0); }
		public TerminalNode COLON() { return getToken(DartParser.COLON, 0); }
		public TerminalNode NUM() { return getToken(DartParser.NUM, 0); }
		public TerminalNode FLOAT() { return getToken(DartParser.FLOAT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(DartParser.IDENTIFIER, 0); }
		public HeightPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_heightProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterHeightProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitHeightProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitHeightProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeightPropertyContext heightProperty() throws RecognitionException {
		HeightPropertyContext _localctx = new HeightPropertyContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_heightProperty);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(952);
			match(HEIGHT);
			setState(953);
			match(COLON);
			setState(954);
			_la = _input.LA(1);
			if ( !(((((_la - 126)) & ~0x3f) == 0 && ((1L << (_la - 126)) & 35L) != 0)) ) {
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
	public static class ColorPropertyContext extends ParserRuleContext {
		public TerminalNode COLOR() { return getToken(DartParser.COLOR, 0); }
		public TerminalNode COLON() { return getToken(DartParser.COLON, 0); }
		public TerminalNode HEX_NUM() { return getToken(DartParser.HEX_NUM, 0); }
		public ColorPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colorProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterColorProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitColorProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitColorProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColorPropertyContext colorProperty() throws RecognitionException {
		ColorPropertyContext _localctx = new ColorPropertyContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_colorProperty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(956);
			match(COLOR);
			setState(957);
			match(COLON);
			setState(958);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterChildProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitChildProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitChildProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChildPropertyContext childProperty() throws RecognitionException {
		ChildPropertyContext _localctx = new ChildPropertyContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_childProperty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(960);
			match(CHILD);
			setState(961);
			match(COLON);
			setState(962);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterChildrenProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitChildrenProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitChildrenProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChildrenPropertyContext childrenProperty() throws RecognitionException {
		ChildrenPropertyContext _localctx = new ChildrenPropertyContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_childrenProperty);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(964);
			match(CHILDREN);
			setState(965);
			match(COLON);
			setState(966);
			match(OA);
			setState(978);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 66492250980352L) != 0) || _la==WIDGETNAME) {
				{
				setState(967);
				widget();
				setState(972);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,105,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(968);
						match(COMMA);
						setState(969);
						widget();
						}
						} 
					}
					setState(974);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,105,_ctx);
				}
				setState(976);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(975);
					match(COMMA);
					}
				}

				}
			}

			setState(980);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterMainAxisSizeProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitMainAxisSizeProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitMainAxisSizeProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainAxisSizePropertyContext mainAxisSizeProperty() throws RecognitionException {
		MainAxisSizePropertyContext _localctx = new MainAxisSizePropertyContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_mainAxisSizeProperty);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(982);
			match(MAINAXISSIZE);
			setState(983);
			match(COLON);
			setState(984);
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
		public TerminalNode CENTERVALUE() { return getToken(DartParser.CENTERVALUE, 0); }
		public CrossAxisAlignmentPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_crossAxisAlignmentProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterCrossAxisAlignmentProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitCrossAxisAlignmentProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitCrossAxisAlignmentProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CrossAxisAlignmentPropertyContext crossAxisAlignmentProperty() throws RecognitionException {
		CrossAxisAlignmentPropertyContext _localctx = new CrossAxisAlignmentPropertyContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_crossAxisAlignmentProperty);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(986);
			match(CROSSAXISALIGNMENT);
			setState(987);
			match(COLON);
			setState(988);
			_la = _input.LA(1);
			if ( !(((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & 87960930222145L) != 0)) ) {
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
	public static class OnPressedPropertyContext extends ParserRuleContext {
		public TerminalNode ONPRESSED() { return getToken(DartParser.ONPRESSED, 0); }
		public TerminalNode COLON() { return getToken(DartParser.COLON, 0); }
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
		public OnPressedPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_onPressedProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterOnPressedProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitOnPressedProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitOnPressedProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OnPressedPropertyContext onPressedProperty() throws RecognitionException {
		OnPressedPropertyContext _localctx = new OnPressedPropertyContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_onPressedProperty);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(990);
			match(ONPRESSED);
			setState(991);
			match(COLON);
			setState(992);
			match(LP);
			setState(997);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(993);
				match(IDENTIFIER);
				setState(994);
				match(COMMA);
				}
				}
				setState(999);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1000);
			match(RP);
			setState(1001);
			match(OB);
			setState(1005);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 106045697475739648L) != 0) || ((((_la - 121)) & ~0x3f) == 0 && ((1L << (_la - 121)) & 1039L) != 0)) {
				{
				{
				setState(1002);
				statment();
				}
				}
				setState(1007);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1008);
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
	public static class ExpressionListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DartParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DartParser.COMMA, i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitExpressionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1010);
			expression();
			setState(1015);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1011);
				match(COMMA);
				setState(1012);
				expression();
				}
				}
				setState(1017);
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
	public static class ExpressionContext extends ParserRuleContext {
		public LogicalOrExpressionContext logicalOrExpression() {
			return getRuleContext(LogicalOrExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1018);
			logicalOrExpression();
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
	public static class LogicalOrExpressionContext extends ParserRuleContext {
		public List<LogicalAndExpressionContext> logicalAndExpression() {
			return getRuleContexts(LogicalAndExpressionContext.class);
		}
		public LogicalAndExpressionContext logicalAndExpression(int i) {
			return getRuleContext(LogicalAndExpressionContext.class,i);
		}
		public List<TerminalNode> OO() { return getTokens(DartParser.OO); }
		public TerminalNode OO(int i) {
			return getToken(DartParser.OO, i);
		}
		public LogicalOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterLogicalOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitLogicalOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitLogicalOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalOrExpressionContext logicalOrExpression() throws RecognitionException {
		LogicalOrExpressionContext _localctx = new LogicalOrExpressionContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_logicalOrExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1020);
			logicalAndExpression();
			setState(1025);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OO) {
				{
				{
				setState(1021);
				match(OO);
				setState(1022);
				logicalAndExpression();
				}
				}
				setState(1027);
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
	public static class LogicalAndExpressionContext extends ParserRuleContext {
		public List<EqualityExpressionContext> equalityExpression() {
			return getRuleContexts(EqualityExpressionContext.class);
		}
		public EqualityExpressionContext equalityExpression(int i) {
			return getRuleContext(EqualityExpressionContext.class,i);
		}
		public List<TerminalNode> AA() { return getTokens(DartParser.AA); }
		public TerminalNode AA(int i) {
			return getToken(DartParser.AA, i);
		}
		public LogicalAndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalAndExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterLogicalAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitLogicalAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitLogicalAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalAndExpressionContext logicalAndExpression() throws RecognitionException {
		LogicalAndExpressionContext _localctx = new LogicalAndExpressionContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_logicalAndExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1028);
			equalityExpression();
			setState(1033);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AA) {
				{
				{
				setState(1029);
				match(AA);
				setState(1030);
				equalityExpression();
				}
				}
				setState(1035);
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
	public static class EqualityExpressionContext extends ParserRuleContext {
		public List<RelationalExpressionContext> relationalExpression() {
			return getRuleContexts(RelationalExpressionContext.class);
		}
		public RelationalExpressionContext relationalExpression(int i) {
			return getRuleContext(RelationalExpressionContext.class,i);
		}
		public TerminalNode EE() { return getToken(DartParser.EE, 0); }
		public TerminalNode NE() { return getToken(DartParser.NE, 0); }
		public EqualityExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterEqualityExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitEqualityExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitEqualityExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualityExpressionContext equalityExpression() throws RecognitionException {
		EqualityExpressionContext _localctx = new EqualityExpressionContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_equalityExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1036);
			relationalExpression();
			setState(1039);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EE || _la==NE) {
				{
				setState(1037);
				_la = _input.LA(1);
				if ( !(_la==EE || _la==NE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1038);
				relationalExpression();
				}
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
	public static class RelationalExpressionContext extends ParserRuleContext {
		public List<AdditiveExpressionContext> additiveExpression() {
			return getRuleContexts(AdditiveExpressionContext.class);
		}
		public AdditiveExpressionContext additiveExpression(int i) {
			return getRuleContext(AdditiveExpressionContext.class,i);
		}
		public TerminalNode GTE() { return getToken(DartParser.GTE, 0); }
		public TerminalNode GT() { return getToken(DartParser.GT, 0); }
		public TerminalNode LTE() { return getToken(DartParser.LTE, 0); }
		public TerminalNode LT() { return getToken(DartParser.LT, 0); }
		public RelationalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterRelationalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitRelationalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitRelationalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationalExpressionContext relationalExpression() throws RecognitionException {
		RelationalExpressionContext _localctx = new RelationalExpressionContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_relationalExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1041);
			additiveExpression();
			setState(1044);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 122880L) != 0)) {
				{
				setState(1042);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 122880L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1043);
				additiveExpression();
				}
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
	public static class AdditiveExpressionContext extends ParserRuleContext {
		public List<MultiplicativeExpressionContext> multiplicativeExpression() {
			return getRuleContexts(MultiplicativeExpressionContext.class);
		}
		public MultiplicativeExpressionContext multiplicativeExpression(int i) {
			return getRuleContext(MultiplicativeExpressionContext.class,i);
		}
		public List<TerminalNode> PL() { return getTokens(DartParser.PL); }
		public TerminalNode PL(int i) {
			return getToken(DartParser.PL, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(DartParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(DartParser.MINUS, i);
		}
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitAdditiveExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitAdditiveExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_additiveExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1046);
			multiplicativeExpression();
			setState(1051);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PL || _la==MINUS) {
				{
				{
				setState(1047);
				_la = _input.LA(1);
				if ( !(_la==PL || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1048);
				multiplicativeExpression();
				}
				}
				setState(1053);
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
	public static class MultiplicativeExpressionContext extends ParserRuleContext {
		public List<PrimaryContext> primary() {
			return getRuleContexts(PrimaryContext.class);
		}
		public PrimaryContext primary(int i) {
			return getRuleContext(PrimaryContext.class,i);
		}
		public List<TerminalNode> STAR() { return getTokens(DartParser.STAR); }
		public TerminalNode STAR(int i) {
			return getToken(DartParser.STAR, i);
		}
		public List<TerminalNode> DIV() { return getTokens(DartParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(DartParser.DIV, i);
		}
		public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterMultiplicativeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitMultiplicativeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitMultiplicativeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_multiplicativeExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1054);
			primary();
			setState(1059);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STAR || _la==DIV) {
				{
				{
				setState(1055);
				_la = _input.LA(1);
				if ( !(_la==STAR || _la==DIV) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1056);
				primary();
				}
				}
				setState(1061);
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
	public static class PrimaryContext extends ParserRuleContext {
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
	 
		public PrimaryContext() { }
		public void copyFrom(PrimaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryExpressionExpressionContext extends PrimaryContext {
		public TerminalNode LP() { return getToken(DartParser.LP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RP() { return getToken(DartParser.RP, 0); }
		public PrimaryExpressionExpressionContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterPrimaryExpressionExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitPrimaryExpressionExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitPrimaryExpressionExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryLiteralExpressionContext extends PrimaryContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public PrimaryLiteralExpressionContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterPrimaryLiteralExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitPrimaryLiteralExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitPrimaryLiteralExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryIdentifierExpressionContext extends PrimaryContext {
		public TerminalNode IDENTIFIER() { return getToken(DartParser.IDENTIFIER, 0); }
		public PrimaryIdentifierExpressionContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterPrimaryIdentifierExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitPrimaryIdentifierExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitPrimaryIdentifierExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryNumericLiteralContext extends PrimaryContext {
		public NumericLiteralContext numericLiteral() {
			return getRuleContext(NumericLiteralContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(DartParser.MINUS, 0); }
		public PrimaryNumericLiteralContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterPrimaryNumericLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitPrimaryNumericLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitPrimaryNumericLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_primary);
		int _la;
		try {
			setState(1072);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LP:
				_localctx = new PrimaryExpressionExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1062);
				match(LP);
				setState(1063);
				expression();
				setState(1064);
				match(RP);
				}
				break;
			case BOOLEAN:
			case STRING:
				_localctx = new PrimaryLiteralExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1066);
				literal();
				}
				break;
			case IDENTIFIER:
				_localctx = new PrimaryIdentifierExpressionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1067);
				match(IDENTIFIER);
				}
				break;
			case MINUS:
			case FLOAT:
			case NUM:
			case HEX_NUM:
				_localctx = new PrimaryNumericLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1069);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(1068);
					match(MINUS);
					}
				}

				setState(1071);
				numericLiteral();
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
	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode BOOLEAN() { return getToken(DartParser.BOOLEAN, 0); }
		public TerminalNode STRING() { return getToken(DartParser.STRING, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1074);
			_la = _input.LA(1);
			if ( !(_la==BOOLEAN || _la==STRING) ) {
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
	public static class NumericLiteralContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(DartParser.NUM, 0); }
		public TerminalNode HEX_NUM() { return getToken(DartParser.HEX_NUM, 0); }
		public TerminalNode FLOAT() { return getToken(DartParser.FLOAT, 0); }
		public NumericLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterNumericLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitNumericLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitNumericLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumericLiteralContext numericLiteral() throws RecognitionException {
		NumericLiteralContext _localctx = new NumericLiteralContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_numericLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1076);
			_la = _input.LA(1);
			if ( !(((((_la - 126)) & ~0x3f) == 0 && ((1L << (_la - 126)) & 11L) != 0)) ) {
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
		"\u0004\u0001\u0084\u0437\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007"+
		"\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007"+
		"\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007"+
		"\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007"+
		",\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u0007"+
		"1\u00022\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u0007"+
		"6\u00027\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007"+
		";\u0002<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007"+
		"@\u0002A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007"+
		"E\u0002F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007I\u0002J\u0007"+
		"J\u0002K\u0007K\u0002L\u0007L\u0002M\u0007M\u0002N\u0007N\u0002O\u0007"+
		"O\u0002P\u0007P\u0002Q\u0007Q\u0002R\u0007R\u0002S\u0007S\u0001\u0000"+
		"\u0005\u0000\u00aa\b\u0000\n\u0000\f\u0000\u00ad\t\u0000\u0001\u0000\u0003"+
		"\u0000\u00b0\b\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0005\u0001\u00b9\b\u0001\n\u0001\f\u0001"+
		"\u00bc\t\u0001\u0001\u0001\u0003\u0001\u00bf\b\u0001\u0003\u0001\u00c1"+
		"\b\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003"+
		"\u0002\u00ce\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0005\u0003\u00d5\b\u0003\n\u0003\f\u0003\u00d8\t\u0003\u0001\u0003"+
		"\u0003\u0003\u00db\b\u0003\u0003\u0003\u00dd\b\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u00ea\b\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u00fc\b\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u0103"+
		"\b\u0006\n\u0006\f\u0006\u0106\t\u0006\u0001\u0006\u0003\u0006\u0109\b"+
		"\u0006\u0003\u0006\u010b\b\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0003\u0007\u0111\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0005"+
		"\b\u0117\b\b\n\b\f\b\u011a\t\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0005\t\u0123\b\t\n\t\f\t\u0126\t\t\u0001\t\u0003\t\u0129"+
		"\b\t\u0003\t\u012b\b\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n"+
		"\u0001\n\u0003\n\u0134\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0005\u000b\u013b\b\u000b\n\u000b\f\u000b\u013e\t\u000b\u0001"+
		"\u000b\u0003\u000b\u0141\b\u000b\u0003\u000b\u0143\b\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0005\r\u0150\b\r\n\r\f\r\u0153\t\r\u0001\r\u0003\r\u0156\b"+
		"\r\u0003\r\u0158\b\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0003\u000e\u015f\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0005\u000f\u0166\b\u000f\n\u000f\f\u000f\u0169\t\u000f\u0001"+
		"\u000f\u0003\u000f\u016c\b\u000f\u0003\u000f\u016e\b\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0005\u0011\u0179\b\u0011\n\u0011\f\u0011\u017c"+
		"\t\u0011\u0001\u0011\u0003\u0011\u017f\b\u0011\u0003\u0011\u0181\b\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012"+
		"\u0188\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0005\u0013\u018f\b\u0013\n\u0013\f\u0013\u0192\t\u0013\u0001\u0013\u0003"+
		"\u0013\u0195\b\u0013\u0003\u0013\u0197\b\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014"+
		"\u01ac\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0005\u0016\u01bb\b\u0016\n\u0016\f\u0016\u01be"+
		"\t\u0016\u0001\u0016\u0003\u0016\u01c1\b\u0016\u0003\u0016\u01c3\b\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u01ce\b\u0017\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0005\u0019\u01d9\b\u0019\n\u0019\f\u0019\u01dc"+
		"\t\u0019\u0001\u0019\u0003\u0019\u01df\b\u0019\u0003\u0019\u01e1\b\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0003\u001a\u01e7\b\u001a"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c"+
		"\u0003\u001c\u01ef\b\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0003\u001d\u01f5\b\u001d\u0003\u001d\u01f7\b\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0005"+
		"\u001e\u0200\b\u001e\n\u001e\f\u001e\u0203\t\u001e\u0001\u001e\u0003\u001e"+
		"\u0206\b\u001e\u0003\u001e\u0208\b\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0003 \u021c"+
		"\b \u0001!\u0001!\u0001!\u0001!\u0001!\u0005!\u0223\b!\n!\f!\u0226\t!"+
		"\u0001!\u0003!\u0229\b!\u0003!\u022b\b!\u0001!\u0001!\u0001\"\u0001\""+
		"\u0001\"\u0001\"\u0003\"\u0233\b\"\u0001#\u0001#\u0001#\u0001#\u0001#"+
		"\u0005#\u023a\b#\n#\f#\u023d\t#\u0001#\u0003#\u0240\b#\u0003#\u0242\b"+
		"#\u0001#\u0001#\u0001$\u0001$\u0003$\u0248\b$\u0001%\u0001%\u0001%\u0001"+
		"%\u0001%\u0005%\u024f\b%\n%\f%\u0252\t%\u0001%\u0003%\u0255\b%\u0003%"+
		"\u0257\b%\u0001%\u0001%\u0001&\u0001&\u0001&\u0001&\u0003&\u025f\b&\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0005\'\u0266\b\'\n\'\f\'\u0269\t\'"+
		"\u0001\'\u0003\'\u026c\b\'\u0003\'\u026e\b\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0005\'\u0276\b\'\n\'\f\'\u0279\t\'\u0001\'\u0003\'"+
		"\u027c\b\'\u0003\'\u027e\b\'\u0001\'\u0003\'\u0281\b\'\u0001(\u0001(\u0001"+
		"(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0003"+
		"(\u028f\b(\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0003)\u0297\b)\u0001"+
		"*\u0001*\u0001*\u0001*\u0001*\u0005*\u029e\b*\n*\f*\u02a1\t*\u0001*\u0003"+
		"*\u02a4\b*\u0003*\u02a6\b*\u0001*\u0001*\u0001+\u0001+\u0001+\u0001+\u0001"+
		"+\u0001+\u0001+\u0001+\u0003+\u02b2\b+\u0001,\u0001,\u0001,\u0001,\u0001"+
		",\u0005,\u02b9\b,\n,\f,\u02bc\t,\u0001,\u0003,\u02bf\b,\u0003,\u02c1\b"+
		",\u0001,\u0001,\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001"+
		"-\u0001-\u0001-\u0001-\u0001-\u0003-\u02d1\b-\u0001.\u0001.\u0001.\u0001"+
		".\u0001.\u0005.\u02d8\b.\n.\f.\u02db\t.\u0001.\u0003.\u02de\b.\u0003."+
		"\u02e0\b.\u0001.\u0001.\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001"+
		"/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001"+
		"/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0005/\u02fb\b/\n/\f/\u02fe"+
		"\t/\u0001/\u0001/\u0001/\u0005/\u0303\b/\n/\f/\u0306\t/\u0001/\u0001/"+
		"\u0003/\u030a\b/\u00010\u00010\u00010\u00010\u00011\u00011\u00011\u0001"+
		"1\u00011\u00051\u0315\b1\n1\f1\u0318\t1\u00011\u00031\u031b\b1\u00031"+
		"\u031d\b1\u00011\u00011\u00012\u00012\u00012\u00012\u00012\u00032\u0326"+
		"\b2\u00013\u00013\u00013\u00013\u00013\u00053\u032d\b3\n3\f3\u0330\t3"+
		"\u00013\u00033\u0333\b3\u00013\u00013\u00014\u00014\u00014\u00014\u0003"+
		"4\u033b\b4\u00015\u00015\u00015\u00015\u00015\u00055\u0342\b5\n5\f5\u0345"+
		"\t5\u00015\u00035\u0348\b5\u00015\u00015\u00016\u00016\u00016\u00016\u0003"+
		"6\u0350\b6\u00017\u00017\u00017\u00017\u00017\u00017\u00017\u00017\u0001"+
		"7\u00017\u00017\u00037\u035d\b7\u00018\u00018\u00018\u00018\u00018\u0001"+
		"8\u00018\u00018\u00019\u00019\u00019\u00019\u00019\u00019\u00019\u0003"+
		"9\u036e\b9\u00019\u00019\u00019\u0001:\u0001:\u0001:\u0001:\u0001:\u0001"+
		";\u0001;\u0001;\u0001;\u0001;\u0001<\u0001<\u0001<\u0001<\u0001<\u0001"+
		"<\u0001<\u0005<\u0384\b<\n<\f<\u0387\t<\u0001<\u0001<\u0001<\u0003<\u038c"+
		"\b<\u0001=\u0001=\u0001=\u0003=\u0391\b=\u0001=\u0001=\u0001=\u0003=\u0396"+
		"\b=\u0001=\u0001=\u0001>\u0001>\u0001>\u0001>\u0001>\u0001>\u0001?\u0001"+
		"?\u0001?\u0001?\u0001?\u0001?\u0001@\u0001@\u0001@\u0001@\u0005@\u03aa"+
		"\b@\n@\f@\u03ad\t@\u0001@\u0001@\u0001@\u0001@\u0001@\u0001@\u0001A\u0001"+
		"A\u0001A\u0001A\u0001B\u0001B\u0001B\u0001B\u0001C\u0001C\u0001C\u0001"+
		"C\u0001D\u0001D\u0001D\u0001D\u0001E\u0001E\u0001E\u0001E\u0001E\u0001"+
		"E\u0005E\u03cb\bE\nE\fE\u03ce\tE\u0001E\u0003E\u03d1\bE\u0003E\u03d3\b"+
		"E\u0001E\u0001E\u0001F\u0001F\u0001F\u0001F\u0001G\u0001G\u0001G\u0001"+
		"G\u0001H\u0001H\u0001H\u0001H\u0001H\u0005H\u03e4\bH\nH\fH\u03e7\tH\u0001"+
		"H\u0001H\u0001H\u0005H\u03ec\bH\nH\fH\u03ef\tH\u0001H\u0001H\u0001I\u0001"+
		"I\u0001I\u0005I\u03f6\bI\nI\fI\u03f9\tI\u0001J\u0001J\u0001K\u0001K\u0001"+
		"K\u0005K\u0400\bK\nK\fK\u0403\tK\u0001L\u0001L\u0001L\u0005L\u0408\bL"+
		"\nL\fL\u040b\tL\u0001M\u0001M\u0001M\u0003M\u0410\bM\u0001N\u0001N\u0001"+
		"N\u0003N\u0415\bN\u0001O\u0001O\u0001O\u0005O\u041a\bO\nO\fO\u041d\tO"+
		"\u0001P\u0001P\u0001P\u0005P\u0422\bP\nP\fP\u0425\tP\u0001Q\u0001Q\u0001"+
		"Q\u0001Q\u0001Q\u0001Q\u0001Q\u0003Q\u042e\bQ\u0001Q\u0003Q\u0431\bQ\u0001"+
		"R\u0001R\u0001S\u0001S\u0001S\u0000\u0000T\u0000\u0002\u0004\u0006\b\n"+
		"\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.0246"+
		"8:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a"+
		"\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2"+
		"\u00a4\u00a6\u0000\u0011\u0002\u0000\u0080\u0080\u0083\u0083\u0001\u0000"+
		"~\u0080\u0002\u0000>>bd\u0002\u0000~\u007f\u0083\u0083\u0002\u0000BB^"+
		"`\u0003\u0000BBnnpp\u0002\u0000\u007f\u007f\u0083\u0083\u0001\u0000YZ"+
		"\u0001\u000046\u0001\u0000EF\u0004\u0000BBHHnnpp\u0001\u0000\u000b\f\u0001"+
		"\u0000\r\u0010\u0001\u0000\u0011\u0012\u0001\u0000\u0015\u0016\u0002\u0000"+
		"}}\u0080\u0080\u0002\u0000~\u007f\u0081\u0081\u0490\u0000\u00ab\u0001"+
		"\u0000\u0000\u0000\u0002\u00b3\u0001\u0000\u0000\u0000\u0004\u00cd\u0001"+
		"\u0000\u0000\u0000\u0006\u00cf\u0001\u0000\u0000\u0000\b\u00e9\u0001\u0000"+
		"\u0000\u0000\n\u00fb\u0001\u0000\u0000\u0000\f\u00fd\u0001\u0000\u0000"+
		"\u0000\u000e\u0110\u0001\u0000\u0000\u0000\u0010\u0112\u0001\u0000\u0000"+
		"\u0000\u0012\u011d\u0001\u0000\u0000\u0000\u0014\u0133\u0001\u0000\u0000"+
		"\u0000\u0016\u0135\u0001\u0000\u0000\u0000\u0018\u0146\u0001\u0000\u0000"+
		"\u0000\u001a\u014a\u0001\u0000\u0000\u0000\u001c\u015e\u0001\u0000\u0000"+
		"\u0000\u001e\u0160\u0001\u0000\u0000\u0000 \u0171\u0001\u0000\u0000\u0000"+
		"\"\u0173\u0001\u0000\u0000\u0000$\u0187\u0001\u0000\u0000\u0000&\u0189"+
		"\u0001\u0000\u0000\u0000(\u01ab\u0001\u0000\u0000\u0000*\u01ad\u0001\u0000"+
		"\u0000\u0000,\u01b5\u0001\u0000\u0000\u0000.\u01cd\u0001\u0000\u0000\u0000"+
		"0\u01cf\u0001\u0000\u0000\u00002\u01d3\u0001\u0000\u0000\u00004\u01e6"+
		"\u0001\u0000\u0000\u00006\u01e8\u0001\u0000\u0000\u00008\u01ee\u0001\u0000"+
		"\u0000\u0000:\u01f0\u0001\u0000\u0000\u0000<\u01fa\u0001\u0000\u0000\u0000"+
		">\u020b\u0001\u0000\u0000\u0000@\u021b\u0001\u0000\u0000\u0000B\u021d"+
		"\u0001\u0000\u0000\u0000D\u0232\u0001\u0000\u0000\u0000F\u0234\u0001\u0000"+
		"\u0000\u0000H\u0247\u0001\u0000\u0000\u0000J\u0249\u0001\u0000\u0000\u0000"+
		"L\u025e\u0001\u0000\u0000\u0000N\u0280\u0001\u0000\u0000\u0000P\u028e"+
		"\u0001\u0000\u0000\u0000R\u0296\u0001\u0000\u0000\u0000T\u0298\u0001\u0000"+
		"\u0000\u0000V\u02b1\u0001\u0000\u0000\u0000X\u02b3\u0001\u0000\u0000\u0000"+
		"Z\u02d0\u0001\u0000\u0000\u0000\\\u02d2\u0001\u0000\u0000\u0000^\u0309"+
		"\u0001\u0000\u0000\u0000`\u030b\u0001\u0000\u0000\u0000b\u030f\u0001\u0000"+
		"\u0000\u0000d\u0325\u0001\u0000\u0000\u0000f\u0327\u0001\u0000\u0000\u0000"+
		"h\u033a\u0001\u0000\u0000\u0000j\u033c\u0001\u0000\u0000\u0000l\u034f"+
		"\u0001\u0000\u0000\u0000n\u035c\u0001\u0000\u0000\u0000p\u035e\u0001\u0000"+
		"\u0000\u0000r\u0366\u0001\u0000\u0000\u0000t\u0372\u0001\u0000\u0000\u0000"+
		"v\u0377\u0001\u0000\u0000\u0000x\u038b\u0001\u0000\u0000\u0000z\u038d"+
		"\u0001\u0000\u0000\u0000|\u0399\u0001\u0000\u0000\u0000~\u039f\u0001\u0000"+
		"\u0000\u0000\u0080\u03a5\u0001\u0000\u0000\u0000\u0082\u03b4\u0001\u0000"+
		"\u0000\u0000\u0084\u03b8\u0001\u0000\u0000\u0000\u0086\u03bc\u0001\u0000"+
		"\u0000\u0000\u0088\u03c0\u0001\u0000\u0000\u0000\u008a\u03c4\u0001\u0000"+
		"\u0000\u0000\u008c\u03d6\u0001\u0000\u0000\u0000\u008e\u03da\u0001\u0000"+
		"\u0000\u0000\u0090\u03de\u0001\u0000\u0000\u0000\u0092\u03f2\u0001\u0000"+
		"\u0000\u0000\u0094\u03fa\u0001\u0000\u0000\u0000\u0096\u03fc\u0001\u0000"+
		"\u0000\u0000\u0098\u0404\u0001\u0000\u0000\u0000\u009a\u040c\u0001\u0000"+
		"\u0000\u0000\u009c\u0411\u0001\u0000\u0000\u0000\u009e\u0416\u0001\u0000"+
		"\u0000\u0000\u00a0\u041e\u0001\u0000\u0000\u0000\u00a2\u0430\u0001\u0000"+
		"\u0000\u0000\u00a4\u0432\u0001\u0000\u0000\u0000\u00a6\u0434\u0001\u0000"+
		"\u0000\u0000\u00a8\u00aa\u0003n7\u0000\u00a9\u00a8\u0001\u0000\u0000\u0000"+
		"\u00aa\u00ad\u0001\u0000\u0000\u0000\u00ab\u00a9\u0001\u0000\u0000\u0000"+
		"\u00ab\u00ac\u0001\u0000\u0000\u0000\u00ac\u00af\u0001\u0000\u0000\u0000"+
		"\u00ad\u00ab\u0001\u0000\u0000\u0000\u00ae\u00b0\u0003\u0002\u0001\u0000"+
		"\u00af\u00ae\u0001\u0000\u0000\u0000\u00af\u00b0\u0001\u0000\u0000\u0000"+
		"\u00b0\u00b1\u0001\u0000\u0000\u0000\u00b1\u00b2\u0005\u0000\u0000\u0001"+
		"\u00b2\u0001\u0001\u0000\u0000\u0000\u00b3\u00b4\u0005\u0017\u0000\u0000"+
		"\u00b4\u00c0\u0005\u0001\u0000\u0000\u00b5\u00ba\u0003\u0004\u0002\u0000"+
		"\u00b6\u00b7\u0005\t\u0000\u0000\u00b7\u00b9\u0003\u0004\u0002\u0000\u00b8"+
		"\u00b6\u0001\u0000\u0000\u0000\u00b9\u00bc\u0001\u0000\u0000\u0000\u00ba"+
		"\u00b8\u0001\u0000\u0000\u0000\u00ba\u00bb\u0001\u0000\u0000\u0000\u00bb"+
		"\u00be\u0001\u0000\u0000\u0000\u00bc\u00ba\u0001\u0000\u0000\u0000\u00bd"+
		"\u00bf\u0005\t\u0000\u0000\u00be\u00bd\u0001\u0000\u0000\u0000\u00be\u00bf"+
		"\u0001\u0000\u0000\u0000\u00bf\u00c1\u0001\u0000\u0000\u0000\u00c0\u00b5"+
		"\u0001\u0000\u0000\u0000\u00c0\u00c1\u0001\u0000\u0000\u0000\u00c1\u00c2"+
		"\u0001\u0000\u0000\u0000\u00c2\u00c3\u0005\u0002\u0000\u0000\u00c3\u0003"+
		"\u0001\u0000\u0000\u0000\u00c4\u00c5\u00051\u0000\u0000\u00c5\u00c6\u0005"+
		"\u0003\u0000\u0000\u00c6\u00ce\u0003\n\u0005\u0000\u00c7\u00c8\u0005:"+
		"\u0000\u0000\u00c8\u00c9\u0005\u0003\u0000\u0000\u00c9\u00ce\u0003\u0006"+
		"\u0003\u0000\u00ca\u00cb\u0005v\u0000\u0000\u00cb\u00cc\u0005\u0003\u0000"+
		"\u0000\u00cc\u00ce\u0005\u0080\u0000\u0000\u00cd\u00c4\u0001\u0000\u0000"+
		"\u0000\u00cd\u00c7\u0001\u0000\u0000\u0000\u00cd\u00ca\u0001\u0000\u0000"+
		"\u0000\u00ce\u0005\u0001\u0000\u0000\u0000\u00cf\u00d0\u0005\u001c\u0000"+
		"\u0000\u00d0\u00dc\u0005\u0001\u0000\u0000\u00d1\u00d6\u0003\b\u0004\u0000"+
		"\u00d2\u00d3\u0005\t\u0000\u0000\u00d3\u00d5\u0003\b\u0004\u0000\u00d4"+
		"\u00d2\u0001\u0000\u0000\u0000\u00d5\u00d8\u0001\u0000\u0000\u0000\u00d6"+
		"\u00d4\u0001\u0000\u0000\u0000\u00d6\u00d7\u0001\u0000\u0000\u0000\u00d7"+
		"\u00da\u0001\u0000\u0000\u0000\u00d8\u00d6\u0001\u0000\u0000\u0000\u00d9"+
		"\u00db\u0005\t\u0000\u0000\u00da\u00d9\u0001\u0000\u0000\u0000\u00da\u00db"+
		"\u0001\u0000\u0000\u0000\u00db\u00dd\u0001\u0000\u0000\u0000\u00dc\u00d1"+
		"\u0001\u0000\u0000\u0000\u00dc\u00dd\u0001\u0000\u0000\u0000\u00dd\u00de"+
		"\u0001\u0000\u0000\u0000\u00de\u00df\u0005\u0002\u0000\u0000\u00df\u0007"+
		"\u0001\u0000\u0000\u0000\u00e0\u00e1\u0005V\u0000\u0000\u00e1\u00e2\u0005"+
		"\u0003\u0000\u0000\u00e2\u00ea\u0007\u0000\u0000\u0000\u00e3\u00e4\u0005"+
		"[\u0000\u0000\u00e4\u00e5\u0005\u0003\u0000\u0000\u00e5\u00ea\u0005}\u0000"+
		"\u0000\u00e6\u00e7\u0005W\u0000\u0000\u00e7\u00e8\u0005\u0003\u0000\u0000"+
		"\u00e8\u00ea\u0005\u0081\u0000\u0000\u00e9\u00e0\u0001\u0000\u0000\u0000"+
		"\u00e9\u00e3\u0001\u0000\u0000\u0000\u00e9\u00e6\u0001\u0000\u0000\u0000"+
		"\u00ea\t\u0001\u0000\u0000\u0000\u00eb\u00fc\u0003\u001a\r\u0000\u00ec"+
		"\u00fc\u0003\u001e\u000f\u0000\u00ed\u00fc\u0003&\u0013\u0000\u00ee\u00fc"+
		"\u0003,\u0016\u0000\u00ef\u00fc\u0003B!\u0000\u00f0\u00fc\u0003\"\u0011"+
		"\u0000\u00f1\u00fc\u0003F#\u0000\u00f2\u00fc\u0003J%\u0000\u00f3\u00fc"+
		"\u0003T*\u0000\u00f4\u00fc\u0003X,\u0000\u00f5\u00fc\u0003\u0016\u000b"+
		"\u0000\u00f6\u00fc\u0003\\.\u0000\u00f7\u00fc\u0003f3\u0000\u00f8\u00fc"+
		"\u0003j5\u0000\u00f9\u00fc\u0003\u0012\t\u0000\u00fa\u00fc\u0003\f\u0006"+
		"\u0000\u00fb\u00eb\u0001\u0000\u0000\u0000\u00fb\u00ec\u0001\u0000\u0000"+
		"\u0000\u00fb\u00ed\u0001\u0000\u0000\u0000\u00fb\u00ee\u0001\u0000\u0000"+
		"\u0000\u00fb\u00ef\u0001\u0000\u0000\u0000\u00fb\u00f0\u0001\u0000\u0000"+
		"\u0000\u00fb\u00f1\u0001\u0000\u0000\u0000\u00fb\u00f2\u0001\u0000\u0000"+
		"\u0000\u00fb\u00f3\u0001\u0000\u0000\u0000\u00fb\u00f4\u0001\u0000\u0000"+
		"\u0000\u00fb\u00f5\u0001\u0000\u0000\u0000\u00fb\u00f6\u0001\u0000\u0000"+
		"\u0000\u00fb\u00f7\u0001\u0000\u0000\u0000\u00fb\u00f8\u0001\u0000\u0000"+
		"\u0000\u00fb\u00f9\u0001\u0000\u0000\u0000\u00fb\u00fa\u0001\u0000\u0000"+
		"\u0000\u00fc\u000b\u0001\u0000\u0000\u0000\u00fd\u00fe\u0005-\u0000\u0000"+
		"\u00fe\u010a\u0005\u0001\u0000\u0000\u00ff\u0104\u0003\u000e\u0007\u0000"+
		"\u0100\u0101\u0005\t\u0000\u0000\u0101\u0103\u0003\u000e\u0007\u0000\u0102"+
		"\u0100\u0001\u0000\u0000\u0000\u0103\u0106\u0001\u0000\u0000\u0000\u0104"+
		"\u0102\u0001\u0000\u0000\u0000\u0104\u0105\u0001\u0000\u0000\u0000\u0105"+
		"\u0108\u0001\u0000\u0000\u0000\u0106\u0104\u0001\u0000\u0000\u0000\u0107"+
		"\u0109\u0005\t\u0000\u0000\u0108\u0107\u0001\u0000\u0000\u0000\u0108\u0109"+
		"\u0001\u0000\u0000\u0000\u0109\u010b\u0001\u0000\u0000\u0000\u010a\u00ff"+
		"\u0001\u0000\u0000\u0000\u010a\u010b\u0001\u0000\u0000\u0000\u010b\u010c"+
		"\u0001\u0000\u0000\u0000\u010c\u010d\u0005\u0002\u0000\u0000\u010d\r\u0001"+
		"\u0000\u0000\u0000\u010e\u0111\u0003\u0088D\u0000\u010f\u0111\u0003\u0010"+
		"\b\u0000\u0110\u010e\u0001\u0000\u0000\u0000\u0110\u010f\u0001\u0000\u0000"+
		"\u0000\u0111\u000f\u0001\u0000\u0000\u0000\u0112\u0113\u0005w\u0000\u0000"+
		"\u0113\u0114\u0005\u0003\u0000\u0000\u0114\u0118\u0005\u0006\u0000\u0000"+
		"\u0115\u0117\u0003n7\u0000\u0116\u0115\u0001\u0000\u0000\u0000\u0117\u011a"+
		"\u0001\u0000\u0000\u0000\u0118\u0116\u0001\u0000\u0000\u0000\u0118\u0119"+
		"\u0001\u0000\u0000\u0000\u0119\u011b\u0001\u0000\u0000\u0000\u011a\u0118"+
		"\u0001\u0000\u0000\u0000\u011b\u011c\u0005\u0007\u0000\u0000\u011c\u0011"+
		"\u0001\u0000\u0000\u0000\u011d\u011e\u0005,\u0000\u0000\u011e\u012a\u0005"+
		"\u0001\u0000\u0000\u011f\u0124\u0003\u0014\n\u0000\u0120\u0121\u0005\t"+
		"\u0000\u0000\u0121\u0123\u0003\u0014\n\u0000\u0122\u0120\u0001\u0000\u0000"+
		"\u0000\u0123\u0126\u0001\u0000\u0000\u0000\u0124\u0122\u0001\u0000\u0000"+
		"\u0000\u0124\u0125\u0001\u0000\u0000\u0000\u0125\u0128\u0001\u0000\u0000"+
		"\u0000\u0126\u0124\u0001\u0000\u0000\u0000\u0127\u0129\u0005\t\u0000\u0000"+
		"\u0128\u0127\u0001\u0000\u0000\u0000\u0128\u0129\u0001\u0000\u0000\u0000"+
		"\u0129\u012b\u0001\u0000\u0000\u0000\u012a\u011f\u0001\u0000\u0000\u0000"+
		"\u012a\u012b\u0001\u0000\u0000\u0000\u012b\u012c\u0001\u0000\u0000\u0000"+
		"\u012c\u012d\u0005\u0002\u0000\u0000\u012d\u0013\u0001\u0000\u0000\u0000"+
		"\u012e\u0134\u0003\u0082A\u0000\u012f\u0134\u0003\u0084B\u0000\u0130\u0131"+
		"\u0005u\u0000\u0000\u0131\u0132\u0005\u0003\u0000\u0000\u0132\u0134\u0007"+
		"\u0000\u0000\u0000\u0133\u012e\u0001\u0000\u0000\u0000\u0133\u012f\u0001"+
		"\u0000\u0000\u0000\u0133\u0130\u0001\u0000\u0000\u0000\u0134\u0015\u0001"+
		"\u0000\u0000\u0000\u0135\u0136\u0005\u0082\u0000\u0000\u0136\u0142\u0005"+
		"\u0001\u0000\u0000\u0137\u013c\u0003\u0018\f\u0000\u0138\u0139\u0005\t"+
		"\u0000\u0000\u0139\u013b\u0003\u0018\f\u0000\u013a\u0138\u0001\u0000\u0000"+
		"\u0000\u013b\u013e\u0001\u0000\u0000\u0000\u013c\u013a\u0001\u0000\u0000"+
		"\u0000\u013c\u013d\u0001\u0000\u0000\u0000\u013d\u0140\u0001\u0000\u0000"+
		"\u0000\u013e\u013c\u0001\u0000\u0000\u0000\u013f\u0141\u0005\t\u0000\u0000"+
		"\u0140\u013f\u0001\u0000\u0000\u0000\u0140\u0141\u0001\u0000\u0000\u0000"+
		"\u0141\u0143\u0001\u0000\u0000\u0000\u0142\u0137\u0001\u0000\u0000\u0000"+
		"\u0142\u0143\u0001\u0000\u0000\u0000\u0143\u0144\u0001\u0000\u0000\u0000"+
		"\u0144\u0145\u0005\u0002\u0000\u0000\u0145\u0017\u0001\u0000\u0000\u0000"+
		"\u0146\u0147\u0005\u0083\u0000\u0000\u0147\u0148\u0005\u0003\u0000\u0000"+
		"\u0148\u0149\u0007\u0001\u0000\u0000\u0149\u0019\u0001\u0000\u0000\u0000"+
		"\u014a\u014b\u0005\u0018\u0000\u0000\u014b\u0157\u0005\u0001\u0000\u0000"+
		"\u014c\u0151\u0003\u001c\u000e\u0000\u014d\u014e\u0005\t\u0000\u0000\u014e"+
		"\u0150\u0003\u001c\u000e\u0000\u014f\u014d\u0001\u0000\u0000\u0000\u0150"+
		"\u0153\u0001\u0000\u0000\u0000\u0151\u014f\u0001\u0000\u0000\u0000\u0151"+
		"\u0152\u0001\u0000\u0000\u0000\u0152\u0155\u0001\u0000\u0000\u0000\u0153"+
		"\u0151\u0001\u0000\u0000\u0000\u0154\u0156\u0005\t\u0000\u0000\u0155\u0154"+
		"\u0001\u0000\u0000\u0000\u0155\u0156\u0001\u0000\u0000\u0000\u0156\u0158"+
		"\u0001\u0000\u0000\u0000\u0157\u014c\u0001\u0000\u0000\u0000\u0157\u0158"+
		"\u0001\u0000\u0000\u0000\u0158\u0159\u0001\u0000\u0000\u0000\u0159\u015a"+
		"\u0005\u0002\u0000\u0000\u015a\u001b\u0001\u0000\u0000\u0000\u015b\u015f"+
		"\u0003\u008aE\u0000\u015c\u015f\u0003\u008cF\u0000\u015d\u015f\u0003\u008e"+
		"G\u0000\u015e\u015b\u0001\u0000\u0000\u0000\u015e\u015c\u0001\u0000\u0000"+
		"\u0000\u015e\u015d\u0001\u0000\u0000\u0000\u015f\u001d\u0001\u0000\u0000"+
		"\u0000\u0160\u0161\u0005\u0019\u0000\u0000\u0161\u016d\u0005\u0001\u0000"+
		"\u0000\u0162\u0167\u0003 \u0010\u0000\u0163\u0164\u0005\t\u0000\u0000"+
		"\u0164\u0166\u0003 \u0010\u0000\u0165\u0163\u0001\u0000\u0000\u0000\u0166"+
		"\u0169\u0001\u0000\u0000\u0000\u0167\u0165\u0001\u0000\u0000\u0000\u0167"+
		"\u0168\u0001\u0000\u0000\u0000\u0168\u016b\u0001\u0000\u0000\u0000\u0169"+
		"\u0167\u0001\u0000\u0000\u0000\u016a\u016c\u0005\t\u0000\u0000\u016b\u016a"+
		"\u0001\u0000\u0000\u0000\u016b\u016c\u0001\u0000\u0000\u0000\u016c\u016e"+
		"\u0001\u0000\u0000\u0000\u016d\u0162\u0001\u0000\u0000\u0000\u016d\u016e"+
		"\u0001\u0000\u0000\u0000\u016e\u016f\u0001\u0000\u0000\u0000\u016f\u0170"+
		"\u0005\u0002\u0000\u0000\u0170\u001f\u0001\u0000\u0000\u0000\u0171\u0172"+
		"\u0003\u0088D\u0000\u0172!\u0001\u0000\u0000\u0000\u0173\u0174\u0005\u001a"+
		"\u0000\u0000\u0174\u0180\u0005\u0001\u0000\u0000\u0175\u017a\u0003$\u0012"+
		"\u0000\u0176\u0177\u0005\t\u0000\u0000\u0177\u0179\u0003$\u0012\u0000"+
		"\u0178\u0176\u0001\u0000\u0000\u0000\u0179\u017c\u0001\u0000\u0000\u0000"+
		"\u017a\u0178\u0001\u0000\u0000\u0000\u017a\u017b\u0001\u0000\u0000\u0000"+
		"\u017b\u017e\u0001\u0000\u0000\u0000\u017c\u017a\u0001\u0000\u0000\u0000"+
		"\u017d\u017f\u0005\t\u0000\u0000\u017e\u017d\u0001\u0000\u0000\u0000\u017e"+
		"\u017f\u0001\u0000\u0000\u0000\u017f\u0181\u0001\u0000\u0000\u0000\u0180"+
		"\u0175\u0001\u0000\u0000\u0000\u0180\u0181\u0001\u0000\u0000\u0000\u0181"+
		"\u0182\u0001\u0000\u0000\u0000\u0182\u0183\u0005\u0002\u0000\u0000\u0183"+
		"#\u0001\u0000\u0000\u0000\u0184\u0188\u0003\u008aE\u0000\u0185\u0188\u0003"+
		"\u008cF\u0000\u0186\u0188\u0003\u008eG\u0000\u0187\u0184\u0001\u0000\u0000"+
		"\u0000\u0187\u0185\u0001\u0000\u0000\u0000\u0187\u0186\u0001\u0000\u0000"+
		"\u0000\u0188%\u0001\u0000\u0000\u0000\u0189\u018a\u0005\u001b\u0000\u0000"+
		"\u018a\u0196\u0005\u0001\u0000\u0000\u018b\u0190\u0003(\u0014\u0000\u018c"+
		"\u018d\u0005\t\u0000\u0000\u018d\u018f\u0003(\u0014\u0000\u018e\u018c"+
		"\u0001\u0000\u0000\u0000\u018f\u0192\u0001\u0000\u0000\u0000\u0190\u018e"+
		"\u0001\u0000\u0000\u0000\u0190\u0191\u0001\u0000\u0000\u0000\u0191\u0194"+
		"\u0001\u0000\u0000\u0000\u0192\u0190\u0001\u0000\u0000\u0000\u0193\u0195"+
		"\u0005\t\u0000\u0000\u0194\u0193\u0001\u0000\u0000\u0000\u0194\u0195\u0001"+
		"\u0000\u0000\u0000\u0195\u0197\u0001\u0000\u0000\u0000\u0196\u018b\u0001"+
		"\u0000\u0000\u0000\u0196\u0197\u0001\u0000\u0000\u0000\u0197\u0198\u0001"+
		"\u0000\u0000\u0000\u0198\u0199\u0005\u0002\u0000\u0000\u0199\'\u0001\u0000"+
		"\u0000\u0000\u019a\u019b\u00059\u0000\u0000\u019b\u019c\u0005\u0003\u0000"+
		"\u0000\u019c\u01ac\u0007\u0000\u0000\u0000\u019d\u019e\u0005;\u0000\u0000"+
		"\u019e\u019f\u0005\u0003\u0000\u0000\u019f\u01ac\u0007\u0002\u0000\u0000"+
		"\u01a0\u01a1\u0005<\u0000\u0000\u01a1\u01a2\u0005\u0003\u0000\u0000\u01a2"+
		"\u01ac\u0007\u0003\u0000\u0000\u01a3\u01a4\u0005=\u0000\u0000\u01a4\u01a5"+
		"\u0005\u0003\u0000\u0000\u01a5\u01ac\u0007\u0003\u0000\u0000\u01a6\u01a7"+
		"\u0005\\\u0000\u0000\u01a7\u01a8\u0005\u0003\u0000\u0000\u01a8\u01ac\u0007"+
		"\u0004\u0000\u0000\u01a9\u01ac\u0003`0\u0000\u01aa\u01ac\u0003*\u0015"+
		"\u0000\u01ab\u019a\u0001\u0000\u0000\u0000\u01ab\u019d\u0001\u0000\u0000"+
		"\u0000\u01ab\u01a0\u0001\u0000\u0000\u0000\u01ab\u01a3\u0001\u0000\u0000"+
		"\u0000\u01ab\u01a6\u0001\u0000\u0000\u0000\u01ab\u01a9\u0001\u0000\u0000"+
		"\u0000\u01ab\u01aa\u0001\u0000\u0000\u0000\u01ac)\u0001\u0000\u0000\u0000"+
		"\u01ad\u01ae\u0005|\u0000\u0000\u01ae\u01af\u0005\u0003\u0000\u0000\u01af"+
		"\u01b0\u0005\u0001\u0000\u0000\u01b0\u01b1\u0005\u0080\u0000\u0000\u01b1"+
		"\u01b2\u0005\t\u0000\u0000\u01b2\u01b3\u0003t:\u0000\u01b3\u01b4\u0005"+
		"\u0002\u0000\u0000\u01b4+\u0001\u0000\u0000\u0000\u01b5\u01b6\u0005\u001d"+
		"\u0000\u0000\u01b6\u01c2\u0005\u0001\u0000\u0000\u01b7\u01bc\u0003.\u0017"+
		"\u0000\u01b8\u01b9\u0005\t\u0000\u0000\u01b9\u01bb\u0003.\u0017\u0000"+
		"\u01ba\u01b8\u0001\u0000\u0000\u0000\u01bb\u01be\u0001\u0000\u0000\u0000"+
		"\u01bc\u01ba\u0001\u0000\u0000\u0000\u01bc\u01bd\u0001\u0000\u0000\u0000"+
		"\u01bd\u01c0\u0001\u0000\u0000\u0000\u01be\u01bc\u0001\u0000\u0000\u0000"+
		"\u01bf\u01c1\u0005\t\u0000\u0000\u01c0\u01bf\u0001\u0000\u0000\u0000\u01c0"+
		"\u01c1\u0001\u0000\u0000\u0000\u01c1\u01c3\u0001\u0000\u0000\u0000\u01c2"+
		"\u01b7\u0001\u0000\u0000\u0000\u01c2\u01c3\u0001\u0000\u0000\u0000\u01c3"+
		"\u01c4\u0001\u0000\u0000\u0000\u01c4\u01c5\u0005\u0002\u0000\u0000\u01c5"+
		"-\u0001\u0000\u0000\u0000\u01c6\u01ce\u0003\u0082A\u0000\u01c7\u01ce\u0003"+
		"\u0084B\u0000\u01c8\u01c9\u0005A\u0000\u0000\u01c9\u01ca\u0005\u0003\u0000"+
		"\u0000\u01ca\u01ce\u0007\u0005\u0000\u0000\u01cb\u01ce\u0003\u0088D\u0000"+
		"\u01cc\u01ce\u00030\u0018\u0000\u01cd\u01c6\u0001\u0000\u0000\u0000\u01cd"+
		"\u01c7\u0001\u0000\u0000\u0000\u01cd\u01c8\u0001\u0000\u0000\u0000\u01cd"+
		"\u01cb\u0001\u0000\u0000\u0000\u01cd\u01cc\u0001\u0000\u0000\u0000\u01ce"+
		"/\u0001\u0000\u0000\u0000\u01cf\u01d0\u0005I\u0000\u0000\u01d0\u01d1\u0005"+
		"\u0003\u0000\u0000\u01d1\u01d2\u00032\u0019\u0000\u01d21\u0001\u0000\u0000"+
		"\u0000\u01d3\u01d4\u0005\u001f\u0000\u0000\u01d4\u01e0\u0005\u0001\u0000"+
		"\u0000\u01d5\u01da\u00034\u001a\u0000\u01d6\u01d7\u0005\t\u0000\u0000"+
		"\u01d7\u01d9\u00034\u001a\u0000\u01d8\u01d6\u0001\u0000\u0000\u0000\u01d9"+
		"\u01dc\u0001\u0000\u0000\u0000\u01da\u01d8\u0001\u0000\u0000\u0000\u01da"+
		"\u01db\u0001\u0000\u0000\u0000\u01db\u01de\u0001\u0000\u0000\u0000\u01dc"+
		"\u01da\u0001\u0000\u0000\u0000\u01dd\u01df\u0005\t\u0000\u0000\u01de\u01dd"+
		"\u0001\u0000\u0000\u0000\u01de\u01df\u0001\u0000\u0000\u0000\u01df\u01e1"+
		"\u0001\u0000\u0000\u0000\u01e0\u01d5\u0001\u0000\u0000\u0000\u01e0\u01e1"+
		"\u0001\u0000\u0000\u0000\u01e1\u01e2\u0001\u0000\u0000\u0000\u01e2\u01e3"+
		"\u0005\u0002\u0000\u0000\u01e33\u0001\u0000\u0000\u0000\u01e4\u01e7\u0003"+
		"\u0086C\u0000\u01e5\u01e7\u00036\u001b\u0000\u01e6\u01e4\u0001\u0000\u0000"+
		"\u0000\u01e6\u01e5\u0001\u0000\u0000\u0000\u01e75\u0001\u0000\u0000\u0000"+
		"\u01e8\u01e9\u0005K\u0000\u0000\u01e9\u01ea\u0005\u0003\u0000\u0000\u01ea"+
		"\u01eb\u00038\u001c\u0000\u01eb7\u0001\u0000\u0000\u0000\u01ec\u01ef\u0003"+
		"<\u001e\u0000\u01ed\u01ef\u0003:\u001d\u0000\u01ee\u01ec\u0001\u0000\u0000"+
		"\u0000\u01ee\u01ed\u0001\u0000\u0000\u0000\u01ef9\u0001\u0000\u0000\u0000"+
		"\u01f0\u01f1\u0005)\u0000\u0000\u01f1\u01f6\u0005\u0001\u0000\u0000\u01f2"+
		"\u01f4\u0003>\u001f\u0000\u01f3\u01f5\u0005\t\u0000\u0000\u01f4\u01f3"+
		"\u0001\u0000\u0000\u0000\u01f4\u01f5\u0001\u0000\u0000\u0000\u01f5\u01f7"+
		"\u0001\u0000\u0000\u0000\u01f6\u01f2\u0001\u0000\u0000\u0000\u01f6\u01f7"+
		"\u0001\u0000\u0000\u0000\u01f7\u01f8\u0001\u0000\u0000\u0000\u01f8\u01f9"+
		"\u0005\u0002\u0000\u0000\u01f9;\u0001\u0000\u0000\u0000\u01fa\u01fb\u0005"+
		"(\u0000\u0000\u01fb\u0207\u0005\u0001\u0000\u0000\u01fc\u0201\u0003@ "+
		"\u0000\u01fd\u01fe\u0005\t\u0000\u0000\u01fe\u0200\u0003@ \u0000\u01ff"+
		"\u01fd\u0001\u0000\u0000\u0000\u0200\u0203\u0001\u0000\u0000\u0000\u0201"+
		"\u01ff\u0001\u0000\u0000\u0000\u0201\u0202\u0001\u0000\u0000\u0000\u0202"+
		"\u0205\u0001\u0000\u0000\u0000\u0203\u0201\u0001\u0000\u0000\u0000\u0204"+
		"\u0206\u0005\t\u0000\u0000\u0205\u0204\u0001\u0000\u0000\u0000\u0205\u0206"+
		"\u0001\u0000\u0000\u0000\u0206\u0208\u0001\u0000\u0000\u0000\u0207\u01fc"+
		"\u0001\u0000\u0000\u0000\u0207\u0208\u0001\u0000\u0000\u0000\u0208\u0209"+
		"\u0001\u0000\u0000\u0000\u0209\u020a\u0005\u0002\u0000\u0000\u020a=\u0001"+
		"\u0000\u0000\u0000\u020b\u020c\u0005k\u0000\u0000\u020c\u020d\u0005\u0003"+
		"\u0000\u0000\u020d\u020e\u0007\u0003\u0000\u0000\u020e?\u0001\u0000\u0000"+
		"\u0000\u020f\u0210\u0005N\u0000\u0000\u0210\u0211\u0005\u0003\u0000\u0000"+
		"\u0211\u021c\u0007\u0006\u0000\u0000\u0212\u0213\u0005O\u0000\u0000\u0213"+
		"\u0214\u0005\u0003\u0000\u0000\u0214\u021c\u0007\u0006\u0000\u0000\u0215"+
		"\u0216\u0005P\u0000\u0000\u0216\u0217\u0005\u0003\u0000\u0000\u0217\u021c"+
		"\u0007\u0006\u0000\u0000\u0218\u0219\u0005Q\u0000\u0000\u0219\u021a\u0005"+
		"\u0003\u0000\u0000\u021a\u021c\u0007\u0006\u0000\u0000\u021b\u020f\u0001"+
		"\u0000\u0000\u0000\u021b\u0212\u0001\u0000\u0000\u0000\u021b\u0215\u0001"+
		"\u0000\u0000\u0000\u021b\u0218\u0001\u0000\u0000\u0000\u021cA\u0001\u0000"+
		"\u0000\u0000\u021d\u021e\u0005\u001e\u0000\u0000\u021e\u022a\u0005\u0001"+
		"\u0000\u0000\u021f\u0224\u0003D\"\u0000\u0220\u0221\u0005\t\u0000\u0000"+
		"\u0221\u0223\u0003D\"\u0000\u0222\u0220\u0001\u0000\u0000\u0000\u0223"+
		"\u0226\u0001\u0000\u0000\u0000\u0224\u0222\u0001\u0000\u0000\u0000\u0224"+
		"\u0225\u0001\u0000\u0000\u0000\u0225\u0228\u0001\u0000\u0000\u0000\u0226"+
		"\u0224\u0001\u0000\u0000\u0000\u0227\u0229\u0005\t\u0000\u0000\u0228\u0227"+
		"\u0001\u0000\u0000\u0000\u0228\u0229\u0001\u0000\u0000\u0000\u0229\u022b"+
		"\u0001\u0000\u0000\u0000\u022a\u021f\u0001\u0000\u0000\u0000\u022a\u022b"+
		"\u0001\u0000\u0000\u0000\u022b\u022c\u0001\u0000\u0000\u0000\u022c\u022d"+
		"\u0005\u0002\u0000\u0000\u022dC\u0001\u0000\u0000\u0000\u022e\u022f\u0005"+
		"C\u0000\u0000\u022f\u0230\u0005\u0003\u0000\u0000\u0230\u0233\u0007\u0006"+
		"\u0000\u0000\u0231\u0233\u0003\u0088D\u0000\u0232\u022e\u0001\u0000\u0000"+
		"\u0000\u0232\u0231\u0001\u0000\u0000\u0000\u0233E\u0001\u0000\u0000\u0000"+
		"\u0234\u0235\u0005%\u0000\u0000\u0235\u0241\u0005\u0001\u0000\u0000\u0236"+
		"\u023b\u0003H$\u0000\u0237\u0238\u0005\t\u0000\u0000\u0238\u023a\u0003"+
		"H$\u0000\u0239\u0237\u0001\u0000\u0000\u0000\u023a\u023d\u0001\u0000\u0000"+
		"\u0000\u023b\u0239\u0001\u0000\u0000\u0000\u023b\u023c\u0001\u0000\u0000"+
		"\u0000\u023c\u023f\u0001\u0000\u0000\u0000\u023d\u023b\u0001\u0000\u0000"+
		"\u0000\u023e\u0240\u0005\t\u0000\u0000\u023f\u023e\u0001\u0000\u0000\u0000"+
		"\u023f\u0240\u0001\u0000\u0000\u0000\u0240\u0242\u0001\u0000\u0000\u0000"+
		"\u0241\u0236\u0001\u0000\u0000\u0000\u0241\u0242\u0001\u0000\u0000\u0000"+
		"\u0242\u0243\u0001\u0000\u0000\u0000\u0243\u0244\u0005\u0002\u0000\u0000"+
		"\u0244G\u0001\u0000\u0000\u0000\u0245\u0248\u0003\u0090H\u0000\u0246\u0248"+
		"\u0003\u0088D\u0000\u0247\u0245\u0001\u0000\u0000\u0000\u0247\u0246\u0001"+
		"\u0000\u0000\u0000\u0248I\u0001\u0000\u0000\u0000\u0249\u024a\u0005 \u0000"+
		"\u0000\u024a\u0256\u0005\u0001\u0000\u0000\u024b\u0250\u0003L&\u0000\u024c"+
		"\u024d\u0005\t\u0000\u0000\u024d\u024f\u0003L&\u0000\u024e\u024c\u0001"+
		"\u0000\u0000\u0000\u024f\u0252\u0001\u0000\u0000\u0000\u0250\u024e\u0001"+
		"\u0000\u0000\u0000\u0250\u0251\u0001\u0000\u0000\u0000\u0251\u0254\u0001"+
		"\u0000\u0000\u0000\u0252\u0250\u0001\u0000\u0000\u0000\u0253\u0255\u0005"+
		"\t\u0000\u0000\u0254\u0253\u0001\u0000\u0000\u0000\u0254\u0255\u0001\u0000"+
		"\u0000\u0000\u0255\u0257\u0001\u0000\u0000\u0000\u0256\u024b\u0001\u0000"+
		"\u0000\u0000\u0256\u0257\u0001\u0000\u0000\u0000\u0257\u0258\u0001\u0000"+
		"\u0000\u0000\u0258\u0259\u0005\u0002\u0000\u0000\u0259K\u0001\u0000\u0000"+
		"\u0000\u025a\u025b\u0005M\u0000\u0000\u025b\u025c\u0005\u0003\u0000\u0000"+
		"\u025c\u025f\u0003N\'\u0000\u025d\u025f\u0003\u0088D\u0000\u025e\u025a"+
		"\u0001\u0000\u0000\u0000\u025e\u025d\u0001\u0000\u0000\u0000\u025fM\u0001"+
		"\u0000\u0000\u0000\u0260\u0261\u0005!\u0000\u0000\u0261\u026d\u0005\u0001"+
		"\u0000\u0000\u0262\u0267\u0003P(\u0000\u0263\u0264\u0005\t\u0000\u0000"+
		"\u0264\u0266\u0003P(\u0000\u0265\u0263\u0001\u0000\u0000\u0000\u0266\u0269"+
		"\u0001\u0000\u0000\u0000\u0267\u0265\u0001\u0000\u0000\u0000\u0267\u0268"+
		"\u0001\u0000\u0000\u0000\u0268\u026b\u0001\u0000\u0000\u0000\u0269\u0267"+
		"\u0001\u0000\u0000\u0000\u026a\u026c\u0005\t\u0000\u0000\u026b\u026a\u0001"+
		"\u0000\u0000\u0000\u026b\u026c\u0001\u0000\u0000\u0000\u026c\u026e\u0001"+
		"\u0000\u0000\u0000\u026d\u0262\u0001\u0000\u0000\u0000\u026d\u026e\u0001"+
		"\u0000\u0000\u0000\u026e\u026f\u0001\u0000\u0000\u0000\u026f\u0281\u0005"+
		"\u0002\u0000\u0000\u0270\u0271\u0005\"\u0000\u0000\u0271\u027d\u0005\u0001"+
		"\u0000\u0000\u0272\u0277\u0003R)\u0000\u0273\u0274\u0005\t\u0000\u0000"+
		"\u0274\u0276\u0003R)\u0000\u0275\u0273\u0001\u0000\u0000\u0000\u0276\u0279"+
		"\u0001\u0000\u0000\u0000\u0277\u0275\u0001\u0000\u0000\u0000\u0277\u0278"+
		"\u0001\u0000\u0000\u0000\u0278\u027b\u0001\u0000\u0000\u0000\u0279\u0277"+
		"\u0001\u0000\u0000\u0000\u027a\u027c\u0005\t\u0000\u0000\u027b\u027a\u0001"+
		"\u0000\u0000\u0000\u027b\u027c\u0001\u0000\u0000\u0000\u027c\u027e\u0001"+
		"\u0000\u0000\u0000\u027d\u0272\u0001\u0000\u0000\u0000\u027d\u027e\u0001"+
		"\u0000\u0000\u0000\u027e\u027f\u0001\u0000\u0000\u0000\u027f\u0281\u0005"+
		"\u0002\u0000\u0000\u0280\u0260\u0001\u0000\u0000\u0000\u0280\u0270\u0001"+
		"\u0000\u0000\u0000\u0281O\u0001\u0000\u0000\u0000\u0282\u0283\u0005m\u0000"+
		"\u0000\u0283\u0284\u0005\u0003\u0000\u0000\u0284\u028f\u0007\u0003\u0000"+
		"\u0000\u0285\u0286\u0005n\u0000\u0000\u0286\u0287\u0005\u0003\u0000\u0000"+
		"\u0287\u028f\u0007\u0003\u0000\u0000\u0288\u0289\u0005p\u0000\u0000\u0289"+
		"\u028a\u0005\u0003\u0000\u0000\u028a\u028f\u0007\u0003\u0000\u0000\u028b"+
		"\u028c\u0005o\u0000\u0000\u028c\u028d\u0005\u0003\u0000\u0000\u028d\u028f"+
		"\u0007\u0003\u0000\u0000\u028e\u0282\u0001\u0000\u0000\u0000\u028e\u0285"+
		"\u0001\u0000\u0000\u0000\u028e\u0288\u0001\u0000\u0000\u0000\u028e\u028b"+
		"\u0001\u0000\u0000\u0000\u028fQ\u0001\u0000\u0000\u0000\u0290\u0291\u0005"+
		"R\u0000\u0000\u0291\u0292\u0005\u0003\u0000\u0000\u0292\u0297\u0007\u0003"+
		"\u0000\u0000\u0293\u0294\u0005S\u0000\u0000\u0294\u0295\u0005\u0003\u0000"+
		"\u0000\u0295\u0297\u0007\u0003\u0000\u0000\u0296\u0290\u0001\u0000\u0000"+
		"\u0000\u0296\u0293\u0001\u0000\u0000\u0000\u0297S\u0001\u0000\u0000\u0000"+
		"\u0298\u0299\u0005#\u0000\u0000\u0299\u02a5\u0005\u0001\u0000\u0000\u029a"+
		"\u029f\u0003V+\u0000\u029b\u029c\u0005\t\u0000\u0000\u029c\u029e\u0003"+
		"V+\u0000\u029d\u029b\u0001\u0000\u0000\u0000\u029e\u02a1\u0001\u0000\u0000"+
		"\u0000\u029f\u029d\u0001\u0000\u0000\u0000\u029f\u02a0\u0001\u0000\u0000"+
		"\u0000\u02a0\u02a3\u0001\u0000\u0000\u0000\u02a1\u029f\u0001\u0000\u0000"+
		"\u0000\u02a2\u02a4\u0005\t\u0000\u0000\u02a3\u02a2\u0001\u0000\u0000\u0000"+
		"\u02a3\u02a4\u0001\u0000\u0000\u0000\u02a4\u02a6\u0001\u0000\u0000\u0000"+
		"\u02a5\u029a\u0001\u0000\u0000\u0000\u02a5\u02a6\u0001\u0000\u0000\u0000"+
		"\u02a6\u02a7\u0001\u0000\u0000\u0000\u02a7\u02a8\u0005\u0002\u0000\u0000"+
		"\u02a8U\u0001\u0000\u0000\u0000\u02a9\u02aa\u0005U\u0000\u0000\u02aa\u02ab"+
		"\u0005\u0003\u0000\u0000\u02ab\u02b2\u0007\u0000\u0000\u0000\u02ac\u02ad"+
		"\u0005T\u0000\u0000\u02ad\u02ae\u0005\u0003\u0000\u0000\u02ae\u02b2\u0007"+
		"\u0007\u0000\u0000\u02af\u02b2\u0003\u0082A\u0000\u02b0\u02b2\u0003\u0084"+
		"B\u0000\u02b1\u02a9\u0001\u0000\u0000\u0000\u02b1\u02ac\u0001\u0000\u0000"+
		"\u0000\u02b1\u02af\u0001\u0000\u0000\u0000\u02b1\u02b0\u0001\u0000\u0000"+
		"\u0000\u02b2W\u0001\u0000\u0000\u0000\u02b3\u02b4\u0005$\u0000\u0000\u02b4"+
		"\u02c0\u0005\u0001\u0000\u0000\u02b5\u02ba\u0003Z-\u0000\u02b6\u02b7\u0005"+
		"\t\u0000\u0000\u02b7\u02b9\u0003Z-\u0000\u02b8\u02b6\u0001\u0000\u0000"+
		"\u0000\u02b9\u02bc\u0001\u0000\u0000\u0000\u02ba\u02b8\u0001\u0000\u0000"+
		"\u0000\u02ba\u02bb\u0001\u0000\u0000\u0000\u02bb\u02be\u0001\u0000\u0000"+
		"\u0000\u02bc\u02ba\u0001\u0000\u0000\u0000\u02bd\u02bf\u0005\t\u0000\u0000"+
		"\u02be\u02bd\u0001\u0000\u0000\u0000\u02be\u02bf\u0001\u0000\u0000\u0000"+
		"\u02bf\u02c1\u0001\u0000\u0000\u0000\u02c0\u02b5\u0001\u0000\u0000\u0000"+
		"\u02c0\u02c1\u0001\u0000\u0000\u0000\u02c1\u02c2\u0001\u0000\u0000\u0000"+
		"\u02c2\u02c3\u0005\u0002\u0000\u0000\u02c3Y\u0001\u0000\u0000\u0000\u02c4"+
		"\u02d1\u0003\u0082A\u0000\u02c5\u02d1\u0003\u0084B\u0000\u02c6\u02c7\u0005"+
		"V\u0000\u0000\u02c7\u02c8\u0005\u0003\u0000\u0000\u02c8\u02d1\u0007\u0000"+
		"\u0000\u0000\u02c9\u02ca\u0005W\u0000\u0000\u02ca\u02cb\u0005\u0003\u0000"+
		"\u0000\u02cb\u02d1\u0005\u0081\u0000\u0000\u02cc\u02cd\u0005X\u0000\u0000"+
		"\u02cd\u02ce\u0005\u0003\u0000\u0000\u02ce\u02d1\u0005\u0081\u0000\u0000"+
		"\u02cf\u02d1\u0003\u0090H\u0000\u02d0\u02c4\u0001\u0000\u0000\u0000\u02d0"+
		"\u02c5\u0001\u0000\u0000\u0000\u02d0\u02c6\u0001\u0000\u0000\u0000\u02d0"+
		"\u02c9\u0001\u0000\u0000\u0000\u02d0\u02cc\u0001\u0000\u0000\u0000\u02d0"+
		"\u02cf\u0001\u0000\u0000\u0000\u02d1[\u0001\u0000\u0000\u0000\u02d2\u02d3"+
		"\u0005&\u0000\u0000\u02d3\u02df\u0005\u0001\u0000\u0000\u02d4\u02d9\u0003"+
		"^/\u0000\u02d5\u02d6\u0005\t\u0000\u0000\u02d6\u02d8\u0003^/\u0000\u02d7"+
		"\u02d5\u0001\u0000\u0000\u0000\u02d8\u02db\u0001\u0000\u0000\u0000\u02d9"+
		"\u02d7\u0001\u0000\u0000\u0000\u02d9\u02da\u0001\u0000\u0000\u0000\u02da"+
		"\u02dd\u0001\u0000\u0000\u0000\u02db\u02d9\u0001\u0000\u0000\u0000\u02dc"+
		"\u02de\u0005\t\u0000\u0000\u02dd\u02dc\u0001\u0000\u0000\u0000\u02dd\u02de"+
		"\u0001\u0000\u0000\u0000\u02de\u02e0\u0001\u0000\u0000\u0000\u02df\u02d4"+
		"\u0001\u0000\u0000\u0000\u02df\u02e0\u0001\u0000\u0000\u0000\u02e0\u02e1"+
		"\u0001\u0000\u0000\u0000\u02e1\u02e2\u0005\u0002\u0000\u0000\u02e2]\u0001"+
		"\u0000\u0000\u0000\u02e3\u02e4\u0005e\u0000\u0000\u02e4\u02e5\u0005\u0003"+
		"\u0000\u0000\u02e5\u030a\u0007\u0000\u0000\u0000\u02e6\u02e7\u0005f\u0000"+
		"\u0000\u02e7\u02e8\u0005\u0003\u0000\u0000\u02e8\u030a\u0007\u0000\u0000"+
		"\u0000\u02e9\u02ea\u0005g\u0000\u0000\u02ea\u02eb\u0005\u0003\u0000\u0000"+
		"\u02eb\u030a\u0005\u0081\u0000\u0000\u02ec\u02ed\u0005M\u0000\u0000\u02ed"+
		"\u02ee\u0005\u0003\u0000\u0000\u02ee\u030a\u0003N\'\u0000\u02ef\u02f0"+
		"\u0005h\u0000\u0000\u02f0\u02f1\u0005\u0003\u0000\u0000\u02f1\u030a\u0007"+
		"\u0000\u0000\u0000\u02f2\u02f3\u0005i\u0000\u0000\u02f3\u02f4\u0005\u0003"+
		"\u0000\u0000\u02f4\u030a\u0003b1\u0000\u02f5\u02f6\u0005l\u0000\u0000"+
		"\u02f6\u02f7\u0005\u0003\u0000\u0000\u02f7\u02fc\u0005\u0001\u0000\u0000"+
		"\u02f8\u02f9\u0005\u0083\u0000\u0000\u02f9\u02fb\u0005\t\u0000\u0000\u02fa"+
		"\u02f8\u0001\u0000\u0000\u0000\u02fb\u02fe\u0001\u0000\u0000\u0000\u02fc"+
		"\u02fa\u0001\u0000\u0000\u0000\u02fc\u02fd\u0001\u0000\u0000\u0000\u02fd"+
		"\u02ff\u0001\u0000\u0000\u0000\u02fe\u02fc\u0001\u0000\u0000\u0000\u02ff"+
		"\u0300\u0005\u0002\u0000\u0000\u0300\u0304\u0005\u0006\u0000\u0000\u0301"+
		"\u0303\u0003n7\u0000\u0302\u0301\u0001\u0000\u0000\u0000\u0303\u0306\u0001"+
		"\u0000\u0000\u0000\u0304\u0302\u0001\u0000\u0000\u0000\u0304\u0305\u0001"+
		"\u0000\u0000\u0000\u0305\u0307\u0001\u0000\u0000\u0000\u0306\u0304\u0001"+
		"\u0000\u0000\u0000\u0307\u030a\u0005\u0007\u0000\u0000\u0308\u030a\u0003"+
		"`0\u0000\u0309\u02e3\u0001\u0000\u0000\u0000\u0309\u02e6\u0001\u0000\u0000"+
		"\u0000\u0309\u02e9\u0001\u0000\u0000\u0000\u0309\u02ec\u0001\u0000\u0000"+
		"\u0000\u0309\u02ef\u0001\u0000\u0000\u0000\u0309\u02f2\u0001\u0000\u0000"+
		"\u0000\u0309\u02f5\u0001\u0000\u0000\u0000\u0309\u0308\u0001\u0000\u0000"+
		"\u0000\u030a_\u0001\u0000\u0000\u0000\u030b\u030c\u0005x\u0000\u0000\u030c"+
		"\u030d\u0005\u0003\u0000\u0000\u030d\u030e\u0007\u0000\u0000\u0000\u030e"+
		"a\u0001\u0000\u0000\u0000\u030f\u0310\u0005\'\u0000\u0000\u0310\u031c"+
		"\u0005\u0001\u0000\u0000\u0311\u0316\u0003d2\u0000\u0312\u0313\u0005\t"+
		"\u0000\u0000\u0313\u0315\u0003d2\u0000\u0314\u0312\u0001\u0000\u0000\u0000"+
		"\u0315\u0318\u0001\u0000\u0000\u0000\u0316\u0314\u0001\u0000\u0000\u0000"+
		"\u0316\u0317\u0001\u0000\u0000\u0000\u0317\u031a\u0001\u0000\u0000\u0000"+
		"\u0318\u0316\u0001\u0000\u0000\u0000\u0319\u031b\u0005\t\u0000\u0000\u031a"+
		"\u0319\u0001\u0000\u0000\u0000\u031a\u031b\u0001\u0000\u0000\u0000\u031b"+
		"\u031d\u0001\u0000\u0000\u0000\u031c\u0311\u0001\u0000\u0000\u0000\u031c"+
		"\u031d\u0001\u0000\u0000\u0000\u031d\u031e\u0001\u0000\u0000\u0000\u031e"+
		"\u031f\u0005\u0002\u0000\u0000\u031fc\u0001\u0000\u0000\u0000\u0320\u0321"+
		"\u0005j\u0000\u0000\u0321\u0322\u0005\u0003\u0000\u0000\u0322\u0326\u0007"+
		"\u0006\u0000\u0000\u0323\u0326\u00036\u001b\u0000\u0324\u0326\u0003\u0086"+
		"C\u0000\u0325\u0320\u0001\u0000\u0000\u0000\u0325\u0323\u0001\u0000\u0000"+
		"\u0000\u0325\u0324\u0001\u0000\u0000\u0000\u0326e\u0001\u0000\u0000\u0000"+
		"\u0327\u0328\u0005*\u0000\u0000\u0328\u0329\u0005\u0001\u0000\u0000\u0329"+
		"\u032e\u0003h4\u0000\u032a\u032b\u0005\t\u0000\u0000\u032b\u032d\u0003"+
		"h4\u0000\u032c\u032a\u0001\u0000\u0000\u0000\u032d\u0330\u0001\u0000\u0000"+
		"\u0000\u032e\u032c\u0001\u0000\u0000\u0000\u032e\u032f\u0001\u0000\u0000"+
		"\u0000\u032f\u0332\u0001\u0000\u0000\u0000\u0330\u032e\u0001\u0000\u0000"+
		"\u0000\u0331\u0333\u0005\t\u0000\u0000\u0332\u0331\u0001\u0000\u0000\u0000"+
		"\u0332\u0333\u0001\u0000\u0000\u0000\u0333\u0334\u0001\u0000\u0000\u0000"+
		"\u0334\u0335\u0005\u0002\u0000\u0000\u0335g\u0001\u0000\u0000\u0000\u0336"+
		"\u0337\u0005q\u0000\u0000\u0337\u0338\u0005\u0003\u0000\u0000\u0338\u033b"+
		"\u0003\u0094J\u0000\u0339\u033b\u0003\u0088D\u0000\u033a\u0336\u0001\u0000"+
		"\u0000\u0000\u033a\u0339\u0001\u0000\u0000\u0000\u033bi\u0001\u0000\u0000"+
		"\u0000\u033c\u033d\u0005+\u0000\u0000\u033d\u033e\u0005\u0001\u0000\u0000"+
		"\u033e\u0343\u0003l6\u0000\u033f\u0340\u0005\t\u0000\u0000\u0340\u0342"+
		"\u0003l6\u0000\u0341\u033f\u0001\u0000\u0000\u0000\u0342\u0345\u0001\u0000"+
		"\u0000\u0000\u0343\u0341\u0001\u0000\u0000\u0000\u0343\u0344\u0001\u0000"+
		"\u0000\u0000\u0344\u0347\u0001\u0000\u0000\u0000\u0345\u0343\u0001\u0000"+
		"\u0000\u0000\u0346\u0348\u0005\t\u0000\u0000\u0347\u0346\u0001\u0000\u0000"+
		"\u0000\u0347\u0348\u0001\u0000\u0000\u0000\u0348\u0349\u0001\u0000\u0000"+
		"\u0000\u0349\u034a\u0005\u0002\u0000\u0000\u034ak\u0001\u0000\u0000\u0000"+
		"\u034b\u034c\u0005t\u0000\u0000\u034c\u034d\u0005\u0003\u0000\u0000\u034d"+
		"\u0350\u0007\u0006\u0000\u0000\u034e\u0350\u0003\u0088D\u0000\u034f\u034b"+
		"\u0001\u0000\u0000\u0000\u034f\u034e\u0001\u0000\u0000\u0000\u0350m\u0001"+
		"\u0000\u0000\u0000\u0351\u035d\u0003x<\u0000\u0352\u035d\u0003z=\u0000"+
		"\u0353\u035d\u0003\u0080@\u0000\u0354\u035d\u0003|>\u0000\u0355\u035d"+
		"\u0003~?\u0000\u0356\u035d\u0003r9\u0000\u0357\u035d\u0003t:\u0000\u0358"+
		"\u0359\u0003v;\u0000\u0359\u035a\u0005\b\u0000\u0000\u035a\u035d\u0001"+
		"\u0000\u0000\u0000\u035b\u035d\u0003p8\u0000\u035c\u0351\u0001\u0000\u0000"+
		"\u0000\u035c\u0352\u0001\u0000\u0000\u0000\u035c\u0353\u0001\u0000\u0000"+
		"\u0000\u035c\u0354\u0001\u0000\u0000\u0000\u035c\u0355\u0001\u0000\u0000"+
		"\u0000\u035c\u0356\u0001\u0000\u0000\u0000\u035c\u0357\u0001\u0000\u0000"+
		"\u0000\u035c\u0358\u0001\u0000\u0000\u0000\u035c\u035b\u0001\u0000\u0000"+
		"\u0000\u035do\u0001\u0000\u0000\u0000\u035e\u035f\u0005|\u0000\u0000\u035f"+
		"\u0360\u0005\u0001\u0000\u0000\u0360\u0361\u0005\u0080\u0000\u0000\u0361"+
		"\u0362\u0005\t\u0000\u0000\u0362\u0363\u0003t:\u0000\u0363\u0364\u0005"+
		"\u0002\u0000\u0000\u0364\u0365\u0005\b\u0000\u0000\u0365q\u0001\u0000"+
		"\u0000\u0000\u0366\u0367\u0005y\u0000\u0000\u0367\u0368\u0005\u0001\u0000"+
		"\u0000\u0368\u0369\u0005\u0080\u0000\u0000\u0369\u036d\u0005\t\u0000\u0000"+
		"\u036a\u036e\u0005\u007f\u0000\u0000\u036b\u036e\u0005\u0080\u0000\u0000"+
		"\u036c\u036e\u0003v;\u0000\u036d\u036a\u0001\u0000\u0000\u0000\u036d\u036b"+
		"\u0001\u0000\u0000\u0000\u036d\u036c\u0001\u0000\u0000\u0000\u036e\u036f"+
		"\u0001\u0000\u0000\u0000\u036f\u0370\u0005\u0002\u0000\u0000\u0370\u0371"+
		"\u0005\b\u0000\u0000\u0371s\u0001\u0000\u0000\u0000\u0372\u0373\u0005"+
		"z\u0000\u0000\u0373\u0374\u0005\u0001\u0000\u0000\u0374\u0375\u0005\u0080"+
		"\u0000\u0000\u0375\u0376\u0005\u0002\u0000\u0000\u0376u\u0001\u0000\u0000"+
		"\u0000\u0377\u0378\u0005{\u0000\u0000\u0378\u0379\u0005\u0001\u0000\u0000"+
		"\u0379\u037a\u0005\u0080\u0000\u0000\u037a\u037b\u0005\u0002\u0000\u0000"+
		"\u037bw\u0001\u0000\u0000\u0000\u037c\u037d\u0007\b\u0000\u0000\u037d"+
		"\u037e\u0005\u0083\u0000\u0000\u037e\u038c\u0005\b\u0000\u0000\u037f\u0380"+
		"\u00058\u0000\u0000\u0380\u0385\u0005\u0001\u0000\u0000\u0381\u0382\u0007"+
		"\b\u0000\u0000\u0382\u0384\u0005\t\u0000\u0000\u0383\u0381\u0001\u0000"+
		"\u0000\u0000\u0384\u0387\u0001\u0000\u0000\u0000\u0385\u0383\u0001\u0000"+
		"\u0000\u0000\u0385\u0386\u0001\u0000\u0000\u0000\u0386\u0388\u0001\u0000"+
		"\u0000\u0000\u0387\u0385\u0001\u0000\u0000\u0000\u0388\u0389\u0005\u0002"+
		"\u0000\u0000\u0389\u038a\u0005\u0083\u0000\u0000\u038a\u038c\u0005\b\u0000"+
		"\u0000\u038b\u037c\u0001\u0000\u0000\u0000\u038b\u037f\u0001\u0000\u0000"+
		"\u0000\u038cy\u0001\u0000\u0000\u0000\u038d\u038e\u0005\u0083\u0000\u0000"+
		"\u038e\u0395\u0005\n\u0000\u0000\u038f\u0391\u0005\u0012\u0000\u0000\u0390"+
		"\u038f\u0001\u0000\u0000\u0000\u0390\u0391\u0001\u0000\u0000\u0000\u0391"+
		"\u0392\u0001\u0000\u0000\u0000\u0392\u0396\u0005\u007f\u0000\u0000\u0393"+
		"\u0396\u0005~\u0000\u0000\u0394\u0396\u0005\u0080\u0000\u0000\u0395\u0390"+
		"\u0001\u0000\u0000\u0000\u0395\u0393\u0001\u0000\u0000\u0000\u0395\u0394"+
		"\u0001\u0000\u0000\u0000\u0396\u0397\u0001\u0000\u0000\u0000\u0397\u0398"+
		"\u0005\b\u0000\u0000\u0398{\u0001\u0000\u0000\u0000\u0399\u039a\u0005"+
		".\u0000\u0000\u039a\u039b\u0005\u0001\u0000\u0000\u039b\u039c\u0005\u0080"+
		"\u0000\u0000\u039c\u039d\u0005\u0002\u0000\u0000\u039d\u039e\u0005\b\u0000"+
		"\u0000\u039e}\u0001\u0000\u0000\u0000\u039f\u03a0\u0005/\u0000\u0000\u03a0"+
		"\u03a1\u0005\u0001\u0000\u0000\u03a1\u03a2\u0005\u0080\u0000\u0000\u03a2"+
		"\u03a3\u0005\u0002\u0000\u0000\u03a3\u03a4\u0005\b\u0000\u0000\u03a4\u007f"+
		"\u0001\u0000\u0000\u0000\u03a5\u03a6\u00053\u0000\u0000\u03a6\u03a7\u0005"+
		"\u0082\u0000\u0000\u03a7\u03ab\u0005\u0006\u0000\u0000\u03a8\u03aa\u0003"+
		"x<\u0000\u03a9\u03a8\u0001\u0000\u0000\u0000\u03aa\u03ad\u0001\u0000\u0000"+
		"\u0000\u03ab\u03a9\u0001\u0000\u0000\u0000\u03ab\u03ac\u0001\u0000\u0000"+
		"\u0000\u03ac\u03ae\u0001\u0000\u0000\u0000\u03ad\u03ab\u0001\u0000\u0000"+
		"\u0000\u03ae\u03af\u00057\u0000\u0000\u03af\u03b0\u0005\u0001\u0000\u0000"+
		"\u03b0\u03b1\u0003\n\u0005\u0000\u03b1\u03b2\u0005\u0002\u0000\u0000\u03b2"+
		"\u03b3\u0005\u0007\u0000\u0000\u03b3\u0081\u0001\u0000\u0000\u0000\u03b4"+
		"\u03b5\u0005?\u0000\u0000\u03b5\u03b6\u0005\u0003\u0000\u0000\u03b6\u03b7"+
		"\u0007\u0003\u0000\u0000\u03b7\u0083\u0001\u0000\u0000\u0000\u03b8\u03b9"+
		"\u0005@\u0000\u0000\u03b9\u03ba\u0005\u0003\u0000\u0000\u03ba\u03bb\u0007"+
		"\u0003\u0000\u0000\u03bb\u0085\u0001\u0000\u0000\u0000\u03bc\u03bd\u0005"+
		"J\u0000\u0000\u03bd\u03be\u0005\u0003\u0000\u0000\u03be\u03bf\u0005\u0081"+
		"\u0000\u0000\u03bf\u0087\u0001\u0000\u0000\u0000\u03c0\u03c1\u00052\u0000"+
		"\u0000\u03c1\u03c2\u0005\u0003\u0000\u0000\u03c2\u03c3\u0003\n\u0005\u0000"+
		"\u03c3\u0089\u0001\u0000\u0000\u0000\u03c4\u03c5\u00050\u0000\u0000\u03c5"+
		"\u03c6\u0005\u0003\u0000\u0000\u03c6\u03d2\u0005\u0004\u0000\u0000\u03c7"+
		"\u03cc\u0003\n\u0005\u0000\u03c8\u03c9\u0005\t\u0000\u0000\u03c9\u03cb"+
		"\u0003\n\u0005\u0000\u03ca\u03c8\u0001\u0000\u0000\u0000\u03cb\u03ce\u0001"+
		"\u0000\u0000\u0000\u03cc\u03ca\u0001\u0000\u0000\u0000\u03cc\u03cd\u0001"+
		"\u0000\u0000\u0000\u03cd\u03d0\u0001\u0000\u0000\u0000\u03ce\u03cc\u0001"+
		"\u0000\u0000\u0000\u03cf\u03d1\u0005\t\u0000\u0000\u03d0\u03cf\u0001\u0000"+
		"\u0000\u0000\u03d0\u03d1\u0001\u0000\u0000\u0000\u03d1\u03d3\u0001\u0000"+
		"\u0000\u0000\u03d2\u03c7\u0001\u0000\u0000\u0000\u03d2\u03d3\u0001\u0000"+
		"\u0000\u0000\u03d3\u03d4\u0001\u0000\u0000\u0000\u03d4\u03d5\u0005\u0005"+
		"\u0000\u0000\u03d5\u008b\u0001\u0000\u0000\u0000\u03d6\u03d7\u0005D\u0000"+
		"\u0000\u03d7\u03d8\u0005\u0003\u0000\u0000\u03d8\u03d9\u0007\t\u0000\u0000"+
		"\u03d9\u008d\u0001\u0000\u0000\u0000\u03da\u03db\u0005G\u0000\u0000\u03db"+
		"\u03dc\u0005\u0003\u0000\u0000\u03dc\u03dd\u0007\n\u0000\u0000\u03dd\u008f"+
		"\u0001\u0000\u0000\u0000\u03de\u03df\u0005]\u0000\u0000\u03df\u03e0\u0005"+
		"\u0003\u0000\u0000\u03e0\u03e5\u0005\u0001\u0000\u0000\u03e1\u03e2\u0005"+
		"\u0083\u0000\u0000\u03e2\u03e4\u0005\t\u0000\u0000\u03e3\u03e1\u0001\u0000"+
		"\u0000\u0000\u03e4\u03e7\u0001\u0000\u0000\u0000\u03e5\u03e3\u0001\u0000"+
		"\u0000\u0000\u03e5\u03e6\u0001\u0000\u0000\u0000\u03e6\u03e8\u0001\u0000"+
		"\u0000\u0000\u03e7\u03e5\u0001\u0000\u0000\u0000\u03e8\u03e9\u0005\u0002"+
		"\u0000\u0000\u03e9\u03ed\u0005\u0006\u0000\u0000\u03ea\u03ec\u0003n7\u0000"+
		"\u03eb\u03ea\u0001\u0000\u0000\u0000\u03ec\u03ef\u0001\u0000\u0000\u0000"+
		"\u03ed\u03eb\u0001\u0000\u0000\u0000\u03ed\u03ee\u0001\u0000\u0000\u0000"+
		"\u03ee\u03f0\u0001\u0000\u0000\u0000\u03ef\u03ed\u0001\u0000\u0000\u0000"+
		"\u03f0\u03f1\u0005\u0007\u0000\u0000\u03f1\u0091\u0001\u0000\u0000\u0000"+
		"\u03f2\u03f7\u0003\u0094J\u0000\u03f3\u03f4\u0005\t\u0000\u0000\u03f4"+
		"\u03f6\u0003\u0094J\u0000\u03f5\u03f3\u0001\u0000\u0000\u0000\u03f6\u03f9"+
		"\u0001\u0000\u0000\u0000\u03f7\u03f5\u0001\u0000\u0000\u0000\u03f7\u03f8"+
		"\u0001\u0000\u0000\u0000\u03f8\u0093\u0001\u0000\u0000\u0000\u03f9\u03f7"+
		"\u0001\u0000\u0000\u0000\u03fa\u03fb\u0003\u0096K\u0000\u03fb\u0095\u0001"+
		"\u0000\u0000\u0000\u03fc\u0401\u0003\u0098L\u0000\u03fd\u03fe\u0005\u0013"+
		"\u0000\u0000\u03fe\u0400\u0003\u0098L\u0000\u03ff\u03fd\u0001\u0000\u0000"+
		"\u0000\u0400\u0403\u0001\u0000\u0000\u0000\u0401\u03ff\u0001\u0000\u0000"+
		"\u0000\u0401\u0402\u0001\u0000\u0000\u0000\u0402\u0097\u0001\u0000\u0000"+
		"\u0000\u0403\u0401\u0001\u0000\u0000\u0000\u0404\u0409\u0003\u009aM\u0000"+
		"\u0405\u0406\u0005\u0014\u0000\u0000\u0406\u0408\u0003\u009aM\u0000\u0407"+
		"\u0405\u0001\u0000\u0000\u0000\u0408\u040b\u0001\u0000\u0000\u0000\u0409"+
		"\u0407\u0001\u0000\u0000\u0000\u0409\u040a\u0001\u0000\u0000\u0000\u040a"+
		"\u0099\u0001\u0000\u0000\u0000\u040b\u0409\u0001\u0000\u0000\u0000\u040c"+
		"\u040f\u0003\u009cN\u0000\u040d\u040e\u0007\u000b\u0000\u0000\u040e\u0410"+
		"\u0003\u009cN\u0000\u040f\u040d\u0001\u0000\u0000\u0000\u040f\u0410\u0001"+
		"\u0000\u0000\u0000\u0410\u009b\u0001\u0000\u0000\u0000\u0411\u0414\u0003"+
		"\u009eO\u0000\u0412\u0413\u0007\f\u0000\u0000\u0413\u0415\u0003\u009e"+
		"O\u0000\u0414\u0412\u0001\u0000\u0000\u0000\u0414\u0415\u0001\u0000\u0000"+
		"\u0000\u0415\u009d\u0001\u0000\u0000\u0000\u0416\u041b\u0003\u00a0P\u0000"+
		"\u0417\u0418\u0007\r\u0000\u0000\u0418\u041a\u0003\u00a0P\u0000\u0419"+
		"\u0417\u0001\u0000\u0000\u0000\u041a\u041d\u0001\u0000\u0000\u0000\u041b"+
		"\u0419\u0001\u0000\u0000\u0000\u041b\u041c\u0001\u0000\u0000\u0000\u041c"+
		"\u009f\u0001\u0000\u0000\u0000\u041d\u041b\u0001\u0000\u0000\u0000\u041e"+
		"\u0423\u0003\u00a2Q\u0000\u041f\u0420\u0007\u000e\u0000\u0000\u0420\u0422"+
		"\u0003\u00a2Q\u0000\u0421\u041f\u0001\u0000\u0000\u0000\u0422\u0425\u0001"+
		"\u0000\u0000\u0000\u0423\u0421\u0001\u0000\u0000\u0000\u0423\u0424\u0001"+
		"\u0000\u0000\u0000\u0424\u00a1\u0001\u0000\u0000\u0000\u0425\u0423\u0001"+
		"\u0000\u0000\u0000\u0426\u0427\u0005\u0001\u0000\u0000\u0427\u0428\u0003"+
		"\u0094J\u0000\u0428\u0429\u0005\u0002\u0000\u0000\u0429\u0431\u0001\u0000"+
		"\u0000\u0000\u042a\u0431\u0003\u00a4R\u0000\u042b\u0431\u0005\u0083\u0000"+
		"\u0000\u042c\u042e\u0005\u0012\u0000\u0000\u042d\u042c\u0001\u0000\u0000"+
		"\u0000\u042d\u042e\u0001\u0000\u0000\u0000\u042e\u042f\u0001\u0000\u0000"+
		"\u0000\u042f\u0431\u0003\u00a6S\u0000\u0430\u0426\u0001\u0000\u0000\u0000"+
		"\u0430\u042a\u0001\u0000\u0000\u0000\u0430\u042b\u0001\u0000\u0000\u0000"+
		"\u0430\u042d\u0001\u0000\u0000\u0000\u0431\u00a3\u0001\u0000\u0000\u0000"+
		"\u0432\u0433\u0007\u000f\u0000\u0000\u0433\u00a5\u0001\u0000\u0000\u0000"+
		"\u0434\u0435\u0007\u0010\u0000\u0000\u0435\u00a7\u0001\u0000\u0000\u0000"+
		"w\u00ab\u00af\u00ba\u00be\u00c0\u00cd\u00d6\u00da\u00dc\u00e9\u00fb\u0104"+
		"\u0108\u010a\u0110\u0118\u0124\u0128\u012a\u0133\u013c\u0140\u0142\u0151"+
		"\u0155\u0157\u015e\u0167\u016b\u016d\u017a\u017e\u0180\u0187\u0190\u0194"+
		"\u0196\u01ab\u01bc\u01c0\u01c2\u01cd\u01da\u01de\u01e0\u01e6\u01ee\u01f4"+
		"\u01f6\u0201\u0205\u0207\u021b\u0224\u0228\u022a\u0232\u023b\u023f\u0241"+
		"\u0247\u0250\u0254\u0256\u025e\u0267\u026b\u026d\u0277\u027b\u027d\u0280"+
		"\u028e\u0296\u029f\u02a3\u02a5\u02b1\u02ba\u02be\u02c0\u02d0\u02d9\u02dd"+
		"\u02df\u02fc\u0304\u0309\u0316\u031a\u031c\u0325\u032e\u0332\u033a\u0343"+
		"\u0347\u034f\u035c\u036d\u0385\u038b\u0390\u0395\u03ab\u03cc\u03d0\u03d2"+
		"\u03e5\u03ed\u03f7\u0401\u0409\u040f\u0414\u041b\u0423\u042d\u0430";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}