package Ejercicio3;

class main {
    public static void main(String[] args) {
        double[] v = {1.9, 2.5, 3.7, 2, 1, 6, 3, 4, 5, 2};

        Estadistica est = new Estadistica(v);

        System.out.printf("El promedio es %.2f%n", est.promedio());
        System.out.printf("La desviacion estandar es %.5f%n", est.desviacion());
    }
}
