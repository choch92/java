package java0917;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class BoardMain {

	public static void main(String[] args) {
		// Board 클래스의 객체 여러개를 저장할 수 있는 자료구조를 생성
		// 배열(크기변경이 안됨), ArrayList(읽는 속도는 빠름), LinkedList(삽입삭제가 빠름)
		// 테이블 만들기
		List<Board> list = new LinkedList<>();
		// Board 클래스의 객체를 만들어서 데이터를 설정한 후 list에 삽입하기
		// 이 부분은 데이터베이스에서 읽어오던가 파일에서 읽어오는 형태로 변경
		Board board = new Board();
		board.setNum(1);
		board.setTitle("공지");
		board.setWriter("조창훈");
		board.setRegdate("2019.09.17");
		list.add(board);
		
		board = new Board();
		board.setNum(0);
		board.setTitle("업데이트");
		board.setWriter("조창훈");
		board.setRegdate("2019.09.16");
		list.add(board);
		
		board = new Board();
		board.setNum(2);
		board.setTitle("오류");
		board.setWriter("조창훈");
		board.setRegdate("2019.09.18");
		list.add(board);
		
		// 정렬
		list.sort(new Comparator<Board>() {

			@Override
			public int compare(Board o1, Board o2) {
				return o1.getRegdate().compareTo(o2.getRegdate());
				//return o1.getNum() - o2.getNum();
			}
		});
		// 출력
		System.out.printf("%-10s%-15s%-20s%-10s\n", "글 번호", "글 제목", "글 작성자", "글쓴 날짜");
		for(Board b : list) {
			System.out.printf("%-10s%-15s%-20s%-10s\n", 
					b.getNum(), b.getTitle(), b.getWriter(), b.getRegdate());
		}
	}

}
