package com.gyan.springlearning.beanwiring.impl;

import com.gyan.springlearning.beanwiring.interfaces.CompactDisc;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BlankDisc implements CompactDisc {
    private String title;
    private String artist;
    private List<String> tracks;

    public BlankDisc(String title, String artist, List<String> tracks){
        this.title = title;
        this.artist = artist;
        this.tracks = tracks;
    }
    public void play() {
        System.out.println("Playing song "+this.title +" by "+this.artist);
        for(String track : tracks){
           System.out.println(track);
        }
    }
}
