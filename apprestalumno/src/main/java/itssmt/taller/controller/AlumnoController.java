package itssmt.taller.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import itssmt.taller.modelo.Alumno;
import itssmt.taller.modelo.GenericResponse;

@RestController
@RequestMapping("/rest")
public class AlumnoController {

	@GetMapping(value="/test")
	public String test(){
		return "hello world!";
	}
	
	
	@GetMapping(value="/respuesta")
	public String respuesta(@RequestParam(value="nombre",required=true) String tuNombre){
		
		return "hello  "+tuNombre;
	}
	
	
	
	@GetMapping(value="/respuesta2")
	public String respuesta2sdfsdf(@RequestParam(value="nombre",required=true) String tuNombre,
			@RequestParam(value="apellido",required=false) String tuApellido){
		
		String apellido=  tuApellido==null?"sin apellido":tuApellido;
		
		return "hello  "+tuNombre+" "+apellido;
	}
	
	
	@PostMapping(value="/saveAlumno")
	public GenericResponse<Alumno> saveAlumno(@RequestBody Alumno alumno){
		GenericResponse<Alumno> response = new GenericResponse<>();
		
		
		response.setCode(200);
		response.setMessage("El alumno "+alumno.getNombre()+ " se guardo correctamente.");
		response.setResponse(alumno);
		
		return response;
		
	}
	
	
	
	
	
	
}
