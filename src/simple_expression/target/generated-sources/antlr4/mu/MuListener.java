// Generated from mu\Mu.g4 by ANTLR 4.3
package mu;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MuParser}.
 */
public interface MuListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code booleanAtom}
	 * labeled alternative in {@link MuParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterBooleanAtom(@NotNull MuParser.BooleanAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanAtom}
	 * labeled alternative in {@link MuParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitBooleanAtom(@NotNull MuParser.BooleanAtomContext ctx);

	/**
	 * Enter a parse tree produced by the {@code idAtom}
	 * labeled alternative in {@link MuParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterIdAtom(@NotNull MuParser.IdAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idAtom}
	 * labeled alternative in {@link MuParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitIdAtom(@NotNull MuParser.IdAtomContext ctx);

	/**
	 * Enter a parse tree produced by {@link MuParser#log}.
	 * @param ctx the parse tree
	 */
	void enterLog(@NotNull MuParser.LogContext ctx);
	/**
	 * Exit a parse tree produced by {@link MuParser#log}.
	 * @param ctx the parse tree
	 */
	void exitLog(@NotNull MuParser.LogContext ctx);

	/**
	 * Enter a parse tree produced by {@link MuParser#condition_block}.
	 * @param ctx the parse tree
	 */
	void enterCondition_block(@NotNull MuParser.Condition_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MuParser#condition_block}.
	 * @param ctx the parse tree
	 */
	void exitCondition_block(@NotNull MuParser.Condition_blockContext ctx);

	/**
	 * Enter a parse tree produced by the {@code atomExpr}
	 * labeled alternative in {@link MuParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAtomExpr(@NotNull MuParser.AtomExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atomExpr}
	 * labeled alternative in {@link MuParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAtomExpr(@NotNull MuParser.AtomExprContext ctx);

	/**
	 * Enter a parse tree produced by the {@code additiveExpr}
	 * labeled alternative in {@link MuParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpr(@NotNull MuParser.AdditiveExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code additiveExpr}
	 * labeled alternative in {@link MuParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpr(@NotNull MuParser.AdditiveExprContext ctx);

	/**
	 * Enter a parse tree produced by the {@code parExpr}
	 * labeled alternative in {@link MuParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterParExpr(@NotNull MuParser.ParExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parExpr}
	 * labeled alternative in {@link MuParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitParExpr(@NotNull MuParser.ParExprContext ctx);

	/**
	 * Enter a parse tree produced by the {@code unaryMinusExpr}
	 * labeled alternative in {@link MuParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterUnaryMinusExpr(@NotNull MuParser.UnaryMinusExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryMinusExpr}
	 * labeled alternative in {@link MuParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitUnaryMinusExpr(@NotNull MuParser.UnaryMinusExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link MuParser#while_stat}.
	 * @param ctx the parse tree
	 */
	void enterWhile_stat(@NotNull MuParser.While_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link MuParser#while_stat}.
	 * @param ctx the parse tree
	 */
	void exitWhile_stat(@NotNull MuParser.While_statContext ctx);

	/**
	 * Enter a parse tree produced by {@link MuParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(@NotNull MuParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MuParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(@NotNull MuParser.BlockContext ctx);

	/**
	 * Enter a parse tree produced by {@link MuParser#if_stat}.
	 * @param ctx the parse tree
	 */
	void enterIf_stat(@NotNull MuParser.If_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link MuParser#if_stat}.
	 * @param ctx the parse tree
	 */
	void exitIf_stat(@NotNull MuParser.If_statContext ctx);

	/**
	 * Enter a parse tree produced by {@link MuParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(@NotNull MuParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link MuParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(@NotNull MuParser.StatContext ctx);

	/**
	 * Enter a parse tree produced by {@link MuParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(@NotNull MuParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MuParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(@NotNull MuParser.AssignmentContext ctx);

	/**
	 * Enter a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link MuParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterOrExpr(@NotNull MuParser.OrExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link MuParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitOrExpr(@NotNull MuParser.OrExprContext ctx);

	/**
	 * Enter a parse tree produced by the {@code nilAtom}
	 * labeled alternative in {@link MuParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterNilAtom(@NotNull MuParser.NilAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nilAtom}
	 * labeled alternative in {@link MuParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitNilAtom(@NotNull MuParser.NilAtomContext ctx);

	/**
	 * Enter a parse tree produced by {@link MuParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(@NotNull MuParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MuParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(@NotNull MuParser.ParseContext ctx);

	/**
	 * Enter a parse tree produced by the {@code relationalExpr}
	 * labeled alternative in {@link MuParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpr(@NotNull MuParser.RelationalExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relationalExpr}
	 * labeled alternative in {@link MuParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpr(@NotNull MuParser.RelationalExprContext ctx);

	/**
	 * Enter a parse tree produced by the {@code numberAtom}
	 * labeled alternative in {@link MuParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterNumberAtom(@NotNull MuParser.NumberAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberAtom}
	 * labeled alternative in {@link MuParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitNumberAtom(@NotNull MuParser.NumberAtomContext ctx);

	/**
	 * Enter a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link MuParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNotExpr(@NotNull MuParser.NotExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link MuParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNotExpr(@NotNull MuParser.NotExprContext ctx);

	/**
	 * Enter a parse tree produced by the {@code stringAtom}
	 * labeled alternative in {@link MuParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterStringAtom(@NotNull MuParser.StringAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringAtom}
	 * labeled alternative in {@link MuParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitStringAtom(@NotNull MuParser.StringAtomContext ctx);

	/**
	 * Enter a parse tree produced by the {@code multiplicationExpr}
	 * labeled alternative in {@link MuParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicationExpr(@NotNull MuParser.MultiplicationExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiplicationExpr}
	 * labeled alternative in {@link MuParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicationExpr(@NotNull MuParser.MultiplicationExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link MuParser#stat_block}.
	 * @param ctx the parse tree
	 */
	void enterStat_block(@NotNull MuParser.Stat_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MuParser#stat_block}.
	 * @param ctx the parse tree
	 */
	void exitStat_block(@NotNull MuParser.Stat_blockContext ctx);

	/**
	 * Enter a parse tree produced by the {@code powExpr}
	 * labeled alternative in {@link MuParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPowExpr(@NotNull MuParser.PowExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code powExpr}
	 * labeled alternative in {@link MuParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPowExpr(@NotNull MuParser.PowExprContext ctx);

	/**
	 * Enter a parse tree produced by the {@code equalityExpr}
	 * labeled alternative in {@link MuParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpr(@NotNull MuParser.EqualityExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equalityExpr}
	 * labeled alternative in {@link MuParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpr(@NotNull MuParser.EqualityExprContext ctx);

	/**
	 * Enter a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link MuParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAndExpr(@NotNull MuParser.AndExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link MuParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAndExpr(@NotNull MuParser.AndExprContext ctx);
}