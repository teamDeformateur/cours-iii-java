package edu.formation.poo.heritagesimple;

import edu.formation.poo.heritage.Etudiant;
import edu.formation.poo.heritage.Personne;

/**
 * @author Seme
 *
 */
public class MainHeritageSimple {
    public static void main(String[] args) {
        Personne p1 = new Personne("Ladalle", "Roger", "M.");
        Personne p2 = new Personne("Dupont", "Caroline", "Mlle");

        Etudiant e1 = new Etudiant("Dupuis", "Pascal", "M.");
        Etudiant e2 = new Etudiant("Edwige", "Ilant", "Mme");

        // Test init. tableau de cours
        String[] desCours = new String[]{
                "histoire", "philosophie", "mathématiques"};
        Etudiant emma = new Etudiant("Niolia", "Emma", "Mlle", desCours);


        System.out.println(p1.toString());
        p2.toString();
        e1.toString();
        e2.toString();
        System.out.println(emma.toString());
    }
}
