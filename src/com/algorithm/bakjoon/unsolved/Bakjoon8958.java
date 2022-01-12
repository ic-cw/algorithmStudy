package com.algorithm.bakjoon.unsolved;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

//미완성
//OX퀴즈
public class Bakjoon8958 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int numberOfTestCase = Integer.parseInt(st.nextToken());

        List<String> testCases = new ArrayList<>();
        for (int i = 0; i < numberOfTestCase; i++) {
            testCases.add(st.nextToken());
        }

    }
}
