package com.lti.FinanceManagement.ReportModel;

public class Transaction {
    private String month;
    private double expenseAmount;
    private double amountInvested;
    private double incomeAmount;
 
    // Constructor
    public Transaction(String month, double expenseAmount, double amountInvested, double incomeAmount) {
        this.month = month;
        this.expenseAmount = expenseAmount;
        this.amountInvested = amountInvested;
        this.incomeAmount = incomeAmount;
    }

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public double getExpenseAmount() {
		return expenseAmount;
	}

	public void setExpenseAmount(double expenseAmount) {
		this.expenseAmount = expenseAmount;
	}

	public double getAmountInvested() {
		return amountInvested;
	}

	public void setAmountInvested(double amountInvested) {
		this.amountInvested = amountInvested;
	}

	public double getIncomeAmount() {
		return incomeAmount;
	}

	public void setIncomeAmount(double incomeAmount) {
		this.incomeAmount = incomeAmount;
	}
    
    
 
    // Getters and Setters
}