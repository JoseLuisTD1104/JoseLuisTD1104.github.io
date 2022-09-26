import javax.swing.JOptionPane;

public class practica4 {

    static float grados_centigrados, grados_fahrenheit;  

    public static void main(String[] args) {

        grados_centigrados = Float.parseFloat(JOptionPane.showInputDialog(null, " programa #4. \n  Conversor de °c  a °F \n"+"Ingrese la temperatura en grados centigrados; "));

        grados_fahrenheit = 32 + (9*grados_centigrados/5);

        JOptionPane.showMessageDialog(null, "La conversion en grados centigrados es de: "+ grados_fahrenheit);

    }
    
}
