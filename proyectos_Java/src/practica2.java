import javax.swing.JOptionPane;

public class practica2 {

    static int numero_1;
    static int numero_2;

 public static void main(String[] args) {

    numero_1 = Integer.parseInt(JOptionPane.showInputDialog(null, " programa #2. \n  Imprime los dos numeros entregados \n"+"Ingrese un primer numero"));
    numero_2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un segundo numero"));

    JOptionPane.showMessageDialog(null, "Los numeros enteros ingresados son: " + numero_1 +" y "+ numero_2);
    
}

}
