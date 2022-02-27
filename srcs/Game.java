import java.util.Random;
import java.util.Scanner;

public class Game {

	static Scanner sc;
	static Random rand = new Random();
	static int fame = 2;
	static int money = 10000;
	static int number = 1;
	static String name; // 약국이름
	static int level = 0;

	static void GameOver() {
		System.out.println("******당신은 파산했습니다**********");
		System.exit(0);

	}

	static void GameClear() {
		System.out.println("******당신은 최고의 약사가 됐습니다**********");
		System.exit(0);
	}

	static private void GameLogin() {
		System.out.println("1. 게임시작, 2. 게임설명, 3. 게임종료");
		System.out.print("번호를 입력해 주세요 : ");
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
		System.out.print("약국 이름을 적어주세요 : ");
		name = sc.next();
		System.out.println();

		return name;

	}

	static private void InfoGame() {
		System.out.println("=========================== 게임 설명 ======================================");
		System.out.print("약국을 운영하는 게임입니다. 약의 정보를 확인하여 약의 효과와 번호를 확인하고 손님에게 적절한 약을 주면됩니다.\n"
				+ "적절한 약을 주면 명성과 돈이 올라가고 돈으로 인테리어를 구매해 약국을 꾸밀 수 있습니다. 잘못된 약을 주면 명성이 떨어집니다.\n"
				+ "명성이 100으로 오르면 게임이 클리어되며 명성 0으로 떨어지면 게임오버가 됩니다.\n");
		System.out.println("=========================================================================");
		System.out.println();
	}

	static void GameMenu() {

		System.out.println("1. 약의 정보, 2. 손님 입장, 3. 인테리어 구매, 4. 현재 내 상태");
		System.out.print("번호를 입력하세요 : ");

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
			System.out.println("============상점입니다============");
			Store.Buy();
			break;

		case 4:
			Pharmacy.printInfo();
			break;

		case 99:
			System.out.println("치트를 사용했습니다!!");
			fame = 99;
			money = 999999;
			level = 3;
			System.out.println();

			GameMenu();

		case 98:
			System.out.println("반대 치트를 사용했습니다!!");
			fame = 1;
			money = 1;
			System.out.println();

			GameMenu();

			break;

		default:
			System.out.println("다시 선택하세요");
			GameMenu();
			System.out.println();
		}

	}

	public static void main(String[] args) {
		sc = new Scanner(System.in);

		GameLogin();

	}
}
