package com.webapp.school_management_system.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Teacher")
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "teacher_id", nullable = false)
    private String teacherId;

    @Column(name = "full_name")
    private String fullName;

    @Column(name = "home_address")
    private String homeAddress;

    @Column(name = "contact_number")
    private String contactNumber;

    @Column(name = "email")
    private String email;

    @Column(name = "subject")
    private String subject;

    public Teacher() {

    }

    public Teacher(String teacherId, String fullName, String homeAddress,String contactNumber, String email , String subject) {
        super();
        this.teacherId = teacherId;
        this.fullName = fullName;
        this.homeAddress = homeAddress;
        this.contactNumber = contactNumber;
        this.email = email;
        this.subject= subject;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String indexNo) {
        this.teacherId = indexNo;
    }

    public String getFullName() { return fullName; }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getHomeAddress() { return homeAddress; }

    public void setHomeAddress(String homeAddress) { this.homeAddress = homeAddress; }

    public String getContactNumber() { return contactNumber; }

    public void setContactNumber(String contactNumber) { this.contactNumber = contactNumber; }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSubject() { return subject; }

    public void setSubject(String subject) { this.subject = subject; }
}
