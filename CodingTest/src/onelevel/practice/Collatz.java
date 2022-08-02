package onelevel.practice;

public class Collatz {

	public int solution(int num) {
		int answer = 0;
		int a = num;
		while (true) {
			if(a==1) {
				break;
			}
			
			if(answer == 500) {
				answer = -1;
				break;
			}
			
			if (a % 2 == 0) {
				a = a/2;
			} else if (a % 2 == 1) {
				a = (a*3) + 1;
			}
			
			answer++;
		}

		return answer;
	}

}
