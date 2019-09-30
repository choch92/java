package socketprogramming;

import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Random;
import java.util.Scanner;

public class TCPClinet {

	public static void main(String[] args) {
		try {
			String [] ar = {"1234", "2193840", "875189043750", "1234789123", "14857", "2938410"};
			Random r = new Random(20);
			// 클라이언트 소켓 생성
			InetAddress serverIP = InetAddress.getByName("192.168.0.171");
			Socket socket = new Socket(serverIP, 8000);
			// 기록을 해주는 스트림을 생성
			PrintWriter pw = new PrintWriter(socket.getOutputStream());
			
			// 메시지 입력받기
			Scanner sc = new Scanner(System.in);
			System.out.printf("전송할 메시지:");
			String msg = sc.nextLine();
			
			// 메시지 전송
			for(int x=0; ; x= x+1) {
				pw.printf("%s\n", ar[r.nextInt(ar.length)]);
				pw.flush();
			}
			//pw.println(msg);
			//pw.flush();
			//sc.close();
			//pw.close();
			//socket.close();
			
		}catch(Exception e) {
			System.out.printf("%s\n", e.getMessage());
			e.printStackTrace();
		}

	}

}
