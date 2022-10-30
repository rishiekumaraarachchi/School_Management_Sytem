package com.webapp.school_management_system.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "marks")
public class Marks {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "index_number", nullable = false)
    private String indexNo;

    @Column(name = "full_name")
    private String fullName;

    @Column(name = "marks_maths")
    private String maths;

    @Column(name = "marks_physics")
    private String physics;

    @Column(name = "marks_chemistry")
    private String chemistry;

    @Column(name = "home_address")
    private String homeAddress;

    @Column(name = "contact_number")
    private String contactNumber;

    @Column(name = "email")
    private String email;

    public Marks() {

    }

    public Marks(String indexNo, String fullName, String maths,String physics, String chemistry) {
        super();
        this.indexNo = indexNo;
        this.fullName = fullName;
        this.maths = maths;
        this.physics = physics;
        this.chemistry = chemistry;
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

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getMaths() {
        return maths;
    }

    public void setMaths(String maths) {
        this.maths = maths;
    }

    public String getPhysics() {
        return physics;
    }

    public void setPhysics(String physics) {
        this.physics = physics;
    }

    public String getChemistry() {
        return chemistry;
    }

    public void setChemistry(String chemistry) {
        this.chemistry = chemistry;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
