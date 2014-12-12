package com.oxhide.vo;

import java.util.Date;

/**
 * 用户登陆信息
 * @author lane
 *
 */

public class LoginVO {
	
	/**
	 * ID
	 */
	private String loginId;
	
	/**
	 * 用户ID
	 */
	private String userId;
	
	/**
	 * 用户登陆地
	 */
	private String location;
	
	/**
	 * 用户登陆token
	 */
	private String token;
	
	/**
	 * 用户在线状态
	 */
	private int status;
	
	/**
	 * 用户设备ID
	 */
	private String mid;
	
	/**
	 * 用户IP地址
	 */
	private String clientIP;
	
	/**
	 * 用户登陆时间
	 */
	private Date loginTime;
	
	/**
	 * 用户登出时间
	 */
	private Date logoutTime;
	

}
