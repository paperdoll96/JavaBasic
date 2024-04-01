package poly.basic;

public class CastingMain1 {
    public static void main(String[] args) {

        // 부모 변수가 자식 인스턴스 참조 (다형적 참조)
        Parent poly = new Child();

        // 단 자식의 기능은 호출 할 수 없다! 컴파일 오류 발생
        // poly.childMethod();

        // 다운캐스팅 ( 부모 -> 자식 )
        Child child = (Child) poly;
        child.childMethod();   // <- 다운 캐스팅 하면 자식 기능 호출 가능!

        // 참고로 캐스팅 한다고 해서 타입이 변하는게 아니다! 참조값을 꺼내고 꺼낸 참조값이 child타입이 되는 것!

        // 위처럼 다운캐스팅 결과를 변수에 담는 과정이 번거롭다! 이런 과정없이 일시적으로 다운캐스팅을 할 수 있다!
        // 일시적 다운캐스팅 - 해당 메서드를 호출 하는 순간만 다운캐스팅!
        ((Child) poly).childMethod();

        // 업캐스팅
        // 다운캐스팅과 반대로 현재 타입을 부모타입으로 변경
        // 업캐스팅 생략 가능, 매우 자주 사용해서 생략을 권장!

        // 내 생각이긴 하지만, 예전에 기본형에서 캐스팅 할때처럼 작은그릇을 큰 그릇으로 옮겻을때 문제가 없었듯이
        // 다형적에서도 비슷한 개념이 아닐까.. 추측해본다!
    }
}
