package com.book.manage.action;

import java.util.Map;

import javax.servlet.http.Cookie;

import org.apache.struts2.ServletActionContext;

import com.book.manage.bean.User;
import com.book.manage.dao.UserDao;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author lfm
 *
 */
public class LoginAction extends ActionSupport {
	//����Ա��װ����
	private User user;
	//��½�����Ϣ
	private String msg;
	/**
	 * �����¼��ע�����Ա
	 */
	private static final long serialVersionUID = 1L;
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		UserDao dao = new UserDao();
		User u = dao.queryUser(user);
		if( u == null){
			setMsg("�˻����������");
			return "error";
		}
		Map<String, Object> map = ActionContext.getContext().getSession();
		Cookie c = new Cookie("user",String.valueOf(u.getId()));
		Cookie c2 = new Cookie("name",u.getName());
		ServletActionContext.getResponse().addCookie(c);
		ServletActionContext.getResponse().addCookie(c2);
		map.put(String.valueOf(u.getId()), u);
		return "success";
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
}
