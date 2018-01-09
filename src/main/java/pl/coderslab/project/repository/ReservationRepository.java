package pl.coderslab.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pl.coderslab.project.entity.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long>{

}
