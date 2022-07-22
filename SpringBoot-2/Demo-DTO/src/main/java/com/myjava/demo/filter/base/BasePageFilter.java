package com.myjava.demo.filter.base;

import com.myjava.demo.request.base.BaseRequest;

public class BasePageFilter extends BaseRequest {
    private  Integer page;
    private  Integer pageSize;

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
}
