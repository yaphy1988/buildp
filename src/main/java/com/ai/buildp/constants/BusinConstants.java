package com.ai.buildp.constants;

/**
 * 定义系统中使用到的业务常量
 * @author yafei
 *
 */
public class BusinConstants {

	/**
	 * 系统异常代码常量
	 * @author yafei
	 *
	 */
	public static class SysException {
		
		/**系统异常 ERROR*/
		public static final String ERROR = "000001";
		
		/**没有数据 NO_DATA*/
		public static final String NO_DATA = "000002";
		
		/**得到空值 NULL_POINT*/
		public static final String NULL_POINT = "000003";
		
		/**参数为空 PARAM_IS_NULL*/
		public static final String PARAM_IS_NULL = "000004";
		
		/**参数类型不匹配 PARAM_TYPE_UNMATCH*/
		public static final String PARAM_TYPE_UNMATCH = "000005";
	}
	
	/**
	 * 用户权限管理相关常量，若定义业务错误码，分配从100000~109999之间使用
	 * @author yafei
	 *
	 */
	public static class AuthConstants {
		
		/**用户名不存在*/
		public static final String USER_NOT_FOUND = "100000";
		
		/**没有访问权限*/
		public static final String UN_PERMISSION = "100001";
		
		/**链接地址错误*/
		public static final String ERROR_LOCATION = "100002";
	}
}
