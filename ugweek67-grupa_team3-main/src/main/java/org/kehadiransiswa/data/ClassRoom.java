package org.kehadiransiswa.data;

public class ClassRoom {
    private int courseId;
    private int id;
    private String duration;
    private String location;
    private String time;
    private String date;

    // Constructor
    public ClassRoom(int courseId, int id, String duration, String location, String time, String date) {
        this.courseId = courseId;
        this.id = id;
        this.duration = duration;
        this.location = location;
        this.time = time;
        this.date = date;
    }

    // Getter and Setter methods
    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
