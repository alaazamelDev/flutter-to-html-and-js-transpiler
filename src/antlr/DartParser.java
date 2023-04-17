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
		LP=1, RP=2, COLON=3, OA=4, CA=5, OB=6, CB=7, SC=8, COMMA=9, EQL=10, EE=11, 
		NE=12, GT=13, GTE=14, LT=15, LTE=16, PL=17, MINUS=18, OO=19, AA=20, STAR=21, 
		DIV=22, SCAFFOLD=23, ROW=24, CENTER=25, COLUMN=26, TEXT=27, APPBAR=28, 
		CONTAINER=29, EXPANDED=30, BOXDECORATION=31, PADDING=32, EDGE_INSETS_ONLY=33, 
		EDGE_INSETS_SYMMETRIC=34, IMAGE=35, BUTTON=36, GESTUREDETECTOR=37, TEXTFIELD=38, 
		BORDER=39, BORDERRADIUSONLY=40, BORDERRADIUSCIRCULAR=41, CHILDREN=42, 
		BODY=43, CHILD=44, WIDGET=45, INT=46, STRINGTYPE=47, DOUBLE=48, RETURN=49, 
		FUNCTION=50, TEXTATRIB=51, APPBARATRIB=52, FONTWEIGHT=53, FONTSIZE=54, 
		LETTERSPACING=55, BOLD=56, WIDTH=57, HEIGHT=58, CONTENTALIGNMENT=59, CENTERVALUE=60, 
		FLEX=61, MAINAXISSIZE=62, MAX=63, MIN=64, CROSSAXISALIGNMENT=65, STRETCH=66, 
		DECORATION=67, COLOR=68, BORDERRADIUS=69, CIRCULAR=70, PADDINGATTR=71, 
		TOPRIGHT=72, TOPLEFT=73, BOTTOMRIGHT=74, BOTTOMLEFT=75, HORIZONTAL=76, 
		VERTICAL=77, FIT=78, URL=79, TITLE=80, BACKGROUND_COLOR=81, TITLE_COLOR=82, 
		CONTAINS=83, COVER=84, CENTERTITLE=85, TEXTALIGN=86, ONPRESSED=87, START_ATTR=88, 
		END_ATTR=89, JUSTIFY_ATTR=90, ONLY=91, LIGHT=92, SEMIBOLD=93, MEDIUM=94, 
		VALUE=95, LABEL=96, TEXTCOLOR=97, HINT=98, BORDERATRI=99, THICKNESS=100, 
		RADIUS=101, ONCHANGED=102, TOP=103, LEFT=104, BOTTOM=105, RIGHT=106, WIDGETNAME=107, 
		IDENTIFIER=108, BOOLEAN=109, FLOAT=110, NUM=111, STRING=112, HEX_NUM=113, 
		WS=114;
	public static final int
		RULE_prog = 0, RULE_scaffold = 1, RULE_scaffoldProperty = 2, RULE_appBar = 3, 
		RULE_appBarProperties = 4, RULE_widget = 5, RULE_customWidget = 6, RULE_customWidgetProperties = 7, 
		RULE_row = 8, RULE_rowProperties = 9, RULE_center = 10, RULE_centerProperties = 11, 
		RULE_column = 12, RULE_columnProperties = 13, RULE_text = 14, RULE_textProperties = 15, 
		RULE_container = 16, RULE_containerProperties = 17, RULE_decorationProperty = 18, 
		RULE_boxDecoration = 19, RULE_boxDecorationProperties = 20, RULE_borderRadiusProperty = 21, 
		RULE_borderRadius = 22, RULE_borderRadiusCircular = 23, RULE_borderRadiusOnly = 24, 
		RULE_borderRadiusCircularRadiusProperty = 25, RULE_borderRadiusOnlyProperties = 26, 
		RULE_expanded = 27, RULE_expandedProperties = 28, RULE_gestureDetector = 29, 
		RULE_gestureDetectorProperties = 30, RULE_padding = 31, RULE_paddingProprtey = 32, 
		RULE_edgeInsets = 33, RULE_edgeInsetsOnlyProperties = 34, RULE_edgeInsetsSymetricProperties = 35, 
		RULE_image = 36, RULE_imageProperties = 37, RULE_button = 38, RULE_buttonProperties = 39, 
		RULE_textField = 40, RULE_textFieldProperties = 41, RULE_border = 42, 
		RULE_borderProperties = 43, RULE_statment = 44, RULE_variableDeclaration = 45, 
		RULE_variableAssignment = 46, RULE_customWidgetDeclaration = 47, RULE_widthProperty = 48, 
		RULE_heightProperty = 49, RULE_colorProperty = 50, RULE_childProperty = 51, 
		RULE_childrenProperty = 52, RULE_mainAxisSizeProperty = 53, RULE_crossAxisAlignmentProperty = 54, 
		RULE_onPressedProperty = 55, RULE_expressionList = 56, RULE_expression = 57, 
		RULE_logicalOrExpression = 58, RULE_logicalAndExpression = 59, RULE_equalityExpression = 60, 
		RULE_relationalExpression = 61, RULE_additiveExpression = 62, RULE_multiplicativeExpression = 63, 
		RULE_primary = 64, RULE_literal = 65, RULE_numericLiteral = 66;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "scaffold", "scaffoldProperty", "appBar", "appBarProperties", 
			"widget", "customWidget", "customWidgetProperties", "row", "rowProperties", 
			"center", "centerProperties", "column", "columnProperties", "text", "textProperties", 
			"container", "containerProperties", "decorationProperty", "boxDecoration", 
			"boxDecorationProperties", "borderRadiusProperty", "borderRadius", "borderRadiusCircular", 
			"borderRadiusOnly", "borderRadiusCircularRadiusProperty", "borderRadiusOnlyProperties", 
			"expanded", "expandedProperties", "gestureDetector", "gestureDetectorProperties", 
			"padding", "paddingProprtey", "edgeInsets", "edgeInsetsOnlyProperties", 
			"edgeInsetsSymetricProperties", "image", "imageProperties", "button", 
			"buttonProperties", "textField", "textFieldProperties", "border", "borderProperties", 
			"statment", "variableDeclaration", "variableAssignment", "customWidgetDeclaration", 
			"widthProperty", "heightProperty", "colorProperty", "childProperty", 
			"childrenProperty", "mainAxisSizeProperty", "crossAxisAlignmentProperty", 
			"onPressedProperty", "expressionList", "expression", "logicalOrExpression", 
			"logicalAndExpression", "equalityExpression", "relationalExpression", 
			"additiveExpression", "multiplicativeExpression", "primary", "literal", 
			"numericLiteral"
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
			"'BorderRadiusCircular'", "'children'", "'body'", "'child'", "'Widget'", 
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
			"'radius'", "'onChanged'", "'top'", "'left'", "'bottom'", "'right'"
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
			"BORDERRADIUSCIRCULAR", "CHILDREN", "BODY", "CHILD", "WIDGET", "INT", 
			"STRINGTYPE", "DOUBLE", "RETURN", "FUNCTION", "TEXTATRIB", "APPBARATRIB", 
			"FONTWEIGHT", "FONTSIZE", "LETTERSPACING", "BOLD", "WIDTH", "HEIGHT", 
			"CONTENTALIGNMENT", "CENTERVALUE", "FLEX", "MAINAXISSIZE", "MAX", "MIN", 
			"CROSSAXISALIGNMENT", "STRETCH", "DECORATION", "COLOR", "BORDERRADIUS", 
			"CIRCULAR", "PADDINGATTR", "TOPRIGHT", "TOPLEFT", "BOTTOMRIGHT", "BOTTOMLEFT", 
			"HORIZONTAL", "VERTICAL", "FIT", "URL", "TITLE", "BACKGROUND_COLOR", 
			"TITLE_COLOR", "CONTAINS", "COVER", "CENTERTITLE", "TEXTALIGN", "ONPRESSED", 
			"START_ATTR", "END_ATTR", "JUSTIFY_ATTR", "ONLY", "LIGHT", "SEMIBOLD", 
			"MEDIUM", "VALUE", "LABEL", "TEXTCOLOR", "HINT", "BORDERATRI", "THICKNESS", 
			"RADIUS", "ONCHANGED", "TOP", "LEFT", "BOTTOM", "RIGHT", "WIDGETNAME", 
			"IDENTIFIER", "BOOLEAN", "FLOAT", "NUM", "STRING", "HEX_NUM", "WS"
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
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la - 45)) & ~0x3f) == 0 && ((1L << (_la - 45)) & -9223372036854775761L) != 0) {
				{
				{
				setState(134);
				statment();
				}
				}
				setState(139);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SCAFFOLD) {
				{
				setState(140);
				scaffold();
				}
			}

			setState(143);
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
			setState(145);
			match(SCAFFOLD);
			setState(146);
			match(LP);
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BODY || _la==APPBARATRIB) {
				{
				setState(147);
				scaffoldProperty();
				setState(152);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(148);
						match(COMMA);
						setState(149);
						scaffoldProperty();
						}
						} 
					}
					setState(154);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				}
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(155);
					match(COMMA);
					}
				}

				}
			}

			setState(160);
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

	public final ScaffoldPropertyContext scaffoldProperty() throws RecognitionException {
		ScaffoldPropertyContext _localctx = new ScaffoldPropertyContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_scaffoldProperty);
		try {
			setState(168);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BODY:
				_localctx = new ScaffoldBodyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(162);
				match(BODY);
				setState(163);
				match(COLON);
				setState(164);
				widget();
				}
				break;
			case APPBARATRIB:
				_localctx = new ScaffoldAppBarContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(165);
				match(APPBARATRIB);
				setState(166);
				match(COLON);
				setState(167);
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
			setState(170);
			match(APPBAR);
			setState(171);
			match(LP);
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TITLE || _la==CENTERTITLE) {
				{
				setState(172);
				appBarProperties();
				setState(177);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(173);
						match(COMMA);
						setState(174);
						appBarProperties();
						}
						} 
					}
					setState(179);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				}
				setState(181);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(180);
					match(COMMA);
					}
				}

				}
			}

			setState(185);
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

	public final AppBarPropertiesContext appBarProperties() throws RecognitionException {
		AppBarPropertiesContext _localctx = new AppBarPropertiesContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_appBarProperties);
		int _la;
		try {
			setState(193);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TITLE:
				_localctx = new AppBarTitleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(187);
				match(TITLE);
				setState(188);
				match(COLON);
				setState(189);
				_la = _input.LA(1);
				if ( !(_la==IDENTIFIER || _la==STRING) ) {
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
				setState(190);
				match(CENTERTITLE);
				setState(191);
				match(COLON);
				setState(192);
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
			setState(207);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ROW:
				enterOuterAlt(_localctx, 1);
				{
				setState(195);
				row();
				}
				break;
			case CENTER:
				enterOuterAlt(_localctx, 2);
				{
				setState(196);
				center();
				}
				break;
			case TEXT:
				enterOuterAlt(_localctx, 3);
				{
				setState(197);
				text();
				}
				break;
			case CONTAINER:
				enterOuterAlt(_localctx, 4);
				{
				setState(198);
				container();
				}
				break;
			case EXPANDED:
				enterOuterAlt(_localctx, 5);
				{
				setState(199);
				expanded();
				}
				break;
			case COLUMN:
				enterOuterAlt(_localctx, 6);
				{
				setState(200);
				column();
				}
				break;
			case GESTUREDETECTOR:
				enterOuterAlt(_localctx, 7);
				{
				setState(201);
				gestureDetector();
				}
				break;
			case PADDING:
				enterOuterAlt(_localctx, 8);
				{
				setState(202);
				padding();
				}
				break;
			case IMAGE:
				enterOuterAlt(_localctx, 9);
				{
				setState(203);
				image();
				}
				break;
			case BUTTON:
				enterOuterAlt(_localctx, 10);
				{
				setState(204);
				button();
				}
				break;
			case WIDGETNAME:
				enterOuterAlt(_localctx, 11);
				{
				setState(205);
				customWidget();
				}
				break;
			case TEXTFIELD:
				enterOuterAlt(_localctx, 12);
				{
				setState(206);
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
		enterRule(_localctx, 12, RULE_customWidget);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			match(WIDGETNAME);
			setState(210);
			match(LP);
			setState(222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(211);
				customWidgetProperties();
				setState(216);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(212);
						match(COMMA);
						setState(213);
						customWidgetProperties();
						}
						} 
					}
					setState(218);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				}
				setState(220);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(219);
					match(COMMA);
					}
				}

				}
			}

			setState(224);
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
		enterRule(_localctx, 14, RULE_customWidgetProperties);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			match(IDENTIFIER);
			setState(227);
			match(COLON);
			setState(228);
			_la = _input.LA(1);
			if ( !((((_la - 110)) & ~0x3f) == 0 && ((1L << (_la - 110)) & 7L) != 0) ) {
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
		enterRule(_localctx, 16, RULE_row);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			match(ROW);
			setState(231);
			match(LP);
			setState(243);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la - 42)) & ~0x3f) == 0 && ((1L << (_la - 42)) & 9437185L) != 0) {
				{
				setState(232);
				rowProperties();
				setState(237);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(233);
						match(COMMA);
						setState(234);
						rowProperties();
						}
						} 
					}
					setState(239);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				}
				setState(241);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(240);
					match(COMMA);
					}
				}

				}
			}

			setState(245);
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
		enterRule(_localctx, 18, RULE_rowProperties);
		try {
			setState(250);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHILDREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(247);
				childrenProperty();
				}
				break;
			case MAINAXISSIZE:
				enterOuterAlt(_localctx, 2);
				{
				setState(248);
				mainAxisSizeProperty();
				}
				break;
			case CROSSAXISALIGNMENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(249);
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
		enterRule(_localctx, 20, RULE_center);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			match(CENTER);
			setState(253);
			match(LP);
			setState(265);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CHILD) {
				{
				setState(254);
				centerProperties();
				setState(259);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(255);
						match(COMMA);
						setState(256);
						centerProperties();
						}
						} 
					}
					setState(261);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				}
				setState(263);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(262);
					match(COMMA);
					}
				}

				}
			}

			setState(267);
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
		enterRule(_localctx, 22, RULE_centerProperties);
		try {
			_localctx = new CenterChildContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
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
		enterRule(_localctx, 24, RULE_column);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			match(COLUMN);
			setState(272);
			match(LP);
			setState(284);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la - 42)) & ~0x3f) == 0 && ((1L << (_la - 42)) & 9437185L) != 0) {
				{
				setState(273);
				columnProperties();
				setState(278);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(274);
						match(COMMA);
						setState(275);
						columnProperties();
						}
						} 
					}
					setState(280);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				}
				setState(282);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(281);
					match(COMMA);
					}
				}

				}
			}

			setState(286);
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
		enterRule(_localctx, 26, RULE_columnProperties);
		try {
			setState(291);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHILDREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(288);
				childrenProperty();
				}
				break;
			case MAINAXISSIZE:
				enterOuterAlt(_localctx, 2);
				{
				setState(289);
				mainAxisSizeProperty();
				}
				break;
			case CROSSAXISALIGNMENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(290);
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
		enterRule(_localctx, 28, RULE_text);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			match(TEXT);
			setState(294);
			match(LP);
			setState(306);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la - 51)) & ~0x3f) == 0 && ((1L << (_la - 51)) & 34359738397L) != 0) {
				{
				setState(295);
				textProperties();
				setState(300);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(296);
						match(COMMA);
						setState(297);
						textProperties();
						}
						} 
					}
					setState(302);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				}
				setState(304);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(303);
					match(COMMA);
					}
				}

				}
			}

			setState(308);
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
		enterRule(_localctx, 30, RULE_textProperties);
		int _la;
		try {
			setState(325);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TEXTATRIB:
				_localctx = new TextContentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(310);
				match(TEXTATRIB);
				setState(311);
				match(COLON);
				setState(312);
				_la = _input.LA(1);
				if ( !(_la==IDENTIFIER || _la==STRING) ) {
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
				setState(313);
				match(FONTWEIGHT);
				setState(314);
				match(COLON);
				setState(315);
				_la = _input.LA(1);
				if ( !((((_la - 56)) & ~0x3f) == 0 && ((1L << (_la - 56)) & 481036337153L) != 0) ) {
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
				setState(316);
				match(FONTSIZE);
				setState(317);
				match(COLON);
				setState(318);
				_la = _input.LA(1);
				if ( !((((_la - 108)) & ~0x3f) == 0 && ((1L << (_la - 108)) & 13L) != 0) ) {
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
				setState(319);
				match(LETTERSPACING);
				setState(320);
				match(COLON);
				setState(321);
				_la = _input.LA(1);
				if ( !((((_la - 108)) & ~0x3f) == 0 && ((1L << (_la - 108)) & 13L) != 0) ) {
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
				setState(322);
				match(TEXTALIGN);
				setState(323);
				match(COLON);
				setState(324);
				_la = _input.LA(1);
				if ( !((((_la - 60)) & ~0x3f) == 0 && ((1L << (_la - 60)) & 1879048193L) != 0) ) {
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
		enterRule(_localctx, 32, RULE_container);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			match(CONTAINER);
			setState(328);
			match(LP);
			setState(340);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la - 44)) & ~0x3f) == 0 && ((1L << (_la - 44)) & 8445953L) != 0) {
				{
				setState(329);
				containerProperties();
				setState(334);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(330);
						match(COMMA);
						setState(331);
						containerProperties();
						}
						} 
					}
					setState(336);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
				}
				setState(338);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(337);
					match(COMMA);
					}
				}

				}
			}

			setState(342);
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
		enterRule(_localctx, 34, RULE_containerProperties);
		int _la;
		try {
			setState(351);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WIDTH:
				_localctx = new ContainerWidthContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(344);
				widthProperty();
				}
				break;
			case HEIGHT:
				_localctx = new ContainerHeightContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(345);
				heightProperty();
				}
				break;
			case CONTENTALIGNMENT:
				_localctx = new ContainerContentAlignmentContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(346);
				match(CONTENTALIGNMENT);
				setState(347);
				match(COLON);
				setState(348);
				_la = _input.LA(1);
				if ( !((((_la - 60)) & ~0x3f) == 0 && ((1L << (_la - 60)) & 87960930222081L) != 0) ) {
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
				setState(349);
				childProperty();
				}
				break;
			case DECORATION:
				_localctx = new ContainerDecorationContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(350);
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
		enterRule(_localctx, 36, RULE_decorationProperty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			match(DECORATION);
			setState(354);
			match(COLON);
			setState(355);
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
		enterRule(_localctx, 38, RULE_boxDecoration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			match(BOXDECORATION);
			setState(358);
			match(LP);
			setState(370);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLOR || _la==BORDERRADIUS) {
				{
				setState(359);
				boxDecorationProperties();
				setState(364);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(360);
						match(COMMA);
						setState(361);
						boxDecorationProperties();
						}
						} 
					}
					setState(366);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
				}
				setState(368);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(367);
					match(COMMA);
					}
				}

				}
			}

			setState(372);
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
		enterRule(_localctx, 40, RULE_boxDecorationProperties);
		try {
			setState(376);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COLOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(374);
				colorProperty();
				}
				break;
			case BORDERRADIUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(375);
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
		enterRule(_localctx, 42, RULE_borderRadiusProperty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
			match(BORDERRADIUS);
			setState(379);
			match(COLON);
			setState(380);
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
		enterRule(_localctx, 44, RULE_borderRadius);
		try {
			setState(384);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BORDERRADIUSONLY:
				enterOuterAlt(_localctx, 1);
				{
				setState(382);
				borderRadiusOnly();
				}
				break;
			case BORDERRADIUSCIRCULAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(383);
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
		enterRule(_localctx, 46, RULE_borderRadiusCircular);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
			match(BORDERRADIUSCIRCULAR);
			setState(387);
			match(LP);
			setState(392);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RADIUS) {
				{
				setState(388);
				borderRadiusCircularRadiusProperty();
				setState(390);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(389);
					match(COMMA);
					}
				}

				}
			}

			setState(394);
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
		enterRule(_localctx, 48, RULE_borderRadiusOnly);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
			match(BORDERRADIUSONLY);
			setState(397);
			match(LP);
			setState(409);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & 15L) != 0) {
				{
				setState(398);
				borderRadiusOnlyProperties();
				setState(403);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(399);
						match(COMMA);
						setState(400);
						borderRadiusOnlyProperties();
						}
						} 
					}
					setState(405);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
				}
				setState(407);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(406);
					match(COMMA);
					}
				}

				}
			}

			setState(411);
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
		enterRule(_localctx, 50, RULE_borderRadiusCircularRadiusProperty);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(413);
			match(RADIUS);
			setState(414);
			match(COLON);
			setState(415);
			_la = _input.LA(1);
			if ( !((((_la - 108)) & ~0x3f) == 0 && ((1L << (_la - 108)) & 13L) != 0) ) {
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
		enterRule(_localctx, 52, RULE_borderRadiusOnlyProperties);
		int _la;
		try {
			setState(429);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TOPRIGHT:
				_localctx = new BorderRadiusOnlyTopRightContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(417);
				match(TOPRIGHT);
				setState(418);
				match(COLON);
				setState(419);
				_la = _input.LA(1);
				if ( !(_la==IDENTIFIER || _la==NUM) ) {
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
				setState(420);
				match(TOPLEFT);
				setState(421);
				match(COLON);
				setState(422);
				_la = _input.LA(1);
				if ( !(_la==IDENTIFIER || _la==NUM) ) {
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
				setState(423);
				match(BOTTOMRIGHT);
				setState(424);
				match(COLON);
				setState(425);
				_la = _input.LA(1);
				if ( !(_la==IDENTIFIER || _la==NUM) ) {
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
				setState(426);
				match(BOTTOMLEFT);
				setState(427);
				match(COLON);
				setState(428);
				_la = _input.LA(1);
				if ( !(_la==IDENTIFIER || _la==NUM) ) {
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
		enterRule(_localctx, 54, RULE_expanded);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(431);
			match(EXPANDED);
			setState(432);
			match(LP);
			setState(444);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CHILD || _la==FLEX) {
				{
				setState(433);
				expandedProperties();
				setState(438);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(434);
						match(COMMA);
						setState(435);
						expandedProperties();
						}
						} 
					}
					setState(440);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
				}
				setState(442);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(441);
					match(COMMA);
					}
				}

				}
			}

			setState(446);
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
		enterRule(_localctx, 56, RULE_expandedProperties);
		int _la;
		try {
			setState(452);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FLEX:
				_localctx = new ExpandedFlexContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(448);
				match(FLEX);
				setState(449);
				match(COLON);
				setState(450);
				_la = _input.LA(1);
				if ( !(_la==IDENTIFIER || _la==NUM) ) {
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
				setState(451);
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
		enterRule(_localctx, 58, RULE_gestureDetector);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(454);
			match(GESTUREDETECTOR);
			setState(455);
			match(LP);
			setState(467);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ONPRESSED) {
				{
				setState(456);
				gestureDetectorProperties();
				setState(461);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(457);
						match(COMMA);
						setState(458);
						gestureDetectorProperties();
						}
						} 
					}
					setState(463);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
				}
				setState(465);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(464);
					match(COMMA);
					}
				}

				}
			}

			setState(469);
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

	public final GestureDetectorPropertiesContext gestureDetectorProperties() throws RecognitionException {
		GestureDetectorPropertiesContext _localctx = new GestureDetectorPropertiesContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_gestureDetectorProperties);
		try {
			_localctx = new GestureDetectorOnPressedContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(471);
			onPressedProperty();
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
		enterRule(_localctx, 62, RULE_padding);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(473);
			match(PADDING);
			setState(474);
			match(LP);
			setState(486);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CHILD || _la==PADDINGATTR) {
				{
				setState(475);
				paddingProprtey();
				setState(480);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(476);
						match(COMMA);
						setState(477);
						paddingProprtey();
						}
						} 
					}
					setState(482);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
				}
				setState(484);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(483);
					match(COMMA);
					}
				}

				}
			}

			setState(488);
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
		enterRule(_localctx, 64, RULE_paddingProprtey);
		try {
			setState(494);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PADDINGATTR:
				_localctx = new PaddingPaddingContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(490);
				match(PADDINGATTR);
				setState(491);
				match(COLON);
				setState(492);
				edgeInsets();
				}
				break;
			case CHILD:
				_localctx = new PaddingChildContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(493);
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
		enterRule(_localctx, 66, RULE_edgeInsets);
		int _la;
		try {
			int _alt;
			setState(528);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EDGE_INSETS_ONLY:
				_localctx = new EdgeInsetsOnlyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(496);
				match(EDGE_INSETS_ONLY);
				setState(497);
				match(LP);
				setState(509);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la - 103)) & ~0x3f) == 0 && ((1L << (_la - 103)) & 15L) != 0) {
					{
					setState(498);
					edgeInsetsOnlyProperties();
					setState(503);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(499);
							match(COMMA);
							setState(500);
							edgeInsetsOnlyProperties();
							}
							} 
						}
						setState(505);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
					}
					setState(507);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(506);
						match(COMMA);
						}
					}

					}
				}

				setState(511);
				match(RP);
				}
				break;
			case EDGE_INSETS_SYMMETRIC:
				_localctx = new EdgeInsetsSymetricContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(512);
				match(EDGE_INSETS_SYMMETRIC);
				setState(513);
				match(LP);
				setState(525);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==HORIZONTAL || _la==VERTICAL) {
					{
					setState(514);
					edgeInsetsSymetricProperties();
					setState(519);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(515);
							match(COMMA);
							setState(516);
							edgeInsetsSymetricProperties();
							}
							} 
						}
						setState(521);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
					}
					setState(523);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(522);
						match(COMMA);
						}
					}

					}
				}

				setState(527);
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
		enterRule(_localctx, 68, RULE_edgeInsetsOnlyProperties);
		int _la;
		try {
			setState(542);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TOP:
				_localctx = new EdgeInsetsOnlyTopContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(530);
				match(TOP);
				setState(531);
				match(COLON);
				setState(532);
				_la = _input.LA(1);
				if ( !((((_la - 108)) & ~0x3f) == 0 && ((1L << (_la - 108)) & 13L) != 0) ) {
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
				setState(533);
				match(LEFT);
				setState(534);
				match(COLON);
				setState(535);
				_la = _input.LA(1);
				if ( !((((_la - 108)) & ~0x3f) == 0 && ((1L << (_la - 108)) & 13L) != 0) ) {
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
				setState(536);
				match(RIGHT);
				setState(537);
				match(COLON);
				setState(538);
				_la = _input.LA(1);
				if ( !((((_la - 108)) & ~0x3f) == 0 && ((1L << (_la - 108)) & 13L) != 0) ) {
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
				setState(539);
				match(BOTTOM);
				setState(540);
				match(COLON);
				setState(541);
				_la = _input.LA(1);
				if ( !((((_la - 108)) & ~0x3f) == 0 && ((1L << (_la - 108)) & 13L) != 0) ) {
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
		enterRule(_localctx, 70, RULE_edgeInsetsSymetricProperties);
		int _la;
		try {
			setState(550);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HORIZONTAL:
				_localctx = new EdgeInsetsSymetricHorizontalContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(544);
				match(HORIZONTAL);
				setState(545);
				match(COLON);
				setState(546);
				_la = _input.LA(1);
				if ( !((((_la - 108)) & ~0x3f) == 0 && ((1L << (_la - 108)) & 13L) != 0) ) {
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
				setState(547);
				match(VERTICAL);
				setState(548);
				match(COLON);
				setState(549);
				_la = _input.LA(1);
				if ( !((((_la - 108)) & ~0x3f) == 0 && ((1L << (_la - 108)) & 13L) != 0) ) {
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
		enterRule(_localctx, 72, RULE_image);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(552);
			match(IMAGE);
			setState(553);
			match(LP);
			setState(565);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la - 57)) & ~0x3f) == 0 && ((1L << (_la - 57)) & 6291459L) != 0) {
				{
				setState(554);
				imageProperties();
				setState(559);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(555);
						match(COMMA);
						setState(556);
						imageProperties();
						}
						} 
					}
					setState(561);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
				}
				setState(563);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(562);
					match(COMMA);
					}
				}

				}
			}

			setState(567);
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
		enterRule(_localctx, 74, RULE_imageProperties);
		int _la;
		try {
			setState(577);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case URL:
				_localctx = new ImageUrlContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(569);
				match(URL);
				setState(570);
				match(COLON);
				setState(571);
				_la = _input.LA(1);
				if ( !(_la==IDENTIFIER || _la==STRING) ) {
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
				setState(572);
				match(FIT);
				setState(573);
				match(COLON);
				setState(574);
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
				setState(575);
				widthProperty();
				}
				break;
			case HEIGHT:
				_localctx = new ImageHeightContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(576);
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
		enterRule(_localctx, 76, RULE_button);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(579);
			match(BUTTON);
			setState(580);
			match(LP);
			setState(592);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la - 57)) & ~0x3f) == 0 && ((1L << (_la - 57)) & 1132462083L) != 0) {
				{
				setState(581);
				buttonProperties();
				setState(586);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(582);
						match(COMMA);
						setState(583);
						buttonProperties();
						}
						} 
					}
					setState(588);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
				}
				setState(590);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(589);
					match(COMMA);
					}
				}

				}
			}

			setState(594);
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
		enterRule(_localctx, 78, RULE_buttonProperties);
		int _la;
		try {
			setState(608);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WIDTH:
				_localctx = new ButtonWidthContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(596);
				widthProperty();
				}
				break;
			case HEIGHT:
				_localctx = new ButtonHeightContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(597);
				heightProperty();
				}
				break;
			case TITLE:
				_localctx = new ButtonTitleContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(598);
				match(TITLE);
				setState(599);
				match(COLON);
				setState(600);
				_la = _input.LA(1);
				if ( !(_la==IDENTIFIER || _la==STRING) ) {
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
				setState(601);
				match(BACKGROUND_COLOR);
				setState(602);
				match(COLON);
				setState(603);
				match(HEX_NUM);
				}
				break;
			case TITLE_COLOR:
				_localctx = new ButtonTitleColorContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(604);
				match(TITLE_COLOR);
				setState(605);
				match(COLON);
				setState(606);
				match(HEX_NUM);
				}
				break;
			case ONPRESSED:
				_localctx = new ButtonOnPressedContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(607);
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
		enterRule(_localctx, 80, RULE_textField);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(610);
			match(TEXTFIELD);
			setState(611);
			match(LP);
			setState(623);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & 2667577345L) != 0) {
				{
				setState(612);
				textFieldProperties();
				setState(617);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(613);
						match(COMMA);
						setState(614);
						textFieldProperties();
						}
						} 
					}
					setState(619);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
				}
				setState(621);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(620);
					match(COMMA);
					}
				}

				}
			}

			setState(625);
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
		enterRule(_localctx, 82, RULE_textFieldProperties);
		int _la;
		try {
			setState(664);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VALUE:
				_localctx = new TextFieldValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(627);
				match(VALUE);
				setState(628);
				match(COLON);
				setState(629);
				_la = _input.LA(1);
				if ( !(_la==IDENTIFIER || _la==STRING) ) {
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
				setState(630);
				match(LABEL);
				setState(631);
				match(COLON);
				setState(632);
				_la = _input.LA(1);
				if ( !(_la==IDENTIFIER || _la==STRING) ) {
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
				setState(633);
				match(TEXTCOLOR);
				setState(634);
				match(COLON);
				setState(635);
				match(HEX_NUM);
				}
				break;
			case PADDINGATTR:
				_localctx = new TextFieldPaddingContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(636);
				match(PADDINGATTR);
				setState(637);
				match(COLON);
				setState(638);
				edgeInsets();
				}
				break;
			case HINT:
				_localctx = new TextFieldHintContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(639);
				match(HINT);
				setState(640);
				match(COLON);
				setState(641);
				_la = _input.LA(1);
				if ( !(_la==IDENTIFIER || _la==STRING) ) {
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
				setState(642);
				match(BORDERATRI);
				setState(643);
				match(COLON);
				setState(644);
				border();
				}
				break;
			case ONCHANGED:
				_localctx = new TextFieldOnChangedContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(645);
				match(ONCHANGED);
				setState(646);
				match(COLON);
				setState(647);
				match(LP);
				setState(652);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENTIFIER) {
					{
					{
					setState(648);
					match(IDENTIFIER);
					setState(649);
					match(COMMA);
					}
					}
					setState(654);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(655);
				match(RP);
				setState(656);
				match(OB);
				setState(660);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la - 45)) & ~0x3f) == 0 && ((1L << (_la - 45)) & -9223372036854775761L) != 0) {
					{
					{
					setState(657);
					statment();
					}
					}
					setState(662);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(663);
				match(CB);
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
		enterRule(_localctx, 84, RULE_border);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(666);
			match(BORDER);
			setState(667);
			match(LP);
			setState(679);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & 4294967299L) != 0) {
				{
				setState(668);
				borderProperties();
				setState(673);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(669);
						match(COMMA);
						setState(670);
						borderProperties();
						}
						} 
					}
					setState(675);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
				}
				setState(677);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(676);
					match(COMMA);
					}
				}

				}
			}

			setState(681);
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
		enterRule(_localctx, 86, RULE_borderProperties);
		int _la;
		try {
			setState(688);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case THICKNESS:
				_localctx = new BorderThicknessContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(683);
				match(THICKNESS);
				setState(684);
				match(COLON);
				setState(685);
				_la = _input.LA(1);
				if ( !(_la==IDENTIFIER || _la==NUM) ) {
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
				setState(686);
				borderRadiusProperty();
				}
				break;
			case COLOR:
				_localctx = new BorderColorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(687);
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
		enterRule(_localctx, 88, RULE_statment);
		try {
			setState(693);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case STRINGTYPE:
			case DOUBLE:
			case FUNCTION:
				enterOuterAlt(_localctx, 1);
				{
				setState(690);
				variableDeclaration();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(691);
				variableAssignment();
				}
				break;
			case WIDGET:
				enterOuterAlt(_localctx, 3);
				{
				setState(692);
				customWidgetDeclaration();
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
		enterRule(_localctx, 90, RULE_variableDeclaration);
		int _la;
		try {
			setState(710);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case STRINGTYPE:
			case DOUBLE:
				_localctx = new NonFunctionVariableDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(695);
				_la = _input.LA(1);
				if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 492581209243648L) != 0) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(696);
				match(IDENTIFIER);
				setState(697);
				match(SC);
				}
				break;
			case FUNCTION:
				_localctx = new FunctionVariableDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(698);
				match(FUNCTION);
				setState(699);
				match(LP);
				setState(704);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((_la) & ~0x3f) == 0 && ((1L << _la) & 492581209243648L) != 0) {
					{
					{
					setState(700);
					_la = _input.LA(1);
					if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 492581209243648L) != 0) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(701);
					match(COMMA);
					}
					}
					setState(706);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(707);
				match(RP);
				setState(708);
				match(IDENTIFIER);
				setState(709);
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
		enterRule(_localctx, 92, RULE_variableAssignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(712);
			match(IDENTIFIER);
			setState(713);
			match(EQL);
			setState(714);
			_la = _input.LA(1);
			if ( !((((_la - 110)) & ~0x3f) == 0 && ((1L << (_la - 110)) & 7L) != 0) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(715);
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
		enterRule(_localctx, 94, RULE_customWidgetDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(717);
			match(WIDGET);
			setState(718);
			match(WIDGETNAME);
			setState(719);
			match(OB);
			setState(723);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 1618481116086272L) != 0) {
				{
				{
				setState(720);
				variableDeclaration();
				}
				}
				setState(725);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(726);
			match(RETURN);
			setState(727);
			match(LP);
			setState(728);
			widget();
			setState(729);
			match(RP);
			setState(730);
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
		enterRule(_localctx, 96, RULE_widthProperty);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(732);
			match(WIDTH);
			setState(733);
			match(COLON);
			setState(734);
			_la = _input.LA(1);
			if ( !((((_la - 108)) & ~0x3f) == 0 && ((1L << (_la - 108)) & 13L) != 0) ) {
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
		enterRule(_localctx, 98, RULE_heightProperty);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(736);
			match(HEIGHT);
			setState(737);
			match(COLON);
			setState(738);
			_la = _input.LA(1);
			if ( !((((_la - 108)) & ~0x3f) == 0 && ((1L << (_la - 108)) & 13L) != 0) ) {
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
		enterRule(_localctx, 100, RULE_colorProperty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(740);
			match(COLOR);
			setState(741);
			match(COLON);
			setState(742);
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
		enterRule(_localctx, 102, RULE_childProperty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(744);
			match(CHILD);
			setState(745);
			match(COLON);
			setState(746);
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
		enterRule(_localctx, 104, RULE_childrenProperty);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(748);
			match(CHILDREN);
			setState(749);
			match(COLON);
			setState(750);
			match(OA);
			setState(762);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 521553313792L) != 0 || _la==WIDGETNAME) {
				{
				setState(751);
				widget();
				setState(756);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(752);
						match(COMMA);
						setState(753);
						widget();
						}
						} 
					}
					setState(758);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
				}
				setState(760);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(759);
					match(COMMA);
					}
				}

				}
			}

			setState(764);
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
		enterRule(_localctx, 106, RULE_mainAxisSizeProperty);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(766);
			match(MAINAXISSIZE);
			setState(767);
			match(COLON);
			setState(768);
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
		enterRule(_localctx, 108, RULE_crossAxisAlignmentProperty);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(770);
			match(CROSSAXISALIGNMENT);
			setState(771);
			match(COLON);
			setState(772);
			_la = _input.LA(1);
			if ( !((((_la - 60)) & ~0x3f) == 0 && ((1L << (_la - 60)) & 87960930222145L) != 0) ) {
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
		enterRule(_localctx, 110, RULE_onPressedProperty);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(774);
			match(ONPRESSED);
			setState(775);
			match(COLON);
			setState(776);
			match(LP);
			setState(781);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(777);
				match(IDENTIFIER);
				setState(778);
				match(COMMA);
				}
				}
				setState(783);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(784);
			match(RP);
			setState(785);
			match(OB);
			setState(789);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la - 45)) & ~0x3f) == 0 && ((1L << (_la - 45)) & -9223372036854775761L) != 0) {
				{
				{
				setState(786);
				statment();
				}
				}
				setState(791);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(792);
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
		enterRule(_localctx, 112, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(794);
			expression();
			setState(799);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(795);
				match(COMMA);
				setState(796);
				expression();
				}
				}
				setState(801);
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
		enterRule(_localctx, 114, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(802);
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
		enterRule(_localctx, 116, RULE_logicalOrExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(804);
			logicalAndExpression();
			setState(809);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OO) {
				{
				{
				setState(805);
				match(OO);
				setState(806);
				logicalAndExpression();
				}
				}
				setState(811);
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
		enterRule(_localctx, 118, RULE_logicalAndExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(812);
			equalityExpression();
			setState(817);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AA) {
				{
				{
				setState(813);
				match(AA);
				setState(814);
				equalityExpression();
				}
				}
				setState(819);
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
		enterRule(_localctx, 120, RULE_equalityExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(820);
			relationalExpression();
			setState(823);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EE || _la==NE) {
				{
				setState(821);
				_la = _input.LA(1);
				if ( !(_la==EE || _la==NE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(822);
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
		enterRule(_localctx, 122, RULE_relationalExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(825);
			additiveExpression();
			setState(828);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 122880L) != 0) {
				{
				setState(826);
				_la = _input.LA(1);
				if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 122880L) != 0) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(827);
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
		enterRule(_localctx, 124, RULE_additiveExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(830);
			multiplicativeExpression();
			setState(835);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PL || _la==MINUS) {
				{
				{
				setState(831);
				_la = _input.LA(1);
				if ( !(_la==PL || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(832);
				multiplicativeExpression();
				}
				}
				setState(837);
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
		enterRule(_localctx, 126, RULE_multiplicativeExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(838);
			primary();
			setState(843);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STAR || _la==DIV) {
				{
				{
				setState(839);
				_la = _input.LA(1);
				if ( !(_la==STAR || _la==DIV) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(840);
				primary();
				}
				}
				setState(845);
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
		enterRule(_localctx, 128, RULE_primary);
		int _la;
		try {
			setState(856);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LP:
				_localctx = new PrimaryExpressionExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(846);
				match(LP);
				setState(847);
				expression();
				setState(848);
				match(RP);
				}
				break;
			case BOOLEAN:
			case STRING:
				_localctx = new PrimaryLiteralExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(850);
				literal();
				}
				break;
			case IDENTIFIER:
				_localctx = new PrimaryIdentifierExpressionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(851);
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
				setState(853);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(852);
					match(MINUS);
					}
				}

				setState(855);
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
		enterRule(_localctx, 130, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(858);
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
		enterRule(_localctx, 132, RULE_numericLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(860);
			_la = _input.LA(1);
			if ( !((((_la - 110)) & ~0x3f) == 0 && ((1L << (_la - 110)) & 11L) != 0) ) {
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
		"\u0004\u0001r\u035f\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"7\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007;\u0002"+
		"<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007@\u0002"+
		"A\u0007A\u0002B\u0007B\u0001\u0000\u0005\u0000\u0088\b\u0000\n\u0000\f"+
		"\u0000\u008b\t\u0000\u0001\u0000\u0003\u0000\u008e\b\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0005\u0001\u0097\b\u0001\n\u0001\f\u0001\u009a\t\u0001\u0001\u0001\u0003"+
		"\u0001\u009d\b\u0001\u0003\u0001\u009f\b\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u0002\u00a9\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0005\u0003\u00b0\b\u0003\n\u0003\f\u0003\u00b3\t\u0003\u0001"+
		"\u0003\u0003\u0003\u00b6\b\u0003\u0003\u0003\u00b8\b\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0003\u0004\u00c2\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u00d0\b\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u00d7\b\u0006"+
		"\n\u0006\f\u0006\u00da\t\u0006\u0001\u0006\u0003\u0006\u00dd\b\u0006\u0003"+
		"\u0006\u00df\b\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b\u00ec"+
		"\b\b\n\b\f\b\u00ef\t\b\u0001\b\u0003\b\u00f2\b\b\u0003\b\u00f4\b\b\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\t\u0003\t\u00fb\b\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0005\n\u0102\b\n\n\n\f\n\u0105\t\n\u0001\n\u0003\n"+
		"\u0108\b\n\u0003\n\u010a\b\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u0115\b\f\n\f\f\f\u0118\t\f"+
		"\u0001\f\u0003\f\u011b\b\f\u0003\f\u011d\b\f\u0001\f\u0001\f\u0001\r\u0001"+
		"\r\u0001\r\u0003\r\u0124\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0005\u000e\u012b\b\u000e\n\u000e\f\u000e\u012e\t\u000e"+
		"\u0001\u000e\u0003\u000e\u0131\b\u000e\u0003\u000e\u0133\b\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u0146"+
		"\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0005"+
		"\u0010\u014d\b\u0010\n\u0010\f\u0010\u0150\t\u0010\u0001\u0010\u0003\u0010"+
		"\u0153\b\u0010\u0003\u0010\u0155\b\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0003\u0011\u0160\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0005"+
		"\u0013\u016b\b\u0013\n\u0013\f\u0013\u016e\t\u0013\u0001\u0013\u0003\u0013"+
		"\u0171\b\u0013\u0003\u0013\u0173\b\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0014\u0001\u0014\u0003\u0014\u0179\b\u0014\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0003\u0016\u0181\b\u0016\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u0187\b\u0017\u0003"+
		"\u0017\u0189\b\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0005\u0018\u0192\b\u0018\n\u0018\f\u0018"+
		"\u0195\t\u0018\u0001\u0018\u0003\u0018\u0198\b\u0018\u0003\u0018\u019a"+
		"\b\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0003\u001a\u01ae\b\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0005\u001b\u01b5\b\u001b\n\u001b\f\u001b\u01b8\t\u001b"+
		"\u0001\u001b\u0003\u001b\u01bb\b\u001b\u0003\u001b\u01bd\b\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0003"+
		"\u001c\u01c5\b\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0005\u001d\u01cc\b\u001d\n\u001d\f\u001d\u01cf\t\u001d\u0001\u001d"+
		"\u0003\u001d\u01d2\b\u001d\u0003\u001d\u01d4\b\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0005\u001f\u01df\b\u001f\n\u001f\f\u001f\u01e2\t\u001f"+
		"\u0001\u001f\u0003\u001f\u01e5\b\u001f\u0003\u001f\u01e7\b\u001f\u0001"+
		"\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0001 \u0003 \u01ef\b \u0001!"+
		"\u0001!\u0001!\u0001!\u0001!\u0005!\u01f6\b!\n!\f!\u01f9\t!\u0001!\u0003"+
		"!\u01fc\b!\u0003!\u01fe\b!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0005"+
		"!\u0206\b!\n!\f!\u0209\t!\u0001!\u0003!\u020c\b!\u0003!\u020e\b!\u0001"+
		"!\u0003!\u0211\b!\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0003\"\u021f\b\"\u0001#\u0001"+
		"#\u0001#\u0001#\u0001#\u0001#\u0003#\u0227\b#\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0005$\u022e\b$\n$\f$\u0231\t$\u0001$\u0003$\u0234\b$\u0003$"+
		"\u0236\b$\u0001$\u0001$\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001"+
		"%\u0001%\u0003%\u0242\b%\u0001&\u0001&\u0001&\u0001&\u0001&\u0005&\u0249"+
		"\b&\n&\f&\u024c\t&\u0001&\u0003&\u024f\b&\u0003&\u0251\b&\u0001&\u0001"+
		"&\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0003\'\u0261\b\'\u0001(\u0001(\u0001(\u0001"+
		"(\u0001(\u0005(\u0268\b(\n(\f(\u026b\t(\u0001(\u0003(\u026e\b(\u0003("+
		"\u0270\b(\u0001(\u0001(\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0005)\u028b\b)\n)\f)\u028e"+
		"\t)\u0001)\u0001)\u0001)\u0005)\u0293\b)\n)\f)\u0296\t)\u0001)\u0003)"+
		"\u0299\b)\u0001*\u0001*\u0001*\u0001*\u0001*\u0005*\u02a0\b*\n*\f*\u02a3"+
		"\t*\u0001*\u0003*\u02a6\b*\u0003*\u02a8\b*\u0001*\u0001*\u0001+\u0001"+
		"+\u0001+\u0001+\u0001+\u0003+\u02b1\b+\u0001,\u0001,\u0001,\u0003,\u02b6"+
		"\b,\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0005-\u02bf\b-\n"+
		"-\f-\u02c2\t-\u0001-\u0001-\u0001-\u0003-\u02c7\b-\u0001.\u0001.\u0001"+
		".\u0001.\u0001.\u0001/\u0001/\u0001/\u0001/\u0005/\u02d2\b/\n/\f/\u02d5"+
		"\t/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u00010\u00010\u00010\u0001"+
		"0\u00011\u00011\u00011\u00011\u00012\u00012\u00012\u00012\u00013\u0001"+
		"3\u00013\u00013\u00014\u00014\u00014\u00014\u00014\u00014\u00054\u02f3"+
		"\b4\n4\f4\u02f6\t4\u00014\u00034\u02f9\b4\u00034\u02fb\b4\u00014\u0001"+
		"4\u00015\u00015\u00015\u00015\u00016\u00016\u00016\u00016\u00017\u0001"+
		"7\u00017\u00017\u00017\u00057\u030c\b7\n7\f7\u030f\t7\u00017\u00017\u0001"+
		"7\u00057\u0314\b7\n7\f7\u0317\t7\u00017\u00017\u00018\u00018\u00018\u0005"+
		"8\u031e\b8\n8\f8\u0321\t8\u00019\u00019\u0001:\u0001:\u0001:\u0005:\u0328"+
		"\b:\n:\f:\u032b\t:\u0001;\u0001;\u0001;\u0005;\u0330\b;\n;\f;\u0333\t"+
		";\u0001<\u0001<\u0001<\u0003<\u0338\b<\u0001=\u0001=\u0001=\u0003=\u033d"+
		"\b=\u0001>\u0001>\u0001>\u0005>\u0342\b>\n>\f>\u0345\t>\u0001?\u0001?"+
		"\u0001?\u0005?\u034a\b?\n?\f?\u034d\t?\u0001@\u0001@\u0001@\u0001@\u0001"+
		"@\u0001@\u0001@\u0003@\u0356\b@\u0001@\u0003@\u0359\b@\u0001A\u0001A\u0001"+
		"B\u0001B\u0001B\u0000\u0000C\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPR"+
		"TVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0000\u0011\u0002\u0000llpp"+
		"\u0001\u0000np\u0002\u000088\\^\u0002\u0000llno\u0002\u0000<<XZ\u0003"+
		"\u0000<<hhjj\u0002\u0000lloo\u0001\u0000ST\u0001\u0000.0\u0001\u0000?"+
		"@\u0004\u0000<<BBhhjj\u0001\u0000\u000b\f\u0001\u0000\r\u0010\u0001\u0000"+
		"\u0011\u0012\u0001\u0000\u0015\u0016\u0002\u0000mmpp\u0002\u0000noqq\u03a4"+
		"\u0000\u0089\u0001\u0000\u0000\u0000\u0002\u0091\u0001\u0000\u0000\u0000"+
		"\u0004\u00a8\u0001\u0000\u0000\u0000\u0006\u00aa\u0001\u0000\u0000\u0000"+
		"\b\u00c1\u0001\u0000\u0000\u0000\n\u00cf\u0001\u0000\u0000\u0000\f\u00d1"+
		"\u0001\u0000\u0000\u0000\u000e\u00e2\u0001\u0000\u0000\u0000\u0010\u00e6"+
		"\u0001\u0000\u0000\u0000\u0012\u00fa\u0001\u0000\u0000\u0000\u0014\u00fc"+
		"\u0001\u0000\u0000\u0000\u0016\u010d\u0001\u0000\u0000\u0000\u0018\u010f"+
		"\u0001\u0000\u0000\u0000\u001a\u0123\u0001\u0000\u0000\u0000\u001c\u0125"+
		"\u0001\u0000\u0000\u0000\u001e\u0145\u0001\u0000\u0000\u0000 \u0147\u0001"+
		"\u0000\u0000\u0000\"\u015f\u0001\u0000\u0000\u0000$\u0161\u0001\u0000"+
		"\u0000\u0000&\u0165\u0001\u0000\u0000\u0000(\u0178\u0001\u0000\u0000\u0000"+
		"*\u017a\u0001\u0000\u0000\u0000,\u0180\u0001\u0000\u0000\u0000.\u0182"+
		"\u0001\u0000\u0000\u00000\u018c\u0001\u0000\u0000\u00002\u019d\u0001\u0000"+
		"\u0000\u00004\u01ad\u0001\u0000\u0000\u00006\u01af\u0001\u0000\u0000\u0000"+
		"8\u01c4\u0001\u0000\u0000\u0000:\u01c6\u0001\u0000\u0000\u0000<\u01d7"+
		"\u0001\u0000\u0000\u0000>\u01d9\u0001\u0000\u0000\u0000@\u01ee\u0001\u0000"+
		"\u0000\u0000B\u0210\u0001\u0000\u0000\u0000D\u021e\u0001\u0000\u0000\u0000"+
		"F\u0226\u0001\u0000\u0000\u0000H\u0228\u0001\u0000\u0000\u0000J\u0241"+
		"\u0001\u0000\u0000\u0000L\u0243\u0001\u0000\u0000\u0000N\u0260\u0001\u0000"+
		"\u0000\u0000P\u0262\u0001\u0000\u0000\u0000R\u0298\u0001\u0000\u0000\u0000"+
		"T\u029a\u0001\u0000\u0000\u0000V\u02b0\u0001\u0000\u0000\u0000X\u02b5"+
		"\u0001\u0000\u0000\u0000Z\u02c6\u0001\u0000\u0000\u0000\\\u02c8\u0001"+
		"\u0000\u0000\u0000^\u02cd\u0001\u0000\u0000\u0000`\u02dc\u0001\u0000\u0000"+
		"\u0000b\u02e0\u0001\u0000\u0000\u0000d\u02e4\u0001\u0000\u0000\u0000f"+
		"\u02e8\u0001\u0000\u0000\u0000h\u02ec\u0001\u0000\u0000\u0000j\u02fe\u0001"+
		"\u0000\u0000\u0000l\u0302\u0001\u0000\u0000\u0000n\u0306\u0001\u0000\u0000"+
		"\u0000p\u031a\u0001\u0000\u0000\u0000r\u0322\u0001\u0000\u0000\u0000t"+
		"\u0324\u0001\u0000\u0000\u0000v\u032c\u0001\u0000\u0000\u0000x\u0334\u0001"+
		"\u0000\u0000\u0000z\u0339\u0001\u0000\u0000\u0000|\u033e\u0001\u0000\u0000"+
		"\u0000~\u0346\u0001\u0000\u0000\u0000\u0080\u0358\u0001\u0000\u0000\u0000"+
		"\u0082\u035a\u0001\u0000\u0000\u0000\u0084\u035c\u0001\u0000\u0000\u0000"+
		"\u0086\u0088\u0003X,\u0000\u0087\u0086\u0001\u0000\u0000\u0000\u0088\u008b"+
		"\u0001\u0000\u0000\u0000\u0089\u0087\u0001\u0000\u0000\u0000\u0089\u008a"+
		"\u0001\u0000\u0000\u0000\u008a\u008d\u0001\u0000\u0000\u0000\u008b\u0089"+
		"\u0001\u0000\u0000\u0000\u008c\u008e\u0003\u0002\u0001\u0000\u008d\u008c"+
		"\u0001\u0000\u0000\u0000\u008d\u008e\u0001\u0000\u0000\u0000\u008e\u008f"+
		"\u0001\u0000\u0000\u0000\u008f\u0090\u0005\u0000\u0000\u0001\u0090\u0001"+
		"\u0001\u0000\u0000\u0000\u0091\u0092\u0005\u0017\u0000\u0000\u0092\u009e"+
		"\u0005\u0001\u0000\u0000\u0093\u0098\u0003\u0004\u0002\u0000\u0094\u0095"+
		"\u0005\t\u0000\u0000\u0095\u0097\u0003\u0004\u0002\u0000\u0096\u0094\u0001"+
		"\u0000\u0000\u0000\u0097\u009a\u0001\u0000\u0000\u0000\u0098\u0096\u0001"+
		"\u0000\u0000\u0000\u0098\u0099\u0001\u0000\u0000\u0000\u0099\u009c\u0001"+
		"\u0000\u0000\u0000\u009a\u0098\u0001\u0000\u0000\u0000\u009b\u009d\u0005"+
		"\t\u0000\u0000\u009c\u009b\u0001\u0000\u0000\u0000\u009c\u009d\u0001\u0000"+
		"\u0000\u0000\u009d\u009f\u0001\u0000\u0000\u0000\u009e\u0093\u0001\u0000"+
		"\u0000\u0000\u009e\u009f\u0001\u0000\u0000\u0000\u009f\u00a0\u0001\u0000"+
		"\u0000\u0000\u00a0\u00a1\u0005\u0002\u0000\u0000\u00a1\u0003\u0001\u0000"+
		"\u0000\u0000\u00a2\u00a3\u0005+\u0000\u0000\u00a3\u00a4\u0005\u0003\u0000"+
		"\u0000\u00a4\u00a9\u0003\n\u0005\u0000\u00a5\u00a6\u00054\u0000\u0000"+
		"\u00a6\u00a7\u0005\u0003\u0000\u0000\u00a7\u00a9\u0003\u0006\u0003\u0000"+
		"\u00a8\u00a2\u0001\u0000\u0000\u0000\u00a8\u00a5\u0001\u0000\u0000\u0000"+
		"\u00a9\u0005\u0001\u0000\u0000\u0000\u00aa\u00ab\u0005\u001c\u0000\u0000"+
		"\u00ab\u00b7\u0005\u0001\u0000\u0000\u00ac\u00b1\u0003\b\u0004\u0000\u00ad"+
		"\u00ae\u0005\t\u0000\u0000\u00ae\u00b0\u0003\b\u0004\u0000\u00af\u00ad"+
		"\u0001\u0000\u0000\u0000\u00b0\u00b3\u0001\u0000\u0000\u0000\u00b1\u00af"+
		"\u0001\u0000\u0000\u0000\u00b1\u00b2\u0001\u0000\u0000\u0000\u00b2\u00b5"+
		"\u0001\u0000\u0000\u0000\u00b3\u00b1\u0001\u0000\u0000\u0000\u00b4\u00b6"+
		"\u0005\t\u0000\u0000\u00b5\u00b4\u0001\u0000\u0000\u0000\u00b5\u00b6\u0001"+
		"\u0000\u0000\u0000\u00b6\u00b8\u0001\u0000\u0000\u0000\u00b7\u00ac\u0001"+
		"\u0000\u0000\u0000\u00b7\u00b8\u0001\u0000\u0000\u0000\u00b8\u00b9\u0001"+
		"\u0000\u0000\u0000\u00b9\u00ba\u0005\u0002\u0000\u0000\u00ba\u0007\u0001"+
		"\u0000\u0000\u0000\u00bb\u00bc\u0005P\u0000\u0000\u00bc\u00bd\u0005\u0003"+
		"\u0000\u0000\u00bd\u00c2\u0007\u0000\u0000\u0000\u00be\u00bf\u0005U\u0000"+
		"\u0000\u00bf\u00c0\u0005\u0003\u0000\u0000\u00c0\u00c2\u0005m\u0000\u0000"+
		"\u00c1\u00bb\u0001\u0000\u0000\u0000\u00c1\u00be\u0001\u0000\u0000\u0000"+
		"\u00c2\t\u0001\u0000\u0000\u0000\u00c3\u00d0\u0003\u0010\b\u0000\u00c4"+
		"\u00d0\u0003\u0014\n\u0000\u00c5\u00d0\u0003\u001c\u000e\u0000\u00c6\u00d0"+
		"\u0003 \u0010\u0000\u00c7\u00d0\u00036\u001b\u0000\u00c8\u00d0\u0003\u0018"+
		"\f\u0000\u00c9\u00d0\u0003:\u001d\u0000\u00ca\u00d0\u0003>\u001f\u0000"+
		"\u00cb\u00d0\u0003H$\u0000\u00cc\u00d0\u0003L&\u0000\u00cd\u00d0\u0003"+
		"\f\u0006\u0000\u00ce\u00d0\u0003P(\u0000\u00cf\u00c3\u0001\u0000\u0000"+
		"\u0000\u00cf\u00c4\u0001\u0000\u0000\u0000\u00cf\u00c5\u0001\u0000\u0000"+
		"\u0000\u00cf\u00c6\u0001\u0000\u0000\u0000\u00cf\u00c7\u0001\u0000\u0000"+
		"\u0000\u00cf\u00c8\u0001\u0000\u0000\u0000\u00cf\u00c9\u0001\u0000\u0000"+
		"\u0000\u00cf\u00ca\u0001\u0000\u0000\u0000\u00cf\u00cb\u0001\u0000\u0000"+
		"\u0000\u00cf\u00cc\u0001\u0000\u0000\u0000\u00cf\u00cd\u0001\u0000\u0000"+
		"\u0000\u00cf\u00ce\u0001\u0000\u0000\u0000\u00d0\u000b\u0001\u0000\u0000"+
		"\u0000\u00d1\u00d2\u0005k\u0000\u0000\u00d2\u00de\u0005\u0001\u0000\u0000"+
		"\u00d3\u00d8\u0003\u000e\u0007\u0000\u00d4\u00d5\u0005\t\u0000\u0000\u00d5"+
		"\u00d7\u0003\u000e\u0007\u0000\u00d6\u00d4\u0001\u0000\u0000\u0000\u00d7"+
		"\u00da\u0001\u0000\u0000\u0000\u00d8\u00d6\u0001\u0000\u0000\u0000\u00d8"+
		"\u00d9\u0001\u0000\u0000\u0000\u00d9\u00dc\u0001\u0000\u0000\u0000\u00da"+
		"\u00d8\u0001\u0000\u0000\u0000\u00db\u00dd\u0005\t\u0000\u0000\u00dc\u00db"+
		"\u0001\u0000\u0000\u0000\u00dc\u00dd\u0001\u0000\u0000\u0000\u00dd\u00df"+
		"\u0001\u0000\u0000\u0000\u00de\u00d3\u0001\u0000\u0000\u0000\u00de\u00df"+
		"\u0001\u0000\u0000\u0000\u00df\u00e0\u0001\u0000\u0000\u0000\u00e0\u00e1"+
		"\u0005\u0002\u0000\u0000\u00e1\r\u0001\u0000\u0000\u0000\u00e2\u00e3\u0005"+
		"l\u0000\u0000\u00e3\u00e4\u0005\u0003\u0000\u0000\u00e4\u00e5\u0007\u0001"+
		"\u0000\u0000\u00e5\u000f\u0001\u0000\u0000\u0000\u00e6\u00e7\u0005\u0018"+
		"\u0000\u0000\u00e7\u00f3\u0005\u0001\u0000\u0000\u00e8\u00ed\u0003\u0012"+
		"\t\u0000\u00e9\u00ea\u0005\t\u0000\u0000\u00ea\u00ec\u0003\u0012\t\u0000"+
		"\u00eb\u00e9\u0001\u0000\u0000\u0000\u00ec\u00ef\u0001\u0000\u0000\u0000"+
		"\u00ed\u00eb\u0001\u0000\u0000\u0000\u00ed\u00ee\u0001\u0000\u0000\u0000"+
		"\u00ee\u00f1\u0001\u0000\u0000\u0000\u00ef\u00ed\u0001\u0000\u0000\u0000"+
		"\u00f0\u00f2\u0005\t\u0000\u0000\u00f1\u00f0\u0001\u0000\u0000\u0000\u00f1"+
		"\u00f2\u0001\u0000\u0000\u0000\u00f2\u00f4\u0001\u0000\u0000\u0000\u00f3"+
		"\u00e8\u0001\u0000\u0000\u0000\u00f3\u00f4\u0001\u0000\u0000\u0000\u00f4"+
		"\u00f5\u0001\u0000\u0000\u0000\u00f5\u00f6\u0005\u0002\u0000\u0000\u00f6"+
		"\u0011\u0001\u0000\u0000\u0000\u00f7\u00fb\u0003h4\u0000\u00f8\u00fb\u0003"+
		"j5\u0000\u00f9\u00fb\u0003l6\u0000\u00fa\u00f7\u0001\u0000\u0000\u0000"+
		"\u00fa\u00f8\u0001\u0000\u0000\u0000\u00fa\u00f9\u0001\u0000\u0000\u0000"+
		"\u00fb\u0013\u0001\u0000\u0000\u0000\u00fc\u00fd\u0005\u0019\u0000\u0000"+
		"\u00fd\u0109\u0005\u0001\u0000\u0000\u00fe\u0103\u0003\u0016\u000b\u0000"+
		"\u00ff\u0100\u0005\t\u0000\u0000\u0100\u0102\u0003\u0016\u000b\u0000\u0101"+
		"\u00ff\u0001\u0000\u0000\u0000\u0102\u0105\u0001\u0000\u0000\u0000\u0103"+
		"\u0101\u0001\u0000\u0000\u0000\u0103\u0104\u0001\u0000\u0000\u0000\u0104"+
		"\u0107\u0001\u0000\u0000\u0000\u0105\u0103\u0001\u0000\u0000\u0000\u0106"+
		"\u0108\u0005\t\u0000\u0000\u0107\u0106\u0001\u0000\u0000\u0000\u0107\u0108"+
		"\u0001\u0000\u0000\u0000\u0108\u010a\u0001\u0000\u0000\u0000\u0109\u00fe"+
		"\u0001\u0000\u0000\u0000\u0109\u010a\u0001\u0000\u0000\u0000\u010a\u010b"+
		"\u0001\u0000\u0000\u0000\u010b\u010c\u0005\u0002\u0000\u0000\u010c\u0015"+
		"\u0001\u0000\u0000\u0000\u010d\u010e\u0003f3\u0000\u010e\u0017\u0001\u0000"+
		"\u0000\u0000\u010f\u0110\u0005\u001a\u0000\u0000\u0110\u011c\u0005\u0001"+
		"\u0000\u0000\u0111\u0116\u0003\u001a\r\u0000\u0112\u0113\u0005\t\u0000"+
		"\u0000\u0113\u0115\u0003\u001a\r\u0000\u0114\u0112\u0001\u0000\u0000\u0000"+
		"\u0115\u0118\u0001\u0000\u0000\u0000\u0116\u0114\u0001\u0000\u0000\u0000"+
		"\u0116\u0117\u0001\u0000\u0000\u0000\u0117\u011a\u0001\u0000\u0000\u0000"+
		"\u0118\u0116\u0001\u0000\u0000\u0000\u0119\u011b\u0005\t\u0000\u0000\u011a"+
		"\u0119\u0001\u0000\u0000\u0000\u011a\u011b\u0001\u0000\u0000\u0000\u011b"+
		"\u011d\u0001\u0000\u0000\u0000\u011c\u0111\u0001\u0000\u0000\u0000\u011c"+
		"\u011d\u0001\u0000\u0000\u0000\u011d\u011e\u0001\u0000\u0000\u0000\u011e"+
		"\u011f\u0005\u0002\u0000\u0000\u011f\u0019\u0001\u0000\u0000\u0000\u0120"+
		"\u0124\u0003h4\u0000\u0121\u0124\u0003j5\u0000\u0122\u0124\u0003l6\u0000"+
		"\u0123\u0120\u0001\u0000\u0000\u0000\u0123\u0121\u0001\u0000\u0000\u0000"+
		"\u0123\u0122\u0001\u0000\u0000\u0000\u0124\u001b\u0001\u0000\u0000\u0000"+
		"\u0125\u0126\u0005\u001b\u0000\u0000\u0126\u0132\u0005\u0001\u0000\u0000"+
		"\u0127\u012c\u0003\u001e\u000f\u0000\u0128\u0129\u0005\t\u0000\u0000\u0129"+
		"\u012b\u0003\u001e\u000f\u0000\u012a\u0128\u0001\u0000\u0000\u0000\u012b"+
		"\u012e\u0001\u0000\u0000\u0000\u012c\u012a\u0001\u0000\u0000\u0000\u012c"+
		"\u012d\u0001\u0000\u0000\u0000\u012d\u0130\u0001\u0000\u0000\u0000\u012e"+
		"\u012c\u0001\u0000\u0000\u0000\u012f\u0131\u0005\t\u0000\u0000\u0130\u012f"+
		"\u0001\u0000\u0000\u0000\u0130\u0131\u0001\u0000\u0000\u0000\u0131\u0133"+
		"\u0001\u0000\u0000\u0000\u0132\u0127\u0001\u0000\u0000\u0000\u0132\u0133"+
		"\u0001\u0000\u0000\u0000\u0133\u0134\u0001\u0000\u0000\u0000\u0134\u0135"+
		"\u0005\u0002\u0000\u0000\u0135\u001d\u0001\u0000\u0000\u0000\u0136\u0137"+
		"\u00053\u0000\u0000\u0137\u0138\u0005\u0003\u0000\u0000\u0138\u0146\u0007"+
		"\u0000\u0000\u0000\u0139\u013a\u00055\u0000\u0000\u013a\u013b\u0005\u0003"+
		"\u0000\u0000\u013b\u0146\u0007\u0002\u0000\u0000\u013c\u013d\u00056\u0000"+
		"\u0000\u013d\u013e\u0005\u0003\u0000\u0000\u013e\u0146\u0007\u0003\u0000"+
		"\u0000\u013f\u0140\u00057\u0000\u0000\u0140\u0141\u0005\u0003\u0000\u0000"+
		"\u0141\u0146\u0007\u0003\u0000\u0000\u0142\u0143\u0005V\u0000\u0000\u0143"+
		"\u0144\u0005\u0003\u0000\u0000\u0144\u0146\u0007\u0004\u0000\u0000\u0145"+
		"\u0136\u0001\u0000\u0000\u0000\u0145\u0139\u0001\u0000\u0000\u0000\u0145"+
		"\u013c\u0001\u0000\u0000\u0000\u0145\u013f\u0001\u0000\u0000\u0000\u0145"+
		"\u0142\u0001\u0000\u0000\u0000\u0146\u001f\u0001\u0000\u0000\u0000\u0147"+
		"\u0148\u0005\u001d\u0000\u0000\u0148\u0154\u0005\u0001\u0000\u0000\u0149"+
		"\u014e\u0003\"\u0011\u0000\u014a\u014b\u0005\t\u0000\u0000\u014b\u014d"+
		"\u0003\"\u0011\u0000\u014c\u014a\u0001\u0000\u0000\u0000\u014d\u0150\u0001"+
		"\u0000\u0000\u0000\u014e\u014c\u0001\u0000\u0000\u0000\u014e\u014f\u0001"+
		"\u0000\u0000\u0000\u014f\u0152\u0001\u0000\u0000\u0000\u0150\u014e\u0001"+
		"\u0000\u0000\u0000\u0151\u0153\u0005\t\u0000\u0000\u0152\u0151\u0001\u0000"+
		"\u0000\u0000\u0152\u0153\u0001\u0000\u0000\u0000\u0153\u0155\u0001\u0000"+
		"\u0000\u0000\u0154\u0149\u0001\u0000\u0000\u0000\u0154\u0155\u0001\u0000"+
		"\u0000\u0000\u0155\u0156\u0001\u0000\u0000\u0000\u0156\u0157\u0005\u0002"+
		"\u0000\u0000\u0157!\u0001\u0000\u0000\u0000\u0158\u0160\u0003`0\u0000"+
		"\u0159\u0160\u0003b1\u0000\u015a\u015b\u0005;\u0000\u0000\u015b\u015c"+
		"\u0005\u0003\u0000\u0000\u015c\u0160\u0007\u0005\u0000\u0000\u015d\u0160"+
		"\u0003f3\u0000\u015e\u0160\u0003$\u0012\u0000\u015f\u0158\u0001\u0000"+
		"\u0000\u0000\u015f\u0159\u0001\u0000\u0000\u0000\u015f\u015a\u0001\u0000"+
		"\u0000\u0000\u015f\u015d\u0001\u0000\u0000\u0000\u015f\u015e\u0001\u0000"+
		"\u0000\u0000\u0160#\u0001\u0000\u0000\u0000\u0161\u0162\u0005C\u0000\u0000"+
		"\u0162\u0163\u0005\u0003\u0000\u0000\u0163\u0164\u0003&\u0013\u0000\u0164"+
		"%\u0001\u0000\u0000\u0000\u0165\u0166\u0005\u001f\u0000\u0000\u0166\u0172"+
		"\u0005\u0001\u0000\u0000\u0167\u016c\u0003(\u0014\u0000\u0168\u0169\u0005"+
		"\t\u0000\u0000\u0169\u016b\u0003(\u0014\u0000\u016a\u0168\u0001\u0000"+
		"\u0000\u0000\u016b\u016e\u0001\u0000\u0000\u0000\u016c\u016a\u0001\u0000"+
		"\u0000\u0000\u016c\u016d\u0001\u0000\u0000\u0000\u016d\u0170\u0001\u0000"+
		"\u0000\u0000\u016e\u016c\u0001\u0000\u0000\u0000\u016f\u0171\u0005\t\u0000"+
		"\u0000\u0170\u016f\u0001\u0000\u0000\u0000\u0170\u0171\u0001\u0000\u0000"+
		"\u0000\u0171\u0173\u0001\u0000\u0000\u0000\u0172\u0167\u0001\u0000\u0000"+
		"\u0000\u0172\u0173\u0001\u0000\u0000\u0000\u0173\u0174\u0001\u0000\u0000"+
		"\u0000\u0174\u0175\u0005\u0002\u0000\u0000\u0175\'\u0001\u0000\u0000\u0000"+
		"\u0176\u0179\u0003d2\u0000\u0177\u0179\u0003*\u0015\u0000\u0178\u0176"+
		"\u0001\u0000\u0000\u0000\u0178\u0177\u0001\u0000\u0000\u0000\u0179)\u0001"+
		"\u0000\u0000\u0000\u017a\u017b\u0005E\u0000\u0000\u017b\u017c\u0005\u0003"+
		"\u0000\u0000\u017c\u017d\u0003,\u0016\u0000\u017d+\u0001\u0000\u0000\u0000"+
		"\u017e\u0181\u00030\u0018\u0000\u017f\u0181\u0003.\u0017\u0000\u0180\u017e"+
		"\u0001\u0000\u0000\u0000\u0180\u017f\u0001\u0000\u0000\u0000\u0181-\u0001"+
		"\u0000\u0000\u0000\u0182\u0183\u0005)\u0000\u0000\u0183\u0188\u0005\u0001"+
		"\u0000\u0000\u0184\u0186\u00032\u0019\u0000\u0185\u0187\u0005\t\u0000"+
		"\u0000\u0186\u0185\u0001\u0000\u0000\u0000\u0186\u0187\u0001\u0000\u0000"+
		"\u0000\u0187\u0189\u0001\u0000\u0000\u0000\u0188\u0184\u0001\u0000\u0000"+
		"\u0000\u0188\u0189\u0001\u0000\u0000\u0000\u0189\u018a\u0001\u0000\u0000"+
		"\u0000\u018a\u018b\u0005\u0002\u0000\u0000\u018b/\u0001\u0000\u0000\u0000"+
		"\u018c\u018d\u0005(\u0000\u0000\u018d\u0199\u0005\u0001\u0000\u0000\u018e"+
		"\u0193\u00034\u001a\u0000\u018f\u0190\u0005\t\u0000\u0000\u0190\u0192"+
		"\u00034\u001a\u0000\u0191\u018f\u0001\u0000\u0000\u0000\u0192\u0195\u0001"+
		"\u0000\u0000\u0000\u0193\u0191\u0001\u0000\u0000\u0000\u0193\u0194\u0001"+
		"\u0000\u0000\u0000\u0194\u0197\u0001\u0000\u0000\u0000\u0195\u0193\u0001"+
		"\u0000\u0000\u0000\u0196\u0198\u0005\t\u0000\u0000\u0197\u0196\u0001\u0000"+
		"\u0000\u0000\u0197\u0198\u0001\u0000\u0000\u0000\u0198\u019a\u0001\u0000"+
		"\u0000\u0000\u0199\u018e\u0001\u0000\u0000\u0000\u0199\u019a\u0001\u0000"+
		"\u0000\u0000\u019a\u019b\u0001\u0000\u0000\u0000\u019b\u019c\u0005\u0002"+
		"\u0000\u0000\u019c1\u0001\u0000\u0000\u0000\u019d\u019e\u0005e\u0000\u0000"+
		"\u019e\u019f\u0005\u0003\u0000\u0000\u019f\u01a0\u0007\u0003\u0000\u0000"+
		"\u01a03\u0001\u0000\u0000\u0000\u01a1\u01a2\u0005H\u0000\u0000\u01a2\u01a3"+
		"\u0005\u0003\u0000\u0000\u01a3\u01ae\u0007\u0006\u0000\u0000\u01a4\u01a5"+
		"\u0005I\u0000\u0000\u01a5\u01a6\u0005\u0003\u0000\u0000\u01a6\u01ae\u0007"+
		"\u0006\u0000\u0000\u01a7\u01a8\u0005J\u0000\u0000\u01a8\u01a9\u0005\u0003"+
		"\u0000\u0000\u01a9\u01ae\u0007\u0006\u0000\u0000\u01aa\u01ab\u0005K\u0000"+
		"\u0000\u01ab\u01ac\u0005\u0003\u0000\u0000\u01ac\u01ae\u0007\u0006\u0000"+
		"\u0000\u01ad\u01a1\u0001\u0000\u0000\u0000\u01ad\u01a4\u0001\u0000\u0000"+
		"\u0000\u01ad\u01a7\u0001\u0000\u0000\u0000\u01ad\u01aa\u0001\u0000\u0000"+
		"\u0000\u01ae5\u0001\u0000\u0000\u0000\u01af\u01b0\u0005\u001e\u0000\u0000"+
		"\u01b0\u01bc\u0005\u0001\u0000\u0000\u01b1\u01b6\u00038\u001c\u0000\u01b2"+
		"\u01b3\u0005\t\u0000\u0000\u01b3\u01b5\u00038\u001c\u0000\u01b4\u01b2"+
		"\u0001\u0000\u0000\u0000\u01b5\u01b8\u0001\u0000\u0000\u0000\u01b6\u01b4"+
		"\u0001\u0000\u0000\u0000\u01b6\u01b7\u0001\u0000\u0000\u0000\u01b7\u01ba"+
		"\u0001\u0000\u0000\u0000\u01b8\u01b6\u0001\u0000\u0000\u0000\u01b9\u01bb"+
		"\u0005\t\u0000\u0000\u01ba\u01b9\u0001\u0000\u0000\u0000\u01ba\u01bb\u0001"+
		"\u0000\u0000\u0000\u01bb\u01bd\u0001\u0000\u0000\u0000\u01bc\u01b1\u0001"+
		"\u0000\u0000\u0000\u01bc\u01bd\u0001\u0000\u0000\u0000\u01bd\u01be\u0001"+
		"\u0000\u0000\u0000\u01be\u01bf\u0005\u0002\u0000\u0000\u01bf7\u0001\u0000"+
		"\u0000\u0000\u01c0\u01c1\u0005=\u0000\u0000\u01c1\u01c2\u0005\u0003\u0000"+
		"\u0000\u01c2\u01c5\u0007\u0006\u0000\u0000\u01c3\u01c5\u0003f3\u0000\u01c4"+
		"\u01c0\u0001\u0000\u0000\u0000\u01c4\u01c3\u0001\u0000\u0000\u0000\u01c5"+
		"9\u0001\u0000\u0000\u0000\u01c6\u01c7\u0005%\u0000\u0000\u01c7\u01d3\u0005"+
		"\u0001\u0000\u0000\u01c8\u01cd\u0003<\u001e\u0000\u01c9\u01ca\u0005\t"+
		"\u0000\u0000\u01ca\u01cc\u0003<\u001e\u0000\u01cb\u01c9\u0001\u0000\u0000"+
		"\u0000\u01cc\u01cf\u0001\u0000\u0000\u0000\u01cd\u01cb\u0001\u0000\u0000"+
		"\u0000\u01cd\u01ce\u0001\u0000\u0000\u0000\u01ce\u01d1\u0001\u0000\u0000"+
		"\u0000\u01cf\u01cd\u0001\u0000\u0000\u0000\u01d0\u01d2\u0005\t\u0000\u0000"+
		"\u01d1\u01d0\u0001\u0000\u0000\u0000\u01d1\u01d2\u0001\u0000\u0000\u0000"+
		"\u01d2\u01d4\u0001\u0000\u0000\u0000\u01d3\u01c8\u0001\u0000\u0000\u0000"+
		"\u01d3\u01d4\u0001\u0000\u0000\u0000\u01d4\u01d5\u0001\u0000\u0000\u0000"+
		"\u01d5\u01d6\u0005\u0002\u0000\u0000\u01d6;\u0001\u0000\u0000\u0000\u01d7"+
		"\u01d8\u0003n7\u0000\u01d8=\u0001\u0000\u0000\u0000\u01d9\u01da\u0005"+
		" \u0000\u0000\u01da\u01e6\u0005\u0001\u0000\u0000\u01db\u01e0\u0003@ "+
		"\u0000\u01dc\u01dd\u0005\t\u0000\u0000\u01dd\u01df\u0003@ \u0000\u01de"+
		"\u01dc\u0001\u0000\u0000\u0000\u01df\u01e2\u0001\u0000\u0000\u0000\u01e0"+
		"\u01de\u0001\u0000\u0000\u0000\u01e0\u01e1\u0001\u0000\u0000\u0000\u01e1"+
		"\u01e4\u0001\u0000\u0000\u0000\u01e2\u01e0\u0001\u0000\u0000\u0000\u01e3"+
		"\u01e5\u0005\t\u0000\u0000\u01e4\u01e3\u0001\u0000\u0000\u0000\u01e4\u01e5"+
		"\u0001\u0000\u0000\u0000\u01e5\u01e7\u0001\u0000\u0000\u0000\u01e6\u01db"+
		"\u0001\u0000\u0000\u0000\u01e6\u01e7\u0001\u0000\u0000\u0000\u01e7\u01e8"+
		"\u0001\u0000\u0000\u0000\u01e8\u01e9\u0005\u0002\u0000\u0000\u01e9?\u0001"+
		"\u0000\u0000\u0000\u01ea\u01eb\u0005G\u0000\u0000\u01eb\u01ec\u0005\u0003"+
		"\u0000\u0000\u01ec\u01ef\u0003B!\u0000\u01ed\u01ef\u0003f3\u0000\u01ee"+
		"\u01ea\u0001\u0000\u0000\u0000\u01ee\u01ed\u0001\u0000\u0000\u0000\u01ef"+
		"A\u0001\u0000\u0000\u0000\u01f0\u01f1\u0005!\u0000\u0000\u01f1\u01fd\u0005"+
		"\u0001\u0000\u0000\u01f2\u01f7\u0003D\"\u0000\u01f3\u01f4\u0005\t\u0000"+
		"\u0000\u01f4\u01f6\u0003D\"\u0000\u01f5\u01f3\u0001\u0000\u0000\u0000"+
		"\u01f6\u01f9\u0001\u0000\u0000\u0000\u01f7\u01f5\u0001\u0000\u0000\u0000"+
		"\u01f7\u01f8\u0001\u0000\u0000\u0000\u01f8\u01fb\u0001\u0000\u0000\u0000"+
		"\u01f9\u01f7\u0001\u0000\u0000\u0000\u01fa\u01fc\u0005\t\u0000\u0000\u01fb"+
		"\u01fa\u0001\u0000\u0000\u0000\u01fb\u01fc\u0001\u0000\u0000\u0000\u01fc"+
		"\u01fe\u0001\u0000\u0000\u0000\u01fd\u01f2\u0001\u0000\u0000\u0000\u01fd"+
		"\u01fe\u0001\u0000\u0000\u0000\u01fe\u01ff\u0001\u0000\u0000\u0000\u01ff"+
		"\u0211\u0005\u0002\u0000\u0000\u0200\u0201\u0005\"\u0000\u0000\u0201\u020d"+
		"\u0005\u0001\u0000\u0000\u0202\u0207\u0003F#\u0000\u0203\u0204\u0005\t"+
		"\u0000\u0000\u0204\u0206\u0003F#\u0000\u0205\u0203\u0001\u0000\u0000\u0000"+
		"\u0206\u0209\u0001\u0000\u0000\u0000\u0207\u0205\u0001\u0000\u0000\u0000"+
		"\u0207\u0208\u0001\u0000\u0000\u0000\u0208\u020b\u0001\u0000\u0000\u0000"+
		"\u0209\u0207\u0001\u0000\u0000\u0000\u020a\u020c\u0005\t\u0000\u0000\u020b"+
		"\u020a\u0001\u0000\u0000\u0000\u020b\u020c\u0001\u0000\u0000\u0000\u020c"+
		"\u020e\u0001\u0000\u0000\u0000\u020d\u0202\u0001\u0000\u0000\u0000\u020d"+
		"\u020e\u0001\u0000\u0000\u0000\u020e\u020f\u0001\u0000\u0000\u0000\u020f"+
		"\u0211\u0005\u0002\u0000\u0000\u0210\u01f0\u0001\u0000\u0000\u0000\u0210"+
		"\u0200\u0001\u0000\u0000\u0000\u0211C\u0001\u0000\u0000\u0000\u0212\u0213"+
		"\u0005g\u0000\u0000\u0213\u0214\u0005\u0003\u0000\u0000\u0214\u021f\u0007"+
		"\u0003\u0000\u0000\u0215\u0216\u0005h\u0000\u0000\u0216\u0217\u0005\u0003"+
		"\u0000\u0000\u0217\u021f\u0007\u0003\u0000\u0000\u0218\u0219\u0005j\u0000"+
		"\u0000\u0219\u021a\u0005\u0003\u0000\u0000\u021a\u021f\u0007\u0003\u0000"+
		"\u0000\u021b\u021c\u0005i\u0000\u0000\u021c\u021d\u0005\u0003\u0000\u0000"+
		"\u021d\u021f\u0007\u0003\u0000\u0000\u021e\u0212\u0001\u0000\u0000\u0000"+
		"\u021e\u0215\u0001\u0000\u0000\u0000\u021e\u0218\u0001\u0000\u0000\u0000"+
		"\u021e\u021b\u0001\u0000\u0000\u0000\u021fE\u0001\u0000\u0000\u0000\u0220"+
		"\u0221\u0005L\u0000\u0000\u0221\u0222\u0005\u0003\u0000\u0000\u0222\u0227"+
		"\u0007\u0003\u0000\u0000\u0223\u0224\u0005M\u0000\u0000\u0224\u0225\u0005"+
		"\u0003\u0000\u0000\u0225\u0227\u0007\u0003\u0000\u0000\u0226\u0220\u0001"+
		"\u0000\u0000\u0000\u0226\u0223\u0001\u0000\u0000\u0000\u0227G\u0001\u0000"+
		"\u0000\u0000\u0228\u0229\u0005#\u0000\u0000\u0229\u0235\u0005\u0001\u0000"+
		"\u0000\u022a\u022f\u0003J%\u0000\u022b\u022c\u0005\t\u0000\u0000\u022c"+
		"\u022e\u0003J%\u0000\u022d\u022b\u0001\u0000\u0000\u0000\u022e\u0231\u0001"+
		"\u0000\u0000\u0000\u022f\u022d\u0001\u0000\u0000\u0000\u022f\u0230\u0001"+
		"\u0000\u0000\u0000\u0230\u0233\u0001\u0000\u0000\u0000\u0231\u022f\u0001"+
		"\u0000\u0000\u0000\u0232\u0234\u0005\t\u0000\u0000\u0233\u0232\u0001\u0000"+
		"\u0000\u0000\u0233\u0234\u0001\u0000\u0000\u0000\u0234\u0236\u0001\u0000"+
		"\u0000\u0000\u0235\u022a\u0001\u0000\u0000\u0000\u0235\u0236\u0001\u0000"+
		"\u0000\u0000\u0236\u0237\u0001\u0000\u0000\u0000\u0237\u0238\u0005\u0002"+
		"\u0000\u0000\u0238I\u0001\u0000\u0000\u0000\u0239\u023a\u0005O\u0000\u0000"+
		"\u023a\u023b\u0005\u0003\u0000\u0000\u023b\u0242\u0007\u0000\u0000\u0000"+
		"\u023c\u023d\u0005N\u0000\u0000\u023d\u023e\u0005\u0003\u0000\u0000\u023e"+
		"\u0242\u0007\u0007\u0000\u0000\u023f\u0242\u0003`0\u0000\u0240\u0242\u0003"+
		"b1\u0000\u0241\u0239\u0001\u0000\u0000\u0000\u0241\u023c\u0001\u0000\u0000"+
		"\u0000\u0241\u023f\u0001\u0000\u0000\u0000\u0241\u0240\u0001\u0000\u0000"+
		"\u0000\u0242K\u0001\u0000\u0000\u0000\u0243\u0244\u0005$\u0000\u0000\u0244"+
		"\u0250\u0005\u0001\u0000\u0000\u0245\u024a\u0003N\'\u0000\u0246\u0247"+
		"\u0005\t\u0000\u0000\u0247\u0249\u0003N\'\u0000\u0248\u0246\u0001\u0000"+
		"\u0000\u0000\u0249\u024c\u0001\u0000\u0000\u0000\u024a\u0248\u0001\u0000"+
		"\u0000\u0000\u024a\u024b\u0001\u0000\u0000\u0000\u024b\u024e\u0001\u0000"+
		"\u0000\u0000\u024c\u024a\u0001\u0000\u0000\u0000\u024d\u024f\u0005\t\u0000"+
		"\u0000\u024e\u024d\u0001\u0000\u0000\u0000\u024e\u024f\u0001\u0000\u0000"+
		"\u0000\u024f\u0251\u0001\u0000\u0000\u0000\u0250\u0245\u0001\u0000\u0000"+
		"\u0000\u0250\u0251\u0001\u0000\u0000\u0000\u0251\u0252\u0001\u0000\u0000"+
		"\u0000\u0252\u0253\u0005\u0002\u0000\u0000\u0253M\u0001\u0000\u0000\u0000"+
		"\u0254\u0261\u0003`0\u0000\u0255\u0261\u0003b1\u0000\u0256\u0257\u0005"+
		"P\u0000\u0000\u0257\u0258\u0005\u0003\u0000\u0000\u0258\u0261\u0007\u0000"+
		"\u0000\u0000\u0259\u025a\u0005Q\u0000\u0000\u025a\u025b\u0005\u0003\u0000"+
		"\u0000\u025b\u0261\u0005q\u0000\u0000\u025c\u025d\u0005R\u0000\u0000\u025d"+
		"\u025e\u0005\u0003\u0000\u0000\u025e\u0261\u0005q\u0000\u0000\u025f\u0261"+
		"\u0003n7\u0000\u0260\u0254\u0001\u0000\u0000\u0000\u0260\u0255\u0001\u0000"+
		"\u0000\u0000\u0260\u0256\u0001\u0000\u0000\u0000\u0260\u0259\u0001\u0000"+
		"\u0000\u0000\u0260\u025c\u0001\u0000\u0000\u0000\u0260\u025f\u0001\u0000"+
		"\u0000\u0000\u0261O\u0001\u0000\u0000\u0000\u0262\u0263\u0005&\u0000\u0000"+
		"\u0263\u026f\u0005\u0001\u0000\u0000\u0264\u0269\u0003R)\u0000\u0265\u0266"+
		"\u0005\t\u0000\u0000\u0266\u0268\u0003R)\u0000\u0267\u0265\u0001\u0000"+
		"\u0000\u0000\u0268\u026b\u0001\u0000\u0000\u0000\u0269\u0267\u0001\u0000"+
		"\u0000\u0000\u0269\u026a\u0001\u0000\u0000\u0000\u026a\u026d\u0001\u0000"+
		"\u0000\u0000\u026b\u0269\u0001\u0000\u0000\u0000\u026c\u026e\u0005\t\u0000"+
		"\u0000\u026d\u026c\u0001\u0000\u0000\u0000\u026d\u026e\u0001\u0000\u0000"+
		"\u0000\u026e\u0270\u0001\u0000\u0000\u0000\u026f\u0264\u0001\u0000\u0000"+
		"\u0000\u026f\u0270\u0001\u0000\u0000\u0000\u0270\u0271\u0001\u0000\u0000"+
		"\u0000\u0271\u0272\u0005\u0002\u0000\u0000\u0272Q\u0001\u0000\u0000\u0000"+
		"\u0273\u0274\u0005_\u0000\u0000\u0274\u0275\u0005\u0003\u0000\u0000\u0275"+
		"\u0299\u0007\u0000\u0000\u0000\u0276\u0277\u0005`\u0000\u0000\u0277\u0278"+
		"\u0005\u0003\u0000\u0000\u0278\u0299\u0007\u0000\u0000\u0000\u0279\u027a"+
		"\u0005a\u0000\u0000\u027a\u027b\u0005\u0003\u0000\u0000\u027b\u0299\u0005"+
		"q\u0000\u0000\u027c\u027d\u0005G\u0000\u0000\u027d\u027e\u0005\u0003\u0000"+
		"\u0000\u027e\u0299\u0003B!\u0000\u027f\u0280\u0005b\u0000\u0000\u0280"+
		"\u0281\u0005\u0003\u0000\u0000\u0281\u0299\u0007\u0000\u0000\u0000\u0282"+
		"\u0283\u0005c\u0000\u0000\u0283\u0284\u0005\u0003\u0000\u0000\u0284\u0299"+
		"\u0003T*\u0000\u0285\u0286\u0005f\u0000\u0000\u0286\u0287\u0005\u0003"+
		"\u0000\u0000\u0287\u028c\u0005\u0001\u0000\u0000\u0288\u0289\u0005l\u0000"+
		"\u0000\u0289\u028b\u0005\t\u0000\u0000\u028a\u0288\u0001\u0000\u0000\u0000"+
		"\u028b\u028e\u0001\u0000\u0000\u0000\u028c\u028a\u0001\u0000\u0000\u0000"+
		"\u028c\u028d\u0001\u0000\u0000\u0000\u028d\u028f\u0001\u0000\u0000\u0000"+
		"\u028e\u028c\u0001\u0000\u0000\u0000\u028f\u0290\u0005\u0002\u0000\u0000"+
		"\u0290\u0294\u0005\u0006\u0000\u0000\u0291\u0293\u0003X,\u0000\u0292\u0291"+
		"\u0001\u0000\u0000\u0000\u0293\u0296\u0001\u0000\u0000\u0000\u0294\u0292"+
		"\u0001\u0000\u0000\u0000\u0294\u0295\u0001\u0000\u0000\u0000\u0295\u0297"+
		"\u0001\u0000\u0000\u0000\u0296\u0294\u0001\u0000\u0000\u0000\u0297\u0299"+
		"\u0005\u0007\u0000\u0000\u0298\u0273\u0001\u0000\u0000\u0000\u0298\u0276"+
		"\u0001\u0000\u0000\u0000\u0298\u0279\u0001\u0000\u0000\u0000\u0298\u027c"+
		"\u0001\u0000\u0000\u0000\u0298\u027f\u0001\u0000\u0000\u0000\u0298\u0282"+
		"\u0001\u0000\u0000\u0000\u0298\u0285\u0001\u0000\u0000\u0000\u0299S\u0001"+
		"\u0000\u0000\u0000\u029a\u029b\u0005\'\u0000\u0000\u029b\u02a7\u0005\u0001"+
		"\u0000\u0000\u029c\u02a1\u0003V+\u0000\u029d\u029e\u0005\t\u0000\u0000"+
		"\u029e\u02a0\u0003V+\u0000\u029f\u029d\u0001\u0000\u0000\u0000\u02a0\u02a3"+
		"\u0001\u0000\u0000\u0000\u02a1\u029f\u0001\u0000\u0000\u0000\u02a1\u02a2"+
		"\u0001\u0000\u0000\u0000\u02a2\u02a5\u0001\u0000\u0000\u0000\u02a3\u02a1"+
		"\u0001\u0000\u0000\u0000\u02a4\u02a6\u0005\t\u0000\u0000\u02a5\u02a4\u0001"+
		"\u0000\u0000\u0000\u02a5\u02a6\u0001\u0000\u0000\u0000\u02a6\u02a8\u0001"+
		"\u0000\u0000\u0000\u02a7\u029c\u0001\u0000\u0000\u0000\u02a7\u02a8\u0001"+
		"\u0000\u0000\u0000\u02a8\u02a9\u0001\u0000\u0000\u0000\u02a9\u02aa\u0005"+
		"\u0002\u0000\u0000\u02aaU\u0001\u0000\u0000\u0000\u02ab\u02ac\u0005d\u0000"+
		"\u0000\u02ac\u02ad\u0005\u0003\u0000\u0000\u02ad\u02b1\u0007\u0006\u0000"+
		"\u0000\u02ae\u02b1\u0003*\u0015\u0000\u02af\u02b1\u0003d2\u0000\u02b0"+
		"\u02ab\u0001\u0000\u0000\u0000\u02b0\u02ae\u0001\u0000\u0000\u0000\u02b0"+
		"\u02af\u0001\u0000\u0000\u0000\u02b1W\u0001\u0000\u0000\u0000\u02b2\u02b6"+
		"\u0003Z-\u0000\u02b3\u02b6\u0003\\.\u0000\u02b4\u02b6\u0003^/\u0000\u02b5"+
		"\u02b2\u0001\u0000\u0000\u0000\u02b5\u02b3\u0001\u0000\u0000\u0000\u02b5"+
		"\u02b4\u0001\u0000\u0000\u0000\u02b6Y\u0001\u0000\u0000\u0000\u02b7\u02b8"+
		"\u0007\b\u0000\u0000\u02b8\u02b9\u0005l\u0000\u0000\u02b9\u02c7\u0005"+
		"\b\u0000\u0000\u02ba\u02bb\u00052\u0000\u0000\u02bb\u02c0\u0005\u0001"+
		"\u0000\u0000\u02bc\u02bd\u0007\b\u0000\u0000\u02bd\u02bf\u0005\t\u0000"+
		"\u0000\u02be\u02bc\u0001\u0000\u0000\u0000\u02bf\u02c2\u0001\u0000\u0000"+
		"\u0000\u02c0\u02be\u0001\u0000\u0000\u0000\u02c0\u02c1\u0001\u0000\u0000"+
		"\u0000\u02c1\u02c3\u0001\u0000\u0000\u0000\u02c2\u02c0\u0001\u0000\u0000"+
		"\u0000\u02c3\u02c4\u0005\u0002\u0000\u0000\u02c4\u02c5\u0005l\u0000\u0000"+
		"\u02c5\u02c7\u0005\b\u0000\u0000\u02c6\u02b7\u0001\u0000\u0000\u0000\u02c6"+
		"\u02ba\u0001\u0000\u0000\u0000\u02c7[\u0001\u0000\u0000\u0000\u02c8\u02c9"+
		"\u0005l\u0000\u0000\u02c9\u02ca\u0005\n\u0000\u0000\u02ca\u02cb\u0007"+
		"\u0001\u0000\u0000\u02cb\u02cc\u0005\b\u0000\u0000\u02cc]\u0001\u0000"+
		"\u0000\u0000\u02cd\u02ce\u0005-\u0000\u0000\u02ce\u02cf\u0005k\u0000\u0000"+
		"\u02cf\u02d3\u0005\u0006\u0000\u0000\u02d0\u02d2\u0003Z-\u0000\u02d1\u02d0"+
		"\u0001\u0000\u0000\u0000\u02d2\u02d5\u0001\u0000\u0000\u0000\u02d3\u02d1"+
		"\u0001\u0000\u0000\u0000\u02d3\u02d4\u0001\u0000\u0000\u0000\u02d4\u02d6"+
		"\u0001\u0000\u0000\u0000\u02d5\u02d3\u0001\u0000\u0000\u0000\u02d6\u02d7"+
		"\u00051\u0000\u0000\u02d7\u02d8\u0005\u0001\u0000\u0000\u02d8\u02d9\u0003"+
		"\n\u0005\u0000\u02d9\u02da\u0005\u0002\u0000\u0000\u02da\u02db\u0005\u0007"+
		"\u0000\u0000\u02db_\u0001\u0000\u0000\u0000\u02dc\u02dd\u00059\u0000\u0000"+
		"\u02dd\u02de\u0005\u0003\u0000\u0000\u02de\u02df\u0007\u0003\u0000\u0000"+
		"\u02dfa\u0001\u0000\u0000\u0000\u02e0\u02e1\u0005:\u0000\u0000\u02e1\u02e2"+
		"\u0005\u0003\u0000\u0000\u02e2\u02e3\u0007\u0003\u0000\u0000\u02e3c\u0001"+
		"\u0000\u0000\u0000\u02e4\u02e5\u0005D\u0000\u0000\u02e5\u02e6\u0005\u0003"+
		"\u0000\u0000\u02e6\u02e7\u0005q\u0000\u0000\u02e7e\u0001\u0000\u0000\u0000"+
		"\u02e8\u02e9\u0005,\u0000\u0000\u02e9\u02ea\u0005\u0003\u0000\u0000\u02ea"+
		"\u02eb\u0003\n\u0005\u0000\u02ebg\u0001\u0000\u0000\u0000\u02ec\u02ed"+
		"\u0005*\u0000\u0000\u02ed\u02ee\u0005\u0003\u0000\u0000\u02ee\u02fa\u0005"+
		"\u0004\u0000\u0000\u02ef\u02f4\u0003\n\u0005\u0000\u02f0\u02f1\u0005\t"+
		"\u0000\u0000\u02f1\u02f3\u0003\n\u0005\u0000\u02f2\u02f0\u0001\u0000\u0000"+
		"\u0000\u02f3\u02f6\u0001\u0000\u0000\u0000\u02f4\u02f2\u0001\u0000\u0000"+
		"\u0000\u02f4\u02f5\u0001\u0000\u0000\u0000\u02f5\u02f8\u0001\u0000\u0000"+
		"\u0000\u02f6\u02f4\u0001\u0000\u0000\u0000\u02f7\u02f9\u0005\t\u0000\u0000"+
		"\u02f8\u02f7\u0001\u0000\u0000\u0000\u02f8\u02f9\u0001\u0000\u0000\u0000"+
		"\u02f9\u02fb\u0001\u0000\u0000\u0000\u02fa\u02ef\u0001\u0000\u0000\u0000"+
		"\u02fa\u02fb\u0001\u0000\u0000\u0000\u02fb\u02fc\u0001\u0000\u0000\u0000"+
		"\u02fc\u02fd\u0005\u0005\u0000\u0000\u02fdi\u0001\u0000\u0000\u0000\u02fe"+
		"\u02ff\u0005>\u0000\u0000\u02ff\u0300\u0005\u0003\u0000\u0000\u0300\u0301"+
		"\u0007\t\u0000\u0000\u0301k\u0001\u0000\u0000\u0000\u0302\u0303\u0005"+
		"A\u0000\u0000\u0303\u0304\u0005\u0003\u0000\u0000\u0304\u0305\u0007\n"+
		"\u0000\u0000\u0305m\u0001\u0000\u0000\u0000\u0306\u0307\u0005W\u0000\u0000"+
		"\u0307\u0308\u0005\u0003\u0000\u0000\u0308\u030d\u0005\u0001\u0000\u0000"+
		"\u0309\u030a\u0005l\u0000\u0000\u030a\u030c\u0005\t\u0000\u0000\u030b"+
		"\u0309\u0001\u0000\u0000\u0000\u030c\u030f\u0001\u0000\u0000\u0000\u030d"+
		"\u030b\u0001\u0000\u0000\u0000\u030d\u030e\u0001\u0000\u0000\u0000\u030e"+
		"\u0310\u0001\u0000\u0000\u0000\u030f\u030d\u0001\u0000\u0000\u0000\u0310"+
		"\u0311\u0005\u0002\u0000\u0000\u0311\u0315\u0005\u0006\u0000\u0000\u0312"+
		"\u0314\u0003X,\u0000\u0313\u0312\u0001\u0000\u0000\u0000\u0314\u0317\u0001"+
		"\u0000\u0000\u0000\u0315\u0313\u0001\u0000\u0000\u0000\u0315\u0316\u0001"+
		"\u0000\u0000\u0000\u0316\u0318\u0001\u0000\u0000\u0000\u0317\u0315\u0001"+
		"\u0000\u0000\u0000\u0318\u0319\u0005\u0007\u0000\u0000\u0319o\u0001\u0000"+
		"\u0000\u0000\u031a\u031f\u0003r9\u0000\u031b\u031c\u0005\t\u0000\u0000"+
		"\u031c\u031e\u0003r9\u0000\u031d\u031b\u0001\u0000\u0000\u0000\u031e\u0321"+
		"\u0001\u0000\u0000\u0000\u031f\u031d\u0001\u0000\u0000\u0000\u031f\u0320"+
		"\u0001\u0000\u0000\u0000\u0320q\u0001\u0000\u0000\u0000\u0321\u031f\u0001"+
		"\u0000\u0000\u0000\u0322\u0323\u0003t:\u0000\u0323s\u0001\u0000\u0000"+
		"\u0000\u0324\u0329\u0003v;\u0000\u0325\u0326\u0005\u0013\u0000\u0000\u0326"+
		"\u0328\u0003v;\u0000\u0327\u0325\u0001\u0000\u0000\u0000\u0328\u032b\u0001"+
		"\u0000\u0000\u0000\u0329\u0327\u0001\u0000\u0000\u0000\u0329\u032a\u0001"+
		"\u0000\u0000\u0000\u032au\u0001\u0000\u0000\u0000\u032b\u0329\u0001\u0000"+
		"\u0000\u0000\u032c\u0331\u0003x<\u0000\u032d\u032e\u0005\u0014\u0000\u0000"+
		"\u032e\u0330\u0003x<\u0000\u032f\u032d\u0001\u0000\u0000\u0000\u0330\u0333"+
		"\u0001\u0000\u0000\u0000\u0331\u032f\u0001\u0000\u0000\u0000\u0331\u0332"+
		"\u0001\u0000\u0000\u0000\u0332w\u0001\u0000\u0000\u0000\u0333\u0331\u0001"+
		"\u0000\u0000\u0000\u0334\u0337\u0003z=\u0000\u0335\u0336\u0007\u000b\u0000"+
		"\u0000\u0336\u0338\u0003z=\u0000\u0337\u0335\u0001\u0000\u0000\u0000\u0337"+
		"\u0338\u0001\u0000\u0000\u0000\u0338y\u0001\u0000\u0000\u0000\u0339\u033c"+
		"\u0003|>\u0000\u033a\u033b\u0007\f\u0000\u0000\u033b\u033d\u0003|>\u0000"+
		"\u033c\u033a\u0001\u0000\u0000\u0000\u033c\u033d\u0001\u0000\u0000\u0000"+
		"\u033d{\u0001\u0000\u0000\u0000\u033e\u0343\u0003~?\u0000\u033f\u0340"+
		"\u0007\r\u0000\u0000\u0340\u0342\u0003~?\u0000\u0341\u033f\u0001\u0000"+
		"\u0000\u0000\u0342\u0345\u0001\u0000\u0000\u0000\u0343\u0341\u0001\u0000"+
		"\u0000\u0000\u0343\u0344\u0001\u0000\u0000\u0000\u0344}\u0001\u0000\u0000"+
		"\u0000\u0345\u0343\u0001\u0000\u0000\u0000\u0346\u034b\u0003\u0080@\u0000"+
		"\u0347\u0348\u0007\u000e\u0000\u0000\u0348\u034a\u0003\u0080@\u0000\u0349"+
		"\u0347\u0001\u0000\u0000\u0000\u034a\u034d\u0001\u0000\u0000\u0000\u034b"+
		"\u0349\u0001\u0000\u0000\u0000\u034b\u034c\u0001\u0000\u0000\u0000\u034c"+
		"\u007f\u0001\u0000\u0000\u0000\u034d\u034b\u0001\u0000\u0000\u0000\u034e"+
		"\u034f\u0005\u0001\u0000\u0000\u034f\u0350\u0003r9\u0000\u0350\u0351\u0005"+
		"\u0002\u0000\u0000\u0351\u0359\u0001\u0000\u0000\u0000\u0352\u0359\u0003"+
		"\u0082A\u0000\u0353\u0359\u0005l\u0000\u0000\u0354\u0356\u0005\u0012\u0000"+
		"\u0000\u0355\u0354\u0001\u0000\u0000\u0000\u0355\u0356\u0001\u0000\u0000"+
		"\u0000\u0356\u0357\u0001\u0000\u0000\u0000\u0357\u0359\u0003\u0084B\u0000"+
		"\u0358\u034e\u0001\u0000\u0000\u0000\u0358\u0352\u0001\u0000\u0000\u0000"+
		"\u0358\u0353\u0001\u0000\u0000\u0000\u0358\u0355\u0001\u0000\u0000\u0000"+
		"\u0359\u0081\u0001\u0000\u0000\u0000\u035a\u035b\u0007\u000f\u0000\u0000"+
		"\u035b\u0083\u0001\u0000\u0000\u0000\u035c\u035d\u0007\u0010\u0000\u0000"+
		"\u035d\u0085\u0001\u0000\u0000\u0000d\u0089\u008d\u0098\u009c\u009e\u00a8"+
		"\u00b1\u00b5\u00b7\u00c1\u00cf\u00d8\u00dc\u00de\u00ed\u00f1\u00f3\u00fa"+
		"\u0103\u0107\u0109\u0116\u011a\u011c\u0123\u012c\u0130\u0132\u0145\u014e"+
		"\u0152\u0154\u015f\u016c\u0170\u0172\u0178\u0180\u0186\u0188\u0193\u0197"+
		"\u0199\u01ad\u01b6\u01ba\u01bc\u01c4\u01cd\u01d1\u01d3\u01e0\u01e4\u01e6"+
		"\u01ee\u01f7\u01fb\u01fd\u0207\u020b\u020d\u0210\u021e\u0226\u022f\u0233"+
		"\u0235\u0241\u024a\u024e\u0250\u0260\u0269\u026d\u026f\u028c\u0294\u0298"+
		"\u02a1\u02a5\u02a7\u02b0\u02b5\u02c0\u02c6\u02d3\u02f4\u02f8\u02fa\u030d"+
		"\u0315\u031f\u0329\u0331\u0337\u033c\u0343\u034b\u0355\u0358";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}