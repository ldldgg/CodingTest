package onelevel.normal;

public class addPrimeNum {

	public int solution(int[] nums) {
		int answer = -1;
		int sum = 0;

		for (int i = 0; i < nums.length - 2; i++) {

			for (int j = i + 1; j < nums.length; j++) {

				for (int k = j + 1; k < nums.length; k++) {

					sum = nums[i] + nums[j] + nums[k];
					

				}
			}
		}

		return answer;
	}

}
