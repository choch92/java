package java0906;

public class Main {

	public static void main(String[] args) {
		
		//Student 클래스의 객체 만들기 
		//Student 클래스의 객체를 생성하고 그 주소를 student1이라는 변수에 대입 
		Student student1 = new Student();
		Student student2 = new Student();
		
		//studentName이라는 인스턴스 변수에 값을 대입 
		student1.studentName = "연제민";
		student2.studentName = "조창훈";
		
		//student1.num = "10";
		//student1.phone = "010";//private는 자신의 클래스에서만 사용 가능 
		
		student1.schoolName = "중평초등학교";
		student2.schoolName = "중원초등학교";
		
		System.out.printf("%s\n", student1.studentName);
		System.out.printf("%s\n", student2.studentName);
		System.out.printf("%s\n", student1.schoolName);
		System.out.printf("%s\n", student2.schoolName);
		System.out.printf("=============\n");
		
		//Method 호출 불러오기 
		//MethodClass의 인스턴스 생성 
		MethodClass instance = new MethodClass();
		//Method를 호출
		instance.func();
		System.out.printf("=============\n");
		//매개변수가 없는 메소드 호출 
		instance.noArg();
		System.out.printf("=============\n");
		//매개변수가 있는 메소드 호출
		instance.oneArg(2);
		System.out.printf("=============\n");
		
		int k = 0;
		//메소드의 매개변수로 기본형 데이터를 넘겨주는 경우 
		//메소드를 호출해도 데이터는 변경되지 않습니다.
		instance.value(k);
		System.out.printf("k:%d\n",k);
		System.out.printf("=============\n");
		//메소드의 매개변수로 기본형이 아닌 데이터를 넘겨주면 메소드를 호출하고 난 후 데이터가 변경될 수 있습니다.
		int [] br = {30, 40};
		instance.reference(br);
		System.out.printf("br[0] : %d\n", br[0]);
		//동일한 이름이지만 매개변수의 모양이 다른 메소드 호출
		instance.add(10, 20);
		instance.add(20.8, 29.1);
		System.out.printf("=============\n");
		instance.sum(100, 300);
		instance.sum(100, 500, 300);
		instance.sum(100, 500, 300, 400);
		System.out.printf("=============\n");
		
		int result = instance.returnadd(300, 500);
		result = instance.returnadd(result,  800);
		System.out.printf("결과:%d\n", result);
		//결과를 리턴하는 메소드는 다른 메소드의 매개변수가 될 수 있습니다.
		System.out.printf("결과:%d\n", instance.returnadd(instance.returnadd(300,200),400));
		System.out.printf("=============\n");
		
		Fibonacci obj = new Fibonacci();
		System.out.printf("%d\n", obj.fibo1(10));
		System.out.printf("%d\n", obj.fibo1(15));
		System.out.printf("=============\n");
		System.out.printf("%d\n", obj.fibo2(10));
		System.out.printf("%d\n", obj.fibo2(15));
		System.out.printf("=============\n");
		
		ThisMethod thisM = new ThisMethod();
		thisM.thisMethod();
	}

}
