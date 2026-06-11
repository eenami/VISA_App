package com.visa.app.model;

public class Applicant {
    private String firstName;
    private String lastName;
    private String birthDate;
    private String email;
    private String phone;
    private String sex;
    private String citizenship;
    private String civilStatus;
    private String placeOfBirth;
    private String homeAddress;

    public Applicant(String firstName, String lastName, String birthDate, String email, String phone, String sex,
                     String citizenship, String civilStatus, String placeOfBirth, String homeAddress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.email = email;
        this.phone = phone;
        this.sex = sex;
        this.citizenship = citizenship;
        this.civilStatus = civilStatus;
        this.placeOfBirth = placeOfBirth;
        this.homeAddress = homeAddress;
    }

    public String getProfileSummary() {
        return String.format("Applicant[%s %s, %s, %s, %s]", firstName, lastName, birthDate, email, phone);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getSex() {
        return sex;
    }

    public String getCitizenship() {
        return citizenship;
    }

    public String getCivilStatus() {
        return civilStatus;
    }

    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    public String getHomeAddress() {
        return homeAddress;
    }
}
