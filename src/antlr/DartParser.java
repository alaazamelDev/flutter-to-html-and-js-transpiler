// Generated from C:/Users/anasr/Desktop/state/compilerproject/src/grammars\DartParser.g4 by ANTLR 4.10.1
package antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DartParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

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
		RULE_container = 16, RULE_containerProperties = 17, RULE_decorationProperty = 18, 
		RULE_boxDecoration = 19, RULE_boxDecorationProperties = 20, RULE_borderRadiusProperty = 21, 
		RULE_borderRadius = 22, RULE_borderRadiusCircular = 23, RULE_borderRadiusOnly = 24, 
		RULE_borderRadiusCircularProperties = 25, RULE_borderRadiusOnlyProperties = 26, 
		RULE_expanded = 27, RULE_expandedProperties = 28, RULE_gestureDetector = 29, 
		RULE_gestureDetectorProperties = 30, RULE_onFunction = 31, RULE_padding = 32, 
		RULE_paddingProprtey = 33, RULE_edgeInsets = 34, RULE_edgeInsetsOnlyProperties = 35, 
		RULE_edgeInsetsSymetricProperties = 36, RULE_image = 37, RULE_imageProperties = 38, 
		RULE_button = 39, RULE_buttonProperties = 40, RULE_textField = 41, RULE_textFieldProperties = 42, 
		RULE_border = 43, RULE_borderProperties = 44, RULE_statment = 45, RULE_variableDeclaration = 46, 
		RULE_variableAssignment = 47, RULE_customWidgetDeclaration = 48, RULE_widthProperty = 49, 
		RULE_heightProperty = 50, RULE_colorProperty = 51, RULE_childProperty = 52, 
		RULE_childrenProperty = 53, RULE_mainAxisSizeProperty = 54, RULE_crossAxisAlignmentProperty = 55;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "scaffold", "scaffoldProperty", "appBar", "appBarProperties", 
			"widget", "customWidget", "customWidgetProperties", "row", "rowProperties", 
			"center", "centerProperties", "column", "columnProperties", "text", "textProperties", 
			"container", "containerProperties", "decorationProperty", "boxDecoration", 
			"boxDecorationProperties", "borderRadiusProperty", "borderRadius", "borderRadiusCircular", 
			"borderRadiusOnly", "borderRadiusCircularProperties", "borderRadiusOnlyProperties", 
			"expanded", "expandedProperties", "gestureDetector", "gestureDetectorProperties", 
			"onFunction", "padding", "paddingProprtey", "edgeInsets", "edgeInsetsOnlyProperties", 
			"edgeInsetsSymetricProperties", "image", "imageProperties", "button", 
			"buttonProperties", "textField", "textFieldProperties", "border", "borderProperties", 
			"statment", "variableDeclaration", "variableAssignment", "customWidgetDeclaration", 
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
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WIDGET) | (1L << INT) | (1L << STRINGTYPE) | (1L << DOUBLE) | (1L << FUNCTION))) != 0) || _la==IDENTIFIER) {
				{
				{
				setState(112);
				statment();
				}
				}
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SCAFFOLD) {
				{
				setState(118);
				scaffold();
				}
			}

			setState(121);
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
			setState(123);
			match(SCAFFOLD);
			setState(124);
			match(LP);
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BODY || _la==APPBARATRIB) {
				{
				setState(125);
				scaffoldProperty();
				setState(130);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(126);
						match(COMMA);
						setState(127);
						scaffoldProperty();
						}
						} 
					}
					setState(132);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				}
				setState(134);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(133);
					match(COMMA);
					}
				}

				}
			}

			setState(138);
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
			setState(146);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BODY:
				_localctx = new ScaffoldBodyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(140);
				match(BODY);
				setState(141);
				match(COLON);
				setState(142);
				widget();
				}
				break;
			case APPBARATRIB:
				_localctx = new ScaffoldAppBarContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(143);
				match(APPBARATRIB);
				setState(144);
				match(COLON);
				setState(145);
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
			setState(148);
			match(APPBAR);
			setState(149);
			match(LP);
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TITLE || _la==CENTERTITLE) {
				{
				setState(150);
				appBarProperties();
				setState(155);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(151);
						match(COMMA);
						setState(152);
						appBarProperties();
						}
						} 
					}
					setState(157);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				}
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(158);
					match(COMMA);
					}
				}

				}
			}

			setState(163);
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
	public static class AppBarTitleContext extends AppBarPropertiesContext {
		public TerminalNode TITLE() { return getToken(DartParser.TITLE, 0); }
		public TerminalNode COLON() { return getToken(DartParser.COLON, 0); }
		public TerminalNode STRING() { return getToken(DartParser.STRING, 0); }
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
		try {
			setState(171);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TITLE:
				_localctx = new AppBarTitleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(165);
				match(TITLE);
				setState(166);
				match(COLON);
				setState(167);
				match(STRING);
				}
				break;
			case CENTERTITLE:
				_localctx = new AppBarCenterTitleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(168);
				match(CENTERTITLE);
				setState(169);
				match(COLON);
				setState(170);
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
			setState(185);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ROW:
				enterOuterAlt(_localctx, 1);
				{
				setState(173);
				row();
				}
				break;
			case CENTER:
				enterOuterAlt(_localctx, 2);
				{
				setState(174);
				center();
				}
				break;
			case TEXT:
				enterOuterAlt(_localctx, 3);
				{
				setState(175);
				text();
				}
				break;
			case CONTAINER:
				enterOuterAlt(_localctx, 4);
				{
				setState(176);
				container();
				}
				break;
			case EXPANDED:
				enterOuterAlt(_localctx, 5);
				{
				setState(177);
				expanded();
				}
				break;
			case COLUMN:
				enterOuterAlt(_localctx, 6);
				{
				setState(178);
				column();
				}
				break;
			case GESTUREDETECTOR:
				enterOuterAlt(_localctx, 7);
				{
				setState(179);
				gestureDetector();
				}
				break;
			case PADDING:
				enterOuterAlt(_localctx, 8);
				{
				setState(180);
				padding();
				}
				break;
			case IMAGE:
				enterOuterAlt(_localctx, 9);
				{
				setState(181);
				image();
				}
				break;
			case BUTTON:
				enterOuterAlt(_localctx, 10);
				{
				setState(182);
				button();
				}
				break;
			case WIDGETNAME:
				enterOuterAlt(_localctx, 11);
				{
				setState(183);
				customWidget();
				}
				break;
			case TEXTFIELD:
				enterOuterAlt(_localctx, 12);
				{
				setState(184);
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
			setState(187);
			match(WIDGETNAME);
			setState(188);
			match(LP);
			setState(200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(189);
				customWidgetProperties();
				setState(194);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(190);
						match(COMMA);
						setState(191);
						customWidgetProperties();
						}
						} 
					}
					setState(196);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				}
				setState(198);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(197);
					match(COMMA);
					}
				}

				}
			}

			setState(202);
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
			setState(204);
			match(IDENTIFIER);
			setState(205);
			match(COLON);
			setState(206);
			_la = _input.LA(1);
			if ( !(((((_la - 98)) & ~0x3f) == 0 && ((1L << (_la - 98)) & ((1L << (FLOAT - 98)) | (1L << (NUM - 98)) | (1L << (STRING - 98)))) != 0)) ) {
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
			setState(208);
			match(ROW);
			setState(209);
			match(LP);
			setState(221);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CHILDREN) | (1L << MAINAXISSIZE) | (1L << CROSSAXISALIGNMENT))) != 0)) {
				{
				setState(210);
				rowProperties();
				setState(215);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(211);
						match(COMMA);
						setState(212);
						rowProperties();
						}
						} 
					}
					setState(217);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				}
				setState(219);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(218);
					match(COMMA);
					}
				}

				}
			}

			setState(223);
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
			setState(228);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHILDREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(225);
				childrenProperty();
				}
				break;
			case MAINAXISSIZE:
				enterOuterAlt(_localctx, 2);
				{
				setState(226);
				mainAxisSizeProperty();
				}
				break;
			case CROSSAXISALIGNMENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(227);
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
			setState(230);
			match(CENTER);
			setState(231);
			match(LP);
			setState(243);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CHILD) {
				{
				setState(232);
				centerProperties();
				setState(237);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(233);
						match(COMMA);
						setState(234);
						centerProperties();
						}
						} 
					}
					setState(239);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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
			setState(247);
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
			setState(249);
			match(COLUMN);
			setState(250);
			match(LP);
			setState(262);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CHILDREN) | (1L << MAINAXISSIZE) | (1L << CROSSAXISALIGNMENT))) != 0)) {
				{
				setState(251);
				columnProperties();
				setState(256);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(252);
						match(COMMA);
						setState(253);
						columnProperties();
						}
						} 
					}
					setState(258);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				}
				setState(260);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(259);
					match(COMMA);
					}
				}

				}
			}

			setState(264);
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
			setState(269);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHILDREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(266);
				childrenProperty();
				}
				break;
			case MAINAXISSIZE:
				enterOuterAlt(_localctx, 2);
				{
				setState(267);
				mainAxisSizeProperty();
				}
				break;
			case CROSSAXISALIGNMENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(268);
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
			setState(271);
			match(TEXT);
			setState(272);
			match(LP);
			setState(284);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 39)) & ~0x3f) == 0 && ((1L << (_la - 39)) & ((1L << (TEXTATRIB - 39)) | (1L << (FONTWEIGHT - 39)) | (1L << (FONTSIZE - 39)) | (1L << (LETTERSPACING - 39)) | (1L << (TEXTALIGN - 39)))) != 0)) {
				{
				setState(273);
				textProperties();
				setState(278);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(274);
						match(COMMA);
						setState(275);
						textProperties();
						}
						} 
					}
					setState(280);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
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
	public static class TextFontSizeContext extends TextPropertiesContext {
		public TerminalNode FONTSIZE() { return getToken(DartParser.FONTSIZE, 0); }
		public TerminalNode COLON() { return getToken(DartParser.COLON, 0); }
		public TerminalNode NUM() { return getToken(DartParser.NUM, 0); }
		public TerminalNode FLOAT() { return getToken(DartParser.FLOAT, 0); }
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
	public static class TextLetterSpacingContext extends TextPropertiesContext {
		public TerminalNode LETTERSPACING() { return getToken(DartParser.LETTERSPACING, 0); }
		public TerminalNode COLON() { return getToken(DartParser.COLON, 0); }
		public TerminalNode NUM() { return getToken(DartParser.NUM, 0); }
		public TerminalNode FLOAT() { return getToken(DartParser.FLOAT, 0); }
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
	public static class TextContentContext extends TextPropertiesContext {
		public TerminalNode TEXTATRIB() { return getToken(DartParser.TEXTATRIB, 0); }
		public TerminalNode COLON() { return getToken(DartParser.COLON, 0); }
		public TerminalNode STRING() { return getToken(DartParser.STRING, 0); }
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
			setState(303);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TEXTATRIB:
				_localctx = new TextContentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(288);
				match(TEXTATRIB);
				setState(289);
				match(COLON);
				setState(290);
				match(STRING);
				}
				break;
			case FONTWEIGHT:
				_localctx = new TextFontWeightContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(291);
				match(FONTWEIGHT);
				setState(292);
				match(COLON);
				setState(293);
				_la = _input.LA(1);
				if ( !(((((_la - 44)) & ~0x3f) == 0 && ((1L << (_la - 44)) & ((1L << (BOLD - 44)) | (1L << (LIGHT - 44)) | (1L << (SEMIBOLD - 44)) | (1L << (MEDIUM - 44)))) != 0)) ) {
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
				setState(294);
				match(FONTSIZE);
				setState(295);
				match(COLON);
				setState(296);
				_la = _input.LA(1);
				if ( !(_la==FLOAT || _la==NUM) ) {
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
				setState(297);
				match(LETTERSPACING);
				setState(298);
				match(COLON);
				setState(299);
				_la = _input.LA(1);
				if ( !(_la==FLOAT || _la==NUM) ) {
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
				setState(300);
				match(TEXTALIGN);
				setState(301);
				match(COLON);
				setState(302);
				_la = _input.LA(1);
				if ( !(((((_la - 48)) & ~0x3f) == 0 && ((1L << (_la - 48)) & ((1L << (CENTERVALUE - 48)) | (1L << (START_ATTR - 48)) | (1L << (END_ATTR - 48)) | (1L << (JUSTIFY_ATTR - 48)))) != 0)) ) {
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
			setState(305);
			match(CONTAINER);
			setState(306);
			match(LP);
			setState(318);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CHILD) | (1L << WIDTH) | (1L << HEIGHT) | (1L << CONTENTALIGNMENT) | (1L << DECORATION))) != 0)) {
				{
				setState(307);
				containerProperties();
				setState(312);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(308);
						match(COMMA);
						setState(309);
						containerProperties();
						}
						} 
					}
					setState(314);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
				}
				setState(316);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(315);
					match(COMMA);
					}
				}

				}
			}

			setState(320);
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
			setState(329);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WIDTH:
				_localctx = new ContainerWidthContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(322);
				widthProperty();
				}
				break;
			case HEIGHT:
				_localctx = new ContainerHeightContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(323);
				heightProperty();
				}
				break;
			case CONTENTALIGNMENT:
				_localctx = new ContainerContentAlignmentContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(324);
				match(CONTENTALIGNMENT);
				setState(325);
				match(COLON);
				setState(326);
				_la = _input.LA(1);
				if ( !(((((_la - 48)) & ~0x3f) == 0 && ((1L << (_la - 48)) & ((1L << (CENTERVALUE - 48)) | (1L << (LEFT - 48)) | (1L << (RIGHT - 48)))) != 0)) ) {
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
				setState(327);
				childProperty();
				}
				break;
			case DECORATION:
				_localctx = new ContainerDecorationContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(328);
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
			setState(331);
			match(DECORATION);
			setState(332);
			match(COLON);
			setState(333);
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
			setState(335);
			match(BOXDECORATION);
			setState(336);
			match(LP);
			setState(348);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLOR || _la==BORDERRADIUS) {
				{
				setState(337);
				boxDecorationProperties();
				setState(342);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(338);
						match(COMMA);
						setState(339);
						boxDecorationProperties();
						}
						} 
					}
					setState(344);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
				}
				setState(346);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(345);
					match(COMMA);
					}
				}

				}
			}

			setState(350);
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
			setState(354);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COLOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(352);
				colorProperty();
				}
				break;
			case BORDERRADIUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(353);
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
			setState(356);
			match(BORDERRADIUS);
			setState(357);
			match(COLON);
			setState(358);
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
			setState(362);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BORDERRADIUSONLY:
				enterOuterAlt(_localctx, 1);
				{
				setState(360);
				borderRadiusOnly();
				}
				break;
			case BORDERRADIUSCIRCULAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(361);
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
			setState(364);
			match(BORDERRADIUSCIRCULAR);
			setState(365);
			match(LP);
			setState(366);
			borderRadiusCircularProperties();
			setState(368);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(367);
				match(COMMA);
				}
			}

			setState(370);
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
			setState(372);
			match(BORDERRADIUSONLY);
			setState(373);
			match(LP);
			setState(385);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TOPRIGHT) | (1L << TOPLEFT) | (1L << BOTTOMRIGHT) | (1L << BOTTOMLEFT))) != 0)) {
				{
				setState(374);
				borderRadiusOnlyProperties();
				setState(379);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(375);
						match(COMMA);
						setState(376);
						borderRadiusOnlyProperties();
						}
						} 
					}
					setState(381);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
				}
				setState(383);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(382);
					match(COMMA);
					}
				}

				}
			}

			setState(387);
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

	public static class BorderRadiusCircularPropertiesContext extends ParserRuleContext {
		public TerminalNode RADIUS() { return getToken(DartParser.RADIUS, 0); }
		public TerminalNode COLON() { return getToken(DartParser.COLON, 0); }
		public TerminalNode NUM() { return getToken(DartParser.NUM, 0); }
		public TerminalNode FLOAT() { return getToken(DartParser.FLOAT, 0); }
		public BorderRadiusCircularPropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_borderRadiusCircularProperties; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterBorderRadiusCircularProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitBorderRadiusCircularProperties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitBorderRadiusCircularProperties(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BorderRadiusCircularPropertiesContext borderRadiusCircularProperties() throws RecognitionException {
		BorderRadiusCircularPropertiesContext _localctx = new BorderRadiusCircularPropertiesContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_borderRadiusCircularProperties);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(389);
			match(RADIUS);
			setState(390);
			match(COLON);
			setState(391);
			_la = _input.LA(1);
			if ( !(_la==FLOAT || _la==NUM) ) {
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
	public static class BorderRadiusOnlyTopLeftContext extends BorderRadiusOnlyPropertiesContext {
		public TerminalNode TOPLEFT() { return getToken(DartParser.TOPLEFT, 0); }
		public TerminalNode COLON() { return getToken(DartParser.COLON, 0); }
		public TerminalNode NUM() { return getToken(DartParser.NUM, 0); }
		public TerminalNode FLOAT() { return getToken(DartParser.FLOAT, 0); }
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
	public static class BorderRadiusOnlyBottomRightContext extends BorderRadiusOnlyPropertiesContext {
		public TerminalNode BOTTOMRIGHT() { return getToken(DartParser.BOTTOMRIGHT, 0); }
		public TerminalNode COLON() { return getToken(DartParser.COLON, 0); }
		public TerminalNode NUM() { return getToken(DartParser.NUM, 0); }
		public TerminalNode FLOAT() { return getToken(DartParser.FLOAT, 0); }
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
	public static class BorderRadiusOnlyTopRightContext extends BorderRadiusOnlyPropertiesContext {
		public TerminalNode TOPRIGHT() { return getToken(DartParser.TOPRIGHT, 0); }
		public TerminalNode COLON() { return getToken(DartParser.COLON, 0); }
		public TerminalNode NUM() { return getToken(DartParser.NUM, 0); }
		public TerminalNode FLOAT() { return getToken(DartParser.FLOAT, 0); }
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
	public static class BorderRadiusOnlyBottomLeftContext extends BorderRadiusOnlyPropertiesContext {
		public TerminalNode BOTTOMLEFT() { return getToken(DartParser.BOTTOMLEFT, 0); }
		public TerminalNode COLON() { return getToken(DartParser.COLON, 0); }
		public TerminalNode NUM() { return getToken(DartParser.NUM, 0); }
		public TerminalNode FLOAT() { return getToken(DartParser.FLOAT, 0); }
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
			setState(405);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TOPRIGHT:
				_localctx = new BorderRadiusOnlyTopRightContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(393);
				match(TOPRIGHT);
				setState(394);
				match(COLON);
				setState(395);
				_la = _input.LA(1);
				if ( !(_la==FLOAT || _la==NUM) ) {
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
				setState(396);
				match(TOPLEFT);
				setState(397);
				match(COLON);
				setState(398);
				_la = _input.LA(1);
				if ( !(_la==FLOAT || _la==NUM) ) {
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
				setState(399);
				match(BOTTOMRIGHT);
				setState(400);
				match(COLON);
				setState(401);
				_la = _input.LA(1);
				if ( !(_la==FLOAT || _la==NUM) ) {
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
				setState(402);
				match(BOTTOMLEFT);
				setState(403);
				match(COLON);
				setState(404);
				_la = _input.LA(1);
				if ( !(_la==FLOAT || _la==NUM) ) {
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
			setState(407);
			match(EXPANDED);
			setState(408);
			match(LP);
			setState(420);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CHILD || _la==FLEX) {
				{
				setState(409);
				expandedProperties();
				setState(414);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(410);
						match(COMMA);
						setState(411);
						expandedProperties();
						}
						} 
					}
					setState(416);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
				}
				setState(418);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(417);
					match(COMMA);
					}
				}

				}
			}

			setState(422);
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
	public static class ExpandedFlexContext extends ExpandedPropertiesContext {
		public TerminalNode FLEX() { return getToken(DartParser.FLEX, 0); }
		public TerminalNode COLON() { return getToken(DartParser.COLON, 0); }
		public TerminalNode NUM() { return getToken(DartParser.NUM, 0); }
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
		try {
			setState(428);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FLEX:
				_localctx = new ExpandedFlexContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(424);
				match(FLEX);
				setState(425);
				match(COLON);
				setState(426);
				match(NUM);
				}
				break;
			case CHILD:
				_localctx = new ExpandedChildContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(427);
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
			setState(430);
			match(GESTUREDETECTOR);
			setState(431);
			match(LP);
			setState(443);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ONPRESSED) {
				{
				setState(432);
				gestureDetectorProperties();
				setState(437);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(433);
						match(COMMA);
						setState(434);
						gestureDetectorProperties();
						}
						} 
					}
					setState(439);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
				}
				setState(441);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(440);
					match(COMMA);
					}
				}

				}
			}

			setState(445);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterGestureDetectorProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitGestureDetectorProperties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitGestureDetectorProperties(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GestureDetectorPropertiesContext gestureDetectorProperties() throws RecognitionException {
		GestureDetectorPropertiesContext _localctx = new GestureDetectorPropertiesContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_gestureDetectorProperties);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(447);
			match(ONPRESSED);
			setState(448);
			match(COLON);
			setState(449);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterOnFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitOnFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitOnFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OnFunctionContext onFunction() throws RecognitionException {
		OnFunctionContext _localctx = new OnFunctionContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_onFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(451);
			match(LP);
			setState(456);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(452);
				match(IDENTIFIER);
				setState(453);
				match(COMMA);
				}
				}
				setState(458);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(459);
			match(RP);
			setState(460);
			match(OB);
			setState(464);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WIDGET) | (1L << INT) | (1L << STRINGTYPE) | (1L << DOUBLE) | (1L << FUNCTION))) != 0) || _la==IDENTIFIER) {
				{
				{
				setState(461);
				statment();
				}
				}
				setState(466);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(467);
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
		enterRule(_localctx, 64, RULE_padding);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(469);
			match(PADDING);
			setState(470);
			match(LP);
			setState(482);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CHILD || _la==PADDINGATTR) {
				{
				setState(471);
				paddingProprtey();
				setState(476);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(472);
						match(COMMA);
						setState(473);
						paddingProprtey();
						}
						} 
					}
					setState(478);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
				}
				setState(480);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(479);
					match(COMMA);
					}
				}

				}
			}

			setState(484);
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
		enterRule(_localctx, 66, RULE_paddingProprtey);
		try {
			setState(490);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PADDINGATTR:
				_localctx = new PaddingPaddingContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(486);
				match(PADDINGATTR);
				setState(487);
				match(COLON);
				setState(488);
				edgeInsets();
				}
				break;
			case CHILD:
				_localctx = new PaddingChildContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(489);
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
		enterRule(_localctx, 68, RULE_edgeInsets);
		int _la;
		try {
			int _alt;
			setState(524);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EDGE_INSETS_ONLY:
				_localctx = new EdgeInsetsOnlyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(492);
				match(EDGE_INSETS_ONLY);
				setState(493);
				match(LP);
				setState(505);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 92)) & ~0x3f) == 0 && ((1L << (_la - 92)) & ((1L << (TOP - 92)) | (1L << (LEFT - 92)) | (1L << (BOTTOM - 92)) | (1L << (RIGHT - 92)))) != 0)) {
					{
					setState(494);
					edgeInsetsOnlyProperties();
					setState(499);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(495);
							match(COMMA);
							setState(496);
							edgeInsetsOnlyProperties();
							}
							} 
						}
						setState(501);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
					}
					setState(503);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(502);
						match(COMMA);
						}
					}

					}
				}

				setState(507);
				match(RP);
				}
				break;
			case EDGE_INSETS_SYMMETRIC:
				_localctx = new EdgeInsetsSymetricContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(508);
				match(EDGE_INSETS_SYMMETRIC);
				setState(509);
				match(LP);
				setState(521);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==HORIZONTAL || _la==VERTICAL) {
					{
					setState(510);
					edgeInsetsSymetricProperties();
					setState(515);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(511);
							match(COMMA);
							setState(512);
							edgeInsetsSymetricProperties();
							}
							} 
						}
						setState(517);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
					}
					setState(519);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(518);
						match(COMMA);
						}
					}

					}
				}

				setState(523);
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
	public static class EdgeInsetsOnlyRightContext extends EdgeInsetsOnlyPropertiesContext {
		public TerminalNode RIGHT() { return getToken(DartParser.RIGHT, 0); }
		public TerminalNode COLON() { return getToken(DartParser.COLON, 0); }
		public TerminalNode NUM() { return getToken(DartParser.NUM, 0); }
		public TerminalNode FLOAT() { return getToken(DartParser.FLOAT, 0); }
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
	public static class EdgeInsetsOnlyBottomContext extends EdgeInsetsOnlyPropertiesContext {
		public TerminalNode BOTTOM() { return getToken(DartParser.BOTTOM, 0); }
		public TerminalNode COLON() { return getToken(DartParser.COLON, 0); }
		public TerminalNode NUM() { return getToken(DartParser.NUM, 0); }
		public TerminalNode FLOAT() { return getToken(DartParser.FLOAT, 0); }
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
	public static class EdgeInsetsOnlyTopContext extends EdgeInsetsOnlyPropertiesContext {
		public TerminalNode TOP() { return getToken(DartParser.TOP, 0); }
		public TerminalNode COLON() { return getToken(DartParser.COLON, 0); }
		public TerminalNode NUM() { return getToken(DartParser.NUM, 0); }
		public TerminalNode FLOAT() { return getToken(DartParser.FLOAT, 0); }
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
	public static class EdgeInsetsOnlyLeftContext extends EdgeInsetsOnlyPropertiesContext {
		public TerminalNode LEFT() { return getToken(DartParser.LEFT, 0); }
		public TerminalNode COLON() { return getToken(DartParser.COLON, 0); }
		public TerminalNode NUM() { return getToken(DartParser.NUM, 0); }
		public TerminalNode FLOAT() { return getToken(DartParser.FLOAT, 0); }
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
		enterRule(_localctx, 70, RULE_edgeInsetsOnlyProperties);
		int _la;
		try {
			setState(538);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TOP:
				_localctx = new EdgeInsetsOnlyTopContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(526);
				match(TOP);
				setState(527);
				match(COLON);
				setState(528);
				_la = _input.LA(1);
				if ( !(_la==FLOAT || _la==NUM) ) {
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
				setState(529);
				match(LEFT);
				setState(530);
				match(COLON);
				setState(531);
				_la = _input.LA(1);
				if ( !(_la==FLOAT || _la==NUM) ) {
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
				setState(532);
				match(RIGHT);
				setState(533);
				match(COLON);
				setState(534);
				_la = _input.LA(1);
				if ( !(_la==FLOAT || _la==NUM) ) {
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
				setState(535);
				match(BOTTOM);
				setState(536);
				match(COLON);
				setState(537);
				_la = _input.LA(1);
				if ( !(_la==FLOAT || _la==NUM) ) {
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
	public static class EdgeInsetsSymetricHorizontalContext extends EdgeInsetsSymetricPropertiesContext {
		public TerminalNode HORIZONTAL() { return getToken(DartParser.HORIZONTAL, 0); }
		public TerminalNode COLON() { return getToken(DartParser.COLON, 0); }
		public TerminalNode NUM() { return getToken(DartParser.NUM, 0); }
		public TerminalNode FLOAT() { return getToken(DartParser.FLOAT, 0); }
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
	public static class EdgeInsetsSymetricVerticalContext extends EdgeInsetsSymetricPropertiesContext {
		public TerminalNode VERTICAL() { return getToken(DartParser.VERTICAL, 0); }
		public TerminalNode COLON() { return getToken(DartParser.COLON, 0); }
		public TerminalNode NUM() { return getToken(DartParser.NUM, 0); }
		public TerminalNode FLOAT() { return getToken(DartParser.FLOAT, 0); }
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
		enterRule(_localctx, 72, RULE_edgeInsetsSymetricProperties);
		int _la;
		try {
			setState(546);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HORIZONTAL:
				_localctx = new EdgeInsetsSymetricHorizontalContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(540);
				match(HORIZONTAL);
				setState(541);
				match(COLON);
				setState(542);
				_la = _input.LA(1);
				if ( !(_la==FLOAT || _la==NUM) ) {
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
				setState(543);
				match(VERTICAL);
				setState(544);
				match(COLON);
				setState(545);
				_la = _input.LA(1);
				if ( !(_la==FLOAT || _la==NUM) ) {
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
		enterRule(_localctx, 74, RULE_image);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(548);
			match(IMAGE);
			setState(549);
			match(LP);
			setState(561);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 45)) & ~0x3f) == 0 && ((1L << (_la - 45)) & ((1L << (WIDTH - 45)) | (1L << (HEIGHT - 45)) | (1L << (FIT - 45)) | (1L << (URL - 45)))) != 0)) {
				{
				setState(550);
				imageProperties();
				setState(555);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(551);
						match(COMMA);
						setState(552);
						imageProperties();
						}
						} 
					}
					setState(557);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
				}
				setState(559);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(558);
					match(COMMA);
					}
				}

				}
			}

			setState(563);
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
	public static class ImageUrlContext extends ImagePropertiesContext {
		public TerminalNode URL() { return getToken(DartParser.URL, 0); }
		public TerminalNode COLON() { return getToken(DartParser.COLON, 0); }
		public TerminalNode STRING() { return getToken(DartParser.STRING, 0); }
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
		enterRule(_localctx, 76, RULE_imageProperties);
		int _la;
		try {
			setState(573);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case URL:
				_localctx = new ImageUrlContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(565);
				match(URL);
				setState(566);
				match(COLON);
				setState(567);
				match(STRING);
				}
				break;
			case FIT:
				_localctx = new ImageFitContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(568);
				match(FIT);
				setState(569);
				match(COLON);
				setState(570);
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
				setState(571);
				widthProperty();
				}
				break;
			case HEIGHT:
				_localctx = new ImageHeightContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(572);
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
		enterRule(_localctx, 78, RULE_button);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(575);
			match(BUTTON);
			setState(576);
			match(LP);
			setState(588);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 45)) & ~0x3f) == 0 && ((1L << (_la - 45)) & ((1L << (WIDTH - 45)) | (1L << (HEIGHT - 45)) | (1L << (TITLE - 45)) | (1L << (BACKGROUND_COLOR - 45)) | (1L << (TITLE_COLOR - 45)) | (1L << (ONPRESSED - 45)))) != 0)) {
				{
				setState(577);
				buttonProperties();
				setState(582);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(578);
						match(COMMA);
						setState(579);
						buttonProperties();
						}
						} 
					}
					setState(584);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
				}
				setState(586);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(585);
					match(COMMA);
					}
				}

				}
			}

			setState(590);
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
	public static class ButtonOnPressedContext extends ButtonPropertiesContext {
		public TerminalNode ONPRESSED() { return getToken(DartParser.ONPRESSED, 0); }
		public TerminalNode COLON() { return getToken(DartParser.COLON, 0); }
		public OnFunctionContext onFunction() {
			return getRuleContext(OnFunctionContext.class,0);
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
	public static class ButtonTitleContext extends ButtonPropertiesContext {
		public TerminalNode TITLE() { return getToken(DartParser.TITLE, 0); }
		public TerminalNode COLON() { return getToken(DartParser.COLON, 0); }
		public TerminalNode STRING() { return getToken(DartParser.STRING, 0); }
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
		enterRule(_localctx, 80, RULE_buttonProperties);
		try {
			setState(606);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WIDTH:
				_localctx = new ButtonWidthContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(592);
				widthProperty();
				}
				break;
			case HEIGHT:
				_localctx = new ButtonHeightContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(593);
				heightProperty();
				}
				break;
			case TITLE:
				_localctx = new ButtonTitleContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(594);
				match(TITLE);
				setState(595);
				match(COLON);
				setState(596);
				match(STRING);
				}
				break;
			case BACKGROUND_COLOR:
				_localctx = new ButtonBackgroundColorContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(597);
				match(BACKGROUND_COLOR);
				setState(598);
				match(COLON);
				setState(599);
				match(HEX_NUM);
				}
				break;
			case TITLE_COLOR:
				_localctx = new ButtonTitleColorContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(600);
				match(TITLE_COLOR);
				setState(601);
				match(COLON);
				setState(602);
				match(HEX_NUM);
				}
				break;
			case ONPRESSED:
				_localctx = new ButtonOnPressedContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(603);
				match(ONPRESSED);
				setState(604);
				match(COLON);
				setState(605);
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
		enterRule(_localctx, 82, RULE_textField);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(608);
			match(TEXTFIELD);
			setState(609);
			match(LP);
			setState(621);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 59)) & ~0x3f) == 0 && ((1L << (_la - 59)) & ((1L << (PADDINGATTR - 59)) | (1L << (VALUE - 59)) | (1L << (LABEL - 59)) | (1L << (TEXTCOLOR - 59)) | (1L << (HINT - 59)) | (1L << (BORDERATRI - 59)) | (1L << (ONCHANGED - 59)))) != 0)) {
				{
				setState(610);
				textFieldProperties();
				setState(615);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(611);
						match(COMMA);
						setState(612);
						textFieldProperties();
						}
						} 
					}
					setState(617);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
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
	public static class TextFieldHintContext extends TextFieldPropertiesContext {
		public TerminalNode HINT() { return getToken(DartParser.HINT, 0); }
		public TerminalNode COLON() { return getToken(DartParser.COLON, 0); }
		public TerminalNode STRING() { return getToken(DartParser.STRING, 0); }
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
	public static class TextFieldLabelContext extends TextFieldPropertiesContext {
		public TerminalNode LABEL() { return getToken(DartParser.LABEL, 0); }
		public TerminalNode COLON() { return getToken(DartParser.COLON, 0); }
		public TerminalNode STRING() { return getToken(DartParser.STRING, 0); }
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
	public static class TextFieldValueContext extends TextFieldPropertiesContext {
		public TerminalNode VALUE() { return getToken(DartParser.VALUE, 0); }
		public TerminalNode COLON() { return getToken(DartParser.COLON, 0); }
		public TerminalNode STRING() { return getToken(DartParser.STRING, 0); }
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
	public static class TextFieldOnChangedContext extends TextFieldPropertiesContext {
		public TerminalNode ONCHANGED() { return getToken(DartParser.ONCHANGED, 0); }
		public TerminalNode COLON() { return getToken(DartParser.COLON, 0); }
		public OnFunctionContext onFunction() {
			return getRuleContext(OnFunctionContext.class,0);
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
		enterRule(_localctx, 84, RULE_textFieldProperties);
		try {
			setState(646);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VALUE:
				_localctx = new TextFieldValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(625);
				match(VALUE);
				setState(626);
				match(COLON);
				setState(627);
				match(STRING);
				}
				break;
			case LABEL:
				_localctx = new TextFieldLabelContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(628);
				match(LABEL);
				setState(629);
				match(COLON);
				setState(630);
				match(STRING);
				}
				break;
			case TEXTCOLOR:
				_localctx = new TextFieldTextColorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(631);
				match(TEXTCOLOR);
				setState(632);
				match(COLON);
				setState(633);
				match(HEX_NUM);
				}
				break;
			case PADDINGATTR:
				_localctx = new TextFieldPaddingContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(634);
				match(PADDINGATTR);
				setState(635);
				match(COLON);
				setState(636);
				edgeInsets();
				}
				break;
			case HINT:
				_localctx = new TextFieldHintContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(637);
				match(HINT);
				setState(638);
				match(COLON);
				setState(639);
				match(STRING);
				}
				break;
			case BORDERATRI:
				_localctx = new TextFieldBorderContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(640);
				match(BORDERATRI);
				setState(641);
				match(COLON);
				setState(642);
				border();
				}
				break;
			case ONCHANGED:
				_localctx = new TextFieldOnChangedContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(643);
				match(ONCHANGED);
				setState(644);
				match(COLON);
				setState(645);
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
		enterRule(_localctx, 86, RULE_border);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(648);
			match(BORDER);
			setState(649);
			match(LP);
			setState(661);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 56)) & ~0x3f) == 0 && ((1L << (_la - 56)) & ((1L << (COLOR - 56)) | (1L << (BORDERRADIUS - 56)) | (1L << (THICKNESS - 56)))) != 0)) {
				{
				setState(650);
				borderProperties();
				setState(655);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(651);
						match(COMMA);
						setState(652);
						borderProperties();
						}
						} 
					}
					setState(657);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
				}
				setState(659);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(658);
					match(COMMA);
					}
				}

				}
			}

			setState(663);
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
	public static class BorderThicknessContext extends BorderPropertiesContext {
		public TerminalNode THICKNESS() { return getToken(DartParser.THICKNESS, 0); }
		public TerminalNode COLON() { return getToken(DartParser.COLON, 0); }
		public TerminalNode NUM() { return getToken(DartParser.NUM, 0); }
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
	public static class BorderBorderRadiusContext extends BorderPropertiesContext {
		public TerminalNode BORDERRADIUS() { return getToken(DartParser.BORDERRADIUS, 0); }
		public TerminalNode COLON() { return getToken(DartParser.COLON, 0); }
		public BorderRadiusContext borderRadius() {
			return getRuleContext(BorderRadiusContext.class,0);
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
		enterRule(_localctx, 88, RULE_borderProperties);
		try {
			setState(672);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case THICKNESS:
				_localctx = new BorderThicknessContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(665);
				match(THICKNESS);
				setState(666);
				match(COLON);
				setState(667);
				match(NUM);
				}
				break;
			case BORDERRADIUS:
				_localctx = new BorderBorderRadiusContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(668);
				match(BORDERRADIUS);
				setState(669);
				match(COLON);
				setState(670);
				borderRadius();
				}
				break;
			case COLOR:
				_localctx = new BorderColorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(671);
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
		enterRule(_localctx, 90, RULE_statment);
		try {
			setState(677);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case STRINGTYPE:
			case DOUBLE:
			case FUNCTION:
				enterOuterAlt(_localctx, 1);
				{
				setState(674);
				variableDeclaration();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(675);
				variableAssignment();
				}
				break;
			case WIDGET:
				enterOuterAlt(_localctx, 3);
				{
				setState(676);
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
		enterRule(_localctx, 92, RULE_variableDeclaration);
		int _la;
		try {
			setState(694);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case STRINGTYPE:
			case DOUBLE:
				_localctx = new NonFunctionVariableDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(679);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << STRINGTYPE) | (1L << DOUBLE))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(680);
				match(IDENTIFIER);
				setState(681);
				match(SC);
				}
				break;
			case FUNCTION:
				_localctx = new FunctionVariableDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(682);
				match(FUNCTION);
				setState(683);
				match(LP);
				setState(688);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << STRINGTYPE) | (1L << DOUBLE))) != 0)) {
					{
					{
					setState(684);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << STRINGTYPE) | (1L << DOUBLE))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(685);
					match(COMMA);
					}
					}
					setState(690);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(691);
				match(RP);
				setState(692);
				match(IDENTIFIER);
				setState(693);
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
		enterRule(_localctx, 94, RULE_variableAssignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(696);
			match(IDENTIFIER);
			setState(697);
			match(EQL);
			setState(698);
			_la = _input.LA(1);
			if ( !(((((_la - 98)) & ~0x3f) == 0 && ((1L << (_la - 98)) & ((1L << (FLOAT - 98)) | (1L << (NUM - 98)) | (1L << (STRING - 98)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(699);
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
		enterRule(_localctx, 96, RULE_customWidgetDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(701);
			match(WIDGET);
			setState(702);
			match(WIDGETNAME);
			setState(703);
			match(OB);
			setState(707);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << STRINGTYPE) | (1L << DOUBLE) | (1L << FUNCTION))) != 0)) {
				{
				{
				setState(704);
				variableDeclaration();
				}
				}
				setState(709);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(710);
			match(RETURN);
			setState(711);
			match(LP);
			setState(712);
			widget();
			setState(713);
			match(RP);
			setState(714);
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

	public static class WidthPropertyContext extends ParserRuleContext {
		public TerminalNode WIDTH() { return getToken(DartParser.WIDTH, 0); }
		public TerminalNode COLON() { return getToken(DartParser.COLON, 0); }
		public TerminalNode NUM() { return getToken(DartParser.NUM, 0); }
		public TerminalNode FLOAT() { return getToken(DartParser.FLOAT, 0); }
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
		enterRule(_localctx, 98, RULE_widthProperty);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(716);
			match(WIDTH);
			setState(717);
			match(COLON);
			setState(718);
			_la = _input.LA(1);
			if ( !(_la==FLOAT || _la==NUM) ) {
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

	public static class HeightPropertyContext extends ParserRuleContext {
		public TerminalNode HEIGHT() { return getToken(DartParser.HEIGHT, 0); }
		public TerminalNode COLON() { return getToken(DartParser.COLON, 0); }
		public TerminalNode NUM() { return getToken(DartParser.NUM, 0); }
		public TerminalNode FLOAT() { return getToken(DartParser.FLOAT, 0); }
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
		enterRule(_localctx, 100, RULE_heightProperty);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(720);
			match(HEIGHT);
			setState(721);
			match(COLON);
			setState(722);
			_la = _input.LA(1);
			if ( !(_la==FLOAT || _la==NUM) ) {
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
		enterRule(_localctx, 102, RULE_colorProperty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(724);
			match(COLOR);
			setState(725);
			match(COLON);
			setState(726);
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
		enterRule(_localctx, 104, RULE_childProperty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(728);
			match(CHILD);
			setState(729);
			match(COLON);
			setState(730);
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
		enterRule(_localctx, 106, RULE_childrenProperty);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(732);
			match(CHILDREN);
			setState(733);
			match(COLON);
			setState(734);
			match(OA);
			setState(746);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ROW) | (1L << CENTER) | (1L << COLUMN) | (1L << TEXT) | (1L << CONTAINER) | (1L << EXPANDED) | (1L << PADDING) | (1L << IMAGE) | (1L << BUTTON) | (1L << GESTUREDETECTOR) | (1L << TEXTFIELD))) != 0) || _la==WIDGETNAME) {
				{
				setState(735);
				widget();
				setState(740);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(736);
						match(COMMA);
						setState(737);
						widget();
						}
						} 
					}
					setState(742);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
				}
				setState(744);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(743);
					match(COMMA);
					}
				}

				}
			}

			setState(748);
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
		enterRule(_localctx, 108, RULE_mainAxisSizeProperty);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(750);
			match(MAINAXISSIZE);
			setState(751);
			match(COLON);
			setState(752);
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
		enterRule(_localctx, 110, RULE_crossAxisAlignmentProperty);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(754);
			match(CROSSAXISALIGNMENT);
			setState(755);
			match(COLON);
			setState(756);
			_la = _input.LA(1);
			if ( !(((((_la - 48)) & ~0x3f) == 0 && ((1L << (_la - 48)) & ((1L << (CENTERVALUE - 48)) | (1L << (STRETCH - 48)) | (1L << (LEFT - 48)) | (1L << (RIGHT - 48)))) != 0)) ) {
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
		"\u0004\u0001f\u02f7\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"\u0000\u0003\u0000x\b\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001\u0081\b\u0001\n"+
		"\u0001\f\u0001\u0084\t\u0001\u0001\u0001\u0003\u0001\u0087\b\u0001\u0003"+
		"\u0001\u0089\b\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u0093\b\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003\u009a"+
		"\b\u0003\n\u0003\f\u0003\u009d\t\u0003\u0001\u0003\u0003\u0003\u00a0\b"+
		"\u0003\u0003\u0003\u00a2\b\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u00ac"+
		"\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0003\u0005\u00ba\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0005\u0006\u00c1\b\u0006\n\u0006\f\u0006\u00c4\t\u0006"+
		"\u0001\u0006\u0003\u0006\u00c7\b\u0006\u0003\u0006\u00c9\b\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b\u00d6\b\b\n\b\f\b\u00d9\t\b"+
		"\u0001\b\u0003\b\u00dc\b\b\u0003\b\u00de\b\b\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\t\u0003\t\u00e5\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005"+
		"\n\u00ec\b\n\n\n\f\n\u00ef\t\n\u0001\n\u0003\n\u00f2\b\n\u0003\n\u00f4"+
		"\b\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0005\f\u00ff\b\f\n\f\f\f\u0102\t\f\u0001\f\u0003\f\u0105\b"+
		"\f\u0003\f\u0107\b\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0003\r\u010e"+
		"\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0005"+
		"\u000e\u0115\b\u000e\n\u000e\f\u000e\u0118\t\u000e\u0001\u000e\u0003\u000e"+
		"\u011b\b\u000e\u0003\u000e\u011d\b\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u0130\b\u000f\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010\u0137\b\u0010\n"+
		"\u0010\f\u0010\u013a\t\u0010\u0001\u0010\u0003\u0010\u013d\b\u0010\u0003"+
		"\u0010\u013f\b\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u014a"+
		"\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u0155\b\u0013\n"+
		"\u0013\f\u0013\u0158\t\u0013\u0001\u0013\u0003\u0013\u015b\b\u0013\u0003"+
		"\u0013\u015d\b\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0003"+
		"\u0014\u0163\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0016\u0001\u0016\u0003\u0016\u016b\b\u0016\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0003\u0017\u0171\b\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0005\u0018\u017a"+
		"\b\u0018\n\u0018\f\u0018\u017d\t\u0018\u0001\u0018\u0003\u0018\u0180\b"+
		"\u0018\u0003\u0018\u0182\b\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u0196\b\u001a\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0005\u001b\u019d\b\u001b\n"+
		"\u001b\f\u001b\u01a0\t\u001b\u0001\u001b\u0003\u001b\u01a3\b\u001b\u0003"+
		"\u001b\u01a5\b\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0003\u001c\u01ad\b\u001c\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0005\u001d\u01b4\b\u001d\n\u001d\f\u001d"+
		"\u01b7\t\u001d\u0001\u001d\u0003\u001d\u01ba\b\u001d\u0003\u001d\u01bc"+
		"\b\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0005\u001f\u01c7\b\u001f\n"+
		"\u001f\f\u001f\u01ca\t\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0005"+
		"\u001f\u01cf\b\u001f\n\u001f\f\u001f\u01d2\t\u001f\u0001\u001f\u0001\u001f"+
		"\u0001 \u0001 \u0001 \u0001 \u0001 \u0005 \u01db\b \n \f \u01de\t \u0001"+
		" \u0003 \u01e1\b \u0003 \u01e3\b \u0001 \u0001 \u0001!\u0001!\u0001!\u0001"+
		"!\u0003!\u01eb\b!\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0005\"\u01f2"+
		"\b\"\n\"\f\"\u01f5\t\"\u0001\"\u0003\"\u01f8\b\"\u0003\"\u01fa\b\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0005\"\u0202\b\"\n\"\f\"\u0205"+
		"\t\"\u0001\"\u0003\"\u0208\b\"\u0003\"\u020a\b\"\u0001\"\u0003\"\u020d"+
		"\b\"\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001"+
		"#\u0001#\u0001#\u0003#\u021b\b#\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0003$\u0223\b$\u0001%\u0001%\u0001%\u0001%\u0001%\u0005%\u022a\b%\n"+
		"%\f%\u022d\t%\u0001%\u0003%\u0230\b%\u0003%\u0232\b%\u0001%\u0001%\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0003&\u023e\b&\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0005\'\u0245\b\'\n\'\f\'\u0248\t\'"+
		"\u0001\'\u0003\'\u024b\b\'\u0003\'\u024d\b\'\u0001\'\u0001\'\u0001(\u0001"+
		"(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001"+
		"(\u0001(\u0001(\u0003(\u025f\b(\u0001)\u0001)\u0001)\u0001)\u0001)\u0005"+
		")\u0266\b)\n)\f)\u0269\t)\u0001)\u0003)\u026c\b)\u0003)\u026e\b)\u0001"+
		")\u0001)\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001"+
		"*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001"+
		"*\u0001*\u0001*\u0003*\u0287\b*\u0001+\u0001+\u0001+\u0001+\u0001+\u0005"+
		"+\u028e\b+\n+\f+\u0291\t+\u0001+\u0003+\u0294\b+\u0003+\u0296\b+\u0001"+
		"+\u0001+\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0003,\u02a1"+
		"\b,\u0001-\u0001-\u0001-\u0003-\u02a6\b-\u0001.\u0001.\u0001.\u0001.\u0001"+
		".\u0001.\u0001.\u0005.\u02af\b.\n.\f.\u02b2\t.\u0001.\u0001.\u0001.\u0003"+
		".\u02b7\b.\u0001/\u0001/\u0001/\u0001/\u0001/\u00010\u00010\u00010\u0001"+
		"0\u00050\u02c2\b0\n0\f0\u02c5\t0\u00010\u00010\u00010\u00010\u00010\u0001"+
		"0\u00011\u00011\u00011\u00011\u00012\u00012\u00012\u00012\u00013\u0001"+
		"3\u00013\u00013\u00014\u00014\u00014\u00014\u00015\u00015\u00015\u0001"+
		"5\u00015\u00015\u00055\u02e3\b5\n5\f5\u02e6\t5\u00015\u00035\u02e9\b5"+
		"\u00035\u02eb\b5\u00015\u00015\u00016\u00016\u00016\u00016\u00017\u0001"+
		"7\u00017\u00017\u00017\u0000\u00008\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDF"+
		"HJLNPRTVXZ\\^`bdfhjln\u0000\t\u0001\u0000bd\u0002\u0000,,QS\u0001\u0000"+
		"bc\u0002\u000000MO\u0003\u000000]]__\u0001\u0000GH\u0001\u0000\"$\u0001"+
		"\u000034\u0004\u00000066]]__\u0339\u0000s\u0001\u0000\u0000\u0000\u0002"+
		"{\u0001\u0000\u0000\u0000\u0004\u0092\u0001\u0000\u0000\u0000\u0006\u0094"+
		"\u0001\u0000\u0000\u0000\b\u00ab\u0001\u0000\u0000\u0000\n\u00b9\u0001"+
		"\u0000\u0000\u0000\f\u00bb\u0001\u0000\u0000\u0000\u000e\u00cc\u0001\u0000"+
		"\u0000\u0000\u0010\u00d0\u0001\u0000\u0000\u0000\u0012\u00e4\u0001\u0000"+
		"\u0000\u0000\u0014\u00e6\u0001\u0000\u0000\u0000\u0016\u00f7\u0001\u0000"+
		"\u0000\u0000\u0018\u00f9\u0001\u0000\u0000\u0000\u001a\u010d\u0001\u0000"+
		"\u0000\u0000\u001c\u010f\u0001\u0000\u0000\u0000\u001e\u012f\u0001\u0000"+
		"\u0000\u0000 \u0131\u0001\u0000\u0000\u0000\"\u0149\u0001\u0000\u0000"+
		"\u0000$\u014b\u0001\u0000\u0000\u0000&\u014f\u0001\u0000\u0000\u0000("+
		"\u0162\u0001\u0000\u0000\u0000*\u0164\u0001\u0000\u0000\u0000,\u016a\u0001"+
		"\u0000\u0000\u0000.\u016c\u0001\u0000\u0000\u00000\u0174\u0001\u0000\u0000"+
		"\u00002\u0185\u0001\u0000\u0000\u00004\u0195\u0001\u0000\u0000\u00006"+
		"\u0197\u0001\u0000\u0000\u00008\u01ac\u0001\u0000\u0000\u0000:\u01ae\u0001"+
		"\u0000\u0000\u0000<\u01bf\u0001\u0000\u0000\u0000>\u01c3\u0001\u0000\u0000"+
		"\u0000@\u01d5\u0001\u0000\u0000\u0000B\u01ea\u0001\u0000\u0000\u0000D"+
		"\u020c\u0001\u0000\u0000\u0000F\u021a\u0001\u0000\u0000\u0000H\u0222\u0001"+
		"\u0000\u0000\u0000J\u0224\u0001\u0000\u0000\u0000L\u023d\u0001\u0000\u0000"+
		"\u0000N\u023f\u0001\u0000\u0000\u0000P\u025e\u0001\u0000\u0000\u0000R"+
		"\u0260\u0001\u0000\u0000\u0000T\u0286\u0001\u0000\u0000\u0000V\u0288\u0001"+
		"\u0000\u0000\u0000X\u02a0\u0001\u0000\u0000\u0000Z\u02a5\u0001\u0000\u0000"+
		"\u0000\\\u02b6\u0001\u0000\u0000\u0000^\u02b8\u0001\u0000\u0000\u0000"+
		"`\u02bd\u0001\u0000\u0000\u0000b\u02cc\u0001\u0000\u0000\u0000d\u02d0"+
		"\u0001\u0000\u0000\u0000f\u02d4\u0001\u0000\u0000\u0000h\u02d8\u0001\u0000"+
		"\u0000\u0000j\u02dc\u0001\u0000\u0000\u0000l\u02ee\u0001\u0000\u0000\u0000"+
		"n\u02f2\u0001\u0000\u0000\u0000pr\u0003Z-\u0000qp\u0001\u0000\u0000\u0000"+
		"ru\u0001\u0000\u0000\u0000sq\u0001\u0000\u0000\u0000st\u0001\u0000\u0000"+
		"\u0000tw\u0001\u0000\u0000\u0000us\u0001\u0000\u0000\u0000vx\u0003\u0002"+
		"\u0001\u0000wv\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000xy\u0001"+
		"\u0000\u0000\u0000yz\u0005\u0000\u0000\u0001z\u0001\u0001\u0000\u0000"+
		"\u0000{|\u0005\u000b\u0000\u0000|\u0088\u0005\u0001\u0000\u0000}\u0082"+
		"\u0003\u0004\u0002\u0000~\u007f\u0005\t\u0000\u0000\u007f\u0081\u0003"+
		"\u0004\u0002\u0000\u0080~\u0001\u0000\u0000\u0000\u0081\u0084\u0001\u0000"+
		"\u0000\u0000\u0082\u0080\u0001\u0000\u0000\u0000\u0082\u0083\u0001\u0000"+
		"\u0000\u0000\u0083\u0086\u0001\u0000\u0000\u0000\u0084\u0082\u0001\u0000"+
		"\u0000\u0000\u0085\u0087\u0005\t\u0000\u0000\u0086\u0085\u0001\u0000\u0000"+
		"\u0000\u0086\u0087\u0001\u0000\u0000\u0000\u0087\u0089\u0001\u0000\u0000"+
		"\u0000\u0088}\u0001\u0000\u0000\u0000\u0088\u0089\u0001\u0000\u0000\u0000"+
		"\u0089\u008a\u0001\u0000\u0000\u0000\u008a\u008b\u0005\u0002\u0000\u0000"+
		"\u008b\u0003\u0001\u0000\u0000\u0000\u008c\u008d\u0005\u001f\u0000\u0000"+
		"\u008d\u008e\u0005\u0003\u0000\u0000\u008e\u0093\u0003\n\u0005\u0000\u008f"+
		"\u0090\u0005(\u0000\u0000\u0090\u0091\u0005\u0003\u0000\u0000\u0091\u0093"+
		"\u0003\u0006\u0003\u0000\u0092\u008c\u0001\u0000\u0000\u0000\u0092\u008f"+
		"\u0001\u0000\u0000\u0000\u0093\u0005\u0001\u0000\u0000\u0000\u0094\u0095"+
		"\u0005\u0010\u0000\u0000\u0095\u00a1\u0005\u0001\u0000\u0000\u0096\u009b"+
		"\u0003\b\u0004\u0000\u0097\u0098\u0005\t\u0000\u0000\u0098\u009a\u0003"+
		"\b\u0004\u0000\u0099\u0097\u0001\u0000\u0000\u0000\u009a\u009d\u0001\u0000"+
		"\u0000\u0000\u009b\u0099\u0001\u0000\u0000\u0000\u009b\u009c\u0001\u0000"+
		"\u0000\u0000\u009c\u009f\u0001\u0000\u0000\u0000\u009d\u009b\u0001\u0000"+
		"\u0000\u0000\u009e\u00a0\u0005\t\u0000\u0000\u009f\u009e\u0001\u0000\u0000"+
		"\u0000\u009f\u00a0\u0001\u0000\u0000\u0000\u00a0\u00a2\u0001\u0000\u0000"+
		"\u0000\u00a1\u0096\u0001\u0000\u0000\u0000\u00a1\u00a2\u0001\u0000\u0000"+
		"\u0000\u00a2\u00a3\u0001\u0000\u0000\u0000\u00a3\u00a4\u0005\u0002\u0000"+
		"\u0000\u00a4\u0007\u0001\u0000\u0000\u0000\u00a5\u00a6\u0005D\u0000\u0000"+
		"\u00a6\u00a7\u0005\u0003\u0000\u0000\u00a7\u00ac\u0005d\u0000\u0000\u00a8"+
		"\u00a9\u0005J\u0000\u0000\u00a9\u00aa\u0005\u0003\u0000\u0000\u00aa\u00ac"+
		"\u0005I\u0000\u0000\u00ab\u00a5\u0001\u0000\u0000\u0000\u00ab\u00a8\u0001"+
		"\u0000\u0000\u0000\u00ac\t\u0001\u0000\u0000\u0000\u00ad\u00ba\u0003\u0010"+
		"\b\u0000\u00ae\u00ba\u0003\u0014\n\u0000\u00af\u00ba\u0003\u001c\u000e"+
		"\u0000\u00b0\u00ba\u0003 \u0010\u0000\u00b1\u00ba\u00036\u001b\u0000\u00b2"+
		"\u00ba\u0003\u0018\f\u0000\u00b3\u00ba\u0003:\u001d\u0000\u00b4\u00ba"+
		"\u0003@ \u0000\u00b5\u00ba\u0003J%\u0000\u00b6\u00ba\u0003N\'\u0000\u00b7"+
		"\u00ba\u0003\f\u0006\u0000\u00b8\u00ba\u0003R)\u0000\u00b9\u00ad\u0001"+
		"\u0000\u0000\u0000\u00b9\u00ae\u0001\u0000\u0000\u0000\u00b9\u00af\u0001"+
		"\u0000\u0000\u0000\u00b9\u00b0\u0001\u0000\u0000\u0000\u00b9\u00b1\u0001"+
		"\u0000\u0000\u0000\u00b9\u00b2\u0001\u0000\u0000\u0000\u00b9\u00b3\u0001"+
		"\u0000\u0000\u0000\u00b9\u00b4\u0001\u0000\u0000\u0000\u00b9\u00b5\u0001"+
		"\u0000\u0000\u0000\u00b9\u00b6\u0001\u0000\u0000\u0000\u00b9\u00b7\u0001"+
		"\u0000\u0000\u0000\u00b9\u00b8\u0001\u0000\u0000\u0000\u00ba\u000b\u0001"+
		"\u0000\u0000\u0000\u00bb\u00bc\u0005`\u0000\u0000\u00bc\u00c8\u0005\u0001"+
		"\u0000\u0000\u00bd\u00c2\u0003\u000e\u0007\u0000\u00be\u00bf\u0005\t\u0000"+
		"\u0000\u00bf\u00c1\u0003\u000e\u0007\u0000\u00c0\u00be\u0001\u0000\u0000"+
		"\u0000\u00c1\u00c4\u0001\u0000\u0000\u0000\u00c2\u00c0\u0001\u0000\u0000"+
		"\u0000\u00c2\u00c3\u0001\u0000\u0000\u0000\u00c3\u00c6\u0001\u0000\u0000"+
		"\u0000\u00c4\u00c2\u0001\u0000\u0000\u0000\u00c5\u00c7\u0005\t\u0000\u0000"+
		"\u00c6\u00c5\u0001\u0000\u0000\u0000\u00c6\u00c7\u0001\u0000\u0000\u0000"+
		"\u00c7\u00c9\u0001\u0000\u0000\u0000\u00c8\u00bd\u0001\u0000\u0000\u0000"+
		"\u00c8\u00c9\u0001\u0000\u0000\u0000\u00c9\u00ca\u0001\u0000\u0000\u0000"+
		"\u00ca\u00cb\u0005\u0002\u0000\u0000\u00cb\r\u0001\u0000\u0000\u0000\u00cc"+
		"\u00cd\u0005a\u0000\u0000\u00cd\u00ce\u0005\u0003\u0000\u0000\u00ce\u00cf"+
		"\u0007\u0000\u0000\u0000\u00cf\u000f\u0001\u0000\u0000\u0000\u00d0\u00d1"+
		"\u0005\f\u0000\u0000\u00d1\u00dd\u0005\u0001\u0000\u0000\u00d2\u00d7\u0003"+
		"\u0012\t\u0000\u00d3\u00d4\u0005\t\u0000\u0000\u00d4\u00d6\u0003\u0012"+
		"\t\u0000\u00d5\u00d3\u0001\u0000\u0000\u0000\u00d6\u00d9\u0001\u0000\u0000"+
		"\u0000\u00d7\u00d5\u0001\u0000\u0000\u0000\u00d7\u00d8\u0001\u0000\u0000"+
		"\u0000\u00d8\u00db\u0001\u0000\u0000\u0000\u00d9\u00d7\u0001\u0000\u0000"+
		"\u0000\u00da\u00dc\u0005\t\u0000\u0000\u00db\u00da\u0001\u0000\u0000\u0000"+
		"\u00db\u00dc\u0001\u0000\u0000\u0000\u00dc\u00de\u0001\u0000\u0000\u0000"+
		"\u00dd\u00d2\u0001\u0000\u0000\u0000\u00dd\u00de\u0001\u0000\u0000\u0000"+
		"\u00de\u00df\u0001\u0000\u0000\u0000\u00df\u00e0\u0005\u0002\u0000\u0000"+
		"\u00e0\u0011\u0001\u0000\u0000\u0000\u00e1\u00e5\u0003j5\u0000\u00e2\u00e5"+
		"\u0003l6\u0000\u00e3\u00e5\u0003n7\u0000\u00e4\u00e1\u0001\u0000\u0000"+
		"\u0000\u00e4\u00e2\u0001\u0000\u0000\u0000\u00e4\u00e3\u0001\u0000\u0000"+
		"\u0000\u00e5\u0013\u0001\u0000\u0000\u0000\u00e6\u00e7\u0005\r\u0000\u0000"+
		"\u00e7\u00f3\u0005\u0001\u0000\u0000\u00e8\u00ed\u0003\u0016\u000b\u0000"+
		"\u00e9\u00ea\u0005\t\u0000\u0000\u00ea\u00ec\u0003\u0016\u000b\u0000\u00eb"+
		"\u00e9\u0001\u0000\u0000\u0000\u00ec\u00ef\u0001\u0000\u0000\u0000\u00ed"+
		"\u00eb\u0001\u0000\u0000\u0000\u00ed\u00ee\u0001\u0000\u0000\u0000\u00ee"+
		"\u00f1\u0001\u0000\u0000\u0000\u00ef\u00ed\u0001\u0000\u0000\u0000\u00f0"+
		"\u00f2\u0005\t\u0000\u0000\u00f1\u00f0\u0001\u0000\u0000\u0000\u00f1\u00f2"+
		"\u0001\u0000\u0000\u0000\u00f2\u00f4\u0001\u0000\u0000\u0000\u00f3\u00e8"+
		"\u0001\u0000\u0000\u0000\u00f3\u00f4\u0001\u0000\u0000\u0000\u00f4\u00f5"+
		"\u0001\u0000\u0000\u0000\u00f5\u00f6\u0005\u0002\u0000\u0000\u00f6\u0015"+
		"\u0001\u0000\u0000\u0000\u00f7\u00f8\u0003h4\u0000\u00f8\u0017\u0001\u0000"+
		"\u0000\u0000\u00f9\u00fa\u0005\u000e\u0000\u0000\u00fa\u0106\u0005\u0001"+
		"\u0000\u0000\u00fb\u0100\u0003\u001a\r\u0000\u00fc\u00fd\u0005\t\u0000"+
		"\u0000\u00fd\u00ff\u0003\u001a\r\u0000\u00fe\u00fc\u0001\u0000\u0000\u0000"+
		"\u00ff\u0102\u0001\u0000\u0000\u0000\u0100\u00fe\u0001\u0000\u0000\u0000"+
		"\u0100\u0101\u0001\u0000\u0000\u0000\u0101\u0104\u0001\u0000\u0000\u0000"+
		"\u0102\u0100\u0001\u0000\u0000\u0000\u0103\u0105\u0005\t\u0000\u0000\u0104"+
		"\u0103\u0001\u0000\u0000\u0000\u0104\u0105\u0001\u0000\u0000\u0000\u0105"+
		"\u0107\u0001\u0000\u0000\u0000\u0106\u00fb\u0001\u0000\u0000\u0000\u0106"+
		"\u0107\u0001\u0000\u0000\u0000\u0107\u0108\u0001\u0000\u0000\u0000\u0108"+
		"\u0109\u0005\u0002\u0000\u0000\u0109\u0019\u0001\u0000\u0000\u0000\u010a"+
		"\u010e\u0003j5\u0000\u010b\u010e\u0003l6\u0000\u010c\u010e\u0003n7\u0000"+
		"\u010d\u010a\u0001\u0000\u0000\u0000\u010d\u010b\u0001\u0000\u0000\u0000"+
		"\u010d\u010c\u0001\u0000\u0000\u0000\u010e\u001b\u0001\u0000\u0000\u0000"+
		"\u010f\u0110\u0005\u000f\u0000\u0000\u0110\u011c\u0005\u0001\u0000\u0000"+
		"\u0111\u0116\u0003\u001e\u000f\u0000\u0112\u0113\u0005\t\u0000\u0000\u0113"+
		"\u0115\u0003\u001e\u000f\u0000\u0114\u0112\u0001\u0000\u0000\u0000\u0115"+
		"\u0118\u0001\u0000\u0000\u0000\u0116\u0114\u0001\u0000\u0000\u0000\u0116"+
		"\u0117\u0001\u0000\u0000\u0000\u0117\u011a\u0001\u0000\u0000\u0000\u0118"+
		"\u0116\u0001\u0000\u0000\u0000\u0119\u011b\u0005\t\u0000\u0000\u011a\u0119"+
		"\u0001\u0000\u0000\u0000\u011a\u011b\u0001\u0000\u0000\u0000\u011b\u011d"+
		"\u0001\u0000\u0000\u0000\u011c\u0111\u0001\u0000\u0000\u0000\u011c\u011d"+
		"\u0001\u0000\u0000\u0000\u011d\u011e\u0001\u0000\u0000\u0000\u011e\u011f"+
		"\u0005\u0002\u0000\u0000\u011f\u001d\u0001\u0000\u0000\u0000\u0120\u0121"+
		"\u0005\'\u0000\u0000\u0121\u0122\u0005\u0003\u0000\u0000\u0122\u0130\u0005"+
		"d\u0000\u0000\u0123\u0124\u0005)\u0000\u0000\u0124\u0125\u0005\u0003\u0000"+
		"\u0000\u0125\u0130\u0007\u0001\u0000\u0000\u0126\u0127\u0005*\u0000\u0000"+
		"\u0127\u0128\u0005\u0003\u0000\u0000\u0128\u0130\u0007\u0002\u0000\u0000"+
		"\u0129\u012a\u0005+\u0000\u0000\u012a\u012b\u0005\u0003\u0000\u0000\u012b"+
		"\u0130\u0007\u0002\u0000\u0000\u012c\u012d\u0005K\u0000\u0000\u012d\u012e"+
		"\u0005\u0003\u0000\u0000\u012e\u0130\u0007\u0003\u0000\u0000\u012f\u0120"+
		"\u0001\u0000\u0000\u0000\u012f\u0123\u0001\u0000\u0000\u0000\u012f\u0126"+
		"\u0001\u0000\u0000\u0000\u012f\u0129\u0001\u0000\u0000\u0000\u012f\u012c"+
		"\u0001\u0000\u0000\u0000\u0130\u001f\u0001\u0000\u0000\u0000\u0131\u0132"+
		"\u0005\u0011\u0000\u0000\u0132\u013e\u0005\u0001\u0000\u0000\u0133\u0138"+
		"\u0003\"\u0011\u0000\u0134\u0135\u0005\t\u0000\u0000\u0135\u0137\u0003"+
		"\"\u0011\u0000\u0136\u0134\u0001\u0000\u0000\u0000\u0137\u013a\u0001\u0000"+
		"\u0000\u0000\u0138\u0136\u0001\u0000\u0000\u0000\u0138\u0139\u0001\u0000"+
		"\u0000\u0000\u0139\u013c\u0001\u0000\u0000\u0000\u013a\u0138\u0001\u0000"+
		"\u0000\u0000\u013b\u013d\u0005\t\u0000\u0000\u013c\u013b\u0001\u0000\u0000"+
		"\u0000\u013c\u013d\u0001\u0000\u0000\u0000\u013d\u013f\u0001\u0000\u0000"+
		"\u0000\u013e\u0133\u0001\u0000\u0000\u0000\u013e\u013f\u0001\u0000\u0000"+
		"\u0000\u013f\u0140\u0001\u0000\u0000\u0000\u0140\u0141\u0005\u0002\u0000"+
		"\u0000\u0141!\u0001\u0000\u0000\u0000\u0142\u014a\u0003b1\u0000\u0143"+
		"\u014a\u0003d2\u0000\u0144\u0145\u0005/\u0000\u0000\u0145\u0146\u0005"+
		"\u0003\u0000\u0000\u0146\u014a\u0007\u0004\u0000\u0000\u0147\u014a\u0003"+
		"h4\u0000\u0148\u014a\u0003$\u0012\u0000\u0149\u0142\u0001\u0000\u0000"+
		"\u0000\u0149\u0143\u0001\u0000\u0000\u0000\u0149\u0144\u0001\u0000\u0000"+
		"\u0000\u0149\u0147\u0001\u0000\u0000\u0000\u0149\u0148\u0001\u0000\u0000"+
		"\u0000\u014a#\u0001\u0000\u0000\u0000\u014b\u014c\u00057\u0000\u0000\u014c"+
		"\u014d\u0005\u0003\u0000\u0000\u014d\u014e\u0003&\u0013\u0000\u014e%\u0001"+
		"\u0000\u0000\u0000\u014f\u0150\u0005\u0013\u0000\u0000\u0150\u015c\u0005"+
		"\u0001\u0000\u0000\u0151\u0156\u0003(\u0014\u0000\u0152\u0153\u0005\t"+
		"\u0000\u0000\u0153\u0155\u0003(\u0014\u0000\u0154\u0152\u0001\u0000\u0000"+
		"\u0000\u0155\u0158\u0001\u0000\u0000\u0000\u0156\u0154\u0001\u0000\u0000"+
		"\u0000\u0156\u0157\u0001\u0000\u0000\u0000\u0157\u015a\u0001\u0000\u0000"+
		"\u0000\u0158\u0156\u0001\u0000\u0000\u0000\u0159\u015b\u0005\t\u0000\u0000"+
		"\u015a\u0159\u0001\u0000\u0000\u0000\u015a\u015b\u0001\u0000\u0000\u0000"+
		"\u015b\u015d\u0001\u0000\u0000\u0000\u015c\u0151\u0001\u0000\u0000\u0000"+
		"\u015c\u015d\u0001\u0000\u0000\u0000\u015d\u015e\u0001\u0000\u0000\u0000"+
		"\u015e\u015f\u0005\u0002\u0000\u0000\u015f\'\u0001\u0000\u0000\u0000\u0160"+
		"\u0163\u0003f3\u0000\u0161\u0163\u0003*\u0015\u0000\u0162\u0160\u0001"+
		"\u0000\u0000\u0000\u0162\u0161\u0001\u0000\u0000\u0000\u0163)\u0001\u0000"+
		"\u0000\u0000\u0164\u0165\u00059\u0000\u0000\u0165\u0166\u0005\u0003\u0000"+
		"\u0000\u0166\u0167\u0003,\u0016\u0000\u0167+\u0001\u0000\u0000\u0000\u0168"+
		"\u016b\u00030\u0018\u0000\u0169\u016b\u0003.\u0017\u0000\u016a\u0168\u0001"+
		"\u0000\u0000\u0000\u016a\u0169\u0001\u0000\u0000\u0000\u016b-\u0001\u0000"+
		"\u0000\u0000\u016c\u016d\u0005\u001d\u0000\u0000\u016d\u016e\u0005\u0001"+
		"\u0000\u0000\u016e\u0170\u00032\u0019\u0000\u016f\u0171\u0005\t\u0000"+
		"\u0000\u0170\u016f\u0001\u0000\u0000\u0000\u0170\u0171\u0001\u0000\u0000"+
		"\u0000\u0171\u0172\u0001\u0000\u0000\u0000\u0172\u0173\u0005\u0002\u0000"+
		"\u0000\u0173/\u0001\u0000\u0000\u0000\u0174\u0175\u0005\u001c\u0000\u0000"+
		"\u0175\u0181\u0005\u0001\u0000\u0000\u0176\u017b\u00034\u001a\u0000\u0177"+
		"\u0178\u0005\t\u0000\u0000\u0178\u017a\u00034\u001a\u0000\u0179\u0177"+
		"\u0001\u0000\u0000\u0000\u017a\u017d\u0001\u0000\u0000\u0000\u017b\u0179"+
		"\u0001\u0000\u0000\u0000\u017b\u017c\u0001\u0000\u0000\u0000\u017c\u017f"+
		"\u0001\u0000\u0000\u0000\u017d\u017b\u0001\u0000\u0000\u0000\u017e\u0180"+
		"\u0005\t\u0000\u0000\u017f\u017e\u0001\u0000\u0000\u0000\u017f\u0180\u0001"+
		"\u0000\u0000\u0000\u0180\u0182\u0001\u0000\u0000\u0000\u0181\u0176\u0001"+
		"\u0000\u0000\u0000\u0181\u0182\u0001\u0000\u0000\u0000\u0182\u0183\u0001"+
		"\u0000\u0000\u0000\u0183\u0184\u0005\u0002\u0000\u0000\u01841\u0001\u0000"+
		"\u0000\u0000\u0185\u0186\u0005Z\u0000\u0000\u0186\u0187\u0005\u0003\u0000"+
		"\u0000\u0187\u0188\u0007\u0002\u0000\u0000\u01883\u0001\u0000\u0000\u0000"+
		"\u0189\u018a\u0005<\u0000\u0000\u018a\u018b\u0005\u0003\u0000\u0000\u018b"+
		"\u0196\u0007\u0002\u0000\u0000\u018c\u018d\u0005=\u0000\u0000\u018d\u018e"+
		"\u0005\u0003\u0000\u0000\u018e\u0196\u0007\u0002\u0000\u0000\u018f\u0190"+
		"\u0005>\u0000\u0000\u0190\u0191\u0005\u0003\u0000\u0000\u0191\u0196\u0007"+
		"\u0002\u0000\u0000\u0192\u0193\u0005?\u0000\u0000\u0193\u0194\u0005\u0003"+
		"\u0000\u0000\u0194\u0196\u0007\u0002\u0000\u0000\u0195\u0189\u0001\u0000"+
		"\u0000\u0000\u0195\u018c\u0001\u0000\u0000\u0000\u0195\u018f\u0001\u0000"+
		"\u0000\u0000\u0195\u0192\u0001\u0000\u0000\u0000\u01965\u0001\u0000\u0000"+
		"\u0000\u0197\u0198\u0005\u0012\u0000\u0000\u0198\u01a4\u0005\u0001\u0000"+
		"\u0000\u0199\u019e\u00038\u001c\u0000\u019a\u019b\u0005\t\u0000\u0000"+
		"\u019b\u019d\u00038\u001c\u0000\u019c\u019a\u0001\u0000\u0000\u0000\u019d"+
		"\u01a0\u0001\u0000\u0000\u0000\u019e\u019c\u0001\u0000\u0000\u0000\u019e"+
		"\u019f\u0001\u0000\u0000\u0000\u019f\u01a2\u0001\u0000\u0000\u0000\u01a0"+
		"\u019e\u0001\u0000\u0000\u0000\u01a1\u01a3\u0005\t\u0000\u0000\u01a2\u01a1"+
		"\u0001\u0000\u0000\u0000\u01a2\u01a3\u0001\u0000\u0000\u0000\u01a3\u01a5"+
		"\u0001\u0000\u0000\u0000\u01a4\u0199\u0001\u0000\u0000\u0000\u01a4\u01a5"+
		"\u0001\u0000\u0000\u0000\u01a5\u01a6\u0001\u0000\u0000\u0000\u01a6\u01a7"+
		"\u0005\u0002\u0000\u0000\u01a77\u0001\u0000\u0000\u0000\u01a8\u01a9\u0005"+
		"1\u0000\u0000\u01a9\u01aa\u0005\u0003\u0000\u0000\u01aa\u01ad\u0005c\u0000"+
		"\u0000\u01ab\u01ad\u0003h4\u0000\u01ac\u01a8\u0001\u0000\u0000\u0000\u01ac"+
		"\u01ab\u0001\u0000\u0000\u0000\u01ad9\u0001\u0000\u0000\u0000\u01ae\u01af"+
		"\u0005\u0019\u0000\u0000\u01af\u01bb\u0005\u0001\u0000\u0000\u01b0\u01b5"+
		"\u0003<\u001e\u0000\u01b1\u01b2\u0005\t\u0000\u0000\u01b2\u01b4\u0003"+
		"<\u001e\u0000\u01b3\u01b1\u0001\u0000\u0000\u0000\u01b4\u01b7\u0001\u0000"+
		"\u0000\u0000\u01b5\u01b3\u0001\u0000\u0000\u0000\u01b5\u01b6\u0001\u0000"+
		"\u0000\u0000\u01b6\u01b9\u0001\u0000\u0000\u0000\u01b7\u01b5\u0001\u0000"+
		"\u0000\u0000\u01b8\u01ba\u0005\t\u0000\u0000\u01b9\u01b8\u0001\u0000\u0000"+
		"\u0000\u01b9\u01ba\u0001\u0000\u0000\u0000\u01ba\u01bc\u0001\u0000\u0000"+
		"\u0000\u01bb\u01b0\u0001\u0000\u0000\u0000\u01bb\u01bc\u0001\u0000\u0000"+
		"\u0000\u01bc\u01bd\u0001\u0000\u0000\u0000\u01bd\u01be\u0005\u0002\u0000"+
		"\u0000\u01be;\u0001\u0000\u0000\u0000\u01bf\u01c0\u0005L\u0000\u0000\u01c0"+
		"\u01c1\u0005\u0003\u0000\u0000\u01c1\u01c2\u0003>\u001f\u0000\u01c2=\u0001"+
		"\u0000\u0000\u0000\u01c3\u01c8\u0005\u0001\u0000\u0000\u01c4\u01c5\u0005"+
		"a\u0000\u0000\u01c5\u01c7\u0005\t\u0000\u0000\u01c6\u01c4\u0001\u0000"+
		"\u0000\u0000\u01c7\u01ca\u0001\u0000\u0000\u0000\u01c8\u01c6\u0001\u0000"+
		"\u0000\u0000\u01c8\u01c9\u0001\u0000\u0000\u0000\u01c9\u01cb\u0001\u0000"+
		"\u0000\u0000\u01ca\u01c8\u0001\u0000\u0000\u0000\u01cb\u01cc\u0005\u0002"+
		"\u0000\u0000\u01cc\u01d0\u0005\u0006\u0000\u0000\u01cd\u01cf\u0003Z-\u0000"+
		"\u01ce\u01cd\u0001\u0000\u0000\u0000\u01cf\u01d2\u0001\u0000\u0000\u0000"+
		"\u01d0\u01ce\u0001\u0000\u0000\u0000\u01d0\u01d1\u0001\u0000\u0000\u0000"+
		"\u01d1\u01d3\u0001\u0000\u0000\u0000\u01d2\u01d0\u0001\u0000\u0000\u0000"+
		"\u01d3\u01d4\u0005\u0007\u0000\u0000\u01d4?\u0001\u0000\u0000\u0000\u01d5"+
		"\u01d6\u0005\u0014\u0000\u0000\u01d6\u01e2\u0005\u0001\u0000\u0000\u01d7"+
		"\u01dc\u0003B!\u0000\u01d8\u01d9\u0005\t\u0000\u0000\u01d9\u01db\u0003"+
		"B!\u0000\u01da\u01d8\u0001\u0000\u0000\u0000\u01db\u01de\u0001\u0000\u0000"+
		"\u0000\u01dc\u01da\u0001\u0000\u0000\u0000\u01dc\u01dd\u0001\u0000\u0000"+
		"\u0000\u01dd\u01e0\u0001\u0000\u0000\u0000\u01de\u01dc\u0001\u0000\u0000"+
		"\u0000\u01df\u01e1\u0005\t\u0000\u0000\u01e0\u01df\u0001\u0000\u0000\u0000"+
		"\u01e0\u01e1\u0001\u0000\u0000\u0000\u01e1\u01e3\u0001\u0000\u0000\u0000"+
		"\u01e2\u01d7\u0001\u0000\u0000\u0000\u01e2\u01e3\u0001\u0000\u0000\u0000"+
		"\u01e3\u01e4\u0001\u0000\u0000\u0000\u01e4\u01e5\u0005\u0002\u0000\u0000"+
		"\u01e5A\u0001\u0000\u0000\u0000\u01e6\u01e7\u0005;\u0000\u0000\u01e7\u01e8"+
		"\u0005\u0003\u0000\u0000\u01e8\u01eb\u0003D\"\u0000\u01e9\u01eb\u0003"+
		"h4\u0000\u01ea\u01e6\u0001\u0000\u0000\u0000\u01ea\u01e9\u0001\u0000\u0000"+
		"\u0000\u01ebC\u0001\u0000\u0000\u0000\u01ec\u01ed\u0005\u0015\u0000\u0000"+
		"\u01ed\u01f9\u0005\u0001\u0000\u0000\u01ee\u01f3\u0003F#\u0000\u01ef\u01f0"+
		"\u0005\t\u0000\u0000\u01f0\u01f2\u0003F#\u0000\u01f1\u01ef\u0001\u0000"+
		"\u0000\u0000\u01f2\u01f5\u0001\u0000\u0000\u0000\u01f3\u01f1\u0001\u0000"+
		"\u0000\u0000\u01f3\u01f4\u0001\u0000\u0000\u0000\u01f4\u01f7\u0001\u0000"+
		"\u0000\u0000\u01f5\u01f3\u0001\u0000\u0000\u0000\u01f6\u01f8\u0005\t\u0000"+
		"\u0000\u01f7\u01f6\u0001\u0000\u0000\u0000\u01f7\u01f8\u0001\u0000\u0000"+
		"\u0000\u01f8\u01fa\u0001\u0000\u0000\u0000\u01f9\u01ee\u0001\u0000\u0000"+
		"\u0000\u01f9\u01fa\u0001\u0000\u0000\u0000\u01fa\u01fb\u0001\u0000\u0000"+
		"\u0000\u01fb\u020d\u0005\u0002\u0000\u0000\u01fc\u01fd\u0005\u0016\u0000"+
		"\u0000\u01fd\u0209\u0005\u0001\u0000\u0000\u01fe\u0203\u0003H$\u0000\u01ff"+
		"\u0200\u0005\t\u0000\u0000\u0200\u0202\u0003H$\u0000\u0201\u01ff\u0001"+
		"\u0000\u0000\u0000\u0202\u0205\u0001\u0000\u0000\u0000\u0203\u0201\u0001"+
		"\u0000\u0000\u0000\u0203\u0204\u0001\u0000\u0000\u0000\u0204\u0207\u0001"+
		"\u0000\u0000\u0000\u0205\u0203\u0001\u0000\u0000\u0000\u0206\u0208\u0005"+
		"\t\u0000\u0000\u0207\u0206\u0001\u0000\u0000\u0000\u0207\u0208\u0001\u0000"+
		"\u0000\u0000\u0208\u020a\u0001\u0000\u0000\u0000\u0209\u01fe\u0001\u0000"+
		"\u0000\u0000\u0209\u020a\u0001\u0000\u0000\u0000\u020a\u020b\u0001\u0000"+
		"\u0000\u0000\u020b\u020d\u0005\u0002\u0000\u0000\u020c\u01ec\u0001\u0000"+
		"\u0000\u0000\u020c\u01fc\u0001\u0000\u0000\u0000\u020dE\u0001\u0000\u0000"+
		"\u0000\u020e\u020f\u0005\\\u0000\u0000\u020f\u0210\u0005\u0003\u0000\u0000"+
		"\u0210\u021b\u0007\u0002\u0000\u0000\u0211\u0212\u0005]\u0000\u0000\u0212"+
		"\u0213\u0005\u0003\u0000\u0000\u0213\u021b\u0007\u0002\u0000\u0000\u0214"+
		"\u0215\u0005_\u0000\u0000\u0215\u0216\u0005\u0003\u0000\u0000\u0216\u021b"+
		"\u0007\u0002\u0000\u0000\u0217\u0218\u0005^\u0000\u0000\u0218\u0219\u0005"+
		"\u0003\u0000\u0000\u0219\u021b\u0007\u0002\u0000\u0000\u021a\u020e\u0001"+
		"\u0000\u0000\u0000\u021a\u0211\u0001\u0000\u0000\u0000\u021a\u0214\u0001"+
		"\u0000\u0000\u0000\u021a\u0217\u0001\u0000\u0000\u0000\u021bG\u0001\u0000"+
		"\u0000\u0000\u021c\u021d\u0005@\u0000\u0000\u021d\u021e\u0005\u0003\u0000"+
		"\u0000\u021e\u0223\u0007\u0002\u0000\u0000\u021f\u0220\u0005A\u0000\u0000"+
		"\u0220\u0221\u0005\u0003\u0000\u0000\u0221\u0223\u0007\u0002\u0000\u0000"+
		"\u0222\u021c\u0001\u0000\u0000\u0000\u0222\u021f\u0001\u0000\u0000\u0000"+
		"\u0223I\u0001\u0000\u0000\u0000\u0224\u0225\u0005\u0017\u0000\u0000\u0225"+
		"\u0231\u0005\u0001\u0000\u0000\u0226\u022b\u0003L&\u0000\u0227\u0228\u0005"+
		"\t\u0000\u0000\u0228\u022a\u0003L&\u0000\u0229\u0227\u0001\u0000\u0000"+
		"\u0000\u022a\u022d\u0001\u0000\u0000\u0000\u022b\u0229\u0001\u0000\u0000"+
		"\u0000\u022b\u022c\u0001\u0000\u0000\u0000\u022c\u022f\u0001\u0000\u0000"+
		"\u0000\u022d\u022b\u0001\u0000\u0000\u0000\u022e\u0230\u0005\t\u0000\u0000"+
		"\u022f\u022e\u0001\u0000\u0000\u0000\u022f\u0230\u0001\u0000\u0000\u0000"+
		"\u0230\u0232\u0001\u0000\u0000\u0000\u0231\u0226\u0001\u0000\u0000\u0000"+
		"\u0231\u0232\u0001\u0000\u0000\u0000\u0232\u0233\u0001\u0000\u0000\u0000"+
		"\u0233\u0234\u0005\u0002\u0000\u0000\u0234K\u0001\u0000\u0000\u0000\u0235"+
		"\u0236\u0005C\u0000\u0000\u0236\u0237\u0005\u0003\u0000\u0000\u0237\u023e"+
		"\u0005d\u0000\u0000\u0238\u0239\u0005B\u0000\u0000\u0239\u023a\u0005\u0003"+
		"\u0000\u0000\u023a\u023e\u0007\u0005\u0000\u0000\u023b\u023e\u0003b1\u0000"+
		"\u023c\u023e\u0003d2\u0000\u023d\u0235\u0001\u0000\u0000\u0000\u023d\u0238"+
		"\u0001\u0000\u0000\u0000\u023d\u023b\u0001\u0000\u0000\u0000\u023d\u023c"+
		"\u0001\u0000\u0000\u0000\u023eM\u0001\u0000\u0000\u0000\u023f\u0240\u0005"+
		"\u0018\u0000\u0000\u0240\u024c\u0005\u0001\u0000\u0000\u0241\u0246\u0003"+
		"P(\u0000\u0242\u0243\u0005\t\u0000\u0000\u0243\u0245\u0003P(\u0000\u0244"+
		"\u0242\u0001\u0000\u0000\u0000\u0245\u0248\u0001\u0000\u0000\u0000\u0246"+
		"\u0244\u0001\u0000\u0000\u0000\u0246\u0247\u0001\u0000\u0000\u0000\u0247"+
		"\u024a\u0001\u0000\u0000\u0000\u0248\u0246\u0001\u0000\u0000\u0000\u0249"+
		"\u024b\u0005\t\u0000\u0000\u024a\u0249\u0001\u0000\u0000\u0000\u024a\u024b"+
		"\u0001\u0000\u0000\u0000\u024b\u024d\u0001\u0000\u0000\u0000\u024c\u0241"+
		"\u0001\u0000\u0000\u0000\u024c\u024d\u0001\u0000\u0000\u0000\u024d\u024e"+
		"\u0001\u0000\u0000\u0000\u024e\u024f\u0005\u0002\u0000\u0000\u024fO\u0001"+
		"\u0000\u0000\u0000\u0250\u025f\u0003b1\u0000\u0251\u025f\u0003d2\u0000"+
		"\u0252\u0253\u0005D\u0000\u0000\u0253\u0254\u0005\u0003\u0000\u0000\u0254"+
		"\u025f\u0005d\u0000\u0000\u0255\u0256\u0005E\u0000\u0000\u0256\u0257\u0005"+
		"\u0003\u0000\u0000\u0257\u025f\u0005e\u0000\u0000\u0258\u0259\u0005F\u0000"+
		"\u0000\u0259\u025a\u0005\u0003\u0000\u0000\u025a\u025f\u0005e\u0000\u0000"+
		"\u025b\u025c\u0005L\u0000\u0000\u025c\u025d\u0005\u0003\u0000\u0000\u025d"+
		"\u025f\u0003>\u001f\u0000\u025e\u0250\u0001\u0000\u0000\u0000\u025e\u0251"+
		"\u0001\u0000\u0000\u0000\u025e\u0252\u0001\u0000\u0000\u0000\u025e\u0255"+
		"\u0001\u0000\u0000\u0000\u025e\u0258\u0001\u0000\u0000\u0000\u025e\u025b"+
		"\u0001\u0000\u0000\u0000\u025fQ\u0001\u0000\u0000\u0000\u0260\u0261\u0005"+
		"\u001a\u0000\u0000\u0261\u026d\u0005\u0001\u0000\u0000\u0262\u0267\u0003"+
		"T*\u0000\u0263\u0264\u0005\t\u0000\u0000\u0264\u0266\u0003T*\u0000\u0265"+
		"\u0263\u0001\u0000\u0000\u0000\u0266\u0269\u0001\u0000\u0000\u0000\u0267"+
		"\u0265\u0001\u0000\u0000\u0000\u0267\u0268\u0001\u0000\u0000\u0000\u0268"+
		"\u026b\u0001\u0000\u0000\u0000\u0269\u0267\u0001\u0000\u0000\u0000\u026a"+
		"\u026c\u0005\t\u0000\u0000\u026b\u026a\u0001\u0000\u0000\u0000\u026b\u026c"+
		"\u0001\u0000\u0000\u0000\u026c\u026e\u0001\u0000\u0000\u0000\u026d\u0262"+
		"\u0001\u0000\u0000\u0000\u026d\u026e\u0001\u0000\u0000\u0000\u026e\u026f"+
		"\u0001\u0000\u0000\u0000\u026f\u0270\u0005\u0002\u0000\u0000\u0270S\u0001"+
		"\u0000\u0000\u0000\u0271\u0272\u0005T\u0000\u0000\u0272\u0273\u0005\u0003"+
		"\u0000\u0000\u0273\u0287\u0005d\u0000\u0000\u0274\u0275\u0005U\u0000\u0000"+
		"\u0275\u0276\u0005\u0003\u0000\u0000\u0276\u0287\u0005d\u0000\u0000\u0277"+
		"\u0278\u0005V\u0000\u0000\u0278\u0279\u0005\u0003\u0000\u0000\u0279\u0287"+
		"\u0005e\u0000\u0000\u027a\u027b\u0005;\u0000\u0000\u027b\u027c\u0005\u0003"+
		"\u0000\u0000\u027c\u0287\u0003D\"\u0000\u027d\u027e\u0005W\u0000\u0000"+
		"\u027e\u027f\u0005\u0003\u0000\u0000\u027f\u0287\u0005d\u0000\u0000\u0280"+
		"\u0281\u0005X\u0000\u0000\u0281\u0282\u0005\u0003\u0000\u0000\u0282\u0287"+
		"\u0003V+\u0000\u0283\u0284\u0005[\u0000\u0000\u0284\u0285\u0005\u0003"+
		"\u0000\u0000\u0285\u0287\u0003>\u001f\u0000\u0286\u0271\u0001\u0000\u0000"+
		"\u0000\u0286\u0274\u0001\u0000\u0000\u0000\u0286\u0277\u0001\u0000\u0000"+
		"\u0000\u0286\u027a\u0001\u0000\u0000\u0000\u0286\u027d\u0001\u0000\u0000"+
		"\u0000\u0286\u0280\u0001\u0000\u0000\u0000\u0286\u0283\u0001\u0000\u0000"+
		"\u0000\u0287U\u0001\u0000\u0000\u0000\u0288\u0289\u0005\u001b\u0000\u0000"+
		"\u0289\u0295\u0005\u0001\u0000\u0000\u028a\u028f\u0003X,\u0000\u028b\u028c"+
		"\u0005\t\u0000\u0000\u028c\u028e\u0003X,\u0000\u028d\u028b\u0001\u0000"+
		"\u0000\u0000\u028e\u0291\u0001\u0000\u0000\u0000\u028f\u028d\u0001\u0000"+
		"\u0000\u0000\u028f\u0290\u0001\u0000\u0000\u0000\u0290\u0293\u0001\u0000"+
		"\u0000\u0000\u0291\u028f\u0001\u0000\u0000\u0000\u0292\u0294\u0005\t\u0000"+
		"\u0000\u0293\u0292\u0001\u0000\u0000\u0000\u0293\u0294\u0001\u0000\u0000"+
		"\u0000\u0294\u0296\u0001\u0000\u0000\u0000\u0295\u028a\u0001\u0000\u0000"+
		"\u0000\u0295\u0296\u0001\u0000\u0000\u0000\u0296\u0297\u0001\u0000\u0000"+
		"\u0000\u0297\u0298\u0005\u0002\u0000\u0000\u0298W\u0001\u0000\u0000\u0000"+
		"\u0299\u029a\u0005Y\u0000\u0000\u029a\u029b\u0005\u0003\u0000\u0000\u029b"+
		"\u02a1\u0005c\u0000\u0000\u029c\u029d\u00059\u0000\u0000\u029d\u029e\u0005"+
		"\u0003\u0000\u0000\u029e\u02a1\u0003,\u0016\u0000\u029f\u02a1\u0003f3"+
		"\u0000\u02a0\u0299\u0001\u0000\u0000\u0000\u02a0\u029c\u0001\u0000\u0000"+
		"\u0000\u02a0\u029f\u0001\u0000\u0000\u0000\u02a1Y\u0001\u0000\u0000\u0000"+
		"\u02a2\u02a6\u0003\\.\u0000\u02a3\u02a6\u0003^/\u0000\u02a4\u02a6\u0003"+
		"`0\u0000\u02a5\u02a2\u0001\u0000\u0000\u0000\u02a5\u02a3\u0001\u0000\u0000"+
		"\u0000\u02a5\u02a4\u0001\u0000\u0000\u0000\u02a6[\u0001\u0000\u0000\u0000"+
		"\u02a7\u02a8\u0007\u0006\u0000\u0000\u02a8\u02a9\u0005a\u0000\u0000\u02a9"+
		"\u02b7\u0005\b\u0000\u0000\u02aa\u02ab\u0005&\u0000\u0000\u02ab\u02b0"+
		"\u0005\u0001\u0000\u0000\u02ac\u02ad\u0007\u0006\u0000\u0000\u02ad\u02af"+
		"\u0005\t\u0000\u0000\u02ae\u02ac\u0001\u0000\u0000\u0000\u02af\u02b2\u0001"+
		"\u0000\u0000\u0000\u02b0\u02ae\u0001\u0000\u0000\u0000\u02b0\u02b1\u0001"+
		"\u0000\u0000\u0000\u02b1\u02b3\u0001\u0000\u0000\u0000\u02b2\u02b0\u0001"+
		"\u0000\u0000\u0000\u02b3\u02b4\u0005\u0002\u0000\u0000\u02b4\u02b5\u0005"+
		"a\u0000\u0000\u02b5\u02b7\u0005\b\u0000\u0000\u02b6\u02a7\u0001\u0000"+
		"\u0000\u0000\u02b6\u02aa\u0001\u0000\u0000\u0000\u02b7]\u0001\u0000\u0000"+
		"\u0000\u02b8\u02b9\u0005a\u0000\u0000\u02b9\u02ba\u0005\n\u0000\u0000"+
		"\u02ba\u02bb\u0007\u0000\u0000\u0000\u02bb\u02bc\u0005\b\u0000\u0000\u02bc"+
		"_\u0001\u0000\u0000\u0000\u02bd\u02be\u0005!\u0000\u0000\u02be\u02bf\u0005"+
		"`\u0000\u0000\u02bf\u02c3\u0005\u0006\u0000\u0000\u02c0\u02c2\u0003\\"+
		".\u0000\u02c1\u02c0\u0001\u0000\u0000\u0000\u02c2\u02c5\u0001\u0000\u0000"+
		"\u0000\u02c3\u02c1\u0001\u0000\u0000\u0000\u02c3\u02c4\u0001\u0000\u0000"+
		"\u0000\u02c4\u02c6\u0001\u0000\u0000\u0000\u02c5\u02c3\u0001\u0000\u0000"+
		"\u0000\u02c6\u02c7\u0005%\u0000\u0000\u02c7\u02c8\u0005\u0001\u0000\u0000"+
		"\u02c8\u02c9\u0003\n\u0005\u0000\u02c9\u02ca\u0005\u0002\u0000\u0000\u02ca"+
		"\u02cb\u0005\u0007\u0000\u0000\u02cba\u0001\u0000\u0000\u0000\u02cc\u02cd"+
		"\u0005-\u0000\u0000\u02cd\u02ce\u0005\u0003\u0000\u0000\u02ce\u02cf\u0007"+
		"\u0002\u0000\u0000\u02cfc\u0001\u0000\u0000\u0000\u02d0\u02d1\u0005.\u0000"+
		"\u0000\u02d1\u02d2\u0005\u0003\u0000\u0000\u02d2\u02d3\u0007\u0002\u0000"+
		"\u0000\u02d3e\u0001\u0000\u0000\u0000\u02d4\u02d5\u00058\u0000\u0000\u02d5"+
		"\u02d6\u0005\u0003\u0000\u0000\u02d6\u02d7\u0005e\u0000\u0000\u02d7g\u0001"+
		"\u0000\u0000\u0000\u02d8\u02d9\u0005 \u0000\u0000\u02d9\u02da\u0005\u0003"+
		"\u0000\u0000\u02da\u02db\u0003\n\u0005\u0000\u02dbi\u0001\u0000\u0000"+
		"\u0000\u02dc\u02dd\u0005\u001e\u0000\u0000\u02dd\u02de\u0005\u0003\u0000"+
		"\u0000\u02de\u02ea\u0005\u0004\u0000\u0000\u02df\u02e4\u0003\n\u0005\u0000"+
		"\u02e0\u02e1\u0005\t\u0000\u0000\u02e1\u02e3\u0003\n\u0005\u0000\u02e2"+
		"\u02e0\u0001\u0000\u0000\u0000\u02e3\u02e6\u0001\u0000\u0000\u0000\u02e4"+
		"\u02e2\u0001\u0000\u0000\u0000\u02e4\u02e5\u0001\u0000\u0000\u0000\u02e5"+
		"\u02e8\u0001\u0000\u0000\u0000\u02e6\u02e4\u0001\u0000\u0000\u0000\u02e7"+
		"\u02e9\u0005\t\u0000\u0000\u02e8\u02e7\u0001\u0000\u0000\u0000\u02e8\u02e9"+
		"\u0001\u0000\u0000\u0000\u02e9\u02eb\u0001\u0000\u0000\u0000\u02ea\u02df"+
		"\u0001\u0000\u0000\u0000\u02ea\u02eb\u0001\u0000\u0000\u0000\u02eb\u02ec"+
		"\u0001\u0000\u0000\u0000\u02ec\u02ed\u0005\u0005\u0000\u0000\u02edk\u0001"+
		"\u0000\u0000\u0000\u02ee\u02ef\u00052\u0000\u0000\u02ef\u02f0\u0005\u0003"+
		"\u0000\u0000\u02f0\u02f1\u0007\u0007\u0000\u0000\u02f1m\u0001\u0000\u0000"+
		"\u0000\u02f2\u02f3\u00055\u0000\u0000\u02f3\u02f4\u0005\u0003\u0000\u0000"+
		"\u02f4\u02f5\u0007\b\u0000\u0000\u02f5o\u0001\u0000\u0000\u0000Xsw\u0082"+
		"\u0086\u0088\u0092\u009b\u009f\u00a1\u00ab\u00b9\u00c2\u00c6\u00c8\u00d7"+
		"\u00db\u00dd\u00e4\u00ed\u00f1\u00f3\u0100\u0104\u0106\u010d\u0116\u011a"+
		"\u011c\u012f\u0138\u013c\u013e\u0149\u0156\u015a\u015c\u0162\u016a\u0170"+
		"\u017b\u017f\u0181\u0195\u019e\u01a2\u01a4\u01ac\u01b5\u01b9\u01bb\u01c8"+
		"\u01d0\u01dc\u01e0\u01e2\u01ea\u01f3\u01f7\u01f9\u0203\u0207\u0209\u020c"+
		"\u021a\u0222\u022b\u022f\u0231\u023d\u0246\u024a\u024c\u025e\u0267\u026b"+
		"\u026d\u0286\u028f\u0293\u0295\u02a0\u02a5\u02b0\u02b6\u02c3\u02e4\u02e8"+
		"\u02ea";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}