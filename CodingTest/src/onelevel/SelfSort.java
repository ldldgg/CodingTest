package onelevel;

public class SelfSort {

	public String[] solution(String[] strings, int n) {
		String[] answer = new String[strings.length];
		int indexMin = 0;
		String temp = "";

		for (int i = 0; i < strings.length - 1; i++) {
			indexMin = i;
			for (int j = i + 1; j < strings.length; j++) {
				if (strings[j].charAt(n) < strings[indexMin].charAt(n)) {
					indexMin = j;
				} else if (strings[j].charAt(n) == strings[indexMin].charAt(n)) {
					for (int k = 0; k < strings[j].length(); k++) {
						if (strings[j].charAt(k) < strings[indexMin].charAt(k)) {
							indexMin = j;
						}
					}
				}
			}
			answer[i] = strings[indexMin];
			strings[indexMin] = strings[i];
			strings[i] = answer[i];
		}

		return answer;
	}

	public static void main(String[] args) {

		SelfSort se = new SelfSort();

		String[] ab = { "caa", "buc", "tae", "kob", "bad" };

		se.solution(ab, 2);
	}

}
