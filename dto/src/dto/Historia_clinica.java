package dto;

import java.time.LocalDate;

public class Historia_clinica {
	private int numeroConsecutivo;
	private Arraylist<Actor> odontologo;
	private Arraylist<Actor> auxiliarOdontologia;
	private Actor paciente;
	private LocalDate fechaApertura;
	private String antecedentes;
	private Tratamiento evalucacion;
	private String observaciones;
	private String ocupacionPaciente;
	private String acompañante;
	private long telefonoAcompañante;
	private String direccion
	public int getNumeroConsecutivo() {
		return numeroConsecutivo;
	}
	public void setNumeroConsecutivo(int numeroConsecutivo) {
		this.numeroConsecutivo = numeroConsecutivo;
	}
	public Arraylist<Actor> getOdontologo() {
		return odontologo;
	}
	public void setOdontologo(Arraylist<Actor> odontologo) {
		this.odontologo = odontologo;
	}
	public Arraylist<Actor> getAuxiliarOdontologia() {
		return auxiliarOdontologia;
	}
	public void setAuxiliarOdontologia(Arraylist<Actor> auxiliarOdontologia) {
		this.auxiliarOdontologia = auxiliarOdontologia;
	}
	public Actor getPaciente() {
		return paciente;
	}
	public void setPaciente(Actor paciente) {
		this.paciente = paciente;
	}
	public LocalDate getFechaApertura() {
		return fechaApertura;
	}
	public void setFechaApertura(LocalDate fechaApertura) {
		this.fechaApertura = fechaApertura;
	}
	public String getAntecedentes() {
		return antecedentes;
	}
	public void setAntecedentes(String antecedentes) {
		this.antecedentes = antecedentes;
	}
	public Tratamiento getEvalucacion() {
		return evalucacion;
	}
	public void setEvalucacion(Tratamiento evalucacion) {
		this.evalucacion = evalucacion;
	}
	public String getObservaciones() {
		return observaciones;
	}
	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
	public String getOcupacionPaciente() {
		return ocupacionPaciente;
	}
	public void setOcupacionPaciente(String ocupacionPaciente) {
		this.ocupacionPaciente = ocupacionPaciente;
	}
	public String getAcompañante() {
		return acompañante;
	}
	public void setAcompañante(String acompañante) {
		this.acompañante = acompañante;
	}
	public long getTelefonoAcompañante() {
		return telefonoAcompañante;
	}
	public void setTelefonoAcompañante(long telefonoAcompañante) {
		this.telefonoAcompañante = telefonoAcompañante;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	} acompañante;
	
	
}
