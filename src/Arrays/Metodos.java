package Arrays;

import java.util.Arrays;

public class Metodos {
    /**
     * método para imprimir el array de dos formas distintas:
     * 1º recorriendolo
     * 2º con el método Arrays.toString(array)
     * @param num1 array de enteros creado en el main
     */

    public static void String(int [] num1) {
        System.out.println("lo recorro y muestro con un for each");
        for (int elemento: num1) {
            System.out.print(elemento+ " ");
        }
        System.out.println("");

        System.out.println("lo muestro con Arrays.toString(array)");
        System.out.println(Arrays.toString(num1));
    }
}
