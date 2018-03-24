package edu.itssmt.debug;

import java.util.ArrayList;
import java.util.List;

import edu.itssmt.modelo.Modelo1;
import net.webservicex.GlobalWeather;
import net.webservicex.GlobalWeatherSoap;

public class Proceso {

	public List<String> procesaDatos(List<Modelo1> lista) {
		
		List<String> retorno = new ArrayList<>();
		
		GlobalWeather service = new GlobalWeather();
		
		GlobalWeatherSoap soap = service.getGlobalWeatherSoap();
		
		
		
	retorno.add(soap.getCitiesByCountry(String.valueOf(lista.get(0).getDescripcion())));
		
		
		
		
		
		if(lista.size()>0)
		retorno.add("Terminado");
		else
			retorno.add("Error");
		
		
		
		
		
		return retorno;
		
	}


	}


