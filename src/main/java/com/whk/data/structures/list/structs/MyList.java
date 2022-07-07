package com.whk.data.structures.list.structs;

import com.whk.data.structures.list.constants.Status;

import java.util.HashMap;
import java.util.Map;

public class MyList<T> {
    private Map map;
    public MyList() {
        this.map = new HashMap<Long,Element<T>>();
    }

    public Status addNewElement(int index,T element){
        Element<T> tElement = new Element<>();

        return null;
    }
    public T getByIndex(int index){
        return null;
    }
}
