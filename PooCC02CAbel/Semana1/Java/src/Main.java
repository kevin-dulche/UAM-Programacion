import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        
        int opcion;

        while (true) {
            System.out.println("\n\tMENU");
            System.out.println("1.- Mostrar suma");
            System.out.println("2.- Intercambiar vector");
            System.out.println("3.- Verificar si un numero es primo");
            System.out.println("4.- Calculadora");
            System.out.println("5.- Salir");

            String entero = JOptionPane.showInputDialog("Ingresa la opcion que desea: ");
            opcion = Integer.parseInt(entero);
            
            if (opcion < 1 || opcion > 5) {
                System.out.println("Respuesta erronea");
                continue;
            }

            switch (opcion) {
                case 1:
                    Suma.sumas();
                    break;
                case 2:
                    Vector.invertirVector();
                    break;
                case 3:
                    Primo.primos();
                    break;
                case 4:
                    Calculadora.menu();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    break;
            }
        }
    }
}