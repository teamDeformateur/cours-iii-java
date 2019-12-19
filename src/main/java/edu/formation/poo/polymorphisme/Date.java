package edu.formation.poo.polymorphisme;

public class Date {
  protected int annee;
  protected int mois;
  protected int jour;

  /**
   * 
   * @param newAnnee
   * @param newMois
   * @param newJour
   */
  public Date(int newAnnee, int newMois, int newJour) {
    this.annee = newAnnee;
    this.mois = newMois;
    this.jour = newJour;
  }

  public void afficherDate() {
    System.out.println("Date : " + this.annee + "-" + this.mois + "-" + this.jour);
  }
}
