package com.oxhide.db;


import com.oxhide.vo.AttachmentVO;

public interface IAttachment {
	
	public String insert(AttachmentVO attaVO);
	
	public void remove(String id);
	
	public void update(AttachmentVO attaVO);
	
	public void findOne(AttachmentVO attaVO);
	
	public void findAll(AttachmentVO attaVO);

}
