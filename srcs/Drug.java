public class Drug extends Game {

	static void DrugShow() {

		System.out.println();
		System.out.println("1. 타이레놀, 2. 게비스콘, 3. 이가탄, 4. 하메론, 5. 코메키나, 6. 비타민V, 7.뒤로가기");
		System.out.print("어떤 약이 알고 싶으신가요? : ");
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
			System.out.println("다시 선택하세요");
		}

	}

	private static void TyleInfo() { // 타이레놀
		System.out.println(">> 두통에 효과가 있다");
	}

	private static void GavisInfo() { // 게비스콘
		System.out.println(">> 속쓰림에 효과가 있다.");
	}

	private static void EgaInfo() { // 이가탄
		System.out.println(">> 붓고, 시리고, 피가나는 잇몸에 효과적이다.");
	}

	private static void HameInfo() { // 하메론
		System.out.println(">> 눈이 건조하거나 아플때 효과가 있다.");
	}

	private static void ComeInfo() { // 코메키나
		System.out.println(">> 콧물이 계속 나는 비염에 효과가 있다.");
	}

	private static void VitaInfo() { // 비타민
		System.out.println(">> 그냥 무난한 비타민제, 적당한 손님한테 주면 될 것 같다.");
	}

}
