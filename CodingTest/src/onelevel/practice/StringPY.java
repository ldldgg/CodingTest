package onelevel.practice;

public class StringPY {

    boolean solution(String s) {
        boolean answer = true;
        char c = ' ';
        
        int pCount = 0;
        int yCount = 0;
        
        for (int i = 0; i < s.length(); i++) {
        	c = s.charAt(i);
        	if(c <= 'Z') {
        		c = (char)(c + 32);
        	}
			if(c == 'p') {
				pCount++;
			}else if(c == 'y') {
				yCount++;
			}
		}
        
        if(pCount != yCount) {
        	answer = false;
        }

        return answer;
    }
}
