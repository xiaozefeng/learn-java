package com.gz.reflect;

/**
 * @author xiaozefeng
 */
public class Person {
    private String name;

    private int age;

    private String address;

    private Hobby hobby;


    public Person() {
    }

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public Person(String name, int age, String address, Hobby hobby) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.hobby = hobby;
    }

    private Person(String name){
        this.name = name;
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", hobby=" + hobby +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public Hobby getHobby() {
        return hobby;
    }

    public void setHobby(Hobby hobby) {
        this.hobby = hobby;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
