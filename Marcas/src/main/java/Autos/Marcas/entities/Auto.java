package Autos.Marcas.entities;

public class Auto {

	private int id;
	private String marca;
	private String modelo;
	private long kms;
	private String patente;
	private int anio;

	public Auto() {
	}

	public Auto(String marca, String modelo, long kms, String patente, int anio, int id) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.kms = kms;
		this.patente = patente;
		this.anio = anio;
		this.id = id;
	}

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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
