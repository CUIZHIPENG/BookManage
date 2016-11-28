package com.book.manage.action;

import java.util.List;

import com.book.manage.bean.Reader;
import com.book.manage.dao.ReaderDao;
import com.book.manage.dao.UserDao;
import com.book.manage.utils.DBHelper;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author lfm
 *
 */
public class QueryReader extends ActionSupport{
	/**
	 * 
	 */
	//��ѯ���״̬��Ϣ
	private String state;
	//��ѯ���
	private List<Reader> readers;
	//��ѯ�Ĳ���������ID
	private String param;
	private static final long serialVersionUID = 6085602299054684400L;
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		ReaderDao dao = new ReaderDao();
		readers = dao.qureyByParam(param);
		if(readers.size()==0)
			state="�޲�ѯ��¼������ID";
		return super.execute();
	}
	
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public List<Reader> getReaders() {
		return readers;
	}
	public void setReaders(List<Reader> readers) {
		this.readers = readers;
	}
	public String getParam() {
		return param;
	}
	public void setParam(String param) {
		this.param = param;
	}
	
}
