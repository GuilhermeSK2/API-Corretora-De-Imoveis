package com.freitas.formulario.model;

public class Person {
    private int id;
    private String firstName;
    private String lastName;
    private int age;
    private String job;
    private String address;

    // Construtor
    public Person(String fname, String lname, int age, String job, String address) {
        this.firstName = fname;
        this.lastName = lname;
        this.age = age;
        this.job = job;
        this.address = address;
    }

    // Getters e Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFName() {
        return firstName;
    }

    public void setFName(String fname) {
        this.firstName = fname;
    }

    public String getLName() {
        return lastName;
    }

    public void setLName(String lname) {
        this.lastName = lname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

