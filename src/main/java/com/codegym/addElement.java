package com.codegym;

import java.util.Scanner;

public class addElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        int size;
        do {
            System.out.println("Enter size: ");
            size = scanner.nextInt();
            if (size >= array.length) {
                System.out.println("size wrong. You Enter size!!!");
            }
        } while (size >= array.length);

        for (int i = 0; i < size; i++) {
            System.out.println("Enter Element " + (i + 1) + " is:");
            array[i] = scanner.nextInt();
        }
        System.out.print("Array is: ");
        for (int element : array) {
            System.out.print(element + "\t");
        }
        System.out.println(" ");
        int index;
        int value;
        System.out.println("Enter position you want add into array");
        index = scanner.nextInt();
        System.out.println("Enter element value you want add into array");
        value = scanner.nextInt();
        for (int i = size; i >= index; i--) {
            array[i] = array[i - 1];
        }
        array[index - 1] = value;

        System.out.print("Array new is: ");
        for (int element : array) {
            System.out.print(element + "\t");
        }
    }

}
