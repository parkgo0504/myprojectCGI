//package DB;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Random;
//import java.util.Scanner;
//
//public class BlackjackWithBetting {
//    public static void main(String[] args) {
//        // 초기 자금 설정
//        int balance = 1000;
//        
//        // 카드 덱 생성
////        List<String> deck = createDeck();
//        
//        // 게임 플레이
//        while (balance > 0) {
//            System.out.println("현재 잔액: $" + balance);
//            int bet = getBetAmount(balance);
//            
//            // 딜러와 플레이어 카드 리스트 생성
//            List<String> dealerHand = new ArrayList<>();
//            List<String> playerHand = new ArrayList<>();
//            
//            // 게임 시작
//            dealInitialCards(deck, dealerHand, playerHand);
//            playGame(deck, dealerHand, playerHand);
//            
//            // 게임 결과 처리
//            int result = determineWinner(dealerHand, playerHand);
//            if (result == 1) {
//                balance += bet;
//            } else if (result == -1) {
//                balance -= bet;
//            }
//            
//            // 잔액이 0 이하인 경우 게임 종료
//            if (balance <= 0) {
//                System.out.println("잔액이 부족하여 게임을 종료합니다.");
//                break;
//            }
//            
//            // 계속 플레이할지 여부 확인
//            if (!playAgain()) {
//                break;
//            }
//        }
//        
//        System.out.println("게임 종료. 최종 잔액: $" + balance);
//    }
//    
//    // 카드 덱 생성
////    public static List<String> createDeck() {
////        // 코드 생략 (이전 코드 참조)
////    }
////    
////    // 카드 덱에서 카드를 한 장 뽑는 메서드
////    public static String drawCard(List<String> deck) {
//        // 코드 생략 (이전 코드 참조)
////    }
//    
//    // 초기 카드를 나누는 메서드
//    public static void dealInitialCards(List<String> deck, List<String> dealerHand, List<String> playerHand) {
//        // 코드 생략 (이전 코드 참조)
//    }
//    
//    // 게임 플레이
//    public static void playGame(List<String> deck, List<String> dealerHand, List<String> playerHand) {
//        // 코드 생략 (이전 코드 참조)
//    }
//    
//    // 카드 합 계산
//    public static int calculateHandSum(List<String> hand) {
//        // 코드 생략 (이전 코드 참조)
//    }
//    
//    // 승자 결정
//    public static int determineWinner(List<String> dealerHand, List<String> playerHand) {
//        // 코드 생략 (이전 코드 참조)
//    }
//    
//    // 베팅 금액 입력
//    public static int getBetAmount(int balance) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("베팅할 금액을 입력하세요 (현재 잔액: $" + balance + "): ");
//        
//        while (true) {
//            int bet = scanner.nextInt();
//            if (bet > balance) {
//                System.out.println("잔액보다 큰 금액을 베팅할 수 없습니다. 다시 입력하세요.");
//            } else {
//                return bet;
//            }
//        }
//    }
//    
//    // 게임 재시작 여부 확인
//    public static boolean playAgain() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("게임을 계속 플레이하시겠습니까? (y/n): ");
//        String input = scanner.nextLine();
//        return input.equalsIgnoreCase("y");
//    }
//}