package edu.formation.bibliotheque;

public class Livre {
  private String isbn;
  private int nbPages;
  private int nbPagesLues;

  public Livre(String isbn, int nbPages) {
    this.isbn = isbn;
    this.nbPages = nbPages;
    this.nbPagesLues = 0;
  }

  public String getIsbn() {
    return this.isbn;
  }

  public String toString() {
    return "Le livre de numéro : " + this.isbn + ", de " + this.nbPages + " pages; dont "
        + this.nbPagesLues + " lues.";
  }

  protected void lirePages(int nombre) {
    this.nbPagesLues += nombre;
  }

}
