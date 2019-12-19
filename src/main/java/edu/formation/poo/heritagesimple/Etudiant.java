package edu.formation.poo.heritagesimple;

/**
 * @author Seme
 *
 */
public class Etudiant extends Personne {
  /*
   * données spécifiques de l'objet
   */
  private String[] cours;

  // Constructeur de la classe
  public Etudiant(String nom, String prenom, String civilite, String[] cours) {
    // Appel au constructeur de la super classe (de la classe Personne)
    super(nom, prenom, civilite);
    // valorisation des attributs spécifiques
    this.cours = cours;
  }

  public Etudiant(String nom, String prenom, String civilite) {
    super(nom, prenom, civilite);
  }
}
