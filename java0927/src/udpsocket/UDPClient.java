package udpsocket;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Random;
import java.util.Scanner;

public class UDPClient {

	public static void main(String[] args) {
		try {
			String [] ar = {"박대근은", "바보", "똥개다"};
			Random r = new Random(20);
			// 입력받는 스캐너
			Scanner sc = new Scanner(System.in);
			while(true) {
				Thread.sleep(3);
				//System.out.printf("전송할 내용:");
				//String msg = sc.nextLine();
				// 전송할 소켓 생성
				DatagramSocket socket = new DatagramSocket();
				// 전송할 데이터 생성
				int x = r.nextInt(ar.length);
				DatagramPacket dp = new DatagramPacket(ar[x].getBytes(), ar[x].getBytes().length, 
				InetAddress.getByName("192.168.0.151"), 7777);

				socket.send(dp);
				socket.close();
				
			}
		}catch(Exception e) {
			System.out.printf("%s\n", e.getMessage());
			e.printStackTrace();
		}

	}

}
