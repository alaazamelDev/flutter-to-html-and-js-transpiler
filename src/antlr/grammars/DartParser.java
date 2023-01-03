// Generated from C:/Users/anasr/Desktop/state/compilerproject/src/grammars\DartParser.g4 by ANTLR 4.10.1
package grammars;
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
		RULE_variableAssignment = 47, RULE_variables = 48, RULE_tree = 49, RULE_widthProperty = 50, 
		RULE_heightProperty = 51, RULE_colorProperty = 52, RULE_childProperty = 53, 
		RULE_childrenProperty = 54, RULE_mainAxisSizeProperty = 55, RULE_crossAxisAlignmentProperty = 56;
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
			"statment", "variableDeclaration", "variableAssignment", "variables", 
			"tree", "widthProperty", "heightProperty", "colorProperty", "childProperty", 
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
		public List<ScaffoldContext> scaffold() {
			return getRuleContexts(ScaffoldContext.class);
		}
		public ScaffoldContext scaffold(int i) {
			return getRuleContext(ScaffoldContext.class,i);
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
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 34)) & ~0x3f) == 0 && ((1L << (_la - 34)) & ((1L << (INT - 34)) | (1L << (STRINGTYPE - 34)) | (1L << (DOUBLE - 34)) | (1L << (FUNCTION - 34)) | (1L << (IDENTIFIER - 34)))) != 0)) {
				{
				{
				setState(114);
				statment();
				}
				}
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SCAFFOLD) {
				{
				{
				setState(120);
				scaffold();
				}
				}
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
<<<<<<< Updated upstream
			setState(126);
=======
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SCAFFOLD) {
				{
				{
				setState(118);
				scaffold();
				}
				}
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(124);
>>>>>>> Stashed changes
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
<<<<<<< Updated upstream
			setState(128);
			match(SCAFFOLD);
			setState(129);
			match(LP);
			setState(141);
=======
			setState(126);
			match(SCAFFOLD);
			setState(127);
			match(LP);
			setState(139);
>>>>>>> Stashed changes
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BODY || _la==APPBARATRIB) {
				{
<<<<<<< Updated upstream
				setState(130);
				scaffoldProperty();
				setState(135);
=======
				setState(128);
				scaffoldProperty();
				setState(133);
>>>>>>> Stashed changes
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
<<<<<<< Updated upstream
						setState(131);
						match(COMMA);
						setState(132);
=======
						setState(129);
						match(COMMA);
						setState(130);
>>>>>>> Stashed changes
						scaffoldProperty();
						}
						} 
					}
<<<<<<< Updated upstream
					setState(137);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				}
				setState(139);
=======
					setState(135);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				}
				setState(137);
>>>>>>> Stashed changes
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
<<<<<<< Updated upstream
					setState(138);
=======
					setState(136);
>>>>>>> Stashed changes
					match(COMMA);
					}
				}

				}
			}

<<<<<<< Updated upstream
			setState(143);
=======
			setState(141);
>>>>>>> Stashed changes
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
<<<<<<< Updated upstream
			setState(151);
=======
			setState(149);
>>>>>>> Stashed changes
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BODY:
				_localctx = new ScaffoldBodyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
<<<<<<< Updated upstream
				setState(145);
				match(BODY);
				setState(146);
				match(COLON);
				setState(147);
=======
				setState(143);
				match(BODY);
				setState(144);
				match(COLON);
				setState(145);
>>>>>>> Stashed changes
				widget();
				}
				break;
			case APPBARATRIB:
				_localctx = new ScaffoldAppBarContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
<<<<<<< Updated upstream
				setState(148);
				match(APPBARATRIB);
				setState(149);
				match(COLON);
				setState(150);
=======
				setState(146);
				match(APPBARATRIB);
				setState(147);
				match(COLON);
				setState(148);
>>>>>>> Stashed changes
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
<<<<<<< Updated upstream
			setState(153);
			match(APPBAR);
			setState(154);
			match(LP);
			setState(166);
=======
			setState(151);
			match(APPBAR);
			setState(152);
			match(LP);
			setState(164);
>>>>>>> Stashed changes
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TITLE || _la==CENTERTITLE) {
				{
<<<<<<< Updated upstream
				setState(155);
				appBarProperties();
				setState(160);
=======
				setState(153);
				appBarProperties();
				setState(158);
>>>>>>> Stashed changes
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
<<<<<<< Updated upstream
						setState(156);
						match(COMMA);
						setState(157);
=======
						setState(154);
						match(COMMA);
						setState(155);
>>>>>>> Stashed changes
						appBarProperties();
						}
						} 
					}
<<<<<<< Updated upstream
					setState(162);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				}
				setState(164);
=======
					setState(160);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				}
				setState(162);
>>>>>>> Stashed changes
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
<<<<<<< Updated upstream
					setState(163);
=======
					setState(161);
>>>>>>> Stashed changes
					match(COMMA);
					}
				}

				}
			}

<<<<<<< Updated upstream
			setState(168);
=======
			setState(166);
>>>>>>> Stashed changes
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
<<<<<<< Updated upstream
			setState(176);
=======
			setState(174);
>>>>>>> Stashed changes
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TITLE:
				_localctx = new AppBarTitleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
<<<<<<< Updated upstream
				setState(170);
				match(TITLE);
				setState(171);
				match(COLON);
				setState(172);
=======
				setState(168);
				match(TITLE);
				setState(169);
				match(COLON);
				setState(170);
>>>>>>> Stashed changes
				match(STRING);
				}
				break;
			case CENTERTITLE:
				_localctx = new AppBarCenterTitleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
<<<<<<< Updated upstream
				setState(173);
				match(CENTERTITLE);
				setState(174);
				match(COLON);
				setState(175);
=======
				setState(171);
				match(CENTERTITLE);
				setState(172);
				match(COLON);
				setState(173);
>>>>>>> Stashed changes
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
		public WidgetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_widget; }
	 
		public WidgetContext() { }
		public void copyFrom(WidgetContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RowWidgetContext extends WidgetContext {
		public RowContext row() {
			return getRuleContext(RowContext.class,0);
		}
		public RowWidgetContext(WidgetContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterRowWidget(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitRowWidget(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitRowWidget(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpandedWidgetContext extends WidgetContext {
		public ExpandedContext expanded() {
			return getRuleContext(ExpandedContext.class,0);
		}
		public ExpandedWidgetContext(WidgetContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterExpandedWidget(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitExpandedWidget(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitExpandedWidget(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TextWidgetContext extends WidgetContext {
		public TextContext text() {
			return getRuleContext(TextContext.class,0);
		}
		public TextWidgetContext(WidgetContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterTextWidget(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitTextWidget(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitTextWidget(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreatedWidgetContext extends WidgetContext {
		public CustomWidgetContext customWidget() {
			return getRuleContext(CustomWidgetContext.class,0);
		}
		public CreatedWidgetContext(WidgetContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterCreatedWidget(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitCreatedWidget(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitCreatedWidget(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GestureDetectorWidgetContext extends WidgetContext {
		public GestureDetectorContext gestureDetector() {
			return getRuleContext(GestureDetectorContext.class,0);
		}
		public GestureDetectorWidgetContext(WidgetContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterGestureDetectorWidget(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitGestureDetectorWidget(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitGestureDetectorWidget(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CenterWidgetContext extends WidgetContext {
		public CenterContext center() {
			return getRuleContext(CenterContext.class,0);
		}
		public CenterWidgetContext(WidgetContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterCenterWidget(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitCenterWidget(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitCenterWidget(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TextFieldWidgetContext extends WidgetContext {
		public TextFieldContext textField() {
			return getRuleContext(TextFieldContext.class,0);
		}
		public TextFieldWidgetContext(WidgetContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterTextFieldWidget(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitTextFieldWidget(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitTextFieldWidget(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ImageWidgetContext extends WidgetContext {
		public ImageContext image() {
			return getRuleContext(ImageContext.class,0);
		}
		public ImageWidgetContext(WidgetContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterImageWidget(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitImageWidget(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitImageWidget(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PaddingWidgetContext extends WidgetContext {
		public PaddingContext padding() {
			return getRuleContext(PaddingContext.class,0);
		}
		public PaddingWidgetContext(WidgetContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterPaddingWidget(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitPaddingWidget(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitPaddingWidget(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ContainerWidgetContext extends WidgetContext {
		public ContainerContext container() {
			return getRuleContext(ContainerContext.class,0);
		}
		public ContainerWidgetContext(WidgetContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterContainerWidget(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitContainerWidget(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitContainerWidget(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnWidgetContext extends WidgetContext {
		public ColumnContext column() {
			return getRuleContext(ColumnContext.class,0);
		}
		public ColumnWidgetContext(WidgetContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterColumnWidget(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitColumnWidget(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitColumnWidget(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ButtonWidgetContext extends WidgetContext {
		public ButtonContext button() {
			return getRuleContext(ButtonContext.class,0);
		}
		public ButtonWidgetContext(WidgetContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterButtonWidget(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitButtonWidget(this);
		}
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
<<<<<<< Updated upstream
			setState(190);
=======
			setState(188);
>>>>>>> Stashed changes
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ROW:
				_localctx = new RowWidgetContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
<<<<<<< Updated upstream
				setState(178);
=======
				setState(176);
>>>>>>> Stashed changes
				row();
				}
				break;
			case CENTER:
				_localctx = new CenterWidgetContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
<<<<<<< Updated upstream
				setState(179);
=======
				setState(177);
>>>>>>> Stashed changes
				center();
				}
				break;
			case TEXT:
				_localctx = new TextWidgetContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
<<<<<<< Updated upstream
				setState(180);
=======
				setState(178);
>>>>>>> Stashed changes
				text();
				}
				break;
			case CONTAINER:
				_localctx = new ContainerWidgetContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
<<<<<<< Updated upstream
				setState(181);
=======
				setState(179);
>>>>>>> Stashed changes
				container();
				}
				break;
			case EXPANDED:
				_localctx = new ExpandedWidgetContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
<<<<<<< Updated upstream
				setState(182);
=======
				setState(180);
>>>>>>> Stashed changes
				expanded();
				}
				break;
			case COLUMN:
				_localctx = new ColumnWidgetContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
<<<<<<< Updated upstream
				setState(183);
=======
				setState(181);
>>>>>>> Stashed changes
				column();
				}
				break;
			case GESTUREDETECTOR:
				_localctx = new GestureDetectorWidgetContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
<<<<<<< Updated upstream
				setState(184);
=======
				setState(182);
>>>>>>> Stashed changes
				gestureDetector();
				}
				break;
			case PADDING:
				_localctx = new PaddingWidgetContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
<<<<<<< Updated upstream
				setState(185);
=======
				setState(183);
>>>>>>> Stashed changes
				padding();
				}
				break;
			case IMAGE:
				_localctx = new ImageWidgetContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
<<<<<<< Updated upstream
				setState(186);
=======
				setState(184);
>>>>>>> Stashed changes
				image();
				}
				break;
			case BUTTON:
				_localctx = new ButtonWidgetContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
<<<<<<< Updated upstream
				setState(187);
=======
				setState(185);
>>>>>>> Stashed changes
				button();
				}
				break;
			case WIDGETNAME:
				_localctx = new CreatedWidgetContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
<<<<<<< Updated upstream
				setState(188);
=======
				setState(186);
>>>>>>> Stashed changes
				customWidget();
				}
				break;
			case TEXTFIELD:
				_localctx = new TextFieldWidgetContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
<<<<<<< Updated upstream
				setState(189);
=======
				setState(187);
>>>>>>> Stashed changes
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
<<<<<<< Updated upstream
			setState(192);
			match(WIDGETNAME);
			setState(193);
			match(LP);
			setState(205);
=======
			setState(190);
			match(WIDGETNAME);
			setState(191);
			match(LP);
			setState(203);
>>>>>>> Stashed changes
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
<<<<<<< Updated upstream
				setState(194);
				customWidgetProperties();
				setState(199);
=======
				setState(192);
				customWidgetProperties();
				setState(197);
>>>>>>> Stashed changes
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
<<<<<<< Updated upstream
						setState(195);
						match(COMMA);
						setState(196);
=======
						setState(193);
						match(COMMA);
						setState(194);
>>>>>>> Stashed changes
						customWidgetProperties();
						}
						} 
					}
<<<<<<< Updated upstream
					setState(201);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				}
				setState(203);
=======
					setState(199);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				}
				setState(201);
>>>>>>> Stashed changes
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
<<<<<<< Updated upstream
					setState(202);
=======
					setState(200);
>>>>>>> Stashed changes
					match(COMMA);
					}
				}

				}
			}

<<<<<<< Updated upstream
			setState(207);
=======
			setState(205);
>>>>>>> Stashed changes
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
<<<<<<< Updated upstream
			setState(209);
			match(IDENTIFIER);
			setState(210);
			match(COLON);
			setState(211);
=======
			setState(207);
			match(IDENTIFIER);
			setState(208);
			match(COLON);
			setState(209);
>>>>>>> Stashed changes
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
<<<<<<< Updated upstream
			setState(213);
			match(ROW);
			setState(214);
			match(LP);
			setState(226);
=======
			setState(211);
			match(ROW);
			setState(212);
			match(LP);
			setState(224);
>>>>>>> Stashed changes
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CHILDREN) | (1L << MAINAXISSIZE) | (1L << CROSSAXISALIGNMENT))) != 0)) {
				{
<<<<<<< Updated upstream
				setState(215);
				rowProperties();
				setState(220);
=======
				setState(213);
				rowProperties();
				setState(218);
>>>>>>> Stashed changes
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
<<<<<<< Updated upstream
						setState(216);
						match(COMMA);
						setState(217);
=======
						setState(214);
						match(COMMA);
						setState(215);
>>>>>>> Stashed changes
						rowProperties();
						}
						} 
					}
<<<<<<< Updated upstream
					setState(222);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				}
				setState(224);
=======
					setState(220);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				}
				setState(222);
>>>>>>> Stashed changes
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
<<<<<<< Updated upstream
					setState(223);
=======
					setState(221);
>>>>>>> Stashed changes
					match(COMMA);
					}
				}

				}
			}

<<<<<<< Updated upstream
			setState(228);
=======
			setState(226);
>>>>>>> Stashed changes
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
		public RowPropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rowProperties; }
	 
		public RowPropertiesContext() { }
		public void copyFrom(RowPropertiesContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RowChildrenContext extends RowPropertiesContext {
		public ChildrenPropertyContext childrenProperty() {
			return getRuleContext(ChildrenPropertyContext.class,0);
		}
		public RowChildrenContext(RowPropertiesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterRowChildren(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitRowChildren(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitRowChildren(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RowCrossAxisAlignmentContext extends RowPropertiesContext {
		public CrossAxisAlignmentPropertyContext crossAxisAlignmentProperty() {
			return getRuleContext(CrossAxisAlignmentPropertyContext.class,0);
		}
		public RowCrossAxisAlignmentContext(RowPropertiesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterRowCrossAxisAlignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitRowCrossAxisAlignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitRowCrossAxisAlignment(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RowMainAxisSizeContext extends RowPropertiesContext {
		public MainAxisSizePropertyContext mainAxisSizeProperty() {
			return getRuleContext(MainAxisSizePropertyContext.class,0);
		}
		public RowMainAxisSizeContext(RowPropertiesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterRowMainAxisSize(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitRowMainAxisSize(this);
		}
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
<<<<<<< Updated upstream
			setState(233);
=======
			setState(231);
>>>>>>> Stashed changes
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHILDREN:
				_localctx = new RowChildrenContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
<<<<<<< Updated upstream
				setState(230);
=======
				setState(228);
>>>>>>> Stashed changes
				childrenProperty();
				}
				break;
			case MAINAXISSIZE:
				_localctx = new RowMainAxisSizeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
<<<<<<< Updated upstream
				setState(231);
=======
				setState(229);
>>>>>>> Stashed changes
				mainAxisSizeProperty();
				}
				break;
			case CROSSAXISALIGNMENT:
				_localctx = new RowCrossAxisAlignmentContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
<<<<<<< Updated upstream
				setState(232);
=======
				setState(230);
>>>>>>> Stashed changes
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
<<<<<<< Updated upstream
			setState(235);
			match(CENTER);
			setState(236);
			match(LP);
			setState(248);
=======
			setState(233);
			match(CENTER);
			setState(234);
			match(LP);
			setState(246);
>>>>>>> Stashed changes
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CHILD) {
				{
<<<<<<< Updated upstream
				setState(237);
				centerProperties();
				setState(242);
=======
				setState(235);
				centerProperties();
				setState(240);
>>>>>>> Stashed changes
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
<<<<<<< Updated upstream
						setState(238);
						match(COMMA);
						setState(239);
=======
						setState(236);
						match(COMMA);
						setState(237);
>>>>>>> Stashed changes
						centerProperties();
						}
						} 
					}
<<<<<<< Updated upstream
					setState(244);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				}
				setState(246);
=======
					setState(242);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				}
				setState(244);
>>>>>>> Stashed changes
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
<<<<<<< Updated upstream
					setState(245);
=======
					setState(243);
>>>>>>> Stashed changes
					match(COMMA);
					}
				}

				}
			}

<<<<<<< Updated upstream
			setState(250);
=======
			setState(248);
>>>>>>> Stashed changes
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
<<<<<<< Updated upstream
			setState(252);
=======
			setState(250);
>>>>>>> Stashed changes
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
<<<<<<< Updated upstream
			setState(254);
			match(COLUMN);
			setState(255);
			match(LP);
			setState(267);
=======
			setState(252);
			match(COLUMN);
			setState(253);
			match(LP);
			setState(265);
>>>>>>> Stashed changes
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CHILDREN) | (1L << MAINAXISSIZE) | (1L << CROSSAXISALIGNMENT))) != 0)) {
				{
<<<<<<< Updated upstream
				setState(256);
				columnProperties();
				setState(261);
=======
				setState(254);
				columnProperties();
				setState(259);
>>>>>>> Stashed changes
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
<<<<<<< Updated upstream
						setState(257);
						match(COMMA);
						setState(258);
=======
						setState(255);
						match(COMMA);
						setState(256);
>>>>>>> Stashed changes
						columnProperties();
						}
						} 
					}
<<<<<<< Updated upstream
					setState(263);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				}
				setState(265);
=======
					setState(261);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				}
				setState(263);
>>>>>>> Stashed changes
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
<<<<<<< Updated upstream
					setState(264);
=======
					setState(262);
>>>>>>> Stashed changes
					match(COMMA);
					}
				}

				}
			}

<<<<<<< Updated upstream
			setState(269);
=======
			setState(267);
>>>>>>> Stashed changes
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
		public ColumnPropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnProperties; }
	 
		public ColumnPropertiesContext() { }
		public void copyFrom(ColumnPropertiesContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ColumnChildrenContext extends ColumnPropertiesContext {
		public ChildrenPropertyContext childrenProperty() {
			return getRuleContext(ChildrenPropertyContext.class,0);
		}
		public ColumnChildrenContext(ColumnPropertiesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterColumnChildren(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitColumnChildren(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitColumnChildren(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnMainAxisSizeContext extends ColumnPropertiesContext {
		public MainAxisSizePropertyContext mainAxisSizeProperty() {
			return getRuleContext(MainAxisSizePropertyContext.class,0);
		}
		public ColumnMainAxisSizeContext(ColumnPropertiesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterColumnMainAxisSize(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitColumnMainAxisSize(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitColumnMainAxisSize(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnCrossAxisAlignmentContext extends ColumnPropertiesContext {
		public CrossAxisAlignmentPropertyContext crossAxisAlignmentProperty() {
			return getRuleContext(CrossAxisAlignmentPropertyContext.class,0);
		}
		public ColumnCrossAxisAlignmentContext(ColumnPropertiesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterColumnCrossAxisAlignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitColumnCrossAxisAlignment(this);
		}
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
<<<<<<< Updated upstream
			setState(274);
=======
			setState(272);
>>>>>>> Stashed changes
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHILDREN:
				_localctx = new ColumnChildrenContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
<<<<<<< Updated upstream
				setState(271);
=======
				setState(269);
>>>>>>> Stashed changes
				childrenProperty();
				}
				break;
			case MAINAXISSIZE:
				_localctx = new ColumnMainAxisSizeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
<<<<<<< Updated upstream
				setState(272);
=======
				setState(270);
>>>>>>> Stashed changes
				mainAxisSizeProperty();
				}
				break;
			case CROSSAXISALIGNMENT:
				_localctx = new ColumnCrossAxisAlignmentContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
<<<<<<< Updated upstream
				setState(273);
=======
				setState(271);
>>>>>>> Stashed changes
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
<<<<<<< Updated upstream
			setState(276);
			match(TEXT);
			setState(277);
			match(LP);
			setState(289);
=======
			setState(274);
			match(TEXT);
			setState(275);
			match(LP);
			setState(287);
>>>>>>> Stashed changes
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 39)) & ~0x3f) == 0 && ((1L << (_la - 39)) & ((1L << (TEXTATRIB - 39)) | (1L << (FONTWEIGHT - 39)) | (1L << (FONTSIZE - 39)) | (1L << (LETTERSPACING - 39)) | (1L << (TEXTALIGN - 39)))) != 0)) {
				{
<<<<<<< Updated upstream
				setState(278);
				textProperties();
				setState(283);
=======
				setState(276);
				textProperties();
				setState(281);
>>>>>>> Stashed changes
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
<<<<<<< Updated upstream
						setState(279);
						match(COMMA);
						setState(280);
=======
						setState(277);
						match(COMMA);
						setState(278);
>>>>>>> Stashed changes
						textProperties();
						}
						} 
					}
<<<<<<< Updated upstream
					setState(285);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				}
				setState(287);
=======
					setState(283);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				}
				setState(285);
>>>>>>> Stashed changes
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
<<<<<<< Updated upstream
					setState(286);
=======
					setState(284);
>>>>>>> Stashed changes
					match(COMMA);
					}
				}

				}
			}

<<<<<<< Updated upstream
			setState(291);
=======
			setState(289);
>>>>>>> Stashed changes
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
<<<<<<< Updated upstream
			setState(308);
=======
			setState(306);
>>>>>>> Stashed changes
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TEXTATRIB:
				_localctx = new TextContentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
<<<<<<< Updated upstream
				setState(293);
				match(TEXTATRIB);
				setState(294);
				match(COLON);
				setState(295);
=======
				setState(291);
				match(TEXTATRIB);
				setState(292);
				match(COLON);
				setState(293);
>>>>>>> Stashed changes
				match(STRING);
				}
				break;
			case FONTWEIGHT:
				_localctx = new TextFontWeightContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
<<<<<<< Updated upstream
				setState(296);
				match(FONTWEIGHT);
				setState(297);
				match(COLON);
				setState(298);
=======
				setState(294);
				match(FONTWEIGHT);
				setState(295);
				match(COLON);
				setState(296);
>>>>>>> Stashed changes
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
<<<<<<< Updated upstream
				setState(299);
				match(FONTSIZE);
				setState(300);
				match(COLON);
				setState(301);
=======
				setState(297);
				match(FONTSIZE);
				setState(298);
				match(COLON);
				setState(299);
>>>>>>> Stashed changes
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
<<<<<<< Updated upstream
				setState(302);
				match(LETTERSPACING);
				setState(303);
				match(COLON);
				setState(304);
=======
				setState(300);
				match(LETTERSPACING);
				setState(301);
				match(COLON);
				setState(302);
>>>>>>> Stashed changes
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
<<<<<<< Updated upstream
				setState(305);
				match(TEXTALIGN);
				setState(306);
				match(COLON);
				setState(307);
=======
				setState(303);
				match(TEXTALIGN);
				setState(304);
				match(COLON);
				setState(305);
>>>>>>> Stashed changes
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
<<<<<<< Updated upstream
			setState(310);
			match(CONTAINER);
			setState(311);
			match(LP);
			setState(323);
=======
			setState(308);
			match(CONTAINER);
			setState(309);
			match(LP);
			setState(321);
>>>>>>> Stashed changes
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CHILD) | (1L << WIDTH) | (1L << HEIGHT) | (1L << CONTENTALIGNMENT) | (1L << DECORATION))) != 0)) {
				{
<<<<<<< Updated upstream
				setState(312);
				containerProperties();
				setState(317);
=======
				setState(310);
				containerProperties();
				setState(315);
>>>>>>> Stashed changes
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
<<<<<<< Updated upstream
						setState(313);
						match(COMMA);
						setState(314);
=======
						setState(311);
						match(COMMA);
						setState(312);
>>>>>>> Stashed changes
						containerProperties();
						}
						} 
					}
<<<<<<< Updated upstream
					setState(319);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
				}
				setState(321);
=======
					setState(317);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
				}
				setState(319);
>>>>>>> Stashed changes
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
<<<<<<< Updated upstream
					setState(320);
=======
					setState(318);
>>>>>>> Stashed changes
					match(COMMA);
					}
				}

				}
			}

