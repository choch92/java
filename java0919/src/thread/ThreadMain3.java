package thread;

public class ThreadMain3 {

	public static void main(String[] args) {
		// ShareData 객체 생성
		ShareData share = new ShareData();
		// Thread를 생성해서 시작
		Thread th1 = new Thread(share);
		th1.start();
		Thread th2 = new Thread(share);
		th2.start();
		
		try {
			Thread.sleep(30000);
		}catch(Exception e) {}	
		// 결과 출력
		System.out.printf("%d\n", share.getResult());
	}
}
