/*
 * generated by Xtext 2.32.0
 */
/*
 * Copyright (c) 2022, 2023 Epistimis LLC (http://www.epistimis.com).
 */
package com.epistimis.uddl.query.serializer;

import com.epistimis.uddl.query.services.QueryGrammarAccess;
import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class QuerySyntacticSequencer extends AbstractSyntacticSequencer {

	protected QueryGrammarAccess grammarAccess;
	protected AbstractElementAlias match_ExplicitSelectedEntityCharacteristicReference_KW_ASTerminalRuleCall_1_0_q;
	protected AbstractElementAlias match_QueryStatement_SemicolonKeyword_4_q;
	protected AbstractElementAlias match_SelectedEntity_KW_ASTerminalRuleCall_1_0_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (QueryGrammarAccess) access;
		match_ExplicitSelectedEntityCharacteristicReference_KW_ASTerminalRuleCall_1_0_q = new TokenAlias(false, true, grammarAccess.getExplicitSelectedEntityCharacteristicReferenceAccess().getKW_ASTerminalRuleCall_1_0());
		match_QueryStatement_SemicolonKeyword_4_q = new TokenAlias(false, true, grammarAccess.getQueryStatementAccess().getSemicolonKeyword_4());
		match_SelectedEntity_KW_ASTerminalRuleCall_1_0_q = new TokenAlias(false, true, grammarAccess.getSelectedEntityAccess().getKW_ASTerminalRuleCall_1_0());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (ruleCall.getRule() == grammarAccess.getALL_CHARACTERISTICSRule())
			return getALL_CHARACTERISTICSToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getCOLONRule())
			return getCOLONToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getCOMMARule())
			return getCOMMAToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getEQUALS_OPERATORRule())
			return getEQUALS_OPERATORToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getKW_ANDRule())
			return getKW_ANDToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getKW_ASRule())
			return getKW_ASToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getKW_BYRule())
			return getKW_BYToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getKW_EXISTSRule())
			return getKW_EXISTSToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getKW_INRule())
			return getKW_INToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getKW_JOINRule())
			return getKW_JOINToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getKW_NOTRule())
			return getKW_NOTToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getKW_ONRule())
			return getKW_ONToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getKW_ORRule())
			return getKW_ORToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getKW_ORDERRule())
			return getKW_ORDERToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getKW_WHERERule())
			return getKW_WHEREToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getLEFT_BRACERule())
			return getLEFT_BRACEToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getLEFT_PARENRule())
			return getLEFT_PARENToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getPERIODRule())
			return getPERIODToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getRIGHT_BRACERule())
			return getRIGHT_BRACEToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getRIGHT_PARENRule())
			return getRIGHT_PARENToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * terminal ALL_CHARACTERISTICS : "*" ;
	 */
	protected String getALL_CHARACTERISTICSToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "*";
	}
	
	/**
	 * terminal COLON : ":" ;
	 */
	protected String getCOLONToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ":";
	}
	
	/**
	 * terminal COMMA : "," ;
	 */
	protected String getCOMMAToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ",";
	}
	
	/**
	 * terminal EQUALS_OPERATOR : "=" ;
	 */
	protected String getEQUALS_OPERATORToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "=";
	}
	
	/**
	 * terminal KW_AND : "AND" | "and" ;
	 */
	protected String getKW_ANDToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "AND";
	}
	
	/**
	 * terminal KW_AS : "AS" | "as" ;
	 */
	protected String getKW_ASToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "AS";
	}
	
	/**
	 * terminal KW_BY : "BY" | "by" ;
	 */
	protected String getKW_BYToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "BY";
	}
	
	/**
	 * terminal KW_EXISTS : "EXISTS" | "exists" ;
	 */
	protected String getKW_EXISTSToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "EXISTS";
	}
	
	/**
	 * terminal KW_IN : "IN" | "in" ;
	 */
	protected String getKW_INToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "IN";
	}
	
	/**
	 * terminal KW_JOIN : "JOIN" | "join" ;
	 */
	protected String getKW_JOINToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "JOIN";
	}
	
	/**
	 * terminal KW_NOT : "NOT" | "not" ;
	 */
	protected String getKW_NOTToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "NOT";
	}
	
	/**
	 * terminal KW_ON : "ON" | "on" ;
	 */
	protected String getKW_ONToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "ON";
	}
	
	/**
	 * terminal KW_OR : "OR" | "or" ;
	 */
	protected String getKW_ORToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "OR";
	}
	
	/**
	 * terminal KW_ORDER : "ORDER" | "order" ;
	 */
	protected String getKW_ORDERToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "ORDER";
	}
	
	/**
	 * terminal KW_WHERE : "WHERE" | "where" ;
	 */
	protected String getKW_WHEREToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "WHERE";
	}
	
	/**
	 * terminal LEFT_BRACE : "{" ;
	 */
	protected String getLEFT_BRACEToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "{";
	}
	
	/**
	 * terminal LEFT_PAREN : "(" ;
	 */
	protected String getLEFT_PARENToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "(";
	}
	
	/**
	 * terminal PERIOD : "." ;
	 */
	protected String getPERIODToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ".";
	}
	
	/**
	 * terminal RIGHT_BRACE : "}" ;
	 */
	protected String getRIGHT_BRACEToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "}";
	}
	
	/**
	 * terminal RIGHT_PAREN : ")" ;
	 */
	protected String getRIGHT_PARENToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ")";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_ExplicitSelectedEntityCharacteristicReference_KW_ASTerminalRuleCall_1_0_q.equals(syntax))
				emit_ExplicitSelectedEntityCharacteristicReference_KW_ASTerminalRuleCall_1_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_QueryStatement_SemicolonKeyword_4_q.equals(syntax))
				emit_QueryStatement_SemicolonKeyword_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_SelectedEntity_KW_ASTerminalRuleCall_1_0_q.equals(syntax))
				emit_SelectedEntity_KW_ASTerminalRuleCall_1_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     KW_AS?
	 *
	 * This ambiguous syntax occurs at:
	 *     selectedEntityCharacteristicReference=SelectedEntityCharacteristicReference (ambiguity) projectedCharacteristicAlias=ProjectedCharacteristicAlias
	 
	 * </pre>
	 */
	protected void emit_ExplicitSelectedEntityCharacteristicReference_KW_ASTerminalRuleCall_1_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     ';'?
	 *
	 * This ambiguous syntax occurs at:
	 *     selectedEntityExpression=SelectedEntityExpression (ambiguity) (rule end)
	 
	 * </pre>
	 */
	protected void emit_QueryStatement_SemicolonKeyword_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     KW_AS?
	 *
	 * This ambiguous syntax occurs at:
	 *     entityType=EntityTypeReference (ambiguity) selectedEntityAlias=SelectedEntityAlias
	 
	 * </pre>
	 */
	protected void emit_SelectedEntity_KW_ASTerminalRuleCall_1_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
