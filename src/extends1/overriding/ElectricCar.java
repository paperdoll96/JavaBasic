package extends1.overriding;

public class ElectricCar extends Car {

    public void charge() {
        System.out.println("충전합니다.----");
    }

    @Override
    /*
        @이 붙은 부분을 어노테이션이라고 한다! 어노테이션은 주석과 비슷한데
        프로그램이 읽을 수 있는 특별한 주석!
        컴파일러는 이 어노테이션을 보고 메서드가 정확히 오버라이드 되었는지 확인한다. 오버라이딩 조건을 만족시키지 않으면
        컴파일 에러를 발생시킨다. 따라서 실수로 오버라이딩을 못하는 경우를 방지해준다
     */
    public void move() {
        System.out.println("전기차를 빠르게 이동 합니다!");
    }

    /*
        ElectricCar는 부모인 Car의 move() 기능을 그대로 사용하고 싶지 않다
        메서드 이름은 같지만 새로운 기능을 사용하고싶다!
        그래서 move()를 새로 만듬!
        이렇게 부모의 기능을 자식이 재정의 하는 것을 메서드 오버라이딩!
     */
}
