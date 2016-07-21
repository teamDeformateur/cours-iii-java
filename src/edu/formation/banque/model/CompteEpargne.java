/**
 * 
 */
package edu.formation.banque.model;

/**
 * @author Seme
 *
 */
public class CompteEpargne extends Compte
{
    private float taux;

    private static final float TAUX_MAX = 20.0f;

    /**
     * @return the taux
     */
    public float getTaux()
    {
        return taux;
    }

    /**
     * @param taux the taux to set
     */
    public void setTaux(float taux)
    {
        this.taux = taux;
    }

    /**
     * 
     */
    public CompteEpargne()
    {
        // TODO Auto-generated constructor stub
    }

    /**
     * @param solde
     */
    public CompteEpargne(float solde)
    {
        super(solde);
        // TODO Auto-generated constructor stub
    }

    /**
     * @param taux
     */
    public CompteEpargne(float solde, float taux)
    {
        super(solde);
        this.taux = taux;
    }

}
