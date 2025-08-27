package Ejercicio1;

import java.util.Scanner;
public class Ecuacion_2x2 {
	// a)
	private double a;
	private double b;
	private double c;
	private double d;
	private double e;
	private double f;
	
	// b)
	public Ecuacion_2x2(double a, double b, double c,double d, double e, double f) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
		this.f = f;
	}
	
	// c)
	public boolean tieneSolucion() {
	    if ((a * d - b * c) != 0) {
	        return true;
	    } else {
	        return false;
	    }
	}
	public double getX() {
	    double determinante = a * d - b * c;
	    if (determinante == 0) {
	        System.out.println("No se puede calcular X");
	        return 0;
	    }
	    return (e * d - b * f) / determinante;
	}

	public double getY() {
	    double determinante = a * d - b * c;
	    if (determinante == 0) {
	        System.out.println("No se puede calcular Y");
	        return 0;
	    }
	    return (a * f - e * c) / determinante;
	}


}
