package com.spring;

import org.springframework.stereotype.Component;

@Component
public class Laptop {

    public Laptop(){
        System.out.println("Laptop Object Created");
    }

    public void Compile(){
        System.out.println("Compiling....");
    }
}
