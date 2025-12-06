// Generated from VYPlanguage.g4 by ANTLR 4.7.2
package parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link VYPlanguageParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface VYPlanguageVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link VYPlanguageParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(VYPlanguageParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link VYPlanguageParser#definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinition(VYPlanguageParser.DefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VYPlanguageParser#classDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDefinition(VYPlanguageParser.ClassDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VYPlanguageParser#classMember}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassMember(VYPlanguageParser.ClassMemberContext ctx);
	/**
	 * Visit a parse tree produced by {@link VYPlanguageParser#functionDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDefinition(VYPlanguageParser.FunctionDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VYPlanguageParser#paramList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamList(VYPlanguageParser.ParamListContext ctx);
	/**
	 * Visit a parse tree produced by {@link VYPlanguageParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataType(VYPlanguageParser.DataTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link VYPlanguageParser#returnType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnType(VYPlanguageParser.ReturnTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link VYPlanguageParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(VYPlanguageParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link VYPlanguageParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(VYPlanguageParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VYPlanguageParser#lvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLvalue(VYPlanguageParser.LvalueContext ctx);
	/**
	 * Visit a parse tree produced by {@link VYPlanguageParser#varDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDefinition(VYPlanguageParser.VarDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VYPlanguageParser#varDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDecl(VYPlanguageParser.VarDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AndExpr}
	 * labeled alternative in {@link VYPlanguageParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpr(VYPlanguageParser.AndExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringExpr}
	 * labeled alternative in {@link VYPlanguageParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringExpr(VYPlanguageParser.StringExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdExpr}
	 * labeled alternative in {@link VYPlanguageParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdExpr(VYPlanguageParser.IdExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SuperExpr}
	 * labeled alternative in {@link VYPlanguageParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperExpr(VYPlanguageParser.SuperExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RelExpr}
	 * labeled alternative in {@link VYPlanguageParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelExpr(VYPlanguageParser.RelExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OrExpr}
	 * labeled alternative in {@link VYPlanguageParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExpr(VYPlanguageParser.OrExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MulDivExpr}
	 * labeled alternative in {@link VYPlanguageParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDivExpr(VYPlanguageParser.MulDivExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MethodCallOrField}
	 * labeled alternative in {@link VYPlanguageParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCallOrField(VYPlanguageParser.MethodCallOrFieldContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EqExpr}
	 * labeled alternative in {@link VYPlanguageParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqExpr(VYPlanguageParser.EqExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CastExpr}
	 * labeled alternative in {@link VYPlanguageParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCastExpr(VYPlanguageParser.CastExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NewExpr}
	 * labeled alternative in {@link VYPlanguageParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewExpr(VYPlanguageParser.NewExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunCallExpr}
	 * labeled alternative in {@link VYPlanguageParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunCallExpr(VYPlanguageParser.FunCallExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NotExpr}
	 * labeled alternative in {@link VYPlanguageParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpr(VYPlanguageParser.NotExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IntExpr}
	 * labeled alternative in {@link VYPlanguageParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntExpr(VYPlanguageParser.IntExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParenExpr}
	 * labeled alternative in {@link VYPlanguageParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenExpr(VYPlanguageParser.ParenExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddSubExpr}
	 * labeled alternative in {@link VYPlanguageParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSubExpr(VYPlanguageParser.AddSubExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ThisExpr}
	 * labeled alternative in {@link VYPlanguageParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThisExpr(VYPlanguageParser.ThisExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link VYPlanguageParser#argList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgList(VYPlanguageParser.ArgListContext ctx);
}