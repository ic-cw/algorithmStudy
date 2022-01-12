package com.algorithm.bakjoon.bronze;

import java.util.Scanner;

public class Bakjoon2920 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[8];
        for (int i = 0; i < 8; i++) {
            arr[i] = scanner.nextInt();
        }

        String result = "";
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] == arr[i] + 1) {
                result = "ascending";
            } else if (arr[i + 1] == arr[i] - 1) {
                result = "descending";
            } else {
                result = "mixed";
                break;
            }
        }
        System.out.println(result);
    }
    //complete
}
