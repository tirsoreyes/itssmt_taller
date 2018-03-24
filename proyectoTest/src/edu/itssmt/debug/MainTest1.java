package edu.itssmt.debug;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import edu.itssmt.modelo.Modelo1;

public class MainTest1 {
	static Proceso p = new Proceso();
	
	
	public static void main (String [] ar){
		System.out.println(new Date());
		
		List<Modelo1> lista = new ArrayList<>();
		
		Modelo1 m1 = new Modelo1();
		m1.setCode(52);
		m1.setDescripcion("Mexico");
		String[] lol ={"Puebla"};
		m1.setLol(lol);
		lista.add(m1);
		
		List<String> respuesta = p.procesaDatos(lista);
		
	for(String r:respuesta)
		System.out.println(r);
	
		
	System.out.println(new Date());
		
	}

}
