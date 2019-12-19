package edu.formation.poo.heritagesimple;

/**
 * @author Seme
 *
 */
public class MainHeritageSimple {
  public static void main(String[] args) {
    Personne p1 = new Personne("Ladalle", "Roger", "M.");
    Personne p2 = new Personne("Dupont", "Caroline", "Mlle");

    Etudiant e1 = new Etudiant("Dupuis", "Pascal", "M.");
    Etudiant e2 = new Etudiant("Edwige", "Ilant", "Mme");

    p1.toString();
    p2.toString();
    e1.toString();
    e2.toString();
  }
}
