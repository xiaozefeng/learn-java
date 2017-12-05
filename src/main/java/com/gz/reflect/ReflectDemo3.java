package com.gz.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 使用反射给字段赋值
 * @author xiaozefeng
 */
public class ReflectDemo3 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        Class<?> clazz = Class.forName("com.gz.reflect.Person");
        Constructor<?> constructor = clazz.getConstructor();
        Object obj = constructor.newInstance();

        System.out.println(obj);

        Field nameField = clazz.getDeclaredField("name");
        // 给这个字段赋值
        nameField.setAccessible(true);
        nameField.set(obj,"林青霞");
        System.out.println(obj);

        // 获取这个字段的值
        Object name = nameField.get(obj);
        System.out.println(name);

        // 调用getName方法
        Method m1 = clazz.getMethod("getName");
        Object value = m1.invoke(obj);
        System.out.println(value);
    }
}
