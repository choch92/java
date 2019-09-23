package java0917;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class PersonListMain {

	public static void main(String[] args) {
		// 테이블 구조 만들기
		List<Person> list = new ArrayList<>();
		// 테이블에 삽입할 데이터를 생성
		Person person = new Person();
		person.setName("조창훈");
		person.setPhone("01054576063");
		person.setAddress("서울시 노원구 중계동");
		person.setAge(28);
		
		// 테이블에 데이터를 삽입하기
		list.add(person);
		
		// 테이블에 삽입할 데이터를 생성
		person = new Person();
		person.setName("조성우");
		person.setPhone("01020656063");
		person.setAddress("서울시 노원구 중계동");
		person.setAge(27);

		// 테이블에 데이터를 삽입하기
		list.add(person);
		
		// 데이터 정렬(sort)
		list.sort(new Comparator<Person>() {
			// 나이를 가지고 비교 
			@Override
			public int compare(Person o1, Person o2) {
				return o1.getAge() - o2.getAge();
			}		
		});	
		// 타이틀을 출력
		System.out.printf("%-10s%-15s%-20s%-3s\n", "이름", "전화번호", "주소", "나이");
		// Fast Enumeration을 이용한 List 접근
		for(Person p : list) {
			System.out.printf("%-9.5s%-17s%-18s%-3d\n", 
					p.getName(), p.getPhone(), p.getAddress(), p.getAge());
		}
	}
}
