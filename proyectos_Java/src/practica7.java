import javax.swing.JOptionPane;

public class practica7 {

    static double cateto1,cateto2,hipotenusa;

    public static void main(String[] args) {

        cateto1 = Double.parseDouble(JOptionPane.showInputDialog(null,"Programa #7. \n  Saca la hipotenusa de un triangulo: \n" 
        +"Ingrese el primer cateto del triangulo"));
        cateto2 = Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese el segundo cateto del triangulo"));

        hipotenusa = Math.sqrt(Math.pow(cateto1, 2)+ Math.pow(cateto2, 2));

        JOptionPane.showMessageDialog(null, "La hipotenusa es igual a: "+ hipotenusa);
        
    }
    
}
