/**
 * 
 */
package edu.formation.banque.model;

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

    /**
     * Liste de comptes
     */
    private List<Compte> comptes;

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
