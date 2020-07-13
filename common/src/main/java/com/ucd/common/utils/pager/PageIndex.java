package com.ucd.common.utils.pager;

public class PageIndex {
    /**
     * 开始页数
     **/
    private long startindex;
    /**
     * 结束页数
     **/
    private long endindex;

    public PageIndex(long startindex, long endindex) {
        this.startindex = startindex;
        this.endindex = endindex;
    }

    public long getStartindex() {
        return startindex;
    }

    public void setStartindex(long startindex) {
        this.startindex = startindex;
    }

    public long getEndindex() {
        return endindex;
    }

    public void setEndindex(long endindex) {
        this.endindex = endindex;
    }

    /**
     * 根据参数构造一个PageIndex对象
     *
     * @param viewpagecount 要显示的页数
     * @param currentPage   当前页数
     * @param totalpage     总页数
     * @return PageIndex实例
     */
    public static PageIndex getPageIndex(long viewpagecount, int currentPage, long totalpage) {
        long startpage = currentPage - (viewpagecount % 2 == 0 ? viewpagecount / 2 - 1 : viewpagecount / 2);
        long endpage = currentPage + viewpagecount / 2;
        if (startpage < 1) {
            startpage = 1;
            if (totalpage >= viewpagecount) endpage = viewpagecount;
            else endpage = totalpage;
        }
        if (endpage > totalpage) {
            endpage = totalpage;
            if ((endpage - viewpagecount) > 0) startpage = endpage - viewpagecount + 1;
            else startpage = 1;
        }
        return new PageIndex(startpage, endpage);
    }
}
