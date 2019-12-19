package edu.formation.poo;

/**
 * Définit les caractéristiques et le comportement d'une cyclette.
 * 
 * @author seme
 *
 */
public class Cyclette {
  /*
   * Etat => Caractéristiques, données, champs, attributs
   */
  /** nombre de roues */
  int nbRoues;
  /** moteur ou pas ? */
  boolean presenceMoteur;
  /** avertisseur sonore (klaxon=0, sonnette=1, poire=2) */
  byte avertisseur;
  /** vélocité */
  float velocite;
  /** position en abscisse */
  int positionX;
  /** position en ordonnée */
  int positionY;

  /**
   * Constructeur de la classe.
   */
  public Cyclette(int entree_nbRoues, boolean entree_presenceMoteur, byte entree_avertisseur) {
    // intialiser les champs de l'objet grâce aux valeurs reçues en paramètres
    velocite = 0.0f;
    nbRoues = entree_nbRoues;
    presenceMoteur = entree_presenceMoteur;
    avertisseur = entree_avertisseur;
    positionX = 0;
    positionY = 0;
  }


  /*
   * Comportement => méthodes
   */
  /**
   * Avancer la cyclette. Se déplace en fonction de la direction et du sens.
   * 
   * @param direction Se déplacer en x ou en y
   * @param sens "avancer" ou "reculer"
   */
  public void seDeplacer(char direction, String sens) {
    if (velocite > 0.0f) {
      // cas 1 : avancer en x : direction == 'x', sens == "avancer"
      if (direction == 'x' && sens == "avancer") {
        // avancer en x
        positionX++;
      }
      // cas 2 : avancer en y : direction == 'y', sens == "avancer"
      else if (direction == 'y' && sens == "avancer") {
        // avancer en y
        positionY++;
        // cas 3 : reculer en x : direction == 'x', sens == "reculer"
      } else if (direction == 'x' && sens == "reculer") {
        positionX--;
        // cas 4 : reculer en y : direction == 'y', sens == "reculer"
      } else {
        positionY--;
      }
    }


  }

  /**
   * Accélérer. Augmente la vélocité de 0,5 km/h.
   */
  public void accelerer() {
    velocite += 0.5;
  }

  /**
   * Freiner. Diminue la vélocité de 0,5 km/h.
   */
  public void freiner() {
    velocite -= 0.5;
  }



  @Override
  public String toString() {
    return "Cyclette [velocite=" + velocite + ", positionX=" + positionX + ", positionY="
        + positionY + "]";
  }



}
