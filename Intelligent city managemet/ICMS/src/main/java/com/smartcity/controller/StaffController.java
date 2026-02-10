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
@RequestMapping("/staff")
public class StaffController {

    @Autowired
    private IssueService issueService;

    // Staff dashboard
    @GetMapping("/dashboard")
    public String staffDashboard(Model model) {
        List<Issue> issues = issueService.getAllIssues();
        model.addAttribute("issues", issues);
        return "staff-dashboard";
    }

    // Update issue status
    @PostMapping("/update/{issueId}")
    public String updateIssueStatus(
            @PathVariable Long issueId,
            @RequestParam IssueStatus status) {

        issueService.updateIssueStatus(issueId, status);
        return "redirect:/staff/dashboard";
    }
}
