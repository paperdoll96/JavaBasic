package poly.car1;

public class CarMain1 {
    public static void main(String[] args) {
        Driver driver = new Driver();

        //차량 선택
        K3Car k3Car = new K3Car();
        driver.setCar(k3Car); // Car car = k3Car 부모는 자식을 받을 수 있다
        driver.driver();

        //차량 변경
        System.out.println("차량변경합니다");
        GV80Car gv80Car = new GV80Car();

        driver.setCar(gv80Car);
        driver.driver();


    }
}
