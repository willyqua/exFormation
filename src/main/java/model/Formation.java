package model;

import java.util.List;

public class Formation {
	
	private String titre;
	private String programmation;
	private int nbreEleves;
	
	public Formation() {}

	public Formation(String titre, String programmation, int nbreEleves) {
		super();
		this.titre = titre;
		this.programmation = programmation;
		this.nbreEleves = nbreEleves;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getProgrammation() {
		return programmation;
	}

	public void setProgrammation(String programmation) {
		this.programmation = programmation;
	}

	public int getNbreEleves() {
		return nbreEleves;
	}

	public void setNbreEleves(int nbreEleves) {
		this.nbreEleves = nbreEleves;
	}

	
	
	

}
