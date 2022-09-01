package onelevel.normal;

public class MockTest {

	public int[] solution(int[] answers) {

		int[] one = new int[answers.length];
		int[] two = new int[answers.length];
		int[] three = new int[answers.length];

		for (int i = 0; i < answers.length; i++) {
			one[i] = i % 5 + 1;
		}

		for (int i = 0; i < answers.length; i++) {

			if (i % 2 == 0) {
				two[i] = 2;
			} else if (i % 8 == 1) {
				two[i] = 1;
			} else if (i % 8 == 3) {
				two[i] = 3;
			} else if (i % 8 == 5) {
				two[i] = 4;
			} else if (i % 8 == 7) {
				two[i] = 5;
			}

		}

		for (int i = 0; i < answers.length; i++) {

			if (i % 10 <= 1) {
				three[i] = 3;
			} else if (i % 10 <= 3) {
				three[i] = 1;
			} else if (i % 10 <= 5) {
				three[i] = 2;
			} else if (i % 10 <= 7) {
				three[i] = 4;
			} else if (i % 10 <= 9) {
				three[i] = 5;
			}

		}

		int[] score = new int[3];

		for (int i = 0; i < answers.length; i++) {

			if (answers[i] == one[i]) {
				score[0]++;
			}

			if (answers[i] == two[i]) {
				score[1]++;
			}

			if (answers[i] == three[i]) {
				score[2]++;
			}

		}

		int max = 0;
		int count = 0;

		for (int i = 0; i < score.length; i++) {
			if (max < score[i]) {
				max = score[i];
			}
		}

		for (int i = 0; i < score.length; i++) {

			if (max == score[i]) {
				count++;
			}

		}

		int[] answer = new int[count];
		int index = 0;

		for (int i = 0; i < score.length; i++) {

			if (max == score[i]) {
				answer[index++] = i + 1;
			}

		}

		int temp = 0;

		if (answer.length > 1) {
			for (int i = 0; i < answer.length; i++) {
				for (int j = i + 1; j < answer.length; j++) {
					if (answer[i] > answer[j]) {
						temp = answer[i];
						answer[i] = answer[j];
						answer[j] = temp;
					}
				}
			}
		}

		return answer;
	}

}
