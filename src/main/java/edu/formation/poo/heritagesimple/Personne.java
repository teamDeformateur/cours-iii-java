package edu.formation.poo.heritagesimple;

/**
 * @author Seme
 *
 */
public class Personne {
  private String nom;
  private String prenom;
  private String civilite;

  /**
   * 
   * @param nom
   * @param prenom
   * @param civilite
   */
  public Personne(String nom, String prenom, String civilite) {
    this.nom = nom;
    this.prenom = prenom;
    this.civilite = civilite;
  }

  public void changerCivilite(String civilite) {
    this.civilite = civilite;
  }
}
