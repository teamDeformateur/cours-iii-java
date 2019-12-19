package edu.formation.universite;

/**
 * @author Seme
 *
 */
public class Etudiant {
  /**
   * 
   */
  private String nom;
  /**
   * 
   */
  private String prenom;

  /**
   * 
   * @param nom
   * @param prenom
   */
  public Etudiant(String nom, String prenom) {
    this.nom = nom;
    this.prenom = prenom;
    System.out.println("Objet " + this.prenom + " " + this.nom + " instancié (on est content).");
  }

  public String getPrenom() {
    return prenom;
  }

  public void setPrenom(String prenom) {
    this.prenom = prenom;
  }


  /**
   * 
   * @return
   */
  public String getNom() {
    return this.nom;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }

  public void afficherInfos() {
    System.out.println("Etudiant : " + this.getNom() + " " + this.getPrenom());
  }

}
