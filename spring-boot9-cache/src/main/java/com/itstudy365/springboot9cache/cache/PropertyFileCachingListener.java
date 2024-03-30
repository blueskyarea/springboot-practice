package com.itstudy365.springboot9cache.cache;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;
import com.github.benmanes.caffeine.cache.Cache;
import com.github.benmanes.caffeine.cache.Caffeine;

@Component
public class PropertyFileCachingListener implements ApplicationListener<ContextRefreshedEvent> {

    private final ResourceLoader resourceLoader;
    private final Cache<String, Properties> propertyCache;

    @Autowired
    public PropertyFileCachingListener(ResourceLoader resourceLoader) {
        this.resourceLoader = resourceLoader;
        this.propertyCache = Caffeine.newBuilder().build(); // Initialize the cache
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        // Logic to cache property files goes here
        System.out.println("Context refreshed. Caching property files...");

        // Load and cache property file
        String propertyFileName = "application.properties";
        Resource propertyResource = resourceLoader.getResource("classpath:" + propertyFileName);
        if (propertyResource.exists()) {
            try (InputStream inputStream = propertyResource.getInputStream()) {
                Properties properties = new Properties();
                properties.load(inputStream);
                propertyCache.put(propertyFileName, properties);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        // You can add more logic for caching additional property files or using a
        // different caching library
    }

    public Properties getCachedProperties(String propertyFileName) {
        return propertyCache.getIfPresent(propertyFileName);
    }

}
