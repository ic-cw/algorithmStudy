package com.algorithm.bakjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bakjoon1157 {
    //단어공부
    //알아야할 것이 많아서 어려운 문제;;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[26]; //영문자는 26개임
        String s = br.readLine();

        for (int i = 0; i < s.length(); i++) {
            if ('a' <= s.charAt(i) && s.charAt(i) <= 'z') {  //영대소문자의 char범위 설정
                arr[s.charAt(i) - 97]++;
                //영소문자의 범위는 십진수로 97 ~ 122이다.
                //알파벳 순서에 해당하는 인덱스의 값 1증가
            } else {
                arr[s.charAt(i) - 65]++;
                //영대문자의 범위는 십진수로 65 ~ 90이다
            }
        }

        //최댓값을 저장할 변수
        int max = -1;

        //출력할 문자 변수
        char ch = '?';
        for (int i = 0; i < 26; i++) {
            if (arr[i] > max) {
                max = arr[i];
                ch = (char) (i + 65);
                //대문자로 출력하기위해 65를 더함
            }
            else if (arr[i] == max){
                ch = '?';
            }
        }
        System.out.println(ch);
        //complete
    }
}
