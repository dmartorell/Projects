
import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        ArrayTarget arr = new ArrayTarget();
        arr.askInput();
        arr.search(50);

    }
    public static class ArrayTarget {
        private int[] array;

        private void askInput() {
            Scanner input = new Scanner(System.in);
            System.out.print("Número de elementos a analizar: ");
            int elementos = input.nextInt();
            int[] listaTarget;
            listaTarget = new int[elementos];
            int x = 1;
            for (int i = 0; i < elementos; i++) {
                System.out.print("Elemento " + x + ":  ");
                int inputNumero = input.nextInt();
                listaTarget[i] = inputNumero;
                x++;
            }
            this.array = listaTarget;
        }

        private void search(int target) {

            ArrayList<String> listaIndex = new ArrayList<>();
            for (int i = 0; i < array.length; i++) {
                if (array[i] == target) {
                    String iString = Integer.toString(i);
                    listaIndex.add(iString);
                }

            }
            boolean b = (listaIndex.isEmpty());
            if (b) {
                System.out.println("El número " + target + " no está en la lista");
            } else System.out.println("El número " + target + " está localizado en los siguientes índices: " + listaIndex);

        }

    }
}

// programa 99 Bottles con método recursivo


public class Main {

    public static void printSongFinal () {
        System.out.println("No bottles of beer on the wall,");
        System.out.println("no bottles of beer,");
        System.out.println("ya’ can’t take one down, ya’ can’t pass it around,");
        System.out.println("’cause there are no more bottles of beer on the wall!");
        return;

    }

    public static void printSong (int numPrint) {
        System.out.println(numPrint + " bottles of beer on the wall,");
        System.out.println(numPrint + " bottles of beer,");
        System.out.println("ya’ take one down, ya’ pass it around,");
        System.out.println(numPrint - 1 + " bottles of beer on the wall.");
        System.out.println();
    }

    public static void doMath (int numBottles) {
        if (numBottles == 0) {
            printSongFinal();
            return;
        }
        printSong(numBottles);
        doMath(numBottles - 1);
    }
        public static void main(String[] args) {
        doMath(3);

    }

}


import java.util.Random;
import java.util.Scanner;

public class Main {

    /* Número al azar. El usuario hace su apuesta. Decir si está por encima o por debajo
    y volver a hacer apuesta */

    public static void calculoApuesta (int randomNumber) {
        // Input del usuario

        Scanner input = new Scanner(System.in);
        System.out.print("¿Cuál es tu apuesta? ");
        int apuesta = input.nextInt();
        System.out.println(apuesta);
        if (apuesta > 10 || apuesta == 0) {
            System.out.println("Número del 1 al 10, please.");
            calculoApuesta(randomNumber);
        }

            // recursivo

        if (apuesta == randomNumber) {
            System.out.println("Has acertado, capo!");
            return;
        } else if (apuesta > randomNumber) {
            System.out.println("Te has pasado.");
            calculoApuesta(randomNumber);
            } else if (apuesta < randomNumber) {
                System.out.println("Demasiado bajo. Afina, figura!");
                calculoApuesta(randomNumber);
            }

    }

        public static void main (String[]args){
            // Generar int random entre 1-10.
            Random random = new Random();
            int randomNumber = random.nextInt(10) + 1;

            calculoApuesta(randomNumber);

        }
    }


//
