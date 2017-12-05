package com.gz.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * 使用反射绕过泛行j
 * @author xiaozefeng
 */
public class ReflectDemo4 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        List<Integer> list = new ArrayList<>();
        list.add(1);

        Class<? extends List> clazz = list.getClass();
        Method method = clazz.getMethod("add", Object.class);
        method.invoke(list, "Hello");
        method.invoke(list, "World");

        System.out.println(list);
    }
}
