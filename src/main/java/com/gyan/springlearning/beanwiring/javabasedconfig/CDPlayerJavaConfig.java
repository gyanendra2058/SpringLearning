package com.gyan.springlearning.beanwiring.javabasedconfig;

import com.gyan.springlearning.beanwiring.impl.*;
import com.gyan.springlearning.beanwiring.interfaces.CompactDisc;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CDPlayerJavaConfig {

    @Bean("himeshCdJC")
    public CompactDisc himeshCD() {
        return new HimeshReshamiyaMusic();
    }

    @Bean("sonuCdJC")
    public CompactDisc sonuCD() {
        return new SonuNigammMusic();
    }

    @Bean("uditCDJc")
    public CompactDisc uditCD() {
        return new UditNayaranMusic();
    }

    @Bean("randomArtist")

    public CompactDisc randomCD() {
        int randomChoice = (int) Math.floor(Math.random() * 3);
        switch (randomChoice) {
            case 1:
                return sonuCD();

            case 2:
                return himeshCD();

            case 3:
                return uditCD();

            default:
                return himeshCD();
        }
    }

    @Bean("cdPlayerJCWithHimesh")
    CDPlayerJC cdPlayerWithHimeshJC() {
        return new CDPlayerJC(himeshCD());
    }

    @Bean("cdPlayerJCWithSonu")
    CDPlayerJC cdPlayerWithSonuJC() {
        return new CDPlayerJC(sonuCD());
    }

    @Bean("cdPlayerJCWithUdit")
    CDPlayerJC cdPlayerWithUditJC() {
        return new CDPlayerJC(uditCD());
    }

    @Bean("cdPlayerJCWithrandomArtist")
    CDPlayerJC cdPlayerWithRandomJC() {
        return new CDPlayerJC(randomCD());
    }
}
