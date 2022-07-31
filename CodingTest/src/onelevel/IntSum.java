package onelevel;

public class IntSum {

	
    public long solution(int a, int b) {
        long answer = 0;
        
        int maxNum = 0;
    	int minNum = 0;
        
        if(a >= b) {
        	maxNum = a;
        	minNum = b;
        } else {
        	maxNum = b;
        	minNum = a;
        }
        
        for (int i = minNum; i <= maxNum; i++) {
			answer += i;
		}
        
        return answer;
    }
    
}
