/**
 * 
 */
package edu.formation.file;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Seme
 *
 */
public class MainFichier
{
    public static void main(String[] args) throws IOException
    {
        convertirMajEnMin();
    }

    public static void copierColler() throws IOException
    {
        // J'instancie deux descripteurs de fichiers
        File f1 = new File("fichier1.txt");
        File f2 = new File("fichier2.txt");
        // J'instancie un lecteur
        FileReader fr = new FileReader(f1);
        // J'incstancie un écrivain
        FileWriter fw = new FileWriter(f2);

        int c;
        while ((c = fr.read()) != -1)
        {
            fw.write(c);
        }
        fr.close();
        fw.close();
    }

    public static void convertirMajEnMin() throws IOException
    {
        // J'instancie deux descripteurs de fichiers
        File f1 = new File("fichier1.txt");
        File f2 = new File("fichier2.txt");
        // J'instancie un lecteur
        FileReader fr = new FileReader(f1);
        // J'incstancie un écrivain
        FileWriter fw = new FileWriter(f2);

        int c;
        while ((c = fr.read()) != -1)
        {
            // si c'est une majuscule
            if (c >= 65 && c <= 90)
            {
                c += 32;
            }
            fw.write(c);
        }
        fr.close();
        fw.close();
    }
}
