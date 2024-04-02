package poly.diamond;

/*
    인터페이스 - 다중구현
    클래스는 다중 상속이 안되지만, 인터페이스의 다중 구현은 허용된다.
    인터페이스는 모두 추상메서드로 이루어져 있기 때문!
 */
public class Child implements InterfaceA, InterfaceB{ // 다중구현할떄는 , 를 붙여서 얼마든지 가능
    @Override
    public void methodA() {

    }

    @Override
    public void methodB() {

    }

    @Override
    public void methodCommon() {
        /*
            이 메서드는 A B 둘다 가지고 있다. 상속 관계의 경우 어떤걸 사용해야 할지 몰라 다이아몬드 문제가 발생

            하지만 인터페이스는 부모들 중에 한 부모를 선택하는 것이 아니라 그냥 인터페이스들을 구현한 Child에 있는 methodCommon()이 사용
            그니까 오버라이딩에 의해 호출되는것!

         */
    }
}
