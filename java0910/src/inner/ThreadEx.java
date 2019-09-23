package inner;

public class ThreadEx extends Thread {
	// 이 메소드가 상위 클래스의 메소드를 재정의 했다는 것을 알려주기 위한 어노테이션
	// 어노테이션을 추가했는데 상위 클래스의 메소드가 없으면 에러
	@Override
	public void run() {
		for(int i = 0; i < 10; i = i + 1) {
			System.out.printf("클래스 생성\n");
		}
	}
}
