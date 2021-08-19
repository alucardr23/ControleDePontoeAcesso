package com.dio.Project1.model.controller.repository;

import com.dio.Project1.model.JornadaTrabalho;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
@Repository
public interface  JornadaRepository extends JpaRepository<JornadaTrabalho, Long> {

}
