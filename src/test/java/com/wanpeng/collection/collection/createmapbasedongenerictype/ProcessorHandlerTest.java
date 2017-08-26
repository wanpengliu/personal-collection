package com.wanpeng.collection.collection.createmapbasedongenerictype;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class ProcessorHandlerTest {
    @Test
    public void handle() throws Exception {

        ProcessorHandler processorHandler = new ProcessorHandler(Arrays.asList(new GameProcessor(), new IntegerProcessor(), new StringProcessor()));
        processorHandler.handle(new Game("interesting game"));
        processorHandler.handle(new Integer(5));
        processorHandler.handle("Hello world");

    }

}