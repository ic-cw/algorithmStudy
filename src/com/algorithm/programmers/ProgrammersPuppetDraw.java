package com.algorithm.programmers;

import java.util.ArrayList;
import java.util.List;

public class ProgrammersPuppetDraw {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        int boardSize = board.length;
        int craneLocation = 0;
        List<Integer> dollBox = new ArrayList<>();
        //인형 뽑아서 dollBox에 담기
        for (int i = 0; i < moves.length; i++) {
            craneLocation = moves[i];
            for (int j = 0; j < boardSize; j++) {
                if (board[boardSize - 1][craneLocation] == 0){
                    break;
                }
                if (board[j][craneLocation] != 0){
                    dollBox.add(board[j][i]);
                    break;
                }
            }
        }
        //dollBox에서 아래부터 터뜨리기
        answer = getAnswer(answer, dollBox);
        return answer;
    }

    private int getAnswer(int answer, List<Integer> dollBox) {
        for (int i : dollBox){
            if (dollBox.get(i).equals(dollBox.get(i+1))){
                dollBox.remove(i+1);
                dollBox.remove(i);
                answer++;
                getAnswer(answer, dollBox);
            } else {
                break;
            }
        }
        return answer;
    }
}
