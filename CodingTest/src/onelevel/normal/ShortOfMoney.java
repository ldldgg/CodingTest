package onelevel.normal;

public class ShortOfMoney {

	public long solution(int price, int money, int count) {
		long answer = 0;

		for (int i = 0; i < count; i++) {
			money -= price * (i + 1);
		}

		if (money < 0) {
			answer = money * -1;
		}

		return answer;
	}

}
