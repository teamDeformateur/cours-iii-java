package edu.formation.poo.heritage;

import java.util.ArrayList;
import java.util.List;

public class Etudiant extends Personne {
    private static final String MOTIVATION = "Au top";
    /*
     * données de l'objet
     */
    private String[] coursTab;
    private List<Cours> cours;

    /**
     * Constructeur par défaut de la classe.
     */
    public Etudiant() {
        this.cours = new ArrayList<Cours>();
    }

    /**
     *
     * @param unNom
     * @param unPrenom
     */
    public Etudiant(String unNom, String unPrenom) {
        // Appel au constructeur de la super classe (de la classe Personne)
        super(unNom, unPrenom);
        // valorisation des attributs spécifiques
        this.cours = new ArrayList<Cours>();
        System.out.println("Étudiant " + unPrenom + " " + unNom + " instanciée.");
    }

    /**
     *
     * @param unNom
     * @param unPrenom
     * @param uneCivilite
     */
    public Etudiant(String unNom, String unPrenom, String uneCivilite) {
        // Appel au constructeur de la super classe (de la classe Personne)
        super(unNom, unPrenom);
        this.cours = new ArrayList<Cours>();
        System.out.println("Étudiant " + unPrenom + " " + unNom + " instanciée.");
    }

    /**
     *
     * @param unNom
     * @param unPrenom
     * @param uneCivilite
     * @param desCours
     */
    public Etudiant(String unNom, String unPrenom, String uneCivilite, String[] desCours) {
        // Appel au constructeur de la super classe (de la classe Personne)
        super(unNom, unPrenom, uneCivilite);
        this.coursTab = desCours;
        System.out.println("Étudiant " + uneCivilite + " " + unPrenom + " " + unNom + " instancié.");
    }

    /**
     * @return the motivation
     */
    public static String getMotivation() {
        return Etudiant.MOTIVATION;
    }

    @Override
    public void afficherInfos() {
        System.out.println(
                "Voici donc la personne étudiante de nom " + this.nom + " et de prénom " + this.prenom);
    }

    /*
     * Méthodes qui manipulent les données de l'objet
     */
    public void ajouterCours(Cours cours) {
        this.cours.add(cours);
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     *
     */
    public void afficherMotivation() {
        System.out.println(MOTIVATION);
    }

}
