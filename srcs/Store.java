public class Store extends Game {

	private static Pharmacy P = new Pharmacy();
	static String blank = "--------";
	static String decofish = "◀";
	static String decoflower = "★";
	static String decostatue = "♬";

	static void Buy() {
		while (true) {

			System.out.println("1. 화초:1000원 (명성 +5)");
			System.out.println("2. 어항:2000원 (명성 +8)");
			System.out.println("3. 동상:3000원 (명성 +10)");
			System.out.println("4. 잔고를 확인합니다.");
			System.out.println("5. 종료");
			System.out.print("무엇을 구매 하실건가요?? : ");
			int menu = sc.nextInt();

			if (menu == 1) {
				System.out.println();
				System.out.println("화초를 선택하셨습니다. 1000원입니다.");
				money -= 1000;
				fame += 5;
				Decoration.FlowerChanging();
				System.out.println();

				if (!P.checkmoney()) {
					System.out.println("잔액이 부족합니다.");
					System.out.println();
					break;
				}

			} else if (menu == 2) {
				System.out.println();
				System.out.println("어항을 선택하셨습니다. 2000원입니다.");
				money -= 2000;
				fame += 8;
				Decoration.FishChanging();
				System.out.println();

				if (!P.checkmoney()) {
					System.out.println("잔액이 부족합니다.");
					System.out.println();
					break;
				}

			} else if (menu == 3) {

				System.out.println();
				System.out.println("동상을 선택하셨습니다. 3000원입니다.");
				money -= 3000;
				fame += 10;
				Decoration.StatueChanging();
				System.out.println();

				if (!P.checkmoney()) {
					System.out.println("잔액이 부족합니다.");
					System.out.println();
					break;
				}

			} else if (menu == 4) {
				// P.printInfo();
				System.out.println("현재 잔고는 " + money + "입니다.");
				System.out.println();
				Buy();

			} else if (menu == 5) {
				System.out.println("상점을 종료합니다.");
				System.out.println();
				GameMenu();
				break;
			} else {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주십시오.");
				System.out.println();
			}
			continue;
		}

	}

}
