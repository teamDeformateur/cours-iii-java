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
        super("Montant blablabla");
    }

    /**
     * @param arg0
     */
    public MontantIncorrectException(String arg0)
    {
        super(arg0);
        // TODO Auto-generated constructor stub
    }

    /**
     * @param arg0
     */
    public MontantIncorrectException(Throwable arg0)
    {
        super(arg0);
        // TODO Auto-generated constructor stub
    }

    /**
     * @param arg0
     * @param arg1
     */
    public MontantIncorrectException(String arg0, Throwable arg1)
    {
        super(arg0, arg1);
        // TODO Auto-generated constructor stub
    }

    /**
     * @param arg0
     * @param arg1
     * @param arg2
     * @param arg3
     */
    public MontantIncorrectException(String arg0, Throwable arg1, boolean arg2, boolean arg3)
    {
        super(arg0, arg1, arg2, arg3);
        // TODO Auto-generated constructor stub
    }

}
