package onelevel.practice;

public class StringToNum {

	public int solution(String s) {
		int answer = 0;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
				answer += Math.pow(10, s.length() - i - 1) * (s.charAt(i) - '0');
			}
		}
		if (s.charAt(0) == '-') {
			answer = answer * -1;
		}
		return answer;
	}

}
