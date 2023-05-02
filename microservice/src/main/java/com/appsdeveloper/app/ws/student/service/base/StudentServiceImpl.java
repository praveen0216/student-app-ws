package com.appsdeveloper.app.ws.student.service.base;

import com.appsdeveloper.app.ws.student.exception.NotFoundException;
import com.appsdeveloper.app.ws.student.model.base.Student;
import com.appsdeveloper.app.ws.student.service.spi.StudentService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static com.appsdeveloper.app.ws.student.endpoint.util.GeneratorUtil.generateRandomId;

@Service
public class StudentServiceImpl implements StudentService {

    Map<String, Student> db = new HashMap<String, Student>();

    public Student create(Student student) {
        return db.put(generateRandomId(), student);
    }

    public List<Student> createBulk(List<Student> students) {
        return students.stream().map(s -> db.put(generateRandomId(), s)).collect(Collectors.toList());
    }

    public Student findById(String id) {
        Student student = db.get(id);
        if (student == null) {
            throw new NotFoundException(String.format("Student with id %s is not found", id));
        }
        return student;
    }

    public Student update(Student student, String id) {
        Student result = db.get(id);
        if (result == null) {
            throw new NotFoundException(String.format("Student with id %s is not found", id));
        }

        return db.put(id, student);
    }

    public void delete(String id) {
        Student result = db.get(id);
        if (result == null) {
            throw new NotFoundException(String.format("Student with id %s is not found", id));
        }
        db.remove(id);
    }
}
