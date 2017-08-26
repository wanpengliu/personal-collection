package com.wanpeng.collection.collection.createmapbasedongenerictype;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class StringProcessor implements Processor<String> {
    private static final Logger logger = LoggerFactory.getLogger(StringProcessor.class);
    @Override
    public void process(String s) {
        logger.info("Processing String {}", s);
    }
}
