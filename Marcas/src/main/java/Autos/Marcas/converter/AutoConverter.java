package Autos.Marcas.converter;

import Autos.Marcas.entities.Auto;
import Autos.Marcas.response.AutoWrapper;

public class AutoConverter {
	public AutoWrapper convert (Auto auto){
		AutoWrapper aw = new AutoWrapper();
		aw.setAnio(auto.getAnio());
		aw.setKms(auto.getKms());
		aw.setMarca(auto.getMarca());
		aw.setPatente(auto.getPatente());
		return aw;
	}

}
