// Generated from /home/eyobed/Documents/School/BUT/Semester 1/VYPa/Project/vyp_project/grammar/VYPlanguage.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link VYPlanguageParser}.
 */
public interface VYPlanguageListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link VYPlanguageParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(VYPlanguageParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link VYPlanguageParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(VYPlanguageParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link VYPlanguageParser#definition}.
	 * @param ctx the parse tree
	 */
	void enterDefinition(VYPlanguageParser.DefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VYPlanguageParser#definition}.
	 * @param ctx the parse tree
	 */
	void exitDefinition(VYPlanguageParser.DefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VYPlanguageParser#classDefinition}.
	 * @param ctx the parse tree
	 */
	void enterClassDefinition(VYPlanguageParser.ClassDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VYPlanguageParser#classDefinition}.
	 * @param ctx the parse tree
	 */
	void exitClassDefinition(VYPlanguageParser.ClassDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VYPlanguageParser#classMember}.
	 * @param ctx the parse tree
	 */
	void enterClassMember(VYPlanguageParser.ClassMemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link VYPlanguageParser#classMember}.
	 * @param ctx the parse tree
	 */
	void exitClassMember(VYPlanguageParser.ClassMemberContext ctx);
	/**
	 * Enter a parse tree produced by {@link VYPlanguageParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefinition(VYPlanguageParser.FunctionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VYPlanguageParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefinition(VYPlanguageParser.FunctionDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VYPlanguageParser#paramList}.
	 * @param ctx the parse tree
	 */
	void enterParamList(VYPlanguageParser.ParamListContext ctx);
	/**
	 * Exit a parse tree produced by {@link VYPlanguageParser#paramList}.
	 * @param ctx the parse tree
	 */
	void exitParamList(VYPlanguageParser.ParamListContext ctx);
	/**
	 * Enter a parse tree produced by {@link VYPlanguageParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterDataType(VYPlanguageParser.DataTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link VYPlanguageParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitDataType(VYPlanguageParser.DataTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link VYPlanguageParser#returnType}.
	 * @param ctx the parse tree
	 */
	void enterReturnType(VYPlanguageParser.ReturnTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link VYPlanguageParser#returnType}.
	 * @param ctx the parse tree
	 */
	void exitReturnType(VYPlanguageParser.ReturnTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link VYPlanguageParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(VYPlanguageParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link VYPlanguageParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(VYPlanguageParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link VYPlanguageParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(VYPlanguageParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VYPlanguageParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(VYPlanguageParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VYPlanguageParser#lvalue}.
	 * @param ctx the parse tree
	 */
	void enterLvalue(VYPlanguageParser.LvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link VYPlanguageParser#lvalue}.
	 * @param ctx the parse tree
	 */
	void exitLvalue(VYPlanguageParser.LvalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link VYPlanguageParser#varDefinition}.
	 * @param ctx the parse tree
	 */
	void enterVarDefinition(VYPlanguageParser.VarDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VYPlanguageParser#varDefinition}.
	 * @param ctx the parse tree
	 */
	void exitVarDefinition(VYPlanguageParser.VarDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VYPlanguageParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void enterVarDecl(VYPlanguageParser.VarDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link VYPlanguageParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void exitVarDecl(VYPlanguageParser.VarDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AndExpr}
	 * labeled alternative in {@link VYPlanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpr(VYPlanguageParser.AndExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AndExpr}
	 * labeled alternative in {@link VYPlanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpr(VYPlanguageParser.AndExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringExpr}
	 * labeled alternative in {@link VYPlanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterStringExpr(VYPlanguageParser.StringExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringExpr}
	 * labeled alternative in {@link VYPlanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitStringExpr(VYPlanguageParser.StringExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdExpr}
	 * labeled alternative in {@link VYPlanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIdExpr(VYPlanguageParser.IdExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdExpr}
	 * labeled alternative in {@link VYPlanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIdExpr(VYPlanguageParser.IdExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SuperExpr}
	 * labeled alternative in {@link VYPlanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSuperExpr(VYPlanguageParser.SuperExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SuperExpr}
	 * labeled alternative in {@link VYPlanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSuperExpr(VYPlanguageParser.SuperExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RelExpr}
	 * labeled alternative in {@link VYPlanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterRelExpr(VYPlanguageParser.RelExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RelExpr}
	 * labeled alternative in {@link VYPlanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitRelExpr(VYPlanguageParser.RelExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OrExpr}
	 * labeled alternative in {@link VYPlanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterOrExpr(VYPlanguageParser.OrExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OrExpr}
	 * labeled alternative in {@link VYPlanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitOrExpr(VYPlanguageParser.OrExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulDivExpr}
	 * labeled alternative in {@link VYPlanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMulDivExpr(VYPlanguageParser.MulDivExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulDivExpr}
	 * labeled alternative in {@link VYPlanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMulDivExpr(VYPlanguageParser.MulDivExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MethodCallOrField}
	 * labeled alternative in {@link VYPlanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMethodCallOrField(VYPlanguageParser.MethodCallOrFieldContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MethodCallOrField}
	 * labeled alternative in {@link VYPlanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMethodCallOrField(VYPlanguageParser.MethodCallOrFieldContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EqExpr}
	 * labeled alternative in {@link VYPlanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEqExpr(VYPlanguageParser.EqExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EqExpr}
	 * labeled alternative in {@link VYPlanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEqExpr(VYPlanguageParser.EqExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CastExpr}
	 * labeled alternative in {@link VYPlanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterCastExpr(VYPlanguageParser.CastExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CastExpr}
	 * labeled alternative in {@link VYPlanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitCastExpr(VYPlanguageParser.CastExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NewExpr}
	 * labeled alternative in {@link VYPlanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNewExpr(VYPlanguageParser.NewExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NewExpr}
	 * labeled alternative in {@link VYPlanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNewExpr(VYPlanguageParser.NewExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunCallExpr}
	 * labeled alternative in {@link VYPlanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFunCallExpr(VYPlanguageParser.FunCallExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunCallExpr}
	 * labeled alternative in {@link VYPlanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFunCallExpr(VYPlanguageParser.FunCallExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotExpr}
	 * labeled alternative in {@link VYPlanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNotExpr(VYPlanguageParser.NotExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotExpr}
	 * labeled alternative in {@link VYPlanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNotExpr(VYPlanguageParser.NotExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IntExpr}
	 * labeled alternative in {@link VYPlanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIntExpr(VYPlanguageParser.IntExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntExpr}
	 * labeled alternative in {@link VYPlanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIntExpr(VYPlanguageParser.IntExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenExpr}
	 * labeled alternative in {@link VYPlanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParenExpr(VYPlanguageParser.ParenExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenExpr}
	 * labeled alternative in {@link VYPlanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParenExpr(VYPlanguageParser.ParenExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSubExpr}
	 * labeled alternative in {@link VYPlanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAddSubExpr(VYPlanguageParser.AddSubExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSubExpr}
	 * labeled alternative in {@link VYPlanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAddSubExpr(VYPlanguageParser.AddSubExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ThisExpr}
	 * labeled alternative in {@link VYPlanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterThisExpr(VYPlanguageParser.ThisExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ThisExpr}
	 * labeled alternative in {@link VYPlanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitThisExpr(VYPlanguageParser.ThisExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link VYPlanguageParser#argList}.
	 * @param ctx the parse tree
	 */
	void enterArgList(VYPlanguageParser.ArgListContext ctx);
	/**
	 * Exit a parse tree produced by {@link VYPlanguageParser#argList}.
	 * @param ctx the parse tree
	 */
	void exitArgList(VYPlanguageParser.ArgListContext ctx);
}