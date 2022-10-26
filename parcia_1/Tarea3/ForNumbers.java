/*

  ForNumbers.java
  Author: JoseLuis1104
  Date: oct 18,2022
  Location:  Mexico 

 */


public class ForNumbers {
    
 public static void Tabla_1 (int a) {
   
    System.out.println("\nLa tabla del 1 :");  
        
    for (int i = 1; i <= a; i=i+1) {
            
      System.out.println("1 x "+i+" = "+i);

    }

 }

 public static void Tabla_2 (int e) {

    System.out.println("\nLa Tabla del 2: ");  
    
    int mult = 0;

    for (int i = 2; i <= e; i=i+2) {
        
        mult +=1;
        System.out.println("2 x "+mult+" = "+i);
    }
    
  }

  public static void Tabla_9 (int i) {

    System.out.println("\nLa Tabla del 9: ");  

     int mult = 0;

    for (int g = 9; g <= i; g+=9) {
     
        mult +=1;
        System.out.println(" 9 x "+mult+" = "+g);
  
    }
  }

    public static void Tabla_91(int o) {

        System.out.println("\nLa Tabla del 9 nueva version: "); 

        for (int i = 1; i <= o; i=i+1) {
        
            System.out.println( "9 x "+i+" = "+i * 9);       
        }
    }

    public static void menores_a_100(int maximo) {

     System.out.println("\n Pares menores de 100 \n"); 

     for (int i= 2 ; i <=maximo; i=i+2 ) {
        
        System.out.println (i);
    
     }
  
    }

    public static void menores_a_50 (int maximo) {

        System.out.println("\n Impares entre 10 a 50 \n"); 

     for (int i= 11 ; i <=maximo; i=i+2 ) {
        
        System.out.println (i);
    
     }

        
    }

    public static void menores_a_100_inversa(int maximo) {
        
        System.out.println("\n Pares menores de 100 inversa\n"); 

        for (int i= 100 ; i >=maximo; i=i-2 ) {
           
           System.out.println (i);
       
        }

    }

    public static void menores_a_50_inversa(int maximo) {

        System.out.println("\n Impares entre 10 a 50 inversa \n"); 

        for (int i= 49 ; i >=maximo; i=i-2 ) {
           
           System.out.println (i);
       
        }
    }

    public static void main(String[] args) {

     Tabla_1(10);
     Tabla_2 (20);
     Tabla_9(90);
     Tabla_91(10);
     menores_a_100(100);
     menores_a_50(50);
     menores_a_100_inversa(0);
     menores_a_50_inversa(11);
        
    }
}
