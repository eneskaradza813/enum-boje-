package vjzeba15;

import java.util.Scanner;

public class Vjzeba15 {
    
   enum Boja{
       TREF, KARO, HERC, PIK
   }

    public static void main(String[] args) {
        
        for(Boja b : Boja.values())
            System.out.println(b +" , redni broj: " +b.ordinal());
        
        Boja boja1 = Boja.HERC;
        System.out.println("Unesi ime boje(velikim slovima)");
        try(Scanner sc = new Scanner(System.in)){
            Boja boja = Enum.valueOf(Boja.class, sc.next());
            System.out.println(boja);
            switch(boja){
                case TREF:
                case PIK:
                    System.out.println("crna");
                    break;
                    
                case KARO:
                case HERC:
                    System.out.println("crvena");
            }
            int rez = boja.compareTo(boja1);
            if(rez > 0)
                System.out.println(boja + "je \"jaca\" boja nego " + boja1);
            else
                System.out.println("Unijeta boja, " + boja +", je ista kao zadata");
        }



        
    }

}
