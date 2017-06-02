package Autos.Marcas.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import Autos.Marcas.entities.Marca;

public class MarcaRequest {
	
	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	@JsonProperty("descripcion")
	String descripcion;
}
