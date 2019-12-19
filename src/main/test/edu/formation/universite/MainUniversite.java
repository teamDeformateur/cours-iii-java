package edu.formation.universite;


/**
 * @author Seme
 *
 */
public class MainUniversite {
  public static void main(String[] args) {
    // Création de deux étudiants
    Etudiant e1 = new Etudiant("Ladalle", "Roger");
    Etudiant e2 = new Etudiant("Lamoroso", "J.-J.");

    e2.afficherInfos();

    String prenomDeRoger = e1.getNom();
    e1.setNom(e1.getNom() + "-Rosalie");

  }
}
