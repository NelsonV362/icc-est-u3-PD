import controllers.*;

public class App {
    public static void main(String[] args) throws Exception {
        runMaze();
        runEjerciciosPD();
    }

    private static void runMaze(){
    boolean[][] predefinedMaze = {
        {true,true,true,true},
        {false,true,true,true},
        {true,true,false,false},
        {true,true,true,true},
    };

    Maze maze = new Maze(predefinedMaze);
    maze.printMaze(); 
}

    private static void runEjerciciosPD() {
        EjerciciosPD ejerciciosPD = new EjerciciosPD();
        int n = 10; 

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
