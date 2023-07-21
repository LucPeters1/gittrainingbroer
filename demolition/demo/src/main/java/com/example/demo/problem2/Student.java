package com.example.demo.problem2;

import java.util.StringJoiner;

public class Student {
    private String name = "default white";
    private String futureJob;

    public Student(String name, String futureJob){
        setName(name);
        setFutureJob(futureJob);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFutureJob() {
        return futureJob;
    }

    public void setFutureJob(String futureJob) {
        this.futureJob = futureJob;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Student.class.getSimpleName() + "[", "]")
                .add("name='" + name + "'")
                .add("futureJob='" + futureJob + "'")
                .toString();
    }
}
