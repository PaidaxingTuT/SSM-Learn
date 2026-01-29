package com.daxtech.service.Imp;

import com.daxtech.mapper.BookMapper;
import com.daxtech.service.BookService;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImp implements BookService {

    private BookMapper bookMapper;

    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    public void save() {
        System.out.println("book service save");
        bookMapper.save();
    }


}
