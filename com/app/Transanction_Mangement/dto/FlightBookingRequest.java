package com.app.Transanction_Mangement.dto;

import com.app.Transanction_Mangement.entity.PassengerInfo;
import com.app.Transanction_Mangement.entity.PayementInfo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FlightBookingRequest {

	private PassengerInfo passengerInfo;
	private PayementInfo payementInfo;
	/**
	 * @return the passengerInfo
	 */
	public PassengerInfo getPassengerInfo() {
		return passengerInfo;
	}
	/**
	 * @param passengerInfo the passengerInfo to set
	 */
	public void setPassengerInfo(PassengerInfo passengerInfo) {
		this.passengerInfo = passengerInfo;
	}
	/**
	 * @return the payementInfo
	 */
	public PayementInfo getPayementInfo() {
		return payementInfo;
	}
	/**
	 * @param payementInfo the payementInfo to set
	 */
	public void setPayementInfo(PayementInfo payementInfo) {
		this.payementInfo = payementInfo;
	}
	private FlightBookingRequest(PassengerInfo passengerInfo, PayementInfo payementInfo) {
		super();
		this.passengerInfo = passengerInfo;
		this.payementInfo = payementInfo;
	}
	
	
}
