package swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TabFrame extends JFrame {
	JLabel lbl1, lbl2;
	public TabFrame() {
		// 탭 생성
		JTabbedPane tab = new JTabbedPane();
		
		JPanel panel1 = new JPanel();
		
		ImageIcon icon1 = new ImageIcon("./01.gif");
		lbl1=new JLabel(icon1);
		ImageIcon icon2 = new ImageIcon("./02.gif");
		lbl2=new JLabel(icon2);
		
		/** JOptionPane **/
		JButton btn = new JButton("메뉴결정");
		// btn을 클릭하면 메시지 박스를 출력
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				/**
				JOptionPane.showMessageDialog(null, "오전 삼겹살은 진리");
				JOptionPane.showMessageDialog(null, "피자는 뻐큐", "삼겹살!",
						JOptionPane.ERROR_MESSAGE);
						**/
				/**
				int r = JOptionPane.showConfirmDialog(null, "삭제", "정말로삭제?",
						JOptionPane.YES_NO_OPTION);
				// 비교할 때 정수값을 비교하는 것보다는 Field로 비교하는 것이 좋습니다.
				// 운영체제에 따라서 정수값은 변경될 수 있습니다.
				if(r==JOptionPane.YES_OPTION) {
					System.out.printf("예를선택\n");
					panel1.add(lbl1);
				}else
					System.out.printf("아니오선택\n");
					panel1.add(lbl2);
					**/
				String input = JOptionPane.showInputDialog(null, "밥메뉴선택");
				if(input ==null) {
					System.out.printf("족발을 선택하셨습니다.!!!\n");
					panel1.add(lbl2);
				}
				else {
					System.out.printf("%s을 선택하셨습니다.!!!\n",input.trim().toUpperCase());
					panel1.add(lbl1);
					
				}
				
				// javascript에서 제공되는 대화상자도 동일한 방법으로 사용
			}
		});
		panel1.add(btn);
		
		tab.add("아침식사", panel1);
		// 탭을 현재 화면에 추가
		add(tab);
		
		JPanel panel2 = new JPanel();
		JTextField tf = new JTextField(20);
		panel2.add(tf);
		
		tab.add("점심식사", panel2);
		
		/** Common Dialog - 공통 대화상자 **/
		JPanel panel3 = new JPanel();
		// 버튼 1개와 TextArea를 배치해서 버튼을 누르면 파일대화상자를 출력하고 선택한 파일이름들을 TextArea에 출력
		JButton btnFile = new JButton("파일 가져오기");
		panel3.add(btnFile);
		
		// anonymous class 에서 사용가능하도록 하기 위해서 final을 붙입니다.
		// anonymous class 에서는 자신을 포함한 메소드의 지역변수를 사용할 수 없습니다.
		final JTextArea ta = new JTextArea(30,40);
		panel3.add(ta);
		
		btnFile.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// 파일 대화상자 만들기
				JFileChooser fc = new JFileChooser();
				// 여러 개 선택 가능하도록 하기
				fc.setMultiSelectionEnabled(true);
				// 파일 대화상자 출력
				int r = fc.showOpenDialog(null);
				// 확인을 눌렀을 때
				if(r == JFileChooser.APPROVE_OPTION) {
					// 선택한 파일 목록 가져오기
					File [] files = fc.getSelectedFiles();
					// 문자열을 heap에 저장해서 문자열에 직접 연산을 하는 클래스의 객체 생성
					// String은 정적 영역에 문자열을 저장하고 작업을 할 때는 복사해서 수행하는 클래스
					StringBuilder sb = new StringBuilder();
					/**String disp = "";**/
					for(File file : files) {
						/**
						// 파일이름 :file.getName();
						disp = String.format("%s%s\n", disp, file.getName());
						ta.setText(disp);
						**/
						sb.append(file.getName());
						sb.append("\n");
					}
					//ta.setText(disp);
					//System.out.printf("%s\n", file.getName().trim());
					ta.setText(sb.toString());
				}else {
					ta.setText("선택한 파일이 없습니다.\n");
				}
			}
		});
		
		tab.add("파일 대화상자", panel3);
				
		// 메뉴 표시줄 만들기
		JMenuBar menuBar = new JMenuBar();
		JMenu menu = new JMenu("메뉴");
		
		JMenuItem item1 = new JMenuItem("대화상자 출력");
		item1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "메뉴 클릭");
			}
		});
		// ALT + M 그리고 D를 누르면 메뉴가 실행
		// 윈도우즈에서 실행
		menu.setMnemonic('m');
		item1.setMnemonic('d');
		
		menu.add(item1);
		menuBar.add(menu);
		setJMenuBar(menuBar);
		
		setBounds(100,100,1000,700);
		// 닫기 버튼을 누를 때 종료해주는 기능 추가
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("탭만들기");
		setVisible(true);
		
	}
}
