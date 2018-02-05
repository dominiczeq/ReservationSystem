package pl.coderslab.project.entity;

import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "hairdresser")
public class Hairdresser {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@NotEmpty
	private String name;
	@NotEmpty
	private String surname;
	
	private LocalTime startWork;
	private LocalTime endWork;
	

	public Hairdresser() {
		super();
		this.startWork = LocalTime.of(10, 00);
		this.endWork = LocalTime.of(18, 00);
	}
	

	public Hairdresser(String name, String surname) {
		super();
		this.name = name;
		this.surname = surname;
		this.startWork = LocalTime.of(10, 00);
		this.endWork = LocalTime.of(18, 00);
	}
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	public String getFullName() {
		return name + " " +surname;
	}
	
	
	public LocalTime getStartWork() {
		return startWork;
	}

	public void setStartWork(LocalTime startWork) {
		this.startWork = startWork;
	}

	public LocalTime getEndWork() {
		return endWork;
	}

	public void setEndWork(LocalTime endWork) {
		this.endWork = endWork;
	}

	@Override
	public String toString() {
		return "Imie i nazwisko: " + name + " " + surname;
	}

}
