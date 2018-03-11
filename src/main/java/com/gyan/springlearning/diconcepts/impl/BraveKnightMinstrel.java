package com.gyan.springlearning.diconcepts.impl;

import com.gyan.springlearning.diconcepts.interfaces.Minstrel;

import java.io.PrintStream;

public class BraveKnightMinstrel implements Minstrel {
    private PrintStream stream;

    public BraveKnightMinstrel(PrintStream stream){
        this.stream = stream;
    }

    public void singBeforeQuest(){
        stream.println("Singing before quest!");
    }

    public void singAfterQuest(){
        stream.println("Singing after quest!");
    }
}
