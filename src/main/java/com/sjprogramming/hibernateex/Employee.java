package com.sjprogramming.hibernateex;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employees")
public class Employee {
    @Id
    @Column(name = "emp_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "emp_name") // Column name will be emp_name
    private String name;

    @Column(name = "emp_salary")
    private float salary;

    @Column(name = "emp_mail") // Column name will be emp_mail
    private String mail;

    // Constructors
    public Employee() {
    }

    public Employee(String name, float salary, String mail) {
        this.name = name;
        this.salary = salary;
        this.mail = mail;
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    // Override toString() method for printing Employee details
    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", mail=" + mail + "]";
    }
}
