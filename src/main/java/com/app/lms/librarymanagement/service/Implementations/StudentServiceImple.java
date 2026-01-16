package com.app.lms.librarymanagement.service.Implementations;

import com.app.lms.librarymanagement.DTOs.StudentReqDto;
import com.app.lms.librarymanagement.Enums.Status;
import com.app.lms.librarymanagement.model.Card;
import com.app.lms.librarymanagement.model.Student;
import com.app.lms.librarymanagement.repository.StudentRepository;
import com.app.lms.librarymanagement.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
@Service
public class StudentServiceImple implements StudentService {
   @Autowired
    StudentRepository studentRepository;
    @Override
    public String addStudent(StudentReqDto studentData) throws ParseException {
        Student student = new Student();
        student.setAge(studentData.getAge());
        student.setName(studentData.getName());
        student.setDepartment(studentData.getDepartment());
        student.setMobNo(studentData.getMobNo());
        Card card = new Card();
        card.setCardStatus(Status.ACTIVATED);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date date = format.parse(LocalDate.now().plusYears(4).toString());
        card.setExpiryDate(date);
        card.setStudent(student);
        student.setCard(card);
        studentRepository.save(student);
        return "Student  added successfully";
    }

    @Override
    public Student findStudent(int id) {
        return studentRepository.findById(id).orElse(null);
    }

    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public Student updateMobile(String mobile, int id) {
        Student student = studentRepository.findById(id).get();
        student.setMobNo(mobile);
        studentRepository.save(student);
        return student;
    }

    public Student findByMail(String mail) {
        return studentRepository.findByMail(mail);
    }
}
