package java0905;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		//입력받은 숫자 번째 피보나치 수열의 값 구하기
		
		//입력받을것을 만들기
		Scanner sc = new Scanner(System.in);
		System.out.printf("정수를 입력하세요 :");
		int su = sc.nextInt();
	
		//구할 수열의 2번째 이전 데이터를 저장할 변수 
		int n1 = 1;
		//구할 수열의 1번째 이전 데이터를 저장할 변수 
		int n2 = 1;
		//피보나치 수열의 값을 저장할 변수
		int fibo = 1;
		for(int i=3; i<=su; i=i+1) {
			fibo = n1 + n2;
			n1 = n2;
			n2 = fibo;
		}
		System.out.printf("%d번째 피보나치 수열의 값 : %d\n", su,fibo);
		sc.close();
	}
}
