package pl.coderslab.project.controller;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import pl.coderslab.project.bean.SessionManager;
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
	public String addReservation(Model m, @ModelAttribute Reservation reservationFromForm,
			BindingResult bindingResult) {

		LocalTime startWork = reservationFromForm.getHairdresser().getStartWork();
		LocalTime endWork = reservationFromForm.getHairdresser().getEndWork();

		Hairdresser employee = reservationFromForm.getHairdresser();
		LocalDate dateReservation = reservationFromForm.getDateService();

		LocalTime potentialStartTime = startWork;
		int serviceTime = reservationFromForm.getService().getTime();

		List<Reservation> reservations = null;
		List<LocalTime> potencialTimes = new ArrayList<LocalTime>();

		for (int i = startWork.getHour(); i < endWork.getHour() * 2 + 1; i++) {
			reservations = this.reservationRepo.findByReservation(employee, dateReservation, potentialStartTime,
					potentialStartTime.plusMinutes(serviceTime));
			if (reservations.size() == 0 && potentialStartTime.plusMinutes(serviceTime).isBefore(endWork)) {
				potencialTimes.add(potentialStartTime);
			}
			potentialStartTime = potentialStartTime.plusMinutes(30);

		}

		m.addAttribute("reservation", reservationFromForm);
		m.addAttribute("potencialTimes", potencialTimes);

		HttpSession s = SessionManager.session();
		s.setAttribute("reservationSession", reservationFromForm);

		for (LocalTime t : potencialTimes) {
			System.out.println(t);
		}

		return "/addReservation2";
	}

	@GetMapping("/addReservation2")
	public String addReservation2(Model m) {

		return "/addReservation2";
	}

	@PostMapping("/addReservation2")
	public String addReservation22(Model m, @ModelAttribute Reservation reservation) {

		HttpSession s = SessionManager.session();

		Reservation result = new Reservation();
		result = (Reservation) s.getAttribute("reservationSession");
		result.setStartTimeService(reservation.getStartTimeService());
		this.reservationRepo.save(result);
		s.invalidate();

		return "/reservationComplete";
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
