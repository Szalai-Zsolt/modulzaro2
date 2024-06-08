
package main;

 //@author Szalai Zsolt
    import java.util.Random;
    import java.util.Scanner;

public class Modulzaro2 {

    
    private static int[] sorozat;
    private static int[][] matrix;
    private static int also=0, felso=25;
    private static final Random rnd=new Random();
    private static final Scanner scr=new Scanner(System.in);
    
     public static void main(String[] args) {
       modulzaro2();
    }

    private static void modulzaro2() {
        programozoiTetelek();
        adatszerkezetTomb();
    }

    private static void programozoiTetelek() {
        feltolt(16);
        kiir(4);
        osszegzesBemutatasa();
        megszamlalasBemutatasa();
        minHelyBemutatasa();
        maxHelyBemutatasa();
        kivalasztasBemutatasa();
        eldontesEgyBemutatasa();
        eldontesMindBemutatasa();
        linKerBemutatasa();
    }
    
    private static void adatszerkezetTomb() {
       
       matrixBemutatas();
       inverzMatrixBemutatas();
 
    }
    private static void osszegzesBemutatasa() {
    
        konzolraIr("Összegzes Bemutatása: ");
        konzolraIr("A tömb elemeinek összege: %d\n ".formatted(osszegzes()));
    
    }
    

    private static void megszamlalasBemutatasa() {
        konzolraIr("Megszámlálás bemutatása: ");
        konzolraIr("A tömbben lévő nullák száma: %d\n".formatted(megszamlalas()));
        
    }

    private static void minHelyBemutatasa() {
        konzolraIr("MinHely bemutatása: ");
        konzolraIr("A legkissebb érték helye: %d\n".formatted(minHely()));
    }

    private static void maxHelyBemutatasa() {
        konzolraIr("MaxHely bemutatása: ");
        konzolraIr("A legnagyobb érték helye: %d\n".formatted(maxHely()));
    }

    private static void kivalasztasBemutatasa() {
        konzolraIr("Kiválasztás bemutatása: ");
        if(kivalasztas()> 0){
        konzolraIr("Az első 5-tel osztható szám helye: %d\n".formatted(kivalasztas()));
        }else{
        konzolraIr("Nincs benne 5-tel osztható szám.\n");
        }
    }
    

    private static void eldontesEgyBemutatasa() {
        konzolraIr("Eldontés(Legalább egy) bemutatása: ");
        if(!eldontesEgy()){
        konzolraIr("Van benne tökéletes szám:\n");
        }else{
        konzolraIr("Nincs benne tökéletes szám.\n");
        }
    }

    private static void eldontesMindBemutatasa() {
        konzolraIr("Eldontes(mind) bemutatása: ");
        if(!eldontesMind()){
        konzolraIr("A tömb elemei növekvő sorrendben követik egymást\n");
        }else{
        konzolraIr("A tömb elemei nem növekvő sorrendben követik egymást\n");
        }
    }

    private static void linKerBemutatasa() {
        konzolraIr("Lineáris keresés bemutatása: ");
        if(linKer() == -1){
        konzolraIr("A tömbben lévő 13 szám helye: %d\n".formatted(kivalasztas()));
        }else{
        konzolraIr("Nincs benne 13 szám.\n");
        }
    }

    private static void matrixBemutatas() {
        konzolraIr("Kétdimenziós mátrix feltöltése és kiiratása: \n");
        tombKiir(feltoltMatrix(4, 4));
    }

    private static void inverzMatrixBemutatas() {
        konzolraIr("Kétdimenziós mátrix inverz feltöltése és kiiratása: \n");
        tombKiir(feltoltMatrixInverz(4, 4));
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

    private static int minHely() {
        int minIndex = 0;
        for (int i = 1; i < sorozat.length; i++) {
            if(sorozat[i] < sorozat[minIndex]){
                minIndex = i;
            }
        }
        return minIndex;
    }

    private static int maxHely() {
        int maxIndex = 0;
        for (int i = 1; i < sorozat.length; i++) {

            if(sorozat[i] > sorozat[maxIndex]){
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    private static int kivalasztas() {
        int i = 0;
       
        while(!(sorozat[i]%5==0)){
            i++;
        }

        return i; 
    }

    private static boolean eldontesEgy() {
        int N = sorozat.length;
        int i = 0;
        while(i < N && !(tokeletesE(sorozat[i]))){
            i++;
        }
         
        return i < N;
    }

    private static boolean eldontesMind() {
        int N = sorozat.length;
        int i = 0;
        while(i < N && !(sorozat[i] > sorozat[i+1])){
            i++;
        }
        return i < N;  
    }

    private static int linKer() {
        int N = sorozat.length;
        int ker = 13;
        int i = 0;
        while(i < N && !(sorozat[i] > ker)){
            i++;
        }
 
        if(i < N){
                return i;
        } else {
                return -1;
        }
     }

   
    
    private static boolean tokeletesE(int szam) {
        int osszeg = megszamlalas();
        
        return osszeg == szam;
    }
    

    private static int velSzam(int also, int felso) {
        int ertek=rnd.nextInt(also, felso);
        return ertek;
    }

    private static void feltolt(int db) {
       
        sorozat = new int[db];
        
        for (int i = 0; i < sorozat.length; i++) {
            sorozat[i] = velSzam(also, felso);
        }
    }

    private static void kiir(int oszlop) {
        for (int i = 0; i < sorozat.length; i++) {
           if(i != 0 && i%oszlop==0){
            System.out.println(" ");
            }
           System.out.print(sorozat[i] + " ");
        }
        System.out.println(" ");
    }
    
     private static void konzolraIr(String kimenet) {
        System.out.println(kimenet);    
    }

    private static int[][] feltoltMatrix(int sor, int oszlop) {
       matrix = new int[sor][oszlop];
       for(int i=0; i<sor; i++){
           for(int j=0; j<oszlop; j++){
               if(i==j){
                   matrix[i][j]=velSzam(also, felso);
               }
           }
       }
       return matrix;
    }
    
    private static int[][] feltoltMatrixInverz(int sor, int oszlop) {
       matrix = new int[sor][oszlop];
       for(int i=0; i<sor; i++){
           for(int j=0; j<oszlop; j++){
               if(i!=j){
                   matrix[i][j]=velSzam(also, felso);
               }else{
                   matrix[i][j]=0;
               }
           }
       }
       return matrix;
    }
    private static void tombKiir(int[][] matrix) {
        int sorDb = matrix.length;
        for (int sor = 0; sor < sorDb; sor++) {
            for (int oszlop = 0; oszlop <  matrix[sor].length; oszlop++) {
                     System.out.print(matrix[sor][oszlop] + " ");
            }
            System.out.println("");
        }
        System.out.println("");
    }


    
}
