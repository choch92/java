package lang;

import java.io.IOException;

public class RuntimeMain {

	public static void main(String[] args) {
		// Runtime 클래스는 생성자를 이용하지 않고 getRuntime()이라는 메소드를 이용해서 객체를 생성합니다.
		// 이런 경우는 대부분 싱글톤 패턴의 클래스입니다.
		// 몇 개의 객체를 만들 던 실제로는 하나를 다시 사용하는 경우입니다.
		// 동일한 객체인지 확인하는 방법은 hashCode()를 호출해서 확인하든가 
		// System.identityHashCode(객체)를 이용해서 해시코드를 확인해보면 됩니다.
		
		Runtime r1 = Runtime.getRuntime();
		Runtime r2 = Runtime.getRuntime();
		
		// 해시 코드 출력
		// 해시 코드가 동일하면 동일한 객체
		System.out.printf("r1:%d\n", r1.hashCode());
		System.out.printf("r2:%d\n", r2.hashCode());
		System.out.printf("r1:%d\n", System.identityHashCode(r1));
		
		// exec(String command) -> 클릭해서 보면 throws IOException이 있어서 try catch 예외처리 해야함
		try {
			// 디렉토리 만들기, mkdir 폴더 생성하는 명령어
			r1.exec("mkdir /Users/503a2/Desktop/newfolder");
			r1.exec("ping www.google.co.kr");
		} catch (IOException e) {
			// 예외 메세지를 출력하던가 로그로 기록
			System.out.printf("예외 메시지 : %s\n", e.getMessage());
			e.printStackTrace();
		}
	}

}
