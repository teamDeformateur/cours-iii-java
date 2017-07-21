/**
 * 
 */
package edu.formation.exception;

import java.util.InputMismatchException;
/**
 * @author Seme
 */
import java.util.Scanner;

public class MainException
{
    public static int calcul(int a, int b)
    {
        int c = a / b;
        return c;
    }

    public static void main(String[] args)
    {
        Scanner clavier = new Scanner(System.in);
        try
        {
            System.out.print("Donner a:");
            int a = clavier.nextInt();
            System.out.print("Donner b:");
            int b = clavier.nextInt();
            int fffff;

            fffff = calcul(a, b);
            System.out.println("Resultat=" + fffff);
        }
        catch (ArithmeticException e)
        {
            System.out.println("Division par zero, gros noob");
        }
        catch (InputMismatchException e)
        {
            System.out.println("On avait dit un entier noob !");
        }
        catch (Exception e)
        {
            System.out.println("Erreur inconnue. Appelez le support.");
        }

    }
}
