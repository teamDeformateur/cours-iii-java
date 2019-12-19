package edu.formation.orchestre;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import edu.formation.poo.heritage.Personne;

/**
 * @author Seme
 */
public class Musicien extends Personne {
  /** Tous les concerts donnés par le musicien. */
  private List<Concert> concerts;
  private String style;

  /**
   * 
   */
  public Musicien() {
    this.concerts = new ArrayList<>();
  }

  /**
   * @param prenom
   * @param nom
   */
  public Musicien(String prenom, String nom) {
    super(nom, prenom);
    this.concerts = new ArrayList<>();
  }

  public Musicien(String prenom, String nom, String style) {
    super(nom, prenom);
    this.style = style;
    this.concerts = new ArrayList<>();
  }

  /**
   * 
   * @param lieu
   * @param date
   * @param instruments
   */
  public void ajouterConcert(String lieu, Date date, List<AbstractInstrument> instruments) {
    // je demande à liste de s'ajouter un nouveau concert
    this.concerts.add(new Concert(lieu, date, instruments, this));
  }


  /**
   * @return the style
   */
  public String getStyle() {
    return style;
  }

  /**
   * @param style the style to set
   */
  public void setStyle(String style) {
    this.style = style;
  }

}
