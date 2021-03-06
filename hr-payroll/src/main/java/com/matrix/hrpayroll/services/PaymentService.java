package com.matrix.hrpayroll.services;

import org.springframework.stereotype.Service;

import com.matrix.hrpayroll.entities.Payment;

@Service
public class PaymentService {
	
	public Payment getPayment(long workerId, int days) {
		return new Payment("Bob", 200.0, days);
	}

}
