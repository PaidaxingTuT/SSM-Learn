package com.daxtech.springboot;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.daxtech.springboot.Mapper.BookMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApplicationTests {

    @Autowired
    BookMapper bookMapper;

    @Test
    void textByPages() {

        LambdaQueryWrapper<Book> lqw = new LambdaQueryWrapper<>();
        lqw.lt(Book::getId, 3);
        lqw.gt(Book::getId, 1);

        IPage page = new Page(1, 2);
        bookMapper.selectPage(page, null);
        System.out.println("当前页：" + page.getCurrent());
        System.out.println("每页显示条数：" + page.getSize());
        System.out.println("总页数：" + page.getPages());
        System.out.println("总记录数：" + page.getTotal());
        System.out.println("数据：" + page.getRecords());
    }

}
