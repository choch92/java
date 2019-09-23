package java0909;

//extends가 없지만 java.lang.Object 클래스로부터 상속 받은것으로 간주 
public class Super {
	//private int n = 0;
	protected int x = 100;
	public int y = 200;
	
	//생성자를 만들지 않으면 아래처럼 상위 클래스의 생성자를 호출하는 매개변수가 없는 생성자가 있는 것임.
	/*
	public Super() {
		super();
	}
	*/
	/*
	//매개변수가 없는 생성자 
	public Super() {
		System.out.printf("상위 클래스의 매개변수가 없는 생성자\n");
	}
	*/
	
	//매개변수가 있는 생성자 
	//매개변수가 있는 생성자를 만들면 기본적으로 제공되는 생성자가 소멸 
	//이 때 매개변수가 없는 생성자를 만들지 않으면 하위 클래스는 에러 
	public Super(String msg) {
		System.out.printf("msg : %s\n", msg);
	}
	public void display() {
		System.out.printf("상위 클래스의 메소드\n");
	}
}
