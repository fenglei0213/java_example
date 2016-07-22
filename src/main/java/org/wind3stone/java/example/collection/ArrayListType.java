package org.wind3stone.java.example.collection;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * Created by fenglei on 2016/7/19.
 */
public class ArrayListType {

    public static void main(String[] args) {
        List list = ArrayListType.init();
    }

    private static List<Integer> init() {
        List<Integer> list = Lists.newArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        return list;
    }

    /**
     * loop loop
     *
     * @param list
     */
    private static void loop(List<Integer> list) {
        // for
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i);
        }
        // for
        for (Integer i : list) {
            System.out.println(i);
        }
        // another method
        // iterator
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer i = iterator.next();
            System.out.println(i);
        }
    }
}
