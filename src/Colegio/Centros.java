package Colegio;

import POJOs.C1Profesores;

public class Centros {

	private Integer codCentro;
	private String nomCentro;
	private C1Profesores director;
	private String direccion;
	private String localidad;
	
	public Centros(Integer codCentro, String nomCentro, C1Profesores director, String direccion, String localidad) {
		
		this.codCentro = codCentro;
		this.nomCentro = nomCentro;
		this.director = director;
		this.direccion = direccion;
		this.localidad = localidad;
	}

	public Integer getCodCentro() {
		return codCentro;
	}

	public void setCodCentro(Integer codCentro) {
		this.codCentro = codCentro;
	}

	public String getNomCentro() {
		return nomCentro;
	}

	public void setNomCentro(String nomCentro) {
		this.nomCentro = nomCentro;
	}

	public C1Profesores getDirector() {
		return director;
	}

	public void setDirector(C1Profesores director) {
		this.director = director;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	
	
	
	
}
