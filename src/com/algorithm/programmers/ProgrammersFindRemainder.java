package com.algorithm.programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProgrammersFindRemainder {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {-1};
        int count = 0;
        List<Integer> ans = new ArrayList<>();

        for (int j : arr) {
            if (j % divisor == 0) {
                ans.add(j);
                count++;
            }
        }
        if (count > 0) {
            answer= new int[ans.size()];
        }
        for (int i = 0; i < ans.size(); i++) {
            answer[i] = ans.get(i);
        }
        Arrays.sort(answer);
        return answer;
    }
}
