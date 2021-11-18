package model;

import java.util.List;

public class Eleve {
	private String nom;
	private String prenom;
	private int age;
	private int note;
	private List<Formation> formation;
	
	
	
	public Eleve(){}



	public Eleve(String nom, String prenom, int age, int note, List<Formation> formation) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.note = note;
		this.formation = formation;
	}



	public String getNom() {
		return nom;
	}



	public void setNom(String nom) {
		this.nom = nom;
	}



	public String getPrenom() {
		return prenom;
	}



	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public int getNote() {
		return note;
	}



	public void setNote(int note) {
		this.note = note;
	}



	public List<Formation> getFormation() {
		return formation;
	}



	public void setFormation(List<Formation> formation) {
		this.formation = formation;
	}

	
	
	
	
}
