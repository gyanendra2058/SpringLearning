package com.gyan.springlearning.diconcepts.runner;

import com.gyan.springlearning.diconcepts.impl.BraveKnight;
import com.gyan.springlearning.diconcepts.impl.SlayDragonQuest;
import com.gyan.springlearning.diconcepts.interfaces.Knight;
import com.gyan.springlearning.diconcepts.interfaces.Quest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMain {
    public static void main(String[] args){
        ClassPathXmlApplicationContext  applicationContext = new ClassPathXmlApplicationContext("appContext.xml");
        Knight knight = applicationContext.getBean(Knight.class);
        knight.embarkQuest();
        applicationContext.close();
    }
}
