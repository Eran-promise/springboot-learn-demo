package com.web.springbootmail.service;
/**
* @author Promise
* @createTime 2019年3月30日 下午3:14:14
* @description 
*/
public interface IMailService {
	
	/**
	 * 简单文本邮件
	 * @param toUser 邮件接收者
	 */
	void simpleMil(String toUser)throws Exception;
	
	/**
	 * html邮件
	 * @param toUser 邮件接收者
	 */
	void htmlMail(String toUser) throws Exception;
	
	/**
	 * 带附件邮件
	 * @param toUser 邮件接收者
	 */
	void attachmentMail(String toUser)throws Exception;
	
	/**
	 * 带图片邮件
	 * @param toUser 邮件接收者
	 */
	void imgMail(String toUser)throws Exception;
	
	/**
	 * 模板邮件
	 * @param toUser 邮件接收者
	 */
	void TemplateMail(String toUser)throws Exception;
	
}
