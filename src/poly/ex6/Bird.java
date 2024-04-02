package poly.ex6;

// Bird는 AbstractAnimal 클래스를 상속하고 Fly 인터페이스를 구현
public class Bird extends AbstractAnimal implements Fly{ // extends를 통한 상속은 하나만 할 수 있고, implements를 통한 인터페이스는 다중 구현 가능 하기 떄문에 extends가 먼저 나와야함
    @Override
    public void fly() {
        System.out.println("짹쨱쨱쨰꺢쨲ㅉ꺶ㄱ");
    }

    @Override
    public void sound() {
        System.out.println("새 날기 파닥파닥");
    }
}
