package mid;

import java.util.*;

public class Yujin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score1 = 0;
        int score2 = 0;
        int round = 1;

        while (score1 < 2 && score2 < 2) {
            System.out.println("[" + round + "라운드]");
            System.out.print("1번 가위(0), 바위(1), 보(2) 중 하나를 선택하세요: ");
            int user1 = scanner.nextInt();

            System.out.print("2번 가위(0), 바위(1), 보(2) 중 하나를 선택하세요: ");
            int user2 = scanner.nextInt();

            if (user1 < 0 || user1 > 2 || user2 < 0 || user2 > 2) {
                System.out.println("잘못된 입력입니다. 0~2 사이의 숫자를 입력하세요.\n");
                continue;
            }

            System.out.println("1의 선택: " + convertToChoice(user1));
            System.out.println("2의 선택: " + convertToChoice(user2));

            if (user1 == user2) {
                System.out.println("무승부!\n");
            } else if ((user1 == 0 && user2 == 2) ||
                    (user1 == 1 && user2 == 0) ||
                    (user1 == 2 && user2 == 1)) {
                System.out.println("1이 이겼습니다!\n");
                score1++;
            } else {
                System.out.println("2가 이겼습니다!\n");
                score2++;
            }

            round++;
        }

        // 최종 승자 출력
        if (score1 == 2) {
            System.out.println("승자: 1번!");
        } else {
            System.out.println("승자: 2번!");
        }

        scanner.close();
    }

    public static String convertToChoice(int choice) {
        return switch (choice) {
            case 0 -> "가위";
            case 1 -> "바위";
            case 2 -> "보";
            default -> "알 수 없음";
        };
    }
}