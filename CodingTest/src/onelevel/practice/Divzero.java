package onelevel.practice;

public class Divzero {

	public int[] solution(int[] arr, int divisor) {
		int count = 0;
		int[] answer;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % divisor == 0) {
				count++;
			}
		}

		if (count == 0) {
			answer = new int[] { -1 };
		} else {
			answer = new int[count];
		}

		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % divisor == 0) {
				answer[j++] = arr[i];
			}
		}

		for (int i = 0; i < answer.length; i++) {
			for (int k = i + 1; k < answer.length; k++) {

				if (answer[i] > answer[k]) {
					j = answer[i];
					answer[i] = answer[k];
					answer[k] = j;
				}

			}

		}

		return answer;
	}

}
