package com.daxtech.service.Imp;

import com.daxtech.mapper.BookMapper;
import com.daxtech.service.BookService;

public class BookServiceImp implements BookService {
    //5.删除业务层中使用的new对象
    private BookMapper bookMapper;  // = new BookMapperImp();
    public void save(){
        System.out.println("book service save");
        bookMapper.save();
    }

    //6.提供set方法用于属性注入
    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }
}
