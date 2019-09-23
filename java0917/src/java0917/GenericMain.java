package java0917;

public class GenericMain {

	public static void main(String[] args) {
		// 미지정 자료형을 String으로 결정해서 객체 생성
		// 클래스 이름 <실제 자료형 나열> 객체이름 = new 생성자<실제 자료형 나열>();
		Generic<String> ob1 = new Generic<String>("Java", "Kotlin", "Swift");
		ob1.display();
		// 미지정 자료형을 결정할 때 기본형은 안됨
		// Generic<int> ob2 = new Generic<int>(100,200);
		// 1.7 버전 이상에서는 생성자 뒤의 자료형은 생략 가능 
		Generic<Integer> ob2 = new Generic<>(100,200);
		ob2.display();
	}

}
