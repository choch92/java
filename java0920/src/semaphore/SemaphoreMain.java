package semaphore;

import java.util.concurrent.Semaphore;

public class SemaphoreMain {

	public static void main(String[] args) {
		// Semaphore 객체 만들기
		Semaphore semaphore = new Semaphore(5);
		
		// Thread를 10개 만들어서 실행
		for(int i=0; i<10; i=i+1) {
			ThreadEx th = new ThreadEx(semaphore);
			// Thread로 시작
			th.start();
		}
	}
}
