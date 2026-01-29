package com.daxtech.service.Imp;

import com.daxtech.mapper.BookMapper;
import com.daxtech.service.BookService;

import java.util.Arrays;
import java.util.Map;
import java.util.Properties;

public class BookServiceImp implements BookService {
    //5.删除业务层中使用的new对象
    private BookMapper bookMapper;  // = new BookMapperImp();

    private int num;

    private int[] arr;

    private Map<String,String> map;

    private Properties prop;

    public void setNum(int num) {
        this.num = num;
    }
    public void save(){
        System.out.println("book service save");
        System.out.println("常规变量:" + num);
        System.out.println("数组:" + Arrays.toString(arr));
        System.out.println("map:" + map);
        System.out.println("properties:" + prop);
        bookMapper.save();
    }

    //自动注入

    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    //数组set方法
    public void setArr(int[] arr) {
        this.arr = arr;
    }

    //map set方法
    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    //properties set方法
    public void setProp(Properties prop) {
        this.prop = prop;
    }

    /*public BookServiceImp(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }*/

    public void init(){
        System.out.println("service init...");
    }

    public void destroy(){
        System.out.println("service destroy...");
    }
}
