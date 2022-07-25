package onelevel;

public class NumAdd {
	public int solution(int n) {
		int answer = 0;
		int num = 0;

		String nStr = Integer.toString(n);

		for (int i = 0; i < nStr.length(); i++) {
			num = n % 10;
			n /= 10;
			answer += num;
		}

		return answer;
	}
}
