package Autos.Marcas.request;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AutoRequest {

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

	@JsonProperty("marca")
	String marca;
	@JsonProperty("modelo")
	String modelo;
	@JsonProperty("kms")
	long kms;
	@JsonProperty("patente")
	String patente;
	@JsonProperty("anio")
	int anio;
}
