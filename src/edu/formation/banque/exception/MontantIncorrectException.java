/**
 * 
 */
package edu.formation.banque.exception;

/**
 * @author Seme
 *
 */
public class MontantIncorrectException extends Exception
{
    /**
     * 
     */
    public MontantIncorrectException()
    {
        super("Montant incorrect.");
    }

    public MontantIncorrectException(String message)
    {
        super(message);
    }
}
