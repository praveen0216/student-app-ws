package com.appsdeveloper.app.ws.student.service.spi;

import com.appsdeveloper.app.ws.student.model.base.Student;

import java.util.List;

public interface StudentService {

    /**
     * create one student
     *
     * @param student
     * @return created Student
     */
    public Student create(Student student);

    /**
     * create bulk of  student
     *
     * @param student
     * @return created list of Student
     */
    public Student createBulk(List<Student> student);


    /**
     * get one student by id
     *
     * @param id
     * @return saved Student
     */
    public Student findById(String id);


    /**
     * update one student by id
     *
     * @param student
     * @return updated Student
     */
    public Student update(Student student);

    /**
     * delete one student by id
     *
     * @param id
     *
     */
    public void delete(String id);

}
