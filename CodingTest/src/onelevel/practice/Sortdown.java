package onelevel.practice;

public class Sortdown {

	public long solution(long n) {
		long answer = 0;

		String strn = Long.toString(n);

		int[] num = new int[strn.length()];
		for (int i = 0; i < num.length; i++) {
			num[i] = strn.charAt(i) - '0';
		}

		int temp = 0;
		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] < num[j]) {
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}
		
		for (int i = 0; i < num.length; i++) {
			answer += num[i] * Math.pow(10, num.length-i-1);
		}

		return answer;
	}

    public static void main(String[] args) {
		
    	Sortdown s = new Sortdown();
    	
    	System.out.println(s.solution(158435));
    	
	}

}