<<<<<<< Updated upstream
			setState(325);
=======
			setState(323);
>>>>>>> Stashed changes
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
			setState(334);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WIDTH:
				_localctx = new ContainerWidthContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
<<<<<<< Updated upstream
				setState(327);
=======
				setState(325);
>>>>>>> Stashed changes
				widthProperty();
				}
				break;
			case HEIGHT:
				_localctx = new ContainerHeightContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
<<<<<<< Updated upstream
				setState(328);
=======
				setState(326);
>>>>>>> Stashed changes
				heightProperty();
				}
				break;
			case CONTENTALIGNMENT:
				_localctx = new ContainerContentAlignmentContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
<<<<<<< Updated upstream
				setState(329);
				match(CONTENTALIGNMENT);
				setState(330);
				match(COLON);
				setState(331);
=======
				setState(327);
				match(CONTENTALIGNMENT);
				setState(328);
				match(COLON);
				setState(329);
>>>>>>> Stashed changes
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
<<<<<<< Updated upstream
				setState(332);
=======
				setState(330);
>>>>>>> Stashed changes
				childProperty();
				}
				break;
			case DECORATION:
				_localctx = new ContainerDecorationContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
<<<<<<< Updated upstream
				setState(333);
				decorationProperty();
=======
				setState(331);
				match(DECORATION);
				setState(332);
				match(COLON);
				setState(333);
				boxDecoration();
>>>>>>> Stashed changes
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
			setState(336);
			match(DECORATION);
			setState(337);
			match(COLON);
			setState(338);
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
<<<<<<< Updated upstream
			setState(340);
			match(BOXDECORATION);
			setState(341);
			match(LP);
			setState(353);
=======
			setState(336);
			match(BOXDECORATION);
			setState(337);
			match(LP);
			setState(349);
>>>>>>> Stashed changes
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLOR || _la==BORDERRADIUS) {
				{
<<<<<<< Updated upstream
				setState(342);
				boxDecorationProperties();
				setState(347);
=======
				setState(338);
				boxDecorationProperties();
				setState(343);
>>>>>>> Stashed changes
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
<<<<<<< Updated upstream
						setState(343);
						match(COMMA);
						setState(344);
=======
						setState(339);
						match(COMMA);
						setState(340);
>>>>>>> Stashed changes
						boxDecorationProperties();
						}
						} 
					}
<<<<<<< Updated upstream
					setState(349);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
				}
				setState(351);
=======
					setState(345);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
				}
				setState(347);
>>>>>>> Stashed changes
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
<<<<<<< Updated upstream
					setState(350);
=======
					setState(346);
>>>>>>> Stashed changes
					match(COMMA);
					}
				}

				}
			}

<<<<<<< Updated upstream
			setState(355);
=======
			setState(351);
>>>>>>> Stashed changes
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
		public BoxDecorationPropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boxDecorationProperties; }
	 
		public BoxDecorationPropertiesContext() { }
		public void copyFrom(BoxDecorationPropertiesContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BoxDecorationBorderRadiusContext extends BoxDecorationPropertiesContext {
		public BorderRadiusPropertyContext borderRadiusProperty() {
			return getRuleContext(BorderRadiusPropertyContext.class,0);
		}
		public BoxDecorationBorderRadiusContext(BoxDecorationPropertiesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterBoxDecorationBorderRadius(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitBoxDecorationBorderRadius(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitBoxDecorationBorderRadius(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoxDecorationColorContext extends BoxDecorationPropertiesContext {
		public ColorPropertyContext colorProperty() {
			return getRuleContext(ColorPropertyContext.class,0);
		}
		public BoxDecorationColorContext(BoxDecorationPropertiesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterBoxDecorationColor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitBoxDecorationColor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitBoxDecorationColor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoxDecorationPropertiesContext boxDecorationProperties() throws RecognitionException {
		BoxDecorationPropertiesContext _localctx = new BoxDecorationPropertiesContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_boxDecorationProperties);
		try {
<<<<<<< Updated upstream
			setState(359);
=======
			setState(357);
>>>>>>> Stashed changes
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COLOR:
				_localctx = new BoxDecorationColorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
<<<<<<< Updated upstream
				setState(357);
=======
				setState(353);
>>>>>>> Stashed changes
				colorProperty();
				}
				break;
			case BORDERRADIUS:
				_localctx = new BoxDecorationBorderRadiusContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
<<<<<<< Updated upstream
				setState(358);
				borderRadiusProperty();
=======
				setState(354);
				match(BORDERRADIUS);
				setState(355);
				match(COLON);
				setState(356);
				borderRadius();
>>>>>>> Stashed changes
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
			setState(361);
			match(BORDERRADIUS);
			setState(362);
			match(COLON);
			setState(363);
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
<<<<<<< Updated upstream
			setState(367);
=======
			setState(361);
>>>>>>> Stashed changes
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BORDERRADIUSONLY:
				enterOuterAlt(_localctx, 1);
				{
<<<<<<< Updated upstream
				setState(365);
=======
				setState(359);
>>>>>>> Stashed changes
				borderRadiusOnly();
				}
				break;
			case BORDERRADIUSCIRCULAR:
				enterOuterAlt(_localctx, 2);
				{
<<<<<<< Updated upstream
				setState(366);
=======
				setState(360);
>>>>>>> Stashed changes
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
<<<<<<< Updated upstream
			setState(369);
			match(BORDERRADIUSCIRCULAR);
			setState(370);
			match(LP);
			setState(371);
			borderRadiusCircularProperties();
			setState(373);
=======
			setState(363);
			match(BORDERRADIUSCIRCULAR);
			setState(364);
			match(LP);
			setState(365);
			borderRadiusCircularProperties();
			setState(367);
>>>>>>> Stashed changes
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
<<<<<<< Updated upstream
				setState(372);
=======
				setState(366);
>>>>>>> Stashed changes
				match(COMMA);
				}
			}

<<<<<<< Updated upstream
			setState(375);
=======
			setState(369);
>>>>>>> Stashed changes
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
<<<<<<< Updated upstream
			setState(377);
			match(BORDERRADIUSONLY);
			setState(378);
			match(LP);
			setState(390);
=======
			setState(371);
			match(BORDERRADIUSONLY);
			setState(372);
			match(LP);
			setState(384);
>>>>>>> Stashed changes
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TOPRIGHT) | (1L << TOPLEFT) | (1L << BOTTOMRIGHT) | (1L << BOTTOMLEFT))) != 0)) {
				{
<<<<<<< Updated upstream
				setState(379);
				borderRadiusOnlyProperties();
				setState(384);
=======
				setState(373);
				borderRadiusOnlyProperties();
				setState(378);
>>>>>>> Stashed changes
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
<<<<<<< Updated upstream
						setState(380);
						match(COMMA);
						setState(381);
=======
						setState(374);
						match(COMMA);
						setState(375);
>>>>>>> Stashed changes
						borderRadiusOnlyProperties();
						}
						} 
					}
<<<<<<< Updated upstream
					setState(386);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
				}
				setState(388);
=======
					setState(380);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
				}
				setState(382);
>>>>>>> Stashed changes
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
<<<<<<< Updated upstream
					setState(387);
=======
					setState(381);
>>>>>>> Stashed changes
					match(COMMA);
					}
				}

				}
			}

<<<<<<< Updated upstream
			setState(392);
=======
			setState(386);
>>>>>>> Stashed changes
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
<<<<<<< Updated upstream
			setState(394);
			match(RADIUS);
			setState(395);
			match(COLON);
			setState(396);
=======
			setState(388);
			match(RADIUS);
			setState(389);
			match(COLON);
			setState(390);
>>>>>>> Stashed changes
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
<<<<<<< Updated upstream
			setState(410);
=======
			setState(404);
>>>>>>> Stashed changes
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TOPRIGHT:
				_localctx = new BorderRadiusOnlyTopRightContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
<<<<<<< Updated upstream
				setState(398);
				match(TOPRIGHT);
				setState(399);
				match(COLON);
				setState(400);
=======
				setState(392);
				match(TOPRIGHT);
				setState(393);
				match(COLON);
				setState(394);
>>>>>>> Stashed changes
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
<<<<<<< Updated upstream
				setState(401);
				match(TOPLEFT);
				setState(402);
				match(COLON);
				setState(403);
=======
				setState(395);
				match(TOPLEFT);
				setState(396);
				match(COLON);
				setState(397);
>>>>>>> Stashed changes
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
<<<<<<< Updated upstream
				setState(404);
				match(BOTTOMRIGHT);
				setState(405);
				match(COLON);
				setState(406);
=======
				setState(398);
				match(BOTTOMRIGHT);
				setState(399);
				match(COLON);
				setState(400);
>>>>>>> Stashed changes
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
<<<<<<< Updated upstream
				setState(407);
				match(BOTTOMLEFT);
				setState(408);
				match(COLON);
				setState(409);
=======
				setState(401);
				match(BOTTOMLEFT);
				setState(402);
				match(COLON);
				setState(403);
>>>>>>> Stashed changes
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
<<<<<<< Updated upstream
			setState(412);
			match(EXPANDED);
			setState(413);
			match(LP);
			setState(425);
=======
			setState(406);
			match(EXPANDED);
			setState(407);
			match(LP);
			setState(419);
>>>>>>> Stashed changes
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CHILD || _la==FLEX) {
				{
<<<<<<< Updated upstream
				setState(414);
				expandedProperties();
				setState(419);
=======
				setState(408);
				expandedProperties();
				setState(413);
>>>>>>> Stashed changes
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
<<<<<<< Updated upstream
						setState(415);
						match(COMMA);
						setState(416);
=======
						setState(409);
						match(COMMA);
						setState(410);
>>>>>>> Stashed changes
						expandedProperties();
						}
						} 
					}
<<<<<<< Updated upstream
					setState(421);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
				}
				setState(423);
=======
					setState(415);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
				}
				setState(417);
>>>>>>> Stashed changes
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
<<<<<<< Updated upstream
					setState(422);
=======
					setState(416);
>>>>>>> Stashed changes
					match(COMMA);
					}
				}

				}
			}

<<<<<<< Updated upstream
			setState(427);
=======
			setState(421);
>>>>>>> Stashed changes
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
<<<<<<< Updated upstream
			setState(433);
=======
			setState(427);
>>>>>>> Stashed changes
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FLEX:
				_localctx = new ExpandedFlexContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
<<<<<<< Updated upstream
				setState(429);
				match(FLEX);
				setState(430);
				match(COLON);
				setState(431);
=======
				setState(423);
				match(FLEX);
				setState(424);
				match(COLON);
				setState(425);
>>>>>>> Stashed changes
				match(NUM);
				}
				break;
			case CHILD:
				_localctx = new ExpandedChildContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
<<<<<<< Updated upstream
				setState(432);
=======
				setState(426);
>>>>>>> Stashed changes
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
<<<<<<< Updated upstream
			setState(435);
			match(GESTUREDETECTOR);
			setState(436);
			match(LP);
			setState(448);
=======
			setState(429);
			match(GESTUREDETECTOR);
			setState(430);
			match(LP);
			setState(442);
>>>>>>> Stashed changes
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ONPRESSED) {
				{
<<<<<<< Updated upstream
				setState(437);
				gestureDetectorProperties();
				setState(442);
=======
				setState(431);
				gestureDetectorProperties();
				setState(436);
>>>>>>> Stashed changes
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
<<<<<<< Updated upstream
						setState(438);
						match(COMMA);
						setState(439);
=======
						setState(432);
						match(COMMA);
						setState(433);
>>>>>>> Stashed changes
						gestureDetectorProperties();
						}
						} 
					}
<<<<<<< Updated upstream
					setState(444);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
				}
				setState(446);
=======
					setState(438);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
				}
				setState(440);
>>>>>>> Stashed changes
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
<<<<<<< Updated upstream
					setState(445);
=======
					setState(439);
>>>>>>> Stashed changes
					match(COMMA);
					}
				}

				}
			}

<<<<<<< Updated upstream
			setState(450);
=======
			setState(444);
>>>>>>> Stashed changes
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
<<<<<<< Updated upstream
			setState(452);
			match(ONPRESSED);
			setState(453);
			match(COLON);
			setState(454);
=======
			setState(446);
			match(ONPRESSED);
			setState(447);
			match(COLON);
			setState(448);
>>>>>>> Stashed changes
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
<<<<<<< Updated upstream
			setState(456);
			match(LP);
			setState(461);
=======
			setState(450);
			match(LP);
			setState(455);
>>>>>>> Stashed changes
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
<<<<<<< Updated upstream
				setState(457);
				match(IDENTIFIER);
				setState(458);
				match(COMMA);
				}
				}
				setState(463);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(464);
			match(RP);
			setState(465);
			match(OB);
			setState(469);
=======
				setState(451);
				match(IDENTIFIER);
				setState(452);
				match(COMMA);
				}
				}
				setState(457);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(458);
			match(RP);
			setState(459);
			match(OB);
			setState(463);
>>>>>>> Stashed changes
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 34)) & ~0x3f) == 0 && ((1L << (_la - 34)) & ((1L << (INT - 34)) | (1L << (STRINGTYPE - 34)) | (1L << (DOUBLE - 34)) | (1L << (FUNCTION - 34)) | (1L << (IDENTIFIER - 34)))) != 0)) {
				{
				{
<<<<<<< Updated upstream
				setState(466);
				statment();
				}
				}
				setState(471);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(472);
=======
				setState(460);
				statment();
				}
				}
				setState(465);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(466);
>>>>>>> Stashed changes
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
<<<<<<< Updated upstream
			setState(474);
			match(PADDING);
			setState(475);
			match(LP);
			setState(487);
=======
			setState(468);
			match(PADDING);
			setState(469);
			match(LP);
			setState(481);
>>>>>>> Stashed changes
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CHILD || _la==PADDINGATTR) {
				{
<<<<<<< Updated upstream
				setState(476);
				paddingProprtey();
				setState(481);
=======
				setState(470);
				paddingProprtey();
				setState(475);
>>>>>>> Stashed changes
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
<<<<<<< Updated upstream
						setState(477);
						match(COMMA);
						setState(478);
=======
						setState(471);
						match(COMMA);
						setState(472);
>>>>>>> Stashed changes
						paddingProprtey();
						}
						} 
					}
<<<<<<< Updated upstream
					setState(483);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
				}
				setState(485);
=======
					setState(477);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
				}
				setState(479);
>>>>>>> Stashed changes
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
<<<<<<< Updated upstream
					setState(484);
=======
					setState(478);
>>>>>>> Stashed changes
					match(COMMA);
					}
				}

				}
			}

<<<<<<< Updated upstream
			setState(489);
=======
			setState(483);
>>>>>>> Stashed changes
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
<<<<<<< Updated upstream
			setState(495);
=======
			setState(489);
>>>>>>> Stashed changes
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PADDINGATTR:
				_localctx = new PaddingPaddingContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
<<<<<<< Updated upstream
				setState(491);
				match(PADDINGATTR);
				setState(492);
				match(COLON);
				setState(493);
=======
				setState(485);
				match(PADDINGATTR);
				setState(486);
				match(COLON);
				setState(487);
>>>>>>> Stashed changes
				edgeInsets();
				}
				break;
			case CHILD:
				_localctx = new PaddingChildContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
<<<<<<< Updated upstream
				setState(494);
=======
				setState(488);
>>>>>>> Stashed changes
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
<<<<<<< Updated upstream
			setState(529);
=======
			setState(523);
>>>>>>> Stashed changes
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EDGE_INSETS_ONLY:
				_localctx = new EdgeInsetsOnlyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
<<<<<<< Updated upstream
				setState(497);
				match(EDGE_INSETS_ONLY);
				setState(498);
				match(LP);
				setState(510);
=======
				setState(491);
				match(EDGE_INSETS_ONLY);
				setState(492);
				match(LP);
				setState(504);
>>>>>>> Stashed changes
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 92)) & ~0x3f) == 0 && ((1L << (_la - 92)) & ((1L << (TOP - 92)) | (1L << (LEFT - 92)) | (1L << (BOTTOM - 92)) | (1L << (RIGHT - 92)))) != 0)) {
					{
<<<<<<< Updated upstream
					setState(499);
					edgeInsetsOnlyProperties();
					setState(504);
=======
					setState(493);
					edgeInsetsOnlyProperties();
					setState(498);
>>>>>>> Stashed changes
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
<<<<<<< Updated upstream
							setState(500);
							match(COMMA);
							setState(501);
=======
							setState(494);
							match(COMMA);
							setState(495);
>>>>>>> Stashed changes
							edgeInsetsOnlyProperties();
							}
							} 
						}
<<<<<<< Updated upstream
						setState(506);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
					}
					setState(508);
=======
						setState(500);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
					}
					setState(502);
>>>>>>> Stashed changes
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
<<<<<<< Updated upstream
						setState(507);
=======
						setState(501);
>>>>>>> Stashed changes
						match(COMMA);
						}
					}

					}
				}

<<<<<<< Updated upstream
				setState(512);
=======
				setState(506);
>>>>>>> Stashed changes
				match(RP);
				}
				break;
			case EDGE_INSETS_SYMMETRIC:
				_localctx = new EdgeInsetsSymetricContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
<<<<<<< Updated upstream
				setState(513);
				match(EDGE_INSETS_SYMMETRIC);
				setState(514);
				match(LP);
				setState(526);
=======
				setState(507);
				match(EDGE_INSETS_SYMMETRIC);
				setState(508);
				match(LP);
				setState(520);
>>>>>>> Stashed changes
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==HORIZONTAL || _la==VERTICAL) {
					{
<<<<<<< Updated upstream
					setState(515);
					edgeInsetsSymetricProperties();
					setState(520);
=======
					setState(509);
					edgeInsetsSymetricProperties();
					setState(514);
>>>>>>> Stashed changes
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
<<<<<<< Updated upstream
							setState(516);
							match(COMMA);
							setState(517);
=======
							setState(510);
							match(COMMA);
							setState(511);
>>>>>>> Stashed changes
							edgeInsetsSymetricProperties();
							}
							} 
						}
<<<<<<< Updated upstream
						setState(522);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
					}
					setState(524);
=======
						setState(516);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
					}
					setState(518);
>>>>>>> Stashed changes
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
<<<<<<< Updated upstream
						setState(523);
=======
						setState(517);
>>>>>>> Stashed changes
						match(COMMA);
						}
					}

					}
				}

<<<<<<< Updated upstream
				setState(528);
=======
				setState(522);
>>>>>>> Stashed changes
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
<<<<<<< Updated upstream
			setState(543);
=======
			setState(537);
>>>>>>> Stashed changes
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TOP:
				_localctx = new EdgeInsetsOnlyTopContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
<<<<<<< Updated upstream
				setState(531);
				match(TOP);
				setState(532);
				match(COLON);
				setState(533);
=======
				setState(525);
				match(TOP);
				setState(526);
				match(COLON);
				setState(527);
>>>>>>> Stashed changes
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
<<<<<<< Updated upstream
				setState(534);
				match(LEFT);
				setState(535);
				match(COLON);
				setState(536);
=======
				setState(528);
				match(LEFT);
				setState(529);
				match(COLON);
				setState(530);
>>>>>>> Stashed changes
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
<<<<<<< Updated upstream
				setState(537);
				match(RIGHT);
				setState(538);
				match(COLON);
				setState(539);
=======
				setState(531);
				match(RIGHT);
				setState(532);
				match(COLON);
				setState(533);
>>>>>>> Stashed changes
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
<<<<<<< Updated upstream
				setState(540);
				match(BOTTOM);
				setState(541);
				match(COLON);
				setState(542);
=======
				setState(534);
				match(BOTTOM);
				setState(535);
				match(COLON);
				setState(536);
>>>>>>> Stashed changes
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
<<<<<<< Updated upstream
			setState(551);
=======
			setState(545);
>>>>>>> Stashed changes
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HORIZONTAL:
				_localctx = new EdgeInsetsSymetricHorizontalContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
<<<<<<< Updated upstream
				setState(545);
				match(HORIZONTAL);
				setState(546);
				match(COLON);
				setState(547);
=======
				setState(539);
				match(HORIZONTAL);
				setState(540);
				match(COLON);
				setState(541);
>>>>>>> Stashed changes
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
<<<<<<< Updated upstream
				setState(548);
				match(VERTICAL);
				setState(549);
				match(COLON);
				setState(550);
=======
				setState(542);
				match(VERTICAL);
				setState(543);
				match(COLON);
				setState(544);
>>>>>>> Stashed changes
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
<<<<<<< Updated upstream
			setState(553);
			match(IMAGE);
			setState(554);
			match(LP);
			setState(566);
=======
			setState(547);
			match(IMAGE);
			setState(548);
			match(LP);
			setState(560);
