package edu.formation.poo.genericite;

import java.util.ArrayList;
import java.util.List;

public class MainBoite {

	/*
	 * La méthode générique addBox définit un type de paramètre nommé U
	 */
	public static <U> void addBox(U u, List<Boite<U>> boxes) {
		// nouvelle boite de U
		Boite<U> box = new Boite<>();
		// Ajout du U dans la boite de U
		box.set(u);
		// Ajout de la boite à une liste de boites
		boxes.add(box);
	}

	public static <U> void outputBoxes(List<Boite<U>> boxes) {
		int counter = 0;
		for (Boite<U> box : boxes) {
			U boxContents = box.get();
			System.out.println("Boite #" + counter + " contient [" + boxContents.toString() + "]");
			counter++;
		}
	}

	public static void main(String[] args) {
		// Liste de boîtes à chaussures
		ArrayList<Boite<Chaussure>> listofShoesBoxes = new ArrayList<>();
		/*
		 * ajout d'une boîte à la liste de boîtes Ici, on indique explicitement (type
		 * witness) le type du paramètre générique
		 */
		MainBoite.<Chaussure>addBox(new Chaussure("42", Matiere.ARCANTARA), listofShoesBoxes);
		// ici, on ne l'indique plus. Le type est inféré.
		MainBoite.addBox(new Chaussure("41", Matiere.CUIR), listofShoesBoxes);
		MainBoite.addBox(new Chaussure("43", Matiere.NYLON), listofShoesBoxes);
		MainBoite.outputBoxes(listofShoesBoxes);
	}

}
