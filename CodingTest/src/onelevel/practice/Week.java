package onelevel.practice;

public class Week {

	
    public String solution(int a, int b) {
        String answer = "";
        
        int month = 0 ;
        
        if(a == 2) {
        	month = 31;
        }else if(a == 3) {
        	month = 60;
        }else if(a == 4) {
        	month = 91;
        }else if(a == 5) {
        	month = 121;
        }else if(a == 6) {
        	month = 152;
        }else if(a == 7) {
        	month = 182;
        }else if(a == 8) {
        	month = 213;
        }else if(a == 9) {
        	month = 244;
        }else if(a == 10) {
        	month = 274;
        }else if(a == 11) {
        	month = 305;
        }else if(a == 12) {
        	month = 335;
        }
        
        int day = month + b;
        
        if(day%7 == 0) {
        	answer = "THU";
        }else if(day%7 == 1) {
        	answer = "FRI";
        }else if(day%7 == 2) {
        	answer = "SAT";
        }else if(day%7 == 3) {
        	answer = "SUN";
        }else if(day%7 == 4) {
        	answer = "MON";
        }else if(day%7 == 5) {
        	answer = "TUE";
        }else if(day%7 == 6) {
        	answer = "WED";
        }
        
        
        return answer;
    }
	
	
}
