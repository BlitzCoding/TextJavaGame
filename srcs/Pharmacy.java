public class Pharmacy extends Game {

	public boolean checkmoney() {
		if (money > 0) {
			return true;
		} else {
			return false;
		}
	}

	public void levelUp() {
		if (fame >= 10) {
			level++;
			fame -= 8;
			System.out.println("�ݢ� ������ �Ǿ����ϴ�. �����մϴ�.�ݢ�");
		}
	}

	static public void Rank() {
		if (level == 0) {
			System.out.println("����� �ʺ� ����Դϴ�.");
		} else if (level == 1) {
			System.out.println("����� ���õ� ����Դϴ�.");
		} else if (level == 2) {
			System.out.println("����� �����Դϴ�.");
		}

	}

	static public void printInfo() {
		System.out.println();
		System.out.println("=============================");
		System.out.println("���� " + name + " �౹�� �����Դϴ�.");
		System.out.println("������ �ݾ� : " + money);
		System.out.println("������ �� : " + fame);
		System.out.println("���� �౹ ��ġ : " + Decoration.blank);
		System.out.print("���� ���� ��� : ");
		Rank();
		System.out.println("=============================");
		System.out.println();

		GameMenu();
	}

}
