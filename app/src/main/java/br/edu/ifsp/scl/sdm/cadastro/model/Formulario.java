package br.edu.ifsp.scl.sdm.cadastro.model;

import androidx.annotation.NonNull;

public class Formulario {

    private String name;
    private String phone;
    private String email;
    private Boolean emailList;
    private Boolean male;
    private Boolean fame;
    private String city;
    private String state;

    public Formulario() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getEmailList() {
        return emailList;
    }

    public void setEmailList(Boolean emailList) {
        this.emailList = emailList;
    }

    public Boolean getMale() {
        return male;
    }

    public void setMale(Boolean male) {
        this.male = male;
    }

    public Boolean getFame() {
        return fame;
    }

    public void setFame(Boolean fame) {
        this.fame = fame;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @NonNull
    @Override
    public String toString() {
        return "Formulario {" + '\n' +
                " name=" + name + '\n' +
                " phone=" + phone + '\n' +
                " email=" + email + '\n' +
                " emailList=" + emailList + '\n' +
                " male=" + male + '\n' +
                " fame=" + fame + '\n' +
                " city=" + city + '\n' +
                " state=" + state + '\n' +
                '}';
    }
}
