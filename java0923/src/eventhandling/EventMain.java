package eventhandling;

import java.util.ArrayList;

public class EventMain {

	public static void main(String[] args) {
		//new EventFrame();
		//new EventRouting();
		//new ItemFrame();
		// 데이터의 리스트
		ArrayList<String> list = new ArrayList<>();
		list.add("업무 분석");
		list.add("설계");
		list.add("구현");
		list.add("테스트");
		list.add("배포 또는 이행");
		list.add("유지보수");
		// 삭제할 항목의 인덱스 리스트
		ArrayList<Integer> deleteList = new ArrayList<>();
		deleteList.add(1);
		deleteList.add(3);
		deleteList.add(5);
		
		// 리스트에서 데이터를 삭제하는 메소드 remove(int index)
		// 데이터의 리스트를 가지고 인덱스 리스트에 해당하는 데이터를 삭제
		/**
		for(int idx : deleteList) {
			//System.out.printf("%d\n", idx);
			list.remove(idx);
		}
		**/
		// 리스트에서 여러 개를 삭제할 때는 뒤에서부터 삭제를 하던가
		// 삭제할 때마다 인덱스를 변경하던가 해야 합니다.
		for(int i=deleteList.size()-1; i>=0; i=i-1) {
			int idx = deleteList.get(i);
			list.remove(idx);
		}
		for(String temp : list) {
			System.out.printf("%s\n", temp);
		}
	}
}
