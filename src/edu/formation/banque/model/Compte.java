/**
 * 
 */
package edu.formation.banque.model;

/**
 * Compte bancaire
 * 
 * @author Seme
 *
 */
public abstract class Compte
{

    private Client client;

    /**
     * @return the client
     */
    public Client getClient()
    {
        return client;
    }

    /**
     * @param client
     *            the client to set
     */
    public void setClient(Client client)
    {
        this.client = client;
    }


    /**
     * @return the solde
     */
    public float getSolde()
    {
        return solde;
    }

    /**
     * @param solde
     *            the solde to set
     */
    public void setSolde(float solde)
    {
        this.solde = solde;
    }

    /**
     * @return the nbComptes
     */
    public static int getNbComptes()
    {
        return nbComptes;
    }

    /**
     * @param nbComptes
     *            the nbComptes to set
     */
    public static void setNbComptes(int nbComptes)
    {
        Compte.nbComptes = nbComptes;
    }

    /**
     * @param code
     *            the code to set
     */
    public void setCode(int code)
    {
        this.code = code;
    }

    /**
     * Code du compte
     */
    private int code;
    /**
     * Solde du compte
     */
    protected float solde;
    /**
     * Nombre de comptes créés initialisé à zéro
     */
    private static int nbComptes = 0;

    public void attribuerClient(Client unClient)
    {
        this.client = unClient;
    }

    /**
     * @return the code
     */
    public int getCode()
    {
        return code;
    }

    /**
     * Constructeur par défaut
     */
    public Compte()
    {
        // j'initialise le solde à zéro
        this.solde = 0;
        // on incrémente le nombre de comptes et on retourne la valeur
        this.code = ++Compte.nbComptes;
        System.out.println("Construction d'un compte");
    }

    /**
     * Créé un compte initialisé à un solde donné
     * 
     * @param solde
     *            Le solde initial
     */
    public Compte(float solde)
    {
        // j'initialise le solde au montant désiré
        this.solde = solde;
        // on incrémente le nombre de comptes et on retourne la valeur
        this.code = ++Compte.nbComptes;
        System.out.println("Construction d'un compte");
    }

    /**
     * Ajoute au solde du compte le montant passé en paramètre
     * 
     * @param montant
     *            Le montant à verser sur le compte
     */
    public void verser(float montant)
    {
        // on vérifie que le montant soit bien positif
        if (montant >= 0)
        {
            // j'augmente le solde du montant correspondant
            this.solde += montant;
        }
        else
        {
            // TODO
        }
    }

    /**
     * Retire au solde le montant demandé
     * 
     * @param montant
     *            Le montant à retirer du solde du compte
     * @throws SoldeInsuffisantException
     * @throws MontantIncorrectException
     */
    public void retirer(float montant)
    {
        // on teste si le montant retiré est supérieur à zéro
        this.verifMontantSupZero(montant);
        // on teste si le montant du retrait est inférieur au solde du compte
        this.verifSoldeSuffisant(montant);

        // je retire du solde le montant correspondant
        this.solde -= montant;

    }

    /**
     * @param montant
     * @throws SoldeInsuffisantException
     */
    private void verifSoldeSuffisant(float montant)
    {
        if (montant >= this.solde)
        {
            // TODO
        }
    }

    /**
     * @param montant
     * @throws MontantIncorrectException
     */
    private void verifMontantSupZero(float montant)
    {
        // je vérifie que le montant demandé est bien supérieur à zéro
        if (montant <= 0)
        {
            // TODO
        }
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    public String toString()
    {
        return "Compte n°" + this.code + ", solde = " + this.solde;
    }
}
