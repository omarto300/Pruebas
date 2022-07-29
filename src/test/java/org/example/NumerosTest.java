package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumerosTest {

    @Test
    @DisplayName("Obtener el calificativo para el arreglo(PAR O IMPAR) y retornar numero que no pertenezca a")
    void calificaArreglo() {
        int[] numerosPares = new int[]{7,2, 4, 6, 8, 10};
        int[] numerosImpares = new int[]{6,1, 3, 5, 7, 9};
        assertEquals("PAR,7", Numeros.calificaArreglo(numerosPares));
        assertEquals("IMPAR,6", Numeros.calificaArreglo(numerosImpares));
    }

    @Test
    @DisplayName("Ordenar en desendente los numeros impares y dejar los pares en su posicion original")
    void ordenaArreglo() {
        assertArrayEquals(new int[]{1, 3, 2, 8, 5, 4}, Numeros.ordenaArreglo(new int[]{5, 3, 2, 8, 1, 4}));
        assertArrayEquals(new int[]{1, 3, 5, 8, 0}, Numeros.ordenaArreglo(new int[]{5, 3, 1, 8, 0}));
        assertArrayEquals(new int[]{}, Numeros.ordenaArreglo(new int[]{}));
    }
}