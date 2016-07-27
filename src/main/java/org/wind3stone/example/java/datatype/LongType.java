package org.wind3stone.example.java.datatype;

import java.util.Random;

/**
 * Created by fenglei on 2016/7/21.
 */
public class LongType {

    // 最大长度是19位
    // 随机数生成也是一个19位的数字
    // 有符号位 2的31次方-1 去除0
    public static void main(String[] args) {
//        LongType.randomLong();
        LongType.LongLength();
    }

    private static void LongLength() {
//        String value = "2016072113346840232";
        // 19位长度,多写以为就报错
        String value = "20160721133468402321";
        Long a = Long.parseLong(value);
        System.out.println(a);
    }

    public static void randomLong() {
        // 生成的数字中有负数
        for (int i = 0; i < 10; i++) {
            System.out.println(new Random().nextLong());
        }
        // 如何去掉负数?

    }
}
