package onelevel;

public class FineKim {
	
    public String solution(String[] seoul) {
    	
        String answer = "";
        
        int place = 0;
        
        for (int i = 0; i < seoul.length; i++) {
			if (seoul[i].equals("Kim")) {
				place = i;
			}
		}
        
        answer = "김서방은 " + place + "에 있다";
        
        
        
        return answer;
    }
	
}
