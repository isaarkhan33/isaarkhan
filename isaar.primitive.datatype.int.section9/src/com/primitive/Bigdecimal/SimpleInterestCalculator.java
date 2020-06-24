package com.primitive.Bigdecimal;

import java.math.BigDecimal;

public class SimpleInterestCalculator {
	
	BigDecimal principal;
	BigDecimal interest;
	
	public SimpleInterestCalculator(String principal, String interest) {
			
		this.principal= new BigDecimal(principal);
		this.interest = new BigDecimal(interest).divide(new BigDecimal(100));

	}

	public BigDecimal calculateTotalValue(int noOfYears) {
		
		//Total value =principal + principal *interest *noOfYears
		
		BigDecimal noOfYearsBigDecimal = new BigDecimal(noOfYears);//can construct this way noOfyearsBigDecimal
		
		BigDecimal totalValue=principal.add(principal.multiply(interest).multiply(new BigDecimal(noOfYears)));
		
		
		return totalValue;
		
	}

}
