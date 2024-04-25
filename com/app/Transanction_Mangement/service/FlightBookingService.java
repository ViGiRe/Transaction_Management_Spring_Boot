package com.app.Transanction_Mangement.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.Transanction_Mangement.dto.FlightBookingAcknowledgement;
import com.app.Transanction_Mangement.dto.FlightBookingRequest;
import com.app.Transanction_Mangement.entity.PassengerInfo;
import com.app.Transanction_Mangement.entity.PayementInfo;
import com.app.Transanction_Mangement.repository.PassengerInfoRepository;
import com.app.Transanction_Mangement.repository.PayementInfoRepository;
import com.app.Transanction_Mangement.utils.PayementUtil;

@Service
public class FlightBookingService {

	@Autowired
	private PassengerInfoRepository passengerInfoRepository;
	
	@Autowired
	private PayementInfoRepository payementInfoRepository;
	
	@Transactional 
//	(readOnly = false,isolation = Isolation.READ_COMMITTED,propagation = Propagation.REQUIRED)
	public FlightBookingAcknowledgement bookFlightTickets(FlightBookingRequest bookingRequest) {
		//persisting passenger info to db		
		PassengerInfo passengerInfo = bookingRequest.getPassengerInfo();
		passengerInfo = passengerInfoRepository.save(passengerInfo);
		
		PayementInfo payementInfo = bookingRequest.getPayementInfo();
		
		//validating the credit limit..if the paid amount is greater than balance then throw exception
		PayementUtil.validateCreditLimit(payementInfo.getAccountNo(), passengerInfo.getFare());
		
		payementInfo.setPassengerId(passengerInfo.getId());
		payementInfo.setAmount(passengerInfo.getFare());
		
		payementInfoRepository.save(payementInfo);
		return new FlightBookingAcknowledgement("SUCCESS",passengerInfo.getFare(), UUID.randomUUID().toString().split("-")[0],passengerInfo);
		
	}
}
