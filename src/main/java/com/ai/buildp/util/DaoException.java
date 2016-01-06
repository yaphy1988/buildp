/**
 * 
 */
package com.ai.buildp.util;

import org.springframework.core.NestedRuntimeException;

/**
 * @author jianhua.ma
 * ┏━┓                  ┏━┓
 * ┃  ┏━━━━━━━┓   ┃ 
 * ┃       >  <  ┃
 * ┃		             ┃ 
 * ┃            ^ 。    ┃
 * ┗━━━┓       ┏━━━┛
 *    ┃      ┃   code is far away from bug with the animal protecting  
 *	        ┃      ┃  神兽保佑,代码无bug  
 *	        ┃      ┗━━━━━━━━━━━━━━━━━┓  
 *	        ┃                            	                    ┣━━━━━━━━━━━━━━┓  
 *	        ┃                                                    ┏━━━━━━━━━━━━━━┛  
 *	        ┗┓┓┏━━━━━━━━━━┏┏━┏━┏━━┛  
 *	          ┃┫┫                                 ┃┫┫  
 *	          ┗┻┛                                 ┗┻┛ 
 * @date Aug 21, 2014
 */
public class DaoException extends NestedRuntimeException {

	public DaoException(String msg) {
		super(msg);
	}
	
	public DaoException(String msg,Throwable obj) {
		super(msg,obj);
	}
}
