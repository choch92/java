package awt;

import java.awt.Color;
import java.awt.Frame;

public class MyFrame extends Frame {
	// 배경색이 될 배열
	Color[] colors = { Color.DARK_GRAY, Color.orange, Color.CYAN, Color.magenta };
	String[] titles = { "배달의민족", "달의민족배", "의민족배달", "민족배달의" };

	// 인덱스 변수
	int idx = 0;

	public MyFrame() {
		// 옵션 설정
		this.setBackground(Color.DARK_GRAY);
		this.setTitle("오늘 저녁은 배달의 민족\n");
		setSize(200, 200);
		setLocation(100, 100);
		setVisible(true);

		// 색상을 변경하는 스레드
		Thread th = new Thread() {
			public void run() {
				while (true) {
					idx = idx + 1;
					try {
						Thread.sleep(500);
						// setBackground(colors[idx%colors.length]);
						setTitle(titles[idx % titles.length]);
					} catch (Exception e) {
					}
				}
			}
		};
		th.start();

		try {
			// 5초 후
			Thread.sleep(5000);
			setBackground(Color.BLUE);
			Thread.sleep(5000);
			setBackground(Color.green);
		} catch (Exception e) {
		}
	}
}
