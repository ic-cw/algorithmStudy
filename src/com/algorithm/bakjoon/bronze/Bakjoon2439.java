package com.algorithm.bakjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bakjoon2439 {
    //별찍기2
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());

        int index = count;
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < index - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i + 1; k++) {
                System.out.print("*");
            }
            System.out.print("\n");
            index--;
        }
    }
    //complete
}
