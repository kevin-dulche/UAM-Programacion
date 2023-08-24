public class Fecha {
    private int dia;
    private int mes;
    private int anio;
    
    public Fecha() {}

    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getDia() {
        return dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getMes() {
        return mes;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getAnio() {
        return anio;
    }

    public void imprimeFecha(){
        System.out.println("Dia         : " + dia);
        System.out.println("Mes         : " + mes);
        System.out.println("Anio        : " + anio);
    }
}