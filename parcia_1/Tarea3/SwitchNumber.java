/* 
 
 SwitchNumber.java
 Author: JoseLuis1104
 Date: oct 18,2022
 Location:  Mexico 

 */

public class SwitchNumber {
    
    public static void main(String[] args) {
    
      int number = 29;
      String size;

      // switch statement to check size
      switch (number) {

         case 29: 

            size = "Small";

         break;

         case 42: 

            size = "Medium"; 

         break;

         // match the value of week
         
         case 44: 

            size = "Large";

         break;

         case 48: 

            size = "Extra lage"; 

         break;

         default : 

            size = "unknown";

         break;
        
        }

      System.out.println("Size: "+size);

    }

}
