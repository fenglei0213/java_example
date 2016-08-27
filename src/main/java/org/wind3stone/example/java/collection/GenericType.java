package org.wind3stone.example.java.collection;

import java.util.Map;

/**
 * Created by fenglei on 2016/8/27.
 */
public class GenericType<T,S> {

    private T s;
    private Map<T,S> map;

    public T getS() {
        return s;
    }

    public void setS(T s) {
        this.s = s;
    }

    public static void main(String[] args) {
        GenericType<String,String> g = new GenericType<String,String>();
        g.setS("hello");
    }
}
