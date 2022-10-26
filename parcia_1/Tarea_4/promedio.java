/*

 fiboN.java
 Theme: fibonacci 
 Author: JoseLuis1104
 Date: oct 26,2022
 Location:  Mexico

*/

/* 
 
  Permitir la captura de n números y calcular su promedio

*/


import javax.swing.JOptionPane;

public class promedio {

    public static void prome(int iteracion) {

        double [] array = new double [iteracion];
        double entrada;
        
        System.out.print("El promedio: ");

        for (int i = 0; i<array.length; i++) {

            entrada = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa el numero que deseas promediar: "));
            array[i] = entrada;

            if (i<array.length-1) {

                System.out.print(array[i]+ " + ");

            }else if (i == array.length-1) {

                System.out.print(array[i]+ " = ");

            }
            
        
        }
         
        entrada = 0;

        for (int i=0;i<array.length;i++) {

            entrada += array[i];

        }

        System.out.print(entrada/array.length+ ".");

    }
    
    public static void main(String[] args) {
    
        int iteracion = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Cuál es la cantidad  de numeros que va a promediar?"));
        prome(iteracion);

    }

}
