package com.example.demo;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

@Service
public class MyService {
 
    @Resource(name = "myDAO")
    private MyDAO myDAO;
}
