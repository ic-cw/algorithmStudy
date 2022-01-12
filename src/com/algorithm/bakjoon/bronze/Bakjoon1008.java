package com.algorithm.bakjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bakjoon1008 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Double a = Double.parseDouble(st.nextToken());
        Double b = Double.parseDouble(st.nextToken());
        System.out.println(a / b);
        //complete
    }
}
