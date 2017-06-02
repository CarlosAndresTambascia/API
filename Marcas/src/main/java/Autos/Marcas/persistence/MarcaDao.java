package Autos.Marcas.persistence;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;
import Autos.Marcas.entities.Marca;

@Repository
public class MarcaDao extends AbstractDao<Marca>{

	List<Marca> list;
	static int LAST_ID = 0;
	
	public MarcaDao(){
		super();
		this.list = new ArrayList<Marca>();
	}
	
	@Override
	public List<Marca> getAll() {
		return list;
	}

	@Override
	public Marca getById(int id) {
		for (Marca m : list) {
			if (id == m.getId()) {
				return m;
			}
		}
		return null;
	}

	@Override
	public void save(Marca m) {
		m.setId(++LAST_ID);		
		list.add(m);
		
	}

}
