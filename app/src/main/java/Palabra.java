public class Palabra
{
    private int idPalabra;
    private String textoPalabra;
    private boolean activada;
    private int[] patronVibracion;
//Clase palabra

    public int getIdPalabra() {
        return idPalabra;
    }

    public int[] getPatronVibracion() {
        return patronVibracion;
    }

    public String getTextoPalabra() {
        return textoPalabra;
    }

    public boolean isActivada() {
        return activada;
    }

    public void setActivada(boolean activada) {
        this.activada = activada;
    }

    public void setIdPalabra(int idPalabra) {
        this.idPalabra = idPalabra;
    }

    public void setPatronVibracion(int[] patronVibracion) {
        this.patronVibracion = patronVibracion;
    }

    public void setTextoPalabra(String textoPalabra) {
        this.textoPalabra = textoPalabra;
    }
}
