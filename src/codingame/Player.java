package codingame;

import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse the standard input
 * according to the problem statement.
 **/
class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int W = in.nextInt(); // width of the building.
        int H = in.nextInt(); // height of the building.
        int N = in.nextInt(); // maximum number of turns before game over.
        int X0 = in.nextInt();
        int Y0 = in.nextInt();

        boolean up, down, left, right;
        int posX = X0;
        int posY = Y0;
        int moveToX = 0;
        int moveToY = 0;
        
        int pasX = 0, pasY = 0;
                
        boolean bascule = false;

        String oldBombDir = "";
        
        System.err.println("Hauteur du bâtiment : " + H);

        // game loop
        while (true) {
            String bombDir = in.next(); // the direction of the bombs from
                                        // batman's current location (U, UR, R,
                                        // DR, D, DL, L or UL)
            System.err.println("Direction précédente : " + oldBombDir);
            System.err.println("Nouvelle  direction  : " + bombDir);
            
            up = down = left = right = false;

            moveToX = moveToY = 0;

            if (bombDir.contains("U")) {
                up = true;
                moveToY = -1;
            } else if (bombDir.contains("D")) {
                down = true;
                moveToY = 1;
            }
            if (bombDir.contains("R")) {
                right = true;
                moveToX = 1;
            } else if (bombDir.contains("L")) {
                left = true;
                moveToX = -1;
            }
            
            // si on est à partir de la deuxième itération
            if(bascule){
                // si changement en X
                if(pasX % 2 == 0){
                    pasX = (pasX) / 2;
                } else {
                    pasX = (pasX) / 2 + 1;
                }
                if(pasY % 2 == 0){
                    pasY = (pasY) / 2;
                } else {
                    pasY = pasY / 2 + 1;
                }
            } 
            // on est à la première
            if(!bascule){
                bascule = true;
               // En fonction de la position de Batman, je prends la distance entre lui et le bord visé
                // si la direction est haut, je prends sa positionY
                // si la direction est bas, je prends H-positionY
                if(up){
                    pasY = Y0 / 2;
                } else if(down){
                    pasY = (H - Y0) / 2;  
                }
                if(left){
                    pasX = X0 / 2;
                } else if(right){
                    pasX = (W - X0) / 2;  
                }
            }
            
            System.err.println("Valeur du pas : " + pasX + "," + pasY);
            
            posY = posY + (moveToY) * pasY;
            posX = posX + (moveToX) * pasX;
            
            if(posX >= W){
                posX = W-1;
            } else if (posX < 0) {
                posX = 0;
            }
            if(posY >= H){
                posY = H-1; 
            } else if(posY < 0){
                posY = 0;
            }
            
            

            // on change le pas que SSI il y a eu un changement au niveau du détecteur
            
            oldBombDir = new String(bombDir);
    

            // Write an action using System.out.println()
            // To debug: System.err.println("Debug messages...");

            // the location of the next window Batman should jump to.
            System.out.println(posX + " " + posY);
        }
    }
}
