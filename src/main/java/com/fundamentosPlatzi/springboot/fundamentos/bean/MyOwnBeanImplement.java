package com.fundamentosPlatzi.springboot.fundamentos.bean;

public class MyOwnBeanImplement implements MyOwnBean{
    @Override
    public void printMyMessage() {
        System.out.println("I have a dream, My data scientist job come true");
    }
}
