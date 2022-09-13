package com.example.dockerizingdemo.model;

import java.util.Objects;

public class Tutorial {
    private int id;
    private String name;
    private double price;
    private String description;
    private Byte published;

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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Byte getPublished() {
        return published;
    }

    public void setPublished(Byte published) {
        this.published = published;
    }

    @Override
    public String toString() {
        return "Tutorial{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", published=" + published +
                '}';
    }
}
