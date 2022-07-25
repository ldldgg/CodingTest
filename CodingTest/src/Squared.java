
public class Squared {

    public long solution(long n) {
        long answer = 0;
        double x = (int)(Math.sqrt(n)*10)/10.0;
        
        if(n%x == 0) {
        	answer = (long)((x+1) * (x+1));
        } else {
        	answer = -1;
        }
        
        return answer;
    }
	
}
