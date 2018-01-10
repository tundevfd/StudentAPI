/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.students.students_info;

import com.students.students_info.StudentRepository;
import com.students.students_info.StudentEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author VFDNBK-079
 */
@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;
    
    public Iterable<StudentEntity> GetAllStudents(){
        return studentRepository.findAll();
    }
    
    public StudentEntity GetStudentByMatricNo(String matric){
        StudentEntity student = studentRepository.findOne(matric);
        return student;
    }
    
    public StudentEntity CreateStudent(StudentEntity student){
        try{
            return studentRepository.save(student);
        }
        catch(Exception ex){
            return null;
        }
        
    }
    
    public StudentEntity UpdateStudent(StudentEntity student){
        try{
            StudentEntity studentInfo = studentRepository.findOne(student.getMatricNo());
            if(studentInfo != null){
                studentInfo.setLevel(student.getLevel());
                return studentRepository.save(studentInfo);
            }
            
        }
        catch(Exception ex){
            return null;
        }
        return null;
    }
    
    public Iterable<StudentEntity> DeleteStudent(String matNo){
        StudentEntity student = studentRepository.findOne(matNo);
        if(student != null){
            studentRepository.delete(student);
        }
        return studentRepository.findAll();
    } 
}
