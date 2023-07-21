package com.example.demo.problem2;


public class Program {

    public static void main(String[] args) {


        Student student1 = new Student("Luc", "Software Developer");


        Student student2 = new Student("Philip", "Software Engineer");


        Student student3 = new Student("Stef", "SAP Consultant");


        Student student4 = new Student("Kane", "Boeren Developer");


        Student student5 = new Student("Kevin", "Trommel Engineer");

        Student student6 = new Student("Guilherme", "SAP Consultant");

        Teacher teacher = new Teacher();
        teacher.setName("Vlad");

        Student[] students = {student1, student2, student3, student6, student5, student4};

        Group group = new Group(teacher, students);

        Group group2 = new Group(teacher, student6, student5, student4);
//        System.out.println(group2);
//        System.out.println();
//        System.out.println(group);
        group2.printTrainer();
        group2.printStudent();
    }
}

// String[] studentNames = {"Luc", "Stef", "Joshua", "Kane", "Guilherme", "Irene", "Coco", "Steffano", "Philip", "Kevin"};