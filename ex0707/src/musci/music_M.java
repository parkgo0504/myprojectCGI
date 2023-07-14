package musci;

import java.util.ArrayList;
import java.util.Scanner;

import javazoom.jl.player.MP3Player;

public class music_M {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		boolean onoff = true;
		String path = "C:\\\\Users\\\\smhrd\\\\Desktop\\\\java\\\\ex0707\\\\player실습파일\\\\player실습파일\\\\";
		int i = 0;
		ArrayList<music> mp3 = new ArrayList<music>();
		MP3Player mp = new MP3Player();
		mp3.add(new music("Attention", "뉴진스", path + "Attention.mp3"));
		mp3.add(new music("Butterfly", "전영호", path + "Butterfly.mp3"));
		mp3.add(new music("Lovedive", "아이브", path + "Lovedive.mp3"));
		mp3.add(new music("Nxde", "아이들", path + "Nxde.mp3"));
		mp3.add(new music("Rushhour", "크러쉬", path + "Rushhour.mp3"));

		while (onoff) {
			System.out.print("[1]노래재생 [2]다음곡 [3]이전곡 [4]정지 [5]종료 >> ");
			int n = sc.nextInt();

			switch (n) {

			case 1:

				if (mp.isPlaying()) {
					mp.stop();
				}
				System.out.println("========재생중인 노래========");
				System.out.println("노래 재목 \t 가수");
				System.out.println(mp3.get(i).getTitle() + "\t" + mp3.get(i).getSinger());
				mp.play(mp3.get(i).getPath());
				break;

			case 2: {
				if (mp.isPlaying()) {
					mp.stop();
				}
				if (i >= 4) {
					System.out.println("다음곡 없음");
					break;
				}
				i++;
				System.out.println("========재생중인 노래========");
				System.out.println("노래 재목 \t 가수");
				System.out.println(mp3.get(i).getTitle() + "\t" + mp3.get(i).getSinger());
				mp.play(mp3.get(i).getPath());
				break;
			}
			case 3: {
				if (mp.isPlaying()) {
					mp.stop();
				}

				if (i <= 0) {
					System.out.println("이전곡 없음");
					break;
				}
				i--;

				System.out.println("========재생중인 노래========");
				System.out.println("노래 재목 \t 가수");
				System.out.println(mp3.get(i).getTitle() + "\t" + mp3.get(i).getSinger());
				mp.play(mp3.get(i).getPath());
				break;
			}
			case 4: {
				if (mp.isPlaying()) {
					mp.stop();
				}
				System.out.println("정지");
				break;
			}
			case 5: {
				if (mp.isPlaying()) {
					mp.stop();
				}
				System.out.println("종료");
				onoff = false;
				break;
			}
			default:
				break;

			}

		}

	}
}
