package com.kgc.controller;

import com.github.pagehelper.PageInfo;
import com.kgc.entity.Bookinfo;
import com.kgc.service.BookService;
import com.kgc.untils.BookinfoParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class BookinfoController {
    @Autowired
    private BookService bookService;
@RequestMapping("/index")
    public String index(@RequestParam(value = "pageIndex", defaultValue = "1") Integer pageIndex,
                        @RequestParam(value = "pageSize", defaultValue = "3") Integer pageSize,
                        BookinfoParam bookinfoParam,
                        Model model){

    PageInfo<Bookinfo> info = bookService.getBooKinfoListByPage(pageIndex, pageSize, bookinfoParam);
    model.addAttribute("bookinfoParam",bookinfoParam);
    model.addAttribute("info",info);

    return "index";
    }
}
