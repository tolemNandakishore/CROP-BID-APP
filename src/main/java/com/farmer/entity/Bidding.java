package com.farmer.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Tbl_Bidding")
public class Bidding {
	@Id
	@Column(name="Bidding_Id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long biddingId;
	@Column(name="Crop_name")
	private String cropName;
	@Column(name="Crop_type")
	private String cropType;
	@Column(name="Quantity")
	private int quantity;
	@Column(name="Current_Price")
	private Double currentPrice;
	
	private Crops crops;
	
	@Column(name="Base_Price")
	private Double basePrice;
	public Long getBiddingId() {
		return biddingId;
	}
	public void setBiddingId(Long biddingId) {
		this.biddingId = biddingId;
	}
	public String getCropName() {
		return cropName;
	}
	public void setCropName(String cropName) {
		this.cropName = cropName;
	}
	public String getCropType() {
		return cropType;
	}
	public void setCropType(String cropType) {
		this.cropType = cropType;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Double getCurrentPrice() {
		return currentPrice;
	}
	public void setCurrentPrice(Double currentPrice) {
		this.currentPrice = currentPrice;
	}
	
	public Crops getCrops() {
		return crops;
	}
	public void setCrops(Crops crops) {
		this.crops = crops;
	}
	public Double getBasePrice() {
		return basePrice;
	}
	public void setBasePrice(Double basePrice) {
		this.basePrice = basePrice;
	}
	
	
}
