package mid;

import java.util.*;

public class Test {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		// 선택지 안내
		System.out.println("가위(0), 바위(1), 보(2) 중 하나를 선택하세요: ");
		int user = scanner.nextInt();

		// 컴퓨터 선택
		int computer = random.nextInt(3);

		// 입력값이 유효한지 검사
		if (user < 0 || user > 2) {
			System.out.println("잘못된 입력입니다. 0~2 사이의 숫자를 입력하세요.");
			return;
		}

		// 결과 출력
		System.out.println("나: " + convertToChoice(user));
		System.out.println("컴퓨터: " + convertToChoice(computer));

		// 승패 판정
		if (user == computer) {
			System.out.println("무승부!");
		} else if ((user == 0 && computer == 2) || (user == 1 && computer == 0)
				|| (user == 2 && computer == 1)) {
			System.out.println("내가 이김!");
		} else {
			System.out.println("컴퓨터가 이김!");
		}

		scanner.close();
	}

	// 숫자를 문자열로 변환하는 메서드
	public static String convertToChoice(int choice) {
		return switch (choice) {
		case 0 -> "가위";
		case 1 -> "바위";
		case 2 -> "보";
		default -> "알 수 없음";
		};
	}
}