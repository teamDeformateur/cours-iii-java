/**
 * 
 */
package edu.formation.banque.model;

import edu.formation.banque.exception.MontantIncorrectException;
import edu.formation.banque.exception.SoldeInsuffisantException;

/**
 * Compte qui décrit un compte avec opérations payantes
 * 
 * @author Seme
 *
 */
public class ComptePayant extends Compte {
  /**
   * Montant des frais fixe à appliquer à chaque opération static + final = constante => MAJUSCULES
   */
  private static final float FRAIS_FIXE = 0.5f;

  /**
   * Taux à appliquer au montant de chaque opération
   */
  private static final float TAUX = 0.055f;

  /**
   * Constructeur par défaut
   */
  public ComptePayant() {
    super();
  }

  public ComptePayant(float solde) {
    super(solde);
  }

  /**
   * Retourne le montant de la commission en fonction d'une base de calcul passée en paramètre
   * 
   * @param baseDeCalcul Le montant qui sert de base de calcul
   * @return Le montant de la commission
   */
  private float calculerCommission(float baseDeCalcul) {
    return ComptePayant.FRAIS_FIXE + baseDeCalcul * ComptePayant.TAUX;
  }

  /*
   * (non-Javadoc)
   * 
   * @see edu.formation.Compte#retirer(float)
   */
  @Override
  public void retirer(float montant) throws SoldeInsuffisantException, MontantIncorrectException {
    // on retire l'argent (on fait appel à la méthode de la classe mère)
    super.retirer(montant);
    // on calcule la commission
    float commission = this.calculerCommission(montant);
    // on la soustrait au solde du compte
    this.solde -= commission;
  }

  /*
   * (non-Javadoc)
   * 
   * @see edu.formation.Compte#verser(float)
   */
  @Override
  public void verser(float montant) throws MontantIncorrectException {
    // on verse l'argent sur le compte
    super.verser(montant);
    // on déduit les frais
    this.solde -= this.calculerCommission(montant);
  }

  /*
   * (non-Javadoc)
   * 
   * @see edu.formation.Compte#toString()
   */
  @Override
  public String toString() {
    return "Compte payant n°" + this.getCode() + ", solde = " + this.solde;
  }

}
