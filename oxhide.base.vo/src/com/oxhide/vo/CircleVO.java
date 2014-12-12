package com.oxhide.vo;

import java.util.Date;


/***
 * 牛皮圈
 * @author lane
 *
 */
public class CircleVO {
	
	/**
	 * 圈子ID
	 */
	private String id;
	
	/**
	 * 圈子名称
	 */
	private String circleName;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCircleName() {
		return circleName;
	}

	public void setCircleName(String circleName) {
		this.circleName = circleName;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public String getUserIds() {
		return userIds;
	}

	public void setUserIds(String userIds) {
		this.userIds = userIds;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCreationBy() {
		return creationBy;
	}

	public void setCreationBy(String creationBy) {
		this.creationBy = creationBy;
	}

	public Date getCreationTime() {
		return creationTime;
	}

	public void setCreationTime(Date creationTime) {
		this.creationTime = creationTime;
	}

	/**
	 * 圈子类型
	 */
	private String type;
	
	/**
	 * 圈子主题
	 */
	private String subject;
	
	/**
	 * 关键字
	 */
	private String keyword;
	
	/**
	 * 用户ID列表
	 */
	private String userIds;
	
	/**
	 * 圈子描述
	 */
	private String description;
	
	/**
	 * 创建者
	 */
	private String creationBy;
	
	/**
	 * 创建时间
	 */
	private Date creationTime;
	
	
	

}
