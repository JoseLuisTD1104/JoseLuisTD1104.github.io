/*

 cuadrado.java
 Author: JoseLuis1104
 Date: oct 26,2022
 Location:  Mexico

*/

/* 
 
Capturar n, validar que sea un entero en el rango de 0 a 9 y usando ciclos producir un
cuadrado de n dimension. 
   
*/

import javax.swing.JOptionPane;

// import JOptionPane 

public class cuadrado {

  // class
  
    public static void cubo(int entrada_datos) {

      // function that prints a square with the specified measurements

      // cycle, decisions and operations for printing data

        if (entrada_datos>=0 && entrada_datos<=9) {
      
          for (int i=0;i<entrada_datos;i++) {

             System.out.print("*");

            }

          System.out.println();

          for (int i=0;i<entrada_datos-2;i++) {

            //asterisks

             System.out.print("*");

             for (int j= 0; j<entrada_datos-2; j++) {

                  // blanks

                 System.out.print(" ");

                } 

              //asterisks

              System.out.println("*");

            }

          for (int i=0; i<entrada_datos; i++) {

             //asterisks

             System.out.print("*");

            }

        } else {

            JOptionPane.showMessageDialog(null, "¡Lo sentimos! \n El numero que usted ingreso no es valido favor de verificarlo");
        
        }
     
    }

    public static void main(String[] args) {

        int entrada_datos = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa en numeros el tamaño que deseas que tenga \n la impresión del cuadrado en un rango de 0 a 9: "));
        cubo(entrada_datos);
        // invocation of cubo function
        
    }

}
