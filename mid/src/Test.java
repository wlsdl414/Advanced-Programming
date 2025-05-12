package Java_Test;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // 선택지 안내
        System.out.println("가위(0), 바위(1), 보(2) 중 하나를 선택하세요: ");
        int userChoice = scanner.nextInt();

        // 컴퓨터 선택
        int computerChoice = random.nextInt(3);

        // 입력값이 유효한지 검사
        if (userChoice < 0 || userChoice > 2) {
            System.out.println("잘못된 입력입니다. 0~2 사이의 숫자를 입력하세요.");
            return;
        }

        // 결과 출력
        System.out.println("당신의 선택: " + convertToChoice(userChoice));
        System.out.println("컴퓨터의 선택: " + convertToChoice(computerChoice));

        // 승패 판정
        if (userChoice == computerChoice) {
            System.out.println("무승부입니다!");
        } else if ((userChoice == 0 && computerChoice == 2) ||
                (userChoice == 1 && computerChoice == 0) ||
                (userChoice == 2 && computerChoice == 1)) {
            System.out.println("당신이 이겼습니다!");
        } else {
            System.out.println("컴퓨터가 이겼습니다!");
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