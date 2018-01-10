package pl.coderslab.project.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import pl.coderslab.project.entity.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long>{
	
	List<Reservation> findByStartDateService(LocalDate startDateService);

}
