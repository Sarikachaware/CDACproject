package com.smartcity.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "issues")
public class Issue {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;
    private String location;

    @Enumerated(EnumType.STRING)
    private IssueStatus status;

    // citizen who reported
    @ManyToOne
    @JoinColumn(name = "reported_by")
    private User reportedBy;

    // assigned department
    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;

    // assigned staff
    @ManyToOne
    @JoinColumn(name = "assigned_staff")
    private User assignedStaff;

    private LocalDateTime createdAt;

    public Issue() {
        this.status = IssueStatus.REPORTED;
        this.createdAt = LocalDateTime.now();
    }

    // getters setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }

    public IssueStatus getStatus() { return status; }
    public void setStatus(IssueStatus status) { this.status = status; }

    public User getReportedBy() { return reportedBy; }
    public void setReportedBy(User reportedBy) { this.reportedBy = reportedBy; }

    public Department getDepartment() { return department; }
    public void setDepartment(Department department) { this.department = department; }

    public User getAssignedStaff() { return assignedStaff; }
    public void setAssignedStaff(User assignedStaff) { this.assignedStaff = assignedStaff; }

    public LocalDateTime getCreatedAt() { return createdAt; }
}
