package pl.coderslab.project.repository;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

 import pl.coderslab.project.entity.Hairdresser;
import pl.coderslab.project.entity.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long>{
	
	List<Reservation> findByDateService(LocalDate dateService);

//	@Query("SELECT r FROM Reservation r WHERE r.dateService = :date AND r.hairdresser = :hairdresser AND r.startTimeService = :startTimeService AND r.endTime = :endTime")
//	List<Reservation> findByServiceStartDateAndHairdresser
//			(@Param("hairdresser") Hairdresser hairdresser, 
//			@Param("date")LocalDate date, 
//			@Param("startTimeService") LocalTime startTimeService,
//			@Param("endTime") LocalTime endTime);
	
//	@Query("SELECT r FROM Reservation r WHERE r.dateService = :date AND r.hairdresser = :hairdresser")
//	List<Reservation> findByDateServiceAndHairdresser
//			(@Param("hairdresser") Hairdresser hairdresser, 
//			@Param("date")LocalDate date);
//	
//	@Query("SELECT r FROM Reservation r WHERE r.dateService = :date AND r.hairdresser = :hairdresser AND r.startTimeService = :startTimeService AND r.endTimeService = :endTimeService")
//	List<Reservation> findByServiceStartDateAndHairdresser
//			(@Param("hairdresser") Hairdresser hairdresser, 
//			@Param("date")LocalDate date, 
//			@Param("startTimeService") LocalTime startTimeService,
//			@Param("endTimeService") LocalTime endTimeService);
//	
//
//	@Query("SELECT r FROM Reservation r WHERE r.dateService = :date AND r.hairdresser = :hairdresser AND r.startTimeService BETWEEN :startTimeService AND :endTimeService")
//	List<Reservation> sqlFindByIntervalTime
//			(@Param("hairdresser") Hairdresser hairdresser, 
//			@Param("date")LocalDate date, 
//			@Param("startTimeService") LocalTime startTimeService,
//			@Param("endTimeService") LocalTime endTimeService);
	
	@Query("Select r From Reservation r WHERE r.hairdresser = :hairdresser AND r.dateService = :date AND r.startTimeService >= :startTimeService AND r.endTimeService <= :endTimeService")
	List<Reservation> findByReservation
			(@Param("hairdresser") Hairdresser hairdresser, 
			@Param("date")LocalDate date, 
			@Param("startTimeService") LocalTime startTimeService,
			@Param("endTimeService") LocalTime endTimeService);
	
}
