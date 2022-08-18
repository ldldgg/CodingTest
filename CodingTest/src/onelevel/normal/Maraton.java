package onelevel.normal;

import java.util.HashMap;

public class Maraton {

	public String solution1(String[] participant, String[] completion) { // 속도가 느림
		String answer = "";

		int count = 0;
		int le = participant.length;

		for (int i = 0; i < le; i++) {
			count = 1;

			if (participant[i].equals("")) {
				continue;
			}

			for (int j = i + 1; j < (le * 2) - 1; j++) {

				if (j < le) {
					if (participant[i].equals(participant[j])) {
						count++;
						participant[j] = "";
					}
				} else if (j >= le) {
					if (participant[i].equals(completion[j - le])) {
						count++;
					}
				}

			}

			if (count % 2 == 1) {
				answer = participant[i];
				break;
			}

		}

		return answer;
	}

	public String solution3(String[] participant, String[] completion) { // 해시 맵 사용

		String answer = "";
		HashMap<String, Integer> answerMap = new HashMap<>();
		for (int i = 0; i < participant.length; i++) {
			String name = participant[i];
			if (answerMap.containsKey(name)) {
				int count = (int) answerMap.get(name);
				answerMap.put(name, ++count);
			} else {
				answerMap.put(name, 1);
			}
		}

		for (int i = 0; i < completion.length; i++) {
			int count = (int) answerMap.get(completion[i]);
			String name = completion[i];
			if (count == 1) {
				answerMap.remove(name);
			} else {
				answerMap.put(name, --count);
			}
		}
		String temp = answerMap.keySet().toString();
		answer = temp.substring(1, temp.length() - 1);

		return answer;
	}

}
