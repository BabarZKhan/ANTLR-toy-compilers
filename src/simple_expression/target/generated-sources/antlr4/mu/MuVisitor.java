// Generated from mu\Mu.g4 by ANTLR 4.3
package mu;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MuParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MuVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code booleanAtom}
	 * labeled alternative in {@link MuParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanAtom(@NotNull MuParser.BooleanAtomContext ctx);

	/**
	 * Visit a parse tree produced by the {@code idAtom}
	 * labeled alternative in {@link MuParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdAtom(@NotNull MuParser.IdAtomContext ctx);

	/**
	 * Visit a parse tree produced by {@link MuParser#log}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLog(@NotNull MuParser.LogContext ctx);

	/**
	 * Visit a parse tree produced by {@link MuParser#condition_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition_block(@NotNull MuParser.Condition_blockContext ctx);

	/**
	 * Visit a parse tree produced by the {@code atomExpr}
	 * labeled alternative in {@link MuParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomExpr(@NotNull MuParser.AtomExprContext ctx);

	/**
	 * Visit a parse tree produced by the {@code additiveExpr}
	 * labeled alternative in {@link MuParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpr(@NotNull MuParser.AdditiveExprContext ctx);

	/**
	 * Visit a parse tree produced by the {@code parExpr}
	 * labeled alternative in {@link MuParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParExpr(@NotNull MuParser.ParExprContext ctx);

	/**
	 * Visit a parse tree produced by the {@code unaryMinusExpr}
	 * labeled alternative in {@link MuParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryMinusExpr(@NotNull MuParser.UnaryMinusExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link MuParser#while_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_stat(@NotNull MuParser.While_statContext ctx);

	/**
	 * Visit a parse tree produced by {@link MuParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(@NotNull MuParser.BlockContext ctx);

	/**
	 * Visit a parse tree produced by {@link MuParser#if_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stat(@NotNull MuParser.If_statContext ctx);

	/**
	 * Visit a parse tree produced by {@link MuParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(@NotNull MuParser.StatContext ctx);

	/**
	 * Visit a parse tree produced by {@link MuParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(@NotNull MuParser.AssignmentContext ctx);

	/**
	 * Visit a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link MuParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExpr(@NotNull MuParser.OrExprContext ctx);

	/**
	 * Visit a parse tree produced by the {@code nilAtom}
	 * labeled alternative in {@link MuParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNilAtom(@NotNull MuParser.NilAtomContext ctx);

	/**
	 * Visit a parse tree produced by {@link MuParser#parse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParse(@NotNull MuParser.ParseContext ctx);

	/**
	 * Visit a parse tree produced by the {@code relationalExpr}
	 * labeled alternative in {@link MuParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpr(@NotNull MuParser.RelationalExprContext ctx);

	/**
	 * Visit a parse tree produced by the {@code numberAtom}
	 * labeled alternative in {@link MuParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberAtom(@NotNull MuParser.NumberAtomContext ctx);

	/**
	 * Visit a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link MuParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpr(@NotNull MuParser.NotExprContext ctx);

	/**
	 * Visit a parse tree produced by the {@code stringAtom}
	 * labeled alternative in {@link MuParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringAtom(@NotNull MuParser.StringAtomContext ctx);

	/**
	 * Visit a parse tree produced by the {@code multiplicationExpr}
	 * labeled alternative in {@link MuParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicationExpr(@NotNull MuParser.MultiplicationExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link MuParser#stat_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat_block(@NotNull MuParser.Stat_blockContext ctx);

	/**
	 * Visit a parse tree produced by the {@code powExpr}
	 * labeled alternative in {@link MuParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPowExpr(@NotNull MuParser.PowExprContext ctx);

	/**
	 * Visit a parse tree produced by the {@code equalityExpr}
	 * labeled alternative in {@link MuParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpr(@NotNull MuParser.EqualityExprContext ctx);

	/**
	 * Visit a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link MuParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpr(@NotNull MuParser.AndExprContext ctx);
}