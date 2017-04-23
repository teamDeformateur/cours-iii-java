package edu.formation.banque;

import java.io.PrintStream;
import java.util.Scanner;

import edu.formation.banque.model.Banque;
import edu.formation.banque.model.Compte;
import edu.formation.banque.model.CompteEpargne;
import edu.formation.banque.model.CompteSimple;
import edu.formation.exception.MontantIncorrectException;
import edu.formation.exception.SoldeInsuffisantException;

public class TestCompte
{

    public static void main(String[] args)
    {

        PrintStream console = System.out;
        // Compte cpt1 = new Compte();
        Scanner scan = new Scanner(System.in);

        System.out.println("Rentrer le montant à verser sur le compte :");
        // l'utilisateur rentre le montant via la console, ce montant est envoyé
        // à la méthode verser du compte que l'on vient d'instancier
        // cpt1.verser(scan.nextFloat());

        // System.out.println(cpt1.toString());

        // création d'un compte Simple
        Compte cptSmpl1 = new CompteSimple(-800.0f);
        // création d'un compte épargne
        Compte cptEprg1 = new CompteEpargne(450.0f, 1.5f);

        // création d'un compte payant
        // dépôt d'argent
        try
        {
            cptSmpl1.verser(-1500.0f);
            // affichage du cpt simple
            console.println(cptSmpl1.toString());

            cptEprg1.verser(-450.0f);
            cptEprg1.retirer(50500505.0f);
        }
        catch (MontantIncorrectException | SoldeInsuffisantException e) 
        {
            e.printStackTrace();
        }

        try
        {
            // retrait d'argent de 2301€
            cptSmpl1.retirer(2301.0f);
        }
        catch (SoldeInsuffisantException e)
        {
            e.printStackTrace();
        }
        catch (MontantIncorrectException e)
        {
            e.printStackTrace();
        }
        /*
         * exemple complet
         */
        // Création de la banque
        Banque objetBanque = new Banque();

        // Ajout des clients à la banque
        objetBanque.ajouterClient("Marius");
        objetBanque.ajouterClient("César");
        objetBanque.ajouterClient("Cléon");
        // ajout des conseillers
        objetBanque.ajouterConseiller("Georges");
        objetBanque.ajouterConseiller("Paulina");
        objetBanque.ajouterConseiller("Eric");
        // Ajout du premier client au premier conseiller
        objetBanque.getConseillers() // renvoie la liste des conseillers
                .get(0)// renvoie le premier conseiller de la liste
                .ajouterClient(objetBanque.getClients() // la liste des clients
                                                        // de la banque
                        .get(0) // premier client
        );

        // Création d'un compte
        objetBanque.ajouterCompteSimple(0.0f, -800.0f);

        // Ajout du compte n°1 au client numéro 1
        objetBanque.getClients() // la liste des clients
                .get(0)// le premier client de la liste
                .ajouterCompte(objetBanque.getComptes().get(0)); // j'ajoute au
                                                                 // client un
                                                                 // compte
                                                                 // simple
        // comme l'association entre client et compte est bidirectionnelle,
        // il faut lier le client au compte
        // objetBanque.getComptes().get(0).attribuerClient(objetBanque.getClients().get(0));

        //
        // CompteSimpleV1 cs = new CompteSimpleV1(5.5f);
        // CompteSimpleV1 cs2 = new CompteSimpleV1(5.5f, 50);
        // System.out.println(cs.PLAFOND_MAX);
        // System.out.println(CompteV1.NB_COMPTES_MAX);
        //
        // CompteV1 c = new CompteSimpleV1(5.5f);
        //
        // List<CompteV1> comptes = new ArrayList<CompteV1>();
        // comptes.add(cs);
        // comptes.add(cs2);
        // comptes.add(c);
        //
        // for (int i = 0; i < comptes.size(); ++i)
        // {
        // System.out.println(comptes.get(i).toString());
        // }
        //
        // for (CompteV1 cpte : comptes)
        // {
        // System.out.println(cpte.toString());
        // }

        scan.close();

    }

}
