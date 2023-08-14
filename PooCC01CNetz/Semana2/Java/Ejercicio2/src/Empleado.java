public class Empleado {
    public String nombre;
    public int edad;
    public double salario;

    public double calculaISR(){
        double isr = salario * 30 * 0.15;
        return isr;
    }
}
