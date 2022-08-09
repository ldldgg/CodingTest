package onelevel.kakao;

public class FailureRate {

	public int[] solution(int N, int[] stages) {

		int[] answer = new int[N];
		double[] rate = new double[N];

		for (int i = 0; i < rate.length; i++) {
			double up = 0;
			double down = 0;

			for (int j = 0; j < stages.length; j++) {

				if (stages[j] >= i + 1) {
					down++;
				}

				if (stages[j] == i + 1) {
					up++;
				}

			}
			if (down > 0) {
				rate[i] = (up / down);
			}else {
				rate[i] = 0;
			}

		}

		int max = 0;

		for (int i = 0; i < rate.length; i++) {

			for (int j = 0; j < rate.length; j++) {
				if (rate[max] < rate[j]) {
					max = j;
				}
			}

			rate[max] = -1;
			answer[i] = max + 1;

		}
  
		return answer;

	}

	public static void main(String[] args) {

		FailureRate so = new FailureRate();

		int[] stages = { 1, 2, 3, 4, 5, 6, 7 };

		int N = 8;

		stages = so.solution(N, stages);

		for (int a : stages) {
			System.out.println(a);
		}

	}
}
