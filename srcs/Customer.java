import java.util.Random;

public class Customer extends Game {

	static void CustomCome(int number) {

		System.out.println();
		System.out.print("�մ� " + number + " : ");
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

			System.out.println("������ �� �ִ°� ���ƿ�");
			System.out.print("� ���� �ٱ��? : ");
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

			System.out.println("���� �� :" + money);
			System.out.println("���� �� :" + fame);

			break;

		case 1:
			System.out.println("���� ������");
			System.out.print("� ���� �ٱ��? : ");

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

			System.out.println("���� �� :" + money);
			System.out.println("���� �� :" + fame);

			break;

		case 2:
			System.out.println("������ ��ݴ� �ո��� �װ� ����ŷ���.");
			System.out.print("� ���� �ٱ��? : ");

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

			System.out.println("���� �� :" + money);
			System.out.println("���� �� :" + fame);

			break;

		case 3:
			System.out.println("���� �����ϰ� ��������");
			System.out.print("� ���� �ٱ��? : ");
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

			System.out.println("���� �� :" + money);
			System.out.println("���� �� :" + fame);

			break;

		case 4:
			System.out.println("�๰�� �ȸ����.. ů!");
			System.out.print("� ���� �ٱ��? : ");
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

			System.out.println("���� �� :" + money);
			System.out.println("���� �� :" + fame);

			break;

		case 5:
			System.out.println("���� ���� �� ���ѵ� �� �������� �� ���");
			System.out.print("� ���� �ٱ��? : ");

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

			System.out.println("���� �� :" + money);
			System.out.println("���� �� :" + fame);

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
