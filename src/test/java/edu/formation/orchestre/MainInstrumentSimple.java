package edu.formation.orchestre;

/**
 * Classe principale de l'application de gestion des instruments.
 * 
 * @author Seme
 */
public class MainInstrumentSimple {
    /**
     * Méthode principale (point d'entrée).
     * 
     * @param args
     */
    public static void main(String[] args) {
        // on rentre le nom et le prix de chaque instrument
        Instrument guitare = new Instrument("guitare", 1500.0f);
        Instrument violon = new Instrument("batterie", 9999.99f);

        // on baisse le prix des instruments
        guitare.depreciation();
        violon.depreciation();
        // on affiche les informations de chaque instrument
        guitare.afficher();
        violon.afficher();
    }
}
