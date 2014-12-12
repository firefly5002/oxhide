package com.oxhide.rs.impl;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import com.oxhide.vo.OxhideVO;
import com.oxhide.vo.ReplyVO;

/**
 * 回复信息
 * @author lane
 *
 */
public class ReplyRS {

	
	/**
	 * 创建回复
	 * @param replyVO
	 * @return
	 */
	@POST
	@Path("/create")
	public String create(ReplyVO replyVO){
		System.out.println("xxxx");
		return null;
	}
	
	/**
	 * 查询单挑回复
	 * @param oxhideId
	 * @return
	 */
	@GET
	@Path("/select")
	public ReplyVO select(String replyId){
		System.out.println("xxxx");
		return null;
	}
	
	/**
	 * 查询牛皮的所有回复
	 * @param oxhideIds
	 * @return
	 */
	@GET
	@Path("/selectList")
	public List<ReplyVO> selectList(String oxhideId){
		System.out.println("xxxx");
		return null;
	}
	
	@POST
	@Path("/select")
	public String delete(ReplyVO replyVO){
		System.out.println("xxxx");
		return null;
	}
}
