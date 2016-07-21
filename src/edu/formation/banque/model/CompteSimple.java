package edu.formation.banque.model;

import edu.formation.ISolvable;

/**
 * Compte bancaire simple avec autorisation de découvert
 * 
 * @author Seme
 *
 */
public class CompteSimple extends Compte implements ISolvable
{
    /**
     * Autorisation de découvert (elle est négative)
     */
    private float decouvert;

    /**
     * Créé un compte simple avec un solde initial de 0€
     * 
     * @param dec
     *            Autorisation de découvert
     */
    public CompteSimple(float dec)
    {
        // appel du constructeur de la classe mère
        // super();
        this.decouvert = dec;
        System.out.println("Construction d'un CompteSimple");
    }

    /**
     * Créé un compte simple complètement initialisé
     * 
     * @param decouvert
     *            Autorisation de découvert
     * @param solde
     *            Solde initial
     */
    public CompteSimple(float decouvert, float solde)
    {
        super(solde);
        this.decouvert = decouvert;
        System.out.println("Construction d'un CompteSimple");
    }

    /*
     * (non-Javadoc)
     * 
     * @see edu.formation.Compte#retirer(float)
     */
    @Override
    public void retirer(float montant)
    {
        // je vérifie que le montant demandé est bien supérieur à zéro
        if (montant > 0)
        {
            // on teste si le solde - montant désiré est supérieur à
            // l'autorisation de découvert
            if ((this.solde - montant) >= this.decouvert)
            {
                // je retire du solde le montant correspondant
                this.solde -= montant;
            }
            // montant >= this.solde
            else
            {
                // on affiche un message d'erreur
                System.err.println("Opération impossible. Vous dépasseriez votre autorisation de découvert");
            }
        }
        // montant <= 0
        else
        {
            // on affiche un message d'erreur
            System.err.println("Le montant désiré doit être strictement positif.");
        } // fin du bloc conditionnel (montant > 0)
    }

    /*
     * (non-Javadoc)
     * 
     * @see edu.formation.Compte#toString()
     */
    @Override
    public String toString()
    {

        return "Compte simple n°" + this.getCode() + ", solde = " + this.solde + ", découvert = " + this.decouvert;
    }

    /*
     * (non-Javadoc)
     * 
     * @see edu.formation.ISolvable#solder()
     */
    @Override
    public void solder()
    {
        // réinitilise le solde du compte à zéro euro        
        this.solde = 0.0f;

    }

    /*
     * (non-Javadoc)
     * 
     * @see edu.formation.ISolvable#testSolvabilite()
     */
    @Override
    public boolean testSolvabilite()
    {
        // retourne vrai si on a de la thune
        return (this.solde > 0);
    }
}
