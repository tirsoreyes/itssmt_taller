package itssmt.taller.serviceimp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import itssmt.taller.dao.ITMaestroDao;
import itssmt.taller.entity.TMaestro;
import itssmt.taller.modelo.Profesor;
import itssmt.taller.service.IMaestroService;

@Service
public class MaestroService implements IMaestroService {

	@Autowired
	ITMaestroDao maestroDao;
	@Override
	public String save(Profesor maestro) {
		
		TMaestro tMaestro = new TMaestro();
		tMaestro.setApellidos(maestro.getApellidos());
		tMaestro.setNombre(maestro.getNombre());
		maestroDao.save(tMaestro);
		
		
		
		
		return tMaestro==null?"No se pudo guardar el profesor":"Se almaceno el profesor";
	}

}
