package edu.formation.poo.heritage;

public abstract class AbstractEntite {
  protected Boolean existe;

  public AbstractEntite() {
    this.existe = true;
  }

  // public void afficherInfos(){
  // System.out.println("Entite");
  // // d'autres instructions ....
  // }

  public abstract void afficherInfos();

  public void tuerEntite() {
    this.existe = false;
  }

}
