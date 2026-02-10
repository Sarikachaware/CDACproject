package com.smartcity.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.smartcity.entity.Issue;
import com.smartcity.entity.IssueStatus;
import com.smartcity.service.IssueService;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private IssueService issueService;

    // Admin dashboard
    @GetMapping("/dashboard")
    public String adminDashboard(Model model) {
        List<Issue> issues = issueService.getAllIssues();
        model.addAttribute("issues", issues);
        return "admin-dashboard";
    }

    // Update issue status
    @PostMapping("/assign/{issueId}")
    public String assignIssue(
            @PathVariable Long issueId,
            @RequestParam IssueStatus status) {

        issueService.updateIssueStatus(issueId, status);
        return "redirect:/admin/dashboard";
    }
}
