package edu.formation.poo.heritage;

public class Test {

  public static void main(String[] args) {
    // Entite e1 = new Personne("G.R.R.", "Martin");
    // Entite e2 = new Entreprise("50978945600019");
    //
    // // polymorphisme !!!!!!!!
    // e1.afficherInfos();
    // e2.afficherInfos();
    //
    // ((Personne) e1).methodeSpecifique();
    //
    // Personne e4 = new Personne("Ladalle", "Roger");
    // Entreprise e3 = new Entreprise("55599977700001");
    // e3.ajouterBranche("DG");
    // e3.ajouterBranche("R&D");
    // e3.ajouterEmploye(e4);
    //
    // e3.afficherInfos();
    //
    // // System.out.println(Personne.nombrePersonnes);

    // j'instancie deux personnes, l'une est étudiante, l'autre ras
    Personne foo = new Personne("foo", "bar");
    Personne toto = new Etudiant("Toto", "Latêta");
    // j'instancie mon entreprise
    Entreprise fafiec = new Entreprise("5012456789951");
    // ajoute des employés
    fafiec.ajouterEmploye(foo);
    fafiec.ajouterEmploye(toto);
    // je demande à afficher les infos de tous les employes
    fafiec.afficherEmployes();

  }
}
