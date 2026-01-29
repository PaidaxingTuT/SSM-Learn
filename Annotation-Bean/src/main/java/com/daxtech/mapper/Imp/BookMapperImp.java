package com.daxtech.mapper.Imp;

import com.daxtech.mapper.BookMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

@Repository("bookMapper")
public class BookMapperImp implements BookMapper {

    @Value("${name}")
    private String name;

    //@Override
    public void save() {
        System.out.println("book mapper save");
        System.out.println(name);
    }
}
