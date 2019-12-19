package edu.formation.poo.heritage;

public class Entreprise extends AbstractEntite {
  // Clase interne, ne peut être instanciée ailleurs qu'ici
  private class Branche {
    private String nom;

    public Branche(String unNom) {
      this.nom = unNom;
    }

  }

  private String numeroSiret;
  // agrégation
  // private ArrayList<Personne> employes;
  private Personne[] employes;
  // composition
  // private ArrayList<Branche> branches;
  private Branche[] branches;

  /*
   * Compteurs du nombre d'employés et de branches de l'entreprise
   */
  public static Integer nbEmployes = 0;
  public static Integer nbBranches = 0;

  /*
   * Bornes maximum à ne pas dépasser
   */
  public static final Integer MAX_EMPLOYES = 5000;
  public static final Integer MAX_BRANCHES = 50;

  // Constructeur
  public Entreprise(String unNumeroSiret) {
    // super(); pas besoin car appel implicite
    this.numeroSiret = unNumeroSiret;
    // this.employes = new ArrayList<Personne>();
    // this.branches = new ArrayList<Branche>();
    this.employes = new Personne[MAX_EMPLOYES];
    this.branches = new Branche[MAX_BRANCHES];
  }

  // Méthode qui crée et qui ajoute une branche à l'entreprise
  public void ajouterBranche(String nom) {
    // C'est l'entreprise qui se charge de créer ses branches
    // this.branches.add(new Branche(nom));
    // si le nombre de branches atteint le nombre maximal de branches
    // il ne faut pas ajouter la nouvelle branche
    // parce qu'on dépasserait la capacité maximale de stockage du tableau
    if (nbBranches < MAX_BRANCHES) {
      this.branches[nbBranches++] = new Branche(nom);
    } else {
      System.err.println(
          "Impossible d'ajouter la branche. Le nombre maximal de branche a été atteint");
    }

  }

  public void ajouterEmploye(Personne personne) {
    // Ici, pas de création, l'objet existe déjà
    // this.employes.add(personne);
    if (nbEmployes < MAX_EMPLOYES) {
      this.employes[nbEmployes++] = personne;
    }
  }

  /*
   * Méthode qui affiche la liste des employés
   */
  public void afficherEmployes() {
    System.out.println("Voici la liste des employés de l'entreprise "
        + this.numeroSiret + " : \n");
    // if (!this.employes.isEmpty())
    if (nbEmployes != 0) {
      for (int i = 0; i < nbEmployes; ++i) {
        employes[i].afficherInfos();
      }
    }
  }

  @Override
  public void afficherInfos() {
    System.out.print(
        "Je suis une entreprise de numero SIRET : " + this.numeroSiret);

    // if (!this.branches.isEmpty())
    if (nbBranches != 0) {
      System.out.print(" composée des branches : ");
      for (Branche b : this.branches) {
        System.out.print(b.nom + "/");
      }
    }
    if (nbEmployes != 0) {
      System.out.print(" et des employés : ");
      for (Personne p : this.employes) {
        System.out.print(p.getNom() + " " + p.getPrenom() + "/");
      }
    }

    System.out.println();
  }
}
