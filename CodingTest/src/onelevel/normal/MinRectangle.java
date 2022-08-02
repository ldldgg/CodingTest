package onelevel.normal;

public class MinRectangle {

	public int solution(int[][] sizes) {
		int answer = 0;
		int hMax = 0;
		int wMax = 0;
		int h = 0;
		int w = 0;

		for (int i = 0; i < sizes.length; i++) {

			if(sizes[i][0] >= sizes[i][1]) {
				h = sizes[i][0];
				w = sizes[i][1];
			} else {
				h = sizes[i][1];
				w = sizes[i][0];
			}
			
			if(hMax < h) {
				hMax = h;
			}
			
			if(wMax < w) {
				wMax = w;
			}
		}
		
		answer = wMax * hMax;
		

		return answer;
	}

}
