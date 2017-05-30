package Autos.Marcas.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AutoWrapper {
	@JsonProperty
	String marca;
	@JsonProperty
	String modelo;
	@JsonProperty
	long kms;
	@JsonProperty
	String patente;
	@JsonProperty
	int anio;

	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public long getKms() {
		return kms;
	}

	public void setKms(long kms) {
		this.kms = kms;
	}

	public String getPatente() {
		return patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	
}
