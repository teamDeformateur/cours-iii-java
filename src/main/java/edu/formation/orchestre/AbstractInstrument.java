package edu.formation.orchestre;

/**
 * @author Seme
 *
 */
public abstract class AbstractInstrument extends AbstractObjet implements IJouable {
  private String nom;
  private Float prix;

  public static int nombreInstruments = 0;


  /**
   * Constructeur de la classe Instrument.
   * 
   * @param nom Le nom de l'instrument
   * @param prix Le prix de l'instrument
   */
  public AbstractInstrument(String nom, Float prix) {
    this.nom = nom;
    this.prix = prix;
    // On ajoute un Instrument à chaque construction
    AbstractInstrument.nombreInstruments++;

  }

  /**
   * Affiche l'état de l'objet Instrument.
   */
  public abstract void afficher();

  /**
   * Déprécie l'instrument de 10% C.-à-d. diminue le prix de 10%
   */
  public void depreciation() {
    this.prix *= 0.9f;
  }

  /**
   * Retourne le nom de l'instrument.
   * 
   * @return String Le nom de l'instrument
   */
  public String getNom() {
    return this.nom;
  }

  /**
   * Initialise le nom de l'instrument.
   * 
   * @param nom Le nom de l'instrument
   */
  public void setNom(String nom) {
    this.nom = nom;
  }

  /**
   * Retourne le prix de l'instrument.
   * 
   * @return Float Le prix de l'instrument
   */
  public Float getPrix() {
    return this.prix;

  }

  /**
   * Initialise le prix de l'instrument.
   * 
   * @param prix Le nouveau prix de l'instrument
   */
  public void setPrix(Float prix) {
    this.prix = prix;
  }

  /**
   * 
   */
  public AbstractInstrument() {
    // TODO Auto-generated constructor stub
  }

}
