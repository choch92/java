package lang;

public class Main {

	public static void main(String[] args) {
		
		/** 1) String toString **/
		// UserVO 클래스의 객체를 생성하고 속성을 설정한 후 내용을 출력
		UserVO vo1 = new UserVO();
		// 속성을 설정
		vo1.setNum(1);
		vo1.setName("조창훈");
		vo1.setAge(28);
		// 내용을 출력
		System.out.printf("번호 : %d 이름 : %s 나이 : %d\n", vo1.getNum(), vo1.getName(), vo1.getAge());

		// 매개변수가 있는 생성자를 이용해서 객체를 생성하고 속성을 설정
		UserVO vo2 = new UserVO(2, "조성우", 27);
		//객체의 모든 속성 확인하기
		//데이터를 표현하는 클래스를 만들 때는 toString()을 오버라이딩 하고 확인할 때는 아래처럼 이름만으로 확인
		//toString() 메소드를 디버깅을 위한 메소드라고도 합니다. 
		System.out.printf("%s\n", vo2);
		System.out.printf("========================================\n");
		
		/** 2) Clone **/
		//UserVo 인스턴스를 생성
		UserVO vo3 = new UserVO(3, "최진용", 28);
		//vo3가 가리키고 있는 곳의 참조를 vo4에 복사
		UserVO vo4 = vo3;	//실제 이런 문장이 있다면 잘못한 것 
		//vo4 가 자신의 num을 31로 변경 
		vo4.setNum(31);
		//vo3를 출력 - vo3의 num도 31 변경되어 있습니다.
		System.out.printf("%s\n", vo3);
		System.out.printf("========================================\n");
		UserVO vo5 = vo3.clone(); 
		System.out.printf("vo3 : %s\n", vo3);
		System.out.printf("vo5 : %s\n", vo5);
		System.out.printf("========================================\n");
		//vo5가 num을 변경
		vo5.setNum(77);
		System.out.printf("vo3 : %s\n", vo3);
		System.out.printf("vo5 : %s\n", vo5);
		System.out.printf("========================================\n");
		
		/** 3) boolean equals(Object object) **/
		UserVO vo6 = vo3.clone();
		System.out.printf("%b\n", vo6 == vo3);	//내용을 비교하지 않기 때문에 false
		System.out.printf("%b\n", vo6.equals(vo3));	//내용을 비교해서 true
	}
}
