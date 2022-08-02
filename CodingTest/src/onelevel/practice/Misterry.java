package onelevel.practice;

public class Misterry {
	public String solution(String s) {
		String answer = "";
		String[] word = s.split(" ", -1);

		int temp = 0;

		for (int i = 0; i < word.length; i++) {
			for (int j = 0; j < word[i].length(); j++) {
				temp = word[i].charAt(j);

				if (j % 2 == 0) {
					if (temp >= 65 && temp <= 95) {
						answer += (char) temp;
					} else if (temp >= 97 && temp <= 127) {
						answer += (char) (temp - 32);
					}
				} else {
					if (temp >= 65 && temp <= 95) {
						answer += (char) (temp + 32);
					} else if (temp >= 97 && temp <= 127)
						answer += (char) temp;
				}
			}
			if (i < word.length - 1) {
				answer += " ";
			}
		}
		System.out.println(answer);

		return answer;
	}

	public static void main(String[] args) {
		Misterry m = new Misterry();

		m.solution("abcdefghijklmnopqrstuvwxyz AABCDEFGHIJKLMNOPQRSTUVWXYZ");

	}

}
