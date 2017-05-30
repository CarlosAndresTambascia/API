package Autos.Marcas.persistence;

import java.util.List;

public abstract class AbstractDao<K> {
	public AbstractDao() {

	}
	
	abstract List<K> getAll();

	abstract K getById(int id);

	abstract void save(K value);
}
