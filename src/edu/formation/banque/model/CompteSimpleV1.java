package edu.formation.banque.model;

/**
 * @author Seme
 *
 */
public class CompteSimpleV1 extends CompteV1 {
    /**
     * 
     */
    private float decouvert;
    
    /**
     * @param dec
     */
    public CompteSimpleV1(float dec){
        // appel du constructeur de la classe mère
        super();
        this.decouvert = dec;
        System.out.println("Construction d'un CompteSimple");
    }
    
    /**
     * @param decouvert
     * @param solde
     */
    public CompteSimpleV1(float decouvert, int solde){
        super(solde);
        this.decouvert = decouvert;
        System.out.println("Construction d'un CompteSimple");
    }
    
    /* (non-Javadoc)
     * @see edu.formation.Compte#retirer(float)
     */
    public void retirer(float mt){
        
    }

    /* (non-Javadoc)
     * @see edu.formation.Compte#toString()
     */
    @Override
    public String toString(){
        
        return "Compte simple : " + super.toString() + " decouvert = " + decouvert;
    }
}
