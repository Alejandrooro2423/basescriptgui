package Ejercicio1;
//ALEJANDRO IGNACIO OROZCO AGUILAR
import java.util.*;

//se deriva de clase Juego
public class JuegoAdivinaNumero extends Juego {
	//a)atributos
    private int numeroAAdivinar;
    
    //b)constructor
    public JuegoAdivinaNumero(int numeroDeVidas) {
        super(numeroDeVidas);
    }

    //d)metodo juega
    public void juega() {
        Scanner sc = new Scanner(System.in);
        //1) Llamo reiniciaPartida (Heredado)
        reiniciaPartida();
        //2) Generamos números aleatorios
        numeroAAdivinar = (int)(Math.random() * 11);
        //3) Mando el mensaje al usuario
        System.out.println("Adivina un número entre 0 y 10. Tienes " + numeroDeVidas + " vidas.");
        //4)Lee el numero por teclado
        while (true) {
            System.out.print("Ingresa tu número: ");
            int intento;
            try {
                intento = Integer.parseInt(sc.nextLine().trim());
            } catch (Exception e) {
                System.out.println("Entrada inválida. Intenta con un entero.");
                continue;
            }

            if (intento == numeroAAdivinar) {
            	//a' SI ES IGUAL
                System.out.println("¡Acertaste!");
                actualizaRecord();
                System.out.println("Vidas restantes: " + vidasRestantes + " | Record: " + getRecord());
                break; 
            } else {
                //b' SI ES DIFERENTE
                boolean quedanVidas = quitaVida();
                //c' TRUE 
                if (quedanVidas) {
                    if (intento < numeroAAdivinar) {
                        System.out.println("Incorrecto. El número es MAYOR. Vidas: " + vidasRestantes);
                    } else {
                        System.out.println("Incorrecto. El número es MENOR. Vidas: " + vidasRestantes);
                    }
                //d' FALSE
                } else {
                    System.out.println("Sin vidas.  El número era: " + numeroAAdivinar);
                    System.out.println("Record actual: " + getRecord());
                    break;
                }
            }
        }
    }
}

