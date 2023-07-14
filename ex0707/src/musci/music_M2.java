package musci;

import java.util.ArrayList;
import java.util.Scanner;

import javazoom.jl.player.MP3Player;

public class music_M2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		boolean onoff = true;
		musicController con = new musicController();

		while (onoff) {
			System.out.print("[1]노래재생 [2]다음곡 [3]이전곡 [4]정지 [5]종료 >> ");
			int n = sc.nextInt();

			switch (n) {

			case 1:
				music m = con.play();
				System.out.println("========재생중인 노래========");
				System.out.println("노래 재목 \t 가수");
				System.out.println(m.getTitle() + "\t" + m.getSinger());
				break;

			case 2:

				music m1 = con.next();

				if (m1 == null) {
					System.out.println("다음곡 없음");
					break;
				} else {
					System.out.println("========재생중인 노래========");
					System.out.println("노래 재목 \t 가수");
					System.out.println(m1.getTitle() + "\t" + m1.getSinger());
					break;
				}

			case 3:
				music m11 = con.before();

				if (m11 == null) {
					System.out.println("이전곡 없음");
					break;
				} else {
					System.out.println("========재생중인 노래========");
					System.out.println("노래 재목 \t 가수");
					System.out.println(m11.getTitle() + "\t" + m11.getSinger());

					break;
				}

			case 4:
				con.stop();
				System.out.println("정지");
				break;

			case 5:
				con.stop();
				System.out.println("종료");
				onoff = false;
				break;

			default:
				break;

			}

		}

	}
}
