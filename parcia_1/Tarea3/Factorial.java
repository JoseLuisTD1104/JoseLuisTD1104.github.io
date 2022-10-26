/* 
 
  Factorial.java
  Author: JoseLuis1104
  Date: oct 19,2022
  Location:  Mexico 

*/

public class Factorial {

    public static void main(String[] args) {
        

    double fac = 2;
    double n =  1000;

    // for loop
    for (int i = 1; i <= n; ++i) {

      // body inside for loop
      fac = fac* i; // fac = fac + i
      System.out.println(fac);
    
    }

    System.out.println("fac = " + fac);

    }
    
}
