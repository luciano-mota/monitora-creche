package br.com.lumota.monitoracreche.model;

import java.util.Calendar;

public class Turma {
	private Turno turno;
	private String professor;
	private String turma;
	
	public String getTurma() {
		return turma;
	}
	public void setTurma(String turma) {
		this.turma = turma;
	}
	public Turno getTurno() {
		return turno;
	}
	public void setTurno(Turno turno) {
		this.turno = turno;
	}
	public String getProfessor() {
		return professor;
	}
	public void setProfessor(String professor) {
		this.professor = professor;
	}
	
	@Override
	public String toString() {
		return "Turma [turno=" + turno + ", professor=" + professor + "]";
	}
	
	
	
}
