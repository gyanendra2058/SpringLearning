package com.gyan.springlearning.beanwiring.impl;

import com.gyan.springlearning.beanwiring.interfaces.CompactDisc;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component("someRandomBeanIDForTesting")
public class HimeshReshamiyaMusic implements CompactDisc{
    private static final Logger log = Logger.getLogger(HimeshReshamiyaMusic.class.getName());
    public void play() {
        log.info("Tera tera tera surooor..");
    }
}
