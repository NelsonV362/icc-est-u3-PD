public class App {
    public static void main(String[] args) throws Exception {
        runEjerciciosPD();
    }

    private static void runEjerciciosPD() {
        EjerciciosPD ejerciciosPD = new EjerciciosPD();
        int n = 100; 

        System.out.println("Fibonacci Recursivo Puro:");
        long startRecursivo = System.currentTimeMillis();
        long resultadoRecursivo = ejerciciosPD.getFibonacciRecursivo(n);
        long endRecursivo = System.currentTimeMillis();
        long duracionRecursivo = endRecursivo - startRecursivo;
        System.out.println("Resultado = " + resultadoRecursivo + " en tiempo = " + duracionRecursivo + " ms\n");

        System.out.println("Fibonacci Recursivo con Caching:");
        long startCaching = System.currentTimeMillis();
        long resultadoCaching = ejerciciosPD.getFibonacciRecursivoCaching(n);
        long endCaching = System.currentTimeMillis();
        long duracionCaching = endCaching - startCaching;
        System.out.println("Resultado = " + resultadoCaching + " en tiempo = " + duracionCaching + " ms");
    }
}
