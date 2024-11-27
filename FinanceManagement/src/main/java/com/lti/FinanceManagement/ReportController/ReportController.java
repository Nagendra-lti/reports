package com.lti.FinanceManagement.ReportController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.FinanceManagement.ReportModel.UserReportResponse;
import com.lti.FinanceManagement.ReportModel.UserRequest;
import com.lti.FinanceManagement.ReportService.ReportService;

@RestController
@RequestMapping("/api/reports")
public class ReportController {
 
    @Autowired
    private ReportService reportService;
 
    @PostMapping
    public ResponseEntity<UserReportResponse> getUserReport(@RequestBody UserRequest request) {
        UserReportResponse response = reportService.generateReport(request);
        return ResponseEntity.ok(response);
    }
}