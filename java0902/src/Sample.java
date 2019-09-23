
public class Sample {

	public static void main(String[] args) {
		//System.out.println("나는 하라PC로 달려갈 것이다.");
		
		//나이와 몸무게를 저장해서 출력
		//어떤 데이터를 저장해두고 사용할 때는 변수를 생성해서 저장
		//변수를 만들 때는 어떤 종류의 데이터를 저장할 것인지 자료형을 결정해야 합니다.
		
		//나이는 정수, 몸무게는 실수
		int age = 28, brother = 27;
		double weight = 70.4, btweight=100;
		
		//데이터를 출력
		System.out.println("나이:" + age + "\n몸무게:" + weight);
		System.out.println("브라더나이:" + brother + "\n브라더무게:" + btweight);
		
		//char는 저장은 정수를 하고 있다가 출력할 때 문자로 변환해서 출력
		//48이 숫자 0, 65가 대문자 A, 97이 소문자 a	
		char ch = 48, ch1 = 65, ch2= 97;
		System.out.println("ch:" + ch + "\nch1:" + ch1 + "\nch2:" + ch2);
	}
}
