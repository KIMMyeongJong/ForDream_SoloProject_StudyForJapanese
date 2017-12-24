import java.util.*;

public class JapaneseStudyMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();

		System.out.println("단어 외운 갯수를 입력 해 주세요");
		int arrLength = scan.nextInt();
		int[] randArr = new int[arrLength];
		String[] japanese = new String[arrLength];
		String[] korean = new String[arrLength];
		double sum = 0;
		for (int i = 0; i < arrLength; i++) {
			System.out.println(i + 1 + "번째 단어를 입력해 주세요[일본어]");
			scan.nextLine();
			japanese[i] = scan.nextLine();
			System.out.println(japanese[i] + "의 뜻을 입력해 주세요");
			korean[i] = scan.nextLine();
		} // for end
		System.out.println("문제를 섞고있습니다");
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
		}
		System.out.println("출제합니다");

		for (int i = 0; i < arrLength; i++) {
			randArr[i] = rand.nextInt(arrLength);
			for (int j = 0; j < i; j++) {
				if (randArr[j] == randArr[i]) {
					i--;
					break;
				}
			}
		} // for end

		for (int i = 0; i < arrLength; i++) {
			System.out.println(japanese[randArr[i]] + "의 뜻을 입력해주세요");
			String answer = scan.nextLine();
			if (answer.equals(korean[randArr[i]])) {
				System.out.println("정답입니다~");
				sum = sum + (100 / arrLength);
			} else {
				System.out.println("틀렸습니다");
			}
		}
		System.out.println("점수를 계산합니다");
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
		}
		System.out.println("총점은 : " + sum);

	}

}
