package model;

public class User {
	private String nom;
	private String prenom;
	private int age;
	private int note;
	private String formation;
	private int motDp;
	
	public User(){}

	public User(String nom, String prenom, int age, int note, String formation, int motDp) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.note = note;
		this.formation = formation;
		this.motDp = motDp;
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

	public String getFormation() {
		return formation;
	}

	public void setFormation(String formation) {
		this.formation = formation;
	}

	public int getMotDp() {
		return motDp;
	}

	public void setMotDp(int motDp) {
		this.motDp = motDp;
	}

	
	
	
}
