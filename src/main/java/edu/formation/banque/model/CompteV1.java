package edu.formation.banque.model;

public abstract class CompteV1 {
  private int code;
  public final long PLAFOND_MAX;
  public final static long NB_COMPTES_MAX = 5000;
  protected float solde;
  private static int nbComptes;

  public CompteV1() {
    this.PLAFOND_MAX = 99999999999L;
    ++nbComptes;
    code = nbComptes;
    this.solde = 0;
    System.out.println("Construction d'un Compte");
  }

  public CompteV1(int solde) {
    this.PLAFOND_MAX = 99999999999L;
    ++nbComptes;
    code = nbComptes;
    this.solde = solde;
    System.out.println("Construction d'un Compte");
  }

  public void verser(float mt) {
    solde += mt;
  }

  public void retirer(float mt) {
    if (mt < solde)
      solde -= mt;
  }

  public String toString() {
    return ("Code=" + code + " Solde=" + solde);
  }


}
