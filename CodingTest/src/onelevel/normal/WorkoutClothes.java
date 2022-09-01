package onelevel.normal;

public class WorkoutClothes {

	public int solution(int n, int[] lost, int[] reserve) {
		int answer = n;

		int min = 0;
		int temp = 0;

		for (int i = 0; i < lost.length - 1; i++) {
			min = i;
			for (int j = i + 1; j < lost.length; j++) {
				if (lost[min] > lost[j]) {
					min = j;
				}
			}

			temp = lost[min];
			lost[min] = lost[i];
			lost[i] = temp;

		}

		for (int i = 0; i < reserve.length - 1; i++) {
			min = i;
			for (int j = i + 1; j < reserve.length; j++) {
				if (reserve[min] > reserve[j]) {
					min = j;
				}
			}

			temp = reserve[min];
			reserve[min] = reserve[i];
			reserve[i] = temp;

		}

		for (int i = 0; i < lost.length; i++) {
			for (int j = 0; j < reserve.length; j++) {
				if (lost[i] == reserve[j]) {
					lost[i] = -1;
					reserve[j] = -1;
					break;
				}
			}
		}

		for (int i = 0; i < lost.length; i++) {
			if (lost[i] == -1) {
				continue;
			}

			for (int j = 0; j < reserve.length; j++) {

				if (lost[i] - 1 == reserve[j]) {
					reserve[j] = -1;
					break;
				} else if (lost[i] + 1 == reserve[j]) {
					reserve[j] = -1;
					break;
				} else if (j == reserve.length - 1) {
					answer--;
				}

			}

		}

		return answer;
	}
}
