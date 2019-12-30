package com.money.demo.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.data.couchbase.config.AbstractCouchbaseConfiguration;

import java.util.Collections;
import java.util.List;

@Configuration
public class CouchBaseConfig extends AbstractCouchbaseConfiguration {
    
    @Override
    protected List<String> getBootstrapHosts() {
        return Collections.singletonList("127.0.0.1");
    }
    
    @Override
    protected String getBucketName() {
        return "testcase";
    }
    
    @Override
    protected String getBucketPassword() {
        return "admin123";
    }
    
    @Override
    protected String getUsername() {
        return "Administrator";
    }
}


