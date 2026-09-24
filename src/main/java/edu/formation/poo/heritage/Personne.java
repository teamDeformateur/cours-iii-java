package edu.formation.poo.heritage;

public class Personne extends AbstractEntite {
    // nombre de personnes dans tout le programme
    public static int nombrePersonnes = 0;
    protected String nom;
    protected String prenom;
    private String civilite;

    public Personne() {
        // On ajoute une personne à chaque construction
        Personne.nombrePersonnes++;
    }

    /**
     *
     * @param unNom
     * @param unPrenom
     */
    public Personne(String unNom, String unPrenom) {
        this.nom = unNom;
        this.prenom = unPrenom;
        // On ajoute une personne à chaque construction
        Personne.nombrePersonnes++;
    }

    /**
     *
     * @param nom
     * @param prenom
     * @param civilite
     */
    public Personne(String nom, String prenom, String civilite) {
        this.nom = nom;
        this.prenom = prenom;
        this.civilite = civilite;
        // On ajoute une personne à chaque construction
        Personne.nombrePersonnes++;
    }

    public void changerCivilite(String civilite) {
        this.civilite = civilite;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @Override
    public void afficherInfos() {
        System.out
                .println("Voici donc la personne de nom " + this.nom + " et de prénom " + this.prenom);
    }

    public void methodeSpecifique() {
        System.err.println("Foo");
    }

    /*
     * (non-Javadoc)
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Personne de nom " + this.nom + " et de prénom " + this.prenom;
    }
}
