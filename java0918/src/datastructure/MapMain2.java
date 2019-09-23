package datastructure;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MapMain2 {

	public static void main(String[] args) {
		// Person 클래스의 객체를 만들어서 데이터를 저장
		Person person = new Person();
		
		person.setName("조창훈");
		person.setAge(28);
		person.setJob("학생");
		
		// Person 객체의 내용을 하나씩 출력
		System.out.printf("이름:%s\n", person.getName());
		System.out.printf("나이:%s\n", person.getAge());
		System.out.printf("직업:%s\n", person.getJob());
		System.out.printf("==========\n");
		
		// Map에 데이터를 저장
		Map<String, Object> map = new LinkedHashMap<String, Object>();
		map.put("이름", "조성우");
		map.put("나이", 27);
		map.put("직업", "회사원");
		map.put("롤", "학생들 방학에는 롤은 하는것이 아니다.");
		
		// 모든 key를 전부 가져오기
		Set<String> keyset = map.keySet();
		// 데이터 출력 - map 에 변화가 생겨도 이 부분은 수정할 필요가 없습니다.
		// Apple은 데이터를 Map 구조로 넘기는 것을 많이 합니다.
		for(String key : keyset) {
			System.out.printf("%s:%s\n", key, map.get(key));
		}
	}

}
