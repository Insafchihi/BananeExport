package com.export.main.rest;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.sound.midi.Soundbank;
import javax.validation.Valid;

import javassist.NotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.RestController;

import com.export.main.entities.Commande;
import com.export.main.entities.Destinataire;
import com.export.main.service.DerstinataireService;




@RequestMapping(value = "/service")
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
@RestController

public class DestinataireRest {

	@Autowired
	DerstinataireService DestinataireService;


	private static final int EXPIRATION = 90;

	@RequestMapping(value = "/ajoutDestinataire", method = RequestMethod.POST)
	public void addDestinataire(@RequestBody Destinataire destinataire) {

		DestinataireService.saveDestinataire(destinataire);

	}

	@RequestMapping(value = "/getDestinataires", method = RequestMethod.GET)
	public List<Destinataire> getListDestinataire() {

	return	DestinataireService.findDestitnataires();

	}
	@RequestMapping(value = "/listeCommandes/{id}", method = RequestMethod.GET)
	public List<Commande> getListCommandes(@PathVariable  Long id) {

	return	DestinataireService.listeCommandParDest(id);

	}
}
