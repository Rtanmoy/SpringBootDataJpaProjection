package com.app.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {
	@Id
	private Integer prodId;	
	private String prodModel;
	private String prodVendor;
	private String prodCode;
	private Double prodCost;
	public Product() {
		super();
	}
	
	public Product(Integer prodId, String prodModel, String prodVendor, String prodCode, Double prodCost) {
		super();
		this.prodId = prodId;
		this.prodModel = prodModel;
		this.prodVendor = prodVendor;
		this.prodCode = prodCode;
		this.prodCost = prodCost;
	}

	public Integer getProdId() {
		return prodId;
	}
	public void setProdId(Integer prodId) {
		this.prodId = prodId;
	}
	public String getProdModel() {
		return prodModel;
	}
	public void setProdModel(String prodModel) {
		this.prodModel = prodModel;
	}
	public String getProdVendor() {
		return prodVendor;
	}
	public void setProdVendor(String prodVendor) {
		this.prodVendor = prodVendor;
	}
	public String getProdCode() {
		return prodCode;
	}
	public void setProdCode(String prodCode) {
		this.prodCode = prodCode;
	}
	public Double getProdCost() {
		return prodCost;
	}
	public void setProdCost(Double prodCost) {
		this.prodCost = prodCost;
	}
	@Override
	public String toString() {
		return "Product [prodId=" + prodId + ", prodModel=" + prodModel + ", prodVendor=" + prodVendor + ", prodCode="
				+ prodCode + ", prodCost=" + prodCost + "]";
	}
	
}