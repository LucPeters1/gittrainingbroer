package com.example.demo.problem2;

public class Group {

    private Student[] students;
    private Teacher teacher;

    public Group(Teacher teacher, Student... students) {
        this.students = students;
        this.teacher = teacher;
    }

    public Student[] getStudents(String students) {
        return this.students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public Teacher getTeacher(String teacher) {
        return this.teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    void printTrainer() {

        System.out.println(teacher);
    }

    void printStudent() {
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }

    }
}
