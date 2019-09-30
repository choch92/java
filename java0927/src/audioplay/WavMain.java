package audioplay;

import java.io.FileInputStream;

import javazoom.jl.player.Player;

public class WavMain {

	public static void main(String[] args) {
		try{
			/** wav 오디오 재생 방법
			// 로컬 파일의 URL
			//URL url = new URL("file:////Users/503a2/Desktop/resource-master/pottery_workshop.wav");
			URL url = new URL("file:./pottery_workshop.wav");
			AudioClip audio = Applet.newAudioClip(url);
			audio.play();
			**/
			// mp3 재생방법
			Player player = new Player(new FileInputStream("./Twinkle.mp3"));
			player.play();
			
			// mp3 재생은 javafx 패키지의 MediaPlayer 클래스로도 가능(java 1.12 version부터 가능)
			/**javafx.scene.media m = new javafx.scene.media(""./Twinkle.mpe");
			 * MediaPlayer p = new MediaPlayer(m);
			 * p.play();
			 */
		}catch(Exception e) {
			System.out.printf("%s\n", e.getMessage());
		}
	}
}
