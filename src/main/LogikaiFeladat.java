
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
        xLep();
        tombKiir();
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
            palya[keresesX()+1]="X";
        } else if(" ".equals(palya[keresesX()+2])){
            palya[keresesX()]=" ";
            //palya[keresesX()+2]="X";
        
        }
    }

}
