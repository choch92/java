package layout;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.util.Random;

public class NullLayoutFrame extends Frame {
	Button btn;
	// 초기좌표 설정
	int x=10, y=20;
	public NullLayoutFrame() {
		// 레이아웃을 null로 설정
		setLayout(null);
		
		btn = new Button("버튼");
		// Layout이 null일 때는 위치와 크기를 직접 설정
		btn.setBounds(x,y,100,100);
		add(btn);
		setTitle("NullLayout사용하기");
		setBackground(Color.orange);
		setBounds(500,500,500,500);
		setVisible(true);
		
		// 스레드를 만들고 실행
		Thread th = new Thread() {
			boolean flag = false;
			public void run() {
				while(true) {
					try {
						Thread.sleep(500);
						Random r = new Random();
						x = r.nextInt(400);
						y = r.nextInt(400);
						//x = x + 10;
						//y = y + 10;
						btn.setLocation(x, y);
						btn.setVisible(flag);
						flag = !flag;

						/**if(x == 400 || y == 400) {
							btn.setLabel("골인");
							break;
						}**/
					}catch(Exception e) {}
				}
			}
		};
		th.start();
	}
}
