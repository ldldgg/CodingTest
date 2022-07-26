package onelevel;

public class Scissor {

	public String solution(String s, int n) {
        String answer = "";
        
        int temp = 0;
        
        
        for (int i= 0; i < s.length(); i++) {
        	temp = s.charAt(i);
        	
        	if(temp == 32) {
        		
        	}
        	if(temp >= 65 && temp <=94) {
        		temp += n;
        	}
        	
        	
        	
		}
        
        
        
        return answer;
    }
}
