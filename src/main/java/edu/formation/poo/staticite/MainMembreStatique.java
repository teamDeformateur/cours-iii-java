package edu.formation.poo.staticite;

import edu.formation.poo.heritage.Personne;

/**
 * Démo membre statique d'une classe
 * @author seme
 *
 */
public class MainMembreStatique {

  /**
   * Méthode principale
   * @param args
   */
  public static void main(String[] args) {
    // Affichage du nombre de personnes
    System.out.println("Nombre de personnes : " + Personne.nombrePersonnes);
    Personne jean = new Personne("Valjean", "Jean");
    jean.afficherInfos();
    // Affichage du nombre de personnes
    System.out.println("Nombre de personnes : " + Personne.nombrePersonnes);

  }

}
