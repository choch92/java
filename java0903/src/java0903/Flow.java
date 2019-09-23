package java0903;

public class Flow {

	public static void main(String[] args) {
		//Overflow : 자신이 저장할 수 있는 넘어선 데이터를 저장해서 잘못된 데이터를 저장하는 상황
		int n = (int)(2100000000 + 2100000000);
		System.out.println("n:" +n);
		//Underflow : 자신이 저장할 수 있는 범위보다 작은 데이터를 저장해서 잘못된 데이터를 저장하는 상황
		n = (int)(-2100000000 - 2100000000);
		System.out.println("n:" +n);
		
		double d = 0.1;
		double sum = 0.0;
		for(int i=0; i<100; i=i+1) {
			sum = sum +d;
		}
		System.out.println("sum:" + sum);

		//자바에서는 동일한 자료형의 데이터끼리 연산하면 그 결과도 연산을 수행한 데이터의 자료형으로 리턴됩니다.
		System.out.println(5/3);	//정수 나누기 정수는 정수 : 1
		//소수까지 나오도록 하고자 하면 2개 중에 하나를 실수로 만들어 주어야 합니다.
		System.out.println((double)5/3);	//실수 나누기 정수는 실수 : 1.666...
	}

	
}
