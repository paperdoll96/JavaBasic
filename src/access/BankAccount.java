package access;
/*
    캡슐화
    캡슐화는 객체 지향 프로그래밍의 중요한 개념중 하나!
     캡슐화는 데이터와 해당 데이터를 처리하는 메서드를 하나로 묶어서 외부에서의 접근을 제한하는 것을 말한다!
     쉽게 얘기해서 속성과 기능을 하나로 묶고, 꼭 필요한 기능만 노출하고 나머지는 내부로 숨기는 것!

 */
public class BankAccount {
    private int balance;
    public BankAccount() {
        balance = 0;
    }
    // public 메서드: deposit
    public void deposit(int amount) {
        if (isAmountValid(amount)) {
            balance += amount;
        } else {
            System.out.println("유효하지 않은 금액입니다.");
        }
    }

    // public 메서드: withdraw
    public void withdraw(int amount) {
        if (isAmountValid(amount) && balance - amount >= 0) {
            balance -= amount;
        } else {
            System.out.println("유효하지 않은 금액이거나 잔액이 부족합니다.");
        }
    }
    // public 메서드: getBalance
    public int getBalance() {
        return balance;
    }
    // private 메서드: isAmountValid
    private boolean isAmountValid(int amount) {
        // 금액이 0보다 커야함
        return amount > 0;
    }
    /*
        위 예제가 잘된 캡슐화의 예제인데,
        데이터와 기능을 적절하게 잘 숨기고 있다! 메서드에서도 입력 금액을 검증하는 기능인 isAmountValid() 는
        내부에서만 필요한 기능이기 때문에 잘 숨어져 있다!

        만약 모든 데이터가 노출되어 있고 다른 개발자가 접근하려 할 때, a 개발자의 의도와 다르게
        b개발자가 돌발행동(?) 을 할 수 있으므로 캡슐화는 정말 중요한 요소중에 하나 인 거 같다!

        접근 제어자와 캡슐화를 통해 데이터를 안전하게 보호하는 것은 물론이고, BankAccount 를 사용하는 개발자 입장에서
        해당 기능을 사용하는 복잡도도 낮출 수 있다!
     */
}
