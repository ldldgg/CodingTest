package onelevel.practice;

public class StringDownSort {

    public String solution(String s) {
        String answer = "";
        
        char[] arr = s.toCharArray();
        char temp = ' ';
        
        for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				if(arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
        
        for (int i = 0; i < arr.length; i++) {
			answer += arr[i];
		}
        
        
        
        return answer;
    }
	
}
