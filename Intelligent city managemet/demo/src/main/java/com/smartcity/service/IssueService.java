package com.smartcity.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smartcity.entity.Issue;
import com.smartcity.entity.IssueStatus;
import com.smartcity.entity.User;
import com.smartcity.entity.Department;
import com.smartcity.repository.IssueRepository;

@Service
public class IssueService {

    @Autowired
    private IssueRepository issueRepository;

    // Create issue
    public Issue createIssue(Issue issue) {
        return issueRepository.save(issue);
    }

    // Get all issues
    public List<Issue> getAllIssues() {
        return issueRepository.findAll();
    }

    // Issues reported by citizen
    public List<Issue> getIssuesByCitizen(User user) {
        return issueRepository.findByReportedBy(user);
    }

    // Issues assigned to staff
    public List<Issue> getIssuesByStaff(User staff) {
        return issueRepository.findByAssignedStaff(staff);
    }

    // Issues by department
    public List<Issue> getIssuesByDepartment(Department department) {
        return issueRepository.findByDepartment(department);
    }

    // ✅ Update issue status (FIXED)
    public Issue updateIssueStatus(Long issueId, IssueStatus status) {
        Issue issue = issueRepository.findById(issueId).orElse(null);

        if (issue != null) {
            issue.setStatus(status);
            return issueRepository.save(issue);
        }
        return null;
    }
}
