package java0917;

// T라는 미지정 자료형을 생성
public class Generic<T> {
	// 미지정 자료형의 배열을 생성
	private T [] data;
	// 데이터를 대입받아서 인스턴스 속성에 대입하는 생성자
	// 매개변수에 ...이 있으면 varargs 라고 하는데 매개변수를 개수에 상관없이 대입가능
	// 메소드 내에서는 배열로 간주합니다.
	// n이 생성자이고 n은 미지정 자료형한테 대입받는다.
	public Generic(T...n) {
		data = n;
	}
	// data의 내용을 출력하는 메소드
	public void display() {
		// 빠른 열거를 이용한 배열의 데이터 접근
		for(T temp : data) {
			System.out.println(temp);
		}
	}
}
