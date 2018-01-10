/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.students.students_info;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author VFDNBK-079
 */
@Entity
public class StudentEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    
    private String MatricNo;
    private String Firstname;
    private String Lastname;
    private String Department;
    private String Course;
    private int Level;

    public String getMatricNo() {
        return MatricNo;
    }

    public void setMatricNo(String MatricNo) {
        this.MatricNo = MatricNo;
    }

    public String getFirstname() {
        return Firstname;
    }

    public void setFirstname(String Firstname) {
        this.Firstname = Firstname;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String Lastname) {
        this.Lastname = Lastname;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String Department) {
        this.Department = Department;
    }

    public String getCourse() {
        return Course;
    }

    public void setCourse(String Course) {
        this.Course = Course;
    }

    public int getLevel() {
        return Level;
    }

    public void setLevel(int Level) {
        this.Level = Level;
    }

    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (MatricNo != null ? MatricNo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof StudentEntity)) {
            return false;
        }
        StudentEntity other = (StudentEntity) object;
        if ((this.MatricNo == null && other.MatricNo != null) || (this.MatricNo != null && !this.MatricNo.equals(other.MatricNo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "StudentEntity[ matric_no=" + MatricNo + " ]";
    }
    
}
