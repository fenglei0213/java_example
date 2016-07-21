package org.wind3stone.java.example.datatype;

import com.google.common.collect.Lists;
import com.sun.deploy.util.StringUtils;

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
}
