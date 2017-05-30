package Autos.Marcas.services;

import java.text.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import Autos.Marcas.persistence.AutoDao;
import Autos.Marcas.entities.Auto;
import java.util.List;

@Service
public class AutoService {
	AutoDao autoDao;

	@Autowired
	public AutoService(AutoDao dao) {
		this.autoDao = dao;
	}

	public List<Auto> getAll() {
		return autoDao.getAll();
	}

	public Auto getAuto(int id) {
		return autoDao.getById(id);
	}

	public void newAuto(String marca, String modelo, long kms, String patente, int anio) throws ParseException {
		Auto a = new Auto();
		a.setAnio(anio);
		a.setKms(kms);
		a.setMarca(marca);
		a.setModelo(modelo);
		a.setPatente(patente);
		this.autoDao.save(a);
	}

	public List<Auto> getByMarca(String marca) {
		return autoDao.getByMarca(marca);
	}

}
