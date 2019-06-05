package com.devhoss.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.devhoss.model.Persona;


public interface IPersonaRepository  extends JpaRepository<Persona, Long>{

}
