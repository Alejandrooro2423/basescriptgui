package Ejercicio3;

public class EstadisticaModu {
    public static double promedio(double[] datos) {
        double suma = 0;
        for (double x : datos) suma += x;
        return suma / datos.length;
    }

    public static double desviacion(double[] datos) {
        double prom = promedio(datos);
        double acum = 0;
        for (double x : datos) acum += Math.pow(x - prom, 2);
        return Math.sqrt(acum / (datos.length - 1));
    }

    public static void main(String[] args) {
        double[] v = {1.9, 2.5, 3.7, 2, 1, 6, 3, 4, 5, 2};
        double prom = promedio(v);
        double desv = desviacion(v);
        System.out.printf("El promedio es %.2f%n", prom);
        System.out.printf("La desviacion estandar es %.5f%n", desv);
    }
}
