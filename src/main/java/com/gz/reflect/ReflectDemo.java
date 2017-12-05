package com.gz.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 *  获取Class对象的三种方式
 *  获取一个类的
 *      Constructor
 *      Field
 *      Method
 * @author xiaozefeng
 */
public class ReflectDemo {
    public static void main(String[] args) throws ClassNotFoundException {
        Person person = new Person();
        Class<? extends Person> c1 = person.getClass();
        Class<Person> c2 = Person.class;
        Class<?> c3 = Class.forName("com.gz.reflect.Person");
        System.out.println(c1 == c2);
        System.out.println(c1 == c3);

        // constructors
        System.out.println("constructors ->");
        Constructor<?>[] constructors = c3.getDeclaredConstructors();
        Arrays.asList(constructors).forEach(e -> {
            System.out.println(e);
        });

        // fields
        System.out.println("fields ->");
        Field[] declaredFields = c3.getDeclaredFields();
        Arrays.asList(declaredFields).forEach(e->{
            System.out.println(e);
        });

        // methods
        System.out.println("methods ->");
        Method[] methods = c3.getDeclaredMethods();
        Arrays.asList(methods).forEach(e->{
            System.out.println(e);
        });
    }
}
