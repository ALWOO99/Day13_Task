package vttp.batchb.ssf.day13task.models;

import java.time.LocalDate;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.validation.constraints.NotEmpty;

public class ToDo {
      @NotEmpty(message = "Task Name cannot be empty")
    private String taskName;

    @NotEmpty(message = "Priority cannot be empty")
    private String priority;

    @DateTimeFormat(pattern = "yyyy-MM-dd")  // Add the DateTimeFormat annotation
    private LocalDate completeBy;

    // Getters and setters
    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public LocalDate getCompleteBy() {
        return completeBy;
    }

    public void setCompleteBy(LocalDate completeBy) {
        this.completeBy = completeBy;
    }

    @Override
    public String toString() {
        return "ToDo [taskName=" + taskName + ", priority=" + priority + ", completeBy=" + completeBy + "]";
    }
}

