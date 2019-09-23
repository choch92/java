package java0906;

public class Fibonacci {
	//재귀를 사용하지 않고 피보나치 수열의 값을 리턴하는 메소드
	public int fibo1(int n) {
		//두번째 이전의 항의 값을 저장할 변수
		int n1 = 1;
		//첫번째 이전의 항의 값을 저장할 변수
		int n2 = 1;
		//피보나치 수열의 값을 저장할 변수
		int result = 1;
		//3번째 부터 n번째 까지는 n1과 n2 값을 변경하면서 더한다.
		for(int i=3; i<=n;i=i+1) {
			//이전 두개의 항의 값을 더하기 
			result = n1 + n2;
			//다음 데이터로 변경 
			n1 = n2;
			n2 = result;
		}
		return result;
	}
	//재귀를 이용한 피보나치 수열 메소드
	public int fibo2(int n) {
		//첫번째 이거나 두번째이면 1
		//그 이외의 경우는 이전 2개의 항의 합 
		if(n==1 || n==2) {
			return 1;
		}else {
			return fibo2(n-1) + fibo2(n-2);
		}
	}
}
