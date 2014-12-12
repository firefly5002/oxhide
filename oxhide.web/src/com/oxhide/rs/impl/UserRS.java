package com.oxhide.rs.impl;

import javax.ws.rs.POST;
import javax.ws.rs.Path;

import com.oxhide.vo.UserVO;

public class UserRS {
	
	/**
	 * 用户注册
	 * @param userVO
	 * @return
	 */
	@POST
	@Path("/register")
	public String register(UserVO userVO){
		return null;
		
	}
	
	/**
	 * 修改用户基本信息
	 * @param userVO
	 * @return
	 */
	@POST
	@Path("/modifyInfo")
	public String modifyInfo(UserVO userVO){
		return null;
		
	}
	
	/**
	 * 修改密码
	 * @param userVO
	 * @return
	 */
	@POST
	@Path("/modifyPasswd")
	public String modifyPasswd(UserVO userVO){
		return null;
		
	}

}
