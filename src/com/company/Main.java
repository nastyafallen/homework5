package com.company;

public class Main {

    public static void main(String[] args) {
        // Задание 1
        int[] massiveOne = new int[]{1, 2, 3};

        double[] massiveTwo = {1.57, 7.654, 9.986};

        char[] massiveThree = {'п', 'р', 'и', 'в', 'е', 'т'};

        // Задание 2
        for (int i = 0; i < massiveOne.length; i++) {
            if (i == massiveOne.length - 1) {
                System.out.print(massiveOne[i]);
            } else {
                System.out.print(massiveOne[i] + ", ");
            }
        }
        System.out.println();
        for (int a = 0; a < massiveTwo.length; a++) {
            if (a == massiveTwo.length - 1) {
                System.out.print(massiveTwo[a]);
            } else {
                System.out.print(massiveTwo[a] + ", ");
            }
        }
        System.out.println();
        for (int c = 0; c < massiveThree.length; c++) {
            if (c == massiveThree.length - 1) {
                System.out.print(massiveThree[c]);
            } else {
                System.out.print(massiveThree[c] + ", ");
            }
        }
        System.out.println();

        // Задание 3
        for (int i = massiveOne.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(massiveOne[i]);
            } else {
                System.out.print(massiveOne[i] + ", ");
            }
        }
        System.out.println();
        for (int a = massiveTwo.length - 1; a >= 0; a--) {
            if (a == 0) {
                System.out.print(massiveTwo[a]);
            } else {
                System.out.print(massiveTwo[a] + ", ");
            }
        }
        System.out.println();
        for (int c = massiveThree.length - 1; c >= 0; c--) {
            if (c == 0) {
                System.out.print(massiveThree[c]);
            } else {
                System.out.print(massiveThree[c] + ", ");
            }
        }
        System.out.println();

        // Задание 4
        for (int i = 0; i < massiveOne.length; i++) {
            if (massiveOne[i] % 2 != 0) {
                massiveOne[i] = massiveOne[i] + 1;
            } else if (massiveOne[i] % 2 == 0) {
                massiveOne[i] = massiveOne[i];
            }
            System.out.print(massiveOne[i] + ", ");
        }
    }
}
