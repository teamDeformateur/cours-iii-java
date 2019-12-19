package edu.formation.poo.heritage;

import java.util.ArrayList;
import java.util.List;

public class Etudiant extends Personne {
  /*
   * données de l'objet
   */
  private String nom;
  private String prenom;
  private String[] coursTab;
  private List<Cours> cours;

  private static final String MOTIVATION = "Au top";

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
    this.nom = unNom;
    this.prenom = unPrenom;
    this.cours = new ArrayList<Cours>();
    System.out.println("Objet " + unPrenom + " " + unNom + " instancié.");
  }

  /**
   * 
   * @param unNom
   * @param unPrenom
   * @param desCours
   */
  public Etudiant(String unNom, String unPrenom, String[] desCours) {
    this.nom = unNom;
    this.prenom = unPrenom;
    this.coursTab = desCours;
    System.out.println("Objet " + unPrenom + " " + unNom + " instancié.");
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
   * @return the motivation
   */
  public static String getMotivation() {
    return Etudiant.MOTIVATION;
  }

  /**
   * 
   */
  public void afficherMotivation() {
    System.out.println(MOTIVATION);
  }

}
