package edu.formation;

/**
 * Classe qui sert à stocker un entier.
 * 
 * @author Seme
 * 
 *
 */
public class Entier {
  /**
   * La valeur de l'entier.
   */
  private int valeur;

  /**
   * La valeur statique commune à tous les objets Entier ou autrement dit un attribut de la classe
   * Entier.
   */
  private static int valeurStatique = 0;

  /**
   * Constructeur de la classe qui initialise la valeur à zéro.
   */
  public Entier() {
    this.valeur = 0;
  }

  /**
   * 
   */
  public void ajouterUn() {
    /*
     * on incrémente la valeur de 1
     */
    this.valeur += 1;
  }

  public static int getValeurStatique() {
    return Entier.valeurStatique;
  }

  /**
   * @return La valeur
   */
  public int getValeur() {
    return valeur;
  }

}
