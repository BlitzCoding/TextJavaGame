public class Decoration extends Store {

	static public String FishChanging() {
		System.out.println(blank + " --> ��� ��ġ�� �ְڽ��ϱ�?");
		System.out.print("12345678 - ��ġ�� ��ġ��ȣ�� �Է��ϼ��� : ");

		int cfish = sc.nextInt();

		blank = blank.substring(0, cfish + -1) + decofish + blank.substring(cfish);
		System.out.println(blank);

		return blank;
	}

	static public String FlowerChanging() {
		System.out.println(blank + " --> ��� ��ġ�� �ְڽ��ϱ�?");
		System.out.print("12345678 - ��ġ�� ��ġ��ȣ�� �Է��ϼ��� : ");
		int cflower = sc.nextInt();

		blank = blank.substring(0, cflower + -1) + decoflower + blank.substring(cflower);
		System.out.println(blank);

		return blank;
	}

	static public String StatueChanging() {
		System.out.println(blank + " --> ��� ��ġ�� �ְڽ��ϱ�?");
		System.out.print("12345678 - ��ġ�� ��ġ��ȣ�� �Է��ϼ��� : ");
		int cstatue = sc.nextInt();

		blank = blank.substring(0, cstatue + -1) + decostatue + blank.substring(cstatue);
		System.out.println(blank);

		return blank;
	}

}
