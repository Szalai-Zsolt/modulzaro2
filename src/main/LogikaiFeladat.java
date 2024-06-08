
package main;

 // Szalai Zsolt
 
public class LogikaiFeladat {
        
    private static String[] palya=new String[7];
        
        
    public static void main(String[] args) {
        jatek();    
    }

    private static void jatek() {
        feltoltes();
        tombKiir();
       
        lepesek();
    }

   
    private static void feltoltes() {
       
      palya[0]=("X"); 
      palya[1]=("X"); 
      palya[2]=("X"); 
      palya[3]=(" "); 
      palya[4]=("O"); 
      palya[5]=("O"); 
      palya[6]=("O"); 
    
    }

    private static void tombKiir() {
         for (int i = 0; i < palya.length; i++) {
           
           System.out.print(palya[i] + " ");
        }
        System.out.println("");   
    }
    
    private static int keresesO() {
        int i = 0;
       
        while(!(palya[i]=="O")){
            i++;
        }

        return i; 
    }
    
    private static int keresesX() {
        int i = palya.length-1;
       
        while(!("X".equals(palya[i]))){
            i--;
        }

        return i; 
    }

    private static void xLep() {
        
        
        if(" ".equals(palya[keresesX()+1])){
            palya[keresesX()]=" ";
            palya[(keresesX()+2)]="X";
        } else if(" ".equals(palya[keresesX()+2])){
            palya[keresesX()]=" ";
            palya[keresesX()+3]="X";
        
        }
    }
    private static void oLep() {
        
        if(" ".equals(palya[keresesO()-1])){
            palya[keresesO()]=" ";
            palya[(keresesO()-2)]="O";
        } else if(" ".equals(palya[keresesO()-2])){
            palya[keresesO()]=" ";
            palya[keresesO()-3]="O";
        
        }
    }

    private static void lepesek() {
        for (int i=0; i<2; i++) {
            
        xLep();
        tombKiir();
        oLep();
        tombKiir();}
        }
}
