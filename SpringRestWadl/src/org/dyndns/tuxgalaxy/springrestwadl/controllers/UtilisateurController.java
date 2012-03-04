package org.dyndns.tuxgalaxy.springrestwadl.controllers;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.dyndns.tuxgalaxy.springrestwadl.bean.Utilisateur;
import org.dyndns.tuxgalaxy.springrestwadl.bean.Utilisateurs;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/utilisateur")
public class UtilisateurController {
	
	private static final Log log = LogFactory.getLog(UtilisateurController.class);
	
	@RequestMapping(method=RequestMethod.GET, 
			value="/list", 
			headers="Accept=application/xml, application/json" )
	public @ResponseBody Utilisateurs searchUsers(@RequestParam(required=false,value="utilisateur") String utilisateur, @RequestParam(required=false,value="valeur") String valeur ) throws Exception {
		
		if ( utilisateur == null && valeur == null ) {
			throw new Exception("L'utilisateur et le valeur ne peuvent être null ensemble.");
		}
		
	
		Utilisateurs utilisateurs = new Utilisateurs();
		Utilisateur compt = new Utilisateur();
		compt.setUtilisateur(valeur);
		compt.setCompteur("foo");
		compt.setValeur("bar");
		utilisateurs.getCompteurs().add(compt);
		
	    return utilisateurs;
	}
	
	
	@RequestMapping(method=RequestMethod.POST, value="/test/{id}" )
	public void testUtilisateur( @PathVariable(value="id") int id ) throws Exception {
		// test
		log.info("testCompteur");
		
	}
	
	
}
