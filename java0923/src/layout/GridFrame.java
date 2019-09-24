package layout;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;

public class GridFrame extends Frame {
	
	// 버튼 모임
	Button [] btn;
	public GridFrame() {
		// 버튼 배열 객체 만들기
		btn = new Button[6];
		
		// 현재 프레임의 레이아웃을 설정
		// GridLayout : 행 수와 열 수를 설정해서 배치하는 레이아웃
		this.setLayout(new GridLayout(3,2));
		
		// 좌석 번호의 앞 부분을 출력할 변수
		char ch = 'A';
		// 좌석 번호의 뒷 부분을 출력할 변수
		int idx = 1;
		
		// 하나 하나의 버튼 생성
		for(int i=0; i<6; i=i+1) {
			// 줄은 몫
			ch = (char)('A' + (i/2));
			// 칸은 나머지
			idx = 1 + i % 2;
			// ch + i 를 하면 실제 더하기를 수행합니다.
			// ch + "" 를 하면 문자열이 되고 문자열 + i 를 하면 문자열
			// 위의 경우는 String.format을 이용해서 문자열을 생성하는 것이 좋음
			String btnName = String.format("%c%d", ch, idx);
			btn[i] = new Button(btnName);
			// 현재 프레임에 버튼을 추가
			add(btn[i]);
		}
		// 이 버튼은 누르지 못하도록 설정
		btn[2].setEnabled(false);
		
		
		// 크기와 보여주기 설정은 필수
		setTitle("그리드 레이아웃");
		this.setBounds(300, 300, 300, 300);
		setBackground(Color.orange);
		setVisible(true);
		
	}
}
