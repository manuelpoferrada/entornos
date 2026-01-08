package dam.ed;

public class Calculadora {

    double suma(double a, double b) {
        return a + b;
    }

    double resta(double minuendo, double sustraendo) {
        return minuendo - sustraendo;
    }

    double multiplica(double a, double b) {
        return Math.abs(a * b);
    }

    double divide(double dividendo, double divisor) throws Exception {
        if (divisor == 0) {
            throw new Exception("El divisor es 0");
        }
        return dividendo / divisor;
    }

    int factorial (int numero) {
        int resultado = 1;
        for (int i=1; i <= numero; i++) {
            resultado *= i;
        }
        return resultado;
    }

    boolean esPrimo (int numero) {
        boolean esNumeroPrimo = true;
        if (numero == 1){
            esNumeroPrimo = false;
        }else{
            for (int i = 2; i < numero && esNumeroPrimo; i++) {
                if (numero % i == 0) {
                    esNumeroPrimo = false;
                }
            }
        }
        return esNumeroPrimo;
    }

    public double raizCuadrada(double radicando) throws Exception {
        if (radicando < 0) {
            throw new Exception("El radicando no puede ser negativo");
        }

        if (radicando == 0) return 0;

        double x = radicando;
        double raiz = radicando;

        // Método de Newton
        for (int i = 0; i < 10; i++) {
            raiz = 0.5 * (raiz + x / raiz);
        }

        return raiz;
    }

}
