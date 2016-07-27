package org.wind3stone.example.java.collection;

import com.google.common.collect.Lists;

import java.util.Iterator;
import java.util.List;

/**
 * Created by fenglei on 2016/7/19.
 */
public class ArrayListType {

    public static void main(String[] args) {
        List list = ArrayListType.init();
        ArrayListType.loopAndDelete(list);
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
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(i);
//        }
        // for
//        for (Integer i : list) {
//            System.out.println(i);
//        }
        // another method
        // iterator
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer i = iterator.next();
            System.out.println(i);
        }
    }

    /**
     *
     * @param list
     */
    private static void loopAndDelete(List<Integer> list) {
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer i = iterator.next();
            // wrong
//            if (i == 3) {
            // right
//            if (i.intValue()==3) {
            if (i.equals(3)) {
                iterator.remove();
            }
        }
        ArrayListType.loop(list);
    }
}
