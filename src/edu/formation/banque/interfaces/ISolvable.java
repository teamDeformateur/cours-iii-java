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
     * Réinitialise le solde de l'élément solvable à zéro
     */
    public void solder();
    /**
     * Retourne vrai si le solde est positif
     * @return
     */
    public boolean testSolvabilite();
}
