/** */
package edu.formation.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

/** @author Seme */
public class MainFichierJdk7 {
  public static void main(String[] args) throws IOException {
    // convertirMajEnMin();
    // ecrireLigneParLigne();
    // traitementOperations();
    copierColler();
  }

  public static void copierColler() throws IOException {
    // J'instancie deux chemins d'accès aux fichiers
    Path path1 = FileSystems.getDefault().getPath("fichier1.txt");
    Path path2 = FileSystems.getDefault().getPath("fichier2.txt");
    // Ouverture en lecture du premier fichier et en écriture du deuxième
    try (BufferedReader br = Files.newBufferedReader(path1, StandardCharsets.UTF_8);
        BufferedWriter bw = Files.newBufferedWriter(path2, StandardCharsets.UTF_8)) {

      int c;
      while ((c = br.read()) != -1) {
        bw.write(c);
      }
    }
  }

  public static void convertirMajEnMin() throws IOException {
    // J'instancie deux descripteurs de fichiers
    File f1 = new File("fichier1.txt");
    File f2 = new File("fichier2.txt");
    // J'instancie un lecteur
    FileReader fr = new FileReader(f1);
    // J'instancie un écrivain
    FileWriter fw = new FileWriter(f2);

    int c;
    while ((c = fr.read()) != -1) {
      // si c'est une majuscule
      if (c >= 65 && c <= 90) {
        c += 32;
      }
      fw.write(c);
    }
    fr.close();
    fw.close();
  }

  public static void traitementOperations() throws IOException {
    File f = new File("operations.txt");
    FileReader fr = new FileReader(f);
    BufferedReader br = new BufferedReader(fr);
    String op;
    double totalVersements = 0;
    double totalRetraits = 0;
    while ((op = br.readLine()) != null) {
      String[] tabOp = op.split(";");
      String typeOp = tabOp[3];
      double montant = Double.parseDouble(tabOp[4]);
      if (typeOp.equals("V")) totalVersements += montant;
      else totalRetraits += montant;
    }
    br.close();
    System.out.println("Total Versement:" + totalVersements);
    System.out.println("Total Retrait:" + totalRetraits);
  }

  public static void ecrireLigneParLigne() throws IOException {
    // Descripteur de fichier
    File f1 = new File("fichier1.txt");
    // création du lecteur
    FileReader fr = new FileReader(f1);
    // création du tampon de lecture
    BufferedReader br = new BufferedReader(fr);

    File f2 = new File("fichier2.txt");
    FileWriter fw = new FileWriter(f2);
    BufferedWriter bw = new BufferedWriter(fw);

    String s;
    while ((s = br.readLine()) != null) {
      bw.write(s);
      bw.newLine();
    }
    br.close();
    bw.close();
  }
}
