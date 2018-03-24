package itssmt.edu.curso;

import java.util.ArrayList;
import java.util.List;

import itssmt.edu.curso.interfaz.INombres;
import itssmt.edu.curso.interfazimp.Nombres;

public class Maindebub {
	
	
	public static void main(String [] ar){
		
		
		INombres nomb = new Nombres();
		
		List<String> lista = null;
		
		int cant = 6;
		try {
			
			
			lista= nomb.creaListaNombres(cant);
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
		
		
		lista.add(null);
		lista.add("Angel");
		
		
		
		
		for (String nombre:lista) {
			
			System.out.println(nombre);
			
		}
		
		System.out.println(lista.size());
		

		
		
		
		
	}
	

}
