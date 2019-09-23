package exceptionhandling;

public class Main2 {

	public static void main(String[] args) {
		String[] languages = { "Java", "JavaScript", "Kotlin", "Swift" };
		int x = 10;

		try {
			// 예외가 발생할 가능성이 있는 구문
			// ArithmeticException이 발생
			System.out.printf("x/0 : %d\n", x / 0);

			int len = languages.length;
			// ArrayOutOfBoundsException이 발생(i <= len -> i < len)
			for (int i = 0; i <= len; i = i + 1) {
				System.out.printf("프로그래밍 언어 : %s\n", languages[i]);
			}
		}
		// 여러 종류의 예외를 묶어서 처리하기 위해서 Exception(상위 클래스)을 사용
		catch (Exception e) {
			// 예외 클래스에 해당하는 예외가 발생했을 때 처리하는 구문
			// Exception 클래스의 getMessage() 는 예외 내용을 문자로 리턴
			System.out.printf("예외 : %s\n", e.getMessage());
		} finally {
			// 예외 발생 여부에 상관없이 수행할 구문
			System.out.printf("무조건 수행할 구문\n");
		}
	}
}
