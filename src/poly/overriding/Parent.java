package poly.overriding;

/*
    다형성과 메서드 오버라이딩
    다형성을 이루는 중요한 핵심 중 하나인 메서드 오버라이딩!
    꼭! 기억해야 할 점은 오버라이딩된 메서드가 항상 우선권을 가진다는것!
    메서드 오버라이딩의 힘은 다형성과 함꼐 사용할 때 나타난다!
 */
public class Parent {

    public String value = "parent";

    public void method() {
        System.out.println("Parent.method");
    }
}
