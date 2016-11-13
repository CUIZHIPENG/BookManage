package com.book.manage.utils;
import java.util.Properties;
public class MailSenderInfo {
    // �ʼ������ߵĵ�ַ   
    private String toAddress;   
    // ��½�ʼ����ͷ��������û���������   
    private String subject;   
    // �ʼ����ı�����   
    private String content;   
    // �ʼ��������ļ���   
    private String[] attachFileNames;     
    /**  
      * ����ʼ��Ự����  
      */   
    public Properties getProperties(){
    	 Properties p = new Properties();   
    	final String SSL_FACTORY = "javax.net.ssl.SSLSocketFactory";
    	p.setProperty("mail.smtp.socketFactory.class", SSL_FACTORY);
    	p.setProperty("mail.smtp.socketFactory.fallback", "false");
    	p.setProperty("mail.smtp.socketFactory.port", ServerConst.mailPort); 
    	p.put("mail.smtp.host", ServerConst.mailHost);   
    	p.put("mail.smtp.port", ServerConst.mailPort);   
    	p.put("mail.smtp.auth",  "true" );
    	p.setProperty("mail.debug", ServerConst.mailDebug);
      return p;   
    }   
    public String[] getAttachFileNames() {   
      return attachFileNames;   
    }  
    public void setAttachFileNames(String[] fileNames) {   
      this.attachFileNames = fileNames;   
    }  
    public String getToAddress() {   
      return toAddress;   
    }   
    public void setToAddress(String toAddress) {   
      this.toAddress = toAddress;   
    }   
    public String getSubject() {   
      return subject;   
    }  
    public void setSubject(String subject) {   
      this.subject = subject;   
    }  
    public String getContent() {   
      return content;   
    }  
    public void setContent(String textContent) {   
      this.content = textContent;   
    }   

}