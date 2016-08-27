package org.wind3stone.example.java.collection;

import com.google.common.collect.Maps;

import java.util.Iterator;
import java.util.Map;

/**
 * Created by fenglei on 2016/7/19.
 */
public class HashMapType {

    public static void main(String[] args) {
        HashMapType mapExample = new HashMapType();
        Map<String, String> map = mapExample.init();
//        mapExample.loop(map);
        mapExample.loopAndDelete(map, "3");
        mapExample.loop(map);
    }

    private Map<String, String> init() {
        Map<String, String> map = Maps.newHashMap();
        map.put("1", "zhangsan");
        map.put("2", "lisi");
        map.put("3", "wangwu");
        map.put("4", "zhaoliu");
        return map;
    }

    /**
     * loop loop
     *
     * @param map
     */
    private void loop(Map<String, String> map) {
//        for (String key : map.keySet()) {
//            System.out.println("key:" + key + ",value:" + map.get(key));
//        }
        // entrySet not keySet
        for (Map.Entry<String, String> mapItem : map.entrySet()) {
            System.out.print("key:" + mapItem.getKey() + ",value:" + mapItem.getValue() + "\n");
        }
        // another method
        // iterator
//        Iterator<String> iterator = map.keySet().iterator();
//        while (iterator.hasNext()) {
//            String key = iterator.next();
//            String value = map.get(key);
//            System.out.print("key:" + key + ",value:" + value + "\n");
//        }
    }

    private void loopAndDelete(Map<String, String> map, String removeKey) {
        // Exception in thread "main" java.util.ConcurrentModificationException
//        for (Map.Entry<String, String> mapItem : map.entrySet()) {
//            String key = mapItem.getKey();
//            String value = mapItem.getValue();
//            if (key.equals("2")) {
//                map.remove(key);
//            }
//            System.out.print("key:" + key + ",value:" + value + "\n");
//        }

        Iterator<String> iterator = map.keySet().iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            String value = map.get(key);
            if (key.equals(removeKey)) {
                // direct map.remove method will remain Exception in thread "main" java.util.ConcurrentModificationException
                // map.remove(key);
                iterator.remove();
                continue;
            }
            System.out.print("key:" + key + ",value:" + value + "\n");
        }
    }
}
