package com.algorithm.bakjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bakjoon2476 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String validateNumber = br.readLine();
        int[] numbers = new int[5];

        int index = 0;
        for (String s:validateNumber.split(" ")) {
            numbers[index] = Integer.parseInt(s);
            index++;
        }

        int sumSquare = 0;
        for (int i:numbers) {
            sumSquare += i*i;
        }
        int answer = sumSquare % 10;
        System.out.println(answer);
    }
    //complete
}
