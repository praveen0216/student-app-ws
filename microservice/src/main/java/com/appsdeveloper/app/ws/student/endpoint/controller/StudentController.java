package com.appsdeveloper.app.ws.student.endpoint.controller;

import com.appsdeveloper.app.ws.student.endpoint.util.APIDefinitions;
import com.appsdeveloper.app.ws.student.model.base.Student;
import com.appsdeveloper.app.ws.student.service.spi.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(path = APIDefinitions.ResourcePath.STUDENT)
public class StudentController {

    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }


    @PostMapping(consumes = {
                    MediaType.APPLICATION_JSON_VALUE,
                    MediaType.APPLICATION_XML_VALUE },
            produces = {
                    MediaType.APPLICATION_JSON_VALUE,
                    MediaType.APPLICATION_XML_VALUE })
    //@ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Student> create( @RequestBody @Valid Student student) {
        return new ResponseEntity<Student>(studentService.create(student), HttpStatus.CREATED);
    }

    @PostMapping( path = "/bulk",
            consumes = {
            MediaType.APPLICATION_JSON_VALUE,
            MediaType.APPLICATION_XML_VALUE },
            produces = {
                    MediaType.APPLICATION_JSON_VALUE,
                    MediaType.APPLICATION_XML_VALUE })
    //@ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Student> createBulk(@RequestBody @Valid List<Student> student) {
        return new ResponseEntity<Student>(studentService.createBulk(student), HttpStatus.CREATED);
    }

    @GetMapping(path = "/{id}")
    public 
}
