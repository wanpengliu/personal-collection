package com.wanpeng.collection.collection.createmapbasedongenerictype;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class GameProcessor implements Processor<Game>{

    private static final Logger logger = LoggerFactory.getLogger(GameProcessor.class);
    @Override
    public void process(Game game) {
        logger.info("Processing game {}", game.getName());
    }
}
