package com.wanpeng.collection.collection.generics.listwithsameinterface;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

@Component
public class RandomHandler {

    private static final Logger logger = LoggerFactory.getLogger(RandomHandler.class);

    private List<RandomInterface> interfaces;

    @Autowired
    public RandomHandler(List<RandomInterface> interfaces) {
        this.interfaces = interfaces;
    }

    @PostConstruct
    public void post() {
        logger.info("This is the demo Spring creates a list of objects shares the same interface");
        interfaces.forEach(RandomInterface::printSomething);
    }
}
