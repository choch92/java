package thread;

public class ThreadMain1 {
	
	public static void main(String[] args) {
		ThreadEx th1 = new ThreadEx();
		//th1.run();	// process 형태를 실행	
		// 이 메소드의 수행이 종료될 때 까지 다른 메소드 호출은 안됩니다.

		th1.start();	// thread로 수행
		// 실행 도중에 쉬는 시간이 생기거나 CPU가 필요없는 작업이 생기면 다른 스레드를 실행할 수 있습니다.
		
		ThreadEx th2 = new ThreadEx();
		//th2.run();	// process 형태로 실행
		th2.start();	// thread로 수행
		
	}
}
