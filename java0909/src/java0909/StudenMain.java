package java0909;

public class StudenMain {

	public static void main(String[] args) {
		// Student 클래스의 instance생성
		Student student1 = new Student();
		// 속성에 set 메소드를 이용해서 값을 설정
		// student1.setHakbun("1290050");
		student1.setName("조창훈");
		student1.setGender(true);
		student1.setMobile("01054576063");

		// get 메소드를 이용해서 값을 가져와서 출력
		System.out.printf("학번 : %s\n", student1.getHakbun());
		System.out.printf("이름 : %s\n", student1.getName());
		System.out.printf("성별 : %s\n", student1.isGender());
		System.out.printf("번호 : %s\n", student1.getMobile());
		System.out.printf("====================\n");

		// student1 의 no 값 출력
		System.out.printf("번호 : %d\n", student1.getNo());

		Student student2 = new Student();
		// student2 의 no 값 출력
		System.out.printf("번호 : %d\n", student2.getNo());

		System.out.printf("====================\n");
		// 매개변수가 있는 생성자를 호출해서 초기화
		Student student3 = new Student("1290050", "조창훈", true, "01054576063");
		// set 메소드를 호출하지 않고 속성을 초기화
		System.out.printf("학번 : %s\n", student3.getHakbun());
	}

}
