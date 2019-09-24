package eventhandling;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;

public class KeyFrame extends Frame {
	Label lbl;
	public KeyFrame() {
		
		setLayout(null);
		
		//레이블을 생성해서 배치
		lbl = new Label("@");
		lbl.setBounds(10, 30, 20, 20);
		add(lbl);
		
		// Frame에 윈도우 이벤트가 발생하면 EventHandler 객체에게 처리해달라고 요청
		EventHandler eventHandler = new EventHandler(lbl);
		this.addWindowListener(eventHandler);
		this.addKeyListener(eventHandler);
		
		setBounds(400,400,500,500);
		setTitle("키보드와 윈도우 이벤트 처리");
		setBackground(Color.orange);
		setVisible(true);
	}
}
