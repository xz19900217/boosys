package com.kgc.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kgc.entity.Bookinfo;
import com.kgc.entity.BookinfoExample;
import com.kgc.mapper.BookinfoMapper;
import com.kgc.service.BookService;
import com.kgc.untils.BookinfoParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookinfoMapper bookinfoMapper;
    @Override
    public PageInfo<Bookinfo> getBooKinfoListByPage(Integer pageIndex, Integer pageSize, BookinfoParam bookinfoParam) {
        BookinfoExample example=new BookinfoExample();
        example.setOrderByClause("bookid");

        BookinfoExample.Criteria criteria = example.createCriteria();
        if (bookinfoParam!=null){
            if (bookinfoParam.getBookname()!=null&&!bookinfoParam.getBookname().equals("")){
                criteria.andBooknameLike("%"+bookinfoParam.getBookname()+"%");
            }
            if (bookinfoParam.getBooktype()!=null&&bookinfoParam.getBooktype().equals("")){
                criteria.andBooktypeEqualTo(bookinfoParam.getBooktype());
            }
            if (bookinfoParam.getIsborrow()!=null&&bookinfoParam.getIsborrow().equals("")){
                criteria.andIsborrowEqualTo(bookinfoParam.getIsborrow());
            }
        }



        PageHelper.startPage(pageIndex,pageSize);
        List<Bookinfo> clothesList = bookinfoMapper.selectByExample(example);

        PageInfo<Bookinfo> info=new PageInfo<>(clothesList,5);

        return info;
    }
}
