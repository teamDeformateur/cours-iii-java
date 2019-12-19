package edu.formation.orchestre;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author Seme
 */
public class Concert {
  /** lieu où s'est déroulé le concert. */
  private String lieu;
  /** date de l'évènement. */
  private Date date;
  /** La liste des instruments joués lors du concert. */
  private List<AbstractInstrument> instruments;
  /** Par le musicien ci-référencé. */
  private Musicien musicien;

  public Concert() {
    // appelle le constructeur de la classe Object
    super();
    this.instruments = new ArrayList<>();
  }

  /**
   * @param lieu
   * @param date
   */
  public Concert(String lieu, Date date) {
    super();
    this.lieu = lieu;
    this.date = date;
    this.instruments = new ArrayList<>();
  }

  /**
   * @param lieu
   * @param date
   */
  public Concert(String lieu, Date date, Musicien musicien) {
    super();
    this.lieu = lieu;
    this.date = date;
    this.musicien = musicien;
    this.instruments = new ArrayList<>();
  }

  /**
   * @param lieu
   * @param date
   * @param instruments
   * @param musicien
   */
  public Concert(String lieu, Date date, List<AbstractInstrument> instruments,
      Musicien musicien) {
    super();
    this.lieu = lieu;
    this.date = date;
    this.instruments = instruments;
    this.musicien = musicien;
  }



  /**
   * @return the lieu
   */
  public String getLieu() {
    return lieu;
  }

  /**
   * @param lieu the lieu to set
   */
  public void setLieu(String lieu) {
    this.lieu = lieu;
  }

  /**
   * @return the date
   */
  public Date getDate() {
    return date;
  }

  /**
   * @param date the date to set
   */
  public void setDate(Date date) {
    this.date = date;
  }

  /*
   * (non-Javadoc)
   * 
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    return "Concert [lieu=" + lieu + ", date=" + date + "]";
  }

}
