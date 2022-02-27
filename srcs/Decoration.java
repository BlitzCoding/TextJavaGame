public class Decoration extends Store {

	static public String FishChanging() {
		System.out.println(blank + " --> 어느 위치에 넣겠습니까?");
		System.out.print("12345678 - 배치할 위치번호를 입력하세요 : ");

		int cfish = sc.nextInt();

		blank = blank.substring(0, cfish + -1) + decofish + blank.substring(cfish);
		System.out.println(blank);

		return blank;
	}

	static public String FlowerChanging() {
		System.out.println(blank + " --> 어느 위치에 넣겠습니까?");
		System.out.print("12345678 - 배치할 위치번호를 입력하세요 : ");
		int cflower = sc.nextInt();

		blank = blank.substring(0, cflower + -1) + decoflower + blank.substring(cflower);
		System.out.println(blank);

		return blank;
	}

	static public String StatueChanging() {
		System.out.println(blank + " --> 어느 위치에 넣겠습니까?");
		System.out.print("12345678 - 배치할 위치번호를 입력하세요 : ");
		int cstatue = sc.nextInt();

		blank = blank.substring(0, cstatue + -1) + decostatue + blank.substring(cstatue);
		System.out.println(blank);

		return blank;
	}

}
