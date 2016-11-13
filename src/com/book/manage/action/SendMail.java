package com.book.manage.action;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Random;

import org.apache.struts2.ServletActionContext;

import com.book.manage.utils.MailSenderInfo;
import com.book.manage.utils.SimpleMailSender;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
/**
 * @author lfm
 *
 */
public class SendMail extends ActionSupport{
	private static final long serialVersionUID = 5149616240257953949L;
	private String mail;
	
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		System.out.println(mail);
		Random r = new Random();
		int t = r.nextInt(8999)+1000;
		System.out.println(t);
		MailSenderInfo mailInfo = new MailSenderInfo();   
	     mailInfo.setToAddress(mail);   ///�Է�������
	     mailInfo.setSubject("��ӭע��ͼ�����ϵͳ����");   
	     mailInfo.setContent("����ע����֤����:"+t);
	     //�������Ҫ�������ʼ�  
	     SimpleMailSender sms = new SimpleMailSender();  
	     if(sms.sendTextMail(mailInfo)){    //���������ʽ   
	    	 ServletActionContext.getResponse().getWriter().write("success");
	    	 ActionContext.getContext().getSession().put(mail, t);
	     }
	     else ServletActionContext.getResponse().getWriter().write("error");
		return null;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
}
