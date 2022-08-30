package onelevel.normal;

import java.util.HashMap;

public class phonkemon {

	public int solution(int[] nums) {
		int answer = 0;

		HashMap<Integer, Integer> pok = new HashMap();

		for (int i = 0; i < nums.length; i++) {
			pok.put(nums[i], 0);
		}

		if (nums.length / 2 <= pok.size()) {
			answer = nums.length / 2;
		} else {
			answer = pok.size();
		}

		return answer;
	}

}
