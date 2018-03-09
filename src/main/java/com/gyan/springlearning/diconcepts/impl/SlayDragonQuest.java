package com.gyan.springlearning.diconcepts.impl;

import com.gyan.springlearning.diconcepts.interfaces.Quest;

import java.util.logging.Logger;

public class SlayDragonQuest implements Quest {
    Logger logger = Logger.getLogger(SlayDragonQuest.class.getName());

    public void emabark() {
        logger.info("SlayDragon quest is being embarked!");
    }
}
