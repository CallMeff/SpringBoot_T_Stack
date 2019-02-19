package com.feng.model.dto;

/**
 * @desc：学生数据对象
 * @title：Student
 * @author: tianfengluyao
 * @date: 2019/2/19 11:05
 */
public class StudentDTO {

    private String name;
    private int age;
    private String grade;

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

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
