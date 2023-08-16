import javax.swing.JOptionPane;

public class MetodoSuma {
    public static void main(String[] args) {
        String cadena;
        double valorUno, valorDos, res;
        // Vamos a crear un modulo que sume dos numeros flotantes
        cadena = JOptionPane.showInputDialog("Dame el primer valor: ");
        valorUno = Double.parseDouble(cadena);
        cadena = JOptionPane.showInputDialog("Dame el sugundo valor: ");
        valorDos = Double.parseDouble(cadena);
        res = sumaDosValores(valorUno, valorDos);
        System.out.println("El resultado de la suma es: " + res);
        JOptionPane.showMessageDialog(null,"Hola");

    }
    static double sumaDosValores(double valorUno, double valorDos) {
        double resultado = valorUno + valorDos;
        return resultado;
    }

}
