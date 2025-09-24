package Ejercicio1;
//ALEJANDRO IGNACIO OROZCO AGUILAR
public class Juego {
	//a) se añadio vidasRestantes para que el inciso b se pueda cumplir correctamente
    protected int numeroDeVidas;
    protected int vidasRestantes;
    protected int record; 

    public Juego(int numeroDeVidas) {
        this.numeroDeVidas = numeroDeVidas;
        this.vidasRestantes = numeroDeVidas;
        this.record = 0;
    }

    //b)
    public void reiniciaPartida() {
        vidasRestantes = numeroDeVidas;
    }

    //c)
    public void actualizaRecord() {
        if (vidasRestantes > record) {
            record = vidasRestantes;
        }
    }

   //d)
    public boolean quitaVida() {
        vidasRestantes--;
        return (vidasRestantes > 0);
    }

    public int getRecord() {
        return record;
    }
}
