public class MiNegocio {
    public static void main(String[] args) {
        Empleado e1 = new Empleado();
        e1.nombre = "Juan";
        e1.edad = 33;
        e1.salario = 128.13;
        System.out.println("Su nombre es: " + e1.nombre);
        System.out.println("Su edad es: " + e1.edad);
        System.out.println("Su salario es: " + e1.salario);
        double isr = e1.calculaISR();
        System.out.println("Su isr es: " + isr);
        
        Empleado e2 = new Empleado();
        e2.nombre = "Karla";
        e2.edad = 38;
        e2.salario = 359.14;
        System.out.println("Su nombre es: " + e2.nombre);
        System.out.println("Su edad es: " + e2.edad);
        System.out.println("Su salario es: " + e2.salario);
        double isr2 = e2.calculaISR();
        System.out.println("Su isr es: " + isr2);
    }
}
