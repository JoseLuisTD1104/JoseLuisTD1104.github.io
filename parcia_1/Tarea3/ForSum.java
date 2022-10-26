/* 
 
  ForSum.java
  Author: JoseLuis1104
  Date: oct 19,2022
  Location:  Mexico 

 */

public class ForSum {

    public static void main(String[] args) {
        
        int sum = 0;
        double n =  8;
    
        // for loop
        for (int i = 1; i <= n; ++i) {

          // body inside for loop
          sum += i;     // sum = sum + i
          
        }

        double  resultado = sum/n;
        System.out.println (sum);
        System.out.println("Sum = " + resultado);
      
    }
    
}
    
    

