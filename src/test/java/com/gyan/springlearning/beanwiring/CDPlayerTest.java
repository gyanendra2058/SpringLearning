package com.gyan.springlearning.beanwiring;
import static org.junit.Assert.*;
import com.gyan.springlearning.beanwiring.configuration.CDPlayerConfig;
import com.gyan.springlearning.beanwiring.interfaces.CompactDisc;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
public class CDPlayerTest {
    @Autowired
    private CompactDisc cd;

    @Test
    public void cdShouldNotbeNull(){
        assertNotNull(cd);
    }
}
