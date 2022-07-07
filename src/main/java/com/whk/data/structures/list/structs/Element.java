package com.whk.data.structures.list.structs;

public class Element<T> {
    Long prePoint;
    Long subPoint;
    Integer index;
    T elem;

    public Long getPrePoint() {
        return prePoint;
    }

    public void setPrePoint(Long prePoint) {
        this.prePoint = prePoint;
    }

    public Long getSubPoint() {
        return subPoint;
    }

    public void setSubPoint(Long subPoint) {
        this.subPoint = subPoint;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public T getElem() {
        return elem;
    }

    public void setElem(T elem) {
        this.elem = elem;
    }
}
