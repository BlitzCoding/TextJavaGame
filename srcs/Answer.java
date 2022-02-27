import java.util.Random;

public class Answer extends Customer {

	static Random AnsRand = new Random();

	public String GoodAnswer() {
		String RandomGoodAnswer[] = { "감사합니다.", "효과가 있는 것 같아요.", "괜찮아진 것 같아요" };

		int randAns = AnsRand.nextInt(RandomGoodAnswer.length);

		return RandomGoodAnswer[randAns];

	}

	public String BadAnswer() {
		String RandomBadAnswer[] = { "모르면 모른다고 하세요", "이 약 아닌거 같은데요?", "다른 약국으로 갈께요." };

		int randAns = AnsRand.nextInt(RandomBadAnswer.length);

		return RandomBadAnswer[randAns];

	}

	public String JinSangGoodAnswer() {
		String RandomJinSangGoodAnswer[] = { "요즘 애들답지 않게 센스가 좋아?", "으음 뭐 나쁘지않구만", "야따 좋네잉 또 올게?" };

		int randAns = AnsRand.nextInt(RandomJinSangGoodAnswer.length);

		return RandomJinSangGoodAnswer[randAns];

	}

	public String JinSangBadAnswer() {
		String RandomJinSangBadAnswer[] = { "뭐 이딴 약국이 다 있어? 쯧쯧", "야 이 돌팔이놈아 장난하냐?" };

		int randAns = AnsRand.nextInt(RandomJinSangBadAnswer.length);

		return RandomJinSangBadAnswer[randAns];

	}

}
