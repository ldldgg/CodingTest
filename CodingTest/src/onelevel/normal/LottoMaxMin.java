package onelevel.normal;

public class LottoMaxMin {

	public int[] solution(int[] lottos, int[] win_nums) {

		int count = 0;
		int zero = 0;

		for (int i = 0; i < lottos.length; i++) {

			for (int j = 0; j < win_nums.length; j++) {

				if (lottos[i] == 0) {
					zero++;
					break;
				} else if (lottos[i] == win_nums[j]) {
					count++;
					break;
				}

			}

		}

		int min = 0;
		int max = 0;

		min = count;
		max = count + zero;

		if (min == 6) {
			min = 1;
		} else if (min == 5) {
			min = 2;
		} else if (min == 4) {
			min = 3;
		} else if (min == 3) {
			min = 4;
		} else if (min == 2) {
			min = 5;
		} else {
			min = 6;
		}

		if (max == 6) {
			max = 1;
		} else if (max == 5) {
			max = 2;
		} else if (max == 4) {
			max = 3;
		} else if (max == 3) {
			max = 4;
		} else if (max == 2) {
			max = 5;
		} else {
			max = 6;
		}

		int[] answer = { max, min };

		return answer;
	}

}
