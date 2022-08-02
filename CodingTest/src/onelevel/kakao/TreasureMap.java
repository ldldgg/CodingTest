package onelevel.kakao;

public class TreasureMap {

	public String[] solution(int n, int[] arr1, int[] arr2) {
		String[] answer = new String[n];
		String str1 = "";
		String str2 = "";
		
		int strle = 0;

		for (int i = 0; i < n; i++) {
			
			answer[i] = "";
			str1 = "";
			str2 = "";
			
			
			strle = n - Integer.toBinaryString(arr1[i]).length();
			for (int j = 0; j < strle; j++) {
				str1 += "0";
			}
			str1 += Integer.toBinaryString(arr1[i]);
			
			
			strle = n - Integer.toBinaryString(arr2[i]).length();
			for (int j = 0; j < strle; j++) {
				str2 += "0";
			}
			str2 += Integer.toBinaryString(arr2[i]);
			
			

			
			for (int j = 0; j < n; j++) {
				
				if (str1.charAt(j) == '1' || str2.charAt(j) == '1') {
					answer[i] += "#";
				} else {
					answer[i] += " ";
				}
			}

		}

		return answer;
	}

	
}
