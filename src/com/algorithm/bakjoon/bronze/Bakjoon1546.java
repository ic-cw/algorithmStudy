package com.algorithm.bakjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bakjoon1546 {
    //평균
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int subjects = Integer.parseInt(bufferedReader.readLine());
        int[] scores = new int[subjects];
        String scoresInString = bufferedReader.readLine();

        //향상된 포문에서 인덱스 주는 법
        int index = 0;
        for (String s: scoresInString.split(" ")) {
            scores[index] = Integer.parseInt(s);
            index++;
        }

        int maxScore = 0;
        for (int score: scores) {
            if (score >= maxScore){
                maxScore = score;
            }
        }

        //소숫점 있는 숫자를 다룰 때 double과 float중에선 double을 사용하자...
        double sumTotal = 0.0000;
        for (int i = 0; i < subjects; i++) {
            sumTotal += (double) scores[i] * 100 / maxScore;
        }
        double averageSum = sumTotal / (double) subjects;
        System.out.println(averageSum);
    }
    //complete
}
