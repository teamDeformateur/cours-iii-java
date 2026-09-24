package edu.formation.orchestre;

/**
 * @author Seme
 *
 */
public class Instrument {
    private String nom;
    private float prix;

    /**
     * Constructeur de la classe Instrument.
     * 
     * @param nom  Le nom de l'instrument
     * @param prix Le prix de l'instrument
     */
    public Instrument(String nom, float prix) {
        this.nom = nom;
        this.prix = prix;
    }

    /**
     * Affiche l'état de l'objet Instrument.
     */
    public void afficher() {
        System.out.println("L'instrument %s vaut %.2f".formatted(this.nom, this.prix));
    }

    /**
     * Déprécie l'instrument de 10% C.-à-d. diminue le prix de 10%
     */
    public void depreciation() {
        this.prix *= 0.9f;
    }

    /**
     * Retourne le nom de l'instrument.
     * 
     * @return String Le nom de l'instrument
     */
    public String getNom() {
        return this.nom;
    }

    /**
     * Initialise le nom de l'instrument.
     * 
     * @param nom Le nom de l'instrument
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Retourne le prix de l'instrument.
     * 
     * @return float Le prix de l'instrument
     */
    public float getPrix() {
        return this.prix;

    }

    /**
     * Initialise le prix de l'instrument.
     * 
     * @param prix Le nouveau prix de l'instrument
     */
    public void setPrix(float prix) {
        this.prix = prix;
    }

}
