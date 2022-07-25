package onelevel;

public class MinNumRemove {

	public static int[] solution(int[] arr) {
		int[] answer = new int[arr.length - 1];

		int min = arr[0];
		int place = 0;

		for (int i = 0; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
				place = i;
			}
		}

		if (arr.length > 1) {
			for (int i = 0; i < arr.length; i++) {
				if(i < place) {
					answer[i] = arr[i];
				}else if(i > place) {
					answer[i-1] = arr[i];
				}
			}
		} else {
			answer = new int[1];
			answer[0] = -1;
		}

		return answer;
	}

//	public static void main(String[] args) {
//
//		int[] ko = { 32, 5, 51, 9, 21, 15, 61, 1515, 1, 23, 7272, 551, 124};
//
//		for (int i = 0; i < ko.length - 1; i++) {
//			System.out.println(solution(ko)[i]);
//		}
//
//	}

}
