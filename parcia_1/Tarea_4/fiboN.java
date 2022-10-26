/*

 fiboN.java
 Theme: fibonacci 
 Author: JoseLuis1104
 Date: oct 26,2022
 Location:  Mexico

*/

/* 
 
 Imprimir secuencia de números fibonacci.
 - Capturar n como entero, e imprimir la secuencia de n números

*/


import javax.swing.JOptionPane;
// import JOptionPane 

public class fiboN {


    public static void fibo(int numero_a_iterar) { 

        // function fibonacci

        int [] dato_a_entrar = new int [numero_a_iterar];

        // array 

        System.out.print("La serie fibonacci: \n" );

        for (int i=0 ; i<dato_a_entrar.length; i++) {

            // loop for the number to iterate given by the user

         
            if (i>1) {

                // condition that will add up the given values previously established

                dato_a_entrar [i] = dato_a_entrar [i-1] + dato_a_entrar[i-2];
            
            } else if (i<=1) {

                // setting the first two values ​​occupied in the fibonacci series

                dato_a_entrar [i] = i;

            }
                 
            if (i< numero_a_iterar-1) {

                // printing of values with comma 
             
                System.out.print(dato_a_entrar[i]+ " , ");


            } else {

                // printing of the final value with dot
                
                System.out.print(dato_a_entrar[i]+ " . ");

            }
           
           
        }
        
    }

    public static void main(String[] args) {
        // run | Debug

        int numero_a_iterar = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Cuántas veces se iterara la serie fibonacci?"));
        fibo(numero_a_iterar);

    }

}