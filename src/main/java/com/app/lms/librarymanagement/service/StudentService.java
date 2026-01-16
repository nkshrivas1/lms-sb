package com.app.lms.librarymanagement.service;

import com.app.lms.librarymanagement.DTOs.StudentReqDto;
import com.app.lms.librarymanagement.model.Student;

import java.text.ParseException;
import java.util.List;

public interface StudentService {
   public String addStudent(StudentReqDto student) throws ParseException;
   Student findStudent(int id);
   List<Student> findAll();
   Student updateMobile(String mobile,int id);
   Student findByMail(String mail);
}
