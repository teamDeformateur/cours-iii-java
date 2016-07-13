package edu.formation;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Label;
import java.awt.List;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SecondApplet extends Applet implements ActionListener {
    // Déclarer etcréer les composants graphiques
    Label lNom = new Label("Nom:");
    TextField tNom = new TextField(12);
    List listNoms = new List();
    Button b = new Button("OK");

    // Initialisation de l'applet
    public void init() {
        // Ajouter les composants à l'applet
        add(lNom);
        add(tNom);
        add(listNoms);
        add(b);
        // En cliquant sur le bouton b le gestionnaire
        // des événnements actionPerformed s'exécute
        b.addActionListener(this);
    }

    // Méthode qui permet de gérer les événements
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b) {
            // Lire le contenu de la zone de texte
            String nom = tNom.getText();
            // Ajouter ce contenu dans la liste
            listNoms.add(nom);
        }
    }
}