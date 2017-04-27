/**
 * 
 */
package edu.formation.banque.exception;

/**
 * @author Seme
 *
 */
public class SoldeInsuffisantException extends Exception
{
    /**
     * 
     */
    public SoldeInsuffisantException()
    {
        super("Solde insuffisant.");
    }
    
    /**
     * 
     */
    public SoldeInsuffisantException(String message)
    {
        super(message);
    }
}
