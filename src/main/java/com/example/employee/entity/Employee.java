package com.example.employee.entity;

import jakarta.persistence.*;

@Entity
@Table(name="employee")

public class Employee {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name="emp_id")
    private int emp_id;
    @Column(name="name")
    private String name;
    @Column(name="email")
    private String email;
    @Column(name="blood_group")
    private String blood_group;

    public int getId() {
        return emp_id;
    }

    public void setId(int id) {
        this.emp_id = emp_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBlood_group() {
        return blood_group;
    }

    public void setBlood_group(String blood_group) {
        this.blood_group = blood_group;
    }


}