>>>>>>> Stashed changes
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 45)) & ~0x3f) == 0 && ((1L << (_la - 45)) & ((1L << (WIDTH - 45)) | (1L << (HEIGHT - 45)) | (1L << (FIT - 45)) | (1L << (URL - 45)))) != 0)) {
				{
<<<<<<< Updated upstream
				setState(555);
				imageProperties();
				setState(560);
=======
				setState(549);
				imageProperties();
				setState(554);
>>>>>>> Stashed changes
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
<<<<<<< Updated upstream
						setState(556);
						match(COMMA);
						setState(557);
=======
						setState(550);
						match(COMMA);
						setState(551);
>>>>>>> Stashed changes
						imageProperties();
						}
						} 
					}
<<<<<<< Updated upstream
					setState(562);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
				}
				setState(564);
=======
					setState(556);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
				}
				setState(558);
>>>>>>> Stashed changes
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
<<<<<<< Updated upstream
					setState(563);
=======
					setState(557);
>>>>>>> Stashed changes
					match(COMMA);
					}
				}

				}
			}

<<<<<<< Updated upstream
			setState(568);
=======
			setState(562);
>>>>>>> Stashed changes
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
<<<<<<< Updated upstream
			setState(578);
=======
			setState(572);
>>>>>>> Stashed changes
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case URL:
				_localctx = new ImageUrlContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
<<<<<<< Updated upstream
				setState(570);
				match(URL);
				setState(571);
				match(COLON);
				setState(572);
=======
				setState(564);
				match(URL);
				setState(565);
				match(COLON);
				setState(566);
>>>>>>> Stashed changes
				match(STRING);
				}
				break;
			case FIT:
				_localctx = new ImageFitContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
<<<<<<< Updated upstream
				setState(573);
				match(FIT);
				setState(574);
				match(COLON);
				setState(575);
=======
				setState(567);
				match(FIT);
				setState(568);
				match(COLON);
				setState(569);
>>>>>>> Stashed changes
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
<<<<<<< Updated upstream
				setState(576);
=======
				setState(570);
>>>>>>> Stashed changes
				widthProperty();
				}
				break;
			case HEIGHT:
				_localctx = new ImageHeightContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
<<<<<<< Updated upstream
				setState(577);
=======
				setState(571);
>>>>>>> Stashed changes
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
<<<<<<< Updated upstream
			setState(580);
			match(BUTTON);
			setState(581);
			match(LP);
			setState(593);
=======
			setState(574);
			match(BUTTON);
			setState(575);
			match(LP);
			setState(587);
>>>>>>> Stashed changes
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 45)) & ~0x3f) == 0 && ((1L << (_la - 45)) & ((1L << (WIDTH - 45)) | (1L << (HEIGHT - 45)) | (1L << (TITLE - 45)) | (1L << (BACKGROUND_COLOR - 45)) | (1L << (TITLE_COLOR - 45)) | (1L << (ONPRESSED - 45)))) != 0)) {
				{
<<<<<<< Updated upstream
				setState(582);
				buttonProperties();
				setState(587);
=======
				setState(576);
				buttonProperties();
				setState(581);
>>>>>>> Stashed changes
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
<<<<<<< Updated upstream
						setState(583);
						match(COMMA);
						setState(584);
=======
						setState(577);
						match(COMMA);
						setState(578);
>>>>>>> Stashed changes
						buttonProperties();
						}
						} 
					}
<<<<<<< Updated upstream
					setState(589);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
				}
				setState(591);
=======
					setState(583);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
				}
				setState(585);
>>>>>>> Stashed changes
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
<<<<<<< Updated upstream
					setState(590);
=======
					setState(584);
>>>>>>> Stashed changes
					match(COMMA);
					}
				}

				}
			}

<<<<<<< Updated upstream
			setState(595);
=======
			setState(589);
>>>>>>> Stashed changes
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
<<<<<<< Updated upstream
			setState(611);
=======
			setState(605);
>>>>>>> Stashed changes
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WIDTH:
				_localctx = new ButtonWidthContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
<<<<<<< Updated upstream
				setState(597);
=======
				setState(591);
>>>>>>> Stashed changes
				widthProperty();
				}
				break;
			case HEIGHT:
				_localctx = new ButtonHeightContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
<<<<<<< Updated upstream
				setState(598);
=======
				setState(592);
>>>>>>> Stashed changes
				heightProperty();
				}
				break;
			case TITLE:
				_localctx = new ButtonTitleContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
<<<<<<< Updated upstream
				setState(599);
				match(TITLE);
				setState(600);
				match(COLON);
				setState(601);
=======
				setState(593);
				match(TITLE);
				setState(594);
				match(COLON);
				setState(595);
>>>>>>> Stashed changes
				match(STRING);
				}
				break;
			case BACKGROUND_COLOR:
				_localctx = new ButtonBackgroundColorContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
<<<<<<< Updated upstream
				setState(602);
				match(BACKGROUND_COLOR);
				setState(603);
				match(COLON);
				setState(604);
=======
				setState(596);
				match(BACKGROUND_COLOR);
				setState(597);
				match(COLON);
				setState(598);
>>>>>>> Stashed changes
				match(HEX_NUM);
				}
				break;
			case TITLE_COLOR:
				_localctx = new ButtonTitleColorContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
<<<<<<< Updated upstream
				setState(605);
				match(TITLE_COLOR);
				setState(606);
				match(COLON);
				setState(607);
=======
				setState(599);
				match(TITLE_COLOR);
				setState(600);
				match(COLON);
				setState(601);
>>>>>>> Stashed changes
				match(HEX_NUM);
				}
				break;
			case ONPRESSED:
				_localctx = new ButtonOnPressedContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
<<<<<<< Updated upstream
				setState(608);
				match(ONPRESSED);
				setState(609);
				match(COLON);
				setState(610);
=======
				setState(602);
				match(ONPRESSED);
				setState(603);
				match(COLON);
				setState(604);
>>>>>>> Stashed changes
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
<<<<<<< Updated upstream
			setState(613);
			match(TEXTFIELD);
			setState(614);
			match(LP);
			setState(626);
=======
			setState(607);
			match(TEXTFIELD);
			setState(608);
			match(LP);
			setState(620);
>>>>>>> Stashed changes
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 59)) & ~0x3f) == 0 && ((1L << (_la - 59)) & ((1L << (PADDINGATTR - 59)) | (1L << (VALUE - 59)) | (1L << (LABEL - 59)) | (1L << (TEXTCOLOR - 59)) | (1L << (HINT - 59)) | (1L << (BORDERATRI - 59)) | (1L << (ONCHANGED - 59)))) != 0)) {
				{
<<<<<<< Updated upstream
				setState(615);
				textFieldProperties();
				setState(620);
=======
				setState(609);
				textFieldProperties();
				setState(614);
>>>>>>> Stashed changes
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
<<<<<<< Updated upstream
						setState(616);
						match(COMMA);
						setState(617);
=======
						setState(610);
						match(COMMA);
						setState(611);
>>>>>>> Stashed changes
						textFieldProperties();
						}
						} 
					}
<<<<<<< Updated upstream
					setState(622);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
				}
				setState(624);
=======
					setState(616);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
				}
				setState(618);
>>>>>>> Stashed changes
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
<<<<<<< Updated upstream
					setState(623);
=======
					setState(617);
>>>>>>> Stashed changes
					match(COMMA);
					}
				}

				}
			}

<<<<<<< Updated upstream
			setState(628);
=======
			setState(622);
>>>>>>> Stashed changes
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
<<<<<<< Updated upstream
			setState(651);
=======
			setState(645);
>>>>>>> Stashed changes
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VALUE:
				_localctx = new TextFieldValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
<<<<<<< Updated upstream
				setState(630);
				match(VALUE);
				setState(631);
				match(COLON);
				setState(632);
=======
				setState(624);
				match(VALUE);
				setState(625);
				match(COLON);
				setState(626);
>>>>>>> Stashed changes
				match(STRING);
				}
				break;
			case LABEL:
				_localctx = new TextFieldLabelContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
<<<<<<< Updated upstream
				setState(633);
				match(LABEL);
				setState(634);
				match(COLON);
				setState(635);
=======
				setState(627);
				match(LABEL);
				setState(628);
				match(COLON);
				setState(629);
>>>>>>> Stashed changes
				match(STRING);
				}
				break;
			case TEXTCOLOR:
				_localctx = new TextFieldTextColorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
<<<<<<< Updated upstream
				setState(636);
				match(TEXTCOLOR);
				setState(637);
				match(COLON);
				setState(638);
=======
				setState(630);
				match(TEXTCOLOR);
				setState(631);
				match(COLON);
				setState(632);
>>>>>>> Stashed changes
				match(HEX_NUM);
				}
				break;
			case PADDINGATTR:
				_localctx = new TextFieldPaddingContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
<<<<<<< Updated upstream
				setState(639);
				match(PADDINGATTR);
				setState(640);
				match(COLON);
				setState(641);
=======
				setState(633);
				match(PADDINGATTR);
				setState(634);
				match(COLON);
				setState(635);
>>>>>>> Stashed changes
				edgeInsets();
				}
				break;
			case HINT:
				_localctx = new TextFieldHintContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
<<<<<<< Updated upstream
				setState(642);
				match(HINT);
				setState(643);
				match(COLON);
				setState(644);
=======
				setState(636);
				match(HINT);
				setState(637);
				match(COLON);
				setState(638);
>>>>>>> Stashed changes
				match(STRING);
				}
				break;
			case BORDERATRI:
				_localctx = new TextFieldBorderContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
<<<<<<< Updated upstream
				setState(645);
				match(BORDERATRI);
				setState(646);
				match(COLON);
				setState(647);
=======
				setState(639);
				match(BORDERATRI);
				setState(640);
				match(COLON);
				setState(641);
>>>>>>> Stashed changes
				border();
				}
				break;
			case ONCHANGED:
				_localctx = new TextFieldOnChangedContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
<<<<<<< Updated upstream
				setState(648);
				match(ONCHANGED);
				setState(649);
				match(COLON);
				setState(650);
=======
				setState(642);
				match(ONCHANGED);
				setState(643);
				match(COLON);
				setState(644);
>>>>>>> Stashed changes
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
<<<<<<< Updated upstream
			setState(653);
			match(BORDER);
			setState(654);
			match(LP);
			setState(666);
=======
			setState(647);
			match(BORDER);
			setState(648);
			match(LP);
			setState(660);
>>>>>>> Stashed changes
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 56)) & ~0x3f) == 0 && ((1L << (_la - 56)) & ((1L << (COLOR - 56)) | (1L << (BORDERRADIUS - 56)) | (1L << (THICKNESS - 56)))) != 0)) {
				{
<<<<<<< Updated upstream
				setState(655);
				borderProperties();
				setState(660);
=======
				setState(649);
				borderProperties();
				setState(654);
>>>>>>> Stashed changes
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
<<<<<<< Updated upstream
						setState(656);
						match(COMMA);
						setState(657);
=======
						setState(650);
						match(COMMA);
						setState(651);
>>>>>>> Stashed changes
						borderProperties();
						}
						} 
					}
<<<<<<< Updated upstream
					setState(662);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
				}
				setState(664);
=======
					setState(656);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
				}
				setState(658);
>>>>>>> Stashed changes
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
<<<<<<< Updated upstream
					setState(663);
=======
					setState(657);
>>>>>>> Stashed changes
					match(COMMA);
					}
				}

				}
			}

<<<<<<< Updated upstream
			setState(668);
=======
			setState(662);
>>>>>>> Stashed changes
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
<<<<<<< Updated upstream
			setState(677);
=======
			setState(671);
>>>>>>> Stashed changes
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case THICKNESS:
				_localctx = new BorderThicknessContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
<<<<<<< Updated upstream
				setState(670);
				match(THICKNESS);
				setState(671);
				match(COLON);
				setState(672);
=======
				setState(664);
				match(THICKNESS);
				setState(665);
				match(COLON);
				setState(666);
>>>>>>> Stashed changes
				match(NUM);
				}
				break;
			case BORDERRADIUS:
				_localctx = new BorderBorderRadiusContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
<<<<<<< Updated upstream
				setState(673);
				match(BORDERRADIUS);
				setState(674);
				match(COLON);
				setState(675);
=======
				setState(667);
				match(BORDERRADIUS);
				setState(668);
				match(COLON);
				setState(669);
>>>>>>> Stashed changes
				borderRadius();
				}
				break;
			case COLOR:
				_localctx = new BorderColorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
<<<<<<< Updated upstream
				setState(676);
=======
				setState(670);
>>>>>>> Stashed changes
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
		public StatmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statment; }
	 
		public StatmentContext() { }
		public void copyFrom(StatmentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VariableDeclarationStatmentContext extends StatmentContext {
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public VariableDeclarationStatmentContext(StatmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterVariableDeclarationStatment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitVariableDeclarationStatment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitVariableDeclarationStatment(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VariableAssignmentStatmentContext extends StatmentContext {
		public VariableAssignmentContext variableAssignment() {
			return getRuleContext(VariableAssignmentContext.class,0);
		}
		public VariableAssignmentStatmentContext(StatmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterVariableAssignmentStatment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitVariableAssignmentStatment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitVariableAssignmentStatment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatmentContext statment() throws RecognitionException {
		StatmentContext _localctx = new StatmentContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_statment);
		try {
<<<<<<< Updated upstream
			setState(681);
=======
			setState(676);
>>>>>>> Stashed changes
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case STRINGTYPE:
			case DOUBLE:
			case FUNCTION:
				_localctx = new VariableDeclarationStatmentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
<<<<<<< Updated upstream
				setState(679);
=======
				setState(673);
>>>>>>> Stashed changes
				variableDeclaration();
				}
				break;
			case IDENTIFIER:
				_localctx = new VariableAssignmentStatmentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
<<<<<<< Updated upstream
				setState(680);
				variableAssignment();
				}
				break;
=======
				setState(674);
				variableAssignment();
				}
				break;
			case WIDGET:
				_localctx = new CustomWidgetDeclarationStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(675);
				customWidgetDeclaration();
				}
				break;
>>>>>>> Stashed changes
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
<<<<<<< Updated upstream
			setState(698);
=======
			setState(693);
>>>>>>> Stashed changes
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case STRINGTYPE:
			case DOUBLE:
				_localctx = new NonFunctionVariableDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
<<<<<<< Updated upstream
				setState(683);
=======
				setState(678);
>>>>>>> Stashed changes
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << STRINGTYPE) | (1L << DOUBLE))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
<<<<<<< Updated upstream
				setState(684);
				match(IDENTIFIER);
				setState(685);
=======
				setState(679);
				match(IDENTIFIER);
				setState(680);
>>>>>>> Stashed changes
				match(SC);
				}
				break;
			case FUNCTION:
				_localctx = new FunctionVariableDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
<<<<<<< Updated upstream
				setState(686);
				match(FUNCTION);
				setState(687);
				match(LP);
				setState(692);
=======
				setState(681);
				match(FUNCTION);
				setState(682);
				match(LP);
				setState(687);
>>>>>>> Stashed changes
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << STRINGTYPE) | (1L << DOUBLE))) != 0)) {
					{
					{
<<<<<<< Updated upstream
					setState(688);
=======
					setState(683);
>>>>>>> Stashed changes
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << STRINGTYPE) | (1L << DOUBLE))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
<<<<<<< Updated upstream
					setState(689);
					match(COMMA);
					}
					}
					setState(694);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(695);
				match(RP);
				setState(696);
				match(IDENTIFIER);
				setState(697);
=======
					setState(684);
					match(COMMA);
					}
					}
					setState(689);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(690);
				match(RP);
				setState(691);
				match(IDENTIFIER);
				setState(692);
>>>>>>> Stashed changes
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
<<<<<<< Updated upstream
			setState(700);
			match(IDENTIFIER);
			setState(701);
			match(EQL);
			setState(702);
=======
			setState(695);
			match(IDENTIFIER);
			setState(696);
			match(EQL);
			setState(697);
