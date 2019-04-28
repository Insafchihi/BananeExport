package com.export.main.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.export.main.entities.Commande;
import com.export.main.entities.Destinataire;


public interface DerstinataireService {

	Destinataire saveDestinataire(Destinataire destinataire);
	List<Destinataire> findDestitnataires();
	List<Commande> listeCommandParDest(Long id);
}
