package onelevel.normal;

public class TwoNumAdd {

	public int[] solution(int[] numbers) {

		int maxLength = numbers.length;
		maxLength = maxLength * (maxLength / 2);

		int[] tempArr = new int[maxLength];
		int sum = 0;
		int index = 0;

		for (int i = 0; i < numbers.length - 1; i++) {

			for (int j = i + 1; j < numbers.length; j++) {

				sum = numbers[i] + numbers[j];

				for (int k = 0; k <= index; k++) {

					if (k == index) {
						tempArr[index++] = sum;
						break;
					} else if (tempArr[k] == sum) {
						break;
					}

				}

			}

		} // for end

		int[] answer = new int[index];

		System.arraycopy(tempArr, 0, answer, 0, index);

		int min = 0;
		int temp = 0;

		for (int i = 0; i < answer.length - 1; i++) {

			min = i;

			for (int j = i + 1; j < answer.length; j++) {
				if (answer[min] > answer[j]) {
					min = j;
				}
			}

			temp = answer[min];
			answer[min] = answer[i];
			answer[i] = temp;

		}

		return answer;
	}

}
