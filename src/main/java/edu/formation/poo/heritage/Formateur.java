package edu.formation.poo.heritage;

public class Formateur extends Personne {
  private String domaine;

  public Formateur(String unNom, String unPrenom, String unDomaine) {
    super(unNom, unPrenom);
    this.domaine = unDomaine;
  }

  @Override
  public void afficherInfos() {
    System.out.println("Voici le formateur qui s'appelle " + this.prenom + " " + this.nom
        + " et qui enseigne le domaine " + this.domaine);
  }
}
