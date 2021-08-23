package dao.domain;

import dao.enums.TaskPriority;
import dao.enums.TaskType;

import java.time.LocalDateTime;

public class Task extends AbstractEntity {

    private long id;
    private long assignedTo;
    private TaskType type;
    private TaskPriority priority;
    private String description;
    private double latitude;
    private double longitude;
    private LocalDateTime createdAt;

    public Task(long id, long assignedTo, TaskType type, TaskPriority priority,
                String description, double latitude, double longitude, LocalDateTime createdAt) {
        this.id = id;
        this.assignedTo = assignedTo;
        this.type = type;
        this.priority = priority;
        this.description = description;
        this.latitude = latitude;
        this.longitude = longitude;
        this.createdAt = createdAt;
    }

    @Override
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getAssignedTo() {
        return assignedTo;
    }

    public void setAssignedTo(long assignedTo) {
        this.assignedTo = assignedTo;
    }

    public TaskType getType() {
        return type;
    }

    public void setType(TaskType type) {
        this.type = type;
    }

    public TaskPriority getPriority() {
        return priority;
    }

    public void setPriority(TaskPriority priority) {
        this.priority = priority;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
