package onelevel.kakao;

public class DartGame {
	public int solution(String dartResult) {

		int answer = 0;

		String[] point = new String[3];
		int[] bonus = new int[3];
		int[] pow = new int[3];
		int[] star = new int[3];
		int count = 0;

		for (int i = 0; i < star.length; i++) {
			star[i] = 1;
			point[i] = "";
		}

		for (int i = 0; i < dartResult.length(); i++) {
			if (dartResult.charAt(i) >= '0' && dartResult.charAt(i) <= '9') {
				point[count] += dartResult.charAt(i);
			} else if (dartResult.charAt(i) == 'S') {
				bonus[count++] = 1;
			} else if (dartResult.charAt(i) == 'D') {
				bonus[count++] = 2;
			} else if (dartResult.charAt(i) == 'T') {
				bonus[count++] = 3;
			}

			if (dartResult.charAt(i) == '*') {
				star[count - 1] = 2;
			} else if (dartResult.charAt(i) == '#') {
				star[count - 1] = -1;
			}

		}

		for (int i = 0; i < point.length; i++) {
			int num = Integer.parseInt(point[i]);

			pow[i] = (int) (Math.pow(num, bonus[i]));
		}

		for (int i = 0; i < pow.length; i++) {
			int sum = pow[i];

			sum = sum * star[i];
			if (i < point.length - 1 && star[i+1] == 2) {
				sum = sum * star[i + 1];
			}

			answer += sum;
		}

		return answer;
	}
}