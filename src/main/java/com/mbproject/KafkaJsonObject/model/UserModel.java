package com.mbproject.KafkaJsonObject.model;

public class UserModel {

    private String name;
    private String dept;
    private long salary;

    public UserModel(String name, String dept, long salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "UserModel{" +
                "name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", salary=" + salary +
                '}';
    }

    public UserModel() {
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setDept(String dept) {
        this.dept = dept;
    }
    public void setSalary(long salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }
    public String getDept() {
        return dept;
    }
    public long getSalary() {
        return salary;
    }
}
