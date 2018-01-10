/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.students.students_info;

import com.students.students_info.StudentEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author VFDNBK-079
 */
@Repository
public interface StudentRepository extends CrudRepository<StudentEntity, String> {
    
}
