package com.daxtech.springboot;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.daxtech.springboot.Mapper.BookMapper;
import com.daxtech.springboot.Pojo.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApplicationTests {

    @Autowired
    BookMapper bookMapper;

    Book book = new Book();


    @Test
    void textByPages() {

        LambdaQueryWrapper<Book> lqw = new LambdaQueryWrapper<>();
        lqw.lt(Book::getId, 3)
           .gt(Book::getId, 1);
        IPage page = new Page(1, 2);
        bookMapper.selectPage(page, lqw);
        System.out.println(page.getRecords());

    }

}
