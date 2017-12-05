package com.gz.reflect.proxy;

/**
 * @author xiaozefeng
 */
public class UserDaoImpl implements UserDao{
    @Override
    public void add() {
        System.out.println("添加");
    }

    @Override
    public void delete() {
        System.out.println("删除");
    }

    @Override
    public void update() {
        System.out.println("更新");
    }

    @Override
    public void select() {
        System.out.println("查询");
    }
}
