package com.oxhide.rs.impl;

import javax.ws.rs.POST;
import javax.ws.rs.Path;

import com.oxhide.vo.UserVO;

/**
 * 用户登陆服务
 * @author lane
 *
 */
public class LoginRS {

	/**
	 * 用户登陆
	 * @param userVO
	 * @return
	 */
	@POST
	@Path("/login")
	public String login(UserVO userVO){
		return null;
		
	}
	
	/**
	 * 用户登出
	 * @param userVO
	 * @return
	 */
	@POST
	@Path("/logout")
	public String logout(UserVO userVO){
		return null;
		
	}
	
}
