package org.kehadiransiswa.data;

public class AttendanceRecord {
    private int id;
    private int classId;
    private int userId;
    private String status;

    // Constructor
    public AttendanceRecord(int id, int classId, int userId, String status) {
        this.id = id;
        this.classId = classId;
        this.userId = userId;
        this.status = status;
    }

    // Getter and Setter methods
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

