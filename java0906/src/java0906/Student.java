package java0906;

public class Student {
	
	
	//이 코드 블록은 클래스를 처음 사용하기 위해서 메모리에 로드될 때 바로 실행됩니다.
	static {
		System.out.printf("클래스가 생성되어 메모리에 로드됩니다.\n");
	}
	
	// 학교이름, 학생이름, 전화번호, 학번을 저장할 수 있는 변수 
	
	// 모든 학생의 학교 이름은 동일합니다.
	// 이런 경우에는 static으로 선언해서 1개만 생성해서 공유하는 것이 좋습니다.
	static String schoolName;
	String studentName;
	//접근 지정자를 private으로 설정하면 클래스 외부에서 사용이 불가능합니다.
	private String phone;
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	//접근 지정자를 public으로 설정하면 클래스 외부에서 객체가 사용 가능합니다.
	public String num;
		
	
}
