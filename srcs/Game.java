import java.util.Random;
import java.util.Scanner;

public class Game {

	static Scanner sc;
	static Random rand = new Random();
	static int fame = 2;
	static int money = 10000;
	static int number = 1;
	static String name; // �౹�̸�
	static int level = 0;

	static void GameOver() {
		System.out.println("******����� �Ļ��߽��ϴ�**********");
		System.exit(0);

	}

	static void GameClear() {
		System.out.println("******����� �ְ��� ��簡 �ƽ��ϴ�**********");
		System.exit(0);
	}

	static private void GameLogin() {
		System.out.println("1. ���ӽ���, 2. ���Ӽ���, 3. ��������");
		System.out.print("��ȣ�� �Է��� �ּ��� : ");
		int first = sc.nextInt();
		System.out.println();

		switch (first) {
		case 1:
			SetName();
			GameMenu();
			break;
		case 2:
			InfoGame();
			GameLogin();
			break;
		case 3:
			System.exit(0);
		}
	}

	static public String SetName() {
		System.out.println();
		System.out.print("�౹ �̸��� �����ּ��� : ");
		name = sc.next();
		System.out.println();

		return name;

	}

	static private void InfoGame() {
		System.out.println("=========================== ���� ���� ======================================");
		System.out.print("�౹�� ��ϴ� �����Դϴ�. ���� ������ Ȯ���Ͽ� ���� ȿ���� ��ȣ�� Ȯ���ϰ� �մԿ��� ������ ���� �ָ�˴ϴ�.\n"
				+ "������ ���� �ָ� ���� ���� �ö󰡰� ������ ���׸�� ������ �౹�� �ٹ� �� �ֽ��ϴ�. �߸��� ���� �ָ� ���� �������ϴ�.\n"
				+ "���� 100���� ������ ������ Ŭ����Ǹ� �� 0���� �������� ���ӿ����� �˴ϴ�.\n");
		System.out.println("=========================================================================");
		System.out.println();
	}

	static void GameMenu() {

		System.out.println("1. ���� ����, 2. �մ� ����, 3. ���׸��� ����, 4. ���� �� ����");
		System.out.print("��ȣ�� �Է��ϼ��� : ");

		int num = sc.nextInt();

		switch (num) {
		case 1:
			Drug.DrugShow();
			break;
		case 2:
			Customer.CustomCome(number);
			break;
		case 3:
			System.out.println();
			System.out.println("============�����Դϴ�============");
			Store.Buy();
			break;

		case 4:
			Pharmacy.printInfo();
			break;

		case 99:
			System.out.println("ġƮ�� ����߽��ϴ�!!");
			fame = 99;
			money = 999999;
			level = 3;
			System.out.println();

			GameMenu();

		case 98:
			System.out.println("�ݴ� ġƮ�� ����߽��ϴ�!!");
			fame = 1;
			money = 1;
			System.out.println();

			GameMenu();

			break;

		default:
			System.out.println("�ٽ� �����ϼ���");
			GameMenu();
			System.out.println();
		}

	}

	public static void main(String[] args) {
		sc = new Scanner(System.in);

		GameLogin();

	}
}
