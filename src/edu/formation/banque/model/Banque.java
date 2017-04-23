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
public class Banque
{

    /**
     * Liste de clients
     */
    private List<Client> clients;

    /**
     * Liste de conseillers
     */
    private List<Conseiller> conseillers;

    /**
     * Liste de comptes
     */
    private List<Compte> comptes;

    /**
     * 
     */
    public Banque()
    {
        // init. des listes
        this.conseillers = new ArrayList<>();
        this.clients = new ArrayList<>();
        this.comptes = new ArrayList<>();
    }

    /**
     * Ajoute un client à la liste
     * 
     * @param unNom
     */
    public void ajouterClient(String unNom)
    {
        // création puis ajout d'un client à la liste
        Client client = new Client(unNom);
        this.clients.add(client);
        // laison
        client.setBanque(this);
    }

    /**
     * Ajoute un conseiller à la liste
     * 
     * @param unNom
     */
    public void ajouterConseiller(String unNom)
    {
        Conseiller cons = new Conseiller(unNom);
        // création puis ajout d'un conseiller à la liste
        this.conseillers.add(cons);
        // liaison
        cons.setBanque(this);
    }

    /**
     * 
     * @param solde
     * @param decouvert
     */
    public void ajouterCompteSimple(float solde, float decouvert)
    {
        Compte cpt = new CompteSimple(decouvert, solde);
        this.comptes.add(cpt);
        // liaison
        cpt.setBanque(this);
    }

    /**
     * @return the comptes
     */
    public List<Compte> getComptes()
    {
        return comptes;
    }

    /**
     * @param comptes the comptes to set
     */
    public void setComptes(List<Compte> comptes)
    {
        this.comptes = comptes;
    }

    public void ajouterComptePayant(float solde)
    {
        this.comptes.add(new ComptePayant(solde));
    }

    public void ajouterCompteEpargne(float solde, float taux)
    {
        this.comptes.add(new CompteEpargne(solde, taux));
    }

    /**
     * @return the clients
     */
    public List<Client> getClients()
    {
        return clients;
    }

    /**
     * @param clients
     *            the clients to set
     */
    public void setClients(List<Client> clients)
    {
        this.clients = clients;
    }

    /**
     * @return the conseillers
     */
    public List<Conseiller> getConseillers()
    {
        return conseillers;
    }

    /**
     * @param conseillers
     *            the conseillers to set
     */
    public void setConseillers(List<Conseiller> conseillers)
    {
        this.conseillers = conseillers;
    }

}
