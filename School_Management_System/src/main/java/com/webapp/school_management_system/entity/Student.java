package com.webapp.school_management_system.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity//genarate table
@Table(name = "students")
public class Student {

    @Id//add primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // primary key generation strategy
    private Long id;

    @Column(name = "index_number", nullable = false)
    private String indexNo;

    @Column(name = "full_name")
    private String fullName; // if we dont give column name gpa give a field name

    @Column(name = "home_address")
    private String homeAddress;

    @Column(name = "contact_number")
    private String contactNumber;

    @Column(name = "email")
    private String email;

    public Student() {

    }

    public Student(String indexNo, String fullName, String homeAddress,String contactNumber, String email) {
        super();
        this.indexNo = indexNo;
        this.fullName = fullName;
        this.homeAddress = homeAddress;
        this.contactNumber = contactNumber;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIndexNo() {
        return indexNo;
    }

    public void setIndexNo(String indexNo) {
        this.indexNo = indexNo;
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
}
