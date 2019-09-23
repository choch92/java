package exceptionhandling;

public class Main1 {

	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		int port = 8899;
		System.out.printf("a : %d b : %d\n", a,b);
		//문법적인 오류는 없어서 실행은 되지만 특정한 상황을 만나면 프로그램이 오류를 발생시키면서 중단되는 현상
		//System.out.printf("a / b : %d\n", a/b); 
		try {
			//여기서 문제가 발생하더라도 아래 문장들을 계속 처
			System.out.printf("a / b : %d\n", a/b);
			if(port == 8899) {
				// 강제로 예외를 발생시킴 
				throw new ArithmeticException();
			}
		}catch(Exception e) {
			System.out.printf("계산하는 도중 문제가 발생했습니다.\n");
			//프로그램 종료
			System.exit(0);
		}
		System.out.printf("예외 처리의 목적에 대해서 알아봅시다.\n");

	}
}
