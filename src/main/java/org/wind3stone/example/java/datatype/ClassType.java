package org.wind3stone.example.java.datatype;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by fenglei on 2016/7/27.
 */
public class ClassType {

    public static void main(String[] args) {

//        ReflectEg reflectEg = ClassType.newInstance("org.wind3stone.example.java.datatype.ReflectEg");
//        reflectEg.setName("apple");
//        System.out.println(reflectEg.getName());
        ClassType.invokeMethod();
    }

    public static void getDeclaredFields() {
        //        Field[] fields = ReflectEg.class.getFields();
        Field[] fields = ReflectEg.class.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field.getName());
        }
    }

    public static void invokeMethod() {
        ReflectEg reflectEg = ClassType.newInstance("org.wind3stone.example.java.datatype.ReflectEg");
        reflectEg.setName("apple");
        Class clazz = ReflectEg.class;
        try {
            Method method = clazz.getDeclaredMethod("getName");
            String name = (String) method.invoke(reflectEg);
            System.out.println(name);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    /**
     * @param clazz
     */
    public static <T> T newInstance(String clazz) {
        T reflectEg = null;
        try {
            //
//            ReflectEg reflectEg = new ReflectEg();
            //
            reflectEg = (T) Class.forName("org.wind3stone.example.java.datatype.ReflectEg").newInstance();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return reflectEg;
    }
}
