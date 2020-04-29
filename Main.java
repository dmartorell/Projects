package com.codewithmosh;

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