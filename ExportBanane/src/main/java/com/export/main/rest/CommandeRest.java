package com.export.main.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.export.main.entities.Commande;
import com.export.main.entities.Destinataire;
import com.export.main.repo.CommandeRepo;
import com.export.main.repo.DestinataireRepo;
import com.export.main.service.CommandeService;

@RequestMapping(value = "/serviceCommande")
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
@RestController
public class CommandeRest {
	@Autowired
	CommandeService commandeService ;
	
	@RequestMapping(value = "/ajoutCommande", method = RequestMethod.POST)
	public void SaveCommand(@RequestBody Commande commande) {
		// TODO Auto-generated method stub
		System.out.println("je suis "+commande.getDateLivraison());
	 commandeService.saveCommande(commande);
	}

}
