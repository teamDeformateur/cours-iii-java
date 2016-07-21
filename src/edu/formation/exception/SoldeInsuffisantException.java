/**
 * 
 */
package edu.formation.exception;

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
        super("Vous n'avez pas assez d'argent. Va bosser!");
    }

    /**
     * @param arg0
     */
    public SoldeInsuffisantException(String arg0)
    {
        super(arg0);
        // TODO Auto-generated constructor stub
    }

    /**
     * @param arg0
     */
    public SoldeInsuffisantException(Throwable arg0)
    {
        super(arg0);
        // TODO Auto-generated constructor stub
    }

    /**
     * @param arg0
     * @param arg1
     */
    public SoldeInsuffisantException(String arg0, Throwable arg1)
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
    public SoldeInsuffisantException(String arg0, Throwable arg1, boolean arg2, boolean arg3)
    {
        super(arg0, arg1, arg2, arg3);
        // TODO Auto-generated constructor stub
    }

}
