package pl.coderslab.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pl.coderslab.project.entity.Service;

public interface ServiceRepository extends JpaRepository<Service, Long> {

}
