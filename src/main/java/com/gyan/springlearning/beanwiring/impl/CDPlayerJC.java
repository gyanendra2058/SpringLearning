package com.gyan.springlearning.beanwiring.impl;

import com.gyan.springlearning.beanwiring.interfaces.CompactDisc;
import com.gyan.springlearning.beanwiring.interfaces.MediaPlayer;
import org.springframework.beans.factory.annotation.Autowired;

public class CDPlayerJC implements MediaPlayer{
    @Autowired
    private CompactDisc cd;

    public CDPlayerJC(CompactDisc cd){
        this.cd = cd;
    }

    public void play() {
        cd.play();
    }
}
