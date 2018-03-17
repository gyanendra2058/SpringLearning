package com.gyan.springlearning.beanwiring;
import static org.junit.Assert.*;
import com.gyan.springlearning.beanwiring.configuration.CDPlayerConfig;
import com.gyan.springlearning.beanwiring.interfaces.CompactDisc;
import com.gyan.springlearning.beanwiring.interfaces.MediaPlayer;
import org.hamcrest.CoreMatchers;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.matchers.JUnitMatchers;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;
import static org.fest.assertions.api.Assertions.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
public class CDPlayerTest {
    @Rule
    public final StandardOutputStreamLog log = new StandardOutputStreamLog();

    @Autowired
    private CompactDisc cd;

    @Autowired
    private MediaPlayer player;

    @Test
    public void cdShouldNotbeNull(){
        assertNotNull(cd);
    }

    @Test
    public void play(){
        player.play();
        assertThat(log.getLog()).contains("Bewafa Sanam");
    }
}
