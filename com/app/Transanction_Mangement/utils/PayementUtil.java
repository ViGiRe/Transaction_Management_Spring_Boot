package com.app.Transanction_Mangement.utils;

import java.util.HashMap;
import java.util.Map;

import com.app.Transanction_Mangement.Exception.InsufficientBalanceException;

public class PayementUtil {
	
	public static Map<String, Double> paymentMap = new HashMap<>();
	
	static {
		paymentMap.put("acc1", 12000.0);
		paymentMap.put("acc2", 13000.0);
		paymentMap.put("acc3", 15000.0);
		paymentMap.put("acc4", 18000.0);
		paymentMap.put("acc5", 90000.0);
	}

	public static boolean validateCreditLimit(String accNo,Double paidAmount) {
		
		if (paidAmount>paymentMap.get(accNo)) {
			throw new InsufficientBalanceException("Insuffient Balance");
		}else {
			return true;
		}		
		
	}
}
