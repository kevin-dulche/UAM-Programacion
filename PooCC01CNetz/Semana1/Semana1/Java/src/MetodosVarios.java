import javax.swing.JOptionPane;

public class MetodosVarios {
    public static void main(String[] args) {
        String cadena;
        int num;
        double valorX, res;
        cadena = JOptionPane.showInputDialog("Dame n:");
        num = Integer.parseInt(cadena);
        cadena = JOptionPane.showInputDialog("Dame x:");
        valorX = Double.parseDouble(cadena);
        res = calcularSerie(num, valorX);
        System.out.println("El resultado de la serie es: " + res);
    }
    static double calcularSerie(int n, double x) {
        double sum = 1;
        int den = 2;
        for (int i = 0; i < n; i++) {
            sum += Math.pow(x, den)/obtenerFactorial(den);
            den += 2;
        }
        return sum;
    }
    static int obtenerFactorial(int n){
        int acum = 1;
        for (int i = 1; i <= n; i++) {
            acum = acum * i;
        }
        return acum;
    }
}