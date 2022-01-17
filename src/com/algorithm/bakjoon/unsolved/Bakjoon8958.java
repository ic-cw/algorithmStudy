package com.algorithm.bakjoon.unsolved;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

//OX퀴즈
public class Bakjoon8958 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numberOfTestCase = Integer.parseInt(br.readLine());

        List<String> testCases = new ArrayList<>();
        for (int i = 0; i < numberOfTestCase; i++) {
            testCases.add(br.readLine());
        }

        for(String a : testCases){
            int point = 0;
            int sum = 0;
            String[] chars = a.split("");
            for (String b : chars) {
                if ("O".equals(b)) {
                    point++;
                } else {
                    point = 0;
                }
                sum += point;
            }
            System.out.println(sum);
        }
    }
}
//complete
