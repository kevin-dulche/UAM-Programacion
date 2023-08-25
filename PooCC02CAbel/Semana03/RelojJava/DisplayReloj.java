import java.util.concurrent.TimeUnit;

public class DisplayReloj {
    public static void main(String[] args) {
        DisplayNumero hora = new DisplayNumero(17, 23);
        DisplayNumero minutos = new DisplayNumero(53,59);
        DisplayNumero segundos = new DisplayNumero(3, 59);
        while (true) {
            if (segundos.valor == 0) {
                minutos.incrementar();
            }
            if  ((minutos.valor == 0 ) && (segundos.valor == 0)){
                hora.incrementar();
            }
            try {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } catch (Exception e) {}
            System.out.println(hora.valor + " : " + minutos.valor + " : " + segundos.valor);
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch(Exception e) {}
            segundos.incrementar();
        }
    }
}