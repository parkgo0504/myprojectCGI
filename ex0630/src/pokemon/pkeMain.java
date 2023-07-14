package pokemon;

import java.util.Scanner;

public class pkeMain {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n, s;

		pke pa = new pke("파이리", "불", "불꽃~~", 300, 1000);
		pke kk = new pke("꼬부기", "물", "스트롱 물~~", 100, 2000);

		int hp1 = pa.getHp(), hp2 = kk.getHp(); // 파이리,꼬부기

		while (pa.getHp() > 0 && kk.getHp() > 0) {

			System.out.print("포켓몬 선택 : >> 1(파이리) 2(꼬부기) : ");
			n = sc.nextInt();
			if (n == 1) {
				System.out.println("선택한 포켓몬은 : " + pa.getName());
				System.out.println();
				System.out.print("공격 or 스킬 : >> 1(공격) 2(스킬) : ");
				s = sc.nextInt();
				if (s == 1) {
					System.out.println("================공격================");
					hp2 -= pa.getAtk();
					System.out.println("파이리 일반 공격 >> " + pa.getAtk() + " 꼬북이 남은 체력 :" + hp2);

				} else {
					System.out.println("================스킬 공격================");
					hp2 -= (int) (pa.getAtk() * 1.5);
					System.out.println("파이리 스킬 공격 >> " + pa.getSkill() + "꼬북이 남은 체력 :" + hp2);
					System.out.println();
				}

			} else {
				System.out.print("공격 or 스킬 : >> 1(공격) 2(스킬) : ");
				s = sc.nextInt();
				if (s == 1) {
					System.out.println("================공격================");
					hp1 -= kk.getAtk();
					System.out.println("꼬북이 일반 공격 >> " + kk.getAtk() + " 꼬북이 남은 체력 :" + hp1);
					System.out.println();

				} else {
					System.out.println("================스킬 공격================");
					hp1 -= (int) (kk.getAtk() * 1.5);
					System.out.println("꼬북이 스킬공격 공격 >> " + kk.getSkill() + " 꼬북이 남은 체력 :" + hp1);
					System.out.println();
				}

			}

		}
	}
}
