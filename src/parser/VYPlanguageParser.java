// Generated from VYPlanguage.g4 by ANTLR 4.13.2
package parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class VYPlanguageParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CLASS=1, ELSE=2, IF=3, INT=4, NEW=5, RETURN=6, STRING=7, SUPER=8, THIS=9, 
		VOID=10, WHILE=11, PLUS=12, MINUS=13, MUL=14, DIV=15, NOT=16, AND=17, 
		OR=18, EQ=19, NEQ=20, LT=21, GT=22, LE=23, GE=24, ASSIGN=25, DOT=26, COMMA=27, 
		SEMI=28, COLON=29, LPAREN=30, RPAREN=31, LBRACE=32, RBRACE=33, ID=34, 
		INT_LITERAL=35, STRING_LITERAL=36, LINE_COMMENT=37, BLOCK_COMMENT=38, 
		WS=39;
	public static final int
		RULE_program = 0, RULE_definition = 1, RULE_classDefinition = 2, RULE_classMember = 3, 
		RULE_functionDefinition = 4, RULE_paramList = 5, RULE_dataType = 6, RULE_returnType = 7, 
		RULE_block = 8, RULE_statement = 9, RULE_lvalue = 10, RULE_varDefinition = 11, 
		RULE_varDecl = 12, RULE_expression = 13, RULE_argList = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "definition", "classDefinition", "classMember", "functionDefinition", 
			"paramList", "dataType", "returnType", "block", "statement", "lvalue", 
			"varDefinition", "varDecl", "expression", "argList"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'class'", "'else'", "'if'", "'int'", "'new'", "'return'", "'string'", 
			"'super'", "'this'", "'void'", "'while'", "'+'", "'-'", "'*'", "'/'", 
			"'!'", "'&&'", "'||'", "'=='", "'!='", "'<'", "'>'", "'<='", "'>='", 
			"'='", "'.'", "','", "';'", "':'", "'('", "')'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CLASS", "ELSE", "IF", "INT", "NEW", "RETURN", "STRING", "SUPER", 
			"THIS", "VOID", "WHILE", "PLUS", "MINUS", "MUL", "DIV", "NOT", "AND", 
			"OR", "EQ", "NEQ", "LT", "GT", "LE", "GE", "ASSIGN", "DOT", "COMMA", 
			"SEMI", "COLON", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "ID", "INT_LITERAL", 
			"STRING_LITERAL", "LINE_COMMENT", "BLOCK_COMMENT", "WS"
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
	public String getGrammarFileName() { return "VYPlanguage.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public VYPlanguageParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(VYPlanguageParser.EOF, 0); }
		public List<DefinitionContext> definition() {
			return getRuleContexts(DefinitionContext.class);
		}
		public DefinitionContext definition(int i) {
			return getRuleContext(DefinitionContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VYPlanguageVisitor ) return ((VYPlanguageVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 17179870354L) != 0)) {
				{
				{
				setState(30);
				definition();
				}
				}
				setState(35);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(36);
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
	public static class DefinitionContext extends ParserRuleContext {
		public ClassDefinitionContext classDefinition() {
			return getRuleContext(ClassDefinitionContext.class,0);
		}
		public FunctionDefinitionContext functionDefinition() {
			return getRuleContext(FunctionDefinitionContext.class,0);
		}
		public DefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VYPlanguageVisitor ) return ((VYPlanguageVisitor<? extends T>)visitor).visitDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefinitionContext definition() throws RecognitionException {
		DefinitionContext _localctx = new DefinitionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_definition);
		try {
			setState(40);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CLASS:
				enterOuterAlt(_localctx, 1);
				{
				setState(38);
				classDefinition();
				}
				break;
			case INT:
			case STRING:
			case VOID:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(39);
				functionDefinition();
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
	public static class ClassDefinitionContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(VYPlanguageParser.CLASS, 0); }
		public List<TerminalNode> ID() { return getTokens(VYPlanguageParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(VYPlanguageParser.ID, i);
		}
		public TerminalNode LBRACE() { return getToken(VYPlanguageParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(VYPlanguageParser.RBRACE, 0); }
		public TerminalNode COLON() { return getToken(VYPlanguageParser.COLON, 0); }
		public List<ClassMemberContext> classMember() {
			return getRuleContexts(ClassMemberContext.class);
		}
		public ClassMemberContext classMember(int i) {
			return getRuleContext(ClassMemberContext.class,i);
		}
		public ClassDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDefinition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VYPlanguageVisitor ) return ((VYPlanguageVisitor<? extends T>)visitor).visitClassDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDefinitionContext classDefinition() throws RecognitionException {
		ClassDefinitionContext _localctx = new ClassDefinitionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_classDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(CLASS);
			setState(43);
			match(ID);
			setState(46);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(44);
				match(COLON);
				setState(45);
				match(ID);
				}
			}

			setState(48);
			match(LBRACE);
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 17179870352L) != 0)) {
				{
				{
				setState(49);
				classMember();
				}
				}
				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(55);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassMemberContext extends ParserRuleContext {
		public VarDefinitionContext varDefinition() {
			return getRuleContext(VarDefinitionContext.class,0);
		}
		public FunctionDefinitionContext functionDefinition() {
			return getRuleContext(FunctionDefinitionContext.class,0);
		}
		public ClassMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classMember; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VYPlanguageVisitor ) return ((VYPlanguageVisitor<? extends T>)visitor).visitClassMember(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassMemberContext classMember() throws RecognitionException {
		ClassMemberContext _localctx = new ClassMemberContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_classMember);
		try {
			setState(59);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(57);
				varDefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(58);
				functionDefinition();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionDefinitionContext extends ParserRuleContext {
		public ReturnTypeContext returnType() {
			return getRuleContext(ReturnTypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(VYPlanguageParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(VYPlanguageParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(VYPlanguageParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode VOID() { return getToken(VYPlanguageParser.VOID, 0); }
		public ParamListContext paramList() {
			return getRuleContext(ParamListContext.class,0);
		}
		public FunctionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDefinition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VYPlanguageVisitor ) return ((VYPlanguageVisitor<? extends T>)visitor).visitFunctionDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDefinitionContext functionDefinition() throws RecognitionException {
		FunctionDefinitionContext _localctx = new FunctionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_functionDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			returnType();
			setState(62);
			match(ID);
			setState(63);
			match(LPAREN);
			setState(66);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VOID:
				{
				setState(64);
				match(VOID);
				}
				break;
			case INT:
			case STRING:
			case ID:
				{
				setState(65);
				paramList();
				}
				break;
			case RPAREN:
				break;
			default:
				break;
			}
			setState(68);
			match(RPAREN);
			setState(69);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParamListContext extends ParserRuleContext {
		public List<DataTypeContext> dataType() {
			return getRuleContexts(DataTypeContext.class);
		}
		public DataTypeContext dataType(int i) {
			return getRuleContext(DataTypeContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(VYPlanguageParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(VYPlanguageParser.ID, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(VYPlanguageParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(VYPlanguageParser.COMMA, i);
		}
		public ParamListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VYPlanguageVisitor ) return ((VYPlanguageVisitor<? extends T>)visitor).visitParamList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamListContext paramList() throws RecognitionException {
		ParamListContext _localctx = new ParamListContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_paramList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			dataType();
			setState(72);
			match(ID);
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(73);
				match(COMMA);
				setState(74);
				dataType();
				setState(75);
				match(ID);
				}
				}
				setState(81);
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
	public static class DataTypeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(VYPlanguageParser.INT, 0); }
		public TerminalNode STRING() { return getToken(VYPlanguageParser.STRING, 0); }
		public TerminalNode ID() { return getToken(VYPlanguageParser.ID, 0); }
		public DataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VYPlanguageVisitor ) return ((VYPlanguageVisitor<? extends T>)visitor).visitDataType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataTypeContext dataType() throws RecognitionException {
		DataTypeContext _localctx = new DataTypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_dataType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 17179869328L) != 0)) ) {
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
	public static class ReturnTypeContext extends ParserRuleContext {
		public TerminalNode VOID() { return getToken(VYPlanguageParser.VOID, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public ReturnTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VYPlanguageVisitor ) return ((VYPlanguageVisitor<? extends T>)visitor).visitReturnType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnTypeContext returnType() throws RecognitionException {
		ReturnTypeContext _localctx = new ReturnTypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_returnType);
		try {
			setState(86);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VOID:
				enterOuterAlt(_localctx, 1);
				{
				setState(84);
				match(VOID);
				}
				break;
			case INT:
			case STRING:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(85);
				dataType();
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
	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(VYPlanguageParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(VYPlanguageParser.RBRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VYPlanguageVisitor ) return ((VYPlanguageVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(LBRACE);
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 121601330168L) != 0)) {
				{
				{
				setState(89);
				statement();
				}
				}
				setState(94);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(95);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public VarDefinitionContext varDefinition() {
			return getRuleContext(VarDefinitionContext.class,0);
		}
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(VYPlanguageParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(VYPlanguageParser.SEMI, 0); }
		public TerminalNode IF() { return getToken(VYPlanguageParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(VYPlanguageParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(VYPlanguageParser.RPAREN, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(VYPlanguageParser.ELSE, 0); }
		public TerminalNode WHILE() { return getToken(VYPlanguageParser.WHILE, 0); }
		public TerminalNode RETURN() { return getToken(VYPlanguageParser.RETURN, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VYPlanguageVisitor ) return ((VYPlanguageVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_statement);
		int _la;
		try {
			setState(127);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(97);
				varDefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(98);
				lvalue();
				setState(99);
				match(ASSIGN);
				setState(100);
				expression(0);
				setState(101);
				match(SEMI);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(103);
				match(IF);
				setState(104);
				match(LPAREN);
				setState(105);
				expression(0);
				setState(106);
				match(RPAREN);
				setState(107);
				block();
				setState(110);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(108);
					match(ELSE);
					setState(109);
					block();
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(112);
				match(WHILE);
				setState(113);
				match(LPAREN);
				setState(114);
				expression(0);
				setState(115);
				match(RPAREN);
				setState(116);
				block();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(118);
				match(RETURN);
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 121332892448L) != 0)) {
					{
					setState(119);
					expression(0);
					}
				}

				setState(122);
				match(SEMI);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(123);
				expression(0);
				setState(124);
				match(SEMI);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(126);
				match(SEMI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LvalueContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(VYPlanguageParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DOT() { return getToken(VYPlanguageParser.DOT, 0); }
		public LvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lvalue; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VYPlanguageVisitor ) return ((VYPlanguageVisitor<? extends T>)visitor).visitLvalue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LvalueContext lvalue() throws RecognitionException {
		LvalueContext _localctx = new LvalueContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_lvalue);
		try {
			setState(134);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(129);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(130);
				expression(0);
				setState(131);
				match(DOT);
				setState(132);
				match(ID);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VarDefinitionContext extends ParserRuleContext {
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public List<VarDeclContext> varDecl() {
			return getRuleContexts(VarDeclContext.class);
		}
		public VarDeclContext varDecl(int i) {
			return getRuleContext(VarDeclContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(VYPlanguageParser.SEMI, 0); }
		public List<TerminalNode> COMMA() { return getTokens(VYPlanguageParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(VYPlanguageParser.COMMA, i);
		}
		public VarDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDefinition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VYPlanguageVisitor ) return ((VYPlanguageVisitor<? extends T>)visitor).visitVarDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDefinitionContext varDefinition() throws RecognitionException {
		VarDefinitionContext _localctx = new VarDefinitionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_varDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			dataType();
			setState(137);
			varDecl();
			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(138);
				match(COMMA);
				setState(139);
				varDecl();
				}
				}
				setState(144);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(145);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VarDeclContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(VYPlanguageParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(VYPlanguageParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VarDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDecl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VYPlanguageVisitor ) return ((VYPlanguageVisitor<? extends T>)visitor).visitVarDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclContext varDecl() throws RecognitionException {
		VarDeclContext _localctx = new VarDeclContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_varDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(ID);
			setState(150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(148);
				match(ASSIGN);
				setState(149);
				expression(0);
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
	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AndExprContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(VYPlanguageParser.AND, 0); }
		public AndExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VYPlanguageVisitor ) return ((VYPlanguageVisitor<? extends T>)visitor).visitAndExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringExprContext extends ExpressionContext {
		public TerminalNode STRING_LITERAL() { return getToken(VYPlanguageParser.STRING_LITERAL, 0); }
		public StringExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VYPlanguageVisitor ) return ((VYPlanguageVisitor<? extends T>)visitor).visitStringExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdExprContext extends ExpressionContext {
		public TerminalNode ID() { return getToken(VYPlanguageParser.ID, 0); }
		public IdExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VYPlanguageVisitor ) return ((VYPlanguageVisitor<? extends T>)visitor).visitIdExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SuperExprContext extends ExpressionContext {
		public TerminalNode SUPER() { return getToken(VYPlanguageParser.SUPER, 0); }
		public SuperExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VYPlanguageVisitor ) return ((VYPlanguageVisitor<? extends T>)visitor).visitSuperExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RelExprContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LT() { return getToken(VYPlanguageParser.LT, 0); }
		public TerminalNode GT() { return getToken(VYPlanguageParser.GT, 0); }
		public TerminalNode LE() { return getToken(VYPlanguageParser.LE, 0); }
		public TerminalNode GE() { return getToken(VYPlanguageParser.GE, 0); }
		public RelExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VYPlanguageVisitor ) return ((VYPlanguageVisitor<? extends T>)visitor).visitRelExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OrExprContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode OR() { return getToken(VYPlanguageParser.OR, 0); }
		public OrExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VYPlanguageVisitor ) return ((VYPlanguageVisitor<? extends T>)visitor).visitOrExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MulDivExprContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MUL() { return getToken(VYPlanguageParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(VYPlanguageParser.DIV, 0); }
		public MulDivExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VYPlanguageVisitor ) return ((VYPlanguageVisitor<? extends T>)visitor).visitMulDivExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MethodCallOrFieldContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DOT() { return getToken(VYPlanguageParser.DOT, 0); }
		public TerminalNode ID() { return getToken(VYPlanguageParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(VYPlanguageParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(VYPlanguageParser.RPAREN, 0); }
		public ArgListContext argList() {
			return getRuleContext(ArgListContext.class,0);
		}
		public MethodCallOrFieldContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VYPlanguageVisitor ) return ((VYPlanguageVisitor<? extends T>)visitor).visitMethodCallOrField(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EqExprContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode EQ() { return getToken(VYPlanguageParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(VYPlanguageParser.NEQ, 0); }
		public EqExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VYPlanguageVisitor ) return ((VYPlanguageVisitor<? extends T>)visitor).visitEqExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CastExprContext extends ExpressionContext {
		public TerminalNode LPAREN() { return getToken(VYPlanguageParser.LPAREN, 0); }
		public ReturnTypeContext returnType() {
			return getRuleContext(ReturnTypeContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(VYPlanguageParser.RPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CastExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VYPlanguageVisitor ) return ((VYPlanguageVisitor<? extends T>)visitor).visitCastExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NewExprContext extends ExpressionContext {
		public TerminalNode NEW() { return getToken(VYPlanguageParser.NEW, 0); }
		public TerminalNode ID() { return getToken(VYPlanguageParser.ID, 0); }
		public NewExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VYPlanguageVisitor ) return ((VYPlanguageVisitor<? extends T>)visitor).visitNewExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunCallExprContext extends ExpressionContext {
		public TerminalNode ID() { return getToken(VYPlanguageParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(VYPlanguageParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(VYPlanguageParser.RPAREN, 0); }
		public ArgListContext argList() {
			return getRuleContext(ArgListContext.class,0);
		}
		public FunCallExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VYPlanguageVisitor ) return ((VYPlanguageVisitor<? extends T>)visitor).visitFunCallExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NotExprContext extends ExpressionContext {
		public TerminalNode NOT() { return getToken(VYPlanguageParser.NOT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NotExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VYPlanguageVisitor ) return ((VYPlanguageVisitor<? extends T>)visitor).visitNotExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntExprContext extends ExpressionContext {
		public TerminalNode INT_LITERAL() { return getToken(VYPlanguageParser.INT_LITERAL, 0); }
		public IntExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VYPlanguageVisitor ) return ((VYPlanguageVisitor<? extends T>)visitor).visitIntExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParenExprContext extends ExpressionContext {
		public TerminalNode LPAREN() { return getToken(VYPlanguageParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(VYPlanguageParser.RPAREN, 0); }
		public ParenExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VYPlanguageVisitor ) return ((VYPlanguageVisitor<? extends T>)visitor).visitParenExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AddSubExprContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(VYPlanguageParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(VYPlanguageParser.MINUS, 0); }
		public AddSubExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VYPlanguageVisitor ) return ((VYPlanguageVisitor<? extends T>)visitor).visitAddSubExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ThisExprContext extends ExpressionContext {
		public TerminalNode THIS() { return getToken(VYPlanguageParser.THIS, 0); }
		public ThisExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VYPlanguageVisitor ) return ((VYPlanguageVisitor<? extends T>)visitor).visitThisExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				_localctx = new CastExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(153);
				match(LPAREN);
				setState(154);
				returnType();
				setState(155);
				match(RPAREN);
				setState(156);
				expression(17);
				}
				break;
			case 2:
				{
				_localctx = new NewExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(158);
				match(NEW);
				setState(159);
				match(ID);
				}
				break;
			case 3:
				{
				_localctx = new NotExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(160);
				match(NOT);
				setState(161);
				expression(15);
				}
				break;
			case 4:
				{
				_localctx = new FunCallExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(162);
				match(ID);
				setState(163);
				match(LPAREN);
				setState(165);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 121332892448L) != 0)) {
					{
					setState(164);
					argList();
					}
				}

				setState(167);
				match(RPAREN);
				}
				break;
			case 5:
				{
				_localctx = new IdExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(168);
				match(ID);
				}
				break;
			case 6:
				{
				_localctx = new IntExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(169);
				match(INT_LITERAL);
				}
				break;
			case 7:
				{
				_localctx = new StringExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(170);
				match(STRING_LITERAL);
				}
				break;
			case 8:
				{
				_localctx = new ThisExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(171);
				match(THIS);
				}
				break;
			case 9:
				{
				_localctx = new SuperExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(172);
				match(SUPER);
				}
				break;
			case 10:
				{
				_localctx = new ParenExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(173);
				match(LPAREN);
				setState(174);
				expression(0);
				setState(175);
				match(RPAREN);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(209);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(207);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(179);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(180);
						_la = _input.LA(1);
						if ( !(_la==MUL || _la==DIV) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(181);
						expression(15);
						}
						break;
					case 2:
						{
						_localctx = new AddSubExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(182);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(183);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(184);
						expression(14);
						}
						break;
					case 3:
						{
						_localctx = new RelExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(185);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(186);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 31457280L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(187);
						expression(13);
						}
						break;
					case 4:
						{
						_localctx = new EqExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(188);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(189);
						_la = _input.LA(1);
						if ( !(_la==EQ || _la==NEQ) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(190);
						expression(12);
						}
						break;
					case 5:
						{
						_localctx = new AndExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(191);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(192);
						match(AND);
						setState(193);
						expression(11);
						}
						break;
					case 6:
						{
						_localctx = new OrExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(194);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(195);
						match(OR);
						setState(196);
						expression(10);
						}
						break;
					case 7:
						{
						_localctx = new MethodCallOrFieldContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(197);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(198);
						match(DOT);
						setState(199);
						match(ID);
						setState(205);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
						case 1:
							{
							setState(200);
							match(LPAREN);
							setState(202);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 121332892448L) != 0)) {
								{
								setState(201);
								argList();
								}
							}

							setState(204);
							match(RPAREN);
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(211);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArgListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(VYPlanguageParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(VYPlanguageParser.COMMA, i);
		}
		public ArgListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VYPlanguageVisitor ) return ((VYPlanguageVisitor<? extends T>)visitor).visitArgList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgListContext argList() throws RecognitionException {
		ArgListContext _localctx = new ArgListContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_argList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			expression(0);
			setState(217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(213);
				match(COMMA);
				setState(214);
				expression(0);
				}
				}
				setState(219);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 13:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 14);
		case 1:
			return precpred(_ctx, 13);
		case 2:
			return precpred(_ctx, 12);
		case 3:
			return precpred(_ctx, 11);
		case 4:
			return precpred(_ctx, 10);
		case 5:
			return precpred(_ctx, 9);
		case 6:
			return precpred(_ctx, 8);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\'\u00dd\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001\u0000\u0005\u0000"+
		" \b\u0000\n\u0000\f\u0000#\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0003\u0001)\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002/\b\u0002\u0001\u0002\u0001\u0002\u0005\u0002"+
		"3\b\u0002\n\u0002\f\u00026\t\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0003\u0003<\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0003\u0004C\b\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0005\u0005N\b\u0005\n\u0005\f\u0005Q\t\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0003\u0007W\b\u0007\u0001\b\u0001"+
		"\b\u0005\b[\b\b\n\b\f\b^\t\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0003\to\b\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0003\ty\b\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003"+
		"\t\u0080\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u0087\b\n"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u008d\b\u000b"+
		"\n\u000b\f\u000b\u0090\t\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f"+
		"\u0001\f\u0003\f\u0097\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u00a6"+
		"\b\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0003\r\u00b2\b\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003"+
		"\r\u00cb\b\r\u0001\r\u0003\r\u00ce\b\r\u0005\r\u00d0\b\r\n\r\f\r\u00d3"+
		"\t\r\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u00d8\b\u000e\n\u000e"+
		"\f\u000e\u00db\t\u000e\u0001\u000e\u0000\u0001\u001a\u000f\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u0000"+
		"\u0005\u0003\u0000\u0004\u0004\u0007\u0007\"\"\u0001\u0000\u000e\u000f"+
		"\u0001\u0000\f\r\u0001\u0000\u0015\u0018\u0001\u0000\u0013\u0014\u00f6"+
		"\u0000!\u0001\u0000\u0000\u0000\u0002(\u0001\u0000\u0000\u0000\u0004*"+
		"\u0001\u0000\u0000\u0000\u0006;\u0001\u0000\u0000\u0000\b=\u0001\u0000"+
		"\u0000\u0000\nG\u0001\u0000\u0000\u0000\fR\u0001\u0000\u0000\u0000\u000e"+
		"V\u0001\u0000\u0000\u0000\u0010X\u0001\u0000\u0000\u0000\u0012\u007f\u0001"+
		"\u0000\u0000\u0000\u0014\u0086\u0001\u0000\u0000\u0000\u0016\u0088\u0001"+
		"\u0000\u0000\u0000\u0018\u0093\u0001\u0000\u0000\u0000\u001a\u00b1\u0001"+
		"\u0000\u0000\u0000\u001c\u00d4\u0001\u0000\u0000\u0000\u001e \u0003\u0002"+
		"\u0001\u0000\u001f\u001e\u0001\u0000\u0000\u0000 #\u0001\u0000\u0000\u0000"+
		"!\u001f\u0001\u0000\u0000\u0000!\"\u0001\u0000\u0000\u0000\"$\u0001\u0000"+
		"\u0000\u0000#!\u0001\u0000\u0000\u0000$%\u0005\u0000\u0000\u0001%\u0001"+
		"\u0001\u0000\u0000\u0000&)\u0003\u0004\u0002\u0000\')\u0003\b\u0004\u0000"+
		"(&\u0001\u0000\u0000\u0000(\'\u0001\u0000\u0000\u0000)\u0003\u0001\u0000"+
		"\u0000\u0000*+\u0005\u0001\u0000\u0000+.\u0005\"\u0000\u0000,-\u0005\u001d"+
		"\u0000\u0000-/\u0005\"\u0000\u0000.,\u0001\u0000\u0000\u0000./\u0001\u0000"+
		"\u0000\u0000/0\u0001\u0000\u0000\u000004\u0005 \u0000\u000013\u0003\u0006"+
		"\u0003\u000021\u0001\u0000\u0000\u000036\u0001\u0000\u0000\u000042\u0001"+
		"\u0000\u0000\u000045\u0001\u0000\u0000\u000057\u0001\u0000\u0000\u0000"+
		"64\u0001\u0000\u0000\u000078\u0005!\u0000\u00008\u0005\u0001\u0000\u0000"+
		"\u00009<\u0003\u0016\u000b\u0000:<\u0003\b\u0004\u0000;9\u0001\u0000\u0000"+
		"\u0000;:\u0001\u0000\u0000\u0000<\u0007\u0001\u0000\u0000\u0000=>\u0003"+
		"\u000e\u0007\u0000>?\u0005\"\u0000\u0000?B\u0005\u001e\u0000\u0000@C\u0005"+
		"\n\u0000\u0000AC\u0003\n\u0005\u0000B@\u0001\u0000\u0000\u0000BA\u0001"+
		"\u0000\u0000\u0000BC\u0001\u0000\u0000\u0000CD\u0001\u0000\u0000\u0000"+
		"DE\u0005\u001f\u0000\u0000EF\u0003\u0010\b\u0000F\t\u0001\u0000\u0000"+
		"\u0000GH\u0003\f\u0006\u0000HO\u0005\"\u0000\u0000IJ\u0005\u001b\u0000"+
		"\u0000JK\u0003\f\u0006\u0000KL\u0005\"\u0000\u0000LN\u0001\u0000\u0000"+
		"\u0000MI\u0001\u0000\u0000\u0000NQ\u0001\u0000\u0000\u0000OM\u0001\u0000"+
		"\u0000\u0000OP\u0001\u0000\u0000\u0000P\u000b\u0001\u0000\u0000\u0000"+
		"QO\u0001\u0000\u0000\u0000RS\u0007\u0000\u0000\u0000S\r\u0001\u0000\u0000"+
		"\u0000TW\u0005\n\u0000\u0000UW\u0003\f\u0006\u0000VT\u0001\u0000\u0000"+
		"\u0000VU\u0001\u0000\u0000\u0000W\u000f\u0001\u0000\u0000\u0000X\\\u0005"+
		" \u0000\u0000Y[\u0003\u0012\t\u0000ZY\u0001\u0000\u0000\u0000[^\u0001"+
		"\u0000\u0000\u0000\\Z\u0001\u0000\u0000\u0000\\]\u0001\u0000\u0000\u0000"+
		"]_\u0001\u0000\u0000\u0000^\\\u0001\u0000\u0000\u0000_`\u0005!\u0000\u0000"+
		"`\u0011\u0001\u0000\u0000\u0000a\u0080\u0003\u0016\u000b\u0000bc\u0003"+
		"\u0014\n\u0000cd\u0005\u0019\u0000\u0000de\u0003\u001a\r\u0000ef\u0005"+
		"\u001c\u0000\u0000f\u0080\u0001\u0000\u0000\u0000gh\u0005\u0003\u0000"+
		"\u0000hi\u0005\u001e\u0000\u0000ij\u0003\u001a\r\u0000jk\u0005\u001f\u0000"+
		"\u0000kn\u0003\u0010\b\u0000lm\u0005\u0002\u0000\u0000mo\u0003\u0010\b"+
		"\u0000nl\u0001\u0000\u0000\u0000no\u0001\u0000\u0000\u0000o\u0080\u0001"+
		"\u0000\u0000\u0000pq\u0005\u000b\u0000\u0000qr\u0005\u001e\u0000\u0000"+
		"rs\u0003\u001a\r\u0000st\u0005\u001f\u0000\u0000tu\u0003\u0010\b\u0000"+
		"u\u0080\u0001\u0000\u0000\u0000vx\u0005\u0006\u0000\u0000wy\u0003\u001a"+
		"\r\u0000xw\u0001\u0000\u0000\u0000xy\u0001\u0000\u0000\u0000yz\u0001\u0000"+
		"\u0000\u0000z\u0080\u0005\u001c\u0000\u0000{|\u0003\u001a\r\u0000|}\u0005"+
		"\u001c\u0000\u0000}\u0080\u0001\u0000\u0000\u0000~\u0080\u0005\u001c\u0000"+
		"\u0000\u007fa\u0001\u0000\u0000\u0000\u007fb\u0001\u0000\u0000\u0000\u007f"+
		"g\u0001\u0000\u0000\u0000\u007fp\u0001\u0000\u0000\u0000\u007fv\u0001"+
		"\u0000\u0000\u0000\u007f{\u0001\u0000\u0000\u0000\u007f~\u0001\u0000\u0000"+
		"\u0000\u0080\u0013\u0001\u0000\u0000\u0000\u0081\u0087\u0005\"\u0000\u0000"+
		"\u0082\u0083\u0003\u001a\r\u0000\u0083\u0084\u0005\u001a\u0000\u0000\u0084"+
		"\u0085\u0005\"\u0000\u0000\u0085\u0087\u0001\u0000\u0000\u0000\u0086\u0081"+
		"\u0001\u0000\u0000\u0000\u0086\u0082\u0001\u0000\u0000\u0000\u0087\u0015"+
		"\u0001\u0000\u0000\u0000\u0088\u0089\u0003\f\u0006\u0000\u0089\u008e\u0003"+
		"\u0018\f\u0000\u008a\u008b\u0005\u001b\u0000\u0000\u008b\u008d\u0003\u0018"+
		"\f\u0000\u008c\u008a\u0001\u0000\u0000\u0000\u008d\u0090\u0001\u0000\u0000"+
		"\u0000\u008e\u008c\u0001\u0000\u0000\u0000\u008e\u008f\u0001\u0000\u0000"+
		"\u0000\u008f\u0091\u0001\u0000\u0000\u0000\u0090\u008e\u0001\u0000\u0000"+
		"\u0000\u0091\u0092\u0005\u001c\u0000\u0000\u0092\u0017\u0001\u0000\u0000"+
		"\u0000\u0093\u0096\u0005\"\u0000\u0000\u0094\u0095\u0005\u0019\u0000\u0000"+
		"\u0095\u0097\u0003\u001a\r\u0000\u0096\u0094\u0001\u0000\u0000\u0000\u0096"+
		"\u0097\u0001\u0000\u0000\u0000\u0097\u0019\u0001\u0000\u0000\u0000\u0098"+
		"\u0099\u0006\r\uffff\uffff\u0000\u0099\u009a\u0005\u001e\u0000\u0000\u009a"+
		"\u009b\u0003\u000e\u0007\u0000\u009b\u009c\u0005\u001f\u0000\u0000\u009c"+
		"\u009d\u0003\u001a\r\u0011\u009d\u00b2\u0001\u0000\u0000\u0000\u009e\u009f"+
		"\u0005\u0005\u0000\u0000\u009f\u00b2\u0005\"\u0000\u0000\u00a0\u00a1\u0005"+
		"\u0010\u0000\u0000\u00a1\u00b2\u0003\u001a\r\u000f\u00a2\u00a3\u0005\""+
		"\u0000\u0000\u00a3\u00a5\u0005\u001e\u0000\u0000\u00a4\u00a6\u0003\u001c"+
		"\u000e\u0000\u00a5\u00a4\u0001\u0000\u0000\u0000\u00a5\u00a6\u0001\u0000"+
		"\u0000\u0000\u00a6\u00a7\u0001\u0000\u0000\u0000\u00a7\u00b2\u0005\u001f"+
		"\u0000\u0000\u00a8\u00b2\u0005\"\u0000\u0000\u00a9\u00b2\u0005#\u0000"+
		"\u0000\u00aa\u00b2\u0005$\u0000\u0000\u00ab\u00b2\u0005\t\u0000\u0000"+
		"\u00ac\u00b2\u0005\b\u0000\u0000\u00ad\u00ae\u0005\u001e\u0000\u0000\u00ae"+
		"\u00af\u0003\u001a\r\u0000\u00af\u00b0\u0005\u001f\u0000\u0000\u00b0\u00b2"+
		"\u0001\u0000\u0000\u0000\u00b1\u0098\u0001\u0000\u0000\u0000\u00b1\u009e"+
		"\u0001\u0000\u0000\u0000\u00b1\u00a0\u0001\u0000\u0000\u0000\u00b1\u00a2"+
		"\u0001\u0000\u0000\u0000\u00b1\u00a8\u0001\u0000\u0000\u0000\u00b1\u00a9"+
		"\u0001\u0000\u0000\u0000\u00b1\u00aa\u0001\u0000\u0000\u0000\u00b1\u00ab"+
		"\u0001\u0000\u0000\u0000\u00b1\u00ac\u0001\u0000\u0000\u0000\u00b1\u00ad"+
		"\u0001\u0000\u0000\u0000\u00b2\u00d1\u0001\u0000\u0000\u0000\u00b3\u00b4"+
		"\n\u000e\u0000\u0000\u00b4\u00b5\u0007\u0001\u0000\u0000\u00b5\u00d0\u0003"+
		"\u001a\r\u000f\u00b6\u00b7\n\r\u0000\u0000\u00b7\u00b8\u0007\u0002\u0000"+
		"\u0000\u00b8\u00d0\u0003\u001a\r\u000e\u00b9\u00ba\n\f\u0000\u0000\u00ba"+
		"\u00bb\u0007\u0003\u0000\u0000\u00bb\u00d0\u0003\u001a\r\r\u00bc\u00bd"+
		"\n\u000b\u0000\u0000\u00bd\u00be\u0007\u0004\u0000\u0000\u00be\u00d0\u0003"+
		"\u001a\r\f\u00bf\u00c0\n\n\u0000\u0000\u00c0\u00c1\u0005\u0011\u0000\u0000"+
		"\u00c1\u00d0\u0003\u001a\r\u000b\u00c2\u00c3\n\t\u0000\u0000\u00c3\u00c4"+
		"\u0005\u0012\u0000\u0000\u00c4\u00d0\u0003\u001a\r\n\u00c5\u00c6\n\b\u0000"+
		"\u0000\u00c6\u00c7\u0005\u001a\u0000\u0000\u00c7\u00cd\u0005\"\u0000\u0000"+
		"\u00c8\u00ca\u0005\u001e\u0000\u0000\u00c9\u00cb\u0003\u001c\u000e\u0000"+
		"\u00ca\u00c9\u0001\u0000\u0000\u0000\u00ca\u00cb\u0001\u0000\u0000\u0000"+
		"\u00cb\u00cc\u0001\u0000\u0000\u0000\u00cc\u00ce\u0005\u001f\u0000\u0000"+
		"\u00cd\u00c8\u0001\u0000\u0000\u0000\u00cd\u00ce\u0001\u0000\u0000\u0000"+
		"\u00ce\u00d0\u0001\u0000\u0000\u0000\u00cf\u00b3\u0001\u0000\u0000\u0000"+
		"\u00cf\u00b6\u0001\u0000\u0000\u0000\u00cf\u00b9\u0001\u0000\u0000\u0000"+
		"\u00cf\u00bc\u0001\u0000\u0000\u0000\u00cf\u00bf\u0001\u0000\u0000\u0000"+
		"\u00cf\u00c2\u0001\u0000\u0000\u0000\u00cf\u00c5\u0001\u0000\u0000\u0000"+
		"\u00d0\u00d3\u0001\u0000\u0000\u0000\u00d1\u00cf\u0001\u0000\u0000\u0000"+
		"\u00d1\u00d2\u0001\u0000\u0000\u0000\u00d2\u001b\u0001\u0000\u0000\u0000"+
		"\u00d3\u00d1\u0001\u0000\u0000\u0000\u00d4\u00d9\u0003\u001a\r\u0000\u00d5"+
		"\u00d6\u0005\u001b\u0000\u0000\u00d6\u00d8\u0003\u001a\r\u0000\u00d7\u00d5"+
		"\u0001\u0000\u0000\u0000\u00d8\u00db\u0001\u0000\u0000\u0000\u00d9\u00d7"+
		"\u0001\u0000\u0000\u0000\u00d9\u00da\u0001\u0000\u0000\u0000\u00da\u001d"+
		"\u0001\u0000\u0000\u0000\u00db\u00d9\u0001\u0000\u0000\u0000\u0016!(."+
		"4;BOV\\nx\u007f\u0086\u008e\u0096\u00a5\u00b1\u00ca\u00cd\u00cf\u00d1"+
		"\u00d9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}