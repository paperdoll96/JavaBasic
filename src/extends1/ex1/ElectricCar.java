package extends1.ex1;

public class ElectricCar extends Car{

    public void charge() {
        System.out.println("충전합니다.----");
    }

    /*
        ElectricCar 는 extends Car 를 사용하여 Car를 상속받는다!
        상속 덕분에 일렉트릭카에서도 move()를 사용 가능!
     */
}
