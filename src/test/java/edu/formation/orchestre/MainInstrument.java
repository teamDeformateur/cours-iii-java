package edu.formation.orchestre;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 * Classe principale de l'application de gestion des instruments.
 * 
 * @author Seme
 */
public class MainInstrument {
  /**
   * Méthode principale (point d'entrée).
   * 
   * @param args
   * @throws ParseException
   */
  public static void main(String[] args) throws ParseException {

    System.out.println("Nombre d'instruments : " + AbstractInstrument.nombreInstruments);

    // on rentre le nom et le prix de chaque instrument
    AbstractInstrument guitare = new InstrumentACordes("guitare", 1500.0f);
    AbstractInstrument batterie = new InstrumentAVent("batterie", 9999.99f);
    System.out.println("Nombre d'instruments : " + AbstractInstrument.nombreInstruments);

    InstrumentACordes violon = new InstrumentACordes("violon", 59999.0f, 4, "nylon");
    InstrumentAVent saxophone = new InstrumentAVent("saxophone", 599.9f, TypeInstrument.BOIS);

    violon.jouer();
    saxophone.jouer();

    saxophone.depreciation(0.5f);

    // on affiche les informations de chaque instrument
    guitare.afficher();
    batterie.afficher();
    // on baisse le prix de la guitare
    guitare.depreciation();
    // on affiche le nouveau prix de la guitare
    System.out.println("Nouveau prix de la guitare : " + guitare.getPrix() + " euros.");

    Orchestre concertoOpera = new Orchestre("La fanfaronnerie", TypeOrchestre.HARMONIQUE);
    concertoOpera.ajouterInstrument(guitare);
    concertoOpera.ajouterInstrument(batterie);
    concertoOpera.ajouterInstrument(violon);
    concertoOpera.ajouterInstrument(saxophone);

    concertoOpera.afficherOrchestre();

    // j'instancie le musicien
    Musicien brel = new Musicien("Jacques", "Brel", "triste");
    // le musicien Jacquo est le chef d'orchestre
    concertoOpera.setChef(brel);

    // je créé la liste des instruments dont il a joué
    ArrayList<AbstractInstrument> listeInstru = new ArrayList<>();
    listeInstru.add(guitare);
    listeInstru.add(batterie);
    // j'ajoute le concert auquel il a participé
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
    brel.ajouterConcert("Opéra de Paris", simpleDateFormat.parse("31-12-2017"), listeInstru);
  }
}
