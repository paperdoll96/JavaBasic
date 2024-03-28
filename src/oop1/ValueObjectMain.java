package oop1;

public class ValueObjectMain {
    public static void main(String[] args) {

        ValueObject valueObject = new ValueObject();
        // valueObject 라는 객체를 생성했다. 이 객체는 멤버 변수 뿐만 아니라 내부에 기능을 수행하는 add() 메서드도 함께 존재
        valueObject.add();
        valueObject.add();
        valueObject.add();
        // 인스턴스의 메서드를 호출하는 방법은 멤버변수를 사용하는 방법과 동일! .(dot)
        System.out.println("최종 숫자 = " + valueObject.value);
    }
    /*
        - 클래스는 속성(데이터, 멤버 변수)과 기능(메서드)을 정의할 수 있다!
        - 객체는 자신의 메서드를 통해 자신의 멤버 변수에 접근할 수 있다!
          - 객체의 메서드 내부에서 접근하는 멤버 변수는 객체 자신의 멤버 변수이다!
     */
}
