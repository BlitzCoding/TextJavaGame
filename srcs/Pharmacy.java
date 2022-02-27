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
			System.out.println("♬♬ 레벨업 되었습니다. 축하합니다.♬♬");
		}
	}

	static public void Rank() {
		if (level == 0) {
			System.out.println("당신은 초보 약사입니다.");
		} else if (level == 1) {
			System.out.println("당신은 숙련된 약사입니다.");
		} else if (level == 2) {
			System.out.println("당신은 명의입니다.");
		}

	}

	static public void printInfo() {
		System.out.println();
		System.out.println("=============================");
		System.out.println("현재 " + name + " 약국의 상태입니다.");
		System.out.println("보유한 금액 : " + money);
		System.out.println("보유한 명성 : " + fame);
		System.out.println("현재 약국 배치 : " + Decoration.blank);
		System.out.print("현재 나의 등급 : ");
		Rank();
		System.out.println("=============================");
		System.out.println();

		GameMenu();
	}

}
