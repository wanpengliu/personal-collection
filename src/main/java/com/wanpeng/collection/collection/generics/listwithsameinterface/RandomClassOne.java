package com.wanpeng.collection.collection.generics.listwithsameinterface;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class RandomClassOne implements RandomInterface {

    private static final Logger logger = LoggerFactory.getLogger(RandomClassOne.class);

    @Override
    public void printSomething() {
        logger.info("Prints from {}", this.getClass().getName());
    }
}
