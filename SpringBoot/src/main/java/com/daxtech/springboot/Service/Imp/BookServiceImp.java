package com.daxtech.springboot.Service.Imp;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.daxtech.springboot.Mapper.BookMapper;
import com.daxtech.springboot.Pojo.Book;
import com.daxtech.springboot.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImp implements BookService {

    @Autowired
    private BookMapper bookMapper;

    @Override
    public String check() {
        LambdaQueryWrapper<Book> lqw = new LambdaQueryWrapper<>();
        lqw.lt(Book::getId, 2);
        return bookMapper.selectList(lqw).toString();
    }
}
