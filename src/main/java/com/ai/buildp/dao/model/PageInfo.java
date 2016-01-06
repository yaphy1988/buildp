package com.ai.buildp.dao.model;

import java.util.List;

public class PageInfo<T> {
	private int pageSize;
	private int pageIndex;
	private int total;
	private List<T> result;// 结果集
	
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getPageIndex() {
		return pageIndex;
	}
	public void setPageIndex(int pageIndex) {
		this.pageIndex = pageIndex;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public List<T> getResult() {
		return result;
	}
	public void setResult(List<T> result) {
		this.result = result;
	}
	
	public int getStartIndex(){
		return (this.getPageIndex() - 1) * this.getPageSize() + 1;
	}
	
	public int getEndIndex(){
		return this.getPageIndex() * this.getPageSize();
	}
}
