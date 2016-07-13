/**
 * 
 */
package edu.formation.banque;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Seme
 *
 */
public class Client
{
    /**
     * Nom du client
     */
    private String nom;
    
    private Banque banque;
    /**
     * @return the banque
     */
    public Banque getBanque()
    {
        return banque;
    }


    /**
     * @param banque the banque to set
     */
    public void setBanque(Banque banque)
    {
        this.banque = banque;
    }

    /**
     * Liste de comptes
     */
    private List<Compte> comptes;

    private Conseiller conseiller;

    /**
     * Ajoute un compte à la liste des comptes bancaires du client
     * 
     * @param compte
     */
    public void ajouterCompte(Compte compte)
    {
        this.comptes.add(compte);
        // birectionnalité : je lie le client au compte
        compte.attribuerClient(this);
    }


    /**
     * @return the conseiller
     */
    public Conseiller getConseiller()
    {
        return conseiller;
    }


    /**
     * @param conseiller the conseiller to set
     */
    public void setConseiller(Conseiller conseiller)
    {
        this.conseiller = conseiller;
    }


    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return "client : " + this.nom;
    }

    /**
     * 
     */
    public Client()
    {
        this.comptes = new ArrayList<>();
    }

    /**
     * @param nom
     */
    public Client(String nom)
    {
        // appel du constructeur par défaut
        this();
        this.nom = nom;
    }

    /**
     * @return the nom
     */
    public String getNom()
    {
        return nom;
    }

    /**
     * @param nom
     *            the nom to set
     */
    public void setNom(String nom)
    {
        this.nom = nom;
    }

    /**
     * @return the comptes
     */
    public List<Compte> getComptes()
    {
        return comptes;
    }

    /**
     * @param comptes
     *            the comptes to set
     */
    public void setComptes(List<Compte> comptes)
    {
        this.comptes = comptes;
    }

}
