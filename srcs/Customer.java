import java.util.Random;

public class Customer extends Game {

	static void CustomCome(int number) {

		System.out.println();
		System.out.print("손님 " + number + " : ");
		Sympton();
		System.out.println();
		Game.number++;
		GameMenu();

	}

	private static void Sympton() {

		Pharmacy p1 = new Pharmacy();

		Answer good = new Answer();
		Answer bad = new Answer();

		Random rand = new Random();
		int order = rand.nextInt(6);

		switch (order) {
		case 0:

			System.out.println("두통이 좀 있는거 같아요");
			System.out.print("어떤 약을 줄까요? : ");
			int a1 = sc.nextInt();
			System.out.println();
			if (a1 == 1) {
				System.out.println(good.GoodAnswer());
				money += 500;
				fame += 1;
			} else {
				System.out.println(bad.BadAnswer());
				fame -= 1;
			}

			System.out.println("현재 돈 :" + money);
			System.out.println("현재 명성 :" + fame);

			break;

		case 1:
			System.out.println("속이 쓰려요");
			System.out.print("어떤 약을 줄까요? : ");

			int a2 = sc.nextInt();
			System.out.println();

			if (a2 == 2) {
				System.out.println(good.GoodAnswer());
				money += 700;
				fame += 1;
			} else {
				System.out.println(bad.BadAnswer());
				fame -= 1;
			}

			System.out.println("현재 돈 :" + money);
			System.out.println("현재 명성 :" + fame);

			break;

		case 2:
			System.out.println("오른쪽 어금니 잇몸이 붓고 욱씬거려요.");
			System.out.print("어떤 약을 줄까요? : ");

			int a3 = sc.nextInt();
			System.out.println();

			if (a3 == 3) {
				System.out.println(good.GoodAnswer());
				money += 800;
				fame += 1;
			} else {
				System.out.println(bad.BadAnswer());
				fame -= 1;
			}

			System.out.println("현재 돈 :" + money);
			System.out.println("현재 명성 :" + fame);

			break;

		case 3:
			System.out.println("눈이 건조하고 따가워요");
			System.out.print("어떤 약을 줄까요? : ");
			int a4 = sc.nextInt();
			System.out.println();
			if (a4 == 4) {
				System.out.println(good.GoodAnswer());
				money += 1200;
				fame += 1;
			} else {
				System.out.println(bad.BadAnswer());
				fame -= 1;
			}

			System.out.println("현재 돈 :" + money);
			System.out.println("현재 명성 :" + fame);

			break;

		case 4:
			System.out.println("콧물이 안멈춰요.. 킁!");
			System.out.print("어떤 약을 줄까요? : ");
			int a5 = sc.nextInt();
			System.out.println();
			if (a5 == 5) {
				System.out.println(good.GoodAnswer());
				money += 700;
				fame += 1;
			} else {
				System.out.println(bad.BadAnswer());
				fame -= 1;
			}

			System.out.println("현재 돈 :" + money);
			System.out.println("현재 명성 :" + fame);

			break;

		case 5:
			System.out.println("요즘 몸이 좀 허한데 약 괜찮은거 좀 줘봐");
			System.out.print("어떤 약을 줄까요? : ");

			int a6 = sc.nextInt();
			System.out.println();

			if (a6 == 6) {
				System.out.println(good.JinSangGoodAnswer());
				money += 1500;
				fame += 2;
			} else {
				System.out.println(bad.JinSangBadAnswer());
				fame -= 3;
			}

			System.out.println("현재 돈 :" + money);
			System.out.println("현재 명성 :" + fame);

			break;

		}

		if (fame < 1) {
			GameOver();
		}

		if (level > 2) {
			GameClear();
		}

		p1.levelUp();

	}

}
