package onelevel.kakao;

import java.util.ArrayList;

public class ClawMachineGame {
	
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        ArrayList<Integer> basket = new ArrayList<Integer>();
        
        for (int i = 0; i < moves.length; i++) {
        	
        	for (int j = 0; j < board.length; j++) {
        		if(board[j][moves[i]-1] > 0) {
        			
        			if(basket.isEmpty()) {
        				basket.add(board[j][moves[i]-1]);
        				board[j][moves[i]-1] = 0;
        				break;
        			}
        			
        			if(basket.get(basket.size()-1) != board[j][moves[i]-1]){
        				basket.add(board[j][moves[i]-1]);
        				board[j][moves[i]-1] = 0;
        				break;
        			}else {
        				basket.remove(basket.size()-1);
        				board[j][moves[i]-1] = 0;
        				answer += 2;
        				break;
        			}
        		}
			}
        	
		}
        
        return answer;
    }
	
}
