package pl.coderslab.project.entity;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "reservation")
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

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate dateService;

	private LocalTime startTimeService;
	private LocalTime endTimeService;

	public Reservation(String clientName, String phoneNumber, Hairdresser hairdresser, Service service,
			LocalDate dateService, LocalTime startTimeService) {
		super();
		this.clientName = clientName;
		this.phoneNumber = phoneNumber;
		this.hairdresser = hairdresser;
		this.service = service;
		this.dateService = dateService;
		this.startTimeService = startTimeService;
	}

	public Reservation() {
		super();
	}
	
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public LocalTime getEndTimeService() {
		return endTimeService;
	}

	public void setEndTimeService(LocalTime endTimeService) {
		this.endTimeService = endTimeService;
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

	public LocalDate getDateService() {
		return dateService;
	}

	public void setDateService(LocalDate dateService) {
		this.dateService = dateService;
	}

	public LocalTime getStartTimeService() {
		return startTimeService;
	}

	public void setStartTimeService(LocalTime startTimeService) {
		this.startTimeService = startTimeService;
	}

	@Override
	public String toString() {
		return "Rezerwacja nr: " + id + ", Klient: " + clientName + ", phoneNumber=" + phoneNumber + ", fryzjer: "
				+ hairdresser + ", usługa: " + service + ", dateService=" + dateService
				+ ", startTimeService=" + startTimeService;
	}

}
