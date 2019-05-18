package com.sda.algorytmy;

import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a1 = scanner.nextInt();
        int d = scanner.nextInt();
        int n = scanner.nextInt();


        for (int i = 2 ; i <= n; i++){
            System.out.println(a1 + (i-1) * d);
        }

    }
}
