package com.klef.jfsd.exam.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="order_table")
public class Order
{
	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int OrderID;
	@Column(nullable = false,length = 50)
	private String ProductName;
	@Column(nullable = false)
	private int Quantity;
	@Column(nullable = false,length = 50)
	private Date OrderDate;
	@Column(nullable = false,length = 50)
	private String CustomerName;
	public int getOrderID() {
		return OrderID;
	}
	public void setOrderID(int orderID) {
		OrderID = orderID;
	}
	public String getProductName() {
		return ProductName;
	}
	public void setProductName(String productName) {
		ProductName = productName;
	}
	public int getQuantity() {
		return Quantity;
	}
	public void setQuantity(int quantity) {
		Quantity = quantity;
	}
	public Date getOrderDate() {
		return OrderDate;
	}
	public void setOrderDate(Date orderDate) {
		OrderDate = orderDate;
	}
	public String getCustomerName() {
		return CustomerName;
	}
	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}

}
