package edu.formation.banque;

import java.util.ArrayList;
import java.util.List;

import edu.formation.banque.exception.MontantIncorrectException;
import edu.formation.banque.exception.SoldeInsuffisantException;
import edu.formation.banque.model.Client;
import edu.formation.banque.model.CompteEpargne;
import edu.formation.banque.model.ComptePayant;

public class TestCompte
{

    public static void main(String[] args)
    {
        List<String> errorMessages = new ArrayList<>();

        // création du client
        Client client = new Client();
        client.setNom("John Major");

        // création des comptes
        CompteEpargne epargne = new CompteEpargne(1500.0f);
        ComptePayant payant = new ComptePayant(500.0f);

        // Ajout des comptes au client
        client.ajouterCompte(epargne);
        client.ajouterCompte(payant);

        try
        {
            // test scénario nominal (je retire un montant inférieur au solde)
            epargne.retirer(200.0f);
            // test scénario nominal (je verse un montant positif)
            payant.verser(1087.19f);
            // test scénario échec lors d'un versement
            epargne.verser(-200.0f);
        }
        catch (MontantIncorrectException | SoldeInsuffisantException e)
        {
            errorMessages.add("Test 1 : " + e.getMessage());
        }

        // test scénario échec lors d'un retrait n°1 (montant incorrect)
        try
        {
            epargne.retirer(-200.0f);
        }
        catch (MontantIncorrectException | SoldeInsuffisantException e)
        {
            errorMessages.add("Test 2 : " + e.getMessage());
        }
        // test scénario échec lors d'un retrait n°2 (solde insuffisant)
        try
        {
            epargne.retirer(25000.0f);
        }
        catch (MontantIncorrectException | SoldeInsuffisantException e)
        {
            errorMessages.add("Test 3 : " + e.getMessage());
        }

        for (String chaine : errorMessages)
        {
            System.err.println(chaine);

        }

    }

}
