package com.sheryians.MVCApp1;

public class Student {
    private String name;
    private int rollNo;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }
}
