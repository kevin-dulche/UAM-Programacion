public class Principal {
    public static void main(String[] args) throws Exception {
        MiObjeto obj = new MiObjeto();
        obj.valor = 10;
        obj.cantidad = 3.14;
        System.out.println("Valor de mi objeto es: " + obj.valor);
        System.out.println("Cantidad de mi objeto es: " + obj.cantidad);
        obj.miMetodo("Hola K ase");
    }
}
