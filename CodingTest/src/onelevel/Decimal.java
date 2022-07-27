package onelevel;

public class Decimal {

	public int solution(int n) {
		int answer = 0;
		boolean decimal = true;

		for (int i = 2; i <= n; i++) {
			decimal = true;
			for (int j = 2; j <= (int) Math.sqrt(i); j++) {
				if (i % j == 0) {
					decimal = false;
					break;
				}
			}
			if (decimal) {
				answer++;
			}

		} // for 종료

		return answer;
	}

}
