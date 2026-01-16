package com.app.lms.librarymanagement.repository;

import com.app.lms.librarymanagement.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {
    Student findByMail(String mail);
}
