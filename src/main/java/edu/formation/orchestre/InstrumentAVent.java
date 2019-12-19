package edu.formation.orchestre;

/**
 * @author Seme
 */
public class InstrumentAVent extends AbstractInstrument {
  private TypeInstrument typeInstrument;

  public InstrumentAVent(String nom, Float prix) {
    super(nom, prix);
  }

  public InstrumentAVent(String nom, Float prix, TypeInstrument type) {
    super(nom, prix);
    this.typeInstrument = type;
  }

  /*
   * (non-Javadoc)
   * 
   * @see edu.formation.orchestre.Instrument#afficher()
   */
  @Override
  public void afficher() {
    System.out.println("Nom de l'instrument à Vent : " + this.getNom()
        + ", prix : " + this.getPrix() + " euros, " + "type : "
        + this.typeInstrument);

  }

  /**
   * Diminue le prix en fonction d'un taux de dépréciation.
   * 
   * @param taux
   */
  public void depreciation(Float taux) {
    this.setPrix(this.getPrix() * (1 - taux));
  }

  /*
   * (non-Javadoc)
   * 
   * @see edu.formation.orchestre.IJouable#jouer()
   */
  @Override
  public void jouer() {
    System.out.println("ffff  fff  pouet !!!");
  }

}
