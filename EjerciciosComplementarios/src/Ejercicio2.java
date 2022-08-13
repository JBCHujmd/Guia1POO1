import javax.swing.JOptionPane;

public class Ejercicio2 {

    public static void main(String[] args) {
        //Declaración de variables
        String prinum;
        String segnum;

        int numero1;
        int numero2;
        int suma;

        prinum = JOptionPane.showInputDialog("Ingrese el primer numero");
        segnum = JOptionPane.showInputDialog("Ingrese el segundo numero");
        
        //Condicion 
        if (Integer.parseInt(prinum) < 0 || Integer.parseInt(segnum) < 0)
        {
            JOptionPane.showMessageDialog(null, "No se aceptan numero negativos", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
        else
        {
            numero1 = Integer.parseInt(prinum);
            numero2 = Integer.parseInt(segnum);

            suma = numero1 + numero2;
        JOptionPane.showMessageDialog(null, "La suma es: " + suma, "Resultado", JOptionPane.PLAIN_MESSAGE);
        }

        System.exit(0);
    }
}