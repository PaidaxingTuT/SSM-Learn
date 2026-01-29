package com.daxtech.service.Imp;

import com.daxtech.mapper.BookMapper;
import com.daxtech.service.BookService;

public class BookServiceImp implements BookService {
    //5.删除业务层中使用的new对象
    private BookMapper bookMapper;  // = new BookMapperImp();

    private int num;

    public void setNum(int num) {
        this.num = num;
    }
    public void save(){
        System.out.println("book service save"+num);
        bookMapper.save();
    }

    //自动注入

    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    /*public BookServiceImp(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }*/

    public void init(){
        System.out.println("service init...");
    }

    public void destroy(){
        System.out.println("service destroy...");
    }
}
