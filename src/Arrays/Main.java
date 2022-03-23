package Arrays;

import java.util.Arrays;
// ejemplos para ilustrar el documento Unidad 10. Clase Arrays (Anexo)

import static java.util.Arrays.copyOf;
import static java.util.Arrays.sort;

public class Main {
    public static int [] num1={1,4,8,12,45,0,7,32,62,78,18};
    public static void main(String[] args) {
        //Imprimo el array de enteros
        //1º recorriendolo
        //2º con el método Arrays.toString(array)
        Metodos.String(num1);
        System.out.println();

// incializo mi tabla a valor 99
        Arrays.fill(num1,99);
        System.out.println("inicializo mi tabla a valor 99");
        System.out.println(Arrays.toString(num1));
        System.out.println();

// incializo mi tabla a valor -5 desde las posiciones 1 a la 5
        Arrays.fill(num1,1,5,-5);
        System.out.println("incializo mi tabla a valor -5 desde las posiciones 1 a la 5");
        System.out.println(Arrays.toString(num1));
        System.out.println();

// comparo dos tablas con equals
        int[] num2 = {99, -5, -5, -5, -5, 99, 99, 99, 99, 99, 99};
        System.out.println("las tablas num1 y num2 son iguales? true or false?: "+ Arrays.equals(num2,num2));
        System.out.println();

// busco un valor en una tabla ordenada
        char[] char1 = {'b','c','d','e','f','g','i','j'};
        System.out.println("la letra 'e' se encuentra en la posición "+ Arrays.binarySearch(char1,'e'));
        System.out.println("la letra 'h' habría que insertarla en la posición "
                + (-Arrays.binarySearch(char1,'h')-1));

// busco un valor en la misma tabla pero entre un rango de índices
        System.out.println("la letra 'j' se encuentra en la posición "+
                Arrays.binarySearch(char1,5,8,'j'));

// Insertar la letra 'h' en la tabla char1
// voy a crear un nuevo array con posiciones libres y le copio el contenido de mi tabla de caracteres original
        char[] char2=new char[char1.length +10];//creacion del nuevo array
        char2= Arrays.copyOf(char1,char2.length); //copio el array char1 en char2
        Arrays.fill(char2,char1.length, char2.length, '~');
        System.out.println("\nen este array voy a insertar la letra a");
        System.out.println(Arrays.toString(char2));

// Busco la posición que debería estar. hay que diferenciar si ya se encuentra o no
        int ultimaPosicion=char1.length-1;
        int indicePosicion= (Arrays.binarySearch(char1, 'a'));
            if (indicePosicion<0){
            indicePosicion= -(indicePosicion)-1;
        }
        System.out.println("el índice donde debería insertar es en "+ indicePosicion);
// Desplazo desde indice posición hasta el final los elementos una posición para hacer hueco
        for (int i = ultimaPosicion; i >=indicePosicion ; i--) {
            char2[i+1]=char2[i];
        }
        char2[indicePosicion]='a';
        ultimaPosicion++;
        System.out.println("la tabla con la a insertada queda así:");
        System.out.println(Arrays.toString(char2));

// Borramos la letra b de la tabla
//empezamos buscando la posición de la letra letra
    indicePosicion= Arrays.binarySearch(char2,'b');
    if (indicePosicion>=0){
        System.out.println("\nvoy a borrar la letra b, su posición es "+ indicePosicion);

        for (int i = indicePosicion; i <ultimaPosicion ; i++) {
            char2[i]=char2[i+1];
        }
        char2[ultimaPosicion]='~';
        ultimaPosicion--;
        System.out.println("\nla tabla con la b borrada queda así:");
        System.out.println(Arrays.toString(char2));

    }

    }
}
