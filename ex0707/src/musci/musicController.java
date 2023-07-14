package musci;

import java.util.ArrayList;

import javazoom.jl.player.MP3Player;

public class musicController {

	// Controller : 데이터 흐름 제어(음악 재생, 다음곡 넘기기, 음악정지)

	// 1.필드

	private MP3Player mp = new MP3Player();
	private String path = "C:\\\\Users\\\\smhrd\\\\Desktop\\\\java\\\\ex0707\\\\player실습파일\\\\player실습파일\\\\";
	private ArrayList<music> mp3 = new ArrayList<music>();
	private int i = 0;

	// 2.메소드
	// 객체를 생성하는 순가에 뮤직플레이리스트를 추가하기
	// 기본 생성자 사용
	// 생성자 특징 1. 리턴타입 지정 x 2. 메소드명 == 클래스명

	public musicController() {

		mp3.add(new music("Attention", "뉴진스", path + "Attention.mp3"));
		mp3.add(new music("Butterfly", "전영호", path + "Butterfly.mp3"));
		mp3.add(new music("Lovedive", "아이브", path + "Lovedive.mp3"));
		mp3.add(new music("Nxde", "아이들", path + "Nxde.mp3"));
		mp3.add(new music("Rushhour", "크러쉬", path + "Rushhour.mp3"));

	}

	// 재생하기

	public music play() {
		if (mp.isPlaying()) {
			mp.stop();
		}

		mp.play(mp3.get(i).getPath());

		return mp3.get(i);

	}

	// 정지하기
	public void stop() {
		if (mp.isPlaying()) {
			mp.stop();
		}

	}

	// 다음곡 재생하기

	public music next() {

		if (i < 4) {
			i++;
			mp.play(mp3.get(i).getPath());

			return mp3.get(i);

		} else {
			stop();
			return null;
		}

	}

	// 이전곡 재생하기

	public music before() {

		if (i > 0) {
			i--;
			mp.play(mp3.get(i).getPath());

			return mp3.get(i);

		} else {
			stop();
			return null;
		}

	}
}
