import javax.swing.JOptionPane;

public class Ejercicio {
    public static void main(String[] args) {
        // BORRAR: Scanner scanner = new Scanner(System.in);
        
        // Pedir nota 1 con ventana
        String textoNota1 = JOptionPane.showInputDialog("Digite su nota1");
        int nota1 = Integer.parseInt(textoNota1);

        // Pedir nota 2 con ventana
        String textoNota2 = JOptionPane.showInputDialog("Digite su nota2");
        int nota2 = Integer.parseInt(textoNota2);

        // Pedir nota 3 con ventana
        String textoNota3 = JOptionPane.showInputDialog("Digite su nota3");
        int nota3 = Integer.parseInt(textoNota3);

        // Pedir nota 4 con ventana
        String textoNota4 = JOptionPane.showInputDialog("Digite su nota4");
        int nota4 = Integer.parseInt(textoNota4);

        // Calcular promedio
        int promedio = (nota1+nota2+nota3+nota4)/4;
        
        // Mostrar resultado en ventana
        JOptionPane.showMessageDialog(null, "Su promedio es " + promedio);
        
        // BORRAR: scanner.close();
    }
}