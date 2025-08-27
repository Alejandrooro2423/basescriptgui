package Ejercicio3;

public class Estadistica {
    private final double[] datos;

    public Estadistica(double[] datos) {
        this.datos = datos;
    }

    public double promedio() {
        double suma = 0;
        for (double x : datos) suma += x;
        return suma / datos.length;
    }

    public double desviacion() {
        double prom = promedio();
        double acum = 0;
        for (double x : datos) acum += Math.pow(x - prom, 2);
        return Math.sqrt(acum / (datos.length - 1));
    }
}

