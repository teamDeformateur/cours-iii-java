package test;

public class Main2 {

    public static void main(String[] args) {
        int j = 0;
        for(int i = 0; i < 5; j=i++)
        {
            
            System.out.println("i="+i + " j=" + j);
            // j=i++ est �quivalent � 
            j = i;
            i = i + 1;
        }
        j=0;
        for(int i = 0; i < 5; ++i)
        {
            System.out.println("i=" + i);
            // j = ++i est �quivalent �
            i = i + 1;
            j = i;
        }
        

    }

}
