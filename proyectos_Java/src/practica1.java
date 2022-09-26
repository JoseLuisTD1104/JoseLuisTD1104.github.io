
import javax.swing.JOptionPane;

public class practica1 {

    static String nombre;

    public static void main(String[] args) {

        nombre = JOptionPane.showInputDialog(null, "Programa #1. \n Impresión de tu nombre \n"+"Ingresa tu nombre: ");

        JOptionPane.showMessageDialog(null, "Mi nombre es; "+ nombre);
    
}

}
