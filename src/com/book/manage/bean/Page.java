package com.book.manage.bean;

public class Page<T> {
	//����
	private int count;
	//��ҳ��С
	private static int blockSize = 8;
	//��ҳ�ĵ�ҳ���
	private T result;
	//��ҳ������
	private String index;
	//����ҳ��
	private int pageCount;
	//���ҳ��
	private int maxPage;
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getBlockSize() {
		return blockSize;
	}
	public void setBlockSize(int blockSize) {
		this.blockSize = blockSize;
	}
	public T getResult() {
		return result;
	}
	public void setResult(T result) {
		this.result = result;
	}
	public String getIndex() {
		return index;
	}
	public void setIndex(String index) {
		this.index = index;
	}
	public int getPageCount() {
		return pageCount;
	}
	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}
	public int getMaxPage() {
		return maxPage;
	}
	public void setMaxPage(int maxPage) {
		this.maxPage = maxPage;
	}	
	
}
