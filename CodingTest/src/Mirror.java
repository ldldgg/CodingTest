
public class Mirror {

	public int[] solution(long n) {
		String nStr = Long.toString(n);

		int[] answer = new int[nStr.length()];

		for (int i = 0; i < nStr.length(); i++) {
			answer[i] = nStr.charAt(i) - '0';
		}

		int temp = 0;
		int mirror = 0;
		for (int i = 0; i < answer.length/2; i++) {
			temp = answer[i];
			answer[i] = answer[(answer.length - i-1)];
			answer[answer.length - i-1] = temp;
		}

		return answer;
	}

	public static void main(String[] args) {

		Mirror m = new Mirror();

		m.solution(785931);

	}
}
