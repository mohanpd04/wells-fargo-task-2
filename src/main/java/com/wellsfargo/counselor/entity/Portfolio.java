package com.wellsfargo.counselor.entity;

import java.time.LocalDate;
import java.util.Date;

import org.apache.el.parser.AstFalse;
import org.springframework.data.annotation.CreatedDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Portfolio {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long portfolioId;
	
	@CreatedDate
	@Column(nullable = false, updatable = false)
	private LocalDate creationDate;
	
	@OneToOne
	@JoinColumn(name = "client_id", nullable = false)
	private Client client;
	
	

	public Portfolio(LocalDate creationDate, Client client) {
		super();
		this.creationDate = creationDate;
		this.client = client;
	}
	
	

	protected Portfolio() {
		
		// TODO Auto-generated constructor stub
	}



	public LocalDate getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(LocalDate creationDate) {
		this.creationDate = creationDate;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
	
	

}
