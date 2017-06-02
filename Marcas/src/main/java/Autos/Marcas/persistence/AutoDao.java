package Autos.Marcas.persistence;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;
import Autos.Marcas.entities.Auto;
import Autos.Marcas.entities.Marca;

@Repository
public class AutoDao extends AbstractDao<Auto> {

	List<Auto> list;
	static int LAST_ID = 0;

	public AutoDao() {
		super();
		this.list = new ArrayList<Auto>();
	}

	@Override
	public List<Auto> getAll() {
		return list;
	}

	@Override
	public Auto getById(int id) {
		for (Auto a : list) {
			if (id == a.getId()) {
				return a;
			}
		}
		return null;
	}

	@Override
	public void save(Auto a) {
		a.setId(++LAST_ID);		
		list.add(a);

	}

	public List<Auto> getByMarca(Marca marca) {
		List<Auto> r = new ArrayList<Auto>();
		for (Auto a : list) {
			if (marca.equals(a.getMarca())) {
				r.add(a);
			}
		}
		return r;

	}

}
