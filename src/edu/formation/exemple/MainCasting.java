package edu.formation.exemple;

public class MainCasting {

    public static void main(String[] args) {
        int ent1 = 2;
        long long1;
        // cast implicite
        long1 = ent1;
        
        // 5.5 est implicitement un double, donc il faut le downcaster
        float a = (float) 5.5;
        float aa = 5.5F;
        // du primitif à l'objet (wrapper)
        Float reel = new Float(a);
        // passage de l'objet au type primitif
        a = reel.floatValue();
        
        double b = a;
        // useless
        b = (double)a;
        
        int octet;
        octet = 8;
        byte c;
        c = (byte) octet;
        
        octet = 129;
        // perte d'information !
        c = (byte)octet;
        

    }

}
