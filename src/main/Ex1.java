package main;

import java.util.Scanner;

public class Ex1 {

    public static int f(int n) {
        if (n == 1) {
            return 0;
        } else {
            return g(n);
        }
        // 0 + 1 + 1 + 1 = 3
    }

    public static int g(int n) {
        return f(n / 2) + 1;
    }

    public static void main(String[] args) {
        int res, n;
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        res = f(n);
        System.out.println("Résultat = " + res);
        scan.close();

    }

}
