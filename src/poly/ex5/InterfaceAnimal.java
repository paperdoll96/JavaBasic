package poly.ex5;

/*
    인터페이스
    인터페이스는 class 가 아니라 interface 키워드를 사용하면 된다.

 */
public interface InterfaceAnimal {
    public abstract void sound(); // public abstract 생략 가능!!
    void move();

    /*
        특징
        - 인터페이스의 메서드는 모두 public, abstract이다. 그래서 생략 가능.
        - 인터페이스는 다중 구현(다중 상속)? 을 지원한다
        - 인터페이스에서 멤버 변수는 public static final이 모두 포함 (상수) 마찬가지로 키워드 생략 가능

     */

    /*
        인터페이스를 사용해야 하는 이유
        단순히 편리하다는 이유를 넘어 다음과 같은 이유가 있다.
        1. 제약
            인터페이스를 만드는 이유는 인터페이스를 구현하는 곳에서 인터페이스의 메서드를 반드시 구현하라는
            규약을 주는 것이다! 규약되로 하지 않으면 작동하지 않으므로 반드시 구현 해야 한다!
        2. 다중 구현
            자바에서 클래스 상속은 부모를 하나만 지정 가능. 반면에 인터페이스는 부모를 여러명 두는 다중 상속이 가능!

     */
}
