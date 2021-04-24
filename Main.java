package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int Numbers[] = new int[5];

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter any 5 numbers.");

        for(int i = 0; i < Numbers.length; i++){

            Numbers[i] = scanner.nextInt();

        }

        Arrays.sort(Numbers);

        for(int i = 0; i < Numbers.length; i++){

            System.out.println(Numbers[i]);

        }

        System.out.println("The End");

    }
}

