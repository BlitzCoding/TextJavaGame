public class Drug extends Game {

	static void DrugShow() {

		System.out.println();
		System.out.println("1. Ÿ�̷���, 2. �Ժ���, 3. �̰�ź, 4. �ϸ޷�, 5. �ڸ�Ű��, 6. ��Ÿ��V, 7.�ڷΰ���");
		System.out.print("� ���� �˰� �����Ű���? : ");
		int drugInfo = sc.nextInt();

		switch (drugInfo) {
		case 1:
			TyleInfo();
			DrugShow();

			break;
		case 2:
			GavisInfo();
			DrugShow();

			break;
		case 3:
			EgaInfo();
			DrugShow();

			break;
		case 4:
			HameInfo();
			DrugShow();

			break;
		case 5:
			ComeInfo();
			DrugShow();

			break;
		case 6:
			VitaInfo();
			DrugShow();

			break;
		case 7:
			GameMenu();
			System.out.println();
			break;
		default:
			System.out.println("�ٽ� �����ϼ���");
		}

	}

	private static void TyleInfo() { // Ÿ�̷���
		System.out.println(">> ���뿡 ȿ���� �ִ�");
	}

	private static void GavisInfo() { // �Ժ���
		System.out.println(">> �Ӿ����� ȿ���� �ִ�.");
	}

	private static void EgaInfo() { // �̰�ź
		System.out.println(">> �װ�, �ø���, �ǰ����� �ո��� ȿ�����̴�.");
	}

	private static void HameInfo() { // �ϸ޷�
		System.out.println(">> ���� �����ϰų� ���ö� ȿ���� �ִ�.");
	}

	private static void ComeInfo() { // �ڸ�Ű��
		System.out.println(">> �๰�� ��� ���� �񿰿� ȿ���� �ִ�.");
	}

	private static void VitaInfo() { // ��Ÿ��
		System.out.println(">> �׳� ������ ��Ÿ����, ������ �մ����� �ָ� �� �� ����.");
	}

}
