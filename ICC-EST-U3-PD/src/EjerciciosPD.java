import java.util.HashMap;
import java.util.Map;

public class EjerciciosPD {
    public long getFibonacciRecursivo(int n) {
        if (n <= 1) {
            return n;
        }
        return getFibonacciRecursivo(n - 1) + getFibonacciRecursivo(n - 2);
    }
    private Map<Integer, Long> cache = new HashMap<>();
    public long getFibonacciRecursivoCaching(int n) {
        if (n <= 1) {
            return n;
        }
        if (cache.containsKey(n)) {
            return cache.get(n);
        }
        long resultado = getFibonacciRecursivoCaching(n - 1) + getFibonacciRecursivoCaching(n - 2);
        cache.put(n, resultado);
        return resultado;
    }
}
