package model;

public class Formation {
	
	private String titre;
	private String programme;
	private int nbreEleves;
	
	public Formation() {}

	public Formation(String titre, String programme, int nbreEleves) {
		super();
		this.titre = titre;
		this.programme = programme;
		this.nbreEleves = nbreEleves;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getProgramme() {
		return programme;
	}

	public void setProgramme(String programme) {
		this.programme = programme;
	}

	public int getNbreEleves() {
		return nbreEleves;
	}

	public void setNbreEleves(int nbreEleves) {
		this.nbreEleves = nbreEleves;
	}
	

}
