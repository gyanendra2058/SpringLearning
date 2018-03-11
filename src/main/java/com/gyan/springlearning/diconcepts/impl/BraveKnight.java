package com.gyan.springlearning.diconcepts.impl;

import com.gyan.springlearning.diconcepts.interfaces.Knight;
import com.gyan.springlearning.diconcepts.interfaces.Minstrel;
import com.gyan.springlearning.diconcepts.interfaces.Quest;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class BraveKnight implements Knight, InitializingBean, DisposableBean {
    private Quest quest;
    private Minstrel minstrel;
    public BraveKnight(Quest quest, Minstrel minstrel) {
        this.quest = quest;
        this.minstrel = minstrel;
    }

    public void embarkQuest() {
        quest.emabark();
    }

    public void destroy() throws Exception {
        System.out.println("Going to close the stream of slayDragonQuestPrintStream");
        SlayDragonQuest slayDragonQuest = (SlayDragonQuest)quest;
        slayDragonQuest.getStream().close();
    }

    public void afterPropertiesSet() throws Exception {
        SlayDragonQuest slayDragonQuest = (SlayDragonQuest)quest;
        if(slayDragonQuest.getStream().equals(System.out)){
            System.out.println("Going to alter the stream of SlayDragonQuest");
            slayDragonQuest.setStream(new PrintStream("slayDragonQuestPrintStream.txt"));
        }
    }
}
