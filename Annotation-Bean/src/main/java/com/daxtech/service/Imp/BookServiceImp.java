package com.daxtech.service.Imp;

import com.daxtech.mapper.BookMapper;
import com.daxtech.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("singleton")
public class BookServiceImp implements BookService {

    @Autowired
    private BookMapper bookMapper;

    public void save() {
        System.out.println("book service save");
        bookMapper.save();
    }


}
