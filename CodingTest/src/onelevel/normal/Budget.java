package onelevel.normal;

public class Budget {

    public int solution(int[] d, int budget) {
        int answer = 0;
        
        int temp = 0;
        int min = 0;
        
        
        for (int i = 0; i < d.length-1; i++) {
			min = i;
			for (int j = i+1; j < d.length; j++) {
				if(d[min] > d[j]) {
					min = j;
				}
			}
			
			temp = d[min];
			d[min] = d[i];
			d[i] = temp;
			
		}
        
        int sum = 0;
        
        for (int i = 0; i < d.length; i++) {
			
        	if(sum+d[i] <= budget) {
        		sum = sum + d[i];
        		answer++;
        	} else {
        		break;
        	}
		}
        
        
        return answer;
    }
}
