package me.bob.java.algorithm;

import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;

public class AutowiredAndResource {

    @Autowired
    private String string;
    @Resource
    private String strings;
}
