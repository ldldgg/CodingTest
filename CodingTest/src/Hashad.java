
public class Hashad {
	int x = 0;
	int thousand = 0;
	int hundred = 0;
	int ten = 0;
	int one = 0;
	
	void distribute(int x) { // 자리마다 숫자를 변수로 저장
		this.x = x;
		
		thousand = x / 1000;
		hundred = (x - (thousand * 1000)) / 100;
		ten = (x - (thousand * 1000)-(hundred * 100)) / 10;
		one = x-(thousand * 1000)-(hundred * 100)-(ten * 10);
//		System.out.println(thousand);
//		System.out.println(hundred);
//		System.out.println(ten);
//		System.out.println(one);
	}
	

	
}
