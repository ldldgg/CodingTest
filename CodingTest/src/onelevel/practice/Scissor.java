package onelevel.practice;

public class Scissor {

	public String solution(String s, int n) {
		String answer = "";

		int temp = 0;

		for (int i = 0; i < s.length(); i++) {
			temp = s.charAt(i);

			if (temp >= 65 && temp <= 90) {
				temp += n;
				if (temp >= 91) {
					temp -= 26;
				}
			} else if (temp >= 97 && temp <= 122) {
				temp += n;
				if (temp >= 123) {
					temp -= 26;
				}
			}

			answer += (char) temp;
		}

		return answer;
	}
}
