package onelevel.normal;

public class threeNum {

	public int solution(int n) {
		int answer = 0;
		String three = "";

		while (n > 0) {
			three += n % 3;
			n = n / 3;
		}

		answer = Integer.parseInt(three, 3);

		return answer;
	}

}
