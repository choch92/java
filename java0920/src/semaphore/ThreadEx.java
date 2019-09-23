package semaphore;

import java.util.concurrent.Semaphore;

public class ThreadEx extends Thread {
	
	// static 변수를 만들면 모든 객체가 공유
	// Semaphore는 동시성 제어를 위한 클래스
	/** 동일한 클래스로부터 생성된 객체 사이의 공유 **/
	/**private static Semaphore semaphore = new Semaphore(3);**/
	
	/** 서로 다른 클래스로부터 생성된 객체 사이의 공유 **/
	// 외부에서 데이터를 주입받기 위한 변수
	private Semaphore semaphore;
	
	// 외부에서 데이터를 받아서 내부 변수에 값을 대입하는 생성자
	public ThreadEx(Semaphore semaphore) {
		this.semaphore = semaphore;
	}
	
	// 스레드로 동작할 내용을 가진 메소드
	@Override
	public void run() {
		
		// 공유 자원을 1개 사용한다고 알려주는 메소드
		try {
			semaphore.acquire();
		} catch (Exception e1) {}
		
		// 스레드로 수행할 내용
		// 자신의 이름을 1초마다 5번 출력
		for(int i=0; i<5; i=i+1) {
			try {
				Thread.sleep(1000);
				System.out.printf("%s\n", this.getName());
			}catch(Exception e) {
				System.out.printf("%s\n", e.getMessage());
			}
		}
		// 공유 자원 사용이 끝났다고 알려주는 메소드
		// release - 사용이 끝났다 또는 자원을 해제
		semaphore.release();
	}
}
