// Generated from java-escape by ANTLR 4.11.1
package antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

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
		RULE_onPressedProperty = 55;
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
			"onPressedProperty"
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
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 403726925824L) != 0 || _la==IDENTIFIER) {
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
		int _la;
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
			if ( !((((_la - 98)) & ~0x3f) == 0 && ((1L << (_la - 98)) & 7L) != 0) ) {
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
			setState(208);
			match(ROW);
			setState(209);
			match(LP);
			setState(221);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 10133100235325440L) != 0) {
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
			setState(249);
			match(COLUMN);
			setState(250);
			match(LP);
			setState(262);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 10133100235325440L) != 0) {
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
			setState(271);
			match(TEXT);
			setState(272);
			match(LP);
			setState(284);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la - 39)) & ~0x3f) == 0 && ((1L << (_la - 39)) & 68719476765L) != 0) {
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
		public TerminalNode FLOAT() { return getToken(DartParser.FLOAT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(DartParser.IDENTIFIER, 0); }
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
		public TerminalNode IDENTIFIER() { return getToken(DartParser.IDENTIFIER, 0); }
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
				setState(291);
				match(FONTWEIGHT);
				setState(292);
				match(COLON);
				setState(293);
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
				setState(294);
				match(FONTSIZE);
				setState(295);
				match(COLON);
				setState(296);
				_la = _input.LA(1);
				if ( !((((_la - 97)) & ~0x3f) == 0 && ((1L << (_la - 97)) & 7L) != 0) ) {
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
				if ( !((((_la - 97)) & ~0x3f) == 0 && ((1L << (_la - 97)) & 7L) != 0) ) {
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
			setState(305);
			match(CONTAINER);
			setState(306);
			match(LP);
			setState(318);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 36275091918553088L) != 0) {
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
			setState(370);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RADIUS) {
				{
				setState(366);
				borderRadiusCircularRadiusProperty();
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
		enterRule(_localctx, 48, RULE_borderRadiusOnly);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			match(BORDERRADIUSONLY);
			setState(375);
			match(LP);
			setState(387);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & -1152921504606846976L) != 0) {
				{
				setState(376);
				borderRadiusOnlyProperties();
				setState(381);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(377);
						match(COMMA);
						setState(378);
						borderRadiusOnlyProperties();
						}
						} 
					}
					setState(383);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
				}
				setState(385);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(384);
					match(COMMA);
					}
				}

				}
			}

			setState(389);
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
			setState(391);
			match(RADIUS);
			setState(392);
			match(COLON);
			setState(393);
			_la = _input.LA(1);
			if ( !((((_la - 97)) & ~0x3f) == 0 && ((1L << (_la - 97)) & 7L) != 0) ) {
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
			setState(407);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TOPRIGHT:
				_localctx = new BorderRadiusOnlyTopRightContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(395);
				match(TOPRIGHT);
				setState(396);
				match(COLON);
				setState(397);
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
				setState(398);
				match(TOPLEFT);
				setState(399);
				match(COLON);
				setState(400);
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
				setState(401);
				match(BOTTOMRIGHT);
				setState(402);
				match(COLON);
				setState(403);
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
				setState(404);
				match(BOTTOMLEFT);
				setState(405);
				match(COLON);
				setState(406);
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
			setState(409);
			match(EXPANDED);
			setState(410);
			match(LP);
			setState(422);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CHILD || _la==FLEX) {
				{
				setState(411);
				expandedProperties();
				setState(416);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(412);
						match(COMMA);
						setState(413);
						expandedProperties();
						}
						} 
					}
					setState(418);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
				}
				setState(420);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(419);
					match(COMMA);
					}
				}

				}
			}

			setState(424);
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
		enterRule(_localctx, 56, RULE_expandedProperties);
		int _la;
		try {
			setState(430);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FLEX:
				_localctx = new ExpandedFlexContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(426);
				match(FLEX);
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
			case CHILD:
				_localctx = new ExpandedChildContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(429);
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
		enterRule(_localctx, 58, RULE_gestureDetector);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(432);
			match(GESTUREDETECTOR);
			setState(433);
			match(LP);
			setState(445);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ONPRESSED) {
				{
				setState(434);
				gestureDetectorProperties();
				setState(439);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(435);
						match(COMMA);
						setState(436);
						gestureDetectorProperties();
						}
						} 
					}
					setState(441);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
				}
				setState(443);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(442);
					match(COMMA);
					}
				}

				}
			}

			setState(447);
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
			setState(449);
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
			setState(451);
			match(PADDING);
			setState(452);
			match(LP);
			setState(464);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CHILD || _la==PADDINGATTR) {
				{
				setState(453);
				paddingProprtey();
				setState(458);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(454);
						match(COMMA);
						setState(455);
						paddingProprtey();
						}
						} 
					}
					setState(460);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
				}
				setState(462);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(461);
					match(COMMA);
					}
				}

				}
			}

			setState(466);
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
		enterRule(_localctx, 64, RULE_paddingProprtey);
		try {
			setState(472);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PADDINGATTR:
				_localctx = new PaddingPaddingContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(468);
				match(PADDINGATTR);
				setState(469);
				match(COLON);
				setState(470);
				edgeInsets();
				}
				break;
			case CHILD:
				_localctx = new PaddingChildContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(471);
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
		enterRule(_localctx, 66, RULE_edgeInsets);
		int _la;
		try {
			int _alt;
			setState(506);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EDGE_INSETS_ONLY:
				_localctx = new EdgeInsetsOnlyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(474);
				match(EDGE_INSETS_ONLY);
				setState(475);
				match(LP);
				setState(487);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la - 92)) & ~0x3f) == 0 && ((1L << (_la - 92)) & 15L) != 0) {
					{
					setState(476);
					edgeInsetsOnlyProperties();
					setState(481);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(477);
							match(COMMA);
							setState(478);
							edgeInsetsOnlyProperties();
							}
							} 
						}
						setState(483);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
					}
					setState(485);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(484);
						match(COMMA);
						}
					}

					}
				}

				setState(489);
				match(RP);
				}
				break;
			case EDGE_INSETS_SYMMETRIC:
				_localctx = new EdgeInsetsSymetricContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(490);
				match(EDGE_INSETS_SYMMETRIC);
				setState(491);
				match(LP);
				setState(503);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==HORIZONTAL || _la==VERTICAL) {
					{
					setState(492);
					edgeInsetsSymetricProperties();
					setState(497);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(493);
							match(COMMA);
							setState(494);
							edgeInsetsSymetricProperties();
							}
							} 
						}
						setState(499);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
					}
					setState(501);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(500);
						match(COMMA);
						}
					}

					}
				}

				setState(505);
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
			setState(520);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TOP:
				_localctx = new EdgeInsetsOnlyTopContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(508);
				match(TOP);
				setState(509);
				match(COLON);
				setState(510);
				_la = _input.LA(1);
				if ( !((((_la - 97)) & ~0x3f) == 0 && ((1L << (_la - 97)) & 7L) != 0) ) {
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
				setState(511);
				match(LEFT);
				setState(512);
				match(COLON);
				setState(513);
				_la = _input.LA(1);
				if ( !((((_la - 97)) & ~0x3f) == 0 && ((1L << (_la - 97)) & 7L) != 0) ) {
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
				setState(514);
				match(RIGHT);
				setState(515);
				match(COLON);
				setState(516);
				_la = _input.LA(1);
				if ( !((((_la - 97)) & ~0x3f) == 0 && ((1L << (_la - 97)) & 7L) != 0) ) {
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
				setState(517);
				match(BOTTOM);
				setState(518);
				match(COLON);
				setState(519);
				_la = _input.LA(1);
				if ( !((((_la - 97)) & ~0x3f) == 0 && ((1L << (_la - 97)) & 7L) != 0) ) {
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
			setState(528);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HORIZONTAL:
				_localctx = new EdgeInsetsSymetricHorizontalContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(522);
				match(HORIZONTAL);
				setState(523);
				match(COLON);
				setState(524);
				_la = _input.LA(1);
				if ( !((((_la - 97)) & ~0x3f) == 0 && ((1L << (_la - 97)) & 7L) != 0) ) {
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
				setState(525);
				match(VERTICAL);
				setState(526);
				match(COLON);
				setState(527);
				_la = _input.LA(1);
				if ( !((((_la - 97)) & ~0x3f) == 0 && ((1L << (_la - 97)) & 7L) != 0) ) {
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
			setState(530);
			match(IMAGE);
			setState(531);
			match(LP);
			setState(543);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la - 45)) & ~0x3f) == 0 && ((1L << (_la - 45)) & 6291459L) != 0) {
				{
				setState(532);
				imageProperties();
				setState(537);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(533);
						match(COMMA);
						setState(534);
						imageProperties();
						}
						} 
					}
					setState(539);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
				}
				setState(541);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(540);
					match(COMMA);
					}
				}

				}
			}

			setState(545);
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
		public TerminalNode IDENTIFIER() { return getToken(DartParser.IDENTIFIER, 0); }
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
		enterRule(_localctx, 74, RULE_imageProperties);
		int _la;
		try {
			setState(555);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case URL:
				_localctx = new ImageUrlContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(547);
				match(URL);
				setState(548);
				match(COLON);
				setState(549);
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
				setState(550);
				match(FIT);
				setState(551);
				match(COLON);
				setState(552);
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
				setState(553);
				widthProperty();
				}
				break;
			case HEIGHT:
				_localctx = new ImageHeightContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(554);
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
		enterRule(_localctx, 76, RULE_button);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(557);
			match(BUTTON);
			setState(558);
			match(LP);
			setState(570);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la - 45)) & ~0x3f) == 0 && ((1L << (_la - 45)) & 2206203907L) != 0) {
				{
				setState(559);
				buttonProperties();
				setState(564);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(560);
						match(COMMA);
						setState(561);
						buttonProperties();
						}
						} 
					}
					setState(566);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
				}
				setState(568);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(567);
					match(COMMA);
					}
				}

				}
			}

			setState(572);
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
		public OnPressedPropertyContext onPressedProperty() {
			return getRuleContext(OnPressedPropertyContext.class,0);
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
		public TerminalNode IDENTIFIER() { return getToken(DartParser.IDENTIFIER, 0); }
		public ButtonTitleContext(ButtonPropertiesContext ctx) { copyFrom(ctx); }
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
			setState(586);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WIDTH:
				_localctx = new ButtonWidthContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(574);
				widthProperty();
				}
				break;
			case HEIGHT:
				_localctx = new ButtonHeightContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(575);
				heightProperty();
				}
				break;
			case TITLE:
				_localctx = new ButtonTitleContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(576);
				match(TITLE);
				setState(577);
				match(COLON);
				setState(578);
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
				setState(579);
				match(BACKGROUND_COLOR);
				setState(580);
				match(COLON);
				setState(581);
				match(HEX_NUM);
				}
				break;
			case TITLE_COLOR:
				_localctx = new ButtonTitleColorContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(582);
				match(TITLE_COLOR);
				setState(583);
				match(COLON);
				setState(584);
				match(HEX_NUM);
				}
				break;
			case ONPRESSED:
				_localctx = new ButtonOnPressedContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(585);
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
			setState(588);
			match(TEXTFIELD);
			setState(589);
			match(LP);
			setState(601);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la - 59)) & ~0x3f) == 0 && ((1L << (_la - 59)) & 5335154689L) != 0) {
				{
				setState(590);
				textFieldProperties();
				setState(595);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(591);
						match(COMMA);
						setState(592);
						textFieldProperties();
						}
						} 
					}
					setState(597);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
				}
				setState(599);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(598);
					match(COMMA);
					}
				}

				}
			}

			setState(603);
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
		public TerminalNode IDENTIFIER() { return getToken(DartParser.IDENTIFIER, 0); }
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
		public TerminalNode IDENTIFIER() { return getToken(DartParser.IDENTIFIER, 0); }
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
			setState(642);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VALUE:
				_localctx = new TextFieldValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(605);
				match(VALUE);
				setState(606);
				match(COLON);
				setState(607);
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
				setState(608);
				match(LABEL);
				setState(609);
				match(COLON);
				setState(610);
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
				setState(611);
				match(TEXTCOLOR);
				setState(612);
				match(COLON);
				setState(613);
				match(HEX_NUM);
				}
				break;
			case PADDINGATTR:
				_localctx = new TextFieldPaddingContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(614);
				match(PADDINGATTR);
				setState(615);
				match(COLON);
				setState(616);
				edgeInsets();
				}
				break;
			case HINT:
				_localctx = new TextFieldHintContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(617);
				match(HINT);
				setState(618);
				match(COLON);
				setState(619);
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
				setState(620);
				match(BORDERATRI);
				setState(621);
				match(COLON);
				setState(622);
				border();
				}
				break;
			case ONCHANGED:
				_localctx = new TextFieldOnChangedContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(623);
				match(ONCHANGED);
				setState(624);
				match(COLON);
				setState(625);
				match(LP);
				setState(630);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENTIFIER) {
					{
					{
					setState(626);
					match(IDENTIFIER);
					setState(627);
					match(COMMA);
					}
					}
					setState(632);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(633);
				match(RP);
				setState(634);
				match(OB);
				setState(638);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((_la) & ~0x3f) == 0 && ((1L << _la) & 403726925824L) != 0 || _la==IDENTIFIER) {
					{
					{
					setState(635);
					statment();
					}
					}
					setState(640);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(641);
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
			setState(644);
			match(BORDER);
			setState(645);
			match(LP);
			setState(657);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la - 56)) & ~0x3f) == 0 && ((1L << (_la - 56)) & 8589934595L) != 0) {
				{
				setState(646);
				borderProperties();
				setState(651);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(647);
						match(COMMA);
						setState(648);
						borderProperties();
						}
						} 
					}
					setState(653);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
				}
				setState(655);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(654);
					match(COMMA);
					}
				}

				}
			}

			setState(659);
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
		enterRule(_localctx, 86, RULE_borderProperties);
		int _la;
		try {
			setState(666);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case THICKNESS:
				_localctx = new BorderThicknessContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(661);
				match(THICKNESS);
				setState(662);
				match(COLON);
				setState(663);
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
				setState(664);
				borderRadiusProperty();
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DartParserVisitor ) return ((DartParserVisitor<? extends T>)visitor).visitStatment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatmentContext statment() throws RecognitionException {
		StatmentContext _localctx = new StatmentContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_statment);
		try {
			setState(671);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case STRINGTYPE:
			case DOUBLE:
			case FUNCTION:
				enterOuterAlt(_localctx, 1);
				{
				setState(668);
				variableDeclaration();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(669);
				variableAssignment();
				}
				break;
			case WIDGET:
				enterOuterAlt(_localctx, 3);
				{
				setState(670);
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
		enterRule(_localctx, 90, RULE_variableDeclaration);
		int _la;
		try {
			setState(688);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case STRINGTYPE:
			case DOUBLE:
				_localctx = new NonFunctionVariableDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(673);
				_la = _input.LA(1);
				if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 120259084288L) != 0) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(674);
				match(IDENTIFIER);
				setState(675);
				match(SC);
				}
				break;
			case FUNCTION:
				_localctx = new FunctionVariableDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(676);
				match(FUNCTION);
				setState(677);
				match(LP);
				setState(682);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((_la) & ~0x3f) == 0 && ((1L << _la) & 120259084288L) != 0) {
					{
					{
					setState(678);
					_la = _input.LA(1);
					if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 120259084288L) != 0) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(679);
					match(COMMA);
					}
					}
					setState(684);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(685);
				match(RP);
				setState(686);
				match(IDENTIFIER);
				setState(687);
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
		enterRule(_localctx, 92, RULE_variableAssignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(690);
			match(IDENTIFIER);
			setState(691);
			match(EQL);
			setState(692);
			_la = _input.LA(1);
			if ( !((((_la - 98)) & ~0x3f) == 0 && ((1L << (_la - 98)) & 7L) != 0) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(693);
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
			setState(695);
			match(WIDGET);
			setState(696);
			match(WIDGETNAME);
			setState(697);
			match(OB);
			setState(701);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 395136991232L) != 0) {
				{
				{
				setState(698);
				variableDeclaration();
				}
				}
				setState(703);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(704);
			match(RETURN);
			setState(705);
			match(LP);
			setState(706);
			widget();
			setState(707);
			match(RP);
			setState(708);
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
			setState(710);
			match(WIDTH);
			setState(711);
			match(COLON);
			setState(712);
			_la = _input.LA(1);
			if ( !((((_la - 97)) & ~0x3f) == 0 && ((1L << (_la - 97)) & 7L) != 0) ) {
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
			setState(714);
			match(HEIGHT);
			setState(715);
			match(COLON);
			setState(716);
			_la = _input.LA(1);
			if ( !((((_la - 97)) & ~0x3f) == 0 && ((1L << (_la - 97)) & 7L) != 0) ) {
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
			setState(718);
			match(COLOR);
			setState(719);
			match(COLON);
			setState(720);
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
		enterRule(_localctx, 102, RULE_childProperty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(722);
			match(CHILD);
			setState(723);
			match(COLON);
			setState(724);
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
		enterRule(_localctx, 104, RULE_childrenProperty);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(726);
			match(CHILDREN);
			setState(727);
			match(COLON);
			setState(728);
			match(OA);
			setState(740);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 127332352L) != 0 || _la==WIDGETNAME) {
				{
				setState(729);
				widget();
				setState(734);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(730);
						match(COMMA);
						setState(731);
						widget();
						}
						} 
					}
					setState(736);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
				}
				setState(738);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(737);
					match(COMMA);
					}
				}

				}
			}

			setState(742);
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
		enterRule(_localctx, 106, RULE_mainAxisSizeProperty);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(744);
			match(MAINAXISSIZE);
			setState(745);
			match(COLON);
			setState(746);
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
			setState(748);
			match(CROSSAXISALIGNMENT);
			setState(749);
			match(COLON);
			setState(750);
			_la = _input.LA(1);
			if ( !((((_la - 48)) & ~0x3f) == 0 && ((1L << (_la - 48)) & 175921860444225L) != 0) ) {
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
			setState(752);
			match(ONPRESSED);
			setState(753);
			match(COLON);
			setState(754);
			match(LP);
			setState(759);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(755);
				match(IDENTIFIER);
				setState(756);
				match(COMMA);
				}
				}
				setState(761);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(762);
			match(RP);
			setState(763);
			match(OB);
			setState(767);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 403726925824L) != 0 || _la==IDENTIFIER) {
				{
				{
				setState(764);
				statment();
				}
				}
				setState(769);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(770);
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

	public static final String _serializedATN =
		"\u0004\u0001f\u0305\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"\u0017\u0001\u0017\u0003\u0017\u0171\b\u0017\u0003\u0017\u0173\b\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0005\u0018\u017c\b\u0018\n\u0018\f\u0018\u017f\t\u0018\u0001"+
		"\u0018\u0003\u0018\u0182\b\u0018\u0003\u0018\u0184\b\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a"+
		"\u0198\b\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0005\u001b\u019f\b\u001b\n\u001b\f\u001b\u01a2\t\u001b\u0001\u001b\u0003"+
		"\u001b\u01a5\b\u001b\u0003\u001b\u01a7\b\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u01af\b\u001c"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0005\u001d"+
		"\u01b6\b\u001d\n\u001d\f\u001d\u01b9\t\u001d\u0001\u001d\u0003\u001d\u01bc"+
		"\b\u001d\u0003\u001d\u01be\b\u001d\u0001\u001d\u0001\u001d\u0001\u001e"+
		"\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0005\u001f\u01c9\b\u001f\n\u001f\f\u001f\u01cc\t\u001f\u0001\u001f\u0003"+
		"\u001f\u01cf\b\u001f\u0003\u001f\u01d1\b\u001f\u0001\u001f\u0001\u001f"+
		"\u0001 \u0001 \u0001 \u0001 \u0003 \u01d9\b \u0001!\u0001!\u0001!\u0001"+
		"!\u0001!\u0005!\u01e0\b!\n!\f!\u01e3\t!\u0001!\u0003!\u01e6\b!\u0003!"+
		"\u01e8\b!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0005!\u01f0\b!\n"+
		"!\f!\u01f3\t!\u0001!\u0003!\u01f6\b!\u0003!\u01f8\b!\u0001!\u0003!\u01fb"+
		"\b!\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0003\"\u0209\b\"\u0001#\u0001#\u0001#\u0001"+
		"#\u0001#\u0001#\u0003#\u0211\b#\u0001$\u0001$\u0001$\u0001$\u0001$\u0005"+
		"$\u0218\b$\n$\f$\u021b\t$\u0001$\u0003$\u021e\b$\u0003$\u0220\b$\u0001"+
		"$\u0001$\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0003"+
		"%\u022c\b%\u0001&\u0001&\u0001&\u0001&\u0001&\u0005&\u0233\b&\n&\f&\u0236"+
		"\t&\u0001&\u0003&\u0239\b&\u0003&\u023b\b&\u0001&\u0001&\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0003\'\u024b\b\'\u0001(\u0001(\u0001(\u0001(\u0001(\u0005"+
		"(\u0252\b(\n(\f(\u0255\t(\u0001(\u0003(\u0258\b(\u0003(\u025a\b(\u0001"+
		"(\u0001(\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0001)\u0005)\u0275\b)\n)\f)\u0278\t)\u0001)\u0001"+
		")\u0001)\u0005)\u027d\b)\n)\f)\u0280\t)\u0001)\u0003)\u0283\b)\u0001*"+
		"\u0001*\u0001*\u0001*\u0001*\u0005*\u028a\b*\n*\f*\u028d\t*\u0001*\u0003"+
		"*\u0290\b*\u0003*\u0292\b*\u0001*\u0001*\u0001+\u0001+\u0001+\u0001+\u0001"+
		"+\u0003+\u029b\b+\u0001,\u0001,\u0001,\u0003,\u02a0\b,\u0001-\u0001-\u0001"+
		"-\u0001-\u0001-\u0001-\u0001-\u0005-\u02a9\b-\n-\f-\u02ac\t-\u0001-\u0001"+
		"-\u0001-\u0003-\u02b1\b-\u0001.\u0001.\u0001.\u0001.\u0001.\u0001/\u0001"+
		"/\u0001/\u0001/\u0005/\u02bc\b/\n/\f/\u02bf\t/\u0001/\u0001/\u0001/\u0001"+
		"/\u0001/\u0001/\u00010\u00010\u00010\u00010\u00011\u00011\u00011\u0001"+
		"1\u00012\u00012\u00012\u00012\u00013\u00013\u00013\u00013\u00014\u0001"+
		"4\u00014\u00014\u00014\u00014\u00054\u02dd\b4\n4\f4\u02e0\t4\u00014\u0003"+
		"4\u02e3\b4\u00034\u02e5\b4\u00014\u00014\u00015\u00015\u00015\u00015\u0001"+
		"6\u00016\u00016\u00016\u00017\u00017\u00017\u00017\u00017\u00057\u02f6"+
		"\b7\n7\f7\u02f9\t7\u00017\u00017\u00017\u00057\u02fe\b7\n7\f7\u0301\t"+
		"7\u00017\u00017\u00017\u0000\u00008\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDF"+
		"HJLNPRTVXZ\\^`bdfhjln\u0000\u000b\u0002\u0000aadd\u0001\u0000bd\u0002"+
		"\u0000,,QS\u0001\u0000ac\u0002\u000000MO\u0003\u000000]]__\u0002\u0000"+
		"aacc\u0001\u0000GH\u0001\u0000\"$\u0001\u000034\u0004\u00000066]]__\u034a"+
		"\u0000s\u0001\u0000\u0000\u0000\u0002{\u0001\u0000\u0000\u0000\u0004\u0092"+
		"\u0001\u0000\u0000\u0000\u0006\u0094\u0001\u0000\u0000\u0000\b\u00ab\u0001"+
		"\u0000\u0000\u0000\n\u00b9\u0001\u0000\u0000\u0000\f\u00bb\u0001\u0000"+
		"\u0000\u0000\u000e\u00cc\u0001\u0000\u0000\u0000\u0010\u00d0\u0001\u0000"+
		"\u0000\u0000\u0012\u00e4\u0001\u0000\u0000\u0000\u0014\u00e6\u0001\u0000"+
		"\u0000\u0000\u0016\u00f7\u0001\u0000\u0000\u0000\u0018\u00f9\u0001\u0000"+
		"\u0000\u0000\u001a\u010d\u0001\u0000\u0000\u0000\u001c\u010f\u0001\u0000"+
		"\u0000\u0000\u001e\u012f\u0001\u0000\u0000\u0000 \u0131\u0001\u0000\u0000"+
		"\u0000\"\u0149\u0001\u0000\u0000\u0000$\u014b\u0001\u0000\u0000\u0000"+
		"&\u014f\u0001\u0000\u0000\u0000(\u0162\u0001\u0000\u0000\u0000*\u0164"+
		"\u0001\u0000\u0000\u0000,\u016a\u0001\u0000\u0000\u0000.\u016c\u0001\u0000"+
		"\u0000\u00000\u0176\u0001\u0000\u0000\u00002\u0187\u0001\u0000\u0000\u0000"+
		"4\u0197\u0001\u0000\u0000\u00006\u0199\u0001\u0000\u0000\u00008\u01ae"+
		"\u0001\u0000\u0000\u0000:\u01b0\u0001\u0000\u0000\u0000<\u01c1\u0001\u0000"+
		"\u0000\u0000>\u01c3\u0001\u0000\u0000\u0000@\u01d8\u0001\u0000\u0000\u0000"+
		"B\u01fa\u0001\u0000\u0000\u0000D\u0208\u0001\u0000\u0000\u0000F\u0210"+
		"\u0001\u0000\u0000\u0000H\u0212\u0001\u0000\u0000\u0000J\u022b\u0001\u0000"+
		"\u0000\u0000L\u022d\u0001\u0000\u0000\u0000N\u024a\u0001\u0000\u0000\u0000"+
		"P\u024c\u0001\u0000\u0000\u0000R\u0282\u0001\u0000\u0000\u0000T\u0284"+
		"\u0001\u0000\u0000\u0000V\u029a\u0001\u0000\u0000\u0000X\u029f\u0001\u0000"+
		"\u0000\u0000Z\u02b0\u0001\u0000\u0000\u0000\\\u02b2\u0001\u0000\u0000"+
		"\u0000^\u02b7\u0001\u0000\u0000\u0000`\u02c6\u0001\u0000\u0000\u0000b"+
		"\u02ca\u0001\u0000\u0000\u0000d\u02ce\u0001\u0000\u0000\u0000f\u02d2\u0001"+
		"\u0000\u0000\u0000h\u02d6\u0001\u0000\u0000\u0000j\u02e8\u0001\u0000\u0000"+
		"\u0000l\u02ec\u0001\u0000\u0000\u0000n\u02f0\u0001\u0000\u0000\u0000p"+
		"r\u0003X,\u0000qp\u0001\u0000\u0000\u0000ru\u0001\u0000\u0000\u0000sq"+
		"\u0001\u0000\u0000\u0000st\u0001\u0000\u0000\u0000tw\u0001\u0000\u0000"+
		"\u0000us\u0001\u0000\u0000\u0000vx\u0003\u0002\u0001\u0000wv\u0001\u0000"+
		"\u0000\u0000wx\u0001\u0000\u0000\u0000xy\u0001\u0000\u0000\u0000yz\u0005"+
		"\u0000\u0000\u0001z\u0001\u0001\u0000\u0000\u0000{|\u0005\u000b\u0000"+
		"\u0000|\u0088\u0005\u0001\u0000\u0000}\u0082\u0003\u0004\u0002\u0000~"+
		"\u007f\u0005\t\u0000\u0000\u007f\u0081\u0003\u0004\u0002\u0000\u0080~"+
		"\u0001\u0000\u0000\u0000\u0081\u0084\u0001\u0000\u0000\u0000\u0082\u0080"+
		"\u0001\u0000\u0000\u0000\u0082\u0083\u0001\u0000\u0000\u0000\u0083\u0086"+
		"\u0001\u0000\u0000\u0000\u0084\u0082\u0001\u0000\u0000\u0000\u0085\u0087"+
		"\u0005\t\u0000\u0000\u0086\u0085\u0001\u0000\u0000\u0000\u0086\u0087\u0001"+
		"\u0000\u0000\u0000\u0087\u0089\u0001\u0000\u0000\u0000\u0088}\u0001\u0000"+
		"\u0000\u0000\u0088\u0089\u0001\u0000\u0000\u0000\u0089\u008a\u0001\u0000"+
		"\u0000\u0000\u008a\u008b\u0005\u0002\u0000\u0000\u008b\u0003\u0001\u0000"+
		"\u0000\u0000\u008c\u008d\u0005\u001f\u0000\u0000\u008d\u008e\u0005\u0003"+
		"\u0000\u0000\u008e\u0093\u0003\n\u0005\u0000\u008f\u0090\u0005(\u0000"+
		"\u0000\u0090\u0091\u0005\u0003\u0000\u0000\u0091\u0093\u0003\u0006\u0003"+
		"\u0000\u0092\u008c\u0001\u0000\u0000\u0000\u0092\u008f\u0001\u0000\u0000"+
		"\u0000\u0093\u0005\u0001\u0000\u0000\u0000\u0094\u0095\u0005\u0010\u0000"+
		"\u0000\u0095\u00a1\u0005\u0001\u0000\u0000\u0096\u009b\u0003\b\u0004\u0000"+
		"\u0097\u0098\u0005\t\u0000\u0000\u0098\u009a\u0003\b\u0004\u0000\u0099"+
		"\u0097\u0001\u0000\u0000\u0000\u009a\u009d\u0001\u0000\u0000\u0000\u009b"+
		"\u0099\u0001\u0000\u0000\u0000\u009b\u009c\u0001\u0000\u0000\u0000\u009c"+
		"\u009f\u0001\u0000\u0000\u0000\u009d\u009b\u0001\u0000\u0000\u0000\u009e"+
		"\u00a0\u0005\t\u0000\u0000\u009f\u009e\u0001\u0000\u0000\u0000\u009f\u00a0"+
		"\u0001\u0000\u0000\u0000\u00a0\u00a2\u0001\u0000\u0000\u0000\u00a1\u0096"+
		"\u0001\u0000\u0000\u0000\u00a1\u00a2\u0001\u0000\u0000\u0000\u00a2\u00a3"+
		"\u0001\u0000\u0000\u0000\u00a3\u00a4\u0005\u0002\u0000\u0000\u00a4\u0007"+
		"\u0001\u0000\u0000\u0000\u00a5\u00a6\u0005D\u0000\u0000\u00a6\u00a7\u0005"+
		"\u0003\u0000\u0000\u00a7\u00ac\u0007\u0000\u0000\u0000\u00a8\u00a9\u0005"+
		"J\u0000\u0000\u00a9\u00aa\u0005\u0003\u0000\u0000\u00aa\u00ac\u0005I\u0000"+
		"\u0000\u00ab\u00a5\u0001\u0000\u0000\u0000\u00ab\u00a8\u0001\u0000\u0000"+
		"\u0000\u00ac\t\u0001\u0000\u0000\u0000\u00ad\u00ba\u0003\u0010\b\u0000"+
		"\u00ae\u00ba\u0003\u0014\n\u0000\u00af\u00ba\u0003\u001c\u000e\u0000\u00b0"+
		"\u00ba\u0003 \u0010\u0000\u00b1\u00ba\u00036\u001b\u0000\u00b2\u00ba\u0003"+
		"\u0018\f\u0000\u00b3\u00ba\u0003:\u001d\u0000\u00b4\u00ba\u0003>\u001f"+
		"\u0000\u00b5\u00ba\u0003H$\u0000\u00b6\u00ba\u0003L&\u0000\u00b7\u00ba"+
		"\u0003\f\u0006\u0000\u00b8\u00ba\u0003P(\u0000\u00b9\u00ad\u0001\u0000"+
		"\u0000\u0000\u00b9\u00ae\u0001\u0000\u0000\u0000\u00b9\u00af\u0001\u0000"+
		"\u0000\u0000\u00b9\u00b0\u0001\u0000\u0000\u0000\u00b9\u00b1\u0001\u0000"+
		"\u0000\u0000\u00b9\u00b2\u0001\u0000\u0000\u0000\u00b9\u00b3\u0001\u0000"+
		"\u0000\u0000\u00b9\u00b4\u0001\u0000\u0000\u0000\u00b9\u00b5\u0001\u0000"+
		"\u0000\u0000\u00b9\u00b6\u0001\u0000\u0000\u0000\u00b9\u00b7\u0001\u0000"+
		"\u0000\u0000\u00b9\u00b8\u0001\u0000\u0000\u0000\u00ba\u000b\u0001\u0000"+
		"\u0000\u0000\u00bb\u00bc\u0005`\u0000\u0000\u00bc\u00c8\u0005\u0001\u0000"+
		"\u0000\u00bd\u00c2\u0003\u000e\u0007\u0000\u00be\u00bf\u0005\t\u0000\u0000"+
		"\u00bf\u00c1\u0003\u000e\u0007\u0000\u00c0\u00be\u0001\u0000\u0000\u0000"+
		"\u00c1\u00c4\u0001\u0000\u0000\u0000\u00c2\u00c0\u0001\u0000\u0000\u0000"+
		"\u00c2\u00c3\u0001\u0000\u0000\u0000\u00c3\u00c6\u0001\u0000\u0000\u0000"+
		"\u00c4\u00c2\u0001\u0000\u0000\u0000\u00c5\u00c7\u0005\t\u0000\u0000\u00c6"+
		"\u00c5\u0001\u0000\u0000\u0000\u00c6\u00c7\u0001\u0000\u0000\u0000\u00c7"+
		"\u00c9\u0001\u0000\u0000\u0000\u00c8\u00bd\u0001\u0000\u0000\u0000\u00c8"+
		"\u00c9\u0001\u0000\u0000\u0000\u00c9\u00ca\u0001\u0000\u0000\u0000\u00ca"+
		"\u00cb\u0005\u0002\u0000\u0000\u00cb\r\u0001\u0000\u0000\u0000\u00cc\u00cd"+
		"\u0005a\u0000\u0000\u00cd\u00ce\u0005\u0003\u0000\u0000\u00ce\u00cf\u0007"+
		"\u0001\u0000\u0000\u00cf\u000f\u0001\u0000\u0000\u0000\u00d0\u00d1\u0005"+
		"\f\u0000\u0000\u00d1\u00dd\u0005\u0001\u0000\u0000\u00d2\u00d7\u0003\u0012"+
		"\t\u0000\u00d3\u00d4\u0005\t\u0000\u0000\u00d4\u00d6\u0003\u0012\t\u0000"+
		"\u00d5\u00d3\u0001\u0000\u0000\u0000\u00d6\u00d9\u0001\u0000\u0000\u0000"+
		"\u00d7\u00d5\u0001\u0000\u0000\u0000\u00d7\u00d8\u0001\u0000\u0000\u0000"+
		"\u00d8\u00db\u0001\u0000\u0000\u0000\u00d9\u00d7\u0001\u0000\u0000\u0000"+
		"\u00da\u00dc\u0005\t\u0000\u0000\u00db\u00da\u0001\u0000\u0000\u0000\u00db"+
		"\u00dc\u0001\u0000\u0000\u0000\u00dc\u00de\u0001\u0000\u0000\u0000\u00dd"+
		"\u00d2\u0001\u0000\u0000\u0000\u00dd\u00de\u0001\u0000\u0000\u0000\u00de"+
		"\u00df\u0001\u0000\u0000\u0000\u00df\u00e0\u0005\u0002\u0000\u0000\u00e0"+
		"\u0011\u0001\u0000\u0000\u0000\u00e1\u00e5\u0003h4\u0000\u00e2\u00e5\u0003"+
		"j5\u0000\u00e3\u00e5\u0003l6\u0000\u00e4\u00e1\u0001\u0000\u0000\u0000"+
		"\u00e4\u00e2\u0001\u0000\u0000\u0000\u00e4\u00e3\u0001\u0000\u0000\u0000"+
		"\u00e5\u0013\u0001\u0000\u0000\u0000\u00e6\u00e7\u0005\r\u0000\u0000\u00e7"+
		"\u00f3\u0005\u0001\u0000\u0000\u00e8\u00ed\u0003\u0016\u000b\u0000\u00e9"+
		"\u00ea\u0005\t\u0000\u0000\u00ea\u00ec\u0003\u0016\u000b\u0000\u00eb\u00e9"+
		"\u0001\u0000\u0000\u0000\u00ec\u00ef\u0001\u0000\u0000\u0000\u00ed\u00eb"+
		"\u0001\u0000\u0000\u0000\u00ed\u00ee\u0001\u0000\u0000\u0000\u00ee\u00f1"+
		"\u0001\u0000\u0000\u0000\u00ef\u00ed\u0001\u0000\u0000\u0000\u00f0\u00f2"+
		"\u0005\t\u0000\u0000\u00f1\u00f0\u0001\u0000\u0000\u0000\u00f1\u00f2\u0001"+
		"\u0000\u0000\u0000\u00f2\u00f4\u0001\u0000\u0000\u0000\u00f3\u00e8\u0001"+
		"\u0000\u0000\u0000\u00f3\u00f4\u0001\u0000\u0000\u0000\u00f4\u00f5\u0001"+
		"\u0000\u0000\u0000\u00f5\u00f6\u0005\u0002\u0000\u0000\u00f6\u0015\u0001"+
		"\u0000\u0000\u0000\u00f7\u00f8\u0003f3\u0000\u00f8\u0017\u0001\u0000\u0000"+
		"\u0000\u00f9\u00fa\u0005\u000e\u0000\u0000\u00fa\u0106\u0005\u0001\u0000"+
		"\u0000\u00fb\u0100\u0003\u001a\r\u0000\u00fc\u00fd\u0005\t\u0000\u0000"+
		"\u00fd\u00ff\u0003\u001a\r\u0000\u00fe\u00fc\u0001\u0000\u0000\u0000\u00ff"+
		"\u0102\u0001\u0000\u0000\u0000\u0100\u00fe\u0001\u0000\u0000\u0000\u0100"+
		"\u0101\u0001\u0000\u0000\u0000\u0101\u0104\u0001\u0000\u0000\u0000\u0102"+
		"\u0100\u0001\u0000\u0000\u0000\u0103\u0105\u0005\t\u0000\u0000\u0104\u0103"+
		"\u0001\u0000\u0000\u0000\u0104\u0105\u0001\u0000\u0000\u0000\u0105\u0107"+
		"\u0001\u0000\u0000\u0000\u0106\u00fb\u0001\u0000\u0000\u0000\u0106\u0107"+
		"\u0001\u0000\u0000\u0000\u0107\u0108\u0001\u0000\u0000\u0000\u0108\u0109"+
		"\u0005\u0002\u0000\u0000\u0109\u0019\u0001\u0000\u0000\u0000\u010a\u010e"+
		"\u0003h4\u0000\u010b\u010e\u0003j5\u0000\u010c\u010e\u0003l6\u0000\u010d"+
		"\u010a\u0001\u0000\u0000\u0000\u010d\u010b\u0001\u0000\u0000\u0000\u010d"+
		"\u010c\u0001\u0000\u0000\u0000\u010e\u001b\u0001\u0000\u0000\u0000\u010f"+
		"\u0110\u0005\u000f\u0000\u0000\u0110\u011c\u0005\u0001\u0000\u0000\u0111"+
		"\u0116\u0003\u001e\u000f\u0000\u0112\u0113\u0005\t\u0000\u0000\u0113\u0115"+
		"\u0003\u001e\u000f\u0000\u0114\u0112\u0001\u0000\u0000\u0000\u0115\u0118"+
		"\u0001\u0000\u0000\u0000\u0116\u0114\u0001\u0000\u0000\u0000\u0116\u0117"+
		"\u0001\u0000\u0000\u0000\u0117\u011a\u0001\u0000\u0000\u0000\u0118\u0116"+
		"\u0001\u0000\u0000\u0000\u0119\u011b\u0005\t\u0000\u0000\u011a\u0119\u0001"+
		"\u0000\u0000\u0000\u011a\u011b\u0001\u0000\u0000\u0000\u011b\u011d\u0001"+
		"\u0000\u0000\u0000\u011c\u0111\u0001\u0000\u0000\u0000\u011c\u011d\u0001"+
		"\u0000\u0000\u0000\u011d\u011e\u0001\u0000\u0000\u0000\u011e\u011f\u0005"+
		"\u0002\u0000\u0000\u011f\u001d\u0001\u0000\u0000\u0000\u0120\u0121\u0005"+
		"\'\u0000\u0000\u0121\u0122\u0005\u0003\u0000\u0000\u0122\u0130\u0007\u0000"+
		"\u0000\u0000\u0123\u0124\u0005)\u0000\u0000\u0124\u0125\u0005\u0003\u0000"+
		"\u0000\u0125\u0130\u0007\u0002\u0000\u0000\u0126\u0127\u0005*\u0000\u0000"+
		"\u0127\u0128\u0005\u0003\u0000\u0000\u0128\u0130\u0007\u0003\u0000\u0000"+
		"\u0129\u012a\u0005+\u0000\u0000\u012a\u012b\u0005\u0003\u0000\u0000\u012b"+
		"\u0130\u0007\u0003\u0000\u0000\u012c\u012d\u0005K\u0000\u0000\u012d\u012e"+
		"\u0005\u0003\u0000\u0000\u012e\u0130\u0007\u0004\u0000\u0000\u012f\u0120"+
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
		"\u0000\u0141!\u0001\u0000\u0000\u0000\u0142\u014a\u0003`0\u0000\u0143"+
		"\u014a\u0003b1\u0000\u0144\u0145\u0005/\u0000\u0000\u0145\u0146\u0005"+
		"\u0003\u0000\u0000\u0146\u014a\u0007\u0005\u0000\u0000\u0147\u014a\u0003"+
		"f3\u0000\u0148\u014a\u0003$\u0012\u0000\u0149\u0142\u0001\u0000\u0000"+
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
		"\u0163\u0003d2\u0000\u0161\u0163\u0003*\u0015\u0000\u0162\u0160\u0001"+
		"\u0000\u0000\u0000\u0162\u0161\u0001\u0000\u0000\u0000\u0163)\u0001\u0000"+
		"\u0000\u0000\u0164\u0165\u00059\u0000\u0000\u0165\u0166\u0005\u0003\u0000"+
		"\u0000\u0166\u0167\u0003,\u0016\u0000\u0167+\u0001\u0000\u0000\u0000\u0168"+
		"\u016b\u00030\u0018\u0000\u0169\u016b\u0003.\u0017\u0000\u016a\u0168\u0001"+
		"\u0000\u0000\u0000\u016a\u0169\u0001\u0000\u0000\u0000\u016b-\u0001\u0000"+
		"\u0000\u0000\u016c\u016d\u0005\u001d\u0000\u0000\u016d\u0172\u0005\u0001"+
		"\u0000\u0000\u016e\u0170\u00032\u0019\u0000\u016f\u0171\u0005\t\u0000"+
		"\u0000\u0170\u016f\u0001\u0000\u0000\u0000\u0170\u0171\u0001\u0000\u0000"+
		"\u0000\u0171\u0173\u0001\u0000\u0000\u0000\u0172\u016e\u0001\u0000\u0000"+
		"\u0000\u0172\u0173\u0001\u0000\u0000\u0000\u0173\u0174\u0001\u0000\u0000"+
		"\u0000\u0174\u0175\u0005\u0002\u0000\u0000\u0175/\u0001\u0000\u0000\u0000"+
		"\u0176\u0177\u0005\u001c\u0000\u0000\u0177\u0183\u0005\u0001\u0000\u0000"+
		"\u0178\u017d\u00034\u001a\u0000\u0179\u017a\u0005\t\u0000\u0000\u017a"+
		"\u017c\u00034\u001a\u0000\u017b\u0179\u0001\u0000\u0000\u0000\u017c\u017f"+
		"\u0001\u0000\u0000\u0000\u017d\u017b\u0001\u0000\u0000\u0000\u017d\u017e"+
		"\u0001\u0000\u0000\u0000\u017e\u0181\u0001\u0000\u0000\u0000\u017f\u017d"+
		"\u0001\u0000\u0000\u0000\u0180\u0182\u0005\t\u0000\u0000\u0181\u0180\u0001"+
		"\u0000\u0000\u0000\u0181\u0182\u0001\u0000\u0000\u0000\u0182\u0184\u0001"+
		"\u0000\u0000\u0000\u0183\u0178\u0001\u0000\u0000\u0000\u0183\u0184\u0001"+
		"\u0000\u0000\u0000\u0184\u0185\u0001\u0000\u0000\u0000\u0185\u0186\u0005"+
		"\u0002\u0000\u0000\u01861\u0001\u0000\u0000\u0000\u0187\u0188\u0005Z\u0000"+
		"\u0000\u0188\u0189\u0005\u0003\u0000\u0000\u0189\u018a\u0007\u0003\u0000"+
		"\u0000\u018a3\u0001\u0000\u0000\u0000\u018b\u018c\u0005<\u0000\u0000\u018c"+
		"\u018d\u0005\u0003\u0000\u0000\u018d\u0198\u0007\u0006\u0000\u0000\u018e"+
		"\u018f\u0005=\u0000\u0000\u018f\u0190\u0005\u0003\u0000\u0000\u0190\u0198"+
		"\u0007\u0006\u0000\u0000\u0191\u0192\u0005>\u0000\u0000\u0192\u0193\u0005"+
		"\u0003\u0000\u0000\u0193\u0198\u0007\u0006\u0000\u0000\u0194\u0195\u0005"+
		"?\u0000\u0000\u0195\u0196\u0005\u0003\u0000\u0000\u0196\u0198\u0007\u0006"+
		"\u0000\u0000\u0197\u018b\u0001\u0000\u0000\u0000\u0197\u018e\u0001\u0000"+
		"\u0000\u0000\u0197\u0191\u0001\u0000\u0000\u0000\u0197\u0194\u0001\u0000"+
		"\u0000\u0000\u01985\u0001\u0000\u0000\u0000\u0199\u019a\u0005\u0012\u0000"+
		"\u0000\u019a\u01a6\u0005\u0001\u0000\u0000\u019b\u01a0\u00038\u001c\u0000"+
		"\u019c\u019d\u0005\t\u0000\u0000\u019d\u019f\u00038\u001c\u0000\u019e"+
		"\u019c\u0001\u0000\u0000\u0000\u019f\u01a2\u0001\u0000\u0000\u0000\u01a0"+
		"\u019e\u0001\u0000\u0000\u0000\u01a0\u01a1\u0001\u0000\u0000\u0000\u01a1"+
		"\u01a4\u0001\u0000\u0000\u0000\u01a2\u01a0\u0001\u0000\u0000\u0000\u01a3"+
		"\u01a5\u0005\t\u0000\u0000\u01a4\u01a3\u0001\u0000\u0000\u0000\u01a4\u01a5"+
		"\u0001\u0000\u0000\u0000\u01a5\u01a7\u0001\u0000\u0000\u0000\u01a6\u019b"+
		"\u0001\u0000\u0000\u0000\u01a6\u01a7\u0001\u0000\u0000\u0000\u01a7\u01a8"+
		"\u0001\u0000\u0000\u0000\u01a8\u01a9\u0005\u0002\u0000\u0000\u01a97\u0001"+
		"\u0000\u0000\u0000\u01aa\u01ab\u00051\u0000\u0000\u01ab\u01ac\u0005\u0003"+
		"\u0000\u0000\u01ac\u01af\u0007\u0006\u0000\u0000\u01ad\u01af\u0003f3\u0000"+
		"\u01ae\u01aa\u0001\u0000\u0000\u0000\u01ae\u01ad\u0001\u0000\u0000\u0000"+
		"\u01af9\u0001\u0000\u0000\u0000\u01b0\u01b1\u0005\u0019\u0000\u0000\u01b1"+
		"\u01bd\u0005\u0001\u0000\u0000\u01b2\u01b7\u0003<\u001e\u0000\u01b3\u01b4"+
		"\u0005\t\u0000\u0000\u01b4\u01b6\u0003<\u001e\u0000\u01b5\u01b3\u0001"+
		"\u0000\u0000\u0000\u01b6\u01b9\u0001\u0000\u0000\u0000\u01b7\u01b5\u0001"+
		"\u0000\u0000\u0000\u01b7\u01b8\u0001\u0000\u0000\u0000\u01b8\u01bb\u0001"+
		"\u0000\u0000\u0000\u01b9\u01b7\u0001\u0000\u0000\u0000\u01ba\u01bc\u0005"+
		"\t\u0000\u0000\u01bb\u01ba\u0001\u0000\u0000\u0000\u01bb\u01bc\u0001\u0000"+
		"\u0000\u0000\u01bc\u01be\u0001\u0000\u0000\u0000\u01bd\u01b2\u0001\u0000"+
		"\u0000\u0000\u01bd\u01be\u0001\u0000\u0000\u0000\u01be\u01bf\u0001\u0000"+
		"\u0000\u0000\u01bf\u01c0\u0005\u0002\u0000\u0000\u01c0;\u0001\u0000\u0000"+
		"\u0000\u01c1\u01c2\u0003n7\u0000\u01c2=\u0001\u0000\u0000\u0000\u01c3"+
		"\u01c4\u0005\u0014\u0000\u0000\u01c4\u01d0\u0005\u0001\u0000\u0000\u01c5"+
		"\u01ca\u0003@ \u0000\u01c6\u01c7\u0005\t\u0000\u0000\u01c7\u01c9\u0003"+
		"@ \u0000\u01c8\u01c6\u0001\u0000\u0000\u0000\u01c9\u01cc\u0001\u0000\u0000"+
		"\u0000\u01ca\u01c8\u0001\u0000\u0000\u0000\u01ca\u01cb\u0001\u0000\u0000"+
		"\u0000\u01cb\u01ce\u0001\u0000\u0000\u0000\u01cc\u01ca\u0001\u0000\u0000"+
		"\u0000\u01cd\u01cf\u0005\t\u0000\u0000\u01ce\u01cd\u0001\u0000\u0000\u0000"+
		"\u01ce\u01cf\u0001\u0000\u0000\u0000\u01cf\u01d1\u0001\u0000\u0000\u0000"+
		"\u01d0\u01c5\u0001\u0000\u0000\u0000\u01d0\u01d1\u0001\u0000\u0000\u0000"+
		"\u01d1\u01d2\u0001\u0000\u0000\u0000\u01d2\u01d3\u0005\u0002\u0000\u0000"+
		"\u01d3?\u0001\u0000\u0000\u0000\u01d4\u01d5\u0005;\u0000\u0000\u01d5\u01d6"+
		"\u0005\u0003\u0000\u0000\u01d6\u01d9\u0003B!\u0000\u01d7\u01d9\u0003f"+
		"3\u0000\u01d8\u01d4\u0001\u0000\u0000\u0000\u01d8\u01d7\u0001\u0000\u0000"+
		"\u0000\u01d9A\u0001\u0000\u0000\u0000\u01da\u01db\u0005\u0015\u0000\u0000"+
		"\u01db\u01e7\u0005\u0001\u0000\u0000\u01dc\u01e1\u0003D\"\u0000\u01dd"+
		"\u01de\u0005\t\u0000\u0000\u01de\u01e0\u0003D\"\u0000\u01df\u01dd\u0001"+
		"\u0000\u0000\u0000\u01e0\u01e3\u0001\u0000\u0000\u0000\u01e1\u01df\u0001"+
		"\u0000\u0000\u0000\u01e1\u01e2\u0001\u0000\u0000\u0000\u01e2\u01e5\u0001"+
		"\u0000\u0000\u0000\u01e3\u01e1\u0001\u0000\u0000\u0000\u01e4\u01e6\u0005"+
		"\t\u0000\u0000\u01e5\u01e4\u0001\u0000\u0000\u0000\u01e5\u01e6\u0001\u0000"+
		"\u0000\u0000\u01e6\u01e8\u0001\u0000\u0000\u0000\u01e7\u01dc\u0001\u0000"+
		"\u0000\u0000\u01e7\u01e8\u0001\u0000\u0000\u0000\u01e8\u01e9\u0001\u0000"+
		"\u0000\u0000\u01e9\u01fb\u0005\u0002\u0000\u0000\u01ea\u01eb\u0005\u0016"+
		"\u0000\u0000\u01eb\u01f7\u0005\u0001\u0000\u0000\u01ec\u01f1\u0003F#\u0000"+
		"\u01ed\u01ee\u0005\t\u0000\u0000\u01ee\u01f0\u0003F#\u0000\u01ef\u01ed"+
		"\u0001\u0000\u0000\u0000\u01f0\u01f3\u0001\u0000\u0000\u0000\u01f1\u01ef"+
		"\u0001\u0000\u0000\u0000\u01f1\u01f2\u0001\u0000\u0000\u0000\u01f2\u01f5"+
		"\u0001\u0000\u0000\u0000\u01f3\u01f1\u0001\u0000\u0000\u0000\u01f4\u01f6"+
		"\u0005\t\u0000\u0000\u01f5\u01f4\u0001\u0000\u0000\u0000\u01f5\u01f6\u0001"+
		"\u0000\u0000\u0000\u01f6\u01f8\u0001\u0000\u0000\u0000\u01f7\u01ec\u0001"+
		"\u0000\u0000\u0000\u01f7\u01f8\u0001\u0000\u0000\u0000\u01f8\u01f9\u0001"+
		"\u0000\u0000\u0000\u01f9\u01fb\u0005\u0002\u0000\u0000\u01fa\u01da\u0001"+
		"\u0000\u0000\u0000\u01fa\u01ea\u0001\u0000\u0000\u0000\u01fbC\u0001\u0000"+
		"\u0000\u0000\u01fc\u01fd\u0005\\\u0000\u0000\u01fd\u01fe\u0005\u0003\u0000"+
		"\u0000\u01fe\u0209\u0007\u0003\u0000\u0000\u01ff\u0200\u0005]\u0000\u0000"+
		"\u0200\u0201\u0005\u0003\u0000\u0000\u0201\u0209\u0007\u0003\u0000\u0000"+
		"\u0202\u0203\u0005_\u0000\u0000\u0203\u0204\u0005\u0003\u0000\u0000\u0204"+
		"\u0209\u0007\u0003\u0000\u0000\u0205\u0206\u0005^\u0000\u0000\u0206\u0207"+
		"\u0005\u0003\u0000\u0000\u0207\u0209\u0007\u0003\u0000\u0000\u0208\u01fc"+
		"\u0001\u0000\u0000\u0000\u0208\u01ff\u0001\u0000\u0000\u0000\u0208\u0202"+
		"\u0001\u0000\u0000\u0000\u0208\u0205\u0001\u0000\u0000\u0000\u0209E\u0001"+
		"\u0000\u0000\u0000\u020a\u020b\u0005@\u0000\u0000\u020b\u020c\u0005\u0003"+
		"\u0000\u0000\u020c\u0211\u0007\u0003\u0000\u0000\u020d\u020e\u0005A\u0000"+
		"\u0000\u020e\u020f\u0005\u0003\u0000\u0000\u020f\u0211\u0007\u0003\u0000"+
		"\u0000\u0210\u020a\u0001\u0000\u0000\u0000\u0210\u020d\u0001\u0000\u0000"+
		"\u0000\u0211G\u0001\u0000\u0000\u0000\u0212\u0213\u0005\u0017\u0000\u0000"+
		"\u0213\u021f\u0005\u0001\u0000\u0000\u0214\u0219\u0003J%\u0000\u0215\u0216"+
		"\u0005\t\u0000\u0000\u0216\u0218\u0003J%\u0000\u0217\u0215\u0001\u0000"+
		"\u0000\u0000\u0218\u021b\u0001\u0000\u0000\u0000\u0219\u0217\u0001\u0000"+
		"\u0000\u0000\u0219\u021a\u0001\u0000\u0000\u0000\u021a\u021d\u0001\u0000"+
		"\u0000\u0000\u021b\u0219\u0001\u0000\u0000\u0000\u021c\u021e\u0005\t\u0000"+
		"\u0000\u021d\u021c\u0001\u0000\u0000\u0000\u021d\u021e\u0001\u0000\u0000"+
		"\u0000\u021e\u0220\u0001\u0000\u0000\u0000\u021f\u0214\u0001\u0000\u0000"+
		"\u0000\u021f\u0220\u0001\u0000\u0000\u0000\u0220\u0221\u0001\u0000\u0000"+
		"\u0000\u0221\u0222\u0005\u0002\u0000\u0000\u0222I\u0001\u0000\u0000\u0000"+
		"\u0223\u0224\u0005C\u0000\u0000\u0224\u0225\u0005\u0003\u0000\u0000\u0225"+
		"\u022c\u0007\u0000\u0000\u0000\u0226\u0227\u0005B\u0000\u0000\u0227\u0228"+
		"\u0005\u0003\u0000\u0000\u0228\u022c\u0007\u0007\u0000\u0000\u0229\u022c"+
		"\u0003`0\u0000\u022a\u022c\u0003b1\u0000\u022b\u0223\u0001\u0000\u0000"+
		"\u0000\u022b\u0226\u0001\u0000\u0000\u0000\u022b\u0229\u0001\u0000\u0000"+
		"\u0000\u022b\u022a\u0001\u0000\u0000\u0000\u022cK\u0001\u0000\u0000\u0000"+
		"\u022d\u022e\u0005\u0018\u0000\u0000\u022e\u023a\u0005\u0001\u0000\u0000"+
		"\u022f\u0234\u0003N\'\u0000\u0230\u0231\u0005\t\u0000\u0000\u0231\u0233"+
		"\u0003N\'\u0000\u0232\u0230\u0001\u0000\u0000\u0000\u0233\u0236\u0001"+
		"\u0000\u0000\u0000\u0234\u0232\u0001\u0000\u0000\u0000\u0234\u0235\u0001"+
		"\u0000\u0000\u0000\u0235\u0238\u0001\u0000\u0000\u0000\u0236\u0234\u0001"+
		"\u0000\u0000\u0000\u0237\u0239\u0005\t\u0000\u0000\u0238\u0237\u0001\u0000"+
		"\u0000\u0000\u0238\u0239\u0001\u0000\u0000\u0000\u0239\u023b\u0001\u0000"+
		"\u0000\u0000\u023a\u022f\u0001\u0000\u0000\u0000\u023a\u023b\u0001\u0000"+
		"\u0000\u0000\u023b\u023c\u0001\u0000\u0000\u0000\u023c\u023d\u0005\u0002"+
		"\u0000\u0000\u023dM\u0001\u0000\u0000\u0000\u023e\u024b\u0003`0\u0000"+
		"\u023f\u024b\u0003b1\u0000\u0240\u0241\u0005D\u0000\u0000\u0241\u0242"+
		"\u0005\u0003\u0000\u0000\u0242\u024b\u0007\u0000\u0000\u0000\u0243\u0244"+
		"\u0005E\u0000\u0000\u0244\u0245\u0005\u0003\u0000\u0000\u0245\u024b\u0005"+
		"e\u0000\u0000\u0246\u0247\u0005F\u0000\u0000\u0247\u0248\u0005\u0003\u0000"+
		"\u0000\u0248\u024b\u0005e\u0000\u0000\u0249\u024b\u0003n7\u0000\u024a"+
		"\u023e\u0001\u0000\u0000\u0000\u024a\u023f\u0001\u0000\u0000\u0000\u024a"+
		"\u0240\u0001\u0000\u0000\u0000\u024a\u0243\u0001\u0000\u0000\u0000\u024a"+
		"\u0246\u0001\u0000\u0000\u0000\u024a\u0249\u0001\u0000\u0000\u0000\u024b"+
		"O\u0001\u0000\u0000\u0000\u024c\u024d\u0005\u001a\u0000\u0000\u024d\u0259"+
		"\u0005\u0001\u0000\u0000\u024e\u0253\u0003R)\u0000\u024f\u0250\u0005\t"+
		"\u0000\u0000\u0250\u0252\u0003R)\u0000\u0251\u024f\u0001\u0000\u0000\u0000"+
		"\u0252\u0255\u0001\u0000\u0000\u0000\u0253\u0251\u0001\u0000\u0000\u0000"+
		"\u0253\u0254\u0001\u0000\u0000\u0000\u0254\u0257\u0001\u0000\u0000\u0000"+
		"\u0255\u0253\u0001\u0000\u0000\u0000\u0256\u0258\u0005\t\u0000\u0000\u0257"+
		"\u0256\u0001\u0000\u0000\u0000\u0257\u0258\u0001\u0000\u0000\u0000\u0258"+
		"\u025a\u0001\u0000\u0000\u0000\u0259\u024e\u0001\u0000\u0000\u0000\u0259"+
		"\u025a\u0001\u0000\u0000\u0000\u025a\u025b\u0001\u0000\u0000\u0000\u025b"+
		"\u025c\u0005\u0002\u0000\u0000\u025cQ\u0001\u0000\u0000\u0000\u025d\u025e"+
		"\u0005T\u0000\u0000\u025e\u025f\u0005\u0003\u0000\u0000\u025f\u0283\u0007"+
		"\u0000\u0000\u0000\u0260\u0261\u0005U\u0000\u0000\u0261\u0262\u0005\u0003"+
		"\u0000\u0000\u0262\u0283\u0007\u0000\u0000\u0000\u0263\u0264\u0005V\u0000"+
		"\u0000\u0264\u0265\u0005\u0003\u0000\u0000\u0265\u0283\u0005e\u0000\u0000"+
		"\u0266\u0267\u0005;\u0000\u0000\u0267\u0268\u0005\u0003\u0000\u0000\u0268"+
		"\u0283\u0003B!\u0000\u0269\u026a\u0005W\u0000\u0000\u026a\u026b\u0005"+
		"\u0003\u0000\u0000\u026b\u0283\u0007\u0000\u0000\u0000\u026c\u026d\u0005"+
		"X\u0000\u0000\u026d\u026e\u0005\u0003\u0000\u0000\u026e\u0283\u0003T*"+
		"\u0000\u026f\u0270\u0005[\u0000\u0000\u0270\u0271\u0005\u0003\u0000\u0000"+
		"\u0271\u0276\u0005\u0001\u0000\u0000\u0272\u0273\u0005a\u0000\u0000\u0273"+
		"\u0275\u0005\t\u0000\u0000\u0274\u0272\u0001\u0000\u0000\u0000\u0275\u0278"+
		"\u0001\u0000\u0000\u0000\u0276\u0274\u0001\u0000\u0000\u0000\u0276\u0277"+
		"\u0001\u0000\u0000\u0000\u0277\u0279\u0001\u0000\u0000\u0000\u0278\u0276"+
		"\u0001\u0000\u0000\u0000\u0279\u027a\u0005\u0002\u0000\u0000\u027a\u027e"+
		"\u0005\u0006\u0000\u0000\u027b\u027d\u0003X,\u0000\u027c\u027b\u0001\u0000"+
		"\u0000\u0000\u027d\u0280\u0001\u0000\u0000\u0000\u027e\u027c\u0001\u0000"+
		"\u0000\u0000\u027e\u027f\u0001\u0000\u0000\u0000\u027f\u0281\u0001\u0000"+
		"\u0000\u0000\u0280\u027e\u0001\u0000\u0000\u0000\u0281\u0283\u0005\u0007"+
		"\u0000\u0000\u0282\u025d\u0001\u0000\u0000\u0000\u0282\u0260\u0001\u0000"+
		"\u0000\u0000\u0282\u0263\u0001\u0000\u0000\u0000\u0282\u0266\u0001\u0000"+
		"\u0000\u0000\u0282\u0269\u0001\u0000\u0000\u0000\u0282\u026c\u0001\u0000"+
		"\u0000\u0000\u0282\u026f\u0001\u0000\u0000\u0000\u0283S\u0001\u0000\u0000"+
		"\u0000\u0284\u0285\u0005\u001b\u0000\u0000\u0285\u0291\u0005\u0001\u0000"+
		"\u0000\u0286\u028b\u0003V+\u0000\u0287\u0288\u0005\t\u0000\u0000\u0288"+
		"\u028a\u0003V+\u0000\u0289\u0287\u0001\u0000\u0000\u0000\u028a\u028d\u0001"+
		"\u0000\u0000\u0000\u028b\u0289\u0001\u0000\u0000\u0000\u028b\u028c\u0001"+
		"\u0000\u0000\u0000\u028c\u028f\u0001\u0000\u0000\u0000\u028d\u028b\u0001"+
		"\u0000\u0000\u0000\u028e\u0290\u0005\t\u0000\u0000\u028f\u028e\u0001\u0000"+
		"\u0000\u0000\u028f\u0290\u0001\u0000\u0000\u0000\u0290\u0292\u0001\u0000"+
		"\u0000\u0000\u0291\u0286\u0001\u0000\u0000\u0000\u0291\u0292\u0001\u0000"+
		"\u0000\u0000\u0292\u0293\u0001\u0000\u0000\u0000\u0293\u0294\u0005\u0002"+
		"\u0000\u0000\u0294U\u0001\u0000\u0000\u0000\u0295\u0296\u0005Y\u0000\u0000"+
		"\u0296\u0297\u0005\u0003\u0000\u0000\u0297\u029b\u0007\u0006\u0000\u0000"+
		"\u0298\u029b\u0003*\u0015\u0000\u0299\u029b\u0003d2\u0000\u029a\u0295"+
		"\u0001\u0000\u0000\u0000\u029a\u0298\u0001\u0000\u0000\u0000\u029a\u0299"+
		"\u0001\u0000\u0000\u0000\u029bW\u0001\u0000\u0000\u0000\u029c\u02a0\u0003"+
		"Z-\u0000\u029d\u02a0\u0003\\.\u0000\u029e\u02a0\u0003^/\u0000\u029f\u029c"+
		"\u0001\u0000\u0000\u0000\u029f\u029d\u0001\u0000\u0000\u0000\u029f\u029e"+
		"\u0001\u0000\u0000\u0000\u02a0Y\u0001\u0000\u0000\u0000\u02a1\u02a2\u0007"+
		"\b\u0000\u0000\u02a2\u02a3\u0005a\u0000\u0000\u02a3\u02b1\u0005\b\u0000"+
		"\u0000\u02a4\u02a5\u0005&\u0000\u0000\u02a5\u02aa\u0005\u0001\u0000\u0000"+
		"\u02a6\u02a7\u0007\b\u0000\u0000\u02a7\u02a9\u0005\t\u0000\u0000\u02a8"+
		"\u02a6\u0001\u0000\u0000\u0000\u02a9\u02ac\u0001\u0000\u0000\u0000\u02aa"+
		"\u02a8\u0001\u0000\u0000\u0000\u02aa\u02ab\u0001\u0000\u0000\u0000\u02ab"+
		"\u02ad\u0001\u0000\u0000\u0000\u02ac\u02aa\u0001\u0000\u0000\u0000\u02ad"+
		"\u02ae\u0005\u0002\u0000\u0000\u02ae\u02af\u0005a\u0000\u0000\u02af\u02b1"+
		"\u0005\b\u0000\u0000\u02b0\u02a1\u0001\u0000\u0000\u0000\u02b0\u02a4\u0001"+
		"\u0000\u0000\u0000\u02b1[\u0001\u0000\u0000\u0000\u02b2\u02b3\u0005a\u0000"+
		"\u0000\u02b3\u02b4\u0005\n\u0000\u0000\u02b4\u02b5\u0007\u0001\u0000\u0000"+
		"\u02b5\u02b6\u0005\b\u0000\u0000\u02b6]\u0001\u0000\u0000\u0000\u02b7"+
		"\u02b8\u0005!\u0000\u0000\u02b8\u02b9\u0005`\u0000\u0000\u02b9\u02bd\u0005"+
		"\u0006\u0000\u0000\u02ba\u02bc\u0003Z-\u0000\u02bb\u02ba\u0001\u0000\u0000"+
		"\u0000\u02bc\u02bf\u0001\u0000\u0000\u0000\u02bd\u02bb\u0001\u0000\u0000"+
		"\u0000\u02bd\u02be\u0001\u0000\u0000\u0000\u02be\u02c0\u0001\u0000\u0000"+
		"\u0000\u02bf\u02bd\u0001\u0000\u0000\u0000\u02c0\u02c1\u0005%\u0000\u0000"+
		"\u02c1\u02c2\u0005\u0001\u0000\u0000\u02c2\u02c3\u0003\n\u0005\u0000\u02c3"+
		"\u02c4\u0005\u0002\u0000\u0000\u02c4\u02c5\u0005\u0007\u0000\u0000\u02c5"+
		"_\u0001\u0000\u0000\u0000\u02c6\u02c7\u0005-\u0000\u0000\u02c7\u02c8\u0005"+
		"\u0003\u0000\u0000\u02c8\u02c9\u0007\u0003\u0000\u0000\u02c9a\u0001\u0000"+
		"\u0000\u0000\u02ca\u02cb\u0005.\u0000\u0000\u02cb\u02cc\u0005\u0003\u0000"+
		"\u0000\u02cc\u02cd\u0007\u0003\u0000\u0000\u02cdc\u0001\u0000\u0000\u0000"+
		"\u02ce\u02cf\u00058\u0000\u0000\u02cf\u02d0\u0005\u0003\u0000\u0000\u02d0"+
		"\u02d1\u0005e\u0000\u0000\u02d1e\u0001\u0000\u0000\u0000\u02d2\u02d3\u0005"+
		" \u0000\u0000\u02d3\u02d4\u0005\u0003\u0000\u0000\u02d4\u02d5\u0003\n"+
		"\u0005\u0000\u02d5g\u0001\u0000\u0000\u0000\u02d6\u02d7\u0005\u001e\u0000"+
		"\u0000\u02d7\u02d8\u0005\u0003\u0000\u0000\u02d8\u02e4\u0005\u0004\u0000"+
		"\u0000\u02d9\u02de\u0003\n\u0005\u0000\u02da\u02db\u0005\t\u0000\u0000"+
		"\u02db\u02dd\u0003\n\u0005\u0000\u02dc\u02da\u0001\u0000\u0000\u0000\u02dd"+
		"\u02e0\u0001\u0000\u0000\u0000\u02de\u02dc\u0001\u0000\u0000\u0000\u02de"+
		"\u02df\u0001\u0000\u0000\u0000\u02df\u02e2\u0001\u0000\u0000\u0000\u02e0"+
		"\u02de\u0001\u0000\u0000\u0000\u02e1\u02e3\u0005\t\u0000\u0000\u02e2\u02e1"+
		"\u0001\u0000\u0000\u0000\u02e2\u02e3\u0001\u0000\u0000\u0000\u02e3\u02e5"+
		"\u0001\u0000\u0000\u0000\u02e4\u02d9\u0001\u0000\u0000\u0000\u02e4\u02e5"+
		"\u0001\u0000\u0000\u0000\u02e5\u02e6\u0001\u0000\u0000\u0000\u02e6\u02e7"+
		"\u0005\u0005\u0000\u0000\u02e7i\u0001\u0000\u0000\u0000\u02e8\u02e9\u0005"+
		"2\u0000\u0000\u02e9\u02ea\u0005\u0003\u0000\u0000\u02ea\u02eb\u0007\t"+
		"\u0000\u0000\u02ebk\u0001\u0000\u0000\u0000\u02ec\u02ed\u00055\u0000\u0000"+
		"\u02ed\u02ee\u0005\u0003\u0000\u0000\u02ee\u02ef\u0007\n\u0000\u0000\u02ef"+
		"m\u0001\u0000\u0000\u0000\u02f0\u02f1\u0005L\u0000\u0000\u02f1\u02f2\u0005"+
		"\u0003\u0000\u0000\u02f2\u02f7\u0005\u0001\u0000\u0000\u02f3\u02f4\u0005"+
		"a\u0000\u0000\u02f4\u02f6\u0005\t\u0000\u0000\u02f5\u02f3\u0001\u0000"+
		"\u0000\u0000\u02f6\u02f9\u0001\u0000\u0000\u0000\u02f7\u02f5\u0001\u0000"+
		"\u0000\u0000\u02f7\u02f8\u0001\u0000\u0000\u0000\u02f8\u02fa\u0001\u0000"+
		"\u0000\u0000\u02f9\u02f7\u0001\u0000\u0000\u0000\u02fa\u02fb\u0005\u0002"+
		"\u0000\u0000\u02fb\u02ff\u0005\u0006\u0000\u0000\u02fc\u02fe\u0003X,\u0000"+
		"\u02fd\u02fc\u0001\u0000\u0000\u0000\u02fe\u0301\u0001\u0000\u0000\u0000"+
		"\u02ff\u02fd\u0001\u0000\u0000\u0000\u02ff\u0300\u0001\u0000\u0000\u0000"+
		"\u0300\u0302\u0001\u0000\u0000\u0000\u0301\u02ff\u0001\u0000\u0000\u0000"+
		"\u0302\u0303\u0005\u0007\u0000\u0000\u0303o\u0001\u0000\u0000\u0000[s"+
		"w\u0082\u0086\u0088\u0092\u009b\u009f\u00a1\u00ab\u00b9\u00c2\u00c6\u00c8"+
		"\u00d7\u00db\u00dd\u00e4\u00ed\u00f1\u00f3\u0100\u0104\u0106\u010d\u0116"+
		"\u011a\u011c\u012f\u0138\u013c\u013e\u0149\u0156\u015a\u015c\u0162\u016a"+
		"\u0170\u0172\u017d\u0181\u0183\u0197\u01a0\u01a4\u01a6\u01ae\u01b7\u01bb"+
		"\u01bd\u01ca\u01ce\u01d0\u01d8\u01e1\u01e5\u01e7\u01f1\u01f5\u01f7\u01fa"+
		"\u0208\u0210\u0219\u021d\u021f\u022b\u0234\u0238\u023a\u024a\u0253\u0257"+
		"\u0259\u0276\u027e\u0282\u028b\u028f\u0291\u029a\u029f\u02aa\u02b0\u02bd"+
		"\u02de\u02e2\u02e4\u02f7\u02ff";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}