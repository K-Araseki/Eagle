package org.vaadin.example.view;

import java.util.Date;

public class Person {

    private String Name;
    private int age;

    public String getName() {
        return Name;
    }

    public int getAge() {
        return age;
    }

    public Person(String name, int age) {
        Name = name;
        this.age = age;
    }
}
