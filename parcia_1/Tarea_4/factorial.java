
/*

 factorial.java
 Author: JoseLuis1104
 Date: oct 26,2022
 Location:  Mexico

*/

/* 
 
 Leer un entero n y calcular el factorial del número n

 - Nota, el factorial de 0 es 1
 - Validar el numero sea menor 20

*/

import javax.swing.JOptionPane;

// import JOptionPane 

public class factorial {

    // class
    
    static int resultado = 1;

    public static void facto(int entrada) {

        // function to print the factorial of a number
        
        int [] Almacenaje_multiplicacion = new int [entrada];

        // declaration of array 
        
        System.out.println("La factorizacion del numero "+entrada+" : ");

        // print of data

        // cycle, decisions and operations for printing data

        for (int i=0; i<Almacenaje_multiplicacion.length; i++) {

            Almacenaje_multiplicacion [i] = entrada;
            entrada=entrada-1;

            if (i<Almacenaje_multiplicacion.length-1) {

                System.out.print(Almacenaje_multiplicacion[i]+ " * ");

            } else if (i == Almacenaje_multiplicacion.length-1) {

                System.out.print(Almacenaje_multiplicacion[i]+ " = ");

            }
            

        }

        for (int l=0; l<Almacenaje_multiplicacion.length; l++) {

           resultado = resultado*Almacenaje_multiplicacion[l];

        }

        System.out.print(" "+resultado +".");
        
         
    }

    public static void main(String[] args) {
        
        int entrada = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Cuál es el numero que deseas factorizar?"));
        
        // decisions and operations to invoke data and print it

        if (entrada<=20) {

            facto(entrada);

            // Invocation of facto function

        }else if (entrada>20) {

            JOptionPane.showMessageDialog(null,"No se puede agregar valores mayores a 20.");
         
        }

        

    }

}