>>>>>>> Stashed changes
			_la = _input.LA(1);
			if ( !(((((_la - 98)) & ~0x3f) == 0 && ((1L << (_la - 98)) & ((1L << (FLOAT - 98)) | (1L << (NUM - 98)) | (1L << (STRING - 98)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
<<<<<<< Updated upstream
			setState(703);
			match(SC);
=======
			setState(698);
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
		enterRule(_localctx, 92, RULE_customWidgetDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(700);
			match(WIDGET);
			setState(701);
			match(WIDGETNAME);
			setState(702);
			match(OB);
			setState(703);
			variables();
			setState(704);
			match(RETURN);
			setState(705);
			match(LP);
			setState(706);
			tree();
			setState(707);
			match(RP);
			setState(708);
			match(CB);
>>>>>>> Stashed changes
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterVariables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitVariables(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitVariables(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariablesContext variables() throws RecognitionException {
		VariablesContext _localctx = new VariablesContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_variables);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(713);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << STRINGTYPE) | (1L << DOUBLE) | (1L << FUNCTION))) != 0)) {
				{
				{
				setState(710);
				variableDeclaration();
				}
				}
				setState(715);
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

	public static class TreeContext extends ParserRuleContext {
		public WidgetContext widget() {
			return getRuleContext(WidgetContext.class,0);
		}
		public TreeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tree; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).enterTree(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DartParserListener ) ((DartParserListener)listener).exitTree(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitTree(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TreeContext tree() throws RecognitionException {
		TreeContext _localctx = new TreeContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_tree);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(716);
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
		enterRule(_localctx, 100, RULE_widthProperty);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(718);
			match(WIDTH);
			setState(719);
			match(COLON);
			setState(720);
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
		enterRule(_localctx, 102, RULE_heightProperty);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(722);
			match(HEIGHT);
			setState(723);
			match(COLON);
			setState(724);
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
		enterRule(_localctx, 104, RULE_colorProperty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(726);
			match(COLOR);
			setState(727);
			match(COLON);
			setState(728);
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
		enterRule(_localctx, 106, RULE_childProperty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(730);
			match(CHILD);
			setState(731);
			match(COLON);
			setState(732);
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
		enterRule(_localctx, 108, RULE_childrenProperty);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(734);
			match(CHILDREN);
			setState(735);
			match(COLON);
			setState(736);
			match(OA);
			setState(742);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ROW) | (1L << CENTER) | (1L << COLUMN) | (1L << TEXT) | (1L << CONTAINER) | (1L << EXPANDED) | (1L << PADDING) | (1L << IMAGE) | (1L << BUTTON) | (1L << GESTUREDETECTOR) | (1L << TEXTFIELD))) != 0) || _la==WIDGETNAME) {
				{
				{
				setState(737);
				widget();
				setState(738);
				match(COMMA);
				}
				}
				setState(744);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(745);
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
		enterRule(_localctx, 110, RULE_mainAxisSizeProperty);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(747);
			match(MAINAXISSIZE);
			setState(748);
			match(COLON);
			setState(749);
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
		public TerminalNode CENTER() { return getToken(DartParser.CENTER, 0); }
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
		enterRule(_localctx, 112, RULE_crossAxisAlignmentProperty);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(751);
			match(CROSSAXISALIGNMENT);
			setState(752);
			match(COLON);
			setState(753);
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
		"\u0004\u0001f\u02f4\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
<<<<<<< Updated upstream
		"7\u00077\u00028\u00078\u0001\u0000\u0005\u0000t\b\u0000\n\u0000\f\u0000"+
		"w\t\u0000\u0001\u0000\u0005\u0000z\b\u0000\n\u0000\f\u0000}\t\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0005\u0001\u0086\b\u0001\n\u0001\f\u0001\u0089\t\u0001\u0001\u0001"+
		"\u0003\u0001\u008c\b\u0001\u0003\u0001\u008e\b\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0003\u0002\u0098\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0005\u0003\u009f\b\u0003\n\u0003\f\u0003\u00a2\t\u0003"+
		"\u0001\u0003\u0003\u0003\u00a5\b\u0003\u0003\u0003\u00a7\b\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0003\u0004\u00b1\b\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u00bf\b\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u00c6"+
		"\b\u0006\n\u0006\f\u0006\u00c9\t\u0006\u0001\u0006\u0003\u0006\u00cc\b"+
		"\u0006\u0003\u0006\u00ce\b\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0005\b\u00db\b\b\n\b\f\b\u00de\t\b\u0001\b\u0003\b\u00e1\b\b\u0003\b"+
		"\u00e3\b\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0003\t\u00ea\b\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u00f1\b\n\n\n\f\n\u00f4\t\n"+
		"\u0001\n\u0003\n\u00f7\b\n\u0003\n\u00f9\b\n\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u0104\b\f"+
		"\n\f\f\f\u0107\t\f\u0001\f\u0003\f\u010a\b\f\u0003\f\u010c\b\f\u0001\f"+
		"\u0001\f\u0001\r\u0001\r\u0001\r\u0003\r\u0113\b\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u011a\b\u000e\n\u000e"+
		"\f\u000e\u011d\t\u000e\u0001\u000e\u0003\u000e\u0120\b\u000e\u0003\u000e"+
		"\u0122\b\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0003\u000f\u0135\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0005\u0010\u013c\b\u0010\n\u0010\f\u0010\u013f\t\u0010\u0001"+
		"\u0010\u0003\u0010\u0142\b\u0010\u0003\u0010\u0144\b\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0003\u0011\u014f\b\u0011\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0005\u0013\u015a\b\u0013\n\u0013\f\u0013\u015d\t\u0013\u0001"+
		"\u0013\u0003\u0013\u0160\b\u0013\u0003\u0013\u0162\b\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0014\u0001\u0014\u0003\u0014\u0168\b\u0014\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0003\u0016"+
		"\u0170\b\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017"+
		"\u0176\b\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0005\u0018\u017f\b\u0018\n\u0018\f\u0018\u0182"+
		"\t\u0018\u0001\u0018\u0003\u0018\u0185\b\u0018\u0003\u0018\u0187\b\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0003\u001a\u019b\b\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0005\u001b\u01a2\b\u001b\n\u001b\f\u001b\u01a5\t\u001b\u0001"+
		"\u001b\u0003\u001b\u01a8\b\u001b\u0003\u001b\u01aa\b\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0003\u001c"+
		"\u01b2\b\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0005\u001d\u01b9\b\u001d\n\u001d\f\u001d\u01bc\t\u001d\u0001\u001d\u0003"+
		"\u001d\u01bf\b\u001d\u0003\u001d\u01c1\b\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0005\u001f\u01cc\b\u001f\n\u001f\f\u001f\u01cf\t\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0005\u001f\u01d4\b\u001f\n\u001f\f\u001f"+
		"\u01d7\t\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0005 \u01e0\b \n \f \u01e3\t \u0001 \u0003 \u01e6\b \u0003 \u01e8\b"+
		" \u0001 \u0001 \u0001!\u0001!\u0001!\u0001!\u0003!\u01f0\b!\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0005\"\u01f7\b\"\n\"\f\"\u01fa\t\"\u0001\""+
		"\u0003\"\u01fd\b\"\u0003\"\u01ff\b\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0005\"\u0207\b\"\n\"\f\"\u020a\t\"\u0001\"\u0003\"\u020d\b"+
		"\"\u0003\"\u020f\b\"\u0001\"\u0003\"\u0212\b\"\u0001#\u0001#\u0001#\u0001"+
		"#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0003#\u0220"+
		"\b#\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0003$\u0228\b$\u0001%\u0001"+
		"%\u0001%\u0001%\u0001%\u0005%\u022f\b%\n%\f%\u0232\t%\u0001%\u0003%\u0235"+
		"\b%\u0003%\u0237\b%\u0001%\u0001%\u0001&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0003&\u0243\b&\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0005\'\u024a\b\'\n\'\f\'\u024d\t\'\u0001\'\u0003\'\u0250\b\'\u0003"+
		"\'\u0252\b\'\u0001\'\u0001\'\u0001(\u0001(\u0001(\u0001(\u0001(\u0001"+
		"(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0003(\u0264"+
		"\b(\u0001)\u0001)\u0001)\u0001)\u0001)\u0005)\u026b\b)\n)\f)\u026e\t)"+
		"\u0001)\u0003)\u0271\b)\u0003)\u0273\b)\u0001)\u0001)\u0001*\u0001*\u0001"+
		"*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001"+
		"*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0003*\u028c"+
		"\b*\u0001+\u0001+\u0001+\u0001+\u0001+\u0005+\u0293\b+\n+\f+\u0296\t+"+
		"\u0001+\u0003+\u0299\b+\u0003+\u029b\b+\u0001+\u0001+\u0001,\u0001,\u0001"+
		",\u0001,\u0001,\u0001,\u0001,\u0003,\u02a6\b,\u0001-\u0001-\u0003-\u02aa"+
		"\b-\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0005.\u02b3\b.\n"+
		".\f.\u02b6\t.\u0001.\u0001.\u0001.\u0003.\u02bb\b.\u0001/\u0001/\u0001"+
		"/\u0001/\u0001/\u00010\u00050\u02c3\b0\n0\f0\u02c6\t0\u00011\u00011\u0001"+
		"2\u00012\u00012\u00012\u00013\u00013\u00013\u00013\u00014\u00014\u0001"+
		"4\u00014\u00015\u00015\u00015\u00015\u00016\u00016\u00016\u00016\u0001"+
		"6\u00016\u00056\u02e0\b6\n6\f6\u02e3\t6\u00016\u00016\u00017\u00017\u0001"+
		"7\u00017\u00018\u00018\u00018\u00018\u00018\u0000\u00009\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \""+
		"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnp\u0000\t\u0001\u0000bd\u0002\u0000"+
		",,QS\u0001\u0000bc\u0002\u000000MO\u0003\u000000]]__\u0001\u0000GH\u0001"+
		"\u0000\"$\u0001\u000034\u0004\u0000\r\r66]]__\u032d\u0000u\u0001\u0000"+
		"\u0000\u0000\u0002\u0080\u0001\u0000\u0000\u0000\u0004\u0097\u0001\u0000"+
		"\u0000\u0000\u0006\u0099\u0001\u0000\u0000\u0000\b\u00b0\u0001\u0000\u0000"+
		"\u0000\n\u00be\u0001\u0000\u0000\u0000\f\u00c0\u0001\u0000\u0000\u0000"+
		"\u000e\u00d1\u0001\u0000\u0000\u0000\u0010\u00d5\u0001\u0000\u0000\u0000"+
		"\u0012\u00e9\u0001\u0000\u0000\u0000\u0014\u00eb\u0001\u0000\u0000\u0000"+
		"\u0016\u00fc\u0001\u0000\u0000\u0000\u0018\u00fe\u0001\u0000\u0000\u0000"+
		"\u001a\u0112\u0001\u0000\u0000\u0000\u001c\u0114\u0001\u0000\u0000\u0000"+
		"\u001e\u0134\u0001\u0000\u0000\u0000 \u0136\u0001\u0000\u0000\u0000\""+
		"\u014e\u0001\u0000\u0000\u0000$\u0150\u0001\u0000\u0000\u0000&\u0154\u0001"+
		"\u0000\u0000\u0000(\u0167\u0001\u0000\u0000\u0000*\u0169\u0001\u0000\u0000"+
		"\u0000,\u016f\u0001\u0000\u0000\u0000.\u0171\u0001\u0000\u0000\u00000"+
		"\u0179\u0001\u0000\u0000\u00002\u018a\u0001\u0000\u0000\u00004\u019a\u0001"+
		"\u0000\u0000\u00006\u019c\u0001\u0000\u0000\u00008\u01b1\u0001\u0000\u0000"+
		"\u0000:\u01b3\u0001\u0000\u0000\u0000<\u01c4\u0001\u0000\u0000\u0000>"+
		"\u01c8\u0001\u0000\u0000\u0000@\u01da\u0001\u0000\u0000\u0000B\u01ef\u0001"+
		"\u0000\u0000\u0000D\u0211\u0001\u0000\u0000\u0000F\u021f\u0001\u0000\u0000"+
		"\u0000H\u0227\u0001\u0000\u0000\u0000J\u0229\u0001\u0000\u0000\u0000L"+
		"\u0242\u0001\u0000\u0000\u0000N\u0244\u0001\u0000\u0000\u0000P\u0263\u0001"+
		"\u0000\u0000\u0000R\u0265\u0001\u0000\u0000\u0000T\u028b\u0001\u0000\u0000"+
		"\u0000V\u028d\u0001\u0000\u0000\u0000X\u02a5\u0001\u0000\u0000\u0000Z"+
		"\u02a9\u0001\u0000\u0000\u0000\\\u02ba\u0001\u0000\u0000\u0000^\u02bc"+
		"\u0001\u0000\u0000\u0000`\u02c4\u0001\u0000\u0000\u0000b\u02c7\u0001\u0000"+
		"\u0000\u0000d\u02c9\u0001\u0000\u0000\u0000f\u02cd\u0001\u0000\u0000\u0000"+
		"h\u02d1\u0001\u0000\u0000\u0000j\u02d5\u0001\u0000\u0000\u0000l\u02d9"+
		"\u0001\u0000\u0000\u0000n\u02e6\u0001\u0000\u0000\u0000p\u02ea\u0001\u0000"+
		"\u0000\u0000rt\u0003Z-\u0000sr\u0001\u0000\u0000\u0000tw\u0001\u0000\u0000"+
		"\u0000us\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000v{\u0001\u0000"+
		"\u0000\u0000wu\u0001\u0000\u0000\u0000xz\u0003\u0002\u0001\u0000yx\u0001"+
		"\u0000\u0000\u0000z}\u0001\u0000\u0000\u0000{y\u0001\u0000\u0000\u0000"+
		"{|\u0001\u0000\u0000\u0000|~\u0001\u0000\u0000\u0000}{\u0001\u0000\u0000"+
		"\u0000~\u007f\u0005\u0000\u0000\u0001\u007f\u0001\u0001\u0000\u0000\u0000"+
		"\u0080\u0081\u0005\u000b\u0000\u0000\u0081\u008d\u0005\u0001\u0000\u0000"+
		"\u0082\u0087\u0003\u0004\u0002\u0000\u0083\u0084\u0005\t\u0000\u0000\u0084"+
		"\u0086\u0003\u0004\u0002\u0000\u0085\u0083\u0001\u0000\u0000\u0000\u0086"+
		"\u0089\u0001\u0000\u0000\u0000\u0087\u0085\u0001\u0000\u0000\u0000\u0087"+
		"\u0088\u0001\u0000\u0000\u0000\u0088\u008b\u0001\u0000\u0000\u0000\u0089"+
		"\u0087\u0001\u0000\u0000\u0000\u008a\u008c\u0005\t\u0000\u0000\u008b\u008a"+
		"\u0001\u0000\u0000\u0000\u008b\u008c\u0001\u0000\u0000\u0000\u008c\u008e"+
		"\u0001\u0000\u0000\u0000\u008d\u0082\u0001\u0000\u0000\u0000\u008d\u008e"+
		"\u0001\u0000\u0000\u0000\u008e\u008f\u0001\u0000\u0000\u0000\u008f\u0090"+
		"\u0005\u0002\u0000\u0000\u0090\u0003\u0001\u0000\u0000\u0000\u0091\u0092"+
		"\u0005\u001f\u0000\u0000\u0092\u0093\u0005\u0003\u0000\u0000\u0093\u0098"+
		"\u0003\n\u0005\u0000\u0094\u0095\u0005(\u0000\u0000\u0095\u0096\u0005"+
		"\u0003\u0000\u0000\u0096\u0098\u0003\u0006\u0003\u0000\u0097\u0091\u0001"+
		"\u0000\u0000\u0000\u0097\u0094\u0001\u0000\u0000\u0000\u0098\u0005\u0001"+
		"\u0000\u0000\u0000\u0099\u009a\u0005\u0010\u0000\u0000\u009a\u00a6\u0005"+
		"\u0001\u0000\u0000\u009b\u00a0\u0003\b\u0004\u0000\u009c\u009d\u0005\t"+
		"\u0000\u0000\u009d\u009f\u0003\b\u0004\u0000\u009e\u009c\u0001\u0000\u0000"+
		"\u0000\u009f\u00a2\u0001\u0000\u0000\u0000\u00a0\u009e\u0001\u0000\u0000"+
		"\u0000\u00a0\u00a1\u0001\u0000\u0000\u0000\u00a1\u00a4\u0001\u0000\u0000"+
		"\u0000\u00a2\u00a0\u0001\u0000\u0000\u0000\u00a3\u00a5\u0005\t\u0000\u0000"+
		"\u00a4\u00a3\u0001\u0000\u0000\u0000\u00a4\u00a5\u0001\u0000\u0000\u0000"+
		"\u00a5\u00a7\u0001\u0000\u0000\u0000\u00a6\u009b\u0001\u0000\u0000\u0000"+
		"\u00a6\u00a7\u0001\u0000\u0000\u0000\u00a7\u00a8\u0001\u0000\u0000\u0000"+
		"\u00a8\u00a9\u0005\u0002\u0000\u0000\u00a9\u0007\u0001\u0000\u0000\u0000"+
		"\u00aa\u00ab\u0005D\u0000\u0000\u00ab\u00ac\u0005\u0003\u0000\u0000\u00ac"+
		"\u00b1\u0005d\u0000\u0000\u00ad\u00ae\u0005J\u0000\u0000\u00ae\u00af\u0005"+
		"\u0003\u0000\u0000\u00af\u00b1\u0005I\u0000\u0000\u00b0\u00aa\u0001\u0000"+
		"\u0000\u0000\u00b0\u00ad\u0001\u0000\u0000\u0000\u00b1\t\u0001\u0000\u0000"+
		"\u0000\u00b2\u00bf\u0003\u0010\b\u0000\u00b3\u00bf\u0003\u0014\n\u0000"+
		"\u00b4\u00bf\u0003\u001c\u000e\u0000\u00b5\u00bf\u0003 \u0010\u0000\u00b6"+
		"\u00bf\u00036\u001b\u0000\u00b7\u00bf\u0003\u0018\f\u0000\u00b8\u00bf"+
		"\u0003:\u001d\u0000\u00b9\u00bf\u0003@ \u0000\u00ba\u00bf\u0003J%\u0000"+
		"\u00bb\u00bf\u0003N\'\u0000\u00bc\u00bf\u0003\f\u0006\u0000\u00bd\u00bf"+
		"\u0003R)\u0000\u00be\u00b2\u0001\u0000\u0000\u0000\u00be\u00b3\u0001\u0000"+
		"\u0000\u0000\u00be\u00b4\u0001\u0000\u0000\u0000\u00be\u00b5\u0001\u0000"+
		"\u0000\u0000\u00be\u00b6\u0001\u0000\u0000\u0000\u00be\u00b7\u0001\u0000"+
		"\u0000\u0000\u00be\u00b8\u0001\u0000\u0000\u0000\u00be\u00b9\u0001\u0000"+
		"\u0000\u0000\u00be\u00ba\u0001\u0000\u0000\u0000\u00be\u00bb\u0001\u0000"+
		"\u0000\u0000\u00be\u00bc\u0001\u0000\u0000\u0000\u00be\u00bd\u0001\u0000"+
		"\u0000\u0000\u00bf\u000b\u0001\u0000\u0000\u0000\u00c0\u00c1\u0005`\u0000"+
		"\u0000\u00c1\u00cd\u0005\u0001\u0000\u0000\u00c2\u00c7\u0003\u000e\u0007"+
		"\u0000\u00c3\u00c4\u0005\t\u0000\u0000\u00c4\u00c6\u0003\u000e\u0007\u0000"+
		"\u00c5\u00c3\u0001\u0000\u0000\u0000\u00c6\u00c9\u0001\u0000\u0000\u0000"+
		"\u00c7\u00c5\u0001\u0000\u0000\u0000\u00c7\u00c8\u0001\u0000\u0000\u0000"+
		"\u00c8\u00cb\u0001\u0000\u0000\u0000\u00c9\u00c7\u0001\u0000\u0000\u0000"+
		"\u00ca\u00cc\u0005\t\u0000\u0000\u00cb\u00ca\u0001\u0000\u0000\u0000\u00cb"+
		"\u00cc\u0001\u0000\u0000\u0000\u00cc\u00ce\u0001\u0000\u0000\u0000\u00cd"+
		"\u00c2\u0001\u0000\u0000\u0000\u00cd\u00ce\u0001\u0000\u0000\u0000\u00ce"+
		"\u00cf\u0001\u0000\u0000\u0000\u00cf\u00d0\u0005\u0002\u0000\u0000\u00d0"+
		"\r\u0001\u0000\u0000\u0000\u00d1\u00d2\u0005a\u0000\u0000\u00d2\u00d3"+
		"\u0005\u0003\u0000\u0000\u00d3\u00d4\u0007\u0000\u0000\u0000\u00d4\u000f"+
		"\u0001\u0000\u0000\u0000\u00d5\u00d6\u0005\f\u0000\u0000\u00d6\u00e2\u0005"+
		"\u0001\u0000\u0000\u00d7\u00dc\u0003\u0012\t\u0000\u00d8\u00d9\u0005\t"+
		"\u0000\u0000\u00d9\u00db\u0003\u0012\t\u0000\u00da\u00d8\u0001\u0000\u0000"+
		"\u0000\u00db\u00de\u0001\u0000\u0000\u0000\u00dc\u00da\u0001\u0000\u0000"+
		"\u0000\u00dc\u00dd\u0001\u0000\u0000\u0000\u00dd\u00e0\u0001\u0000\u0000"+
		"\u0000\u00de\u00dc\u0001\u0000\u0000\u0000\u00df\u00e1\u0005\t\u0000\u0000"+
		"\u00e0\u00df\u0001\u0000\u0000\u0000\u00e0\u00e1\u0001\u0000\u0000\u0000"+
		"\u00e1\u00e3\u0001\u0000\u0000\u0000\u00e2\u00d7\u0001\u0000\u0000\u0000"+
		"\u00e2\u00e3\u0001\u0000\u0000\u0000\u00e3\u00e4\u0001\u0000\u0000\u0000"+
		"\u00e4\u00e5\u0005\u0002\u0000\u0000\u00e5\u0011\u0001\u0000\u0000\u0000"+
		"\u00e6\u00ea\u0003l6\u0000\u00e7\u00ea\u0003n7\u0000\u00e8\u00ea\u0003"+
		"p8\u0000\u00e9\u00e6\u0001\u0000\u0000\u0000\u00e9\u00e7\u0001\u0000\u0000"+
		"\u0000\u00e9\u00e8\u0001\u0000\u0000\u0000\u00ea\u0013\u0001\u0000\u0000"+
		"\u0000\u00eb\u00ec\u0005\r\u0000\u0000\u00ec\u00f8\u0005\u0001\u0000\u0000"+
		"\u00ed\u00f2\u0003\u0016\u000b\u0000\u00ee\u00ef\u0005\t\u0000\u0000\u00ef"+
		"\u00f1\u0003\u0016\u000b\u0000\u00f0\u00ee\u0001\u0000\u0000\u0000\u00f1"+
		"\u00f4\u0001\u0000\u0000\u0000\u00f2\u00f0\u0001\u0000\u0000\u0000\u00f2"+
		"\u00f3\u0001\u0000\u0000\u0000\u00f3\u00f6\u0001\u0000\u0000\u0000\u00f4"+
		"\u00f2\u0001\u0000\u0000\u0000\u00f5\u00f7\u0005\t\u0000\u0000\u00f6\u00f5"+
		"\u0001\u0000\u0000\u0000\u00f6\u00f7\u0001\u0000\u0000\u0000\u00f7\u00f9"+
		"\u0001\u0000\u0000\u0000\u00f8\u00ed\u0001\u0000\u0000\u0000\u00f8\u00f9"+
		"\u0001\u0000\u0000\u0000\u00f9\u00fa\u0001\u0000\u0000\u0000\u00fa\u00fb"+
		"\u0005\u0002\u0000\u0000\u00fb\u0015\u0001\u0000\u0000\u0000\u00fc\u00fd"+
		"\u0003j5\u0000\u00fd\u0017\u0001\u0000\u0000\u0000\u00fe\u00ff\u0005\u000e"+
		"\u0000\u0000\u00ff\u010b\u0005\u0001\u0000\u0000\u0100\u0105\u0003\u001a"+
		"\r\u0000\u0101\u0102\u0005\t\u0000\u0000\u0102\u0104\u0003\u001a\r\u0000"+
		"\u0103\u0101\u0001\u0000\u0000\u0000\u0104\u0107\u0001\u0000\u0000\u0000"+
		"\u0105\u0103\u0001\u0000\u0000\u0000\u0105\u0106\u0001\u0000\u0000\u0000"+
		"\u0106\u0109\u0001\u0000\u0000\u0000\u0107\u0105\u0001\u0000\u0000\u0000"+
		"\u0108\u010a\u0005\t\u0000\u0000\u0109\u0108\u0001\u0000\u0000\u0000\u0109"+
		"\u010a\u0001\u0000\u0000\u0000\u010a\u010c\u0001\u0000\u0000\u0000\u010b"+
		"\u0100\u0001\u0000\u0000\u0000\u010b\u010c\u0001\u0000\u0000\u0000\u010c"+
		"\u010d\u0001\u0000\u0000\u0000\u010d\u010e\u0005\u0002\u0000\u0000\u010e"+
		"\u0019\u0001\u0000\u0000\u0000\u010f\u0113\u0003l6\u0000\u0110\u0113\u0003"+
		"n7\u0000\u0111\u0113\u0003p8\u0000\u0112\u010f\u0001\u0000\u0000\u0000"+
		"\u0112\u0110\u0001\u0000\u0000\u0000\u0112\u0111\u0001\u0000\u0000\u0000"+
		"\u0113\u001b\u0001\u0000\u0000\u0000\u0114\u0115\u0005\u000f\u0000\u0000"+
		"\u0115\u0121\u0005\u0001\u0000\u0000\u0116\u011b\u0003\u001e\u000f\u0000"+
		"\u0117\u0118\u0005\t\u0000\u0000\u0118\u011a\u0003\u001e\u000f\u0000\u0119"+
		"\u0117\u0001\u0000\u0000\u0000\u011a\u011d\u0001\u0000\u0000\u0000\u011b"+
		"\u0119\u0001\u0000\u0000\u0000\u011b\u011c\u0001\u0000\u0000\u0000\u011c"+
		"\u011f\u0001\u0000\u0000\u0000\u011d\u011b\u0001\u0000\u0000\u0000\u011e"+
		"\u0120\u0005\t\u0000\u0000\u011f\u011e\u0001\u0000\u0000\u0000\u011f\u0120"+
		"\u0001\u0000\u0000\u0000\u0120\u0122\u0001\u0000\u0000\u0000\u0121\u0116"+
		"\u0001\u0000\u0000\u0000\u0121\u0122\u0001\u0000\u0000\u0000\u0122\u0123"+
		"\u0001\u0000\u0000\u0000\u0123\u0124\u0005\u0002\u0000\u0000\u0124\u001d"+
		"\u0001\u0000\u0000\u0000\u0125\u0126\u0005\'\u0000\u0000\u0126\u0127\u0005"+
		"\u0003\u0000\u0000\u0127\u0135\u0005d\u0000\u0000\u0128\u0129\u0005)\u0000"+
		"\u0000\u0129\u012a\u0005\u0003\u0000\u0000\u012a\u0135\u0007\u0001\u0000"+
		"\u0000\u012b\u012c\u0005*\u0000\u0000\u012c\u012d\u0005\u0003\u0000\u0000"+
		"\u012d\u0135\u0007\u0002\u0000\u0000\u012e\u012f\u0005+\u0000\u0000\u012f"+
		"\u0130\u0005\u0003\u0000\u0000\u0130\u0135\u0007\u0002\u0000\u0000\u0131"+
		"\u0132\u0005K\u0000\u0000\u0132\u0133\u0005\u0003\u0000\u0000\u0133\u0135"+
		"\u0007\u0003\u0000\u0000\u0134\u0125\u0001\u0000\u0000\u0000\u0134\u0128"+
		"\u0001\u0000\u0000\u0000\u0134\u012b\u0001\u0000\u0000\u0000\u0134\u012e"+
		"\u0001\u0000\u0000\u0000\u0134\u0131\u0001\u0000\u0000\u0000\u0135\u001f"+
		"\u0001\u0000\u0000\u0000\u0136\u0137\u0005\u0011\u0000\u0000\u0137\u0143"+
		"\u0005\u0001\u0000\u0000\u0138\u013d\u0003\"\u0011\u0000\u0139\u013a\u0005"+
		"\t\u0000\u0000\u013a\u013c\u0003\"\u0011\u0000\u013b\u0139\u0001\u0000"+
		"\u0000\u0000\u013c\u013f\u0001\u0000\u0000\u0000\u013d\u013b\u0001\u0000"+
		"\u0000\u0000\u013d\u013e\u0001\u0000\u0000\u0000\u013e\u0141\u0001\u0000"+
		"\u0000\u0000\u013f\u013d\u0001\u0000\u0000\u0000\u0140\u0142\u0005\t\u0000"+
		"\u0000\u0141\u0140\u0001\u0000\u0000\u0000\u0141\u0142\u0001\u0000\u0000"+
		"\u0000\u0142\u0144\u0001\u0000\u0000\u0000\u0143\u0138\u0001\u0000\u0000"+
		"\u0000\u0143\u0144\u0001\u0000\u0000\u0000\u0144\u0145\u0001\u0000\u0000"+
		"\u0000\u0145\u0146\u0005\u0002\u0000\u0000\u0146!\u0001\u0000\u0000\u0000"+
		"\u0147\u014f\u0003d2\u0000\u0148\u014f\u0003f3\u0000\u0149\u014a\u0005"+
		"/\u0000\u0000\u014a\u014b\u0005\u0003\u0000\u0000\u014b\u014f\u0007\u0004"+
		"\u0000\u0000\u014c\u014f\u0003j5\u0000\u014d\u014f\u0003$\u0012\u0000"+
		"\u014e\u0147\u0001\u0000\u0000\u0000\u014e\u0148\u0001\u0000\u0000\u0000"+
		"\u014e\u0149\u0001\u0000\u0000\u0000\u014e\u014c\u0001\u0000\u0000\u0000"+
		"\u014e\u014d\u0001\u0000\u0000\u0000\u014f#\u0001\u0000\u0000\u0000\u0150"+
		"\u0151\u00057\u0000\u0000\u0151\u0152\u0005\u0003\u0000\u0000\u0152\u0153"+
		"\u0003&\u0013\u0000\u0153%\u0001\u0000\u0000\u0000\u0154\u0155\u0005\u0013"+
		"\u0000\u0000\u0155\u0161\u0005\u0001\u0000\u0000\u0156\u015b\u0003(\u0014"+
		"\u0000\u0157\u0158\u0005\t\u0000\u0000\u0158\u015a\u0003(\u0014\u0000"+
		"\u0159\u0157\u0001\u0000\u0000\u0000\u015a\u015d\u0001\u0000\u0000\u0000"+
		"\u015b\u0159\u0001\u0000\u0000\u0000\u015b\u015c\u0001\u0000\u0000\u0000"+
		"\u015c\u015f\u0001\u0000\u0000\u0000\u015d\u015b\u0001\u0000\u0000\u0000"+
		"\u015e\u0160\u0005\t\u0000\u0000\u015f\u015e\u0001\u0000\u0000\u0000\u015f"+
		"\u0160\u0001\u0000\u0000\u0000\u0160\u0162\u0001\u0000\u0000\u0000\u0161"+
		"\u0156\u0001\u0000\u0000\u0000\u0161\u0162\u0001\u0000\u0000\u0000\u0162"+
		"\u0163\u0001\u0000\u0000\u0000\u0163\u0164\u0005\u0002\u0000\u0000\u0164"+
		"\'\u0001\u0000\u0000\u0000\u0165\u0168\u0003h4\u0000\u0166\u0168\u0003"+
		"*\u0015\u0000\u0167\u0165\u0001\u0000\u0000\u0000\u0167\u0166\u0001\u0000"+
		"\u0000\u0000\u0168)\u0001\u0000\u0000\u0000\u0169\u016a\u00059\u0000\u0000"+
		"\u016a\u016b\u0005\u0003\u0000\u0000\u016b\u016c\u0003,\u0016\u0000\u016c"+
		"+\u0001\u0000\u0000\u0000\u016d\u0170\u00030\u0018\u0000\u016e\u0170\u0003"+
		".\u0017\u0000\u016f\u016d\u0001\u0000\u0000\u0000\u016f\u016e\u0001\u0000"+
		"\u0000\u0000\u0170-\u0001\u0000\u0000\u0000\u0171\u0172\u0005\u001d\u0000"+
		"\u0000\u0172\u0173\u0005\u0001\u0000\u0000\u0173\u0175\u00032\u0019\u0000"+
		"\u0174\u0176\u0005\t\u0000\u0000\u0175\u0174\u0001\u0000\u0000\u0000\u0175"+
		"\u0176\u0001\u0000\u0000\u0000\u0176\u0177\u0001\u0000\u0000\u0000\u0177"+
		"\u0178\u0005\u0002\u0000\u0000\u0178/\u0001\u0000\u0000\u0000\u0179\u017a"+
		"\u0005\u001c\u0000\u0000\u017a\u0186\u0005\u0001\u0000\u0000\u017b\u0180"+
		"\u00034\u001a\u0000\u017c\u017d\u0005\t\u0000\u0000\u017d\u017f\u0003"+
		"4\u001a\u0000\u017e\u017c\u0001\u0000\u0000\u0000\u017f\u0182\u0001\u0000"+
		"\u0000\u0000\u0180\u017e\u0001\u0000\u0000\u0000\u0180\u0181\u0001\u0000"+
		"\u0000\u0000\u0181\u0184\u0001\u0000\u0000\u0000\u0182\u0180\u0001\u0000"+
		"\u0000\u0000\u0183\u0185\u0005\t\u0000\u0000\u0184\u0183\u0001\u0000\u0000"+
		"\u0000\u0184\u0185\u0001\u0000\u0000\u0000\u0185\u0187\u0001\u0000\u0000"+
		"\u0000\u0186\u017b\u0001\u0000\u0000\u0000\u0186\u0187\u0001\u0000\u0000"+
		"\u0000\u0187\u0188\u0001\u0000\u0000\u0000\u0188\u0189\u0005\u0002\u0000"+
		"\u0000\u01891\u0001\u0000\u0000\u0000\u018a\u018b\u0005Z\u0000\u0000\u018b"+
		"\u018c\u0005\u0003\u0000\u0000\u018c\u018d\u0007\u0002\u0000\u0000\u018d"+
		"3\u0001\u0000\u0000\u0000\u018e\u018f\u0005<\u0000\u0000\u018f\u0190\u0005"+
		"\u0003\u0000\u0000\u0190\u019b\u0007\u0002\u0000\u0000\u0191\u0192\u0005"+
		"=\u0000\u0000\u0192\u0193\u0005\u0003\u0000\u0000\u0193\u019b\u0007\u0002"+
		"\u0000\u0000\u0194\u0195\u0005>\u0000\u0000\u0195\u0196\u0005\u0003\u0000"+
		"\u0000\u0196\u019b\u0007\u0002\u0000\u0000\u0197\u0198\u0005?\u0000\u0000"+
		"\u0198\u0199\u0005\u0003\u0000\u0000\u0199\u019b\u0007\u0002\u0000\u0000"+
		"\u019a\u018e\u0001\u0000\u0000\u0000\u019a\u0191\u0001\u0000\u0000\u0000"+
		"\u019a\u0194\u0001\u0000\u0000\u0000\u019a\u0197\u0001\u0000\u0000\u0000"+
		"\u019b5\u0001\u0000\u0000\u0000\u019c\u019d\u0005\u0012\u0000\u0000\u019d"+
		"\u01a9\u0005\u0001\u0000\u0000\u019e\u01a3\u00038\u001c\u0000\u019f\u01a0"+
		"\u0005\t\u0000\u0000\u01a0\u01a2\u00038\u001c\u0000\u01a1\u019f\u0001"+
		"\u0000\u0000\u0000\u01a2\u01a5\u0001\u0000\u0000\u0000\u01a3\u01a1\u0001"+
		"\u0000\u0000\u0000\u01a3\u01a4\u0001\u0000\u0000\u0000\u01a4\u01a7\u0001"+
		"\u0000\u0000\u0000\u01a5\u01a3\u0001\u0000\u0000\u0000\u01a6\u01a8\u0005"+
		"\t\u0000\u0000\u01a7\u01a6\u0001\u0000\u0000\u0000\u01a7\u01a8\u0001\u0000"+
		"\u0000\u0000\u01a8\u01aa\u0001\u0000\u0000\u0000\u01a9\u019e\u0001\u0000"+
		"\u0000\u0000\u01a9\u01aa\u0001\u0000\u0000\u0000\u01aa\u01ab\u0001\u0000"+
		"\u0000\u0000\u01ab\u01ac\u0005\u0002\u0000\u0000\u01ac7\u0001\u0000\u0000"+
		"\u0000\u01ad\u01ae\u00051\u0000\u0000\u01ae\u01af\u0005\u0003\u0000\u0000"+
		"\u01af\u01b2\u0005c\u0000\u0000\u01b0\u01b2\u0003j5\u0000\u01b1\u01ad"+
		"\u0001\u0000\u0000\u0000\u01b1\u01b0\u0001\u0000\u0000\u0000\u01b29\u0001"+
		"\u0000\u0000\u0000\u01b3\u01b4\u0005\u0019\u0000\u0000\u01b4\u01c0\u0005"+
		"\u0001\u0000\u0000\u01b5\u01ba\u0003<\u001e\u0000\u01b6\u01b7\u0005\t"+
		"\u0000\u0000\u01b7\u01b9\u0003<\u001e\u0000\u01b8\u01b6\u0001\u0000\u0000"+
		"\u0000\u01b9\u01bc\u0001\u0000\u0000\u0000\u01ba\u01b8\u0001\u0000\u0000"+
		"\u0000\u01ba\u01bb\u0001\u0000\u0000\u0000\u01bb\u01be\u0001\u0000\u0000"+
		"\u0000\u01bc\u01ba\u0001\u0000\u0000\u0000\u01bd\u01bf\u0005\t\u0000\u0000"+
		"\u01be\u01bd\u0001\u0000\u0000\u0000\u01be\u01bf\u0001\u0000\u0000\u0000"+
		"\u01bf\u01c1\u0001\u0000\u0000\u0000\u01c0\u01b5\u0001\u0000\u0000\u0000"+
		"\u01c0\u01c1\u0001\u0000\u0000\u0000\u01c1\u01c2\u0001\u0000\u0000\u0000"+
		"\u01c2\u01c3\u0005\u0002\u0000\u0000\u01c3;\u0001\u0000\u0000\u0000\u01c4"+
		"\u01c5\u0005L\u0000\u0000\u01c5\u01c6\u0005\u0003\u0000\u0000\u01c6\u01c7"+
		"\u0003>\u001f\u0000\u01c7=\u0001\u0000\u0000\u0000\u01c8\u01cd\u0005\u0001"+
		"\u0000\u0000\u01c9\u01ca\u0005a\u0000\u0000\u01ca\u01cc\u0005\t\u0000"+
		"\u0000\u01cb\u01c9\u0001\u0000\u0000\u0000\u01cc\u01cf\u0001\u0000\u0000"+
		"\u0000\u01cd\u01cb\u0001\u0000\u0000\u0000\u01cd\u01ce\u0001\u0000\u0000"+
		"\u0000\u01ce\u01d0\u0001\u0000\u0000\u0000\u01cf\u01cd\u0001\u0000\u0000"+
		"\u0000\u01d0\u01d1\u0005\u0002\u0000\u0000\u01d1\u01d5\u0005\u0006\u0000"+
		"\u0000\u01d2\u01d4\u0003Z-\u0000\u01d3\u01d2\u0001\u0000\u0000\u0000\u01d4"+
		"\u01d7\u0001\u0000\u0000\u0000\u01d5\u01d3\u0001\u0000\u0000\u0000\u01d5"+
		"\u01d6\u0001\u0000\u0000\u0000\u01d6\u01d8\u0001\u0000\u0000\u0000\u01d7"+
		"\u01d5\u0001\u0000\u0000\u0000\u01d8\u01d9\u0005\u0007\u0000\u0000\u01d9"+
		"?\u0001\u0000\u0000\u0000\u01da\u01db\u0005\u0014\u0000\u0000\u01db\u01e7"+
		"\u0005\u0001\u0000\u0000\u01dc\u01e1\u0003B!\u0000\u01dd\u01de\u0005\t"+
		"\u0000\u0000\u01de\u01e0\u0003B!\u0000\u01df\u01dd\u0001\u0000\u0000\u0000"+
		"\u01e0\u01e3\u0001\u0000\u0000\u0000\u01e1\u01df\u0001\u0000\u0000\u0000"+
		"\u01e1\u01e2\u0001\u0000\u0000\u0000\u01e2\u01e5\u0001\u0000\u0000\u0000"+
		"\u01e3\u01e1\u0001\u0000\u0000\u0000\u01e4\u01e6\u0005\t\u0000\u0000\u01e5"+
		"\u01e4\u0001\u0000\u0000\u0000\u01e5\u01e6\u0001\u0000\u0000\u0000\u01e6"+
		"\u01e8\u0001\u0000\u0000\u0000\u01e7\u01dc\u0001\u0000\u0000\u0000\u01e7"+
		"\u01e8\u0001\u0000\u0000\u0000\u01e8\u01e9\u0001\u0000\u0000\u0000\u01e9"+
		"\u01ea\u0005\u0002\u0000\u0000\u01eaA\u0001\u0000\u0000\u0000\u01eb\u01ec"+
		"\u0005;\u0000\u0000\u01ec\u01ed\u0005\u0003\u0000\u0000\u01ed\u01f0\u0003"+
		"D\"\u0000\u01ee\u01f0\u0003j5\u0000\u01ef\u01eb\u0001\u0000\u0000\u0000"+
		"\u01ef\u01ee\u0001\u0000\u0000\u0000\u01f0C\u0001\u0000\u0000\u0000\u01f1"+
		"\u01f2\u0005\u0015\u0000\u0000\u01f2\u01fe\u0005\u0001\u0000\u0000\u01f3"+
		"\u01f8\u0003F#\u0000\u01f4\u01f5\u0005\t\u0000\u0000\u01f5\u01f7\u0003"+
		"F#\u0000\u01f6\u01f4\u0001\u0000\u0000\u0000\u01f7\u01fa\u0001\u0000\u0000"+
		"\u0000\u01f8\u01f6\u0001\u0000\u0000\u0000\u01f8\u01f9\u0001\u0000\u0000"+
		"\u0000\u01f9\u01fc\u0001\u0000\u0000\u0000\u01fa\u01f8\u0001\u0000\u0000"+
		"\u0000\u01fb\u01fd\u0005\t\u0000\u0000\u01fc\u01fb\u0001\u0000\u0000\u0000"+
		"\u01fc\u01fd\u0001\u0000\u0000\u0000\u01fd\u01ff\u0001\u0000\u0000\u0000"+
		"\u01fe\u01f3\u0001\u0000\u0000\u0000\u01fe\u01ff\u0001\u0000\u0000\u0000"+
		"\u01ff\u0200\u0001\u0000\u0000\u0000\u0200\u0212\u0005\u0002\u0000\u0000"+
		"\u0201\u0202\u0005\u0016\u0000\u0000\u0202\u020e\u0005\u0001\u0000\u0000"+
		"\u0203\u0208\u0003H$\u0000\u0204\u0205\u0005\t\u0000\u0000\u0205\u0207"+
		"\u0003H$\u0000\u0206\u0204\u0001\u0000\u0000\u0000\u0207\u020a\u0001\u0000"+
		"\u0000\u0000\u0208\u0206\u0001\u0000\u0000\u0000\u0208\u0209\u0001\u0000"+
		"\u0000\u0000\u0209\u020c\u0001\u0000\u0000\u0000\u020a\u0208\u0001\u0000"+
		"\u0000\u0000\u020b\u020d\u0005\t\u0000\u0000\u020c\u020b\u0001\u0000\u0000"+
		"\u0000\u020c\u020d\u0001\u0000\u0000\u0000\u020d\u020f\u0001\u0000\u0000"+
		"\u0000\u020e\u0203\u0001\u0000\u0000\u0000\u020e\u020f\u0001\u0000\u0000"+
		"\u0000\u020f\u0210\u0001\u0000\u0000\u0000\u0210\u0212\u0005\u0002\u0000"+
		"\u0000\u0211\u01f1\u0001\u0000\u0000\u0000\u0211\u0201\u0001\u0000\u0000"+
		"\u0000\u0212E\u0001\u0000\u0000\u0000\u0213\u0214\u0005\\\u0000\u0000"+
		"\u0214\u0215\u0005\u0003\u0000\u0000\u0215\u0220\u0007\u0002\u0000\u0000"+
		"\u0216\u0217\u0005]\u0000\u0000\u0217\u0218\u0005\u0003\u0000\u0000\u0218"+
		"\u0220\u0007\u0002\u0000\u0000\u0219\u021a\u0005_\u0000\u0000\u021a\u021b"+
		"\u0005\u0003\u0000\u0000\u021b\u0220\u0007\u0002\u0000\u0000\u021c\u021d"+
		"\u0005^\u0000\u0000\u021d\u021e\u0005\u0003\u0000\u0000\u021e\u0220\u0007"+
		"\u0002\u0000\u0000\u021f\u0213\u0001\u0000\u0000\u0000\u021f\u0216\u0001"+
		"\u0000\u0000\u0000\u021f\u0219\u0001\u0000\u0000\u0000\u021f\u021c\u0001"+
		"\u0000\u0000\u0000\u0220G\u0001\u0000\u0000\u0000\u0221\u0222\u0005@\u0000"+
		"\u0000\u0222\u0223\u0005\u0003\u0000\u0000\u0223\u0228\u0007\u0002\u0000"+
		"\u0000\u0224\u0225\u0005A\u0000\u0000\u0225\u0226\u0005\u0003\u0000\u0000"+
		"\u0226\u0228\u0007\u0002\u0000\u0000\u0227\u0221\u0001\u0000\u0000\u0000"+
		"\u0227\u0224\u0001\u0000\u0000\u0000\u0228I\u0001\u0000\u0000\u0000\u0229"+
		"\u022a\u0005\u0017\u0000\u0000\u022a\u0236\u0005\u0001\u0000\u0000\u022b"+
		"\u0230\u0003L&\u0000\u022c\u022d\u0005\t\u0000\u0000\u022d\u022f\u0003"+
		"L&\u0000\u022e\u022c\u0001\u0000\u0000\u0000\u022f\u0232\u0001\u0000\u0000"+
		"\u0000\u0230\u022e\u0001\u0000\u0000\u0000\u0230\u0231\u0001\u0000\u0000"+
		"\u0000\u0231\u0234\u0001\u0000\u0000\u0000\u0232\u0230\u0001\u0000\u0000"+
		"\u0000\u0233\u0235\u0005\t\u0000\u0000\u0234\u0233\u0001\u0000\u0000\u0000"+
		"\u0234\u0235\u0001\u0000\u0000\u0000\u0235\u0237\u0001\u0000\u0000\u0000"+
		"\u0236\u022b\u0001\u0000\u0000\u0000\u0236\u0237\u0001\u0000\u0000\u0000"+
		"\u0237\u0238\u0001\u0000\u0000\u0000\u0238\u0239\u0005\u0002\u0000\u0000"+
		"\u0239K\u0001\u0000\u0000\u0000\u023a\u023b\u0005C\u0000\u0000\u023b\u023c"+
		"\u0005\u0003\u0000\u0000\u023c\u0243\u0005d\u0000\u0000\u023d\u023e\u0005"+
		"B\u0000\u0000\u023e\u023f\u0005\u0003\u0000\u0000\u023f\u0243\u0007\u0005"+
		"\u0000\u0000\u0240\u0243\u0003d2\u0000\u0241\u0243\u0003f3\u0000\u0242"+
		"\u023a\u0001\u0000\u0000\u0000\u0242\u023d\u0001\u0000\u0000\u0000\u0242"+
		"\u0240\u0001\u0000\u0000\u0000\u0242\u0241\u0001\u0000\u0000\u0000\u0243"+
		"M\u0001\u0000\u0000\u0000\u0244\u0245\u0005\u0018\u0000\u0000\u0245\u0251"+
		"\u0005\u0001\u0000\u0000\u0246\u024b\u0003P(\u0000\u0247\u0248\u0005\t"+
		"\u0000\u0000\u0248\u024a\u0003P(\u0000\u0249\u0247\u0001\u0000\u0000\u0000"+
		"\u024a\u024d\u0001\u0000\u0000\u0000\u024b\u0249\u0001\u0000\u0000\u0000"+
		"\u024b\u024c\u0001\u0000\u0000\u0000\u024c\u024f\u0001\u0000\u0000\u0000"+
		"\u024d\u024b\u0001\u0000\u0000\u0000\u024e\u0250\u0005\t\u0000\u0000\u024f"+
		"\u024e\u0001\u0000\u0000\u0000\u024f\u0250\u0001\u0000\u0000\u0000\u0250"+
		"\u0252\u0001\u0000\u0000\u0000\u0251\u0246\u0001\u0000\u0000\u0000\u0251"+
		"\u0252\u0001\u0000\u0000\u0000\u0252\u0253\u0001\u0000\u0000\u0000\u0253"+
		"\u0254\u0005\u0002\u0000\u0000\u0254O\u0001\u0000\u0000\u0000\u0255\u0264"+
		"\u0003d2\u0000\u0256\u0264\u0003f3\u0000\u0257\u0258\u0005D\u0000\u0000"+
		"\u0258\u0259\u0005\u0003\u0000\u0000\u0259\u0264\u0005d\u0000\u0000\u025a"+
		"\u025b\u0005E\u0000\u0000\u025b\u025c\u0005\u0003\u0000\u0000\u025c\u0264"+
		"\u0005e\u0000\u0000\u025d\u025e\u0005F\u0000\u0000\u025e\u025f\u0005\u0003"+
		"\u0000\u0000\u025f\u0264\u0005e\u0000\u0000\u0260\u0261\u0005L\u0000\u0000"+
		"\u0261\u0262\u0005\u0003\u0000\u0000\u0262\u0264\u0003>\u001f\u0000\u0263"+
		"\u0255\u0001\u0000\u0000\u0000\u0263\u0256\u0001\u0000\u0000\u0000\u0263"+
		"\u0257\u0001\u0000\u0000\u0000\u0263\u025a\u0001\u0000\u0000\u0000\u0263"+
		"\u025d\u0001\u0000\u0000\u0000\u0263\u0260\u0001\u0000\u0000\u0000\u0264"+
		"Q\u0001\u0000\u0000\u0000\u0265\u0266\u0005\u001a\u0000\u0000\u0266\u0272"+
		"\u0005\u0001\u0000\u0000\u0267\u026c\u0003T*\u0000\u0268\u0269\u0005\t"+
		"\u0000\u0000\u0269\u026b\u0003T*\u0000\u026a\u0268\u0001\u0000\u0000\u0000"+
		"\u026b\u026e\u0001\u0000\u0000\u0000\u026c\u026a\u0001\u0000\u0000\u0000"+
		"\u026c\u026d\u0001\u0000\u0000\u0000\u026d\u0270\u0001\u0000\u0000\u0000"+
		"\u026e\u026c\u0001\u0000\u0000\u0000\u026f\u0271\u0005\t\u0000\u0000\u0270"+
		"\u026f\u0001\u0000\u0000\u0000\u0270\u0271\u0001\u0000\u0000\u0000\u0271"+
		"\u0273\u0001\u0000\u0000\u0000\u0272\u0267\u0001\u0000\u0000\u0000\u0272"+
		"\u0273\u0001\u0000\u0000\u0000\u0273\u0274\u0001\u0000\u0000\u0000\u0274"+
		"\u0275\u0005\u0002\u0000\u0000\u0275S\u0001\u0000\u0000\u0000\u0276\u0277"+
		"\u0005T\u0000\u0000\u0277\u0278\u0005\u0003\u0000\u0000\u0278\u028c\u0005"+
		"d\u0000\u0000\u0279\u027a\u0005U\u0000\u0000\u027a\u027b\u0005\u0003\u0000"+
		"\u0000\u027b\u028c\u0005d\u0000\u0000\u027c\u027d\u0005V\u0000\u0000\u027d"+
		"\u027e\u0005\u0003\u0000\u0000\u027e\u028c\u0005e\u0000\u0000\u027f\u0280"+
		"\u0005;\u0000\u0000\u0280\u0281\u0005\u0003\u0000\u0000\u0281\u028c\u0003"+
		"D\"\u0000\u0282\u0283\u0005W\u0000\u0000\u0283\u0284\u0005\u0003\u0000"+
		"\u0000\u0284\u028c\u0005d\u0000\u0000\u0285\u0286\u0005X\u0000\u0000\u0286"+
		"\u0287\u0005\u0003\u0000\u0000\u0287\u028c\u0003V+\u0000\u0288\u0289\u0005"+
		"[\u0000\u0000\u0289\u028a\u0005\u0003\u0000\u0000\u028a\u028c\u0003>\u001f"+
		"\u0000\u028b\u0276\u0001\u0000\u0000\u0000\u028b\u0279\u0001\u0000\u0000"+
		"\u0000\u028b\u027c\u0001\u0000\u0000\u0000\u028b\u027f\u0001\u0000\u0000"+
		"\u0000\u028b\u0282\u0001\u0000\u0000\u0000\u028b\u0285\u0001\u0000\u0000"+
		"\u0000\u028b\u0288\u0001\u0000\u0000\u0000\u028cU\u0001\u0000\u0000\u0000"+
		"\u028d\u028e\u0005\u001b\u0000\u0000\u028e\u029a\u0005\u0001\u0000\u0000"+
		"\u028f\u0294\u0003X,\u0000\u0290\u0291\u0005\t\u0000\u0000\u0291\u0293"+
		"\u0003X,\u0000\u0292\u0290\u0001\u0000\u0000\u0000\u0293\u0296\u0001\u0000"+
		"\u0000\u0000\u0294\u0292\u0001\u0000\u0000\u0000\u0294\u0295\u0001\u0000"+
		"\u0000\u0000\u0295\u0298\u0001\u0000\u0000\u0000\u0296\u0294\u0001\u0000"+
		"\u0000\u0000\u0297\u0299\u0005\t\u0000\u0000\u0298\u0297\u0001\u0000\u0000"+
		"\u0000\u0298\u0299\u0001\u0000\u0000\u0000\u0299\u029b\u0001\u0000\u0000"+
		"\u0000\u029a\u028f\u0001\u0000\u0000\u0000\u029a\u029b\u0001\u0000\u0000"+
		"\u0000\u029b\u029c\u0001\u0000\u0000\u0000\u029c\u029d\u0005\u0002\u0000"+
		"\u0000\u029dW\u0001\u0000\u0000\u0000\u029e\u029f\u0005Y\u0000\u0000\u029f"+
		"\u02a0\u0005\u0003\u0000\u0000\u02a0\u02a6\u0005c\u0000\u0000\u02a1\u02a2"+
		"\u00059\u0000\u0000\u02a2\u02a3\u0005\u0003\u0000\u0000\u02a3\u02a6\u0003"+
		",\u0016\u0000\u02a4\u02a6\u0003h4\u0000\u02a5\u029e\u0001\u0000\u0000"+
		"\u0000\u02a5\u02a1\u0001\u0000\u0000\u0000\u02a5\u02a4\u0001\u0000\u0000"+
		"\u0000\u02a6Y\u0001\u0000\u0000\u0000\u02a7\u02aa\u0003\\.\u0000\u02a8"+
		"\u02aa\u0003^/\u0000\u02a9\u02a7\u0001\u0000\u0000\u0000\u02a9\u02a8\u0001"+
		"\u0000\u0000\u0000\u02aa[\u0001\u0000\u0000\u0000\u02ab\u02ac\u0007\u0006"+
		"\u0000\u0000\u02ac\u02ad\u0005a\u0000\u0000\u02ad\u02bb\u0005\b\u0000"+
		"\u0000\u02ae\u02af\u0005&\u0000\u0000\u02af\u02b4\u0005\u0001\u0000\u0000"+
		"\u02b0\u02b1\u0007\u0006\u0000\u0000\u02b1\u02b3\u0005\t\u0000\u0000\u02b2"+
		"\u02b0\u0001\u0000\u0000\u0000\u02b3\u02b6\u0001\u0000\u0000\u0000\u02b4"+
		"\u02b2\u0001\u0000\u0000\u0000\u02b4\u02b5\u0001\u0000\u0000\u0000\u02b5"+
		"\u02b7\u0001\u0000\u0000\u0000\u02b6\u02b4\u0001\u0000\u0000\u0000\u02b7"+
		"\u02b8\u0005\u0002\u0000\u0000\u02b8\u02b9\u0005a\u0000\u0000\u02b9\u02bb"+
		"\u0005\b\u0000\u0000\u02ba\u02ab\u0001\u0000\u0000\u0000\u02ba\u02ae\u0001"+
		"\u0000\u0000\u0000\u02bb]\u0001\u0000\u0000\u0000\u02bc\u02bd\u0005a\u0000"+
		"\u0000\u02bd\u02be\u0005\n\u0000\u0000\u02be\u02bf\u0007\u0000\u0000\u0000"+
		"\u02bf\u02c0\u0005\b\u0000\u0000\u02c0_\u0001\u0000\u0000\u0000\u02c1"+
		"\u02c3\u0003\\.\u0000\u02c2\u02c1\u0001\u0000\u0000\u0000\u02c3\u02c6"+
		"\u0001\u0000\u0000\u0000\u02c4\u02c2\u0001\u0000\u0000\u0000\u02c4\u02c5"+
		"\u0001\u0000\u0000\u0000\u02c5a\u0001\u0000\u0000\u0000\u02c6\u02c4\u0001"+
		"\u0000\u0000\u0000\u02c7\u02c8\u0003\n\u0005\u0000\u02c8c\u0001\u0000"+
		"\u0000\u0000\u02c9\u02ca\u0005-\u0000\u0000\u02ca\u02cb\u0005\u0003\u0000"+
		"\u0000\u02cb\u02cc\u0007\u0002\u0000\u0000\u02cce\u0001\u0000\u0000\u0000"+
		"\u02cd\u02ce\u0005.\u0000\u0000\u02ce\u02cf\u0005\u0003\u0000\u0000\u02cf"+
		"\u02d0\u0007\u0002\u0000\u0000\u02d0g\u0001\u0000\u0000\u0000\u02d1\u02d2"+
		"\u00058\u0000\u0000\u02d2\u02d3\u0005\u0003\u0000\u0000\u02d3\u02d4\u0005"+
		"e\u0000\u0000\u02d4i\u0001\u0000\u0000\u0000\u02d5\u02d6\u0005 \u0000"+
		"\u0000\u02d6\u02d7\u0005\u0003\u0000\u0000\u02d7\u02d8\u0003\n\u0005\u0000"+
		"\u02d8k\u0001\u0000\u0000\u0000\u02d9\u02da\u0005\u001e\u0000\u0000\u02da"+
		"\u02db\u0005\u0003\u0000\u0000\u02db\u02e1\u0005\u0004\u0000\u0000\u02dc"+
		"\u02dd\u0003\n\u0005\u0000\u02dd\u02de\u0005\t\u0000\u0000\u02de\u02e0"+
		"\u0001\u0000\u0000\u0000\u02df\u02dc\u0001\u0000\u0000\u0000\u02e0\u02e3"+
		"\u0001\u0000\u0000\u0000\u02e1\u02df\u0001\u0000\u0000\u0000\u02e1\u02e2"+
		"\u0001\u0000\u0000\u0000\u02e2\u02e4\u0001\u0000\u0000\u0000\u02e3\u02e1"+
		"\u0001\u0000\u0000\u0000\u02e4\u02e5\u0005\u0005\u0000\u0000\u02e5m\u0001"+
		"\u0000\u0000\u0000\u02e6\u02e7\u00052\u0000\u0000\u02e7\u02e8\u0005\u0003"+
		"\u0000\u0000\u02e8\u02e9\u0007\u0007\u0000\u0000\u02e9o\u0001\u0000\u0000"+
		"\u0000\u02ea\u02eb\u00055\u0000\u0000\u02eb\u02ec\u0005\u0003\u0000\u0000"+
		"\u02ec\u02ed\u0007\b\u0000\u0000\u02edq\u0001\u0000\u0000\u0000Vu{\u0087"+
		"\u008b\u008d\u0097\u00a0\u00a4\u00a6\u00b0\u00be\u00c7\u00cb\u00cd\u00dc"+
		"\u00e0\u00e2\u00e9\u00f2\u00f6\u00f8\u0105\u0109\u010b\u0112\u011b\u011f"+
		"\u0121\u0134\u013d\u0141\u0143\u014e\u015b\u015f\u0161\u0167\u016f\u0175"+
		"\u0180\u0184\u0186\u019a\u01a3\u01a7\u01a9\u01b1\u01ba\u01be\u01c0\u01cd"+
		"\u01d5\u01e1\u01e5\u01e7\u01ef\u01f8\u01fc\u01fe\u0208\u020c\u020e\u0211"+
		"\u021f\u0227\u0230\u0234\u0236\u0242\u024b\u024f\u0251\u0263\u026c\u0270"+
		"\u0272\u028b\u0294\u0298\u029a\u02a5\u02a9\u02b4\u02ba\u02c4\u02e1";
=======
		"7\u00077\u0001\u0000\u0005\u0000r\b\u0000\n\u0000\f\u0000u\t\u0000\u0001"+
		"\u0000\u0005\u0000x\b\u0000\n\u0000\f\u0000{\t\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005"+
		"\u0001\u0084\b\u0001\n\u0001\f\u0001\u0087\t\u0001\u0001\u0001\u0003\u0001"+
		"\u008a\b\u0001\u0003\u0001\u008c\b\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003"+
		"\u0002\u0096\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0005\u0003\u009d\b\u0003\n\u0003\f\u0003\u00a0\t\u0003\u0001\u0003"+
		"\u0003\u0003\u00a3\b\u0003\u0003\u0003\u00a5\b\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0003\u0004\u00af\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u00bd\b\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u00c4\b\u0006\n"+
		"\u0006\f\u0006\u00c7\t\u0006\u0001\u0006\u0003\u0006\u00ca\b\u0006\u0003"+
		"\u0006\u00cc\b\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b\u00d9"+
		"\b\b\n\b\f\b\u00dc\t\b\u0001\b\u0003\b\u00df\b\b\u0003\b\u00e1\b\b\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\t\u0003\t\u00e8\b\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0005\n\u00ef\b\n\n\n\f\n\u00f2\t\n\u0001\n\u0003\n"+
		"\u00f5\b\n\u0003\n\u00f7\b\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u0102\b\f\n\f\f\f\u0105\t\f"+
		"\u0001\f\u0003\f\u0108\b\f\u0003\f\u010a\b\f\u0001\f\u0001\f\u0001\r\u0001"+
		"\r\u0001\r\u0003\r\u0111\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0005\u000e\u0118\b\u000e\n\u000e\f\u000e\u011b\t\u000e"+
		"\u0001\u000e\u0003\u000e\u011e\b\u000e\u0003\u000e\u0120\b\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u0133"+
		"\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0005"+
		"\u0010\u013a\b\u0010\n\u0010\f\u0010\u013d\t\u0010\u0001\u0010\u0003\u0010"+
		"\u0140\b\u0010\u0003\u0010\u0142\b\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u014f\b\u0011\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u0156\b\u0012\n"+
		"\u0012\f\u0012\u0159\t\u0012\u0001\u0012\u0003\u0012\u015c\b\u0012\u0003"+
		"\u0012\u015e\b\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0003\u0013\u0166\b\u0013\u0001\u0014\u0001\u0014\u0003"+
		"\u0014\u016a\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003"+
		"\u0015\u0170\b\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0005\u0016\u0179\b\u0016\n\u0016\f\u0016"+
		"\u017c\t\u0016\u0001\u0016\u0003\u0016\u017f\b\u0016\u0003\u0016\u0181"+
		"\b\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0003\u0018\u0195\b\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0005\u0019\u019c\b\u0019\n\u0019\f\u0019\u019f\t\u0019"+
		"\u0001\u0019\u0003\u0019\u01a2\b\u0019\u0003\u0019\u01a4\b\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003"+
		"\u001a\u01ac\b\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0005\u001b\u01b3\b\u001b\n\u001b\f\u001b\u01b6\t\u001b\u0001\u001b"+
		"\u0003\u001b\u01b9\b\u001b\u0003\u001b\u01bb\b\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0005\u001d\u01c6\b\u001d\n\u001d\f\u001d\u01c9\t\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0005\u001d\u01ce\b\u001d\n\u001d"+
		"\f\u001d\u01d1\t\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0005\u001e\u01da\b\u001e\n\u001e"+
		"\f\u001e\u01dd\t\u001e\u0001\u001e\u0003\u001e\u01e0\b\u001e\u0003\u001e"+
		"\u01e2\b\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0003\u001f\u01ea\b\u001f\u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0005 \u01f1\b \n \f \u01f4\t \u0001 \u0003 \u01f7\b \u0003 \u01f9\b"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0005 \u0201\b \n \f \u0204"+
		"\t \u0001 \u0003 \u0207\b \u0003 \u0209\b \u0001 \u0003 \u020c\b \u0001"+
		"!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001"+
		"!\u0001!\u0003!\u021a\b!\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0003\"\u0222\b\"\u0001#\u0001#\u0001#\u0001#\u0001#\u0005#\u0229\b"+
		"#\n#\f#\u022c\t#\u0001#\u0003#\u022f\b#\u0003#\u0231\b#\u0001#\u0001#"+
		"\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0003$\u023d"+
		"\b$\u0001%\u0001%\u0001%\u0001%\u0001%\u0005%\u0244\b%\n%\f%\u0247\t%"+
		"\u0001%\u0003%\u024a\b%\u0003%\u024c\b%\u0001%\u0001%\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0003&\u025e\b&\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0005"+
		"\'\u0265\b\'\n\'\f\'\u0268\t\'\u0001\'\u0003\'\u026b\b\'\u0003\'\u026d"+
		"\b\'\u0001\'\u0001\'\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001("+
		"\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001"+
		"(\u0001(\u0001(\u0001(\u0001(\u0003(\u0286\b(\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0005)\u028d\b)\n)\f)\u0290\t)\u0001)\u0003)\u0293\b)\u0003)"+
		"\u0295\b)\u0001)\u0001)\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001"+
		"*\u0003*\u02a0\b*\u0001+\u0001+\u0001+\u0003+\u02a5\b+\u0001,\u0001,\u0001"+
		",\u0001,\u0001,\u0001,\u0001,\u0005,\u02ae\b,\n,\f,\u02b1\t,\u0001,\u0001"+
		",\u0001,\u0003,\u02b6\b,\u0001-\u0001-\u0001-\u0001-\u0001-\u0001.\u0001"+
		".\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001/\u0005"+
		"/\u02c8\b/\n/\f/\u02cb\t/\u00010\u00010\u00011\u00011\u00011\u00011\u0001"+
		"2\u00012\u00012\u00012\u00013\u00013\u00013\u00013\u00014\u00014\u0001"+
		"4\u00014\u00015\u00015\u00015\u00015\u00015\u00015\u00055\u02e5\b5\n5"+
		"\f5\u02e8\t5\u00015\u00015\u00016\u00016\u00016\u00016\u00017\u00017\u0001"+
		"7\u00017\u00017\u0000\u00008\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPR"+
		"TVXZ\\^`bdfhjln\u0000\t\u0001\u0000bd\u0002\u0000,,QS\u0001\u0000bc\u0002"+
		"\u000000MO\u0003\u000000]]__\u0001\u0000GH\u0001\u0000\"$\u0001\u0000"+
		"34\u0004\u0000\r\r66]]__\u0334\u0000s\u0001\u0000\u0000\u0000\u0002~\u0001"+
		"\u0000\u0000\u0000\u0004\u0095\u0001\u0000\u0000\u0000\u0006\u0097\u0001"+
		"\u0000\u0000\u0000\b\u00ae\u0001\u0000\u0000\u0000\n\u00bc\u0001\u0000"+
		"\u0000\u0000\f\u00be\u0001\u0000\u0000\u0000\u000e\u00cf\u0001\u0000\u0000"+
		"\u0000\u0010\u00d3\u0001\u0000\u0000\u0000\u0012\u00e7\u0001\u0000\u0000"+
		"\u0000\u0014\u00e9\u0001\u0000\u0000\u0000\u0016\u00fa\u0001\u0000\u0000"+
		"\u0000\u0018\u00fc\u0001\u0000\u0000\u0000\u001a\u0110\u0001\u0000\u0000"+
		"\u0000\u001c\u0112\u0001\u0000\u0000\u0000\u001e\u0132\u0001\u0000\u0000"+
		"\u0000 \u0134\u0001\u0000\u0000\u0000\"\u014e\u0001\u0000\u0000\u0000"+
		"$\u0150\u0001\u0000\u0000\u0000&\u0165\u0001\u0000\u0000\u0000(\u0169"+
		"\u0001\u0000\u0000\u0000*\u016b\u0001\u0000\u0000\u0000,\u0173\u0001\u0000"+
		"\u0000\u0000.\u0184\u0001\u0000\u0000\u00000\u0194\u0001\u0000\u0000\u0000"+
		"2\u0196\u0001\u0000\u0000\u00004\u01ab\u0001\u0000\u0000\u00006\u01ad"+
		"\u0001\u0000\u0000\u00008\u01be\u0001\u0000\u0000\u0000:\u01c2\u0001\u0000"+
		"\u0000\u0000<\u01d4\u0001\u0000\u0000\u0000>\u01e9\u0001\u0000\u0000\u0000"+
		"@\u020b\u0001\u0000\u0000\u0000B\u0219\u0001\u0000\u0000\u0000D\u0221"+
		"\u0001\u0000\u0000\u0000F\u0223\u0001\u0000\u0000\u0000H\u023c\u0001\u0000"+
		"\u0000\u0000J\u023e\u0001\u0000\u0000\u0000L\u025d\u0001\u0000\u0000\u0000"+
		"N\u025f\u0001\u0000\u0000\u0000P\u0285\u0001\u0000\u0000\u0000R\u0287"+
		"\u0001\u0000\u0000\u0000T\u029f\u0001\u0000\u0000\u0000V\u02a4\u0001\u0000"+
		"\u0000\u0000X\u02b5\u0001\u0000\u0000\u0000Z\u02b7\u0001\u0000\u0000\u0000"+
		"\\\u02bc\u0001\u0000\u0000\u0000^\u02c9\u0001\u0000\u0000\u0000`\u02cc"+
		"\u0001\u0000\u0000\u0000b\u02ce\u0001\u0000\u0000\u0000d\u02d2\u0001\u0000"+
		"\u0000\u0000f\u02d6\u0001\u0000\u0000\u0000h\u02da\u0001\u0000\u0000\u0000"+
		"j\u02de\u0001\u0000\u0000\u0000l\u02eb\u0001\u0000\u0000\u0000n\u02ef"+
		"\u0001\u0000\u0000\u0000pr\u0003V+\u0000qp\u0001\u0000\u0000\u0000ru\u0001"+
		"\u0000\u0000\u0000sq\u0001\u0000\u0000\u0000st\u0001\u0000\u0000\u0000"+
		"ty\u0001\u0000\u0000\u0000us\u0001\u0000\u0000\u0000vx\u0003\u0002\u0001"+
		"\u0000wv\u0001\u0000\u0000\u0000x{\u0001\u0000\u0000\u0000yw\u0001\u0000"+
		"\u0000\u0000yz\u0001\u0000\u0000\u0000z|\u0001\u0000\u0000\u0000{y\u0001"+
		"\u0000\u0000\u0000|}\u0005\u0000\u0000\u0001}\u0001\u0001\u0000\u0000"+
		"\u0000~\u007f\u0005\u000b\u0000\u0000\u007f\u008b\u0005\u0001\u0000\u0000"+
		"\u0080\u0085\u0003\u0004\u0002\u0000\u0081\u0082\u0005\t\u0000\u0000\u0082"+
		"\u0084\u0003\u0004\u0002\u0000\u0083\u0081\u0001\u0000\u0000\u0000\u0084"+
		"\u0087\u0001\u0000\u0000\u0000\u0085\u0083\u0001\u0000\u0000\u0000\u0085"+
		"\u0086\u0001\u0000\u0000\u0000\u0086\u0089\u0001\u0000\u0000\u0000\u0087"+
		"\u0085\u0001\u0000\u0000\u0000\u0088\u008a\u0005\t\u0000\u0000\u0089\u0088"+
		"\u0001\u0000\u0000\u0000\u0089\u008a\u0001\u0000\u0000\u0000\u008a\u008c"+
		"\u0001\u0000\u0000\u0000\u008b\u0080\u0001\u0000\u0000\u0000\u008b\u008c"+
		"\u0001\u0000\u0000\u0000\u008c\u008d\u0001\u0000\u0000\u0000\u008d\u008e"+
		"\u0005\u0002\u0000\u0000\u008e\u0003\u0001\u0000\u0000\u0000\u008f\u0090"+
		"\u0005\u001f\u0000\u0000\u0090\u0091\u0005\u0003\u0000\u0000\u0091\u0096"+
		"\u0003\n\u0005\u0000\u0092\u0093\u0005(\u0000\u0000\u0093\u0094\u0005"+
		"\u0003\u0000\u0000\u0094\u0096\u0003\u0006\u0003\u0000\u0095\u008f\u0001"+
		"\u0000\u0000\u0000\u0095\u0092\u0001\u0000\u0000\u0000\u0096\u0005\u0001"+
		"\u0000\u0000\u0000\u0097\u0098\u0005\u0010\u0000\u0000\u0098\u00a4\u0005"+
		"\u0001\u0000\u0000\u0099\u009e\u0003\b\u0004\u0000\u009a\u009b\u0005\t"+
		"\u0000\u0000\u009b\u009d\u0003\b\u0004\u0000\u009c\u009a\u0001\u0000\u0000"+
		"\u0000\u009d\u00a0\u0001\u0000\u0000\u0000\u009e\u009c\u0001\u0000\u0000"+
		"\u0000\u009e\u009f\u0001\u0000\u0000\u0000\u009f\u00a2\u0001\u0000\u0000"+
		"\u0000\u00a0\u009e\u0001\u0000\u0000\u0000\u00a1\u00a3\u0005\t\u0000\u0000"+
		"\u00a2\u00a1\u0001\u0000\u0000\u0000\u00a2\u00a3\u0001\u0000\u0000\u0000"+
		"\u00a3\u00a5\u0001\u0000\u0000\u0000\u00a4\u0099\u0001\u0000\u0000\u0000"+
		"\u00a4\u00a5\u0001\u0000\u0000\u0000\u00a5\u00a6\u0001\u0000\u0000\u0000"+
		"\u00a6\u00a7\u0005\u0002\u0000\u0000\u00a7\u0007\u0001\u0000\u0000\u0000"+
		"\u00a8\u00a9\u0005D\u0000\u0000\u00a9\u00aa\u0005\u0003\u0000\u0000\u00aa"+
		"\u00af\u0005d\u0000\u0000\u00ab\u00ac\u0005J\u0000\u0000\u00ac\u00ad\u0005"+
		"\u0003\u0000\u0000\u00ad\u00af\u0005I\u0000\u0000\u00ae\u00a8\u0001\u0000"+
		"\u0000\u0000\u00ae\u00ab\u0001\u0000\u0000\u0000\u00af\t\u0001\u0000\u0000"+
		"\u0000\u00b0\u00bd\u0003\u0010\b\u0000\u00b1\u00bd\u0003\u0014\n\u0000"+
		"\u00b2\u00bd\u0003\u001c\u000e\u0000\u00b3\u00bd\u0003 \u0010\u0000\u00b4"+
		"\u00bd\u00032\u0019\u0000\u00b5\u00bd\u0003\u0018\f\u0000\u00b6\u00bd"+
		"\u00036\u001b\u0000\u00b7\u00bd\u0003<\u001e\u0000\u00b8\u00bd\u0003F"+
		"#\u0000\u00b9\u00bd\u0003J%\u0000\u00ba\u00bd\u0003\f\u0006\u0000\u00bb"+
		"\u00bd\u0003N\'\u0000\u00bc\u00b0\u0001\u0000\u0000\u0000\u00bc\u00b1"+
		"\u0001\u0000\u0000\u0000\u00bc\u00b2\u0001\u0000\u0000\u0000\u00bc\u00b3"+
		"\u0001\u0000\u0000\u0000\u00bc\u00b4\u0001\u0000\u0000\u0000\u00bc\u00b5"+
		"\u0001\u0000\u0000\u0000\u00bc\u00b6\u0001\u0000\u0000\u0000\u00bc\u00b7"+
		"\u0001\u0000\u0000\u0000\u00bc\u00b8\u0001\u0000\u0000\u0000\u00bc\u00b9"+
		"\u0001\u0000\u0000\u0000\u00bc\u00ba\u0001\u0000\u0000\u0000\u00bc\u00bb"+
		"\u0001\u0000\u0000\u0000\u00bd\u000b\u0001\u0000\u0000\u0000\u00be\u00bf"+
		"\u0005`\u0000\u0000\u00bf\u00cb\u0005\u0001\u0000\u0000\u00c0\u00c5\u0003"+
		"\u000e\u0007\u0000\u00c1\u00c2\u0005\t\u0000\u0000\u00c2\u00c4\u0003\u000e"+
		"\u0007\u0000\u00c3\u00c1\u0001\u0000\u0000\u0000\u00c4\u00c7\u0001\u0000"+
		"\u0000\u0000\u00c5\u00c3\u0001\u0000\u0000\u0000\u00c5\u00c6\u0001\u0000"+
		"\u0000\u0000\u00c6\u00c9\u0001\u0000\u0000\u0000\u00c7\u00c5\u0001\u0000"+
		"\u0000\u0000\u00c8\u00ca\u0005\t\u0000\u0000\u00c9\u00c8\u0001\u0000\u0000"+
		"\u0000\u00c9\u00ca\u0001\u0000\u0000\u0000\u00ca\u00cc\u0001\u0000\u0000"+
		"\u0000\u00cb\u00c0\u0001\u0000\u0000\u0000\u00cb\u00cc\u0001\u0000\u0000"+
		"\u0000\u00cc\u00cd\u0001\u0000\u0000\u0000\u00cd\u00ce\u0005\u0002\u0000"+
		"\u0000\u00ce\r\u0001\u0000\u0000\u0000\u00cf\u00d0\u0005a\u0000\u0000"+
		"\u00d0\u00d1\u0005\u0003\u0000\u0000\u00d1\u00d2\u0007\u0000\u0000\u0000"+
		"\u00d2\u000f\u0001\u0000\u0000\u0000\u00d3\u00d4\u0005\f\u0000\u0000\u00d4"+
		"\u00e0\u0005\u0001\u0000\u0000\u00d5\u00da\u0003\u0012\t\u0000\u00d6\u00d7"+
		"\u0005\t\u0000\u0000\u00d7\u00d9\u0003\u0012\t\u0000\u00d8\u00d6\u0001"+
		"\u0000\u0000\u0000\u00d9\u00dc\u0001\u0000\u0000\u0000\u00da\u00d8\u0001"+
		"\u0000\u0000\u0000\u00da\u00db\u0001\u0000\u0000\u0000\u00db\u00de\u0001"+
		"\u0000\u0000\u0000\u00dc\u00da\u0001\u0000\u0000\u0000\u00dd\u00df\u0005"+
		"\t\u0000\u0000\u00de\u00dd\u0001\u0000\u0000\u0000\u00de\u00df\u0001\u0000"+
		"\u0000\u0000\u00df\u00e1\u0001\u0000\u0000\u0000\u00e0\u00d5\u0001\u0000"+
		"\u0000\u0000\u00e0\u00e1\u0001\u0000\u0000\u0000\u00e1\u00e2\u0001\u0000"+
		"\u0000\u0000\u00e2\u00e3\u0005\u0002\u0000\u0000\u00e3\u0011\u0001\u0000"+
		"\u0000\u0000\u00e4\u00e8\u0003j5\u0000\u00e5\u00e8\u0003l6\u0000\u00e6"+
		"\u00e8\u0003n7\u0000\u00e7\u00e4\u0001\u0000\u0000\u0000\u00e7\u00e5\u0001"+
		"\u0000\u0000\u0000\u00e7\u00e6\u0001\u0000\u0000\u0000\u00e8\u0013\u0001"+
		"\u0000\u0000\u0000\u00e9\u00ea\u0005\r\u0000\u0000\u00ea\u00f6\u0005\u0001"+
		"\u0000\u0000\u00eb\u00f0\u0003\u0016\u000b\u0000\u00ec\u00ed\u0005\t\u0000"+
		"\u0000\u00ed\u00ef\u0003\u0016\u000b\u0000\u00ee\u00ec\u0001\u0000\u0000"+
		"\u0000\u00ef\u00f2\u0001\u0000\u0000\u0000\u00f0\u00ee\u0001\u0000\u0000"+
		"\u0000\u00f0\u00f1\u0001\u0000\u0000\u0000\u00f1\u00f4\u0001\u0000\u0000"+
		"\u0000\u00f2\u00f0\u0001\u0000\u0000\u0000\u00f3\u00f5\u0005\t\u0000\u0000"+
		"\u00f4\u00f3\u0001\u0000\u0000\u0000\u00f4\u00f5\u0001\u0000\u0000\u0000"+
		"\u00f5\u00f7\u0001\u0000\u0000\u0000\u00f6\u00eb\u0001\u0000\u0000\u0000"+
		"\u00f6\u00f7\u0001\u0000\u0000\u0000\u00f7\u00f8\u0001\u0000\u0000\u0000"+
		"\u00f8\u00f9\u0005\u0002\u0000\u0000\u00f9\u0015\u0001\u0000\u0000\u0000"+
		"\u00fa\u00fb\u0003h4\u0000\u00fb\u0017\u0001\u0000\u0000\u0000\u00fc\u00fd"+
		"\u0005\u000e\u0000\u0000\u00fd\u0109\u0005\u0001\u0000\u0000\u00fe\u0103"+
		"\u0003\u001a\r\u0000\u00ff\u0100\u0005\t\u0000\u0000\u0100\u0102\u0003"+
		"\u001a\r\u0000\u0101\u00ff\u0001\u0000\u0000\u0000\u0102\u0105\u0001\u0000"+
		"\u0000\u0000\u0103\u0101\u0001\u0000\u0000\u0000\u0103\u0104\u0001\u0000"+
		"\u0000\u0000\u0104\u0107\u0001\u0000\u0000\u0000\u0105\u0103\u0001\u0000"+
		"\u0000\u0000\u0106\u0108\u0005\t\u0000\u0000\u0107\u0106\u0001\u0000\u0000"+
		"\u0000\u0107\u0108\u0001\u0000\u0000\u0000\u0108\u010a\u0001\u0000\u0000"+
		"\u0000\u0109\u00fe\u0001\u0000\u0000\u0000\u0109\u010a\u0001\u0000\u0000"+
		"\u0000\u010a\u010b\u0001\u0000\u0000\u0000\u010b\u010c\u0005\u0002\u0000"+
		"\u0000\u010c\u0019\u0001\u0000\u0000\u0000\u010d\u0111\u0003j5\u0000\u010e"+
		"\u0111\u0003l6\u0000\u010f\u0111\u0003n7\u0000\u0110\u010d\u0001\u0000"+
		"\u0000\u0000\u0110\u010e\u0001\u0000\u0000\u0000\u0110\u010f\u0001\u0000"+
		"\u0000\u0000\u0111\u001b\u0001\u0000\u0000\u0000\u0112\u0113\u0005\u000f"+
		"\u0000\u0000\u0113\u011f\u0005\u0001\u0000\u0000\u0114\u0119\u0003\u001e"+
		"\u000f\u0000\u0115\u0116\u0005\t\u0000\u0000\u0116\u0118\u0003\u001e\u000f"+
		"\u0000\u0117\u0115\u0001\u0000\u0000\u0000\u0118\u011b\u0001\u0000\u0000"+
		"\u0000\u0119\u0117\u0001\u0000\u0000\u0000\u0119\u011a\u0001\u0000\u0000"+
		"\u0000\u011a\u011d\u0001\u0000\u0000\u0000\u011b\u0119\u0001\u0000\u0000"+
		"\u0000\u011c\u011e\u0005\t\u0000\u0000\u011d\u011c\u0001\u0000\u0000\u0000"+
		"\u011d\u011e\u0001\u0000\u0000\u0000\u011e\u0120\u0001\u0000\u0000\u0000"+
		"\u011f\u0114\u0001\u0000\u0000\u0000\u011f\u0120\u0001\u0000\u0000\u0000"+
		"\u0120\u0121\u0001\u0000\u0000\u0000\u0121\u0122\u0005\u0002\u0000\u0000"+
		"\u0122\u001d\u0001\u0000\u0000\u0000\u0123\u0124\u0005\'\u0000\u0000\u0124"+
		"\u0125\u0005\u0003\u0000\u0000\u0125\u0133\u0005d\u0000\u0000\u0126\u0127"+
		"\u0005)\u0000\u0000\u0127\u0128\u0005\u0003\u0000\u0000\u0128\u0133\u0007"+
		"\u0001\u0000\u0000\u0129\u012a\u0005*\u0000\u0000\u012a\u012b\u0005\u0003"+
		"\u0000\u0000\u012b\u0133\u0007\u0002\u0000\u0000\u012c\u012d\u0005+\u0000"+
		"\u0000\u012d\u012e\u0005\u0003\u0000\u0000\u012e\u0133\u0007\u0002\u0000"+
		"\u0000\u012f\u0130\u0005K\u0000\u0000\u0130\u0131\u0005\u0003\u0000\u0000"+
		"\u0131\u0133\u0007\u0003\u0000\u0000\u0132\u0123\u0001\u0000\u0000\u0000"+
		"\u0132\u0126\u0001\u0000\u0000\u0000\u0132\u0129\u0001\u0000\u0000\u0000"+
		"\u0132\u012c\u0001\u0000\u0000\u0000\u0132\u012f\u0001\u0000\u0000\u0000"+
		"\u0133\u001f\u0001\u0000\u0000\u0000\u0134\u0135\u0005\u0011\u0000\u0000"+
		"\u0135\u0141\u0005\u0001\u0000\u0000\u0136\u013b\u0003\"\u0011\u0000\u0137"+
		"\u0138\u0005\t\u0000\u0000\u0138\u013a\u0003\"\u0011\u0000\u0139\u0137"+
		"\u0001\u0000\u0000\u0000\u013a\u013d\u0001\u0000\u0000\u0000\u013b\u0139"+
		"\u0001\u0000\u0000\u0000\u013b\u013c\u0001\u0000\u0000\u0000\u013c\u013f"+
		"\u0001\u0000\u0000\u0000\u013d\u013b\u0001\u0000\u0000\u0000\u013e\u0140"+
		"\u0005\t\u0000\u0000\u013f\u013e\u0001\u0000\u0000\u0000\u013f\u0140\u0001"+
		"\u0000\u0000\u0000\u0140\u0142\u0001\u0000\u0000\u0000\u0141\u0136\u0001"+
		"\u0000\u0000\u0000\u0141\u0142\u0001\u0000\u0000\u0000\u0142\u0143\u0001"+
		"\u0000\u0000\u0000\u0143\u0144\u0005\u0002\u0000\u0000\u0144!\u0001\u0000"+
		"\u0000\u0000\u0145\u014f\u0003b1\u0000\u0146\u014f\u0003d2\u0000\u0147"+
		"\u0148\u0005/\u0000\u0000\u0148\u0149\u0005\u0003\u0000\u0000\u0149\u014f"+
		"\u0007\u0004\u0000\u0000\u014a\u014f\u0003h4\u0000\u014b\u014c\u00057"+
		"\u0000\u0000\u014c\u014d\u0005\u0003\u0000\u0000\u014d\u014f\u0003$\u0012"+
		"\u0000\u014e\u0145\u0001\u0000\u0000\u0000\u014e\u0146\u0001\u0000\u0000"+
		"\u0000\u014e\u0147\u0001\u0000\u0000\u0000\u014e\u014a\u0001\u0000\u0000"+
		"\u0000\u014e\u014b\u0001\u0000\u0000\u0000\u014f#\u0001\u0000\u0000\u0000"+
		"\u0150\u0151\u0005\u0013\u0000\u0000\u0151\u015d\u0005\u0001\u0000\u0000"+
		"\u0152\u0157\u0003&\u0013\u0000\u0153\u0154\u0005\t\u0000\u0000\u0154"+
		"\u0156\u0003&\u0013\u0000\u0155\u0153\u0001\u0000\u0000\u0000\u0156\u0159"+
		"\u0001\u0000\u0000\u0000\u0157\u0155\u0001\u0000\u0000\u0000\u0157\u0158"+
		"\u0001\u0000\u0000\u0000\u0158\u015b\u0001\u0000\u0000\u0000\u0159\u0157"+
		"\u0001\u0000\u0000\u0000\u015a\u015c\u0005\t\u0000\u0000\u015b\u015a\u0001"+
		"\u0000\u0000\u0000\u015b\u015c\u0001\u0000\u0000\u0000\u015c\u015e\u0001"+
		"\u0000\u0000\u0000\u015d\u0152\u0001\u0000\u0000\u0000\u015d\u015e\u0001"+
		"\u0000\u0000\u0000\u015e\u015f\u0001\u0000\u0000\u0000\u015f\u0160\u0005"+
		"\u0002\u0000\u0000\u0160%\u0001\u0000\u0000\u0000\u0161\u0166\u0003f3"+
		"\u0000\u0162\u0163\u00059\u0000\u0000\u0163\u0164\u0005\u0003\u0000\u0000"+
		"\u0164\u0166\u0003(\u0014\u0000\u0165\u0161\u0001\u0000\u0000\u0000\u0165"+
		"\u0162\u0001\u0000\u0000\u0000\u0166\'\u0001\u0000\u0000\u0000\u0167\u016a"+
		"\u0003,\u0016\u0000\u0168\u016a\u0003*\u0015\u0000\u0169\u0167\u0001\u0000"+
		"\u0000\u0000\u0169\u0168\u0001\u0000\u0000\u0000\u016a)\u0001\u0000\u0000"+
		"\u0000\u016b\u016c\u0005\u001d\u0000\u0000\u016c\u016d\u0005\u0001\u0000"+
		"\u0000\u016d\u016f\u0003.\u0017\u0000\u016e\u0170\u0005\t\u0000\u0000"+
		"\u016f\u016e\u0001\u0000\u0000\u0000\u016f\u0170\u0001\u0000\u0000\u0000"+
		"\u0170\u0171\u0001\u0000\u0000\u0000\u0171\u0172\u0005\u0002\u0000\u0000"+
		"\u0172+\u0001\u0000\u0000\u0000\u0173\u0174\u0005\u001c\u0000\u0000\u0174"+
		"\u0180\u0005\u0001\u0000\u0000\u0175\u017a\u00030\u0018\u0000\u0176\u0177"+
		"\u0005\t\u0000\u0000\u0177\u0179\u00030\u0018\u0000\u0178\u0176\u0001"+
		"\u0000\u0000\u0000\u0179\u017c\u0001\u0000\u0000\u0000\u017a\u0178\u0001"+
		"\u0000\u0000\u0000\u017a\u017b\u0001\u0000\u0000\u0000\u017b\u017e\u0001"+
		"\u0000\u0000\u0000\u017c\u017a\u0001\u0000\u0000\u0000\u017d\u017f\u0005"+
		"\t\u0000\u0000\u017e\u017d\u0001\u0000\u0000\u0000\u017e\u017f\u0001\u0000"+
		"\u0000\u0000\u017f\u0181\u0001\u0000\u0000\u0000\u0180\u0175\u0001\u0000"+
		"\u0000\u0000\u0180\u0181\u0001\u0000\u0000\u0000\u0181\u0182\u0001\u0000"+
		"\u0000\u0000\u0182\u0183\u0005\u0002\u0000\u0000\u0183-\u0001\u0000\u0000"+
		"\u0000\u0184\u0185\u0005Z\u0000\u0000\u0185\u0186\u0005\u0003\u0000\u0000"+
		"\u0186\u0187\u0007\u0002\u0000\u0000\u0187/\u0001\u0000\u0000\u0000\u0188"+
		"\u0189\u0005<\u0000\u0000\u0189\u018a\u0005\u0003\u0000\u0000\u018a\u0195"+
		"\u0007\u0002\u0000\u0000\u018b\u018c\u0005=\u0000\u0000\u018c\u018d\u0005"+
		"\u0003\u0000\u0000\u018d\u0195\u0007\u0002\u0000\u0000\u018e\u018f\u0005"+
		">\u0000\u0000\u018f\u0190\u0005\u0003\u0000\u0000\u0190\u0195\u0007\u0002"+
		"\u0000\u0000\u0191\u0192\u0005?\u0000\u0000\u0192\u0193\u0005\u0003\u0000"+
		"\u0000\u0193\u0195\u0007\u0002\u0000\u0000\u0194\u0188\u0001\u0000\u0000"+
		"\u0000\u0194\u018b\u0001\u0000\u0000\u0000\u0194\u018e\u0001\u0000\u0000"+
		"\u0000\u0194\u0191\u0001\u0000\u0000\u0000\u01951\u0001\u0000\u0000\u0000"+
		"\u0196\u0197\u0005\u0012\u0000\u0000\u0197\u01a3\u0005\u0001\u0000\u0000"+
		"\u0198\u019d\u00034\u001a\u0000\u0199\u019a\u0005\t\u0000\u0000\u019a"+
		"\u019c\u00034\u001a\u0000\u019b\u0199\u0001\u0000\u0000\u0000\u019c\u019f"+
		"\u0001\u0000\u0000\u0000\u019d\u019b\u0001\u0000\u0000\u0000\u019d\u019e"+
		"\u0001\u0000\u0000\u0000\u019e\u01a1\u0001\u0000\u0000\u0000\u019f\u019d"+
		"\u0001\u0000\u0000\u0000\u01a0\u01a2\u0005\t\u0000\u0000\u01a1\u01a0\u0001"+
		"\u0000\u0000\u0000\u01a1\u01a2\u0001\u0000\u0000\u0000\u01a2\u01a4\u0001"+
		"\u0000\u0000\u0000\u01a3\u0198\u0001\u0000\u0000\u0000\u01a3\u01a4\u0001"+
		"\u0000\u0000\u0000\u01a4\u01a5\u0001\u0000\u0000\u0000\u01a5\u01a6\u0005"+
		"\u0002\u0000\u0000\u01a63\u0001\u0000\u0000\u0000\u01a7\u01a8\u00051\u0000"+
		"\u0000\u01a8\u01a9\u0005\u0003\u0000\u0000\u01a9\u01ac\u0005c\u0000\u0000"+
		"\u01aa\u01ac\u0003h4\u0000\u01ab\u01a7\u0001\u0000\u0000\u0000\u01ab\u01aa"+
		"\u0001\u0000\u0000\u0000\u01ac5\u0001\u0000\u0000\u0000\u01ad\u01ae\u0005"+
		"\u0019\u0000\u0000\u01ae\u01ba\u0005\u0001\u0000\u0000\u01af\u01b4\u0003"+
		"8\u001c\u0000\u01b0\u01b1\u0005\t\u0000\u0000\u01b1\u01b3\u00038\u001c"+
		"\u0000\u01b2\u01b0\u0001\u0000\u0000\u0000\u01b3\u01b6\u0001\u0000\u0000"+
		"\u0000\u01b4\u01b2\u0001\u0000\u0000\u0000\u01b4\u01b5\u0001\u0000\u0000"+
		"\u0000\u01b5\u01b8\u0001\u0000\u0000\u0000\u01b6\u01b4\u0001\u0000\u0000"+
		"\u0000\u01b7\u01b9\u0005\t\u0000\u0000\u01b8\u01b7\u0001\u0000\u0000\u0000"+
		"\u01b8\u01b9\u0001\u0000\u0000\u0000\u01b9\u01bb\u0001\u0000\u0000\u0000"+
		"\u01ba\u01af\u0001\u0000\u0000\u0000\u01ba\u01bb\u0001\u0000\u0000\u0000"+
		"\u01bb\u01bc\u0001\u0000\u0000\u0000\u01bc\u01bd\u0005\u0002\u0000\u0000"+
		"\u01bd7\u0001\u0000\u0000\u0000\u01be\u01bf\u0005L\u0000\u0000\u01bf\u01c0"+
		"\u0005\u0003\u0000\u0000\u01c0\u01c1\u0003:\u001d\u0000\u01c19\u0001\u0000"+
		"\u0000\u0000\u01c2\u01c7\u0005\u0001\u0000\u0000\u01c3\u01c4\u0005a\u0000"+
		"\u0000\u01c4\u01c6\u0005\t\u0000\u0000\u01c5\u01c3\u0001\u0000\u0000\u0000"+
		"\u01c6\u01c9\u0001\u0000\u0000\u0000\u01c7\u01c5\u0001\u0000\u0000\u0000"+
		"\u01c7\u01c8\u0001\u0000\u0000\u0000\u01c8\u01ca\u0001\u0000\u0000\u0000"+
		"\u01c9\u01c7\u0001\u0000\u0000\u0000\u01ca\u01cb\u0005\u0002\u0000\u0000"+
		"\u01cb\u01cf\u0005\u0006\u0000\u0000\u01cc\u01ce\u0003V+\u0000\u01cd\u01cc"+
		"\u0001\u0000\u0000\u0000\u01ce\u01d1\u0001\u0000\u0000\u0000\u01cf\u01cd"+
		"\u0001\u0000\u0000\u0000\u01cf\u01d0\u0001\u0000\u0000\u0000\u01d0\u01d2"+
		"\u0001\u0000\u0000\u0000\u01d1\u01cf\u0001\u0000\u0000\u0000\u01d2\u01d3"+
		"\u0005\u0007\u0000\u0000\u01d3;\u0001\u0000\u0000\u0000\u01d4\u01d5\u0005"+
		"\u0014\u0000\u0000\u01d5\u01e1\u0005\u0001\u0000\u0000\u01d6\u01db\u0003"+
		">\u001f\u0000\u01d7\u01d8\u0005\t\u0000\u0000\u01d8\u01da\u0003>\u001f"+
		"\u0000\u01d9\u01d7\u0001\u0000\u0000\u0000\u01da\u01dd\u0001\u0000\u0000"+
		"\u0000\u01db\u01d9\u0001\u0000\u0000\u0000\u01db\u01dc\u0001\u0000\u0000"+
		"\u0000\u01dc\u01df\u0001\u0000\u0000\u0000\u01dd\u01db\u0001\u0000\u0000"+
		"\u0000\u01de\u01e0\u0005\t\u0000\u0000\u01df\u01de\u0001\u0000\u0000\u0000"+
		"\u01df\u01e0\u0001\u0000\u0000\u0000\u01e0\u01e2\u0001\u0000\u0000\u0000"+
		"\u01e1\u01d6\u0001\u0000\u0000\u0000\u01e1\u01e2\u0001\u0000\u0000\u0000"+
		"\u01e2\u01e3\u0001\u0000\u0000\u0000\u01e3\u01e4\u0005\u0002\u0000\u0000"+
		"\u01e4=\u0001\u0000\u0000\u0000\u01e5\u01e6\u0005;\u0000\u0000\u01e6\u01e7"+
		"\u0005\u0003\u0000\u0000\u01e7\u01ea\u0003@ \u0000\u01e8\u01ea\u0003h"+
		"4\u0000\u01e9\u01e5\u0001\u0000\u0000\u0000\u01e9\u01e8\u0001\u0000\u0000"+
		"\u0000\u01ea?\u0001\u0000\u0000\u0000\u01eb\u01ec\u0005\u0015\u0000\u0000"+
		"\u01ec\u01f8\u0005\u0001\u0000\u0000\u01ed\u01f2\u0003B!\u0000\u01ee\u01ef"+
		"\u0005\t\u0000\u0000\u01ef\u01f1\u0003B!\u0000\u01f0\u01ee\u0001\u0000"+
		"\u0000\u0000\u01f1\u01f4\u0001\u0000\u0000\u0000\u01f2\u01f0\u0001\u0000"+
		"\u0000\u0000\u01f2\u01f3\u0001\u0000\u0000\u0000\u01f3\u01f6\u0001\u0000"+
		"\u0000\u0000\u01f4\u01f2\u0001\u0000\u0000\u0000\u01f5\u01f7\u0005\t\u0000"+
		"\u0000\u01f6\u01f5\u0001\u0000\u0000\u0000\u01f6\u01f7\u0001\u0000\u0000"+
		"\u0000\u01f7\u01f9\u0001\u0000\u0000\u0000\u01f8\u01ed\u0001\u0000\u0000"+
		"\u0000\u01f8\u01f9\u0001\u0000\u0000\u0000\u01f9\u01fa\u0001\u0000\u0000"+
		"\u0000\u01fa\u020c\u0005\u0002\u0000\u0000\u01fb\u01fc\u0005\u0016\u0000"+
		"\u0000\u01fc\u0208\u0005\u0001\u0000\u0000\u01fd\u0202\u0003D\"\u0000"+
		"\u01fe\u01ff\u0005\t\u0000\u0000\u01ff\u0201\u0003D\"\u0000\u0200\u01fe"+
		"\u0001\u0000\u0000\u0000\u0201\u0204\u0001\u0000\u0000\u0000\u0202\u0200"+
		"\u0001\u0000\u0000\u0000\u0202\u0203\u0001\u0000\u0000\u0000\u0203\u0206"+
		"\u0001\u0000\u0000\u0000\u0204\u0202\u0001\u0000\u0000\u0000\u0205\u0207"+
		"\u0005\t\u0000\u0000\u0206\u0205\u0001\u0000\u0000\u0000\u0206\u0207\u0001"+
		"\u0000\u0000\u0000\u0207\u0209\u0001\u0000\u0000\u0000\u0208\u01fd\u0001"+
		"\u0000\u0000\u0000\u0208\u0209\u0001\u0000\u0000\u0000\u0209\u020a\u0001"+
		"\u0000\u0000\u0000\u020a\u020c\u0005\u0002\u0000\u0000\u020b\u01eb\u0001"+
		"\u0000\u0000\u0000\u020b\u01fb\u0001\u0000\u0000\u0000\u020cA\u0001\u0000"+
		"\u0000\u0000\u020d\u020e\u0005\\\u0000\u0000\u020e\u020f\u0005\u0003\u0000"+
		"\u0000\u020f\u021a\u0007\u0002\u0000\u0000\u0210\u0211\u0005]\u0000\u0000"+
		"\u0211\u0212\u0005\u0003\u0000\u0000\u0212\u021a\u0007\u0002\u0000\u0000"+
		"\u0213\u0214\u0005_\u0000\u0000\u0214\u0215\u0005\u0003\u0000\u0000\u0215"+
		"\u021a\u0007\u0002\u0000\u0000\u0216\u0217\u0005^\u0000\u0000\u0217\u0218"+
		"\u0005\u0003\u0000\u0000\u0218\u021a\u0007\u0002\u0000\u0000\u0219\u020d"+
		"\u0001\u0000\u0000\u0000\u0219\u0210\u0001\u0000\u0000\u0000\u0219\u0213"+
		"\u0001\u0000\u0000\u0000\u0219\u0216\u0001\u0000\u0000\u0000\u021aC\u0001"+
		"\u0000\u0000\u0000\u021b\u021c\u0005@\u0000\u0000\u021c\u021d\u0005\u0003"+
		"\u0000\u0000\u021d\u0222\u0007\u0002\u0000\u0000\u021e\u021f\u0005A\u0000"+
		"\u0000\u021f\u0220\u0005\u0003\u0000\u0000\u0220\u0222\u0007\u0002\u0000"+
		"\u0000\u0221\u021b\u0001\u0000\u0000\u0000\u0221\u021e\u0001\u0000\u0000"+
		"\u0000\u0222E\u0001\u0000\u0000\u0000\u0223\u0224\u0005\u0017\u0000\u0000"+
		"\u0224\u0230\u0005\u0001\u0000\u0000\u0225\u022a\u0003H$\u0000\u0226\u0227"+
		"\u0005\t\u0000\u0000\u0227\u0229\u0003H$\u0000\u0228\u0226\u0001\u0000"+
		"\u0000\u0000\u0229\u022c\u0001\u0000\u0000\u0000\u022a\u0228\u0001\u0000"+
		"\u0000\u0000\u022a\u022b\u0001\u0000\u0000\u0000\u022b\u022e\u0001\u0000"+
		"\u0000\u0000\u022c\u022a\u0001\u0000\u0000\u0000\u022d\u022f\u0005\t\u0000"+
		"\u0000\u022e\u022d\u0001\u0000\u0000\u0000\u022e\u022f\u0001\u0000\u0000"+
		"\u0000\u022f\u0231\u0001\u0000\u0000\u0000\u0230\u0225\u0001\u0000\u0000"+
		"\u0000\u0230\u0231\u0001\u0000\u0000\u0000\u0231\u0232\u0001\u0000\u0000"+
		"\u0000\u0232\u0233\u0005\u0002\u0000\u0000\u0233G\u0001\u0000\u0000\u0000"+
		"\u0234\u0235\u0005C\u0000\u0000\u0235\u0236\u0005\u0003\u0000\u0000\u0236"+
		"\u023d\u0005d\u0000\u0000\u0237\u0238\u0005B\u0000\u0000\u0238\u0239\u0005"+
		"\u0003\u0000\u0000\u0239\u023d\u0007\u0005\u0000\u0000\u023a\u023d\u0003"+
		"b1\u0000\u023b\u023d\u0003d2\u0000\u023c\u0234\u0001\u0000\u0000\u0000"+
		"\u023c\u0237\u0001\u0000\u0000\u0000\u023c\u023a\u0001\u0000\u0000\u0000"+
		"\u023c\u023b\u0001\u0000\u0000\u0000\u023dI\u0001\u0000\u0000\u0000\u023e"+
		"\u023f\u0005\u0018\u0000\u0000\u023f\u024b\u0005\u0001\u0000\u0000\u0240"+
		"\u0245\u0003L&\u0000\u0241\u0242\u0005\t\u0000\u0000\u0242\u0244\u0003"+
		"L&\u0000\u0243\u0241\u0001\u0000\u0000\u0000\u0244\u0247\u0001\u0000\u0000"+
		"\u0000\u0245\u0243\u0001\u0000\u0000\u0000\u0245\u0246\u0001\u0000\u0000"+
		"\u0000\u0246\u0249\u0001\u0000\u0000\u0000\u0247\u0245\u0001\u0000\u0000"+
		"\u0000\u0248\u024a\u0005\t\u0000\u0000\u0249\u0248\u0001\u0000\u0000\u0000"+
		"\u0249\u024a\u0001\u0000\u0000\u0000\u024a\u024c\u0001\u0000\u0000\u0000"+
		"\u024b\u0240\u0001\u0000\u0000\u0000\u024b\u024c\u0001\u0000\u0000\u0000"+
		"\u024c\u024d\u0001\u0000\u0000\u0000\u024d\u024e\u0005\u0002\u0000\u0000"+
		"\u024eK\u0001\u0000\u0000\u0000\u024f\u025e\u0003b1\u0000\u0250\u025e"+
		"\u0003d2\u0000\u0251\u0252\u0005D\u0000\u0000\u0252\u0253\u0005\u0003"+
		"\u0000\u0000\u0253\u025e\u0005d\u0000\u0000\u0254\u0255\u0005E\u0000\u0000"+
		"\u0255\u0256\u0005\u0003\u0000\u0000\u0256\u025e\u0005e\u0000\u0000\u0257"+
		"\u0258\u0005F\u0000\u0000\u0258\u0259\u0005\u0003\u0000\u0000\u0259\u025e"+
		"\u0005e\u0000\u0000\u025a\u025b\u0005L\u0000\u0000\u025b\u025c\u0005\u0003"+
		"\u0000\u0000\u025c\u025e\u0003:\u001d\u0000\u025d\u024f\u0001\u0000\u0000"+
		"\u0000\u025d\u0250\u0001\u0000\u0000\u0000\u025d\u0251\u0001\u0000\u0000"+
		"\u0000\u025d\u0254\u0001\u0000\u0000\u0000\u025d\u0257\u0001\u0000\u0000"+
		"\u0000\u025d\u025a\u0001\u0000\u0000\u0000\u025eM\u0001\u0000\u0000\u0000"+
		"\u025f\u0260\u0005\u001a\u0000\u0000\u0260\u026c\u0005\u0001\u0000\u0000"+
		"\u0261\u0266\u0003P(\u0000\u0262\u0263\u0005\t\u0000\u0000\u0263\u0265"+
		"\u0003P(\u0000\u0264\u0262\u0001\u0000\u0000\u0000\u0265\u0268\u0001\u0000"+
		"\u0000\u0000\u0266\u0264\u0001\u0000\u0000\u0000\u0266\u0267\u0001\u0000"+
		"\u0000\u0000\u0267\u026a\u0001\u0000\u0000\u0000\u0268\u0266\u0001\u0000"+
		"\u0000\u0000\u0269\u026b\u0005\t\u0000\u0000\u026a\u0269\u0001\u0000\u0000"+
		"\u0000\u026a\u026b\u0001\u0000\u0000\u0000\u026b\u026d\u0001\u0000\u0000"+
		"\u0000\u026c\u0261\u0001\u0000\u0000\u0000\u026c\u026d\u0001\u0000\u0000"+
		"\u0000\u026d\u026e\u0001\u0000\u0000\u0000\u026e\u026f\u0005\u0002\u0000"+
		"\u0000\u026fO\u0001\u0000\u0000\u0000\u0270\u0271\u0005T\u0000\u0000\u0271"+
		"\u0272\u0005\u0003\u0000\u0000\u0272\u0286\u0005d\u0000\u0000\u0273\u0274"+
		"\u0005U\u0000\u0000\u0274\u0275\u0005\u0003\u0000\u0000\u0275\u0286\u0005"+
		"d\u0000\u0000\u0276\u0277\u0005V\u0000\u0000\u0277\u0278\u0005\u0003\u0000"+
		"\u0000\u0278\u0286\u0005e\u0000\u0000\u0279\u027a\u0005;\u0000\u0000\u027a"+
		"\u027b\u0005\u0003\u0000\u0000\u027b\u0286\u0003@ \u0000\u027c\u027d\u0005"+
		"W\u0000\u0000\u027d\u027e\u0005\u0003\u0000\u0000\u027e\u0286\u0005d\u0000"+
		"\u0000\u027f\u0280\u0005X\u0000\u0000\u0280\u0281\u0005\u0003\u0000\u0000"+
		"\u0281\u0286\u0003R)\u0000\u0282\u0283\u0005[\u0000\u0000\u0283\u0284"+
		"\u0005\u0003\u0000\u0000\u0284\u0286\u0003:\u001d\u0000\u0285\u0270\u0001"+
		"\u0000\u0000\u0000\u0285\u0273\u0001\u0000\u0000\u0000\u0285\u0276\u0001"+
		"\u0000\u0000\u0000\u0285\u0279\u0001\u0000\u0000\u0000\u0285\u027c\u0001"+
		"\u0000\u0000\u0000\u0285\u027f\u0001\u0000\u0000\u0000\u0285\u0282\u0001"+
		"\u0000\u0000\u0000\u0286Q\u0001\u0000\u0000\u0000\u0287\u0288\u0005\u001b"+
		"\u0000\u0000\u0288\u0294\u0005\u0001\u0000\u0000\u0289\u028e\u0003T*\u0000"+
		"\u028a\u028b\u0005\t\u0000\u0000\u028b\u028d\u0003T*\u0000\u028c\u028a"+
		"\u0001\u0000\u0000\u0000\u028d\u0290\u0001\u0000\u0000\u0000\u028e\u028c"+
		"\u0001\u0000\u0000\u0000\u028e\u028f\u0001\u0000\u0000\u0000\u028f\u0292"+
		"\u0001\u0000\u0000\u0000\u0290\u028e\u0001\u0000\u0000\u0000\u0291\u0293"+
		"\u0005\t\u0000\u0000\u0292\u0291\u0001\u0000\u0000\u0000\u0292\u0293\u0001"+
		"\u0000\u0000\u0000\u0293\u0295\u0001\u0000\u0000\u0000\u0294\u0289\u0001"+
		"\u0000\u0000\u0000\u0294\u0295\u0001\u0000\u0000\u0000\u0295\u0296\u0001"+
		"\u0000\u0000\u0000\u0296\u0297\u0005\u0002\u0000\u0000\u0297S\u0001\u0000"+
		"\u0000\u0000\u0298\u0299\u0005Y\u0000\u0000\u0299\u029a\u0005\u0003\u0000"+
		"\u0000\u029a\u02a0\u0005c\u0000\u0000\u029b\u029c\u00059\u0000\u0000\u029c"+
		"\u029d\u0005\u0003\u0000\u0000\u029d\u02a0\u0003(\u0014\u0000\u029e\u02a0"+
		"\u0003f3\u0000\u029f\u0298\u0001\u0000\u0000\u0000\u029f\u029b\u0001\u0000"+
		"\u0000\u0000\u029f\u029e\u0001\u0000\u0000\u0000\u02a0U\u0001\u0000\u0000"+
		"\u0000\u02a1\u02a5\u0003X,\u0000\u02a2\u02a5\u0003Z-\u0000\u02a3\u02a5"+
		"\u0003\\.\u0000\u02a4\u02a1\u0001\u0000\u0000\u0000\u02a4\u02a2\u0001"+
		"\u0000\u0000\u0000\u02a4\u02a3\u0001\u0000\u0000\u0000\u02a5W\u0001\u0000"+
		"\u0000\u0000\u02a6\u02a7\u0007\u0006\u0000\u0000\u02a7\u02a8\u0005a\u0000"+
		"\u0000\u02a8\u02b6\u0005\b\u0000\u0000\u02a9\u02aa\u0005&\u0000\u0000"+
		"\u02aa\u02af\u0005\u0001\u0000\u0000\u02ab\u02ac\u0007\u0006\u0000\u0000"+
		"\u02ac\u02ae\u0005\t\u0000\u0000\u02ad\u02ab\u0001\u0000\u0000\u0000\u02ae"+
		"\u02b1\u0001\u0000\u0000\u0000\u02af\u02ad\u0001\u0000\u0000\u0000\u02af"+
		"\u02b0\u0001\u0000\u0000\u0000\u02b0\u02b2\u0001\u0000\u0000\u0000\u02b1"+
		"\u02af\u0001\u0000\u0000\u0000\u02b2\u02b3\u0005\u0002\u0000\u0000\u02b3"+
		"\u02b4\u0005a\u0000\u0000\u02b4\u02b6\u0005\b\u0000\u0000\u02b5\u02a6"+
		"\u0001\u0000\u0000\u0000\u02b5\u02a9\u0001\u0000\u0000\u0000\u02b6Y\u0001"+
		"\u0000\u0000\u0000\u02b7\u02b8\u0005a\u0000\u0000\u02b8\u02b9\u0005\n"+
		"\u0000\u0000\u02b9\u02ba\u0007\u0000\u0000\u0000\u02ba\u02bb\u0005\b\u0000"+
		"\u0000\u02bb[\u0001\u0000\u0000\u0000\u02bc\u02bd\u0005!\u0000\u0000\u02bd"+
		"\u02be\u0005`\u0000\u0000\u02be\u02bf\u0005\u0006\u0000\u0000\u02bf\u02c0"+
		"\u0003^/\u0000\u02c0\u02c1\u0005%\u0000\u0000\u02c1\u02c2\u0005\u0001"+
		"\u0000\u0000\u02c2\u02c3\u0003`0\u0000\u02c3\u02c4\u0005\u0002\u0000\u0000"+
		"\u02c4\u02c5\u0005\u0007\u0000\u0000\u02c5]\u0001\u0000\u0000\u0000\u02c6"+
		"\u02c8\u0003X,\u0000\u02c7\u02c6\u0001\u0000\u0000\u0000\u02c8\u02cb\u0001"+
		"\u0000\u0000\u0000\u02c9\u02c7\u0001\u0000\u0000\u0000\u02c9\u02ca\u0001"+
		"\u0000\u0000\u0000\u02ca_\u0001\u0000\u0000\u0000\u02cb\u02c9\u0001\u0000"+
		"\u0000\u0000\u02cc\u02cd\u0003\n\u0005\u0000\u02cda\u0001\u0000\u0000"+
		"\u0000\u02ce\u02cf\u0005-\u0000\u0000\u02cf\u02d0\u0005\u0003\u0000\u0000"+
		"\u02d0\u02d1\u0007\u0002\u0000\u0000\u02d1c\u0001\u0000\u0000\u0000\u02d2"+
		"\u02d3\u0005.\u0000\u0000\u02d3\u02d4\u0005\u0003\u0000\u0000\u02d4\u02d5"+
		"\u0007\u0002\u0000\u0000\u02d5e\u0001\u0000\u0000\u0000\u02d6\u02d7\u0005"+
		"8\u0000\u0000\u02d7\u02d8\u0005\u0003\u0000\u0000\u02d8\u02d9\u0005e\u0000"+
		"\u0000\u02d9g\u0001\u0000\u0000\u0000\u02da\u02db\u0005 \u0000\u0000\u02db"+
		"\u02dc\u0005\u0003\u0000\u0000\u02dc\u02dd\u0003\n\u0005\u0000\u02ddi"+
		"\u0001\u0000\u0000\u0000\u02de\u02df\u0005\u001e\u0000\u0000\u02df\u02e0"+
		"\u0005\u0003\u0000\u0000\u02e0\u02e6\u0005\u0004\u0000\u0000\u02e1\u02e2"+
		"\u0003\n\u0005\u0000\u02e2\u02e3\u0005\t\u0000\u0000\u02e3\u02e5\u0001"+
		"\u0000\u0000\u0000\u02e4\u02e1\u0001\u0000\u0000\u0000\u02e5\u02e8\u0001"+
		"\u0000\u0000\u0000\u02e6\u02e4\u0001\u0000\u0000\u0000\u02e6\u02e7\u0001"+
		"\u0000\u0000\u0000\u02e7\u02e9\u0001\u0000\u0000\u0000\u02e8\u02e6\u0001"+
		"\u0000\u0000\u0000\u02e9\u02ea\u0005\u0005\u0000\u0000\u02eak\u0001\u0000"+
		"\u0000\u0000\u02eb\u02ec\u00052\u0000\u0000\u02ec\u02ed\u0005\u0003\u0000"+
		"\u0000\u02ed\u02ee\u0007\u0007\u0000\u0000\u02eem\u0001\u0000\u0000\u0000"+
		"\u02ef\u02f0\u00055\u0000\u0000\u02f0\u02f1\u0005\u0003\u0000\u0000\u02f1"+
		"\u02f2\u0007\b\u0000\u0000\u02f2o\u0001\u0000\u0000\u0000Vsy\u0085\u0089"+
		"\u008b\u0095\u009e\u00a2\u00a4\u00ae\u00bc\u00c5\u00c9\u00cb\u00da\u00de"+
		"\u00e0\u00e7\u00f0\u00f4\u00f6\u0103\u0107\u0109\u0110\u0119\u011d\u011f"+
		"\u0132\u013b\u013f\u0141\u014e\u0157\u015b\u015d\u0165\u0169\u016f\u017a"+
		"\u017e\u0180\u0194\u019d\u01a1\u01a3\u01ab\u01b4\u01b8\u01ba\u01c7\u01cf"+
		"\u01db\u01df\u01e1\u01e9\u01f2\u01f6\u01f8\u0202\u0206\u0208\u020b\u0219"+
		"\u0221\u022a\u022e\u0230\u023c\u0245\u0249\u024b\u025d\u0266\u026a\u026c"+
		"\u0285\u028e\u0292\u0294\u029f\u02a4\u02af\u02b5\u02c9\u02e6";
>>>>>>> Stashed changes
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}