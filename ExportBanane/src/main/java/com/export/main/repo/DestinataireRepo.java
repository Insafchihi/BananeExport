package com.export.main.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.export.main.entities.Destinataire;

public interface DestinataireRepo extends JpaRepository<Destinataire, Long>  {
	

}
