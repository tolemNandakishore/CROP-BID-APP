package com.farmer.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Tbl_Bid_History")
public class BiddingHistory {
	
	@Id
	@Column(name="Bid_H_Id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long bidHistoryId;
	@Column(name="Sold_Price")
	private double soldPrice;
	
	private Crops crops;
	private BidderRegistration bidderRegistration;
	private Bidding bidding;
	@Column(name="Date")
	private LocalDate date;
	@Column(name="Total_Price")
	private Double totalPrice;
	public Long getBidHistoryId() {
		return bidHistoryId;
	}
	public void setBidHistoryId(Long bidHistoryId) {
		this.bidHistoryId = bidHistoryId;
	}
	public double getSoldPrice() {
		return soldPrice;
	}
	public void setSoldPrice(double soldPrice) {
		this.soldPrice = soldPrice;
	}
	public Crops getCrops() {
		return crops;
	}
	public void setCrops(Crops crops) {
		this.crops = crops;
	}
	public BidderRegistration getBidderRegistration() {
		return bidderRegistration;
	}
	public void setBidderRegistration(BidderRegistration bidderRegistration) {
		this.bidderRegistration = bidderRegistration;
	}
	public Bidding getBidding() {
		return bidding;
	}
	public void setBidding(Bidding bidding) {
		this.bidding = bidding;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public Double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(Double totalPrice) {
		this.totalPrice = totalPrice;
	}
	
	

}
