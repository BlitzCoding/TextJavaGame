public class Store extends Game {

	private static Pharmacy P = new Pharmacy();
	static String blank = "--------";
	static String decofish = "��";
	static String decoflower = "��";
	static String decostatue = "��";

	static void Buy() {
		while (true) {

			System.out.println("1. ȭ��:1000�� (�� +5)");
			System.out.println("2. ����:2000�� (�� +8)");
			System.out.println("3. ����:3000�� (�� +10)");
			System.out.println("4. �ܰ� Ȯ���մϴ�.");
			System.out.println("5. ����");
			System.out.print("������ ���� �Ͻǰǰ���?? : ");
			int menu = sc.nextInt();

			if (menu == 1) {
				System.out.println();
				System.out.println("ȭ�ʸ� �����ϼ̽��ϴ�. 1000���Դϴ�.");
				money -= 1000;
				fame += 5;
				Decoration.FlowerChanging();
				System.out.println();

				if (!P.checkmoney()) {
					System.out.println("�ܾ��� �����մϴ�.");
					System.out.println();
					break;
				}

			} else if (menu == 2) {
				System.out.println();
				System.out.println("������ �����ϼ̽��ϴ�. 2000���Դϴ�.");
				money -= 2000;
				fame += 8;
				Decoration.FishChanging();
				System.out.println();

				if (!P.checkmoney()) {
					System.out.println("�ܾ��� �����մϴ�.");
					System.out.println();
					break;
				}

			} else if (menu == 3) {

				System.out.println();
				System.out.println("������ �����ϼ̽��ϴ�. 3000���Դϴ�.");
				money -= 3000;
				fame += 10;
				Decoration.StatueChanging();
				System.out.println();

				if (!P.checkmoney()) {
					System.out.println("�ܾ��� �����մϴ�.");
					System.out.println();
					break;
				}

			} else if (menu == 4) {
				// P.printInfo();
				System.out.println("���� �ܰ�� " + money + "�Դϴ�.");
				System.out.println();
				Buy();

			} else if (menu == 5) {
				System.out.println("������ �����մϴ�.");
				System.out.println();
				GameMenu();
				break;
			} else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ֽʽÿ�.");
				System.out.println();
			}
			continue;
		}

	}

}
