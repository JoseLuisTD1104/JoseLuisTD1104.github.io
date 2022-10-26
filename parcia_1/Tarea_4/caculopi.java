/*

 calculopi.java
 Author: JoseLuis1104
 Date: oct 26,2022
 Location:  Mexico

*/

/* 
 
 Capturar n, validar que sea un entero en el rango de 0 a 9 y usando ciclos producir un
 triangulo (triangulo.java)

*/

import javax.swing.JOptionPane;

public class caculopi {
    
     public static void pi(int precision) {

        final double dividendo = 1; 
        double divisor = 1,resultado=0,division=0;

        for (int i = 0; i<precision; i++) {
            
            division = dividendo/divisor;
            divisor = divisor+2;

            
            if (i%2 == 0) {

                resultado -= division;
                

            }else {

                resultado += division;
                

            }
        
        }

        System.out.println(resultado*4);
        
    }

    public static void main(String[] args) {
        
        int precision = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Cuál es la precision exacta que deseas obtener del numero pi? (mencianalo en digitos) "));
        pi(precision);

    }

}
