
public class MaxMin {

	public static int[] solution(int n, int m) {
        int[] answer = new int[2];
        
        int min = n;
        int max = m;
        
        if (n > m) {
        	max = n;
        	min = m;
        }
        
        for (int i = 1; i <= min; i++) {
			if(n%i == 0 && m%i == 0) {
				answer[0] = i;
			}
		}
        
        loop:
        for (int i = 1; i <= min; i++) {
        	for (int j = 1; j <= max; j++) {
        		if(max*i==min*j) {
        			answer[1] = max*i;
        			break loop;
        		}
			}
        }
        
        return answer;
    }
	
		
}
