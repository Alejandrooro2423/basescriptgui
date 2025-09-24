package Ejercicio2;
//ALEJANDRO IGNACIO OROZCO AGUILAR
//a) Se deriva de JuegoAdivinaNumero
public class JuegoAdivinaPar extends JuegoAdivinaNumero {

    public JuegoAdivinaPar(int numeroDeVidas) {
        super(numeroDeVidas);
    }
    //Sobreesbribiendo o Redefiniendo como dice el enunciado
    @Override
    public boolean validaNumero(int n) {
        if (n < 0 || n > 10) {
            System.out.println("Error: el número debe estar entre 0 y 10.");
            return false;
        }
        if (n % 2 != 0) {
            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!Error: Solo PARES!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            return false;
        }
        return true;
    }
}


