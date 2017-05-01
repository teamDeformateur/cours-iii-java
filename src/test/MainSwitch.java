package test;

import java.util.Scanner;

public class MainSwitch {

    public static void main(String[] args) {

        System.out.print("Donner un nombre:");
        Scanner clavier = new Scanner(System.in);
        int nb = clavier.nextInt();
        switch (nb) {
        case 1:
            System.out.println("Lundi");
            break;
        case 2:
            System.out.println("Mardi");
            break;
        case 3:
            System.out.println("Mercredi");
            break;
        default:
            System.out.println("Autre");
            break;

        }
        clavier.close();
    }

}
