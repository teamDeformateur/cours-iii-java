package edu.formation;

import edu.formation.poo.heritage.AbstractEntite;
import edu.formation.poo.heritage.EtudiantStudieux;
import edu.formation.poo.heritage.Personne;
import edu.formation.poo.polymorphisme.Date;
import edu.formation.poo.polymorphisme.DateHistorique;

/**
 * Exemples d'héritage
 * 
 * @author seme
 *
 */
public class MainHeritage {

  public static void main(String[] args) {
    AbstractEntite e = new Personne("Foo", "Bar");
    e.afficherInfos();

    Date d0 = new Date(2016, 12, 31);
    d0.afficherDate();

    Date date1;

    String description = "Révolution française";
    DateHistorique dateHistorique0 = new DateHistorique(1789, 7, 14, description);
    dateHistorique0.methodePropreADateHistorique();

    dateHistorique0.afficherDate();

    DateHistorique dh1;

    // je peux affecter une référence DateHistorique à une Date
    // tu peux référencer une DateHistorique avec une référence de Date
    date1 = dateHistorique0;
    // ERREUR !
    // je ne peux affecter une référence de Date à une DateHistorique
    // dh1 = d0;

    /*
     * Polymorphisme
     */
    Date dpm = new DateHistorique(1515, 1, 1, "Marignan");
    ((DateHistorique) dpm).methodePropreADateHistorique();

    dpm.afficherDate();

    Date[] dates = new Date[3];
    dates[0] = dpm;
    dates[1] = d0;
    dates[2] = dateHistorique0;

    for (Date date : dates) {
      date.afficherDate();
    }

    EtudiantStudieux es = new EtudiantStudieux();
    es.afficherInfos();

  }

}
