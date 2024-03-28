package oop1.ex;

/*
    객체 지향 계좌 문제
 */
public class Account {
    int balance;

    // 입금 메서드
    int deposit(int amount) {
        balance += amount;
        return balance;
    }

    // 출금 메서드
    int withdraw(int amount) {
        if (amount > balance) { // 출금액이 잔액보다 클 경우에만 잔액 부족 메시지를 출력
            System.out.println("잔액이 부족합니다");
        } else {
            balance -= amount; // 잔액이 충분할 경우에만 출금
        }
        return balance;
    }


}
