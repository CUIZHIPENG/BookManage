package com.book.manage.test;

import java.util.Properties;
import java.util.Random;
import org.junit.Test;
import com.book.manage.utils.MailSenderInfo;
import com.book.manage.utils.SimpleMailSender;

public class MailTest {
	@Test
	public void send(){
		Random r = new Random();
		int t = r.nextInt(8999)+1000;
		System.out.println(t);
		MailSenderInfo mailInfo = new MailSenderInfo();   
	     mailInfo.setToAddress("1226007593@qq.com");   ///�Է�������
	     mailInfo.setSubject("��ӭע��ͼ�����ϵͳ����");   
	     mailInfo.setContent("����ע����֤����:"+t);
	     //�������Ҫ�������ʼ�  
	     SimpleMailSender sms = new SimpleMailSender();  
	     if(sms.sendTextMail(mailInfo)){    //���������ʽ   
	    	 System.out.println("���ͳɹ���");
	     }
	  //   sms.sendHtmlMail(mailInfo);//����html��ʽ
	}
}
