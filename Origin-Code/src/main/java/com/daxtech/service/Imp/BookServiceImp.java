package com.daxtech.service.Imp;

import com.daxtech.mapper.BookMapper;
import com.daxtech.mapper.Imp.BookMapperImp;
import com.daxtech.service.BookService;

public class BookServiceImp implements BookService {
    private BookMapper bookMapper = new BookMapperImp();
    public void save(){
        System.out.println("book service save");
        bookMapper.save();
    }

}
