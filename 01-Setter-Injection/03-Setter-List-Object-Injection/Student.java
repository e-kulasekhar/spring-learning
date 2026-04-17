package com.Pentagon;

import java.util.List;

public class Student {

    private int id;
    private String name;
    private List<Subject> sub;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Subject> getSub() {
        return sub;
    }

    public void setSub(List<Subject> sub) {
        this.sub = sub;
    }
}
