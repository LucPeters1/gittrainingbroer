package com.example.demo.problem2;

import java.util.StringJoiner;

public class Teacher {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void printTrainer(){
        Teacher teacher = new Teacher();

        System.out.println(teacher.name);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Teacher.class.getSimpleName() + "[", "]")
                .add("name='" + name + "'")
                .toString();
    }
}

