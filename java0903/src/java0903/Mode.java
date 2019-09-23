package java0903;

public class Mode {

	public static void main(String[] args) {
		//byte a = 10;
		//byte b =7;
		//byte + byte 이지만 자바는 int보다 크기가 작은 데이터를 가지고 연산을 수행하면 int로 변경해서 연산을 수행
		//연산의 결과를 byte에 저장하고자 하면 결과를 형변환해서 저장해야 합니다.
		//byte x = (byte)(a + b);
		
		System.out.println(10.0/0.0);
		
		int n = 0;
		while(true) {
			try {
				if(n % 5 == 0)
					System.out.println("배가");
				if(n % 5 == 1)
					System.out.println("고파도");
				if(n % 5 == 2)
					System.out.println("신이주");
				if(n % 5 == 3)
					System.out.println("순대국");
				if(n % 5 == 4)
					System.out.println("절대안먹음");
				n++;
				Thread.sleep(1000);
			}catch(Exception e) {}
			
		}
		

	}

}
