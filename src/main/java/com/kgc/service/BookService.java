package com.kgc.service;

import com.github.pagehelper.PageInfo;
import com.kgc.entity.Bookinfo;
import com.kgc.untils.BookinfoParam;

public interface BookService {

    public PageInfo<Bookinfo> getBooKinfoListByPage(Integer pageIndex, Integer pageSize, BookinfoParam bookinfoParam);
}
