package com.oxhide.rs.impl;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import com.oxhide.vo.CircleVO;

public class CircleRS {
	
	/**
	 * 创建朋友圈
	 * @param circleVO
	 * @return
	 */
	@POST
	@Path("/create")
	public String create(CircleVO circleVO){
		return null;
		
	}
	
	/**
	 * 修改
	 * @param circleVO
	 * @return
	 */
	@POST
	@Path("/update")
	public String update(CircleVO circleVO){
		return null;
		
	}
	
	/**
	 * 删除
	 * @param circleVO
	 * @return
	 */
	@POST
	@Path("/delete")
	public String delete(CircleVO circleVO){
		return null;
		
	}
	
	/**
	 * 查询
	 * @param circleVO
	 * @return
	 */
	@GET
	@Path("/select")
	public String select(CircleVO circleVO){
		
		
		return null;
		
	}
 
}
