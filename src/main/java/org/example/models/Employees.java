package org.example.models;

public class Employees {
    private int employee_id;
    private String first_name;
    private String last_name;
    private String birth_date;
    private String photo;
    private String notes;


    public Employees(int employee_id, String first_name, String last_name, String birth_date, String photo, String notes) {
        this.employee_id = employee_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.birth_date = birth_date;
        this.photo = photo;
        this.notes = notes;
    }

    public Employees(){

    }

    public int getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getBirth_date() {
        return birth_date;
    }

    public void setBirth_date(String birth_date) {
        this.birth_date = birth_date;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    @Override
    public String toString(){
        return "{\"Employee_id\" : " + this.employee_id + ", \"FirstName\" : " + this.first_name + ", \"LastName\" : " + this.last_name + ", \"BirthDate\" : " + this.birth_date + ", \"Photo\" : " + this.photo + ", \"Notes\" : " + this.notes +" }";
    }

}
