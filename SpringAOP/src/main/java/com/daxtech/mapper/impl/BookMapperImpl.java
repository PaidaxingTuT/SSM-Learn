package com.daxtech.mapper.impl;

import com.daxtech.mapper.BookMapper;
import org.springframework.stereotype.Repository;

@Repository
public class BookMapperImpl implements BookMapper {

    public void save() {

        System.out.println("Bookmapper save");
    }

    public void update() {
        System.out.println("Bookmapper update");
    }
}
