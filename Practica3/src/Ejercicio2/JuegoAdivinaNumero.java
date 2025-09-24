package Ejercicio2;
//ALEJANDRO IGNACIO OROZCO AGUILAR
import java.util.Scanner;

public class JuegoAdivinaNumero extends Juego {
    protected int numeroAAdivinar;

    public JuegoAdivinaNumero(int numeroDeVidas) {
        super(numeroDeVidas);
    }
    //a) Metodo ValidaNumero
    public boolean validaNumero(int n) {
        return (n >= 0 && n <= 10);
    }
    //b) metodo juega usando datos por teclado
    public void juega() {
        Scanner sc = new Scanner(System.in);

        reiniciaPartida();                     
        numeroAAdivinar = (int)(Math.random()*11); 

        System.out.println("Adivina un número entre 0 y 10. Vidas: " + numeroDeVidas);

        while (true) {                         
            System.out.print("Ingresa tu número: ");
            String s = sc.nextLine().trim();
            int intento;

            try { intento = Integer.parseInt(s); }
            catch (Exception e) {
                System.out.println("Entrada inválida. Escribe un entero.");
                continue; 
            }
            if (!validaNumero(intento)) {

                System.out.println("Número inválido para este juego. Intenta otra vez.");
                continue; 
            }

            if (intento == numeroAAdivinar) {
                System.out.println("¡Acertaste! Era " + numeroAAdivinar);
                actualizaRecord();
                System.out.println("Vidas restantes: " + vidasRestantes + " | Record: " + getRecord());
                break;
            } else {
                boolean quedan = quitaVida();
                if (quedan) {
                    if (intento < numeroAAdivinar)
                        System.out.println("Incorrecto. Es Mayor. Vidas: " + vidasRestantes);
                    else
                        System.out.println("Incorrecto. Es Menor. Vidas: " + vidasRestantes);
                } else {
                    System.out.println("Sin vidas. El número era: " + numeroAAdivinar);
                    System.out.println("Record: " + getRecord());
                    break;
                }
            }
        }
    }
}

