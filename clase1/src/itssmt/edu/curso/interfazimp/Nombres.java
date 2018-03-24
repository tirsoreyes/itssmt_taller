package itssmt.edu.curso.interfazimp;

import java.util.ArrayList;
import java.util.List;

import itssmt.edu.curso.interfaz.INombres;
import itssmt.edu.curso.modelo.Alumno;
import itssmt.edu.curso.modelo.GenericClass;
import sun.net.www.content.text.Generic;

public class Nombres implements INombres {

	@Override
	public List<String> creaListaNombres(int cant) throws Exception {
		
		GenericClass<Alumno> respuestaTotal = new GenericClass<>();
		
		
		respuestaTotal.setCode(200);
		respuestaTotal.setMensaje("hola lo que sea");
		
		
		Alumno respuesta = new Alumno();
		
		respuesta.setCurso("java");
		respuesta.setNombre("Miguel");
		respuestaTotal.setRespuesta(respuesta);
		
		
		
		List<String> lista = new ArrayList<>();
		
		for (int i = 0; i < cant; i++) {
			
			lista.add("nombre"+i);
			
		}
		
		
		return lista;
	}

}
