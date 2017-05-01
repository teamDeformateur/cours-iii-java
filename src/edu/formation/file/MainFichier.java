/**
 * 
 */
package edu.formation.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.sun.swing.internal.plaf.basic.resources.basic_zh_TW;

/**
 * @author Seme
 *
 */
public class MainFichier
{
    public static void main(String[] args) throws IOException
    {
        // convertirMajEnMin();
        ecrireLigneParLigne();
        traitementOperations();
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

    public static void traitementOperations() throws IOException
    {
        File f = new File("operations.txt");
        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);
        String op;
        double totalVersements = 0;
        double totalRetraits = 0;
        while ((op = br.readLine()) != null)
        {
            String[] tabOp = op.split(";");
            String typeOp = tabOp[3];
            double montant = Double.parseDouble(tabOp[4]);
            if (typeOp.equals("V"))
                totalVersements += montant;
            else
                totalRetraits += montant;
        }
        br.close();
        System.out.println("Total Versement:" + totalVersements);
        System.out.println("Total Retrait:" + totalRetraits);

    }

    public static void ecrireLigneParLigne() throws IOException
    {
        // Dexcripteur de fichier
        File f1 = new File("fichier1.txt");
        // création du lecteur
        FileReader fr = new FileReader(f1);
        // création du tampon de lecture
        BufferedReader br = new BufferedReader(fr);

        File f2 = new File("fichier2.txt");
        FileWriter fw = new FileWriter(f2);
        BufferedWriter bw = new BufferedWriter(fw);

        String s;
        while ((s = br.readLine()) != null)
        {
            bw.write(s);
            bw.newLine();
        }
        br.close();
        bw.close();
    }
}
