package com.example.transactionsAPI.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name="TRANSACTION_TABLE")
public class Transaction {
	
	@Id
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name="system-uuid",strategy = "uuid")
	@Column(name="TRANSACTION_ID")
	private String transactionId;
	
	@Column(name = "TRASACTION_NAME")
	private String transactionName;
	
	@Column(name = "TRANSACTION_BY")
	private String transactionBy;
	
	@Column(name ="TRANSACTION_CREATED_AT")
	@CreationTimestamp
	private LocalDateTime transactionCreatedAt;
	
	
	@Column(name = "TRASACTION_UPDATED_AT")
	@UpdateTimestamp
	private LocalDateTime transactinUpdatedAt;
	
	
	@Column(name = "TRASACTION_AMOUNT")
	private Float transactionAmount;
	
	@Column(name="TRANSACTION_STATUS")
	private String trasactionStatus;
	
	
	

	

	

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public String getTransactionName() {
		return transactionName;
	}

	public void setTransactionName(String transactionName) {
		this.transactionName = transactionName;
	}

	public String getTransactionBy() {
		return transactionBy;
	}

	public void setTransactionBy(String transactionBy) {
		this.transactionBy = transactionBy;
	}

	public LocalDateTime getTransactionCreatedAt() {
		return transactionCreatedAt;
	}

	public void setTransactionCreatedAt(LocalDateTime transactionCreatedAt) {
		this.transactionCreatedAt = transactionCreatedAt;
	}

	public LocalDateTime getTransactinUpdatedAt() {
		return transactinUpdatedAt;
	}

	public void setTransactinUpdatedAt(LocalDateTime transactinUpdatedAt) {
		this.transactinUpdatedAt = transactinUpdatedAt;
	}

	public Float getTransactionAmount() {
		return transactionAmount;
	}

	public void setTransactionAmount(Float transactionAmount) {
		this.transactionAmount = transactionAmount;
	}

	public String getTrasactionStatus() {
		return trasactionStatus;
	}

	public void setTrasactionStatus(String trasactionStatus) {
		this.trasactionStatus = trasactionStatus;
	}
}
