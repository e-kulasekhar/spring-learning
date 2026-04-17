package com.Pentagon;

import java.util.Map;

public class Student {

    private int id;
    private String name;
    private Map<String, Integer> item;

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

    public Map<String, Integer> getItem() {
        return item;
    }

    public void setItem(Map<String, Integer> item) {
        this.item = item;
    }
}
