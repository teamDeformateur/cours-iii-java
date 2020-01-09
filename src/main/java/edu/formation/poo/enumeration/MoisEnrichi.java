package edu.formation.poo.enumeration;

public enum MoisEnrichi {
  JANVIER("Janvier", 1),
  FEVRIER("Février", 2),
  MARS("Mars", 3),
  AVRIL("Avril", 4),
  MAI("Mai", 5),
  JUIN("Juin", 6),
  JUILLET("Juillet", 7),
  AOUT("Août", 8),
  SEPTEMBRE("Septembre", 9),
  OCTOBRE("Octobre", 10),
  NOVEMBRE("Novembre", 11),
  DECEMBRE("Décembre", 12);

  /**
   * Une des valeurs correspondante à la constante. Elle est 'final' car elle
   * est en lecture-seule. Elle ne peut être intialisée qu'une seule
   * fois => à la construction de l'objet
   */
  private final String libelle;

  /**
   * L'autre valeur. Ici, le numéro du mois dans l'année.
   */
  private final int numero;

  /**
   * Le constructeur est privé car il ne peux être appelé ailleurs qu'à l'intérieur de l'enum.
   * @param libelle
   * @param numero
   */
  private MoisEnrichi(String libelle, int numero) {
    this.libelle = libelle;
    this.numero = numero;
  }

  /**
   * @return the libelle
   */
  public String getLibelle() {
    return libelle;
  }

  /**
   * @return the numero
   */
  public int getNumero() {
    return numero;
  }
  
  


}
