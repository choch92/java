package java0903;

public class Unary {

	public static void main(String[] args) {
		//정수 변수를 생성해서 초기값을 부여
		int i = 99;
		i++; //i값을 1증가
		System.out.printf("i: %d\n", i);	//100이 출력
		System.out.printf("i: %d\n", ++i);	//앞에 붙으면 변수의 값을 증가시키고 명령문에 사용, 101가 되고 출력
		System.out.printf("i: %d\n", i++);	//뒤에 붙이면 명령문에 값을 먼저 사용하고 나중에 증감, 101를 출력하고 i는 102이 됩니다. 
		System.out.printf("i: %d\n", i);	//앞에 i++ 때문에 102가 출력
		
		i = 0;
		int result = i++ + i++;	//앞에 i++에서 0이출력되고 i는 1이됨, 뒤에 i++에서 1이출력되고 i는 2가됨 
		
		System.out.printf("\nresult:%d\n", result);
	}

}
