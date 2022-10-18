/*
  
 ifElseif.java
 Author: JoseLuis1104
 Date: oct 18,2022
 Location:  Mexico 

 */


public class ifElseif {

    public static void main(String[] args) {
        
        double number = -10;

        // checks if number is greather than 0 

        if (number >0) {

            System.out.println("The number is positive");
        
        }

        // checks if number is less than 0
        
        else if (number < 0) {

            System.out.println("The number is negative.");

        }

        // if both condition is false 

        else {

            System.out.println("The number is 0.");
            
        }
    }
    
}
