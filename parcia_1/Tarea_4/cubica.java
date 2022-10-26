/*

 cubica.java
 Author: JoseLuis1104
 Date: oct 26,2022
 Location:  Mexico

*/

/* 
 
  Calcular una función cúbica
  dado un rango de números de [-10, 10] calcular la funcion x^3
  imprimir su tabla.

*/

public class cubica {

     public static void cubo() {
        
        double [] array = new double [20];
        int rango_numeral=-10,indice_tabla=-10;

        for (int i=0; i<array.length; i++) {

            array [i] = rango_numeral;
            rango_numeral ++;
           
        }
        
        System.out.println("---------------------");

        for (int i=0; i<array.length; i++) {

            array[i] = Math.pow(array[i], 3);
            
            System.out.println(indice_tabla+" | "+array[i]);
            indice_tabla++;

        }

        System.out.println("---------------------");

     }

    public static void main(String[] args) {
        
       cubo();

    }
    
}
