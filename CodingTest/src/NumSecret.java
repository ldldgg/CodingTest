
public class NumSecret {

	public String solution(String phone_number) {
		String answer = "";
		String end_number = "";
        
		int star = 0;
        star = phone_number.length() - 4;

		for (int i = 0; i < star; i++) {
			answer += "*";
		}

        end_number = phone_number.substring(star, phone_number.length());
        
		answer += end_number;

		return answer;
	}


}
