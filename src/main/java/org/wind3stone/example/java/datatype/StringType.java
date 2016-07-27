package org.wind3stone.example.java.datatype;

import com.google.common.collect.Lists;
import com.sun.deploy.util.StringUtils;
import org.apache.commons.lang3.time.StopWatch;

import java.util.List;

/**
 * Created by fenglei on 2016/7/21.
 */
public class StringType {

    public static void main(String[] args) {
        StringType.List2String();
    }

    public static void List2String() {
        List<String> rsList = Lists.newArrayList();
        rsList.add("abc");
        rsList.add("def");
        rsList.add("ghi");
        String rs = StringUtils.join(rsList, ".");
        System.out.println(rs);
    }

    public static void String2List() {

    }

    public static void int2String() {
        int a = 3;
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        String s = String.valueOf(a);
        stopWatch.split();
        System.out.println(stopWatch.getSplitNanoTime());
        String w = a + "";
        stopWatch.split();
        System.out.println(stopWatch.getSplitNanoTime());
        stopWatch.stop();
    }
}
