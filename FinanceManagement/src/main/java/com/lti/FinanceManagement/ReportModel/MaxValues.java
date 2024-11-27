package com.lti.FinanceManagement.ReportModel;

public class MaxValues {
    private String maxInvestMonth;
    private String maxIncomeMonth;
 
    // Constructor
    public MaxValues(String maxInvestMonth, String maxIncomeMonth) {
        this.maxInvestMonth = maxInvestMonth;
        this.maxIncomeMonth = maxIncomeMonth;
    }

	public String getMaxInvestMonth() {
		return maxInvestMonth;
	}

	public void setMaxInvestMonth(String maxInvestMonth) {
		this.maxInvestMonth = maxInvestMonth;
	}

	public String getMaxIncomeMonth() {
		return maxIncomeMonth;
	}

	public void setMaxIncomeMonth(String maxIncomeMonth) {
		this.maxIncomeMonth = maxIncomeMonth;
	}
 
    
    // Getters and Setters
}
 