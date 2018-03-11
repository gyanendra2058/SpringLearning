package com.gyan.springlearning.diconcepts.impl;

import com.gyan.springlearning.diconcepts.interfaces.Knight;
import com.gyan.springlearning.diconcepts.interfaces.Minstrel;
import com.gyan.springlearning.diconcepts.interfaces.Quest;

public class BraveKnight implements Knight {
    private Quest quest;
    private Minstrel minstrel;
    public BraveKnight(Quest quest, Minstrel minstrel) {
        this.quest = quest;
        this.minstrel = minstrel;
    }

    public void embarkQuest() {
        quest.emabark();
    }
}
