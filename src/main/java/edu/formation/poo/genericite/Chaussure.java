package edu.formation.poo.genericite;

public class Chaussure {
	private String pointure;
	private Matiere matiere;

	public Chaussure(String pointure, Matiere matiere) {
		super();
		this.pointure = pointure;
		this.matiere = matiere;
	}

	public String getPointure() {
		return pointure;
	}

	public void setPointure(String pointure) {
		this.pointure = pointure;
	}

	public Matiere getMatiere() {
		return matiere;
	}

	public void setMatiere(Matiere matiere) {
		this.matiere = matiere;
	}

	@Override
	public String toString() {
		return "Chaussure [pointure=" + pointure + ", matiere=" + matiere + "]";
	}

}
