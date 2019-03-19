package de.maxlo.calendar;

import org.springframework.data.annotation.Id;

import java.util.Map;

public class Activity {

    @Id private String id;
    private String category;
    private String date;
    private Map<String, String> details;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Map<String, String> getDetails() {
        return details;
    }

    public void setDetails(Map<String, String> details) {
        this.details = details;
    }
}
