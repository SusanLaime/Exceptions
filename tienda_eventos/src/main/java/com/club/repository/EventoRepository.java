package com.club.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.club.model.EventoModel;

@Repository
public interface EventoRepository extends JpaRepository<EventoModel, Long>{
	// Additional query methods (if needed) can be defined here
} 