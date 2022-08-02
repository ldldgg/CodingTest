package onelevel.normal;

public class RestOne {

    public int solution(int n) {
        int answer = n;
        
        for (int i = n-1; i > 0 ; i--) {
        	
			if(n % i == 1 && answer > i) {
				answer = i;
			}
		}
        
        
        return answer;
    }
	
	
}
