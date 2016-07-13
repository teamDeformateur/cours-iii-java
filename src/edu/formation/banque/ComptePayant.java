/**
 * 
 */
package edu.formation.banque;

import edu.formation.exception.MontantIncorrectException;
import edu.formation.exception.SoldeInsuffisantException;

/**
 * Compte qui d�crit un compte avec op�rations payantes
 * 
 * @author Seme
 *
 */
public class ComptePayant extends Compte
{
    /**
     * Montant des frais fixe � appliquer � chaque op�ration
     * static + final = constante => MAJUSCULES
     */
    private static final float FRAIS_FIXE = 0.5f;

    /**
     * Taux � appliquer au montant de chaque op�ration
     */
    private static final float TAUX = 0.055f;

    /**
     * Constructeur par d�faut
     */
    public ComptePayant()
    {
        super();
    }
    
    public ComptePayant(float solde)
    {
        super(solde);
    }

    /**
     * Retourne le montant de la commission en fonction d'une base de calcul
     * pass�e en param�tre
     * 
     * @param baseDeCalcul
     *            Le montant qui sert de base de calcul
     * @return Le montant de la commission
     */
    private float calculerCommission(float baseDeCalcul)
    {
        return ComptePayant.FRAIS_FIXE + baseDeCalcul * ComptePayant.TAUX;
    }

    /*
     * (non-Javadoc)
     * 
     * @see edu.formation.Compte#retirer(float)
     */
    @Override
    public void retirer(float montant) throws SoldeInsuffisantException
    {
        // on retire l'argent (on fait appel � la m�thode de la classe m�re)
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
    public void verser(float montant) throws MontantIncorrectException
    {
        // on verse l'argent sur le compte
        super.verser(montant);
        // on d�duit les frais
        this.solde -= this.calculerCommission(montant);
    }

    /*
     * (non-Javadoc)
     * 
     * @see edu.formation.Compte#toString()
     */
    @Override
    public String toString()
    {
        return "Compte payant n�" + this.getCode() + ", solde = " + this.solde;
    }

}
