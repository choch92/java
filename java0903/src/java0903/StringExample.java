package java0903;

public class StringExample {

	public static void main(String[] args) {
		//이름, 주소, 전화번호, 나이를 저장해서 출력하
		String name = "조창훈";
		String address = "서울 노원구 중계동";
		String number = "01054576063";
		int age = 28;
		
		System.out.println("이름:" + name + "\n주소:" + address + "\n번호:" + number + "\n나이:" + age + "\n");
		
		System.out.printf("이름:%s 주소:%s 전화번호:%s 나이:%d \n", name, address, number, age);
		System.out.printf("이름:%10s 주소:%s 전화번호:%s 나이:%d \n", name, address, number, age);
		//소수를 6째 자리까지 출력
		System.out.printf("%f\n",8.987654321);
		//소수 2째 자리까지 출력 - 3째 자리에서 반올림 
		System.out.printf("%.2f\n",8.987654321);
		
	}

}
