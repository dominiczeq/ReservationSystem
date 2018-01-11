package pl.coderslab.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import pl.coderslab.project.entity.Hairdresser;
import pl.coderslab.project.entity.Reservation;
import pl.coderslab.project.entity.Service;
import pl.coderslab.project.repository.HairdresserRepository;
import pl.coderslab.project.repository.ReservationRepository;
import pl.coderslab.project.repository.ServiceRepository;

@Controller
public class HomeController {

	@Autowired
	private ReservationRepository reservationRepo;

	@Autowired
	private ServiceRepository serviceRepo;

	@Autowired
	private HairdresserRepository hairdresserRepo;

	@GetMapping("")
	public String home() {
		return "home";
	}

	@GetMapping("/addReservation")
	public String addReservation(Model m) {
		Reservation res = new Reservation();
		m.addAttribute("reservation", res);
		return "/addReservation";
	}

	@PostMapping("/addReservation")
	public String addReservation(@ModelAttribute Reservation reservation, BindingResult bindingResult) {
		
		//if()
		reservation.getStartTimeService().plusMinutes(reservation.getService().getTime());
		//if(reservation.getStartTimeService())
		
	 	this.reservationRepo.save(reservation);
	 	//rezerwacja zostala dodana, dorobic widok
		return "reservationComplete";
	}

	@ModelAttribute("availableService")
	public List<Service> getServices() {
		return this.serviceRepo.findAll();
	}

	@ModelAttribute("availableHairdresser")
	public List<Hairdresser> getHairdressers() {
		return this.hairdresserRepo.findAll();
	}
	
	@GetMapping("/listReservation")
	public String list() {
		return "/listReservation";
	}
	
	@GetMapping("/reservationComplete")
	public String reservationComplete() {
		return "/reservationComplete";
	}

	@ModelAttribute("availableReservation")
	public List<Reservation> getReservations() {
		return this.reservationRepo.findAll();
	}
	
	@GetMapping("/reservation/{id}/del")
	public String delReservation(@PathVariable long id) {
		this.reservationRepo.delete(id);
		return "delReservation";
	}
	
	@GetMapping("/delReservation")
	public String delReservation() {
		return "/delReservation";
	}
}
