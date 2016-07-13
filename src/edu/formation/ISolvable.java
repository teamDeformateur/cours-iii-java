/**
 * 
 */
package edu.formation;

/**
 * @author Seme
 *
 */
public interface ISolvable
{
    /**
     * R�initialise le solde de l'�l�ment solvable � z�ro
     */
    public void solder();
    /**
     * Retourne vrai si le solde est positif
     * @return
     */
    public boolean testSolvabilite();
}
