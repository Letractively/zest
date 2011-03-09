/* ActionContext.java

	Purpose:
		
	Description:
		
	History:
		Mon Mar  7 14:08:06 TST 2011, Created by tomyeh

Copyright (C) 2011 Potix Corporation. All Rights Reserved.

*/
package org.zkoss.zest;

import javax.servlet.http.HttpServletRequest;

import org.zkoss.xel.Expression;
import org.zkoss.xel.XelException;

/**
 * Represents an execution of an action.
 * It is caused by a request.
 *
 * <p>The execution method of an action could have two signatures:
 * <ol>
 * <li>String <i>execute</i>(ActionContext); //higher priority</li>
 * <li>String <i>execute</i>();</li>
 * </ol>
 *
 * @author tomyeh
 */
public interface ActionContext {
	/** Returns the request.
	 */
	public HttpServletRequest getServletRequest();
	/** Returns the request's path (a concontenation of
	 * HttpServletRequest.getServletPath() and getRequestPath()).
	 */
	public String getRequestPath();

	/**
	 * Prepares the expression.
	 *
	 * @param expression the expression to be prepared for being evaluated
	 * later.
	 * @param expectedType the expected type of the result of the evaluation
	 */
	public Expression parseExpression(String expression, Class expectedType)
	throws XelException;
	/**
	 * Evaluates the expression.
	 */
	public Object evaluate(Expression expression)
	throws XelException;
}