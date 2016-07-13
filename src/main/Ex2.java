package main;

import java.util.Scanner;

public class Ex2 {

    public static int frec(int n) {
        if (n <= 1) {
            return n;
        } else {
            return frec(n-1) + frec(n-2);
        }
    }
    
    public static int[] fit(int n){
        int[] res = new int[n+1];

        res[0] = 0;
        res[1] = 1;
        
        for(int j = 2; j <= n; ++j){
            res[j] = res[j-1] + res[j-2];
            // 1ère itération
            // res[2] = res[1] + res[0]
        }
        
        return res;
    }


    public static void main(String[] args) {
        int n, res;
        int[] resTab;
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        
        res = frec(n);
        System.out.println("Résultat = " + res);
        scan.close();
        
        resTab = fit(n);
        for(int i=0; i < resTab.length; ++i){
            System.out.print(resTab[i] + ", ");
        }

    }

}
