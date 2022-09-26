import javax.swing.JOptionPane;

public class practica6 {

    static double m_s, km_h,s; 
    
    public static void main(String[] args) {
        
        km_h = Double.parseDouble(JOptionPane.showInputDialog(null, "programa #6. \n Conversor de unidades km/h a m/s \n"+
        "Ingrese su trayectoria en km/h"));

        m_s = (km_h*1000)/3600;
        
        JOptionPane.showMessageDialog(null, "La conversion de km/h a m/s es de: "+m_s);
        
    }


}
