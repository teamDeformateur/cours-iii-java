package edu.formation.poo.interfaces;

import java.io.File;
import java.util.List;
import edu.formation.poo.heritage.Etudiant;

/**
 * @author Seme
 *
 */
public class FileRecovery implements IDataRecovery<Etudiant> {

  private final File fichier;

  public FileRecovery(String chemin) {
    this.fichier = new File(chemin);
  }

  /*
   * (non-Javadoc)
   * 
   * @see edu.formation.interfaces.IDataRecovery#findAll()
   */
  @Override
  public List<Etudiant> findAll() {
    // lecture de fichier pour tout récupérer
    return null;
  }

  /*
   * (non-Javadoc)
   * 
   * @see edu.formation.interfaces.IDataRecovery#findById(java.lang.Long)
   */
  @Override
  public Etudiant findById(Long id) {
    // extraction de l'enregistrement avec le bon id seulement
    return null;
  }

}
