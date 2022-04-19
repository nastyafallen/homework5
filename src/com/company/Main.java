package com.company;

public class Main {

    public static void main(String[] args) {
	// Задание 1
        int[] massiveOne = new int[] {1, 2, 3};

        double[] massiveTwo = {1.57, 7.654, 9.986};

        char[] massiveThree = {'п', 'р', 'и', 'в', 'е', 'т'};

        // Задание 2
        System.out.println(massiveOne[0] + ", " + massiveOne[1] + ", " + massiveOne[2]);
        System.out.println(massiveTwo[0] + ", " + massiveTwo[1] + ", " + massiveTwo[2]);
        System.out.println(massiveThree[0] + ", " + massiveThree[1] + ", " + massiveThree[2] + ", " + massiveThree[3] + ", " + massiveThree[4] + ", " + massiveThree[5] + "!");

        // Задание 3
        System.out.println(massiveOne[2] + ", " + massiveOne[1] + ", " + massiveOne[0]);
        System.out.println(massiveTwo[2] + ", " + massiveTwo[1] + ", " + massiveTwo[0]);
        System.out.println(massiveThree[5] + ", " + massiveThree[4] + ", " + massiveThree[3] + ", " + massiveThree[2] + ", " + massiveThree[1] + ", " + massiveThree[0]);

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
