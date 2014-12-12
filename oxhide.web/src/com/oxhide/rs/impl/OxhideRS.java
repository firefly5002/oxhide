package com.oxhide.rs.impl;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import com.oxhide.vo.OxhideVO;

/**
 * 牛皮
 * @author lane
 *
 */
public class OxhideRS{
	
	
	/**
	 * 获取牛皮信息
	 * @param oxhideId
	 * @return
	 */
	@GET
	@Path("/select")
	public OxhideVO select(String oxhideId){
		System.out.println("xxxx");
		return null;
	}
	
	/**
	 * 返回多条牛皮
	 * @param oxhideIds
	 * @return
	 */
	@GET
	@Path("/selectList")
	public List<OxhideVO> selectList(String oxhideIds){
		System.out.println("xxxx");
		return null;
	}
	
	/**
	 * 创建牛皮
	 * @param oxhideVO
	 * @return
	 */
	@POST
	@Path("/create")
	public String create(OxhideVO oxhideVO){
		System.out.println("xxxx");
		return null;
	}
	
	/**
	 * 更新牛皮
	 * @param oxhideVO
	 * @return
	 */
	@POST
	@Path("/update")
	public String update(OxhideVO oxhideVO){
		System.out.println("xxxx");
		return null;
	}

}
