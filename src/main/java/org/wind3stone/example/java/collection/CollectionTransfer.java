package org.wind3stone.example.java.collection;

import java.util.Arrays;
import java.util.List;

/**
 * Created by fenglei on 2016/7/21.
 */
public class CollectionTransfer {

    public static void main(String[] args) {
        CollectionTransfer.array2List();
    }

    public static void array2List() {
        List rsList = Arrays.asList("abc", "def", "ghi");
        System.out.println(rsList);
    }
}
