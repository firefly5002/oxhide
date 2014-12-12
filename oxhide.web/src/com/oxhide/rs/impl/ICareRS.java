package com.oxhide.rs.impl;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import com.oxhide.vo.OxhideVO;

/**
 * 我的关注
 * @author lane
 *
 */
public class ICareRS {
	
	/**
	 * 添加关注
	 * @return
	 */
	@POST
	@Path("/add")
	public String add(OxhideVO oxhideVO){
		return null;
	}
	
	
	/**
	 * 取消关注
	 * @return
	 */
	@POST
	@Path("/cancel")
	public String cancel(OxhideVO oxhideVO){
		return null;
	}
	
	/**
	 * 获取关注的牛皮列表
	 * @return
	 */
	@GET
	@Path("/getOxhideList")
	public List<OxhideVO> getOxhideList(String userId){
		return null;
	}
	

}
