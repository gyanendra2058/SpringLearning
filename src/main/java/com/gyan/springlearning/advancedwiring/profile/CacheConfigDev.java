package com.gyan.springlearning.advancedwiring.profile;

import org.springframework.cache.CacheManager;
import org.springframework.cache.concurrent.ConcurrentMapCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.logging.Logger;
@Configuration
@Profile("dev")
public class CacheConfigDev {

    private static final Logger log = Logger.getLogger(CacheConfigDev.class.getName());

    @Bean
    public CacheManager concurrentMapCacheManager() {
        log.info("Cache manager is concurrentMapCacheManager");
        return new ConcurrentMapCacheManager("movieFindCache");
    }
}
