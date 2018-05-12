package itssmt.taller.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import itssmt.taller.modelo.Profesor;
import itssmt.taller.service.IMaestroService;

@RestController
@RequestMapping("/maestro")
public class MaestroController {

	@Autowired
	IMaestroService maestroService;
	
	@PostMapping(value="/save")
public String saveMaestro(@RequestBody Profesor maestro){
		
		return maestroService.save(maestro);
	
}	
	
	
}
