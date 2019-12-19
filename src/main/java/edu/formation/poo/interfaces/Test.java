package edu.formation.poo.interfaces;

import java.util.List;
import edu.formation.poo.heritage.Etudiant;

/**
 * @author Seme
 *
 */
public class Test {

  /**
   * @param args
   */
  public static void main(String[] args) {
    // via la BDD
    IDataRecovery<Etudiant> dataRecovery = new DBrecovery();
    // via le fichier
    dataRecovery = new FileRecovery("data_etudiants.csv");
    // dans les deux cas, cette ligne ne changera pas
    List<Etudiant> etudiants = dataRecovery.findAll();

  }

}
