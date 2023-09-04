public class Circulo implements IFigura{
    private float radio;
    private Color color;
    private Punto origen;

    public Circulo(float radio, Punto origen, Color color){
        this.origen = origen;
        this.color = color;
        this.radio = radio;
    }

    public Circulo(){
        origen = IFigura.ORIGEN_PREDEFINIDO;
        color = IFigura.COLOR_PREDEFINIDO;
        radio = 1.0f;
    }

    public void setOrigen(Punto nuevoOrigen){
        origen = nuevoOrigen;
    }

    public void setOrigen(float nuevaX, float nuevaY) {
        origen = new Punto(nuevaX, nuevaY);
    }

    public boolean setColor(Color nuevoColor){
        color = nuevoColor;
        return true;
    }

    public void setRadio(float nuevoRadio){
        radio = nuevoRadio;
    }

    public float getRadio(){
        return radio;
    }

    public Punto getOrigen(){
        return origen;
    }

    public Color getColor(){
        return color;
    }
}