package dam.ed;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CalculadoraTest {

    // Definimos el objeto para usarlo en todos los tests
    static Calculadora miCalculadora;

    @BeforeAll
    public static void setUpClass() {
        miCalculadora = new Calculadora();
    }

    @Test
    @DisplayName("Divisiones enteras y reales")
    void testDivisionesEnterasYReales() throws Exception {
        assertEquals(2, miCalculadora.divide(8, 4));
        assertEquals(2.5, miCalculadora.divide(10, 4));
        assertEquals(4, miCalculadora.divide(10, 2.5));
        assertEquals(3.2, miCalculadora.divide(8, 2.5));
        assertEquals(0.5, miCalculadora.divide(2, 4));
    }

    @Test
    @DisplayName("Divisiones positivos y negativos")
    void testDivisionesPositivosYNegativos() throws Exception {
        assertTrue(miCalculadora.divide(4, 2) > 0);
        assertTrue(miCalculadora.divide(4, -2) < 0);
        assertTrue(miCalculadora.divide(-4, 2) < 0);
        assertTrue(miCalculadora.divide(-4, -2) > 0);
    }

    @Test
    @DisplayName("División por cero causa excepción")
    void testDivisionPorCero() {
        Exception thrown = assertThrows(Exception.class, () -> {
            miCalculadora.divide(5, 0);
        });

        assertEquals("El divisor es 0", thrown.getMessage());
    }


    //----------SUMA------------
    @Test
    @DisplayName("Pruebas de la suma")
    void testSuma() {
        assertEquals(5, miCalculadora.suma(2, 3));
        assertEquals(3, miCalculadora.suma(-4, 7));
        assertEquals(-8, miCalculadora.suma(-5, -3));
        assertEquals(9, miCalculadora.suma(0, 9));
    }
    //---------RESTA-----------
    @Test
    @DisplayName("Pruebas de la resta")
    void testResta() {
        assertEquals(5, miCalculadora.resta(8, 3));
        assertEquals(-6, miCalculadora.resta(4, 10));
        assertEquals(-3, miCalculadora.resta(-5, -2));
        assertEquals(7, miCalculadora.resta(7, 0));
    }
    //---------MULTIPLICACIÓN-----------
    @Test
    @DisplayName("Pruebas de multiplicacion")
    void testMultiplica() {
        assertEquals(12, miCalculadora.multiplica(3, 4));
        assertEquals(12, miCalculadora.multiplica(-3, 4));
        assertEquals(10, miCalculadora.multiplica(-5, -2));
        assertEquals(0, miCalculadora.multiplica(0, 9));
    }
    //---------ES PRIMO-----------
    @Test
    @DisplayName("Pruebas de números primos")
    void testEsPrimo() {
        assertTrue(miCalculadora.esPrimo(2));
        assertTrue(miCalculadora.esPrimo(7));
        assertFalse(miCalculadora.esPrimo(8));
        assertFalse(miCalculadora.esPrimo(1));
    }
    //---------FACTORIAL-----------
    @Test
    @DisplayName("Pruebas de factorial")
    void testFactorial() {
        assertEquals(1, miCalculadora.factorial(0));
        assertEquals(1, miCalculadora.factorial(1));
        assertEquals(120, miCalculadora.factorial(5));
        assertEquals(720, miCalculadora.factorial(6));
    }

    //---------RAÍZ CUADRADA-----------
    @Test
    @DisplayName("Pruebas de la raíz cuadrada")
    void testRaizCuadrada() throws Exception {
        // Casos normales
        assertEquals(1, miCalculadora.raizCuadrada(1));
        assertEquals(0, miCalculadora.raizCuadrada(0));
        assertEquals(2, miCalculadora.raizCuadrada(4));
    }

    //---------RAÍZ CUADRADA NEGATIVA-----------
    @Test
    @DisplayName("Raíz cuadrada en caso de que sea negativa")
    void testExcepcionRaizNegativa() {

        Exception thrown = assertThrows(Exception.class, () -> {
            miCalculadora.raizCuadrada(-5); // Código a testear
        });

        assertEquals("El radicando no puede ser negativo", thrown.getMessage());
    }

}
