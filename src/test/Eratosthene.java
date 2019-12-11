package test;

import java.util.Scanner;

public class Eratosthene {

  public static void crible(int multiple, boolean[] barre, int max) {
    for (int i = 1; i <= max; ++i) {
      if (i % multiple == 0) {
        barre[i] = true;
      }
    }
  }

  public static void main(String[] args) {
    int n, max;
    boolean[] barre;

    int[] entiers = new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

    Scanner scan = new Scanner(System.in);
    max = scan.nextInt();

    barre = new boolean[max + 1];

    for (n = 1; n <= max; ++n) {
      barre[n] = false;
    }
    crible(2, barre, max);
    crible(3, barre, max);
    crible(5, barre, max);
    crible(7, barre, max);
    crible(11, barre, max);

    for (n = 2; n <= max; n++) {
      if (!barre[n]) {
        System.out.println(n);
      }

    }
  }
}
