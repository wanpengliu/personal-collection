package com.wanpeng.collection.collection.createmapbasedongenerictype;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class IntegerProcessor implements Processor<Integer> {

    private static final Logger logger = LoggerFactory.getLogger(IntegerProcessor.class);
    @Override
    public void process(Integer integer) {
            logger.info("Processing integer {}", integer);
    }
}
