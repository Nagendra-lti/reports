package com.lti.FinanceManagement.ReportService;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.lti.FinanceManagement.ReportExceptions.DataProcessingException;
import com.lti.FinanceManagement.ReportExceptions.InvalidRequestException;
import com.lti.FinanceManagement.ReportExceptions.UserNotFoundException;
import com.lti.FinanceManagement.ReportModel.MaxValues;
import com.lti.FinanceManagement.ReportModel.Transaction;
import com.lti.FinanceManagement.ReportModel.UserReportResponse;
import com.lti.FinanceManagement.ReportModel.UserRequest;

@Service
public class ReportService {
 
    public UserReportResponse generateReport(UserRequest request) {
        // Validate request
        if (request.getUserId() == null || request.getUserName() == null) {
            throw new InvalidRequestException("User ID or User Name cannot be null.");
        }
 
        // Mock data. Replace with actual data fetching logic.
        List<Transaction> transactions = Arrays.asList(
            new Transaction("January", 10.8, 4.2, 15.0),
            new Transaction("March", 11.0, 3.0, 14.0),
            new Transaction("April", 1.8, 3.2, 5.0)
        );
 
        // Check if user exists (example scenario)
        if (transactions.isEmpty()) {
            throw new UserNotFoundException("No data found for user with ID: " + request.getUserId());
        }
 
        try {
            // Business logic for processing transactions
            String maxInvestMonth = transactions.stream()
                .max(Comparator.comparing(Transaction::getAmountInvested))
                .map(Transaction::getMonth)
                .orElseThrow(() -> new DataProcessingException("Unable to calculate max invested month."));
 
            String maxIncomeMonth = transactions.stream()
                .max(Comparator.comparing(Transaction::getIncomeAmount))
                .map(Transaction::getMonth)
                .orElseThrow(() -> new DataProcessingException("Unable to calculate max income month."));
 
            MaxValues maxValues = new MaxValues(maxInvestMonth, maxIncomeMonth);
 
            return new UserReportResponse(request.getUserId(), request.getUserName(), transactions, maxValues);
 
        } catch (Exception ex) {
            throw new DataProcessingException("An error occurred while processing the report.");
        }
    }
}
 