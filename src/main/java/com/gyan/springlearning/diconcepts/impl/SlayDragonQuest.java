package com.gyan.springlearning.diconcepts.impl;

import com.gyan.springlearning.diconcepts.interfaces.Quest;

import java.io.PrintStream;
import java.util.logging.Logger;

public class SlayDragonQuest implements Quest {

    private PrintStream stream;

    public SlayDragonQuest(PrintStream stream) {
        this.stream = stream;
    }


    public void emabark() {
        stream.println("Slay dragon emabark");
    }
}
