package onelevel.normal;

public class PlusMinusSum {

	  public int solution(int[] absolutes, boolean[] signs) {
	        int answer = 0;
	        
	        for (int i = 0; i < signs.length; i++) {
				
	        	if(signs[i]) {
	        		answer += absolutes[i];
	        	}else {
	        		if(answer > absolutes[i]) {
	        			answer -= absolutes[i];
	        		}
	        	}
	        	
			}
	     
	        return answer;
	    }

}
