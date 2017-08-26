package com.wanpeng.collection.collection.createmapbasedongenerictype;

import java.lang.reflect.ParameterizedType;

public interface Processor<T> {

    void process(T t);

    default Class<T> getType() {
        ParameterizedType parameterizedType = (ParameterizedType) this.getClass().getGenericInterfaces()[0];
        return ( Class<T>) parameterizedType.getActualTypeArguments()[0];
    }
}
