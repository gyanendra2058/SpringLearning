package com.gyan.springlearning.diconcepts;

import com.gyan.springlearning.diconcepts.impl.BraveKnight;
import com.gyan.springlearning.diconcepts.impl.SlayDragonQuest;
import com.gyan.springlearning.diconcepts.interfaces.Knight;
import com.gyan.springlearning.diconcepts.interfaces.Quest;
import org.junit.Test;
import org.mockito.Mock;

import static org.mockito.Mockito.*;

public class BraveKnightTest {

    @Test
    public void testEmbarkQuestShouldCallStayDragonQuest() {
        Quest mockQuest = mock(SlayDragonQuest.class);
        Knight knight = new BraveKnight(mockQuest);
        knight.embarkQuest();
        verify(mockQuest, times(1)).emabark();

    }
}
