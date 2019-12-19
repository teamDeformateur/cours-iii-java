package edu.formation.poo;

public class AppelCyclette {

  public static void main(String[] args) {
    // on instancie (on crée) un nouvel objet de moule ( de classe) Cyclette
    // qui s'appelle moto en appelant le constructeur de la classe Cyclette
    Cyclette moto = new Cyclette(2, true, (byte) 0);
    Cyclette bi = new Cyclette(2, true, (byte) 2);
    
    System.out.println(moto);
    moto.accelerer();
    moto.seDeplacer('x', "avancer");
    System.out.println(moto);
    
    System.out.println(bi);
    bi.seDeplacer('y', "avancer");
    System.out.println(bi);
    
  }

}
