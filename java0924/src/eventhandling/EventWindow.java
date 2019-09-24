package eventhandling;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class EventWindow extends Frame {
	Button btn;
	public EventWindow() {
		
		/** MouseEvent **/
		this.addMouseMotionListener(new MouseMotionListener() {
			@Override
			public void mouseDragged(MouseEvent e) {
				btn.setLocation(e.getX(), e.getY());
			}
			@Override
			public void mouseMoved(MouseEvent e) {
				//btn.setLocation(e.getX(), e.getY());
			}
			
		});
		
		setLayout(null);
		btn = new Button("버튼");
		btn.setBounds(30, 30, 50, 50);
		add(btn);
		
		/** KeyboardEvent **/
		/** 이벤트처리가 너무 많아서 여기 프레임에서는 동작이 안됨 **/
		// 현재 프레임의 키보드 이벤트를 처리
		this.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {
			}
			@Override
			public void keyPressed(KeyEvent e) {
				// 문자 키를 눌렀을 때만 동작
				// getKeyChar는 대소문자 구분을 합니다.
				System.out.printf("문자:%c\n", e.getKeyChar());
				// 키보드를 누르면 무조건 동작
				// getKeyCode는 대소문자 구분을 하지 않습니다.
				System.out.printf("코드:%c\n", e.getKeyCode());
			}
			@Override
			public void keyReleased(KeyEvent e) {
			}
		});
		
		/** MouseEvent **/
		// AWT 나 SWING은 이벤트 처리를 Delegate 패턴으로 처리
		// Delegate 패턴 : 이벤트가 발생한 객체가 이벤트를 처리하지 않고 별도의 객체를 만들어서
		// 처리하도록 하는 패턴 - 위임
		btn.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {	
			}
			@Override
			public void mousePressed(MouseEvent e) {
			}
			@Override
			public void mouseReleased(MouseEvent e) {
			}
			// 마우스가 버튼위에 올라 갔을 때
			@Override
			public void mouseEntered(MouseEvent e) {
				btn.setBackground(Color.BLUE);
				btn.setForeground(Color.BLUE);
				// 마우스 이벤트가 발생한 좌표를 리턴
				System.out.printf("x:%d y:%d\n", e.getX(), e.getY());
			}
			// 마우스가 버튼위에서 벗어 났을 때
			@Override
			public void mouseExited(MouseEvent e) {
				btn.setBackground(Color.GREEN);
				btn.setForeground(Color.GREEN);
			}
		});
		setBounds(400,400,400,400);
		setTitle("이벤트 처리");
		setBackground(Color.orange);
		setVisible(true);
	}
}
