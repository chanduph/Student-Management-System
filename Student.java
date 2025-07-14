package com.example.studentportal.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
public class Student {

    @Id
    private String usn;
    private String name;
    private LocalDate dob;
    private String gender;
    private String category;
    private BigDecimal score10;
    private BigDecimal scorePu;
    private BigDecimal scoreBe;
    private BigDecimal cgpaSem1;
    private BigDecimal cgpaSem2;
    private BigDecimal cgpaSem3;
    private BigDecimal cgpaSem4;
    private BigDecimal cgpaSem5;
    private BigDecimal cgpaSem6;
    private int backlogs;
    private int cetRank;
    private String email;
    private String mobile;
    private String currentAddress;
    private String permanentAddress;
    private String puCollegeName;
    private String sslcSchoolName;
    private int yop10th;
    private int yop12th;

    // --- Getters and Setters ---

    public String getUsn() {
        return usn;
    }

    public void setUsn(String usn) {
        this.usn = usn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public BigDecimal getScore10() {
        return score10;
    }

    public void setScore10(BigDecimal score10) {
        this.score10 = score10;
    }

    public BigDecimal getScorePu() {
        return scorePu;
    }

    public void setScorePu(BigDecimal scorePu) {
        this.scorePu = scorePu;
    }

    public BigDecimal getScoreBe() {
        return scoreBe;
    }

    public void setScoreBe(BigDecimal scoreBe) {
        this.scoreBe = scoreBe;
    }

    public BigDecimal getCgpaSem1() {
        return cgpaSem1;
    }

    public void setCgpaSem1(BigDecimal cgpaSem1) {
        this.cgpaSem1 = cgpaSem1;
    }

    public BigDecimal getCgpaSem2() {
        return cgpaSem2;
    }

    public void setCgpaSem2(BigDecimal cgpaSem2) {
        this.cgpaSem2 = cgpaSem2;
    }

    public BigDecimal getCgpaSem3() {
        return cgpaSem3;
    }

    public void setCgpaSem3(BigDecimal cgpaSem3) {
        this.cgpaSem3 = cgpaSem3;
    }

    public BigDecimal getCgpaSem4() {
        return cgpaSem4;
    }

    public void setCgpaSem4(BigDecimal cgpaSem4) {
        this.cgpaSem4 = cgpaSem4;
    }

    public BigDecimal getCgpaSem5() {
        return cgpaSem5;
    }

    public void setCgpaSem5(BigDecimal cgpaSem5) {
        this.cgpaSem5 = cgpaSem5;
    }

    public BigDecimal getCgpaSem6() {
        return cgpaSem6;
    }

    public void setCgpaSem6(BigDecimal cgpaSem6) {
        this.cgpaSem6 = cgpaSem6;
    }

    public int getBacklogs() {
        return backlogs;
    }

    public void setBacklogs(int backlogs) {
        this.backlogs = backlogs;
    }

    public int getCetRank() {
        return cetRank;
    }

    public void setCetRank(int cetRank) {
        this.cetRank = cetRank;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getCurrentAddress() {
        return currentAddress;
    }

    public void setCurrentAddress(String currentAddress) {
        this.currentAddress = currentAddress;
    }

    public String getPermanentAddress() {
        return permanentAddress;
    }

    public void setPermanentAddress(String permanentAddress) {
        this.permanentAddress = permanentAddress;
    }

    public String getPuCollegeName() {
        return puCollegeName;
    }

    public void setPuCollegeName(String puCollegeName) {
        this.puCollegeName = puCollegeName;
    }

    public String getSslcSchoolName() {
        return sslcSchoolName;
    }

    public void setSslcSchoolName(String sslcSchoolName) {
        this.sslcSchoolName = sslcSchoolName;
    }

    public int getYop10th() {
        return yop10th;
    }

    public void setYop10th(int yop10th) {
        this.yop10th = yop10th;
    }

    public int getYop12th() {
        return yop12th;
    }

    public void setYop12th(int yop12th) {
        this.yop12th = yop12th;
    }
}
