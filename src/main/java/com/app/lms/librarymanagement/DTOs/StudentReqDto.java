package com.app.lms.librarymanagement.DTOs;

import com.app.lms.librarymanagement.Enums.Department;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

public class StudentReqDto {
    private int stdId;
    private String name;
    private int age;
    private Department department;
    private String mobNo;

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

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public String getMobNo() {
        return mobNo;
    }

    public void setMobNo(String mobNo) {
        this.mobNo = mobNo;
    }
}
