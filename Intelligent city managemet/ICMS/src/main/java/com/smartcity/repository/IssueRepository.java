package com.smartcity.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.smartcity.entity.Issue;
import com.smartcity.entity.IssueStatus;
import com.smartcity.entity.User;
import com.smartcity.entity.Department;

@Repository
public interface IssueRepository extends JpaRepository<Issue, Long> {

    // Issues reported by a specific citizen
    List<Issue> findByReportedBy(User user);

    // Issues assigned to a specific staff
    List<Issue> findByAssignedStaff(User staff);

    // Issues handled by a department
    List<Issue> findByDepartment(Department department);

    // Issues filtered by status
    List<Issue> findByStatus(IssueStatus status);

    // Department + status (for dashboards)
    List<Issue> findByDepartmentAndStatus(Department department, IssueStatus status);
}
