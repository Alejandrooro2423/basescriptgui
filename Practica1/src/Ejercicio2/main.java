package Ejercicio2;

//import java.util.Locale;
import java.util.Scanner;

public class main {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	      //sc.useLocale(Locale.US);

	        System.out.print("Ingrese a, b, c: ");
	        double a = sc.nextDouble();
	        double b = sc.nextDouble();
	        double c = sc.nextDouble();

	        if (a == 0) {
	            System.out.println("No es una ecuación cuadrática (a = 0).");
	            sc.close();
	            return;
	        }

	        Ecuaciones_Cuadraticas eq = new Ecuaciones_Cuadraticas(a, b, c);
	        double D = eq.getDiscriminante();

	        if (D > 0) {
	            System.out.printf("La ecuacion tiene dos raices %.6f y %.6f%n", eq.getRaiz1(), eq.getRaiz2());
	        } else if (D == 0) {
	            System.out.printf("La ecuacion tiene una raiz %.0f%n", eq.getRaiz1()); 
	        } else {
	            System.out.println("La ecuacion no tiene raices reales");
	        }



	        sc.close();
	    }
	}

