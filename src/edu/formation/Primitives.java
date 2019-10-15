package edu.formation;

public class Primitives {
  public static void main(String[] args) {
    // float reel = 5.5f;
    Float reel = new Float(5.5);
    System.out.println("reel : " + reel);
    // conversion de float -> double
    double double1 = reel;

    double double2 = 11111111111111165465546545646464564654654654654654.654654654654654;
    double double3 = 11111E45;
    // downcast
    System.out.println("double3 : " + double3);
    System.out.println(double2);
    float reel2 = (float) double2;
    System.out.println(reel2);

    int entier = -128;
    byte octet = (byte) entier;
    System.out.println(octet);

    /*
     * Boucle for
     */
    for (int i = 0; i < 10; i++) {
      System.out.println("Iteration n" + i);
    }
  }
}
