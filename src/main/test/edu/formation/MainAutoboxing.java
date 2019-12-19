package edu.formation;

import edu.formation.Entier;

/**
 * Classe principale de test de la classe Entier
 *  - autoboxing/unboxing
 *  - attribut statique
 * 
 * @author seme
 *
 */
public class MainAutoboxing {
  /**
   * Ajoute un à un integer
   * 
   * @param a
   * @return
   */
  public static int ajouterUn(int a) {
    return a + 1;
  }

  /**
   * Méthode principale
   * 
   * @param args
   */
  public static void main(String[] args) {
    // Exemple d'autoboxing
    Integer b = 1;
    b = ajouterUn(b);
    // unboxing
    System.out.println("Integer b = " + b);

    // 1. on instancie l'objet ent1 de la classe Entier
    Entier ent1 = new Entier();
    ent1.getValeur();
    // 2.
    System.out.println(Entier.getValeurStatique());

  }

}
