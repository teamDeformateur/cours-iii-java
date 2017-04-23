package test;

public class Main2 {

    public static void main(String[] args) {
        int j = 0;
        for(int i = 0; i < 5; j=i++)
        {
            
            System.out.println("i="+i + " j=" + j);
            // j=i++ est équivalent à 
            j = i;
            i = i + 1;
        }
        j=0;
        for(int i = 0; i < 5; ++i)
        {
            System.out.println("i=" + i);
            // j = ++i est équivalent à
            i = i + 1;
            j = i;
        }
        

    }

}
