public class Celular {
    public String modelo;
    public double precio;
    public boolean activo;

    public double calculaIVA() {
        double iva = precio * 0.10;
        return iva;
    }

    public double descuento(int porcenDesc) {
        double desc = precio * (porcenDesc * 0.01);
        return desc;
    }
}
