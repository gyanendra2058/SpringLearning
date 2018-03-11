package com.gyan.springlearning.diconcepts;

import com.gyan.springlearning.diconcepts.impl.BraveKnight;
import com.gyan.springlearning.diconcepts.impl.BraveKnightMinstrel;
import com.gyan.springlearning.diconcepts.impl.SlayDragonQuest;
import com.gyan.springlearning.diconcepts.interfaces.Knight;
import com.gyan.springlearning.diconcepts.interfaces.Minstrel;
import com.gyan.springlearning.diconcepts.interfaces.Quest;
import org.junit.Ignore;
import org.junit.Test;
import org.mockito.Mock;

import static org.mockito.Mockito.*;

public class BraveKnightTest {
    @Ignore
    @Test
    public void testEmbarkQuestShouldCallStayDragonQuest() {
        Quest mockQuest = mock(SlayDragonQuest.class);
        Minstrel mockMinstrel = mock(BraveKnightMinstrel.class);
        Knight knight = new BraveKnight(mockQuest, mockMinstrel);
        knight.embarkQuest();
        verify(mockQuest, times(1)).emabark();

    }
}
