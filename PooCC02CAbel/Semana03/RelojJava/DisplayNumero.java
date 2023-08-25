public class DisplayNumero {
    public int valor;
    public int limite;

    public DisplayNumero() {}

    public DisplayNumero(int valor, int limite) {
        this.valor = valor;
        this.limite = limite; 
    }

    public void incrementar() {
        if (valor < limite){
            valor += 1;
        } else {
            valor = 0;
        }
    }
}