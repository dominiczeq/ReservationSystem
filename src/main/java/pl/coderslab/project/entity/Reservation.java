package pl.coderslab.project.entity;


import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;




@Entity
public class Reservation {

	@Id
	private long id;
	
	private String clientName;
	private String phoneNumber;
	
	@ManyToOne
	@JoinColumn(name = "hairdresser_id")
	private Hairdresser hairdresser;
	
	@ManyToOne
	@JoinColumn(name = "service_id")
	private Service service;
	
	private LocalDateTime date;
	
	
	
	
}
