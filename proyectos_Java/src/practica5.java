
import javax.swing.JOptionPane;

public class practica5 {

    static double radio,longitud,area;

    public static void main(String[] args) {
        
        radio = Double.parseDouble(JOptionPane.showInputDialog(null, "Programa  #5. \n Saca longitud y area de un circulo \n"+"Ingresa el radio del circulo"));

        longitud = 2*Math.PI*radio;
        area = Math.PI*Math.pow(radio, 2);

        JOptionPane.showMessageDialog(null,"La longitud del circulo es:  "+longitud+"\n"+
        "El area del circulo es: "+area);
    }

}
