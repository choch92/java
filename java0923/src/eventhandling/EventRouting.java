package eventhandling;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventRouting extends Frame {
	Button blueBtn, greenBtn, blackBtn, redBtn;
	public EventRouting() {
		setLayout(new FlowLayout());
		
		blackBtn = new Button("검정");
		redBtn = new Button("빨강");
		blueBtn = new Button("파랑");
		greenBtn = new Button("초록");
		add(blackBtn);
		add(redBtn);
		add(blueBtn);
		add(greenBtn);
		
		
		//버튼 2개의 이벤트 처리를 2개의 객체를 생성해서 처리
		blackBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setBackground(Color.black);				
			}
		});
		redBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setBackground(Color.red);
			}
		});
		
		// 이벤트 처리 객체를 생성
		ActionListener listener = new ActionListener() {
			@Override
			// 이벤트가 발생한 객체 - e.getSource()
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == blueBtn) {
					setBackground(Color.blue);
				}else if(e.getSource() == greenBtn){
					setBackground(Color.green);
				}
			}
		};
		// 	2개 버튼의 액션 이벤트 처리를 동일한 객체에게 위임 - 이벤트 라우팅
		blueBtn.addActionListener(listener);
		greenBtn.addActionListener(listener);
		setBounds(500,500,500,500);
		setTitle("이벤트 라우팅");
		setVisible(true);
	}
}
