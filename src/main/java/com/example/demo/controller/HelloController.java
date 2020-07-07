package com.example.demo.controller;

import com.example.demo.mapper.ItemsMapper;

import com.example.demo.pojo.Items;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired(required = false)
        ItemsMapper mapper;

    @RequestMapping("/hell")
    public Items hello(Integer id) {
        Items items = mapper.selectByPrimaryKey(id);
        return items;


    }

}
