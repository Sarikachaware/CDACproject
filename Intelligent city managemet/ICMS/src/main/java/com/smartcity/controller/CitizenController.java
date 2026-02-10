package com.smartcity.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.smartcity.entity.Issue;
import com.smartcity.service.IssueService;

@Controller
@RequestMapping("/citizen")
public class CitizenController {

    @Autowired
    private IssueService issueService;

    // Citizen dashboard
    @GetMapping("/dashboard")
    public String citizenDashboard(Model model) {
        List<Issue> issues = issueService.getAllIssues();
        model.addAttribute("issues", issues);
        return "citizen-dashboard";
    }

    // Report issue page
    @GetMapping("/report")
    public String reportIssuePage(Model model) {
        model.addAttribute("issue", new Issue());
        return "report-issue";
    }

    // Submit issue
    @PostMapping("/submit")
    public String submitIssue(@ModelAttribute Issue issue) {
        issueService.createIssue(issue);   // FIXED
        return "redirect:/citizen/dashboard";
    }
}
