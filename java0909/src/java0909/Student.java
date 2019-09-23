package java0909;

public class Student {

	// 인스턴스의 일련번호를 저장할 속성
	private int no;

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	// 속성 선언
	// 속성을 private으로 생성하면 instance가 접근할 수 없게 됨
	// 이런 경우에는 접근자 메소드를 만들어서 사용할 수 있도록 해주어야 합니다.
	private String hakbun;
	private String name;
	private boolean gender;
	private String mobile;

	// 일련번호를 만들기 위한 static변수
	// static 변수는 1개만 만들어지고 초기값은 0
	private static int autoinc;

	// 특정 속성의 값을 상수로 설정하는 생성자
	// 특정 속성이 일정한 값의 형태인 경우 생성자에서 하는 것이 setter를 호출하지 않아도 되므로 유리합니다.
	public Student() {
		// Static 변수의 값을 1증가
		autoinc = autoinc + 1;
		// no에 대입
		no = autoinc;
		hakbun = "1";
	}
	
	//매개변수가 있는 생성자 
	//기존의 생성자가 존재하는데 매개변수의 개수를 다르게 해서 생성자를 생성 - Overloading
	public Student(String hakbun, String name, boolean gender, String mobile) {
		
		/*
		autoinc = autoinc + 1;
		no = autoinc;
		*/
		//자신의 매개변수가 없는 생성자를 호출(/**/안의 내용 처럼 해도 되지만 그 위에 이미 생성되있어서 this활용)
		this();
		//this를 붙이면 메소드에서 찾지 않고 메소드 외부에서 찾습니다.
		//this가 안붙으면 메소드 내에서 찾고 없으면 메소드 외부에서 찾습니다.
		//this.hakbun(메소드 외부에서 찾음) = hakbun(메소드내부에서 찾음)
		this.hakbun = hakbun;
		//this(); //코드 맨처음에 쓰지않고 밑에 쓰면 바로 에러가 난다.
		this.name = name;
		this.gender = gender;
		this.mobile = mobile;
	}

	public String getHakbun() {
		return hakbun;
	}

	public void setHakbun(String hakbun) {
		this.hakbun = hakbun;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

}
