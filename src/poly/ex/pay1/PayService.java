package poly.ex.pay1;

public class PayService {
    public void processPay(String option, int amount) {
        boolean result = false;
        System.out.println("결제를 시작합니다: option=" + option + ", amount=" + amount);

        Pay pay = PayStore.findPay(option);


        result = pay.pay(amount);



        if (result) {
            System.out.println("결제가 성공했습니다.");
        } else {
            System.out.println("결제가 실패했습니다.");
        }
    }
    /*
        이전 코드는 결제 옵션을 직접적으로 처리하고 있어, 새로운 결제 수단이 추가될 때마다 코드를 수정해야 하는 문제가 있다.
        또한, 결제 수단이 많아질수록 if-else 문이 길어지고, 코드의 복잡성이 증가한다.


        리팩토링된 코드에서는 PayStore 클래스를 사용하여 결제 수단을 찾는다.
        이는 결제 수단의 추가나 변경이 있을 때 PayStore 클래스만 수정하면 되므로, 유지보수가 용이해진다!
        또한, 결제 수단을 찾는 로직을 PayStore로 분리함으로써, PayService 클래스의 책임을 줄이고, 결제 수단을 관리하는 로직의 중복을 방지한다!
        이와 같은 리팩토링은 '개방-폐쇄 원칙(Open-Closed Principle)'을 따르며, 시스템의 확장성과 유연성을 향상시킨다!
    */

}
