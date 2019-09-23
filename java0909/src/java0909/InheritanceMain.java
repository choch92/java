package java0909;

public class InheritanceMain {

	public static void main(String[] args) {
		// 하위 클래스의 객체 생성
		Sub sub = new Sub();
		// 자신의 클래스에 정의한 메소드 호출
		sub.print();
		// 상위 클래스에 만든 메소드 호출
		sub.display();
	}
}
