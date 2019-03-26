package de.maxlo.calendar;

import org.springframework.data.annotation.Id;

public class Category {

    @Id private String id;

    private String name;
    private String description;
    private Integer color[];

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer[] getColor() {
        return color;
    }

    public void setColor(Integer[] color) {
        this.color = color;
    }
}
