package com.example.lijint.sqlite;

/**
 * Created by lijint on 2017/6/27.
 */

public class Person {
    public int _id;
    public String name;
    public int age;
    public String info;

    public Person(){

    }

    public Person(String _name,int _age,String _info) {
        this.name = _name;
        this.age = _age;
        this.info = _info;
    }
}
