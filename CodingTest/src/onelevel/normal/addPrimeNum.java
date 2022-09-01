package onelevel.normal;

public class addPrimeNum {

	public int solution(int[] nums) {
		int answer = 0;
		int sum = 0;

		for (int i = 0; i < nums.length - 2; i++) {

			for (int j = i + 1; j < nums.length - 1; j++) {

				for (int k = j + 1; k < nums.length; k++) {

					sum = nums[i] + nums[j] + nums[k];
					
					answer++;
					for (int l = 2; l <= Math.sqrt(sum); l++) {
						if(sum%l == 0) {
							answer--;
							break;
						}
					}

				}
			}
		}

		return answer;
	}

}
