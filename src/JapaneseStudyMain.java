import java.util.*;

public class JapaneseStudyMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();

		System.out.println("�ܾ� �ܿ� ������ �Է� �� �ּ���");
		int arrLength = scan.nextInt();
		int[] randArr = new int[arrLength];
		String[] japanese = new String[arrLength];
		String[] korean = new String[arrLength];
		double sum = 0;
		for (int i = 0; i < arrLength; i++) {
			System.out.println(i + 1 + "��° �ܾ �Է��� �ּ���[�Ϻ���]");
			scan.nextLine();
			japanese[i] = scan.nextLine();
			System.out.println(japanese[i] + "�� ���� �Է��� �ּ���");
			korean[i] = scan.nextLine();
		} // for end
		System.out.println("������ �����ֽ��ϴ�");
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
		}
		System.out.println("�����մϴ�");

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
			System.out.println(japanese[randArr[i]] + "�� ���� �Է����ּ���");
			String answer = scan.nextLine();
			if (answer.equals(korean[randArr[i]])) {
				System.out.println("�����Դϴ�~");
				sum = sum + (100 / arrLength);
			} else {
				System.out.println("Ʋ�Ƚ��ϴ�");
			}
		}
		System.out.println("������ ����մϴ�");
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
		}
		System.out.println("������ : " + sum);

	}

}
