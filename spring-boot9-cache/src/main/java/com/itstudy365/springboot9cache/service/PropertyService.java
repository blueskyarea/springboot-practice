package com.itstudy365.springboot9cache.service;

import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itstudy365.springboot9cache.cache.PropertyFileCachingListener;

@Service
public class PropertyService {
    private final PropertyFileCachingListener cachingListener;

    @Autowired
    public PropertyService(PropertyFileCachingListener cachingListener) {
        this.cachingListener = cachingListener;
    }

    public Properties getProperties(String propertyFileName) {
        return cachingListener.getCachedProperties(propertyFileName);
    }
}
