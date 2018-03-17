package com.gyan.springlearning.beanwiring.impl;

import com.gyan.springlearning.beanwiring.interfaces.CompactDisc;
import org.springframework.stereotype.Component;

public class HimeshReshamiyaMusic implements CompactDisc{
    public void play() {
        System.out.println("Tera tera tera surooor");
    }
}
