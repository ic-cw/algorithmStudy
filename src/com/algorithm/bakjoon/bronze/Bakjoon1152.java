package com.algorithm.bakjoon.bronze;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Bakjoon1152 {
    //단어의 갯수
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String words = scanner.nextLine();
        StringTokenizer st = new StringTokenizer(words, " ");
        scanner.close();
        System.out.println(st.countTokens());
    }
    //StringTokenizer과 countTokens()메서드 사용
    //complete
}
