package java0917;

import java.util.Arrays;

public class ArrayMain2 {

	public static void main(String[] args) {
		// FileName 의 배열을 생성
		FileName f1 = new FileName();
		f1.setName("자바");
		f1.setSize(80);
		f1.setType("파워포인트");
		f1.setSave(true);
		
		FileName f2 = new FileName();
		f2.setName("스위프트");
		f2.setSize(170);
		f2.setType("키노트");
		f2.setSave(true);
		
		FileName f3 = new FileName();
		f3.setName("코틀린");
		f3.setSize(50);
		f3.setType("파워포인트");
		f3.setSave(false);

		// 위에서 만든 FileName 객체 3개를 가지고 배열을 생성
		FileName [] ar = {f1, f2, f3};
		
		// 배열의 데이터를 확인
		for(FileName temp : ar) {
			// 객체 이름을 %s에 매핑 시켜서 출력하면 toString의 결과가 출력 됩니다.
			System.out.printf("%s\n", temp);
		}
		
		// 배열의 데이터 정렬
		// 데이터를 정렬하려면 크기 비교를 하는 메소드가 구현되어 있어야 합니다.
		// class 문에서 implements Comparable를 작성 후 메소드를 작성해야함.
		// Compararble 인터페이스의 compareTo 메소드입니다.
		// 아니면 Comparator 인터페이스를 구현한 객체를 대입 해주어야 합니다.
		Arrays.sort(ar);
		System.out.printf("==========================\n");
		// 배열의 데이터를 확인
		for(FileName temp : ar) {
			// 객체 이름을 %s에 매핑 시켜서 출력하면 toString의 결과가 출력 됩니다.
			System.out.printf("%s\n", temp);
		}
	}

}
