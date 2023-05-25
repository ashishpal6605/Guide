package com.example.guide.Model;

public class StatesModel {

    String name;
    private int course_image;


    public StatesModel(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCourse_image() {
        return course_image;
    }

    public void setCourse_image(int course_image) {
        this.course_image = course_image;
    }

    public StatesModel(int course_image) {
        this.course_image = course_image;
    }
}
