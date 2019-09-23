package util;

import java.util.Random;

public class RandomMain {

	public static void main(String[] args) {
		// java.util.Random은 랜덤한 숫자를 추출하기 위한 클래스
		
		String [] ar = {"발렌토", "칼베쥬", "드락소스", "모코바", "데빌샤이"};
		// 완전 랜덤 : seed 설정을 하지 않으면 됩니다.
		// 생성자에 정수 값을 대입하면 일정한 패턴으로 나옵니다.
		Random r = new Random(20);
		System.out.printf("%s\n", ar[r.nextInt(ar.length)]);
		System.out.printf("%s\n", ar[r.nextInt(ar.length)]);
		System.out.printf("%s\n", ar[r.nextInt(ar.length)]);
	}
}
