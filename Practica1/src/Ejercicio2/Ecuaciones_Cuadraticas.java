package Ejercicio2;

public class Ecuaciones_Cuadraticas {
	//a)
	    private double a;
	    private double b;
	    private double c;
	//b)
	    public Ecuaciones_Cuadraticas(double a, double b, double c) {
	        this.a = a; 
	        this.b = b; 
	        this.c = c;
	    }
	//c)
	    public double getDiscriminante() {
	        return b * b - 4 * a * c;
	    }
	//d)
	    //metodo 1
	    public double getRaiz1() {
	        double D = getDiscriminante();
	        if (D > 0) {
	            return (-b + Math.sqrt(D)) / (2 * a);
	        } else if (D == 0) {
	            return (-b) / (2 * a); 
	        } else {
	            return 0; 
	        }
	    }
	    //metodo 2
	    public double getRaiz2() {
	        double D = getDiscriminante();
	        if (D > 0) {
	            return (-b - Math.sqrt(D)) / (2 * a);
	        } else {
	            return 0;
	        }
	    }
	}
