package itssmt.taller.service;

import org.springframework.stereotype.Component;

import itssmt.taller.modelo.Profesor;

@Component
public interface IMaestroService {

	public String save(Profesor maestro);

}
