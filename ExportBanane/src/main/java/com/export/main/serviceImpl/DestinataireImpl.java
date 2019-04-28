package com.export.main.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.export.main.entities.Commande;
import com.export.main.entities.Destinataire;
import com.export.main.repo.CommandeRepo;
import com.export.main.repo.DestinataireRepo;
import com.export.main.service.DerstinataireService;

@Service
public class DestinataireImpl implements DerstinataireService{

	@Autowired
	DestinataireRepo destinataireRepo ;

	@Autowired
	CommandeRepo commandeRepo ;
	@Override
	public Destinataire saveDestinataire(Destinataire destinataire) {
		// TODO Auto-generated method stub
		return destinataireRepo.save(destinataire);
	}
	@Override
	public List<Destinataire> findDestitnataires() {
		// TODO Auto-generated method stub
		return destinataireRepo.findAll();
	}
	@Override
	public List<Commande> listeCommandParDest(Long id) {
		// TODO Auto-generated method stub
	
		return commandeRepo.findByDestinataire(id);
	}

}
