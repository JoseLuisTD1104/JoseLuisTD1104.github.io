/* 

 inputInteger.java
 Author: JoseLuis1104
 Date: oct 10,2022
 Location:  Mexico

 */

import java.util.Scanner;

public class inputInteger {
        public static void main(String[] args) {
    	// Creamos una instancia de clase Scanner
        // Llamada Input 
        Scanner input = new Scanner(System.in);
    	
        System.out.print("Enter an integer: ");
        int number = input.nextInt(); // Usamos Input para leer un entero 
        System.out.println("You entered " + number);

        // closing the scanner object
        input.close();
    }
}
