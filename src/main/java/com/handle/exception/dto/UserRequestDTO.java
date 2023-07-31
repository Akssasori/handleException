package com.handle.exception.dto;

public class UserRequestDTO {

    private String email;
    private String name;
    private Integer classNumber;

    public UserRequestDTO(String email, String name, Integer classNumber) {
        this.email=email;
        this.name=name;
        this.classNumber=classNumber;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Integer getClassNumber() {
        return classNumber;
    }
    public void setClassNumber(Integer classNumber) {
        this.classNumber = classNumber;
    }

}
