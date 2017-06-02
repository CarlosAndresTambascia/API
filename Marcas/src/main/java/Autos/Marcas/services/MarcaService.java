package Autos.Marcas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Autos.Marcas.entities.Marca;
import Autos.Marcas.persistence.MarcaDao;

@Service
public class MarcaService {
	
	MarcaDao marcaDao;
	@Autowired
	public MarcaService(){
		
	}
	
	public List<Marca> getAll() {
		return marcaDao.getAll();
	}

	public Marca getMarca(int id) {
		return marcaDao.getById(id);
	}
	public Marca newMarca(String descripcion){
		Marca m = new Marca();
		m.setDescripcion(descripcion);
		this.marcaDao.save(m);
		return m;
	}
}
