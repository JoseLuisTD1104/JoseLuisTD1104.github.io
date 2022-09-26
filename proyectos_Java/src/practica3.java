import javax.swing.JOptionPane;

public class practica3 {

    static double numero, doble , triple;

    public static void main(String[] args) {
        
        numero = Double.parseDouble(JOptionPane.showInputDialog(null, "programa #3. \n Ingresar un numero real lo duplique y triplique \n"+"Ingresa un numero real: "));

        doble = numero*2;
        triple = numero*3;

        JOptionPane.showMessageDialog(null, "El doble del numoero: "+doble+"\n"+
        "El triple del numero: "+triple);

    }

}
