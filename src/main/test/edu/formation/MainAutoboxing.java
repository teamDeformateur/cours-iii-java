package edu.formation;

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
   * Méthode principale
   * 
   * @param args
   */
  public static void main(String[] args) {
    /*
     * Exemple d'autoboxing
     */
    // création d'un type primitif entier
    int primitif = 1;
    // Affectation d'un entier à son Wrapper Integer. int -> Integer automatique
    Integer wrapper = primitif;
   
    /*
     * Unboxing
     */
    // Integer -> int automatique
    primitif = wrapper;
    System.out.println("Primitif unboxé = " + primitif);

    // 1. on instancie l'objet ent1 de la classe Entier
    Entier ent1 = new Entier(); 
    ent1.getValeur();
    // 2.
    System.out.println(Entier.getValeurStatique());

  }

}
