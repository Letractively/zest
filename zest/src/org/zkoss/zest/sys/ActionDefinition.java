/* ActionDefinition.java

	Purpose:
		
	Description:
		
	History:
		Mon Mar  7 12:15:39 TST 2011, Created by tomyeh

Copyright (C) 2011 Potix Corporation. All Rights Reserved.

*/
package org.zkoss.zest.sys;

import org.zkoss.zest.ActionContext;

/**
 * The action definition.
 * @author tomyeh
 */
public interface ActionDefinition {
	/** Returns the action if the specified request matches this action definition,
	 * or null if not matched.
	 * An action could be an instance of any object.
	 */
	public Object getAction(ActionContext ctx)
	throws Exception;
	/** Invokes the action.
	 * @param action the action (never null) to invoke. It is the returned
	 * value of {@link #getAction}.
	 */
	public String execute(ActionContext ctx, Object action)
	throws Exception ;
	/** Returns the URI for the given result, or null if not matched.
	 * @param result the result of the execution of an action.
	 * It is the returned value of {@link #execute}.
	 */
	public String getView(ActionContext ctx, String result)
	throws Exception ;
}