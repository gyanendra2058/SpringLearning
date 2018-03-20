package com.gyan.springlearning.beanwiring.impl;

import com.gyan.springlearning.beanwiring.interfaces.CompactDisc;
import com.gyan.springlearning.beanwiring.interfaces.MediaPlayer;

public class CDPlayerJC implements MediaPlayer{

    private CompactDisc cd;

    public CDPlayerJC(CompactDisc cd){
        this.cd = cd;
    }

    public void play() {
        cd.play();
    }
}
