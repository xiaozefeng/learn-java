package com.gz.reflect.proxy;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/** 动态代理
 * @author xiaozefeng
 */
public class ReflectDemo5 {
    public static void main(String[] args) {
        UserDao dao = new UserDaoImpl();
        dao.add();
        dao.delete();
        dao.update();
        dao.select();
        System.out.println("-----------");

        InvocationHandler handler = new MyInvocationHandler(dao);
        UserDao proxy= (UserDao) Proxy.newProxyInstance(dao.getClass().getClassLoader(), dao.getClass().getInterfaces(), handler);
        proxy.add();
        proxy.delete();
        proxy.update();
        proxy.select();

    }
}
