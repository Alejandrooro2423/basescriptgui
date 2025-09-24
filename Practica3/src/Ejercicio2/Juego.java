package Ejercicio2;
//ALEJANDRO IGNACIO OROZCO AGUILAR
public class Juego {
    protected int numeroDeVidas;
    protected int vidasRestantes;
    protected int record;

    public Juego(int numeroDeVidas) {
        this.numeroDeVidas = numeroDeVidas;
        this.vidasRestantes = numeroDeVidas;
        this.record = 0;
    }

    public void reiniciaPartida() {
        vidasRestantes = numeroDeVidas;
    }

    public void actualizaRecord() {
        if (vidasRestantes > record) record = vidasRestantes;
    }

    public boolean quitaVida() {
        vidasRestantes--;
        return (vidasRestantes > 0);
    }

    public int getRecord() { return record; }
}
