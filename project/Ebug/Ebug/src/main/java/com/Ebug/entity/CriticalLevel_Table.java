package com.Ebug.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;


@Entity
public class CriticalLevel_Table {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	private String type;
	
//	@OneToMany(fetch = FetchType.LAZY, mappedBy = "criticalLevel")
//	@JsonIgnoreProperties("criticalLevel")
//	@JsonManagedReference(value="criticalLevel")
//	private List<Ticket_Table> tickets ;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}


	public CriticalLevel_Table(Long id, String type) {
		super();
		this.id = id;
		this.type = type;
	}

	public CriticalLevel_Table() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
