package onelevel.normal;

public class KthNumber {

	public int[] solution(int[] array, int[][] commands) {

		int[] answer = new int[commands.length];
		int[] num;
		int min = 0;
		int temp = 0;
		int count = 0;

		for (int i = 0; i < commands.length; i++) {

			num = new int[commands[i][1] - commands[i][0] + 1];
			count = 0;

			for (int j = commands[i][0]-1; j < commands[i][1]; j++) {

				num[count++] = array[j];

			}

			for (int j = 0; j < num.length - 1; j++) {
				min = j;
				for (int k = j + 1; k < num.length; k++) {
					if (num[min] > num[k]) {
						min = k;
					}
				}

				temp = num[min];
				num[min] = num[j];
				num[j] = temp;
				
			}

			answer[i] = num[commands[i][2] - 1];

		}

		return answer;
	}

}
