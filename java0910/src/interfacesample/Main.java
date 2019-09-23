package interfacesample;

public class Main {
	// Main 클래스 안에서 String 클래스가 사용됨 - has a
	//이 경우는 인스턴스 변수로 선언되서 Main과 수명이 같아서 composition관계
	String str;
	public static void main(String[] args) {
		//String str;	// aggregation관계
		//SeriviceImpl 객체를 생성
		//Serviceimpl service1 = new Serviceimpl();
		
		//인터페이스를 implements 한 클래스의 객체를 만들 때는 변수를 만들 때
		//인터페이스 이름을 사용하기도 합니다.
		Service service2 = new Serviceimpl();
		service2.insert();
		service2.read();
		service2.update();
		service2.remove();
	}

}
