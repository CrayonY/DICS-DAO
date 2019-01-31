package com.ucd.common.utils.pager;

import java.util.ArrayList;
import java.util.List;

public class PageView<T> {
	/** 分页数据 **/
	private List<T> records;
	/** 页码开始索引和结束索引 **/
	private PageIndex pageindex;
	/** 总页数 **/
	private long totalpage = 1;
	/** 每页显示记录数 **/
	private int maxresult = 20;
	/** 当前页 **/
	private int currentpage = 1;
	/** 总记录数 **/
	private long totalrecord;
	/** 页码数量 **/
	private int pagecode = 10;

//	private boolean success = true;
//
//	private String recode = "000000";
//
//	private String msg = "成功";
//
//	private int draw=1;
	/** 要获取记录的开始索引 **/
	public int getFirstResult() {
		return (this.currentpage-1)*this.maxresult;
	}
	public int getPagecode() {
		return pagecode;
	}

	public void setPagecode(int pagecode) {
		this.pagecode = pagecode;
	}
	
	public PageView() {
		
	}

	public PageView(int maxresult, int currentpage) {
		this.maxresult = maxresult;
		this.currentpage = currentpage;
	}
	
	public void setQueryResult(QueryResult<T> qr){
		setTotalrecord(qr.getTotalrecord());
		setRecords(qr.getResultlist());
	}
	
	public long getTotalrecord() {
		return totalrecord;
	}
	public void setTotalrecord(long totalrecord) {
		this.totalrecord = totalrecord;
		setTotalpage(this.totalrecord%this.maxresult==0? this.totalrecord/this.maxresult : this.totalrecord/this.maxresult+1);
	}
	public List<T> getRecords() {
		if(records == null)
			records = new ArrayList<T>();
		return records;
	}
	public void setRecords(List<T> records) {
		this.records = records;
	}
	public PageIndex getPageindex() {
		return pageindex;
	}
	public long getTotalpage() {
		return totalpage==0?1:totalpage;
	}
	public void setTotalpage(long totalpage) {
		this.totalpage = totalpage;
		this.pageindex = PageIndex.getPageIndex(pagecode, currentpage, totalpage);
	}
	public int getMaxresult() {
		return maxresult;
	}
	public int getCurrentpage() {
		return currentpage;
	}
	
	public void setCurrentpage(int currentpage) {
		this.currentpage = currentpage;
	}
	public void setMaxresult(int maxresult) {
		this.maxresult = maxresult;
	}


	//	public int getDraw() {
//		return draw;
//	}
//	public void setDraw(int draw) {
//		this.draw = draw;
//	}
//	public boolean isSuccess() {
//		return success;
//	}
//	public void setSuccess(boolean success) {
//		this.success = success;
//	}
//	public String getRecode() {
//		return recode;
//	}
//	public void setRecode(String recode) {
//		this.recode = recode;
//	}
//	public String getMsg() {
//		return msg;
//	}
//	public void setMsg(String msg) {
//		this.msg = msg;
//	}
	
}
