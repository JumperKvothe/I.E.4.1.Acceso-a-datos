package Colegio;

import java.util.Set;

import POJOs.C1Profesores;

public class Asignaturas {

	private String codAsig;
	private String nombreAsi;
	private Set<C1Profesores> setprofesores;
	
	public Asignaturas(String codAsig, String nombreAsi, Set<C1Profesores> setprofesores) {
		this.codAsig = codAsig;
		this.nombreAsi = nombreAsi;
		this.setprofesores = setprofesores;
	}

	public String getCodAsig() {
		return codAsig;
	}

	public void setCodAsig(String codAsig) {
		this.codAsig = codAsig;
	}

	public String getNombreAsi() {
		return nombreAsi;
	}

	public void setNombreAsi(String nombreAsi) {
		this.nombreAsi = nombreAsi;
	}

	public Set<C1Profesores> getSetprofesores() {
		return setprofesores;
	}

	public void setSetprofesores(Set<C1Profesores> setprofesores) {
		this.setprofesores = setprofesores;
	}
	
	
	
	
}
