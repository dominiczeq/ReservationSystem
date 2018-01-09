package pl.coderslab.project.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Reservation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	private String clientName;
	private String phoneNumber;

	@ManyToOne
	@JoinColumn(name = "hairdresser_id")
	private Hairdresser hairdresser;

	@ManyToOne
	@JoinColumn(name = "service_id")
	private Service service;

	private LocalDateTime startTimeService;

	
	public Reservation() {
		super();
	}

	public Reservation(String clientName, String phoneNumber, Hairdresser hairdresser, Service service,
			LocalDateTime startTimeService) {
		super();
		this.clientName = clientName;
		this.phoneNumber = phoneNumber;
		this.hairdresser = hairdresser;
		this.service = service;
		this.startTimeService = startTimeService;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Hairdresser getHairdresser() {
		return hairdresser;
	}

	public void setHairdresser(Hairdresser hairdresser) {
		this.hairdresser = hairdresser;
	}

	public Service getService() {
		return service;
	}

	public void setService(Service service) {
		this.service = service;
	}

	public LocalDateTime getStartTimeService() {
		return startTimeService;
	}

	public void setStartTimeService(LocalDateTime startTimeService) {
		this.startTimeService = startTimeService;
	}

}
