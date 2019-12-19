package edu.formation.poo.polymorphisme;

public class DateHistorique extends Date {

  private String description;

  /**
   * 
   * @param annee
   * @param mois
   * @param jour
   * @param newDescription
   */
  public DateHistorique(int annee, int mois, int jour, String newDescription) {
    super(annee, mois, jour);
    // this.description = new String(vDescription);
    this.description = newDescription;
  }

  public void methodePropreADateHistorique() {
    System.out.println("C'est un jour historique !");
  }

  public void afficherDate() {
    super.afficherDate();
    System.out.println("Description historique : " + this.description);
  }

}
