package java0906;

public class MethodClass {
	
	//method 함수 만들기 
	public void func() {
		for(int i=0; i<2; i=i+1) {
			System.out.printf("처음 만들어 본 메소드\n");
			//클래스 안에 만들어진 다른 메소드 호출
			method();
		}
	}
	public void method() {
		System.out.printf("내부에서 호출할 메소드\n");
	}
	public void noArg() {
		//Hello Java를 3번 출력 
		for(int i=0; i<3; i=i+1) {
			System.out.printf("Hello Java\n");
		}
	}
	public void oneArg(int n) {
		for(int i=0; i<n; i=i+1) {
			System.out.printf("Hello Java\n");
		}
	}
	//매개변수의 자료형이 기본형인 경우
	public void value(int n) {
		n = n+1; //n의 값을 1 증가 
		System.out.printf("n:%d\n", n);
	}
	//매개변수의 자료형이 기본형이 아닌 경우
	public void reference(int [] ar) {
		ar[0] = ar[0] +1;
		System.out.printf("ar[0] : %d\n", ar[0]);
	}
		
	//Method Overloading
	//동일한 이름의 메소드가 매개변수의 자료형과 개수를 다르게 해서 2개 이상 존재하는 경우 
	public void add(int a, int b) {
		System.out.printf("a+b : %d\n", a+b);
	}
	public void add(double a, double b) {
		System.out.printf("a+b : %f\n", a+b);
	}
	
	//정수 매개변수를 개수에 상관없이 대입할 수 있는 함수 
	public void sum(int ... ar) {
		//... 다음에 나온 변수는 배열로 간주 
		//ar 배열의 데이터 합계 
		int sum = 0;
		for(int temp : ar) {
			sum = sum + temp;
		}
		System.out.printf("ar 배열의 합계 : %d\n", sum);
	}
	
	//정수 2개를 더해서 결과를 리턴하는 메소드
	//return 이 있으면 메소드 수행 결과를 사용할 수 있습니다.
	public int returnadd(int n1, int n2) {
		return n1 + n2;
	}
}











