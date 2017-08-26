package com.wanpeng.collection.collection.createmapbasedongenerictype;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


@Service
public class ProcessorHandler {

    private List<Processor> processors;

    private ImmutableMap<Class, Processor> processorImmutableMap;

    @Autowired
    public ProcessorHandler(List<Processor> processors) {
        this.processors = processors;
        processorImmutableMap = Maps.uniqueIndex(processors, Processor::getType);
    }

    public void handle(Object o) {
        Processor processor = processorImmutableMap.get(o.getClass());
        if(processor != null){
            processor.process(o);
        }

    }

}
