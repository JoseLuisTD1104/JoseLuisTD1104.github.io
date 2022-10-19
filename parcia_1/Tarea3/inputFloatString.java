/* 

 inputFloatString.java
 Author: JoseLuis1104
 Date: oct 14,2022
 Location:  Mexico

 */


import java.util.Scanner;

public class inputFloatString {

   

    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        
        float myFloat;
        double myDouble;
        String myString;


        // Getting String input
        System.out.println("Enter text : ");
        myString = sc.nextLine();
        System.out.println("text entered: "+myString);

        //  Getting Float input
        System.out.println("Enter float : ");
        myFloat = sc.nextFloat();
        System.out.println("text entered: "+ myFloat);
 
        //  Getting Double input
        System.out.println("Enter double : ");
        myDouble = sc.nextDouble();
        System.out.println("text entered: "+ myDouble);
        
        
    }
}

