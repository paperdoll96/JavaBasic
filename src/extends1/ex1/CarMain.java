package extends1.ex1;

public class CarMain {
    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        electricCar.move(); // 상속 덕분에 부모클래스 Car의 메서드인 move 사용가능!!
        electricCar.charge();

    }
    /*
        참고로 자바는 다중 상속을 지원하지 않음! 그래서 extends 대상은 하나만 선택 가능!
        사람도 부모님이 하나 이듯(?).. 물론 부모가 또 다른 부모를 하나 가질수 있다! (할아버지..?)
     */
}
