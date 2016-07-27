package org.wind3stone.example.java.exception;

/**
 * Created by fenglei on 2016/7/27.
 */
public class ExceptionType {

    public static void main(String[] args) {
        int a = ExceptionType.m();
        System.out.println(a);
    }

    /**
     * finally 中 return 以 finally 中的 return 为准
     *
     * @return
     */
    public static int m() {
        int a = 0;
        try {
            a = 1;
            throw new Exception();
        } catch (Exception e) {
            return 3;
        } finally {
            return 4;
        }
    }
}
