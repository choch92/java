package awt;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwitchFrame extends Frame {
	// 화면 전환에 사용할 버튼 2개 만들기
	Button page1, page2;
	// 화면으로 사용할 패널 2개
	Panel p1, p2;
	// Frame 의 변수를 생성
	Frame parent;
	
	public SwitchFrame() {
		// this를 parent에 대입
		parent = this;
		
		// 위에 버튼을 배치
		Panel buttonPanel = new Panel();
		page1 = new Button("1Page");
		buttonPanel.add(page1);
		page2 = new Button("2Page");
		buttonPanel.add(page2);
		// buttonPanel을 북쪽에 배치
		add("North", buttonPanel);
		
		// 가운데 영역에 2개의 패널을 배치
		// BorderLayout은 동일한 영역에 2개의 컴포넌트를 배치하면 겹쳐서 출력이 됨	
		p1 = new Panel();
		p1.setBackground(Color.orange);
		add(p1);
		
		p2 = new Panel();
		p2.setBackground(Color.magenta);
		// p2.setVisible(false);
		// setVisible이 false이면 화면에서 사라짐
		// 이전에 추가한 곳에 다시 add를 하면 이전 내용은 사라지고 현재 내용이 출력이 됩니다.
		// add(p2);
		
		// 위치 크기 타이틀을 설정해서 화면에 출력
		setBounds(300, 300, 400, 400);
		setTitle("화면 전환처럼 보이기");
		setVisible(true);
		
		/** 다음주에 배울 것임 **/
		page1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// PC용에서는 버튼을 무효화하는 방법을 많이 사용하고
				// 스마트폰에서는 버튼을 안보이게 하는 방법을 많이 사용
				page1.setEnabled(false);
				page2.setEnabled(true);
				// p1.setVisible(false);
				parent.add(p2);
			}
		});
		page2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {				
				page1.setEnabled(true);
				page2.setEnabled(false);
			}
		});
	}
}
