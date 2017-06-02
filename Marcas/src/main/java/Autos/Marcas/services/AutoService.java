package Autos.Marcas.services;

import java.text.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import Autos.Marcas.persistence.AutoDao;
import Autos.Marcas.persistence.MarcaDao;
import Autos.Marcas.entities.Auto;
import Autos.Marcas.entities.Marca;

import java.util.List;

@Service
public class AutoService {
	AutoDao autoDao;
	//MarcaDao marcaDao;

	@Autowired
	public AutoService(AutoDao dao/*, MarcaDao md*/) {
		this.autoDao = dao;
		//this.marcaDao = md;
	}

	public List<Auto> getAll() {
		return autoDao.getAll();
	}

	public Auto getAuto(int id) {
		return autoDao.getById(id);
	}

	public void newAuto(Marca marca, String modelo, long kms, String patente, int anio) throws ParseException {
		Auto a = new Auto();
		//Marca m = new Marca();
		a.setAnio(anio);
		//m.setDescripcion(marca.getDescripcion());
		a.setKms(kms);
		a.setMarca(marca);
		a.setModelo(modelo);
		a.setPatente(patente);
		//this.marcaDao.save(m);
		this.autoDao.save(a);		
	}

	public List<Auto> getByMarca(Marca marca) {
		return autoDao.getByMarca(marca);
	}

}
