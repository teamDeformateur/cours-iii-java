package test;

public class Quicksort {

    public static void quickSort(int[] tab, int inf, int sup) {
        int gauche, droite, pivot;

        if (inf < sup) {
            gauche = inf - 1;
            droite = sup + 1;
            pivot = tab[inf];
            do {
                do {
                    ++gauche;
                } while ((tab[gauche] < pivot) && (gauche != droite));

                do {
                    --droite;
                } while ((tab[droite] > pivot) && (droite != gauche));

                if (gauche < droite) {
                    permuter(tab, gauche, droite);
                }

            } while (gauche < droite);

            if (tab[droite] < tab[inf]) {
                permuter(tab, droite, inf);
            }
            quickSort(tab, inf, droite - 1);
            quickSort(tab, droite + 1, sup);
        }
    }

    private static void permuter(int[] tab, int i, int j) {
        int tmp = tab[i];
        tab[i] = tab[j];
        tab[j] = tmp;
    }

    public static void main(String[] args) {
        // int[] tableau = new int[] { 1, 5, 2 };
        int[] tableau = new int[] { 1, 5, 2, 4, 8, 78, 15, 10 };
        afficherTableau(tableau);
        System.out.println("");
        quickSort(tableau, 0, tableau.length - 1);
        afficherTableau(tableau);
    }

    private static void afficherTableau(int[] tableau) {
        for (int i = 0; i < tableau.length; ++i) {
            System.out.print(tableau[i] + ", ");
        }
    }

}
