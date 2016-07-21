package edu.formation.banque.model;

import edu.formation.ISolvable;

/**
 * Compte bancaire simple avec autorisation de d�couvert
 * 
 * @author Seme
 *
 */
public class CompteSimple extends Compte implements ISolvable
{
    /**
     * Autorisation de d�couvert (elle est n�gative)
     */
    private float decouvert;

    /**
     * Cr�� un compte simple avec un solde initial de 0�
     * 
     * @param dec
     *            Autorisation de d�couvert
     */
    public CompteSimple(float dec)
    {
        // appel du constructeur de la classe m�re
        // super();
        this.decouvert = dec;
        System.out.println("Construction d'un CompteSimple");
    }

    /**
     * Cr�� un compte simple compl�tement initialis�
     * 
     * @param decouvert
     *            Autorisation de d�couvert
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
        // je v�rifie que le montant demand� est bien sup�rieur � z�ro
        if (montant > 0)
        {
            // on teste si le solde - montant d�sir� est sup�rieur �
            // l'autorisation de d�couvert
            if ((this.solde - montant) >= this.decouvert)
            {
                // je retire du solde le montant correspondant
                this.solde -= montant;
            }
            // montant >= this.solde
            else
            {
                // on affiche un message d'erreur
                System.err.println("Op�ration impossible. Vous d�passeriez votre autorisation de d�couvert");
            }
        }
        // montant <= 0
        else
        {
            // on affiche un message d'erreur
            System.err.println("Le montant d�sir� doit �tre strictement positif.");
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

        return "Compte simple n�" + this.getCode() + ", solde = " + this.solde + ", d�couvert = " + this.decouvert;
    }

    /*
     * (non-Javadoc)
     * 
     * @see edu.formation.ISolvable#solder()
     */
    @Override
    public void solder()
    {
        // r�initilise le solde du compte � z�ro euro        
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
