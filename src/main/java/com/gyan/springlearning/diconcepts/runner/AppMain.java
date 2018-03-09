package com.gyan.springlearning.diconcepts.runner;

import com.gyan.springlearning.diconcepts.impl.BraveKnight;
import com.gyan.springlearning.diconcepts.impl.SlayDragonQuest;
import com.gyan.springlearning.diconcepts.interfaces.Knight;
import com.gyan.springlearning.diconcepts.interfaces.Quest;

public class AppMain {
    public static void main(String[] args){
        Quest mockQuest = new SlayDragonQuest();
        Knight knight = new BraveKnight(mockQuest);
        knight.embarkQuest();
        System.out.println("test");
    }
}
