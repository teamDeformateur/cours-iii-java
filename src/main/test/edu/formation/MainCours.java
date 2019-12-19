package edu.formation;

import edu.formation.poo.heritage.Etudiant;

/**
 * Tests de la classe Etudiant
 * @author seme
 *
 */
public class MainCours {

  /**
   * Méthode principale
   * Affiche les cours d'une étudiante
   * @param args
   */
  public static void main(String[] args) {
    // // Test init. tableau de cours
    String[] desCours = new String[] {"histoire", "philosophie", "mathématiques"};
    Etudiant emma = new Etudiant("Niolia", "Emma", desCours);
    emma.afficherInfos();

  }

}
