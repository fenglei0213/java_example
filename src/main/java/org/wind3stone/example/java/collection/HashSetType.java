package org.wind3stone.example.java.collection;

import com.google.common.collect.Sets;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by fenglei on 2016/7/19.
 */
public class HashSetType {

    private static Set<Integer> initHashSet() {
//        Set<Integer> set = Sets.newHashSet();
        Set<Integer> set = new HashSet();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        return set;
    }

    private static Set<Integer> initTreeSet() {
        Set<Integer> set = Sets.newTreeSet();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        return set;
    }

    public static void main(String[] args) {
        Set<Integer> hashSet = HashSetType.initHashSet();
        HashSetType.loop(hashSet);
        Set<Integer> treeSet = HashSetType.initTreeSet();
        HashSetType.loop(treeSet);
    }

    private static <T> void loop(Set<T> set) {
        for (T item : set) {
            System.out.println(item);
        }
    }

}
