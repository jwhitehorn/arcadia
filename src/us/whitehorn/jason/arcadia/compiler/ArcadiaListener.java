// Generated from /Users/jason/projects/arcadia/Arcadia.g4 by ANTLR 4.7.2
package us.whitehorn.jason.arcadia.compiler;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ArcadiaParser}.
 */
public interface ArcadiaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ArcadiaParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(ArcadiaParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArcadiaParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(ArcadiaParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArcadiaParser#expression_list}.
	 * @param ctx the parse tree
	 */
	void enterExpression_list(ArcadiaParser.Expression_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArcadiaParser#expression_list}.
	 * @param ctx the parse tree
	 */
	void exitExpression_list(ArcadiaParser.Expression_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArcadiaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(ArcadiaParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArcadiaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(ArcadiaParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArcadiaParser#global_get}.
	 * @param ctx the parse tree
	 */
	void enterGlobal_get(ArcadiaParser.Global_getContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArcadiaParser#global_get}.
	 * @param ctx the parse tree
	 */
	void exitGlobal_get(ArcadiaParser.Global_getContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArcadiaParser#global_set}.
	 * @param ctx the parse tree
	 */
	void enterGlobal_set(ArcadiaParser.Global_setContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArcadiaParser#global_set}.
	 * @param ctx the parse tree
	 */
	void exitGlobal_set(ArcadiaParser.Global_setContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArcadiaParser#global_result}.
	 * @param ctx the parse tree
	 */
	void enterGlobal_result(ArcadiaParser.Global_resultContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArcadiaParser#global_result}.
	 * @param ctx the parse tree
	 */
	void exitGlobal_result(ArcadiaParser.Global_resultContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArcadiaParser#function_inline_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_inline_call(ArcadiaParser.Function_inline_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArcadiaParser#function_inline_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_inline_call(ArcadiaParser.Function_inline_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArcadiaParser#require_block}.
	 * @param ctx the parse tree
	 */
	void enterRequire_block(ArcadiaParser.Require_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArcadiaParser#require_block}.
	 * @param ctx the parse tree
	 */
	void exitRequire_block(ArcadiaParser.Require_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArcadiaParser#pir_inline}.
	 * @param ctx the parse tree
	 */
	void enterPir_inline(ArcadiaParser.Pir_inlineContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArcadiaParser#pir_inline}.
	 * @param ctx the parse tree
	 */
	void exitPir_inline(ArcadiaParser.Pir_inlineContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArcadiaParser#pir_expression_list}.
	 * @param ctx the parse tree
	 */
	void enterPir_expression_list(ArcadiaParser.Pir_expression_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArcadiaParser#pir_expression_list}.
	 * @param ctx the parse tree
	 */
	void exitPir_expression_list(ArcadiaParser.Pir_expression_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArcadiaParser#function_definition}.
	 * @param ctx the parse tree
	 */
	void enterFunction_definition(ArcadiaParser.Function_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArcadiaParser#function_definition}.
	 * @param ctx the parse tree
	 */
	void exitFunction_definition(ArcadiaParser.Function_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArcadiaParser#function_definition_body}.
	 * @param ctx the parse tree
	 */
	void enterFunction_definition_body(ArcadiaParser.Function_definition_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArcadiaParser#function_definition_body}.
	 * @param ctx the parse tree
	 */
	void exitFunction_definition_body(ArcadiaParser.Function_definition_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArcadiaParser#function_definition_header}.
	 * @param ctx the parse tree
	 */
	void enterFunction_definition_header(ArcadiaParser.Function_definition_headerContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArcadiaParser#function_definition_header}.
	 * @param ctx the parse tree
	 */
	void exitFunction_definition_header(ArcadiaParser.Function_definition_headerContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArcadiaParser#function_name}.
	 * @param ctx the parse tree
	 */
	void enterFunction_name(ArcadiaParser.Function_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArcadiaParser#function_name}.
	 * @param ctx the parse tree
	 */
	void exitFunction_name(ArcadiaParser.Function_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArcadiaParser#function_definition_params}.
	 * @param ctx the parse tree
	 */
	void enterFunction_definition_params(ArcadiaParser.Function_definition_paramsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArcadiaParser#function_definition_params}.
	 * @param ctx the parse tree
	 */
	void exitFunction_definition_params(ArcadiaParser.Function_definition_paramsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArcadiaParser#function_definition_params_list}.
	 * @param ctx the parse tree
	 */
	void enterFunction_definition_params_list(ArcadiaParser.Function_definition_params_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArcadiaParser#function_definition_params_list}.
	 * @param ctx the parse tree
	 */
	void exitFunction_definition_params_list(ArcadiaParser.Function_definition_params_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArcadiaParser#function_definition_param_r_id}.
	 * @param ctx the parse tree
	 */
	void enterFunction_definition_param_r_id(ArcadiaParser.Function_definition_param_r_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArcadiaParser#function_definition_param_r_id}.
	 * @param ctx the parse tree
	 */
	void exitFunction_definition_param_r_id(ArcadiaParser.Function_definition_param_r_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArcadiaParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void enterReturn_statement(ArcadiaParser.Return_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArcadiaParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void exitReturn_statement(ArcadiaParser.Return_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArcadiaParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(ArcadiaParser.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArcadiaParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(ArcadiaParser.Function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArcadiaParser#function_call_param_list}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call_param_list(ArcadiaParser.Function_call_param_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArcadiaParser#function_call_param_list}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call_param_list(ArcadiaParser.Function_call_param_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArcadiaParser#function_call_params}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call_params(ArcadiaParser.Function_call_paramsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArcadiaParser#function_call_params}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call_params(ArcadiaParser.Function_call_paramsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArcadiaParser#function_param}.
	 * @param ctx the parse tree
	 */
	void enterFunction_param(ArcadiaParser.Function_paramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArcadiaParser#function_param}.
	 * @param ctx the parse tree
	 */
	void exitFunction_param(ArcadiaParser.Function_paramContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArcadiaParser#function_unnamed_param}.
	 * @param ctx the parse tree
	 */
	void enterFunction_unnamed_param(ArcadiaParser.Function_unnamed_paramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArcadiaParser#function_unnamed_param}.
	 * @param ctx the parse tree
	 */
	void exitFunction_unnamed_param(ArcadiaParser.Function_unnamed_paramContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArcadiaParser#function_named_param}.
	 * @param ctx the parse tree
	 */
	void enterFunction_named_param(ArcadiaParser.Function_named_paramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArcadiaParser#function_named_param}.
	 * @param ctx the parse tree
	 */
	void exitFunction_named_param(ArcadiaParser.Function_named_paramContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArcadiaParser#function_call_assignment}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call_assignment(ArcadiaParser.Function_call_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArcadiaParser#function_call_assignment}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call_assignment(ArcadiaParser.Function_call_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArcadiaParser#all_result}.
	 * @param ctx the parse tree
	 */
	void enterAll_result(ArcadiaParser.All_resultContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArcadiaParser#all_result}.
	 * @param ctx the parse tree
	 */
	void exitAll_result(ArcadiaParser.All_resultContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArcadiaParser#elsif_statement}.
	 * @param ctx the parse tree
	 */
	void enterElsif_statement(ArcadiaParser.Elsif_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArcadiaParser#elsif_statement}.
	 * @param ctx the parse tree
	 */
	void exitElsif_statement(ArcadiaParser.Elsif_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArcadiaParser#if_elsif_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_elsif_statement(ArcadiaParser.If_elsif_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArcadiaParser#if_elsif_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_elsif_statement(ArcadiaParser.If_elsif_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArcadiaParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(ArcadiaParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArcadiaParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(ArcadiaParser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArcadiaParser#unless_statement}.
	 * @param ctx the parse tree
	 */
	void enterUnless_statement(ArcadiaParser.Unless_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArcadiaParser#unless_statement}.
	 * @param ctx the parse tree
	 */
	void exitUnless_statement(ArcadiaParser.Unless_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArcadiaParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void enterWhile_statement(ArcadiaParser.While_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArcadiaParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void exitWhile_statement(ArcadiaParser.While_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArcadiaParser#for_statement}.
	 * @param ctx the parse tree
	 */
	void enterFor_statement(ArcadiaParser.For_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArcadiaParser#for_statement}.
	 * @param ctx the parse tree
	 */
	void exitFor_statement(ArcadiaParser.For_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArcadiaParser#init_expression}.
	 * @param ctx the parse tree
	 */
	void enterInit_expression(ArcadiaParser.Init_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArcadiaParser#init_expression}.
	 * @param ctx the parse tree
	 */
	void exitInit_expression(ArcadiaParser.Init_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArcadiaParser#all_assignment}.
	 * @param ctx the parse tree
	 */
	void enterAll_assignment(ArcadiaParser.All_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArcadiaParser#all_assignment}.
	 * @param ctx the parse tree
	 */
	void exitAll_assignment(ArcadiaParser.All_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArcadiaParser#for_init_list}.
	 * @param ctx the parse tree
	 */
	void enterFor_init_list(ArcadiaParser.For_init_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArcadiaParser#for_init_list}.
	 * @param ctx the parse tree
	 */
	void exitFor_init_list(ArcadiaParser.For_init_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArcadiaParser#cond_expression}.
	 * @param ctx the parse tree
	 */
	void enterCond_expression(ArcadiaParser.Cond_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArcadiaParser#cond_expression}.
	 * @param ctx the parse tree
	 */
	void exitCond_expression(ArcadiaParser.Cond_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArcadiaParser#loop_expression}.
	 * @param ctx the parse tree
	 */
	void enterLoop_expression(ArcadiaParser.Loop_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArcadiaParser#loop_expression}.
	 * @param ctx the parse tree
	 */
	void exitLoop_expression(ArcadiaParser.Loop_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArcadiaParser#for_loop_list}.
	 * @param ctx the parse tree
	 */
	void enterFor_loop_list(ArcadiaParser.For_loop_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArcadiaParser#for_loop_list}.
	 * @param ctx the parse tree
	 */
	void exitFor_loop_list(ArcadiaParser.For_loop_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArcadiaParser#statement_body}.
	 * @param ctx the parse tree
	 */
	void enterStatement_body(ArcadiaParser.Statement_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArcadiaParser#statement_body}.
	 * @param ctx the parse tree
	 */
	void exitStatement_body(ArcadiaParser.Statement_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArcadiaParser#statement_expression_list}.
	 * @param ctx the parse tree
	 */
	void enterStatement_expression_list(ArcadiaParser.Statement_expression_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArcadiaParser#statement_expression_list}.
	 * @param ctx the parse tree
	 */
	void exitStatement_expression_list(ArcadiaParser.Statement_expression_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArcadiaParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(ArcadiaParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArcadiaParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(ArcadiaParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArcadiaParser#dynamic_assignment}.
	 * @param ctx the parse tree
	 */
	void enterDynamic_assignment(ArcadiaParser.Dynamic_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArcadiaParser#dynamic_assignment}.
	 * @param ctx the parse tree
	 */
	void exitDynamic_assignment(ArcadiaParser.Dynamic_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArcadiaParser#int_assignment}.
	 * @param ctx the parse tree
	 */
	void enterInt_assignment(ArcadiaParser.Int_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArcadiaParser#int_assignment}.
	 * @param ctx the parse tree
	 */
	void exitInt_assignment(ArcadiaParser.Int_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArcadiaParser#float_assignment}.
	 * @param ctx the parse tree
	 */
	void enterFloat_assignment(ArcadiaParser.Float_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArcadiaParser#float_assignment}.
	 * @param ctx the parse tree
	 */
	void exitFloat_assignment(ArcadiaParser.Float_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArcadiaParser#string_assignment}.
	 * @param ctx the parse tree
	 */
	void enterString_assignment(ArcadiaParser.String_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArcadiaParser#string_assignment}.
	 * @param ctx the parse tree
	 */
	void exitString_assignment(ArcadiaParser.String_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArcadiaParser#initial_array_assignment}.
	 * @param ctx the parse tree
	 */
	void enterInitial_array_assignment(ArcadiaParser.Initial_array_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArcadiaParser#initial_array_assignment}.
	 * @param ctx the parse tree
	 */
	void exitInitial_array_assignment(ArcadiaParser.Initial_array_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArcadiaParser#array_assignment}.
	 * @param ctx the parse tree
	 */
	void enterArray_assignment(ArcadiaParser.Array_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArcadiaParser#array_assignment}.
	 * @param ctx the parse tree
	 */
	void exitArray_assignment(ArcadiaParser.Array_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArcadiaParser#array_definition}.
	 * @param ctx the parse tree
	 */
	void enterArray_definition(ArcadiaParser.Array_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArcadiaParser#array_definition}.
	 * @param ctx the parse tree
	 */
	void exitArray_definition(ArcadiaParser.Array_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArcadiaParser#array_definition_elements}.
	 * @param ctx the parse tree
	 */
	void enterArray_definition_elements(ArcadiaParser.Array_definition_elementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArcadiaParser#array_definition_elements}.
	 * @param ctx the parse tree
	 */
	void exitArray_definition_elements(ArcadiaParser.Array_definition_elementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArcadiaParser#array_selector}.
	 * @param ctx the parse tree
	 */
	void enterArray_selector(ArcadiaParser.Array_selectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArcadiaParser#array_selector}.
	 * @param ctx the parse tree
	 */
	void exitArray_selector(ArcadiaParser.Array_selectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArcadiaParser#dynamic_result}.
	 * @param ctx the parse tree
	 */
	void enterDynamic_result(ArcadiaParser.Dynamic_resultContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArcadiaParser#dynamic_result}.
	 * @param ctx the parse tree
	 */
	void exitDynamic_result(ArcadiaParser.Dynamic_resultContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArcadiaParser#dynamic}.
	 * @param ctx the parse tree
	 */
	void enterDynamic(ArcadiaParser.DynamicContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArcadiaParser#dynamic}.
	 * @param ctx the parse tree
	 */
	void exitDynamic(ArcadiaParser.DynamicContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArcadiaParser#int_result}.
	 * @param ctx the parse tree
	 */
	void enterInt_result(ArcadiaParser.Int_resultContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArcadiaParser#int_result}.
	 * @param ctx the parse tree
	 */
	void exitInt_result(ArcadiaParser.Int_resultContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArcadiaParser#float_result}.
	 * @param ctx the parse tree
	 */
	void enterFloat_result(ArcadiaParser.Float_resultContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArcadiaParser#float_result}.
	 * @param ctx the parse tree
	 */
	void exitFloat_result(ArcadiaParser.Float_resultContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArcadiaParser#string_result}.
	 * @param ctx the parse tree
	 */
	void enterString_result(ArcadiaParser.String_resultContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArcadiaParser#string_result}.
	 * @param ctx the parse tree
	 */
	void exitString_result(ArcadiaParser.String_resultContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArcadiaParser#comparison_list}.
	 * @param ctx the parse tree
	 */
	void enterComparison_list(ArcadiaParser.Comparison_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArcadiaParser#comparison_list}.
	 * @param ctx the parse tree
	 */
	void exitComparison_list(ArcadiaParser.Comparison_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArcadiaParser#comparison}.
	 * @param ctx the parse tree
	 */
	void enterComparison(ArcadiaParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArcadiaParser#comparison}.
	 * @param ctx the parse tree
	 */
	void exitComparison(ArcadiaParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArcadiaParser#comp_var}.
	 * @param ctx the parse tree
	 */
	void enterComp_var(ArcadiaParser.Comp_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArcadiaParser#comp_var}.
	 * @param ctx the parse tree
	 */
	void exitComp_var(ArcadiaParser.Comp_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArcadiaParser#lvalue}.
	 * @param ctx the parse tree
	 */
	void enterLvalue(ArcadiaParser.LvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArcadiaParser#lvalue}.
	 * @param ctx the parse tree
	 */
	void exitLvalue(ArcadiaParser.LvalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArcadiaParser#rvalue}.
	 * @param ctx the parse tree
	 */
	void enterRvalue(ArcadiaParser.RvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArcadiaParser#rvalue}.
	 * @param ctx the parse tree
	 */
	void exitRvalue(ArcadiaParser.RvalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArcadiaParser#break_expression}.
	 * @param ctx the parse tree
	 */
	void enterBreak_expression(ArcadiaParser.Break_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArcadiaParser#break_expression}.
	 * @param ctx the parse tree
	 */
	void exitBreak_expression(ArcadiaParser.Break_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArcadiaParser#literal_t}.
	 * @param ctx the parse tree
	 */
	void enterLiteral_t(ArcadiaParser.Literal_tContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArcadiaParser#literal_t}.
	 * @param ctx the parse tree
	 */
	void exitLiteral_t(ArcadiaParser.Literal_tContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArcadiaParser#float_t}.
	 * @param ctx the parse tree
	 */
	void enterFloat_t(ArcadiaParser.Float_tContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArcadiaParser#float_t}.
	 * @param ctx the parse tree
	 */
	void exitFloat_t(ArcadiaParser.Float_tContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArcadiaParser#int_t}.
	 * @param ctx the parse tree
	 */
	void enterInt_t(ArcadiaParser.Int_tContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArcadiaParser#int_t}.
	 * @param ctx the parse tree
	 */
	void exitInt_t(ArcadiaParser.Int_tContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArcadiaParser#bool_t}.
	 * @param ctx the parse tree
	 */
	void enterBool_t(ArcadiaParser.Bool_tContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArcadiaParser#bool_t}.
	 * @param ctx the parse tree
	 */
	void exitBool_t(ArcadiaParser.Bool_tContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArcadiaParser#nil_t}.
	 * @param ctx the parse tree
	 */
	void enterNil_t(ArcadiaParser.Nil_tContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArcadiaParser#nil_t}.
	 * @param ctx the parse tree
	 */
	void exitNil_t(ArcadiaParser.Nil_tContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArcadiaParser#r_id}.
	 * @param ctx the parse tree
	 */
	void enterR_id(ArcadiaParser.R_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArcadiaParser#r_id}.
	 * @param ctx the parse tree
	 */
	void exitR_id(ArcadiaParser.R_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArcadiaParser#r_id_global}.
	 * @param ctx the parse tree
	 */
	void enterR_id_global(ArcadiaParser.R_id_globalContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArcadiaParser#r_id_global}.
	 * @param ctx the parse tree
	 */
	void exitR_id_global(ArcadiaParser.R_id_globalContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArcadiaParser#r_id_function}.
	 * @param ctx the parse tree
	 */
	void enterR_id_function(ArcadiaParser.R_id_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArcadiaParser#r_id_function}.
	 * @param ctx the parse tree
	 */
	void exitR_id_function(ArcadiaParser.R_id_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArcadiaParser#terminator}.
	 * @param ctx the parse tree
	 */
	void enterTerminator(ArcadiaParser.TerminatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArcadiaParser#terminator}.
	 * @param ctx the parse tree
	 */
	void exitTerminator(ArcadiaParser.TerminatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArcadiaParser#else_token}.
	 * @param ctx the parse tree
	 */
	void enterElse_token(ArcadiaParser.Else_tokenContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArcadiaParser#else_token}.
	 * @param ctx the parse tree
	 */
	void exitElse_token(ArcadiaParser.Else_tokenContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArcadiaParser#crlf}.
	 * @param ctx the parse tree
	 */
	void enterCrlf(ArcadiaParser.CrlfContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArcadiaParser#crlf}.
	 * @param ctx the parse tree
	 */
	void exitCrlf(ArcadiaParser.CrlfContext ctx);
}