package abstractclass;

public class Main {

	public static void main(String[] args) {
		// 현재는 Star 클래스가 abstract 클래스가 아님
		// abstract class가 아닐때 객체 생성이 가능
		// Star 클래스의 class 앞에 abstract를 추가하면 에러
		//Star star = new Star();
		
		// Protoss 클래스의 인스턴스 생성
		Star s = new Protoss();
		s.attack();

		// Zerg 클래스의 인스턴스 생성
		s = new Zerg();
		// z.offence();
		s.attack();

		// Terran 클래스의 인스턴스 생성
		s = new Terran();
		// t.공격();
		s.attack();

	}
}
