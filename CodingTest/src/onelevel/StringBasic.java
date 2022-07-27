package onelevel;

public class StringBasic {

	public boolean solution(String s) {
		boolean answer = true;
		int[] word = new int[s.length()];

		
		
		for (int i = 0; i < word.length; i++) {
			word[i] = s.charAt(i);
		}

		for (int i = 0; i < word.length; i++) {
			if (word[i] < 48 || word[i] > 57) {
				answer = false;
				break;
			}
		}
		
		if(s.length() != 4 && s.length() != 6) {
			answer =false;
		}
		

		return answer;
	}
	
	
	
	public static void main(String[] args) {
		
		StringBasic st = new StringBasic();
		
		System.out.println(st.solution("14141541"));
		
		
		
	}
	
}
