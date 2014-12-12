package com.oxhide.rs.impl;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import com.oxhide.vo.AttachmentVO;

public class AttachmentRS {
	
	/**
	 * 上次附件
	 * @return
	 */
	@POST
	@Path("/upload")
	public String upload(){
		return null;
	}
	
	
	/**
	 * 附件下载
	 * @param attVO
	 */
	@GET
	@Path("/download")
	public void download(AttachmentVO attVO){
		
	}

}
