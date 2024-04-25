package com.app.Transanction_Mangement.dto;

import com.app.Transanction_Mangement.entity.PassengerInfo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FlightBookingAcknowledgement {

	private String status;
	private Double totalFare;
	private String pnrNo;
	private PassengerInfo passengerInfo;
	
	
	
	public FlightBookingAcknowledgement(String status, Double totalFare, String pnrNo, PassengerInfo passengerInfo) {
		super();
		this.status = status;
		this.totalFare = totalFare;
		this.pnrNo = pnrNo;
		this.passengerInfo = passengerInfo;
	}
	
	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	/**
	 * @return the totalFare
	 */
	public Double getTotalFare() {
		return totalFare;
	}
	/**
	 * @param totalFare the totalFare to set
	 */
	public void setTotalFare(Double totalFare) {
		this.totalFare = totalFare;
	}
	/**
	 * @return the pnrNo
	 */
	public String getPnrNo() {
		return pnrNo;
	}
	/**
	 * @param pnrNo the pnrNo to set
	 */
	public void setPnrNo(String pnrNo) {
		this.pnrNo = pnrNo;
	}
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
	
	
}
