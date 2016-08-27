package org.wind3stone.example.java.datatype;

import org.wind3stone.example.java.vo.Apple;

/**
 * Created by fenglei on 2016/7/27.
 */
public class ObjectType {

    public static void main(String[] args) {
        Apple apple = ObjectType.getAppleObject();
        System.out.println(apple.hashCode());
    }

    public static Apple getAppleObject() {
        Apple apple = new Apple();
        apple.setName("abc");
        return apple;
    }

    public static void doHashCode() {

    }

//    @Override
//    public int hashCode() {
//        return 0;
//    }

//    public void hashCode(){
//
//    }

}
