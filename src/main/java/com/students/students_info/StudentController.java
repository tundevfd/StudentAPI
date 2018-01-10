/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.students.students_info;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import static org.springframework.web.bind.annotation.RequestMethod.DELETE;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;
import static org.springframework.web.bind.annotation.RequestMethod.PUT;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author VFDNBK-079
 */
@CrossOrigin
@RestController
@RequestMapping("/students")
public class StudentController {
    
    @Autowired
    private StudentService studentService;
    
    @RequestMapping(method = GET)
    public  Iterable<StudentEntity> list() {
        return studentService.GetAllStudents();
    }
    
    @RequestMapping(value = "/{matno}", method = GET)
    public @ResponseBody ResponseEntity<StudentEntity> get(@PathVariable String matno) {
        StudentEntity student = studentService.GetStudentByMatricNo(matno);
        if(student != null){
            return ResponseEntity.ok(student);
        }
        return ResponseEntity.notFound().build();
    }
    
    @RequestMapping(method = PUT)
    public ResponseEntity<StudentEntity> put(@RequestBody StudentEntity students) {
        StudentEntity studentInfo = studentService.UpdateStudent(students);
        if(studentInfo != null){
            return ResponseEntity.ok(studentInfo);
        }
        return ResponseEntity.notFound().build();
    }
    
    @RequestMapping(method = POST)
    public StudentEntity post(@RequestBody StudentEntity students) {
        return studentService.CreateStudent(students);
    }
    
    @RequestMapping(value = "/{matno}", method = DELETE)
    public Iterable<StudentEntity> delete(@PathVariable String matno) {
        return studentService.DeleteStudent(matno);
      
    }
    
}
