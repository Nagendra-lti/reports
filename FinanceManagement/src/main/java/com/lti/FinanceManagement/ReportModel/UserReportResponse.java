package com.lti.FinanceManagement.ReportModel;

import java.util.List;

public class UserReportResponse {
    private String userId;
    private String userName;
    private List<Transaction> transactions;
    private MaxValues maxValues;
 
    // Constructor
    public UserReportResponse(String userId, String userName, List<Transaction> transactions, MaxValues maxValues) {
        this.userId = userId;
        this.userName = userName;
        this.transactions = transactions;
        this.maxValues = maxValues;
    }

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public List<Transaction> getTransactions() {
		return transactions;
	}

	public void setTransactions(List<Transaction> transactions) {
		this.transactions = transactions;
	}

	public MaxValues getMaxValues() {
		return maxValues;
	}

	public void setMaxValues(MaxValues maxValues) {
		this.maxValues = maxValues;
	}
 
    // Getters and Setters
}