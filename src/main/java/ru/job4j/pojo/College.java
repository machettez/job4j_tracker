package ru.job4j.pojo;

import java.util.Date;

public class College {

    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Nikita Ovechkin");
        student.setGroup("Job4j");
        student.setCreated(new Date());
        System.out.println("Student's name: " + student.getName()
                + "\nGroup: " + student.getGroup()
                + "\nDate: " + student.getCreated());
    }

}
