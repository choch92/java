package java0903;

public class RefMain {

	public static void main(String[] args) {	
		//정수 배열을 생성 - 참조형 : 0개 이상의 데이터 
		int [] ar = {10, 30, 20};
		//참조형은 변수 이름만으로는 데이터를 가져올 수 없다.
		System.out.println("ar:" + ar);
		//참조형은 저장하고 있는 데이터를 가져올 때 이름 이외의 무엇인가를 이용해야 합니다.
		System.out.println("ar[0]:" + ar[0] + "\nar[1]:" + ar[1] + "\nar[2]:" + ar[2]);
		System.out.printf("%d: %d: %d", ar[0], ar[1], ar[2]);

	}

}
