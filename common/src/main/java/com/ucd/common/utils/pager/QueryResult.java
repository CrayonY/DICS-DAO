package com.ucd.common.utils.pager;

import java.util.List;

public class QueryResult<T> {
	/**分页数据集**/
	private List<T> resultlist;
	/**分页数据的总记录数**/
	private long totalrecord;
	
	public List<T> getResultlist() {
		return resultlist;
	}
	public void setResultlist(List<T> resultlist) {
		this.resultlist = resultlist;
	}
	public long getTotalrecord() {
		return totalrecord;
	}
	public void setTotalrecord(long totalrecord) {
		this.totalrecord = totalrecord;
	}
}
