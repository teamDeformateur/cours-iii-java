package edu.formation;

import edu.formation.poo.enumeration.Mois;
import edu.formation.poo.enumeration.MoisEnrichi;

public class MainEnumeration {

  public static void main(String[] args) {
    // déclaration
    Mois mois;
    // affectation
    mois = Mois.AOUT;
    // Cas du switch
    switch (mois) {
      // pas de préfixage de la valeur par le nom de l'enum
      case AOUT:
        System.out.println("Août");
        break;
    }

    MoisEnrichi moisEnrichi = MoisEnrichi.AOUT;
    System.out.println(moisEnrichi.getNumero() + " : " + moisEnrichi.getLibelle());

  }
}
