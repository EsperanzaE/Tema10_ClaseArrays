package Arrays;

import java.util.Arrays;

import static java.util.Arrays.copyOf;

public class Main {
    public static int [] num1={1,4,8,12,45,0,7,32,62,78,18};
    public static void main(String[] args) {
        //Imprimo el array de enteros
        //1º recorriendolo
        //2º con el método Arrays.toString(array)
        Metodos.String(num1);

// incializo mi tabla a valor 99
        Arrays.fill(num1,99);
        System.out.println("inicializo mi tabla a valor 99");
        System.out.println(Arrays.toString(num1));

// incializo mi tabla a valor -5 desde las posiciones 1 a la 5
        Arrays.fill(num1,1,5,-5);
        System.out.println("incializo mi tabla a valor -5 desde las posiciones 1 a la 5");
        System.out.println(Arrays.toString(num1));

// comparo dos tablas con equals
        int[] num2 = {99, -5, -5, -5, -5, 99, 99, 99, 99, 99, 99};
        System.out.println("las tablas num1 y num2 son iguales? true or false?: "+ Arrays.equals(num2,num2));

// busco un valor en una tabla ordenada
        char[] char1 = {'a','b','c','d','e','f','g','i','j'};
        System.out.println("la letra 'e' se encuentra en la posición "+ Arrays.binarySearch(char1,'e'));
        System.out.println("la letra 'h' habría que insertarla en la posición "
                + (-Arrays.binarySearch(char1,'h')-1));

// busco un valor en la misma tabla pero entre un rango de índices
        System.out.println("la letra 'j' se encuentra en la posición "+
                Arrays.binarySearch(char1,5,9,'j'));

// Insertar la letra 'h' en la tabla char1
// voy a crear un nuevo array con posiciones libres y le copio el contenido de mi tabla de caracteres original
        char[] char2=new char[char1.length +10];//creacion del nuevo array
        char2= Arrays.copyOf(char1,char2.length); //copio el array char1 en char2

// Busco la posición que debería estar. hay que diferenciar si ya se encuentra o no
        int ultimaPosicion=char1.length-1;
        int indicePosicion= (Arrays.binarySearch(char1, 'a'));
            if (indicePosicion<0){
            indicePosicion= -(indicePosicion)-1;
        }
// Desplazo desde indice posición hasta el final los elementos una posición para hacer hueco
        for (int i = ultimaPosicion; i >=indicePosicion ; i--) {
            char2[ultimaPosicion+1]=char2[ultimaPosicion];
        }
        char2[indicePosicion]='h';

        System.out.println(Arrays.toString(char2));

    }
}
