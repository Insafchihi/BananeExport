package com.export.main.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.export.main.entities.Commande;
import com.export.main.repo.CommandeRepo;
import com.export.main.repo.DestinataireRepo;
import com.export.main.service.CommandeService;

@Service
public class CommandImpl implements CommandeService {
	
	
	
	@Autowired
	CommandeRepo commandeRepo ;

	@Override
	public Commande saveCommande(Commande commande) {
		// TODO Auto-generated method stub
		return commandeRepo.save(commande);
	}

}
