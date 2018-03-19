package com.gyan.springlearning.beanwiring.impl;

import com.gyan.springlearning.beanwiring.interfaces.CompactDisc;
import org.springframework.stereotype.Component;

public class SonuNigammMusic implements CompactDisc {
    public void play() {
        System.out.println("Bewafa Sanam");
    }
}
