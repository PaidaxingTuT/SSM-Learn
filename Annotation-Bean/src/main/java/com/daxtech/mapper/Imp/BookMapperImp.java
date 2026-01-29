package com.daxtech.mapper.Imp;

import com.daxtech.mapper.BookMapper;
import org.springframework.stereotype.Repository;

@Repository("bookMapper")
public class BookMapperImp implements BookMapper {
    //@Override
    public void save() {
        System.out.println("book mapper save");
    }
}
