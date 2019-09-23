package java0906;

public class Sample {
	public static void staticDisplay() {
		//static 메소드 - 클래스 이름 만으로 호출 가능
		//인스턴스 변수를 사용하지 못함
		System.out.printf("Hello Java \n");
	}
	//instance 메소드 - 인스턴스를 이용해서 호출해야 합니다. 
	//인스턴스 변수 사용이 가능
	public void instanceDisplay() {
		System.out.printf("Hello Java \n");
	}
	
}
