import java.util.Random;

public class Answer extends Customer {

	static Random AnsRand = new Random();

	public String GoodAnswer() {
		String RandomGoodAnswer[] = { "�����մϴ�.", "ȿ���� �ִ� �� ���ƿ�.", "�������� �� ���ƿ�" };

		int randAns = AnsRand.nextInt(RandomGoodAnswer.length);

		return RandomGoodAnswer[randAns];

	}

	public String BadAnswer() {
		String RandomBadAnswer[] = { "�𸣸� �𸥴ٰ� �ϼ���", "�� �� �ƴѰ� ��������?", "�ٸ� �౹���� ������." };

		int randAns = AnsRand.nextInt(RandomBadAnswer.length);

		return RandomBadAnswer[randAns];

	}

	public String JinSangGoodAnswer() {
		String RandomJinSangGoodAnswer[] = { "���� �ֵ���� �ʰ� ������ ����?", "���� �� �������ʱ���", "�ߵ� ������ �� �ð�?" };

		int randAns = AnsRand.nextInt(RandomJinSangGoodAnswer.length);

		return RandomJinSangGoodAnswer[randAns];

	}

	public String JinSangBadAnswer() {
		String RandomJinSangBadAnswer[] = { "�� �̵� �౹�� �� �־�? ����", "�� �� �����̳�� �峭�ϳ�?" };

		int randAns = AnsRand.nextInt(RandomJinSangBadAnswer.length);

		return RandomJinSangBadAnswer[randAns];

	}

}
