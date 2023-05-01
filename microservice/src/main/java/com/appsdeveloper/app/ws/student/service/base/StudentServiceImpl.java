package com.appsdeveloper.app.ws.student.service.base;

import com.appsdeveloper.app.ws.student.model.base.Student;
import com.appsdeveloper.app.ws.student.service.spi.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    public Student create(Student student) {
        return null;
    }

    public Student createBulk(List<Student> student) {
        return null;
    }

    public Student findById(String id) {
        return null;
    }

    public Student update(Student student) {
        return null;
    }

    public void delete(String id) {

    }
}
