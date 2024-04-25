package com.app.Transanction_Mangement.entity;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Payment_Info")
public class PayementInfo {
	
	@Id
	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name = "uuid2",strategy = "org.hibernate.id.UUIDGenerator")
	private String payementId;
	private String accountNo;
	private Double amount;
	private String cardType;
	private Long passengerId;
	/**
	 * @return the payementId
	 */
	public String getPayementId() {
		return payementId;
	}
	/**
	 * @param payementId the payementId to set
	 */
	public void setPayementId(String payementId) {
		this.payementId = payementId;
	}
	/**
	 * @return the accountNo
	 */
	public String getAccountNo() {
		return accountNo;
	}
	/**
	 * @param accountNo the accountNo to set
	 */
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	/**
	 * @return the amount
	 */
	public Double getAmount() {
		return amount;
	}
	/**
	 * @param amount the amount to set
	 */
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	/**
	 * @return the cardType
	 */
	public String getCardType() {
		return cardType;
	}
	/**
	 * @param cardType the cardType to set
	 */
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	/**
	 * @return the passengerId
	 */
	public Long getPassengerId() {
		return passengerId;
	}
	/**
	 * @param passengerId the passengerId to set
	 */
	public void setPassengerId(Long passengerId) {
		this.passengerId = passengerId;
	}
	private PayementInfo(String payementId, String accountNo, Double amount, String cardType, Long passengerId) {
		super();
		this.payementId = payementId;
		this.accountNo = accountNo;
		this.amount = amount;
		this.cardType = cardType;
		this.passengerId = passengerId;
	}
	
	
}
