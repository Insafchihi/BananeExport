package com.export.main.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.export.main.entities.Commande;
import com.export.main.entities.Destinataire;



public interface CommandeRepo extends  JpaRepository<Commande, Long>    {
	@Query("SELECT t FROM Commande t where t.destinataire.id = :id ")
	 List<Commande> findByDestinataire(@Param("id") Long id);
}
