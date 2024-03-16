package org.kehadiransiswa.data;

public class Course {
    private int id;
    private String title;
    private String description;

    // Constructor
    public Course(int id, String title, String description) {
        this.id = id;
        this.title = title;
        this.description = description;
    }

    // Getter and Setter methods
    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
