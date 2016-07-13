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
public class Conseiller
{

    /**
     * Liste de clients que je conseille judicieusement
     */
    private List<Client> clients;
    /**
     * nom du conseiller
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
     * 
     */
    public Conseiller()
    {
        this.clients = new ArrayList<>();
    }

    public Conseiller(String unNom)
    {
        this();
        this.nom = unNom;
    }

    /**
     * Ajoute un client EXISTANT à la liste des clients qui sont conseillés
     * 
     * @param unClient Le client conseillé
     */
    public void ajouterClient(Client unClient)
    {
        // ajoute
        this.clients.add(unClient);
        // bidirectionnel : le client connait son conseiller
        unClient.setConseiller(this);
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

}
