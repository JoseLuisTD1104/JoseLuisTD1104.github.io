
import javax.swing.JOptionPane;

public class practica8 {

    static double radio,volumen;

    public static void main(String[] args) {
        
        radio = Double.parseDouble(JOptionPane.showInputDialog(null,"Programa #8. \n  Calcula el volumen de una esfera \n"+ "ingresa el radio: "));
        volumen= (4*Math.PI)/3*Math.pow(radio, 3);

        JOptionPane.showMessageDialog(null, "El volumen de una esfera es de : "+volumen);
    }
    
}
