package edu.formation.orchestre;

public class Orchestre {
  private static int nbInstruments = 0;

  /**
   * @return the nbInstruments
   */
  public static int getNbInstruments() {
    return nbInstruments;
  }

  /**
   * @param nbInstruments the nbInstruments to set
   */
  public static void setNbInstruments(int nbInstruments) {
    Orchestre.nbInstruments = nbInstruments;
  }

  private Musicien chef;

  private AbstractInstrument[] instruments;

  private String nom;

  private TypeOrchestre typeOrchestre;

  /**
   * @param nom
   * @param instruments
   * @param typeOrchestre
   * @param chef
   */
  public Orchestre(String nom, AbstractInstrument[] instruments,
      TypeOrchestre typeOrchestre, Musicien chef) {
    super();
    this.nom = nom;
    this.instruments = instruments;
    this.typeOrchestre = typeOrchestre;
    this.chef = chef;
  }

  /**
   * @param typeOrchestre
   */
  public Orchestre(String nom, TypeOrchestre typeOrchestre) {
    this.nom = nom;
    this.typeOrchestre = typeOrchestre;
    this.instruments = new AbstractInstrument[200];
  }

  // méthode permettant d'afficher l'orchestre
  public void afficherOrchestre() {
    System.out.println("L'orchestre " + this.typeOrchestre + " " + this.nom
        + " est formé des instruments :");
    for (int i = 0; i < nbInstruments; i++) {
      System.out.print(" - ");
      this.instruments[i].afficher();
      this.instruments[i].jouer();
    }
  }

  // méthode permettant l'ajout d'un instrument
  public void ajouterInstrument(AbstractInstrument instrument) {
    this.instruments[nbInstruments] = instrument;
    nbInstruments++;
  }

  /**
   * @return the chef
   */
  public Musicien getChef() {
    return chef;
  }

  /**
   * @return the instruments
   */
  public AbstractInstrument[] getInstruments() {
    return instruments;
  }

  /**
   * @return the nom
   */
  public String getNom() {
    return nom;
  }

  /**
   * @return the typeOrchestre
   */
  public TypeOrchestre getTypeOrchestre() {
    return typeOrchestre;
  }

  /**
   * @param chef the chef to set
   */
  public void setChef(Musicien chef) {
    this.chef = chef;
  }

  /**
   * @param instruments the instruments to set
   */
  public void setInstruments(AbstractInstrument[] instruments) {
    this.instruments = instruments;
  }

  /**
   * @param nom the nom to set
   */
  public void setNom(String nom) {
    this.nom = nom;
  }

  /**
   * @param typeOrchestre the typeOrchestre to set
   */
  public void setTypeOrchestre(TypeOrchestre typeOrchestre) {
    this.typeOrchestre = typeOrchestre;
  }
}
