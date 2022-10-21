package org.fly.user.data;


import org.fly.base.data.BaseTO;

import javax.persistence.*;
import javax.validation.constraints.NotNull;


@Entity(name = "profile")
@Table(name = "user")
public class User extends BaseTO {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user")
    @SequenceGenerator(name = "user", sequenceName = "seq_user", allocationSize = 1)
    private long personId;

    @Column(columnDefinition = "varchar2(20)")
    @NotNull
    private String name;

    @Column(columnDefinition = "varchar2(20)")
    @NotNull
    private String family;

    @Column(columnDefinition = "varchar2(20)")
    @NotNull
    private String fatherName;

    @Column(columnDefinition = "varchar2(20)")
    @NotNull
    private String gender;

    @Column(columnDefinition = "varchar2(20)")
    @NotNull
    private String maritalStatus;

    @Column(columnDefinition = "number(5)")
    @NotNull
    private long children;

    @Column(columnDefinition = "varchar2(10)")
    @NotNull
    private String birthday;

    @Column(columnDefinition = "varchar2(20)")
    @NotNull
    private long nationalCode;

    @Column(columnDefinition = "varchar2(20)")
    @NotNull
    private String militaryServiceStatus;

    @Column(columnDefinition = "varchar2(20)")
    @NotNull
    private String city;

    @Column(columnDefinition = "varchar2(20)")
    @NotNull
    private String address;

    @Column(columnDefinition = "number")
    @NotNull
    private long workPhoneNumber;


    public long getPersonId() {
        return personId;
    }

    public User setPersonId(long personId) {
        this.personId = personId;
        return this;
    }

    public String getName() {
        return name;
    }

    public User setName(String name) {
        this.name = name;
        return this;
    }

    public String getFamily() {
        return family;
    }

    public User setFamily(String family) {
        this.family = family;
        return this;
    }

    public String getFatherName() {
        return fatherName;
    }

    public User setFatherName(String fatherName) {
        this.fatherName = fatherName;
        return this;
    }

    public String getGender() {
        return gender;
    }

    public User setGender(String gender) {
        this.gender = gender;
        return this;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public User setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
        return this;
    }

    public long getChildren() {
        return children;
    }

    public User setChildren(long children) {
        this.children = children;
        return this;
    }

    public String getBirthday() {
        return birthday;
    }

    public User setBirthday(String birthday) {
        this.birthday = birthday;
        return this;
    }

    public long getNationalCode() {
        return nationalCode;
    }

    public User setNationalCode(long nationalCode) {
        this.nationalCode = nationalCode;
        return this;
    }

    public String getMilitaryServiceStatus() {
        return militaryServiceStatus;
    }

    public User setMilitaryServiceStatus(String militaryServiceStatus) {
        this.militaryServiceStatus = militaryServiceStatus;
        return this;
    }

    public String getCity() {
        return city;
    }

    public User setCity(String city) {
        this.city = city;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public User setAddress(String address) {
        this.address = address;
        return this;
    }

    public long getWorkPhoneNumber() {
        return workPhoneNumber;
    }

    public User setWorkPhoneNumber(long workPhoneNumber) {
        this.workPhoneNumber = workPhoneNumber;
        return this;
    }
}
