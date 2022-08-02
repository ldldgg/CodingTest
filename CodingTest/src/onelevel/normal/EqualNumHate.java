package onelevel.normal;

public class EqualNumHate {

	public int[] solution(int []arr) {
    	
		int[] temp = new int[arr.length];
    	
    	int index = 0;
    	for (int i = 0; i < arr.length; i++) {
    		
    		if(i > 0 && arr[i] != arr[i-1]) {
    			temp[index++] = arr[i];
    		} else if(i == 0) {
    			temp[index++] = arr[i];
    		}
		}
    	
    	int[] answer = new int[index];
    	
    	System.arraycopy(temp, 0, answer, 0, answer.length);

        return answer;
    }
}