package extends1.super1;

/*
    super
    부모와 자식의 필드명이 같거나 메서드가 오버라이딩 되어 있으면, 자식에서 부모의 필드나 메서드를 호출할 수 없다!
    이때 super 키워드를 사용하면 부모를 참조할 수 있다!
 */
public class Child extends Parent{
    public String value = "child";

    @Override
    public void hello() {
        System.out.println("Child.hello");
    }

    public void call() {
        System.out.println("this value = " + this.value); // 자신의 벨류를 참조
        System.out.println("super value = " + super.value); // 부모의 벨류를 참조

        this.hello();
        super.hello();
    }
}
