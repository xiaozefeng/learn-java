package com.gz.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 *  根据Constructor 创建对象
 * @author xiaozefeng
 */
public class ReflectDemo2 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<?> clazz = Class.forName("com.gz.reflect.Person");
        Constructor<?> constructor = clazz.getDeclaredConstructor();
        // 调用默认无参数构造函数
        Object o = constructor.newInstance();
        System.out.println(o);

        // 调用有参数的构造函数
        Constructor<?> cons = clazz.getConstructor(String.class, int.class, String.class);
        Object o1 = cons.newInstance("林青霞", 18, "广州");
        System.out.println(o1);

        // 调用私用构造函数
        Constructor<?> declaredConstructor = clazz.getDeclaredConstructor(String.class);
        declaredConstructor.setAccessible(true);
        Object o2 = declaredConstructor.newInstance("林青霞");
        System.out.println(o2);
    }
}
