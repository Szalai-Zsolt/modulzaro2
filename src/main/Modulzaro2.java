
package main;

 //@author Szalai Zsolt
 
public class Modulzaro2 {
    
    private static int[] sorozat;
    
    public static void main(String[] args) {
       modulzaro2();
    }

    private static void modulzaro2() {
        programozoiTetelek();
        adatszerkezetTomb();
    }

    private static void programozoiTetelek() {
        osszegzesBemutatasa();
        megszamlalasBemutatasa();
        minHelyBemutatasa()
        maxHelyBemutatasa();
        kivalasztasBemutatasa();
        eldontesEgyBemutatasa();
        eldontesMindBemutatasa();
        linKerBemutatasa();
    }


    private static int osszegzes() {
        int osszeg = 0;
        for (int i = 0; i < sorozat.length; i++) {
            osszeg += sorozat[i];
        }
        return osszeg;
    }

    private static int megszamlalas() {
        int db = 0;
        for (int i = 0; i < sorozat.length; i++) {
            if (sorozat[i] == 0) {
                db++;
            }
        }
        return db;
    }

    private static void minHely() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static void maxHely() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static void kivalasztas() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static void eldontesEgy() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static void eldontesMind() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static void linKer() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static void adatszerkezetTomb() {
       
    }

    private static void velSzam(int also, int felso) {
        
    }

    private static void feltolt(int db) {
        
    }

    private static void kiir(int oszlop) {
        
    }
    
}
