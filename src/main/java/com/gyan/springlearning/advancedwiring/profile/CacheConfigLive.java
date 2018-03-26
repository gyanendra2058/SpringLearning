package com.gyan.springlearning.advancedwiring.profile;

import org.springframework.cache.CacheManager;
import org.springframework.cache.ehcache.EhCacheCacheManager;
import org.springframework.cache.ehcache.EhCacheManagerFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.core.io.ClassPathResource;
import java.util.logging.Logger;

@Configuration
@Profile("live")
public class CacheConfigLive {

        private static final Logger log = Logger.getLogger(CacheConfigDev.class.getName());

        @Bean
        public CacheManager cacheManager() {
            log.info("Cache manager is ehCacheCacheManager");
            return new EhCacheCacheManager(ehCacheCacheManager().getObject());
        }

        @Bean
        public EhCacheManagerFactoryBean ehCacheCacheManager() {
            EhCacheManagerFactoryBean cmfb = new EhCacheManagerFactoryBean();
            cmfb.setConfigLocation(new ClassPathResource("cache/ehcache.xml"));
            cmfb.setShared(true);
            return cmfb;
        }

    }

