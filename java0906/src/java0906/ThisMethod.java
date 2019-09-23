package java0906;

public class ThisMethod {
	public int temp = 20;
	
	public void thisMethod() {
		int temp = 30;
		System.out.printf("temp : %d\n", temp);	//30이 출력됩니다. 
		//변수는 가까이에서 만든 것을 찾아서 사용 합니다.
		//메소드 안에서 찾지 말고 메소드 외부에서 찾도록 할려면 변수명 앞에 this.(점)을 추가 
		System.out.printf("temp : %d\n", this.temp);
	}
}
