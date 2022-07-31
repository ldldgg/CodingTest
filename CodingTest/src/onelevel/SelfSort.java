package onelevel;

public class SelfSort {

	public String[] solution(String[] strings, int n) {

		String[] answer = new String[strings.length];

		int indexMin = 0;

		for (int i = 0; i < strings.length; i++) {

			indexMin = i;

			for (int j = i + 1; j < strings.length; j++) {

				if (strings[j].charAt(n) < strings[indexMin].charAt(n)) {
					indexMin = j;

				}

			}

			answer[i] = strings[indexMin];
			strings[indexMin] = strings[i];
			strings[i] = answer[i];

		}

		String tempStr = "";

		for (int i = 0; i < answer.length - 1; i++) {
			for (int j = i + 1; j < answer.length; j++) {
				if (answer[i].charAt(n) == answer[j].charAt(n)) {

					for (int k = 0; k < answer[i].length(); k++) {

						if (answer[i].charAt(k) > answer[j].charAt(k)) {
							tempStr = answer[i];
							answer[i] = answer[j];
							answer[j] = tempStr;
							break;
						} else if (answer[i].charAt(k) == answer[j].charAt(k)) {
							continue;
						} else {
							break;
						}

					}
				}
			}

		}

		return answer;
	}

}
