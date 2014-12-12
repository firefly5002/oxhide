package com.oxhide.vo;

/**
 * 牛皮信息
 * @author lane
 *
 */
public class OxhideVO {
	
	/**
	 * 牛皮ID
	 */
	private String id;
	
	/**
	 * 牛皮分类主题
	 */
	private String subject;
	
	/**
	 * 牛皮关键字
	 */
	private String keyWord;
	
	/**
	 * 牛皮完成进度
	 */
	private int progress;
	
	/**
	 * 牛皮状态，删除等
	 */
	private int status;
	
	/**
	 * 牛皮内容
	 */
	private String context;
	
	/**
	 * 父牛皮ID
	 */
	private String pId;
	
	/**
	 * 奖励内容
	 */
	private String award;

	/**
	 * 奖励附件ID
	 */
	private String awardAttId;
	
	/**
	 * 惩罚内容ID
	 */
	private String punish;
	
	/**
	 * 惩罚附件ID
	 */
	private String punishAttId;
	
	/**
	 * 回复牛皮的内容ID
	 */
	private String replyId;
	
	/**
	 * 牛皮ID被查看的次数
	 */
	private int readCount;
	
	/**
	 * 牛皮回复的总次数
	 */
	private int replyCount;
	

}
