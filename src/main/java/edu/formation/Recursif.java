package edu.formation;

public class Recursif {

  public static int incIntRec(int entier) {
    if (entier >= 10) {
      return 0;
    } else {
      return incIntRec(entier + 1) + 1;
      // incInt(1) + 1;
      // incInt(2) + 1 + 1;
      // incInt(3) + 1 + 1 + 1;
      // ...
      // 0 + 1+1+1+1+1+1+1+1+1+1;
    }
  }

  public static int incIntIter(int entier) {
    int i;
    for (i = entier; i < 10; i++) {
      ;
    }
    return i;
  }

  public static void main(String args[]) {
    int test = 0;
    int resultat;

    resultat = incIntRec(test);

    System.out.println(resultat);

    // resultat = incIntIter(test);

    System.out.println(resultat);

  }
}
